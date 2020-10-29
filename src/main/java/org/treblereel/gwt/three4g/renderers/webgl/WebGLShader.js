
/**
* @constructor
* @param {WebGLRenderingContext} gl
* @param {string} type
* @param {string} string
*/
function WebGLShader( gl, type, string ) {

	const shader = gl.createShader( type );

	gl.shaderSource( shader, string );
	gl.compileShader( shader );

	return shader;

}

export { WebGLShader };
