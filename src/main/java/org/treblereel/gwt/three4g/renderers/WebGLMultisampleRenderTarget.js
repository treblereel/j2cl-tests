import { WebGLRenderTarget } from './WebGLRenderTarget.js';

/**
* @constructor
* @param {number} width
* @param {number} height
* @param {Object=} options
* @extends {WebGLRenderTarget}
*/
function WebGLMultisampleRenderTarget( width, height, options ) {

	WebGLRenderTarget.call( this, width, height, options );

	this.samples = 4;

}

WebGLMultisampleRenderTarget.prototype = Object.assign( Object.create( WebGLRenderTarget.prototype ), {

	constructor: WebGLMultisampleRenderTarget,

	isWebGLMultisampleRenderTarget: true,

    /**
    * @param {WebGLRenderTarget} source
    * @return {WebGLMultisampleRenderTarget}
    */
	copy: function ( source ) {

		WebGLRenderTarget.prototype.copy.call( this, source );

		this.samples = source.samples;

		return this;

	}

} );


export { WebGLMultisampleRenderTarget };
