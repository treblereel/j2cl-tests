import { WebGLExtensions } from './WebGLExtensions.js';
import { WebGLInfo } from './WebGLInfo.js';
import { WebGLCapabilities } from './WebGLCapabilities.js';

/**
* @constructor
* @param {WebGLRenderingContext} gl
* @param {WebGLExtensions} extensions
* @param {WebGLInfo} info
* @param {WebGLCapabilities} capabilities
*/
function WebGLIndexedBufferRenderer( gl, extensions, info, capabilities ) {

	const isWebGL2 = capabilities.isWebGL2;

	let mode;

	function setMode( value ) {

		mode = value;

	}

	let type, bytesPerElement;

	function setIndex( value ) {

		type = value.type;
		bytesPerElement = value.bytesPerElement;

	}

	function render( start, count ) {

		gl.drawElements( mode, count, type, start * bytesPerElement );

		info.update( count, mode, 1 );

	}

	function renderInstances( start, count, primcount ) {

		if ( primcount === 0 ) return;

		let extension, methodName;

		if ( isWebGL2 ) {

			extension = gl;
			methodName = 'drawElementsInstanced';

		} else {

			extension = extensions.get( 'ANGLE_instanced_arrays' );
			methodName = 'drawElementsInstancedANGLE';

			if ( extension === null ) {

				console.error( 'THREE.WebGLIndexedBufferRenderer: using THREE.InstancedBufferGeometry but hardware does not support extension ANGLE_instanced_arrays.' );
				return;

			}

		}

		extension[ methodName ]( mode, count, type, start * bytesPerElement, primcount );

		info.update( count, mode, primcount );

	}

	//

	this.setMode = setMode;
	this.setIndex = setIndex;
	this.render = render;
	this.renderInstances = renderInstances;

}


export { WebGLIndexedBufferRenderer };
