var XRWebGLLayer;


/**
 * @externs
 */

/**
 * @const {Navigator}
 */
Window.prototype.navigator;

/**
* @constructor
*/
Window.XR = function(){}

/**
 * @const {Window.XR}
 */
Navigator.prototype.xr;

/**
 * @const
 */
var THREE = {};

/**
 * @const
 */
THREE.MOUSE = {};

/** @const {number} */ THREE.MOUSE.LEFT;
/** @const {number} */ THREE.MOUSE.RIGHT;
/** @const {number} */ THREE.MOUSE.MIDDLE;
/** @const {number} */ THREE.MOUSE.ROTATE;
/** @const {number} */ THREE.MOUSE.DOLLY;
/** @const {number} */ THREE.MOUSE.PAN;

/**
 * @const
 */
THREE.TOUCH = {};

/** @const {number} */ THREE.TOUCH.ROTATE;
/** @const {number} */ THREE.TOUCH.PAN;
/** @const {number} */ THREE.TOUCH.DOLLY_PAN;
/** @const {number} */ THREE.TOUCH.DOLLY_ROTATE;

/** @const {string} */ THREE.REVISION;

/** @const {number} */ THREE.CullFaceNone;
/** @const {number} */ THREE.CullFaceBack;
/** @const {number} */ THREE.CullFaceFront;
/** @const {number} */ THREE.CullFaceFrontBack;
/** @const {number} */ THREE.FrontFaceDirectionCW;
/** @const {number} */ THREE.FrontFaceDirectionCCW;
/** @const {number} */ THREE.BasicShadowMap;
/** @const {number} */ THREE.PCFShadowMap;
/** @const {number} */ THREE.PCFSoftShadowMap;
/** @const {number} */ THREE.VSMShadowMap;
/** @const {number} */ THREE.FrontSide;
/** @const {number} */ THREE.BackSide;
/** @const {number} */ THREE.DoubleSide;
/** @const {number} */ THREE.FlatShading;
/** @const {number} */ THREE.SmoothShading;
/** @const {number} */ THREE.NoColors;
/** @const {number} */ THREE.FaceColors;
/** @const {number} */ THREE.VertexColors;
/** @const {number} */ THREE.NoBlending;
/** @const {number} */ THREE.NormalBlending;
/** @const {number} */ THREE.AdditiveBlending;
/** @const {number} */ THREE.SubtractiveBlending;
/** @const {number} */ THREE.MultiplyBlending;
/** @const {number} */ THREE.CustomBlending;
/** @const {number} */ THREE.AddEquation;
/** @const {number} */ THREE.SubtractEquation;
/** @const {number} */ THREE.ReverseSubtractEquation;
/** @const {number} */ THREE.MinEquation;
/** @const {number} */ THREE.MaxEquation;
/** @const {number} */ THREE.ZeroFactor;
/** @const {number} */ THREE.OneFactor;
/** @const {number} */ THREE.SrcColorFactor;
/** @const {number} */ THREE.OneMinusSrcColorFactor;
/** @const {number} */ THREE.SrcAlphaFactor;
/** @const {number} */ THREE.OneMinusSrcAlphaFactor;
/** @const {number} */ THREE.DstAlphaFactor;
/** @const {number} */ THREE.OneMinusDstAlphaFactor;
/** @const {number} */ THREE.DstColorFactor;
/** @const {number} */ THREE.OneMinusDstColorFactor;
/** @const {number} */ THREE.SrcAlphaSaturateFactor;
/** @const {number} */ THREE.NeverDepth;
/** @const {number} */ THREE.AlwaysDepth;
/** @const {number} */ THREE.LessDepth;
/** @const {number} */ THREE.LessEqualDepth;
/** @const {number} */ THREE.EqualDepth;
/** @const {number} */ THREE.GreaterEqualDepth;
/** @const {number} */ THREE.GreaterDepth;
/** @const {number} */ THREE.NotEqualDepth;
/** @const {number} */ THREE.MultiplyOperation;
/** @const {number} */ THREE.MixOperation;
/** @const {number} */ THREE.AddOperation;
/** @const {number} */ THREE.NoToneMapping;
/** @const {number} */ THREE.LinearToneMapping;
/** @const {number} */ THREE.ReinhardToneMapping;
/** @const {number} */ THREE.Uncharted2ToneMapping;
/** @const {number} */ THREE.CineonToneMapping;
/** @const {number} */ THREE.ACESFilmicToneMapping;

