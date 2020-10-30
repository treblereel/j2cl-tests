/**
 * @author fernandojsg / http://fernandojsg.com
 * @author Takahiro https://github.com/takahirox
 */

import { WebGLRenderTarget } from './WebGLRenderTarget.js';

/**
* @constructor
* @param {number} width
* @param {number} height
* @param {number} numViews
* @param {{wrapS: number,
           	wrapT: number,
           	magFilter: number,
           	minFilter: number,
           	format: number,
           	type: number,
           	anisotropy: number,
           	depthBuffer: boolean,
           	stencilBuffer: boolean,
           	generateMipmaps: boolean,
           	depthTexture: number,
           	encoding: number}=} options
* @extends {WebGLRenderTarget}
*/
function WebGLMultiviewRenderTarget( width, height, numViews, options ) {

	WebGLRenderTarget.call( this, width, height, options );

	this.depthBuffer = false;
	this.stencilBuffer = false;

	this.numViews = numViews;

}

WebGLMultiviewRenderTarget.prototype = Object.assign( Object.create( WebGLRenderTarget.prototype ), {

	constructor: WebGLMultiviewRenderTarget,

	isWebGLMultiviewRenderTarget: true,

    /** @this {WebGLMultiviewRenderTarget} */
	copy: function ( source ) {

		WebGLRenderTarget.prototype.copy.call( this, source );

		this.numViews = source.numViews;

		return this;

	},

	setNumViews: function ( numViews ) {

		if ( this.numViews !== numViews ) {

			this.numViews = numViews;
			this.dispose();

		}

		return this;

	}

} );

export { WebGLMultiviewRenderTarget };
