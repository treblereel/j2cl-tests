import { BufferAttribute } from './BufferAttribute.js';

/**
* @constructor
* @param {ArrayLike<number>} array
* @param {number} itemSize
* @param {boolean=} normalized
* @param {number=} meshPerAttribute
* @extends {BufferAttribute}
*/
function InstancedBufferAttribute( array, itemSize, normalized, meshPerAttribute ) {

	if ( typeof ( normalized ) === 'number' ) {

		meshPerAttribute = normalized;

		normalized = false;

		console.error( 'THREE.InstancedBufferAttribute: The constructor now expects normalized as the third argument.' );

	}

	BufferAttribute.call( this, array, itemSize, normalized );

	this.meshPerAttribute = meshPerAttribute || 1;

}

InstancedBufferAttribute.prototype = Object.assign( Object.create( BufferAttribute.prototype ), {

	constructor: InstancedBufferAttribute,

	isInstancedBufferAttribute: true,

	copy: function ( source ) {

		BufferAttribute.prototype.copy.call( this, source );

		this.meshPerAttribute = source.meshPerAttribute;

		return this;

	},

	toJSON: function ()	{

		const data = BufferAttribute.prototype.toJSON.call( this );

		data.meshPerAttribute = this.meshPerAttribute;

		data.isInstancedBufferAttribute = true;

		return data;

	}

} );



export { InstancedBufferAttribute };