/** @const {number} */ THREE.UVMapping;
/** @const {number} */ THREE.CubeReflectionMapping;
/** @const {number} */ THREE.CubeRefractionMapping;
/** @const {number} */ THREE.EquirectangularReflectionMapping;
/** @const {number} */ THREE.EquirectangularRefractionMapping;
/** @const {number} */ THREE.SphericalReflectionMapping;
/** @const {number} */ THREE.CubeUVReflectionMapping;
/** @const {number} */ THREE.CubeUVRefractionMapping;
/** @const {number} */ THREE.RepeatWrapping;
/** @const {number} */ THREE.ClampToEdgeWrapping;
/** @const {number} */ THREE.MirroredRepeatWrapping;
/** @const {number} */ THREE.NearestFilter;
/** @const {number} */ THREE.NearestMipmapNearestFilter;
/** @const {number} */ THREE.NearestMipMapNearestFilter;
/** @const {number} */ THREE.NearestMipmapLinearFilter;
/** @const {number} */ THREE.NearestMipMapLinearFilter;
/** @const {number} */ THREE.LinearFilter;
/** @const {number} */ THREE.LinearMipmapNearestFilter;
/** @const {number} */ THREE.LinearMipMapNearestFilter;
/** @const {number} */ THREE.LinearMipmapLinearFilter;
/** @const {number} */ THREE.LinearMipMapLinearFilter;
/** @const {number} */ THREE.UnsignedByteType;
/** @const {number} */ THREE.ByteType;
/** @const {number} */ THREE.ShortType;
/** @const {number} */ THREE.UnsignedShortType;
/** @const {number} */ THREE.IntType;
/** @const {number} */ THREE.UnsignedIntType;
/** @const {number} */ THREE.FloatType;
/** @const {number} */ THREE.HalfFloatType;
/** @const {number} */ THREE.UnsignedShort4444Type;
/** @const {number} */ THREE.UnsignedShort5551Type;
/** @const {number} */ THREE.UnsignedShort565Type;
/** @const {number} */ THREE.UnsignedInt248Type;
/** @const {number} */ THREE.AlphaFormat;
/** @const {number} */ THREE.RGBFormat;
/** @const {number} */ THREE.RGBAFormat;
/** @const {number} */ THREE.LuminanceFormat;
/** @const {number} */ THREE.LuminanceAlphaFormat;
/** @const {number} */ THREE.RGBEFormat;
/** @const {number} */ THREE.DepthFormat;
/** @const {number} */ THREE.DepthStencilFormat;
/** @const {number} */ THREE.RedFormat;
/** @const {number} */ THREE.RGB_S3TC_DXT1_Format;
/** @const {number} */ THREE.RGBA_S3TC_DXT1_Format;
/** @const {number} */ THREE.RGBA_S3TC_DXT3_Format;
/** @const {number} */ THREE.RGBA_S3TC_DXT5_Format;
/** @const {number} */ THREE.RGB_PVRTC_4BPPV1_Format;
/** @const {number} */ THREE.RGB_PVRTC_2BPPV1_Format;
/** @const {number} */ THREE.RGBA_PVRTC_4BPPV1_Format;
/** @const {number} */ THREE.RGBA_PVRTC_2BPPV1_Format;
/** @const {number} */ THREE.RGB_ETC1_Format;
/** @const {number} */ THREE.RGBA_ASTC_4x4_Format;
/** @const {number} */ THREE.RGBA_ASTC_5x4_Format;
/** @const {number} */ THREE.RGBA_ASTC_5x5_Format;
/** @const {number} */ THREE.RGBA_ASTC_6x5_Format;
/** @const {number} */ THREE.RGBA_ASTC_6x6_Format;
/** @const {number} */ THREE.RGBA_ASTC_8x5_Format;
/** @const {number} */ THREE.RGBA_ASTC_8x6_Format;
/** @const {number} */ THREE.RGBA_ASTC_8x8_Format;
/** @const {number} */ THREE.RGBA_ASTC_10x5_Format;
/** @const {number} */ THREE.RGBA_ASTC_10x6_Format;
/** @const {number} */ THREE.RGBA_ASTC_10x8_Format;
/** @const {number} */ THREE.RGBA_ASTC_10x10_Format;
/** @const {number} */ THREE.RGBA_ASTC_12x10_Format;
/** @const {number} */ THREE.RGBA_ASTC_12x12_Format;
/** @const {number} */ THREE.LoopOnce;
/** @const {number} */ THREE.LoopRepeat;
/** @const {number} */ THREE.LoopPingPong;
/** @const {number} */ THREE.InterpolateDiscrete;
/** @const {number} */ THREE.InterpolateLinear;
/** @const {number} */ THREE.InterpolateSmooth;
/** @const {number} */ THREE.ZeroCurvatureEnding;
/** @const {number} */ THREE.ZeroSlopeEnding;
/** @const {number} */ THREE.WrapAroundEnding;
/** @const {number} */ THREE.TrianglesDrawMode;
/** @const {number} */ THREE.TriangleStripDrawMode;
/** @const {number} */ THREE.TriangleFanDrawMode;
/** @const {number} */ THREE.LinearEncoding;
/** @const {number} */ THREE.sRGBEncoding;
/** @const {number} */ THREE.GammaEncoding;
/** @const {number} */ THREE.RGBEEncoding;
/** @const {number} */ THREE.LogLuvEncoding;
/** @const {number} */ THREE.RGBM7Encoding;
/** @const {number} */ THREE.RGBM16Encoding;
/** @const {number} */ THREE.RGBDEncoding;
/** @const {number} */ THREE.BasicDepthPacking;
/** @const {number} */ THREE.RGBADepthPacking;
/** @const {number} */ THREE.TangentSpaceNormalMap;
/** @const {number} */ THREE.ObjectSpaceNormalMap;

/** @const {number} */ THREE.ZeroStencilOp;
/** @const {number} */ THREE.KeepStencilOp;
/** @const {number} */ THREE.ReplaceStencilOp;
/** @const {number} */ THREE.IncrementStencilOp;
/** @const {number} */ THREE.DecrementStencilOp;
/** @const {number} */ THREE.IncrementWrapStencilOp;
/** @const {number} */ THREE.DecrementWrapStencilOp ;
/** @const {number} */ THREE.InvertStencilOp;

