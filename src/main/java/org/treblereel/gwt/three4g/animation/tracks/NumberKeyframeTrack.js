import { KeyframeTrack } from '../KeyframeTrack.js';

/**
 * A Track of numeric keyframe values.
 */
/**
* @constructor
* @param {string} name
* @param {Array} times
* @param {Array} values
* @param {number=} interpolation
* @extends {KeyframeTrack}
*/
function NumberKeyframeTrack( name, times, values, interpolation ) {

	KeyframeTrack.call( this, name, times, values, interpolation );

}

NumberKeyframeTrack.prototype = Object.assign( Object.create( KeyframeTrack.prototype ), {

	constructor: NumberKeyframeTrack,

	ValueTypeName: 'number'

	// ValueBufferType is inherited

	// DefaultInterpolation is inherited

} );

export { NumberKeyframeTrack };
