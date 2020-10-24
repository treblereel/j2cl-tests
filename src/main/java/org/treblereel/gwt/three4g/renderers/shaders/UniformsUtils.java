package org.treblereel.gwt.three4g.renderers.shaders;

import jsinterop.annotations.JsType;
import org.treblereel.gwt.three4g.materials.parameters.Uniforms;

/**
 * Uniform Utilities. Support merging and cloning of uniform variables
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 6/8/18.
 */
@JsType(isNative = true, namespace = "org.treblereel.gwt.three4g.renderers.shaders")
public class UniformsUtils {

    public static native Uniforms clone(Uniforms uniforms);

    public static native Uniforms merge(Uniforms[] uniforms);
}
