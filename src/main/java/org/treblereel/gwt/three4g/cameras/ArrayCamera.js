import { PerspectiveCamera } from './PerspectiveCamera.js';

/**
* @constructor
* @param {Array<PerspectiveCamera>=} array
* @extends {PerspectiveCamera}
*/
function ArrayCamera( array ) {

	PerspectiveCamera.call( this );

	this.cameras = array || [];

}

ArrayCamera.prototype = Object.assign( Object.create( PerspectiveCamera.prototype ), {

	constructor: ArrayCamera,

	isArrayCamera: true

} );


export { ArrayCamera };
