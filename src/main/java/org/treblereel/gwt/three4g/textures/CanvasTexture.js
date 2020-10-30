import { Texture } from './Texture.js';

/**
* @constructor
* @param {HTMLImageElement | HTMLCanvasElement | HTMLVideoElement} canvas
* @param {number=} mapping
* @param {number=} wrapS
* @param {number=} wrapT
* @param {number=} magFilter
* @param {number=} minFilter
* @param {number=} format
* @param {number=} type
* @param {number=} anisotropy
* @extends {Texture}
* @this {Texture}
*/
function CanvasTexture( canvas, mapping, wrapS, wrapT, magFilter, minFilter, format, type, anisotropy ) {

	Texture.call( this, canvas, mapping, wrapS, wrapT, magFilter, minFilter, format, type, anisotropy );

	this.needsUpdate = true;

}

CanvasTexture.prototype = Object.create( Texture.prototype );
CanvasTexture.prototype.constructor = CanvasTexture;
CanvasTexture.prototype.isCanvasTexture = true;

export { CanvasTexture };