/** @const {number} */ THREE.NeverStencilFunc;
/** @const {number} */ THREE.LessStencilFunc;
/** @const {number} */ THREE.EqualStencilFunc;
/** @const {number} */ THREE.LessEqualStencilFunc;
/** @const {number} */ THREE.GreaterStencilFunc;
/** @const {number} */ THREE.NotEqualStencilFunc;
/** @const {number} */ THREE.GreaterEqualStencilFunc;
/** @const {number} */ THREE.AlwaysStencilFunc;




















































/**
 * @constructor
 * @param {THREE.AnimationMixer} mixer
 * @param {THREE.AnimationClip} clip
 * @param {THREE.Object3D} localRoot
 */
THREE.AnimationAction = function(mixer, clip, localRoot) {};

/**
 * @constructor
 * @param {string} name
 * @param {number} duration
 * @param {Array|TypedArray<THREE.KeyframeTrack>} tracks
 */
THREE.AnimationClip = function(name, duration, tracks) {};

/**
* @static
* @param {Object} objectOrClipArray
* @param {string} name
* @return {!THREE.AnimationClip}
*/
THREE.AnimationClip.prototype.findByName = function(objectOrClipArray, name){}

/**
 * @constructor
 * @param {TypedArray<THREE.Object3D>} group
 */
THREE.AnimationObjectGroup = function(group) {};

/**
 * @constructor
 * @extends {THREE.EventDispatcher}
 * @param {THREE.Object3D|THREE.AnimationObjectGroup} param
 */
THREE.AnimationMixer = function(param) {};

/**
 * @constructor
 */
THREE.AudioLoader = function() {};

/**
 * @constructor
 * @extends {THREE.LineSegments}
 * @param {number=} size
 */
THREE.AxesHelper = function(size) {};

/**
 * @constructor
 * @param {!THREE.Vector2|undefined=} min
 * @param {!THREE.Vector2|undefined=} max
 */
THREE.Box2 = function(min, max) {};

/**
 * @type {THREE.Vector2}
 */
THREE.Box2.prototype.min

/**
 * @type {THREE.Vector2}
 */
THREE.Box2.prototype.max

/**
 * @param {!THREE.Vector2} point
 * @param {!THREE.Vector2} target
 * @return {!THREE.Vector2}
 */
THREE.Box2.prototype.clampPoint = function(point, target){}

/**
 * @return {!THREE.Vector2}
 */
THREE.Box2.prototype.clone = function(){}

/**
 * @param {!THREE.Box2} box
 * @return {boolean}
 */
THREE.Box2.prototype.containsBox = function(box){}

/**
 * @param {!THREE.Vector2} point
 * @return {boolean}
 */
THREE.Box2.prototype.containsPoint = function(point){}

/**
 * @param {!THREE.Box2} box
 * @return {!THREE.Box2}
 */
THREE.Box2.prototype.copy = function(box){}

/**
 * @param {!THREE.Vector2} point
 * @return {number}
 */
THREE.Box2.prototype.distanceToPoint = function(point){}

/**
 * @param {!THREE.Box2} box
 * @return {boolean}
 */
THREE.Box2.prototype.equals = function(box){}

/**
 * @param {!THREE.Vector2} point
 * @return {!THREE.Box2}
 */
THREE.Box2.prototype.expandByPoint = function(point){}

/**
 * @param {number} scalar
 * @return {!THREE.Box2}
 */
THREE.Box2.prototype.expandByScalar = function(scalar){}

/**
 * @param {!THREE.Vector2} vector
 * @return {!THREE.Box2}
 */
THREE.Box2.prototype.expandByVector = function(vector){}

/**
 * @param {!THREE.Vector2|undefined} target
 * @return {!THREE.Vector2}
 */
THREE.Box2.prototype.getCenter = function(target){}

/**
 * @param {!THREE.Vector2} point
 * @param {!THREE.Vector2} target
 * @return {!THREE.Vector2}
 */
THREE.Box2.prototype.getParameter = function(point, target){}

/**
 * @param {THREE.Vector2|undefined} target
 * @return {!THREE.Vector2}
 */
THREE.Box2.prototype.getSize = function(target){}

/**
 * @param {!THREE.Box2} box
 * @return {!THREE.Box2}
 */
THREE.Box2.prototype.intersect = function(box){}

/**
 * @param {!THREE.Box2} box
 * @return {boolean}
 */
THREE.Box2.prototype.intersectsBox = function(box){}

/**
 * @return {boolean}
 */
THREE.Box2.prototype.isEmpty = function(){}

/**
 * @return {!THREE.Box2}
 */
THREE.Box2.prototype.makeEmpty = function(){}

/**
 * @param {!THREE.Vector2} min
 * @param {!THREE.Vector2} max
 * @return {!THREE.Box2}
 */
THREE.Box2.prototype.set = function(min, max){}

/**
 * @param {!THREE.Vector2} center
 * @param {!THREE.Vector2} size
 * @return {!THREE.Box2}
 */
THREE.Box2.prototype.setFromCenterAndSize = function(center, size){}

/**
 * @param {Array<THREE.Vector2>} points
 * @return {!THREE.Box2}
 */
THREE.Box2.prototype.setFromPoints = function(points){}

/**
 * @param {THREE.Vector2} offset
 * @return {!THREE.Box2}
 */
THREE.Box2.prototype.translate = function(offset){}

/**
 * @param {THREE.Box2} box
 * @return {!THREE.Box2}
 */
THREE.Box2.prototype.union = function(box){}


