import { KeyframeTrack } from '../KeyframeTrack.js';

/**
 * A Track of vectored keyframe values.
 */

/**
* @constructor
* @param {string} name
* @param {Array} times
* @param {Array} values
* @param {number=} interpolation
* @extends {KeyframeTrack}
*/
function VectorKeyframeTrack( name, times, values, interpolation ) {

	KeyframeTrack.call( this, name, times, values, interpolation );

}

VectorKeyframeTrack.prototype = Object.assign( Object.create( KeyframeTrack.prototype ), {

	constructor: VectorKeyframeTrack,

	ValueTypeName: 'vector'

	// ValueBufferType is inherited

	// DefaultInterpolation is inherited

} );

export { VectorKeyframeTrack };
