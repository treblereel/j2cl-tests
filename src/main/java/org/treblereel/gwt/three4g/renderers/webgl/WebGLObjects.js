import { WebGLGeometries } from './WebGLGeometries.js';
import { WebGLAttributes } from './WebGLAttributes.js';
import { WebGLInfo } from './WebGLInfo.js';


/**
* @constructor
* @param {WebGLRenderingContext} gl
* @param {WebGLGeometries} geometries
* @param {WebGLAttributes} attributes
* @param {WebGLInfo} info
*/
function WebGLObjects( gl, geometries, attributes, info ) {

	let updateMap = new WeakMap();

	function update( object ) {

		const frame = info.render.frame;

		const geometry = object.geometry;
		const buffergeometry = geometries.get( object, geometry );

		// Update once per frame

		if ( updateMap.get( buffergeometry ) !== frame ) {

			if ( geometry.isGeometry ) {

				buffergeometry.updateFromObject( object );

			}

			geometries.update( buffergeometry );

			updateMap.set( buffergeometry, frame );

		}

		if ( object.isInstancedMesh ) {

			attributes.update( object.instanceMatrix, gl.ARRAY_BUFFER );

			if ( object.instanceColor !== null ) {

				attributes.update( object.instanceColor, gl.ARRAY_BUFFER );

			}

		}

		return buffergeometry;

	}

	function dispose() {

		updateMap = new WeakMap();

	}

	return {

		update: update,
		dispose: dispose

	};

}


export { WebGLObjects };
