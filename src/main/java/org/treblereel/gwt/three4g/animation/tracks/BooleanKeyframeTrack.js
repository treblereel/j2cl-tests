import { InterpolateDiscrete } from '../../constants.js';
import { KeyframeTrack } from '../KeyframeTrack.js';

/**
 * A Track of Boolean keyframe values.
 */

/**
* @constructor
* @param {string} name
* @param {Array} times
* @param {Array} values
* @extends {KeyframeTrack}
*/
function BooleanKeyframeTrack( name, times, values ) {

	KeyframeTrack.call( this, name, times, values );

}

BooleanKeyframeTrack.prototype = Object.assign( Object.create( KeyframeTrack.prototype ), {

	constructor: BooleanKeyframeTrack,

	ValueTypeName: 'bool',
	ValueBufferType: Array,

	DefaultInterpolation: InterpolateDiscrete,

	InterpolantFactoryMethodLinear: undefined,
	InterpolantFactoryMethodSmooth: undefined

	// Note: Actually this track could have a optimized / compressed
	// representation of a single value and a custom interpolant that
	// computes "firstValue ^ isOdd( index )".

} );

export { BooleanKeyframeTrack };