/**
 * @constructor
 * @extends {THREE.BufferGeometry}
 * @param {number=} width
 * @param {number=} height
 * @param {number=} depth
 * @param {number=} widthSegments
 * @param {number=} heightSegments
 * @param {number=} depthSegments
 */
THREE.BoxBufferGeometry = function(width, height, depth, widthSegments, heightSegments, depthSegments) {};

/**
 * @constructor
 * @param {TypedArray} array
 * @param {number} itemSize
 * @param {boolean=} normalized
 */
THREE.BufferAttribute = function(array, itemSize, normalized) {};

/**
 * @param {boolean=} dynamic
 * @return {!THREE.BufferAttribute}
 */
THREE.BufferAttribute.prototype.setDynamic = function(dynamic) {}

/**
 * @constructor
 * @extends {THREE.EventDispatcher}
 */
THREE.BufferGeometry = function() {};

/**
* @param {string} name
* @param {THREE.BufferAttribute} attribute
*/
THREE.BufferGeometry.prototype.addAttribute = function(name, attribute){}

/**
* @return {THREE.Sphere}
*/
THREE.BufferGeometry.prototype.computeBoundingSphere = function(){}

/**
 * @constructor
 * @extends {THREE.Object3D}
 */
THREE.Camera = function() {};

/**
 * @constructor
 * @param {String|number=} r
 * @param {number=} g
 * @param {number=} b
 */
THREE.Color = function(r, g, b) {};

/**
 * @param {THREE.Color|string|number} color
 * @return {!THREE.Color}
 */
THREE.Color.prototype.set = function(color){}

/**
 * @param {number} color
 * @return {!THREE.Color}
 */
THREE.Color.prototype.setHex = function(color){}

/**
 * @param {Array<?>|TypedArray|null|undefined} array
 * @param {number=} offset
 * @return {TypedArray}
 */
THREE.Color.prototype.toArray = function(array, offset){}

/**
 * @constructor
 */
THREE.CubicPoly = function() {};

/**
* @param {number} weight
* @return {number}
*/
THREE.CubicPoly.prototype.calc = function(weight){}

/**
* @param {number} x0
* @param {number} x1
* @param {number} x2
* @param {number} x3
* @param {number} tension
* @return {number}
*/
THREE.CubicPoly.prototype.initCatmullRom = function(x0, x1, x2, x3, tension){}

/**
* @param {number} x0
* @param {number} x1
* @param {number} x2
* @param {number} x3
* @param {number} dt0
* @param {number} dt1
* @param {number} dt2
* @return {number}
*/
THREE.CubicPoly.prototype.initNonuniformCatmullRom = function(x0, x1, x2, x3, dt0, dt1, dt2){}

/**
 * @constructor
 */
THREE.Curve = function() {};

/**
 * @param {number=} divisions
 * @return {Array<THREE.Vector3>}
 */
THREE.Curve.prototype.getPoints = function(divisions) {};

/**
 * @constructor
 * @extends {THREE.Curve}
 */
THREE.CurvePath = function() {};

/**
 * @constructor
 */
THREE.EventDispatcher = function() {};

/**
 * @constructor
 * @param {number=} x
 * @param {number=} y
 * @param {number=} z
 * @param {String=} order
 */
THREE.Euler = function(x, y, z, order) {};

/**
 * @constructor
 * @extends {THREE.BufferAttribute}
 * @param {Array<?>|TypedArray|number|null} array
 * @param {number} itemSize
 * @param {boolean=} normalized
 */
THREE.Float32BufferAttribute = function(array, itemSize, normalized) {};

/**
 * @constructor
 * @extends {THREE.BufferAttribute}
 * @param {TypedArray} array
 * @param {number} itemSize
 * @param {boolean=} normalized
 */
THREE.Float64BufferAttribute = function(array, itemSize, normalized) {};

/**
 * @constructor
 * @extends {THREE.EventDispatcher}
 */
THREE.Geometry = function() {};

/**
* @param {THREE.BufferGeometry} BufferGeometry
* @return {THREE.Geometry}
*/
THREE.Geometry.prototype.fromBufferGeometry = function(BufferGeometry) {};

/**
 * @constructor
 * @extends {THREE.BufferAttribute}
 * @param {TypedArray} array
 * @param {number} itemSize
 * @param {boolean=} normalized
 */
THREE.Int8BufferAttribute = function(array, itemSize, normalized) {};

/**
 * @constructor
 * @extends {THREE.BufferAttribute}
 * @param {TypedArray} array
 * @param {number} itemSize
 * @param {boolean=} normalized
 */
THREE.Int16BufferAttribute = function(array, itemSize, normalized) {};

/**
 * @constructor
 * @extends {THREE.BufferAttribute}
 * @param {TypedArray} array
 * @param {number} itemSize
 * @param {boolean=} normalized
 */
THREE.Int32BufferAttribute = function(array, itemSize, normalized) {};

/**
 * @constructor
 * @param {string=} name
 * @param {TypedArray=} times
 * @param {TypedArray=} values
 * @param {number=} interpolation
 */
THREE.KeyframeTrack = function(name, times, values, interpolation) {};

/**
 * @constructor
 * @extends {THREE.Object3D}
 * @param {number=} color
 * @param {number=} intensity
 */
THREE.Light = function(color, intensity) {};

/**
* @constructor
*/
THREE.LightShadow = function() {};

/**
* @param {THREE.Light} light
*/
THREE.LightShadow.prototype.updateMatrices = function(light){}

