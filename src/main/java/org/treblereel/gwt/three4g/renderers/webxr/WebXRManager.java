package org.treblereel.gwt.three4g.renderers.webxr;

import elemental2.webgl.WebGLRenderingContext;
import jsinterop.annotations.JsType;
import org.treblereel.gwt.three4g.cameras.ArrayCamera;
import org.treblereel.gwt.three4g.math.Matrix4;
import org.treblereel.gwt.three4g.renderers.OnAnimate;
import org.treblereel.gwt.three4g.renderers.WebGLRenderer;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 7/9/18.
 */
@JsType(isNative = true, namespace = "org.treblereel.gwt.three4g.renderers.webxr")
public class WebXRManager {

    public boolean enabled;

    public float framebufferScaleFactor; // 1.0

    public boolean isPresenting;

    public String referenceSpaceType;

    public WebXRManager(WebGLRenderer renderer, WebGLRenderingContext context){

    }

    public native Object getController(String id);

    public native Object getDevice();

    public native void setDevice(Object device);

    public native void setSession(Object session);

    public native ArrayCamera getCamera();

    public native void dispose();

    public native void submitFrame();

    public native Matrix4 getStandingMatrix();

    public native void setFrameOfReferenceType(String frameOfReferenceType);

    /**
     * A build in function that can be used instead of requestAnimationFrame. For WebVR projects this function must be used.
     *
     * @param callback — The function will be called every available frame. If `null` is passed it will stop any already ongoing animation.
     */
    public native void setAnimationLoop(OnAnimate callback);
}
