package org.treblereel;

import elemental2.core.JsString;
import elemental2.dom.DomGlobal;
import jsinterop.base.Js;
import org.treblereel.gwt.three4g.cameras.PerspectiveCamera;
import org.treblereel.gwt.three4g.core.BufferGeometry;
import org.treblereel.gwt.three4g.core.Geometry;
import org.treblereel.gwt.three4g.core.PropertyHolder;
import org.treblereel.gwt.three4g.geometries.BoxBufferGeometry;
import org.treblereel.gwt.three4g.helpers.CameraHelper;
import org.treblereel.gwt.three4g.loaders.Cache;
import org.treblereel.gwt.three4g.loaders.OnErrorCallback;
import org.treblereel.gwt.three4g.loaders.OnLoadCallback;
import org.treblereel.gwt.three4g.loaders.OnProgressCallback;
import org.treblereel.gwt.three4g.loaders.OnProgressEvent;
import org.treblereel.gwt.three4g.loaders.TextureLoader;
import org.treblereel.gwt.three4g.materials.MeshBasicMaterial;
import org.treblereel.gwt.three4g.materials.parameters.MeshBasicMaterialParameters;
import org.treblereel.gwt.three4g.math.Quaternion;
import org.treblereel.gwt.three4g.objects.Mesh;
import org.treblereel.gwt.three4g.renderers.WebGLRenderer;
import org.treblereel.gwt.three4g.renderers.parameters.WebGLRendererParameters;
import org.treblereel.gwt.three4g.renderers.shaders.ShaderLib;
import org.treblereel.gwt.three4g.scenes.Scene;
import org.treblereel.gwt.three4g.textures.Texture;
import org.treblereel.gwt.three4g.utils.JSON;

import static elemental2.dom.DomGlobal.document;
import static elemental2.dom.DomGlobal.window;

public class App {

    protected Mesh mesh;
    protected float aspect = new Float((getWidth() / getHeight()));
    private Scene scene = new Scene();
    private PerspectiveCamera camera;
    private WebGLRenderer renderer;

    public void onModuleLoad() {

        Geometry g = new Geometry();

        DomGlobal.console.log("G 1 ? " + g.name);
        DomGlobal.console.log("G 2 ? " + g.getId());
        DomGlobal.console.log("G 3 ? " + g.isGeometry);
        DomGlobal.console.log("G 4 ? " + g.getType());

        BufferGeometry bg = new BufferGeometry();

        DomGlobal.console.log("G 1 ? " + bg.name);
        DomGlobal.console.log("G 2 ? " + bg.getId());
        DomGlobal.console.log("G 3 ? " + bg.isBufferGeometry);
        DomGlobal.console.log("G 4 ? " + bg.getType());

/*        Quaternion q = new Quaternion();

        DomGlobal.console.log("Quaternion " + q.isQuaternion + " " + q.clone().toArray().length);

        //DomGlobal.console.log(" ShaderLib" + JSON.stringify(new ShaderLib()));

        DomGlobal.console.log("? " + JSON.stringify(q));

        new TextureLoader().setCrossOrigin("asdasd").setPath("aZZZZ");
        new TextureLoader().setPath("asdsad");*/


        WebGLRendererParameters rendererParameters = new WebGLRendererParameters();
        rendererParameters.antialias = true;
        renderer = new WebGLRenderer(rendererParameters);

        camera = new PerspectiveCamera(70, aspect, 1, 1000);
        camera.position.z = 400;

        DomGlobal.console.log(new CameraHelper(camera).toJSON());

        scene = new Scene();

        String url = "https://threejs.org/examples/textures/crate.gif";

        TextureLoader textureLoader = new TextureLoader();

        Texture texture = textureLoader.load(url);

        BoxBufferGeometry geometry = new BoxBufferGeometry(200, 200, 200);

        MeshBasicMaterialParameters meshBasicMaterialParameters = new MeshBasicMaterialParameters();

        meshBasicMaterialParameters.map = texture;

        MeshBasicMaterial material = new MeshBasicMaterial(meshBasicMaterialParameters);

        mesh = new Mesh(geometry, material);

        scene.add(mesh);

        setupWebGLRenderer(renderer);

        DomGlobal.document.body.appendChild(renderer.domElement);

        animate();
    }

    public double getWidth() {
        return window.innerWidth * 0.8;
    }

    public double getHeight() {
        return window.innerHeight;
    }

    public void setupWebGLRenderer(WebGLRenderer webGLRenderer) {
        webGLRenderer.domElement.id = "viewer";
        webGLRenderer.setSize(getWidth(), getHeight());
    }

    private void animate() {
        mesh.rotation.x += 0.005f;
        mesh.rotation.y += 0.01f;

        DomGlobal.requestAnimationFrame(timestamp -> {
            renderer.render(scene, camera);
            animate();
        });
    }
}