/**
 * @constructor
 * @extends {THREE.Object3D}
 * @param {THREE.Geometry|THREE.BufferGeometry=} geometry
 * @param {THREE.Material=} material
 * @param {number=} mode
 */
THREE.Line = function(geometry, material, mode) {};

/**
 * @constructor
 * @extends {THREE.Material}
 * @param {Object=} parameters
 */
THREE.LineBasicMaterial = function(parameters) {};

/**
 * @constructor
 * @extends {THREE.Material}
 * @param {Object=} parameters
 */
THREE.LineDashedMaterial = function(parameters) {};

/**
 * @constructor
 * @extends {THREE.Material}
 * @param {THREE.Geometry|THREE.BufferGeometry=} geometry
 * @param {THREE.Material=} material
 */
THREE.LineSegments = function(geometry, material) {};

/**
 * @constructor
 * @param {THREE.LoadingManager=} manager
 */
THREE.Loader = function(manager) {};

/**
* @param {string} crossOrigin
* @return {THREE.Loader}
*/
THREE.Loader.prototype.setCrossOrigin = function(crossOrigin){}

/**
 * @constructor
 * @param {Function=} onLoad
 * @param {Function=} onProgress
 * @param {Function=} onError
 */
THREE.LoadingManager = function(onLoad, onProgress, onError) {};

/**
 * @constructor
 * @extends {THREE.EventDispatcher}
 * @param {Object=} parameters
 */
THREE.Material = function(parameters) {};

/**
 * @constructor
 */
THREE.Matrix3 = function() {};

/**
 * @param {THREE.Matrix4} matrix
 * @return {THREE.Matrix3}
 */
THREE.Matrix3.prototype.getNormalMatrix = function(matrix){}

/**
* @param {TypedArray} array
* @return {!THREE.Matrix3}
*/
THREE.Matrix3.prototype.fromArray = function(array){}

/**
 * @constructor
 */
THREE.Matrix4 = function() {};

/**
* @param {TypedArray} array
* @return {!THREE.Matrix4}
*/
THREE.Matrix4.prototype.fromArray = function(array){}

/**
 * @param {THREE.Matrix4} matrix
 * @return {THREE.Matrix4}
 */
THREE.Matrix4.prototype.getInverse = function(matrix){}

/**
 * @param {THREE.Vector3} axis
 * @param {number} theta
 * @return {THREE.Matrix4}
 */
THREE.Matrix4.prototype.makeRotationAxis = function(axis, theta){}

/**
 * @param {number} theta
 * @return {THREE.Matrix4}
 */
THREE.Matrix4.prototype.makeRotationX = function(theta){}

/**
 * @param {number} theta
 * @return {THREE.Matrix4}
 */
THREE.Matrix4.prototype.makeRotationY = function(theta){}

/**
 * @param {number} theta
 * @return {THREE.Matrix4}
 */
THREE.Matrix4.prototype.makeRotationZ = function(theta){}

/**
 * @param {THREE.Matrix4} a
 * @param {THREE.Matrix4} b
 * @return {THREE.Matrix4}
 */
THREE.Matrix4.prototype.multiplyMatrices = function(a, b){}

/**
 * @param {TypedArray=} a
 * @param {number=} b
 * @return {TypedArray}
 */
THREE.Matrix4.prototype.toArray = function(a, b){}

/**
 * @constructor
 * @extends {THREE.Object3D}
 * @param {THREE.Geometry|THREE.BufferGeometry=} geometry
 * @param {THREE.Material=} material //TODO
 */
THREE.Mesh = function(geometry, material) {};

/**
 * @constructor
 * @extends {THREE.Material}
 * @param {Object=} parameters
 */
THREE.MeshBasicMaterial = function(parameters) {};


/**
 * @constructor
 * @extends {THREE.Material}
 * @param {Object=} parameters
 */
THREE.MeshLambertMaterial = function(parameters) {};


/**
 * @constructor
 * @extends {THREE.Material}
 * @param {Object=} parameters
 */
THREE.MeshPhongMaterial = function(parameters) {};

/**
 * @constructor
 * @extends {THREE.Material}
 * @param {Object=} parameters
 */
THREE.MeshStandardMaterial = function(parameters) {};

/**
 * @constructor
 * @extends {THREE.EventDispatcher}
 */
THREE.Object3D = function() {};

/**
 * @type {THREE.Vector3}
 */
THREE.Object3D.prototype.position

/**
 * @type {THREE.Euler}
 */
THREE.Object3D.prototype.rotation

/**
* @param {THREE.Mesh|Array<THREE.Object3D>|undefined} objects
* @return {THREE.Object3D}
*/
THREE.Object3D.prototype.add = function(objects) {};

/**
* @param {THREE.Vector3} vec
*/
THREE.Object3D.prototype.lookAt = function(vec) {};

/**
 * @constructor
 * @extends {THREE.CurvePath}
 * @param {Array<THREE.Vector2>=} vec
 */
THREE.Path = function(vec) {};

/**
* @param {number} a
* @param {number} b
*/
THREE.Path.prototype.moveTo = function(a, b){}

/**
 * @constructor
 * @extends {THREE.Camera}
 * @param {number=} fov
 * @param {number=} aspect
 * @param {number=} near
 * @param {number=} far
 */
THREE.PerspectiveCamera = function(fov, aspect, near, far) {};

/**
 * @constructor
 * @extends {THREE.Material}
 */
