package org.treblereel.gwt.three4g.renderers.webvr;

import jsinterop.annotations.JsType;
import org.treblereel.gwt.three4g.cameras.ArrayCamera;
import org.treblereel.gwt.three4g.core.Object3D;
import org.treblereel.gwt.three4g.math.Matrix4;
import org.treblereel.gwt.three4g.renderers.OnAnimate;
import org.treblereel.gwt.three4g.renderers.WebGLRenderer;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 5/28/18.
 */
@JsType(isNative = true, namespace = "org.treblereel.gwt.three4g.renderers.webvr")
public class WebVRManager {

    //default false
    public boolean enabled;

    public float framebufferScaleFactor; // 1.0

    public boolean isPresenting;

    public String frameOfReferenceType;

    public int userHeight; //TODO

    public WebVRManager(WebGLRenderer renderer) {

    }

    public native Object getDevice();

    public native void setDevice(Object device);

    public native void setPoseTarget(Object3D object);

    public native ArrayCamera getCamera();

    public native Matrix4 getStandingMatrix();

    public native void submitFrame();

    public native void dispose();

    public native Object getController(String id);

    /**
     * A build in function that can be used instead of requestAnimationFrame. For WebVR projects this function must be used.
     *
     * @param callback — The function will be called every available frame. If `null` is passed it will stop any already ongoing animation.
     */
    public native void setAnimationLoop(OnAnimate callback);

    public native void setFrameOfReferenceType(String frameOfReferenceType);
}
