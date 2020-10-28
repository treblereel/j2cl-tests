import { Texture } from './Texture.js';

/**
* @constructor
* @param {Array<ImageData>} mipmaps;
* @param {number=} width;
* @param {number=} height;
* @param {number=} format;
* @param {number=} type;
* @param {number=} mapping;
* @param {number=} wrapS;
* @param {number=} wrapT;
* @param {number=} magFilter;
* @param {number=} minFilter;
* @param {number=} anisotropy;
* @param {number=} encoding;
* @extends {Texture}
* @this {Texture}
*/
function CompressedTexture( mipmaps, width, height, format, type, mapping, wrapS, wrapT, magFilter, minFilter, anisotropy, encoding ) {

	Texture.call( this, null, mapping, wrapS, wrapT, magFilter, minFilter, format, type, anisotropy, encoding );

	this.image = { width: width, height: height };
	this.mipmaps = mipmaps;

	// no flipping for cube textures
	// (also flipping doesn't work for compressed textures )

	this.flipY = false;

	// can't generate mipmaps for compressed textures
	// mips must be embedded in DDS files

	this.generateMipmaps = false;

}

CompressedTexture.prototype = Object.create( Texture.prototype );
CompressedTexture.prototype.constructor = CompressedTexture;

CompressedTexture.prototype.isCompressedTexture = true;


export { CompressedTexture };