THREE.PointLightShadow = function() {};

/**
 * @constructor
 * @extends {THREE.Material}
 * @param {Object=} parameters
 */
THREE.PointsMaterial = function(parameters) {};

/**
 * @constructor
 * @param {number=} x
 * @param {number=} y
 * @param {number=} z
 * @param {number=} w
 */
THREE.Quaternion = function(x, y, z, w) {};

/**
* @param {TypedArray} dst
* @param {number} dstOffset
* @param {TypedArray} src0
* @param {number} srcOffset0
* @param {TypedArray} src1
* @param {number} srcOffset1
* @param {number} t
*/
THREE.Quaternion.prototype.slerpFlat = function(dst, dstOffset, src0, srcOffset0, src1, srcOffset1, t){}

/**
 * @constructor
 * @extends {THREE.Object3D}
 */
THREE.Scene = function() {};

/**
 * @constructor
 * @extends {THREE.Light}
 * @param {Array<THREE.Path>=} path
 */
THREE.Shape = function(path) {};

/**
* @param {number} divisions
* @return {Array<(Object|null)>|null}
*/
THREE.Shape.prototype.getPoints = function(divisions){}

/**
 * @constructor
 * @param {THREE.Vector3=} center
 * @param {THREE.Vector3=} radius
 */
THREE.Sphere = function(center, radius) {};

/**
* @param {THREE.Matrix4} matrix4
* @return {!THREE.Sphere}
*/
THREE.Sphere.prototype.applyMatrix4 = function(matrix4){}

/**
 * @constructor
 * @extends {THREE.Light}
 * @param {number=} color
 * @param {number=} intensity
 * @param {number=} distance
 * @param {number=} angle
 * @param {number=} penumbra
 * @param {number=} decay
 */
THREE.SpotLight = function(color, intensity, distance, angle, penumbra, decay) {};


/**
* @type {!THREE.Object3D}
*/
THREE.SpotLight.prototype.target

/**
 * @constructor
 * @extends {THREE.Object3D}
 * @param {THREE.SpriteMaterial=} material
 */
THREE.Sprite = function(material) {};

/**
 * @constructor
 * @extends {THREE.Material}
 * @param {Object=} parameters
 */
THREE.SpriteMaterial = function(parameters) {};

/**
 * @constructor
 * @extends {THREE.EventDispatcher}
 * @param {HTMLImageElement|null=} image
 * @param {number=} mapping
 * @param {number=} wrapS
 * @param {number=} wrapT
 * @param {number=} magFilter
 * @param {number=} minFilter
 * @param {number=} format
 * @param {number=} type
 * @param {number=} anisotropy
 */
THREE.Texture = function(image, mapping, wrapS, wrapT, magFilter, minFilter, format, type, anisotropy) {};

/**
 * @constructor
 * @extends {THREE.Loader}
 */
THREE.TextureLoader = function() {};

/**
* @param {!string} url
* @param {Function<THREE.Texture>=} onLoad
* @param {Function<Object>=} onProgress
* @param {Function<Object>=} onError
* @return {THREE.Texture}
*/
THREE.TextureLoader.prototype.load = function(url, onLoad, onProgress, onError){};

/**
 * @constructor
 * @extends {THREE.BufferAttribute}
 * @param {THREE.Vector3} a
 * @param {THREE.Vector3} b
 * @param {THREE.Vector3} c
 */
THREE.Triangle = function(a, b, c) {};

/**
 * @param {!THREE.Vector3} point
 * @param {!THREE.Vector3} target
 * @return {!THREE.Vector3}
 */
THREE.Triangle.prototype.getBarycoord = function(point, target) {};

/**
 * @param {THREE.Vector3} target
 */
THREE.Triangle.prototype.getNormal = function(target) {};

/**
 * @constructor
 * @extends {THREE.BufferAttribute}
 * @param {TypedArray} array
 * @param {number} itemSize
 * @param {boolean=} normalized
 */
THREE.Uint8BufferAttribute = function(array, itemSize, normalized) {};

/**
 * @constructor
 * @extends {THREE.BufferAttribute}
 * @param {TypedArray} array
 * @param {number} itemSize
 * @param {boolean=} normalized
 */
THREE.Uint8ClampedBufferAttribute = function(array, itemSize, normalized) {};

/**
 * @constructor
 * @extends {THREE.BufferAttribute}
 * @param {TypedArray} array
 * @param {number} itemSize
 * @param {boolean=} normalized
 */
THREE.Uint16BufferAttribute = function(array, itemSize, normalized) {};

/**
 * @constructor
 * @extends {THREE.BufferAttribute}
 * @param {TypedArray} array
 * @param {number} itemSize
 * @param {boolean=} normalized
 */
THREE.Uint32BufferAttribute = function(array, itemSize, normalized) {};

/**
 * @constructor
 * @param {!number=} x
 * @param {!number=} y
 */
THREE.Vector2 = function(x, y) {};

/**
* @param {number=} scalar
* @return {THREE.Vector2}
*/
THREE.Vector2.prototype.addScalar = function(scalar){}

/**
* @param {TypedArray} array
* @param {number=} offset
* @return {THREE.Vector2}
*/
THREE.Vector2.prototype.fromArray = function(array, offset){}

/**
* @param {!THREE.BufferAttribute} bufferAttribute
* @param {number=} offset
* @return {!THREE.Vector2}
*/
THREE.Vector2.prototype.fromBufferAttribute = function(bufferAttribute, offset){}

