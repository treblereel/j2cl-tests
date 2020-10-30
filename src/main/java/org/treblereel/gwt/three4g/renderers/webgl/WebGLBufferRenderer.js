/**
* @constructor
* @param {WebGLRenderingContext} gl
* @param {{has: (function(string): boolean), get: (function(string): *)}} extensions
* @param {{memory: {geometries: number, textures: number}, render: { frame: number, calls: number, triangles: number, points: number,lines: number}, programs: *, autoReset: boolean, reset: function(), update: function(number, number, number)}} info
* @param {{isWebGL2:boolean, precision: string, logarithmicDepthBuffer: boolean, maxTextures: number, maxVertexTextures: number, maxTextureSize: number, maxCubemapSize: number, maxAttributes: number, maxVertexUniforms: number, maxVaryings: number, maxFragmentUniforms: number, vertexTextures: boolean, floatFragmentTextures: boolean, floatVertexTextures: boolean}} capabilities
*/
function WebGLBufferRenderer( gl, extensions, info, capabilities ) {

	const isWebGL2 = capabilities.isWebGL2;

	let mode;

	function setMode( value ) {

		mode = value;

	}

	function render( start, count ) {

		gl.drawArrays( mode, start, count );

		info.update( count, mode, 1 );

	}

	function renderInstances( start, count, primcount ) {

		if ( primcount === 0 ) return;

		let extension, methodName;

		if ( isWebGL2 ) {

			extension = gl;
			methodName = 'drawArraysInstanced';

		} else {

			extension = extensions.get( 'ANGLE_instanced_arrays' );
			methodName = 'drawArraysInstancedANGLE';

			if ( extension === null ) {

				console.error( 'THREE.WebGLBufferRenderer: using THREE.InstancedBufferGeometry but hardware does not support extension ANGLE_instanced_arrays.' );
				return;

			}

		}

		extension[ methodName ]( mode, start, count, primcount );

		info.update( count, mode, primcount );

	}

	//

	this.setMode = setMode;
	this.render = render;
	this.renderInstances = renderInstances;

}


export { WebGLBufferRenderer };
