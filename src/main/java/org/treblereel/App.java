package org.treblereel;

import elemental2.dom.DomGlobal;
import org.treblereel.gwt.three4g.cameras.PerspectiveCamera;
import org.treblereel.gwt.three4g.geometries.BoxBufferGeometry;
import org.treblereel.gwt.three4g.loaders.TextureLoader;
import org.treblereel.gwt.three4g.materials.MeshBasicMaterial;
import org.treblereel.gwt.three4g.materials.parameters.MeshBasicMaterialParameters;
import org.treblereel.gwt.three4g.objects.Mesh;
import org.treblereel.gwt.three4g.renderers.WebGLRenderer;
import org.treblereel.gwt.three4g.renderers.parameters.WebGLRendererParameters;
import org.treblereel.gwt.three4g.scenes.Scene;
import org.treblereel.gwt.three4g.textures.Texture;

import static elemental2.dom.DomGlobal.window;

public class App {

    protected Mesh mesh;
    protected float aspect = new Float((getWidth() / getHeight()));
    private Scene scene = new Scene();
    private PerspectiveCamera camera;
    private WebGLRenderer renderer;

    public void onModuleLoad() {

        WebGLRendererParameters rendererParameters = new WebGLRendererParameters();
        rendererParameters.antialias = true;
        renderer = new WebGLRenderer(rendererParameters);

        camera = new PerspectiveCamera(70, aspect, 1, 1000);
        camera.position.z = 400;

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