/**
* @param {number} a
* @return {!THREE.Vector2}
*/
THREE.Vector2.prototype.multiply = function(a){}

/**
* @param {number=} a
* @param {number=} b
* @return {!THREE.Vector2}
*/
THREE.Vector2.prototype.set = function(a, b){}

/**
* @param {!THREE.Vector2} a
* @param {!THREE.Vector2} b
* @return {!THREE.Vector2}
*/
THREE.Vector2.prototype.subVectors = function(a, b){}

/**
* @type {number}
*/
THREE.Vector2.prototype.height;

/**
* @type {number}
*/
THREE.Vector2.prototype.width;

/**
 * @constructor
 * @param {number=} x
 * @param {number=} y
 * @param {number=} z
 */
THREE.Vector3 = function(x, y, z) {};

/**
 * @param {THREE.Vector3} vector
 * @return {THREE.Vector3}
 */
THREE.Vector3.prototype.add = function(vector){}

/**
 * @param {THREE.Matrix3} matrix3
 * @return {THREE.Vector3}
 */
THREE.Vector3.prototype.applyMatrix3 = function(matrix3){}

/**
 * @param {THREE.Matrix4} matrix4
 * @return {THREE.Vector3}
 */
THREE.Vector3.prototype.applyMatrix4 = function(matrix4){}

/**
 * @param {number} scalar
 * @return {THREE.Vector3}
 */
THREE.Vector3.prototype.addScalar = function(scalar){}

/**
 * @param {THREE.Vector3} vector
 * @param {number} scalar
 * @return {THREE.Vector3}
 */
THREE.Vector3.prototype.addScaledVector = function(vector, scalar){}

/**
 * @param {THREE.Vector3} a
 * @param {THREE.Vector3} b
 * @return {THREE.Vector3}
 */
THREE.Vector3.prototype.addVectors = function(a, b){}

/**
 * @param {THREE.Vector3} a
 * @param {THREE.Vector3} b
 * @return {THREE.Vector3}
 */
THREE.Vector3.prototype.crossVectors = function(a, b){}

/**
 * @param {THREE.Vector3} vector3
 * @return {number}
 */
THREE.Vector3.prototype.distanceTo = function(vector3){}

/**
 * @param {THREE.Vector3} vector3
 * @return {number}
 */
THREE.Vector3.prototype.dot = function(vector3){}

/**
* @param {TypedArray} array
* @param {number=} fromArray
* @return {!THREE.Vector3}
*/
THREE.Vector3.prototype.fromArray = function(array,fromArray){}

/**
* @param {!THREE.BufferAttribute} bufferAttribute
* @param {number} index
* @return {!THREE.Vector3}
*/
THREE.Vector3.prototype.fromBufferAttribute = function(bufferAttribute, index){}

/**
 * @return {number}
 */
THREE.Vector3.prototype.length = function(){}

/**
 * @return {number}
 */
THREE.Vector3.prototype.lengthSq = function(){}

/**
* @param {number} scalar
* @return {THREE.Vector3}
*/
THREE.Vector3.prototype.multiplyScalar = function(scalar){}

/**
 * @return {THREE.Vector3}
 */
THREE.Vector3.prototype.negate = function(){}

/**
 * @return {THREE.Vector3}
 */
THREE.Vector3.prototype.normalize = function(){}

/**
 * @param {number=} x
 * @param {number=} y
 * @param {number=} z
 */
THREE.Vector3.prototype.set = function(x, y, z){}

/**
 * @param {THREE.Matrix4} matrix4
 * @param {number} index
 * @return {THREE.Vector3}
 */
THREE.Vector3.prototype.setFromMatrixColumn = function(matrix4, index){}

/**
 * @param {THREE.Matrix4} matrix4
 * @return {THREE.Vector3}
 */
THREE.Vector3.prototype.setFromMatrixPosition = function(matrix4){}

/**
 * @param {THREE.Matrix4} matrix4
 * @return {THREE.Vector3}
 */
THREE.Vector3.prototype.setFromMatrixScale = function(matrix4){}

/**
 * @param {THREE.Vector3} vector1
 * @param {THREE.Vector3} vector2
 * @return {THREE.Vector3}
 */
THREE.Vector3.prototype.subVectors = function(vector1, vector2){}

/**
 * @constructor
 * @param {number=} x
 * @param {number=} y
 * @param {number=} z
 * @param {number=} w
 */
THREE.Vector4 = function(x, y, z, w) {};

/**
* @param {TypedArray} array
* @return {!THREE.Vector4}
*/
THREE.Vector4.prototype.fromArray = function(array){}

/**
* @return {number}
*/
THREE.Vector4.prototype.manhattanLength = function(){}

/**
* @param {number} scale
* @return {!THREE.Vector4}
*/
THREE.Vector4.prototype.multiplyScalar = function(scale){}

/**
* @param {number} x
* @param {number} y
* @param {number} width
* @param {number} height
* @return {!THREE.Vector4}
*/
THREE.Vector4.prototype.set = function(x, y, width, height){}

/**
 * @constructor
 * @extends {THREE.Texture}
 * @param {!HTMLVideoElement=} video
 * @param {number=} mapping
 * @param {number=} wrapS
 * @param {number=} wrapT
 * @param {number=} magFilter
 * @param {number=} minFilter
 * @param {number=} format
 * @param {number=} type
 * @param {number=} anisotropy
 */
