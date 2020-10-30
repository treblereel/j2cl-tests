import { WebGLExtensions } from './WebGLExtensions.js';

/**
* @param {WebGLRenderingContext} gl
* @param {WebGLExtensions} extensions
* @param {Object} parameters
* @return {{isWebGL2:boolean, precision: string, logarithmicDepthBuffer: boolean, maxTextures: number, maxVertexTextures: number, maxTextureSize: number, maxCubemapSize: number, maxAttributes: number, maxVertexUniforms: number, maxVaryings: number, maxFragmentUniforms: number, vertexTextures: boolean, floatFragmentTextures: boolean, floatVertexTextures: boolean}}
*/
function WebGLCapabilities( gl, extensions, parameters ) {

	let maxAnisotropy;

    /**
    * @return {*}
    */
	function getMaxAnisotropy() {

		if ( maxAnisotropy !== undefined ) return maxAnisotropy;

		const extension = extensions.get( 'EXT_texture_filter_anisotropic' );

		if ( extension !== null ) {

			maxAnisotropy = gl.getParameter( extension.MAX_TEXTURE_MAX_ANISOTROPY_EXT );

		} else {

			maxAnisotropy = 0;

		}

		return maxAnisotropy;

	}

    /**
    * @param {string} precision
    * @return {string}
    */
	function getMaxPrecision( precision ) {

		if ( precision === 'highp' ) {

			if ( gl.getShaderPrecisionFormat( gl.VERTEX_SHADER, gl.HIGH_FLOAT ).precision > 0 &&
				gl.getShaderPrecisionFormat( gl.FRAGMENT_SHADER, gl.HIGH_FLOAT ).precision > 0 ) {

				return 'highp';

			}

			precision = 'mediump';

		}

		if ( precision === 'mediump' ) {

			if ( gl.getShaderPrecisionFormat( gl.VERTEX_SHADER, gl.MEDIUM_FLOAT ).precision > 0 &&
				gl.getShaderPrecisionFormat( gl.FRAGMENT_SHADER, gl.MEDIUM_FLOAT ).precision > 0 ) {

				return 'mediump';

			}

		}

		return 'lowp';

	}

	/* eslint-disable no-undef */
	const isWebGL2 = ( typeof WebGL2RenderingContext !== 'undefined' && gl instanceof WebGL2RenderingContext ) ||
		( typeof WebGL2ComputeRenderingContext !== 'undefined' && gl instanceof WebGL2ComputeRenderingContext );
	/* eslint-enable no-undef */

	let precision = parameters.precision !== undefined ? parameters.precision : 'highp';
	const maxPrecision = getMaxPrecision( precision );

	if ( maxPrecision !== precision ) {

		console.warn( 'THREE.WebGLRenderer:', precision, 'not supported, using', maxPrecision, 'instead.' );
		precision = maxPrecision;

	}

	const logarithmicDepthBuffer = parameters.logarithmicDepthBuffer === true;
	const /** number */ maxTextures = gl.getParameter( gl.MAX_TEXTURE_IMAGE_UNITS );
	const /** number */ maxVertexTextures = gl.getParameter( gl.MAX_VERTEX_TEXTURE_IMAGE_UNITS );
	const /** number */ maxTextureSize = gl.getParameter( gl.MAX_TEXTURE_SIZE );
	const /** number */ maxCubemapSize = gl.getParameter( gl.MAX_CUBE_MAP_TEXTURE_SIZE );
	const /** number */ maxAttributes = gl.getParameter( gl.MAX_VERTEX_ATTRIBS );
	const /** number */ maxVertexUniforms = gl.getParameter( gl.MAX_VERTEX_UNIFORM_VECTORS );
	const /** number */ maxVaryings = gl.getParameter( gl.MAX_VARYING_VECTORS );
	const /** number */ maxFragmentUniforms = gl.getParameter( gl.MAX_FRAGMENT_UNIFORM_VECTORS );

	const vertexTextures = maxVertexTextures > 0;
	const floatFragmentTextures = isWebGL2 || !! extensions.get( 'OES_texture_float' );
	const floatVertexTextures = vertexTextures && floatFragmentTextures;
	const maxSamples = isWebGL2 ? gl.getParameter( gl.MAX_SAMPLES ) : 0;

	return {
		isWebGL2: isWebGL2,
		getMaxAnisotropy: getMaxAnisotropy,
		getMaxPrecision: getMaxPrecision,
		precision: precision,
		logarithmicDepthBuffer: logarithmicDepthBuffer,
		maxTextures: maxTextures,
		maxVertexTextures: maxVertexTextures,
		maxTextureSize: maxTextureSize,
		maxCubemapSize: maxCubemapSize,
		maxAttributes: maxAttributes,
		maxVertexUniforms: maxVertexUniforms,
		maxVaryings: maxVaryings,
		maxFragmentUniforms: maxFragmentUniforms,
		vertexTextures: vertexTextures,
		floatFragmentTextures: floatFragmentTextures,
		floatVertexTextures: floatVertexTextures,
		maxSamples: maxSamples
	};

}


export { WebGLCapabilities };
