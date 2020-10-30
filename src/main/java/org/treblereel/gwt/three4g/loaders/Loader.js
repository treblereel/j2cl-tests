import { DefaultLoadingManager } from './LoadingManager.js';
import { LoadingManager } from './LoadingManager.js';

/**
* @constructor
* @param {LoadingManager=} manager
*/
function Loader( manager ) {

	this.manager = ( manager !== undefined ) ? manager : DefaultLoadingManager;

	this.crossOrigin = 'anonymous';
	this.withCredentials = false;
	this.path = '';
	this.resourcePath = '';
	this.requestHeader = {};

}

Object.assign( Loader.prototype, {

	load: function ( /* url, onLoad, onProgress, onError */ ) {},

	loadAsync: function ( url, onProgress ) {

		const scope = this;

		return new Promise( function ( resolve, reject ) {

			scope.load( url, resolve, onProgress, reject );

		} );

	},

	parse: function ( /* data */ ) {},
    /** @this {Loader} */
	setCrossOrigin: function ( crossOrigin ) {

		this.crossOrigin = crossOrigin;
		return this;

	},
    /** @this {Loader} */
	setWithCredentials: function ( value ) {

		this.withCredentials = value;
		return this;

	},

    /** @this {Loader} */
	setPath: function ( path ) {

		this.path = path;
		return this;

	},
    /** @this {Loader} */
	setResourcePath: function ( resourcePath ) {

		this.resourcePath = resourcePath;
		return this;

	},
    /** @this {Loader} */
	setRequestHeader: function ( requestHeader ) {

		this.requestHeader = requestHeader;
		return this;

	}

} );

export { Loader };