THREE.VideoTexture = function(video, mapping, wrapS, wrapT, magFilter, minFilter, format, type, anisotropy) {};

/**
 * @constructor
 */
THREE.WebGLAnimation = function() {};

/**
 * @constructor
 * @param {Object} _gl
 */
THREE.WebGLAttributes = function(_gl) {};

/**
 * @param {Window} window
 */
THREE.WebGLAnimation.prototype.setContext = function(window) {};

/**
 */
THREE.WebGLAnimation.prototype.stop = function() {};

/**
 * @constructor
 * @param {!Object} _gl
 * @param {!THREE.WebGLExtensions} extensions
 * @param {!THREE.WebGLInfo} info
 * @param {!Object} capabilities
 */
THREE.WebGLBufferRenderer = function( _gl, extensions, info, capabilities) {};

/**
 * @constructor
 * @param {!Object} _gl
 * @param {!Object} parameters
 * @param {!THREE.WebGLExtensions} extensions */
THREE.WebGLCapabilities = function(_gl, extensions, parameters) {};

/**
* @type {number}
*/
THREE.WebGLCapabilities.prototype.maxTextureSize

/**
 * @constructor
 * @param {!Object=} params
 */
THREE.WebGLExtensions = function(params) {};

/**
* @param {string} a
* @return {Object}
*/
THREE.WebGLExtensions.prototype.get = function(a){}

/**
 * @constructor
 * @param {!Object=} _gl
 */
THREE.WebGLInfo = function( _gl) {};

/**
 * @constructor
 * @param {!Object} _gl
 * @param {!THREE.WebGLAttributes} attributes
 * @param {!THREE.WebGLInfo} info
 */
THREE.WebGLGeometries = function(_gl, attributes, info) {};

/**
 * @constructor
 * @param {!THREE.WebGLGeometries}  geometries
 * @param {!THREE.WebGLInfo} info
 */
THREE.WebGLObjects = function(geometries, info) {};

/**
 * @constructor
 */
THREE.WebGLProperties = function() {};

/**
* @param {THREE.Texture} texture
* @return {Object}
*/
THREE.WebGLProperties.prototype.get = function(texture) {};

/**
 * @constructor
 * @param {!THREE.WebGLExtensions} extensions
 * @param {!THREE.WebGLCapabilities} capabilities
 */
THREE.WebGLPrograms = function(extensions, capabilities) {};

/**
 * @constructor
 * @param {!Object=} params
 */
THREE.WebGLRenderer = function(params) {};

/**
 * @constructor
 */
THREE.WebGLRenderLists = function() {};

/**
 * @constructor
 */
THREE.WebGLRenderStates = function() {};

/**
 * @constructor
 * @param {!Object} _gl
 * @param {!THREE.WebGLExtensions} extensions
 * @param {!THREE.WebGLInfo} info
 * @param {!Object} capabilities
 */
THREE.WebGLIndexedBufferRenderer = function( _gl, extensions, info, capabilities) {};

/**
 * @type {HTMLElement}
 */
THREE.WebGLRenderer.prototype.domElement

/**
 * @param {THREE.Scene} scene
 * @param {THREE.Camera} camera
 */
THREE.WebGLRenderer.prototype.render = function(scene, camera) {};

/**
 * @param {THREE.Vector2} target
 * @return {THREE.Vector2}
 */
THREE.WebGLRenderer.prototype.getSize = function(target) {};

/**
 * @return {number}
 */
THREE.WebGLRenderer.prototype.getWidth = function() {};

/**
 * @param {number} width
 * @param {number} height
 * @param {boolean=} updateStyle
 */
THREE.WebGLRenderer.prototype.setSize = function(width, height, updateStyle) {};

/**
 * @constructor
 * @param {Object} _gl
 * @param {!THREE.WebGLExtensions} extensions
 * @param {!THREE.WebGLCapabilities} capabilities
 */
THREE.WebGLUtils = function(_gl, extensions, capabilities) {};

/**
* @param {number} textureFormat
* @return {number}
*/
THREE.WebGLUtils.prototype.convert = function(textureFormat){}

/**
 * @constructor
 * @param {!THREE.WebGLRenderer} _renderer
 * @param {TypedArray} _objects
 * @param {number} maxTextureSize
 */
THREE.WebGLShadowMap = function(_renderer, _objects, maxTextureSize) {};

/**
 * @constructor
 * @param {Object} _gl
 * @param {!THREE.WebGLExtensions} extensions
 * @param {!THREE.WebGLUtils} utils
 * @param {!THREE.WebGLCapabilities} capabilities
 */
THREE.WebGLState = function(_gl, extensions, utils, capabilities) {};

/**
 * @constructor
 * @param {Object} _gl
 * @param {!THREE.WebGLExtensions} extensions
 * @param {!THREE.WebGLState} state
 * @param {!THREE.WebGLProperties} properties
 * @param {!THREE.WebGLCapabilities} capabilities
 * @param {!THREE.WebGLUtils} utils
 * @param {!THREE.WebGLInfo} info
 */
THREE.WebGLTextures = function(_gl, extensions, state, properties, capabilities, utils, info) {};

/**
 * @constructor
 * @param {!THREE.WebGLRenderer} _renderer
 * @param {Object} _gl
 */
THREE.WebXRManager = function(_renderer, _gl) {};

/**
 * @constructor
 * @param {!THREE.WebGLRenderer} _renderer
 */
THREE.WebVRManager = function(_renderer) {};

