import { Light } from './Light.js';
import { Color } from '../math/Color.js';

/**
* @constructor
* @param {Color|string|number=} color
* @param {number=} intensity
* @extends {Light}
*/
function AmbientLight( color, intensity ) {

	Light.call( this, color, intensity );

	this.type = 'AmbientLight';

}

AmbientLight.prototype = Object.assign( Object.create( Light.prototype ), {

	constructor: AmbientLight,

	isAmbientLight: true

} );


export { AmbientLight };
