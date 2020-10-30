import { Texture } from './Texture.js';
import { CubeReflectionMapping, RGBFormat } from '../constants.js';

/**
* @constructor
* @param {(Array<HTMLImageElement>|Array<HTMLCanvasElement>|Array<HTMLVideoElement>)=} images
* @param {number=} mapping
* @param {number=} wrapS
* @param {number=} wrapT
* @param {number=} magFilter
* @param {number=} minFilter
* @param {number=} format
* @param {number=} type
* @param {number=} anisotropy
* @param {number=} encoding
* @extends {Texture}
*/
function CubeTexture( images, mapping, wrapS, wrapT, magFilter, minFilter, format, type, anisotropy, encoding ) {

	images = images !== undefined ? images : [];
	mapping = mapping !== undefined ? mapping : CubeReflectionMapping;
	format = format !== undefined ? format : RGBFormat;

	Texture.call( this, images, mapping, wrapS, wrapT, magFilter, minFilter, format, type, anisotropy, encoding );

	this.flipY = false;

	this._needsFlipEnvMap = true;

}

CubeTexture.prototype = Object.create( Texture.prototype );
CubeTexture.prototype.constructor = CubeTexture;

CubeTexture.prototype.isCubeTexture = true;

Object.defineProperty( CubeTexture.prototype, 'images', {

    /**
    * @this {Texture}
    */
	get: function () {

		return this.image;

	},

    /**
    * @this {Texture}
    */
	set: function ( value ) {

		this.image = value;

	}

} );


export { CubeTexture };
