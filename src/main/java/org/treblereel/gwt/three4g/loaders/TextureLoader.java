package org.treblereel.gwt.three4g.loaders;

import jsinterop.annotations.JsType;
import org.treblereel.gwt.three4g.loaders.managers.LoadingManager;
import org.treblereel.gwt.three4g.textures.Texture;

/**
 * Class for loading a texture. This uses the ImageLoader internally for loading files.
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 3/5/18.
 */
@JsType(isNative = true, namespace = "org.treblereel.gwt.three4g.loaders")
public class TextureLoader extends Loader<TextureLoader, Texture> {

    /**
     * Creates a new TextureLoader.
     */
    public TextureLoader() {

    }

    /**
     * Creates a new TextureLoader.
     * @param manager — The loadingManager for the loader to use. Default is DefaultLoadingManager.
     */
    public TextureLoader(LoadingManager manager) {

    }

/*    *//**
     * Begin loading from url and call onLoad with the response content.
     *
     * @param url — A string containing the path/URL of the file.
     *//*
    public native Texture load(String url);

    *//**
     * Begin loading from url and call onLoad with the response content.
     *
     * @param url — A string containing the path/URL of the file.
     * @param onLoad — A function to be called after loading is successfully completed. The function
     *     receives the loaded SVGDocument as an argument.
     *//*
    public native Texture load(String url, OnLoadCallback<Texture> onLoad);

    *//**
     * Begin loading from url and call onLoad with the response content.
     *
     * @param url — A string containing the path/URL of the file.
     * @param onLoad — A function to be called after loading is successfully completed. The function
     *     receives the loaded SVGDocument as an argument.
     * @param onProgress — A function to be called while the loading is in progress. The argument will
     *     be the XMLHttpRequest instance, which contains total and loaded bytes.
     *//*
    public native Texture load(String url, OnLoadCallback<Texture> onLoad, OnProgressCallback onProgress);

    *//**
     * Begin loading from url and call onLoad with the response content.
     *
     * @param url — A string containing the path/URL of the file.
     * @param onLoad — A function to be called after loading is successfully completed. The function
     *     receives the loaded SVGDocument as an argument.
     * @param onProgress — A function to be called while the loading is in progress. The argument will
     *     be the XMLHttpRequest instance, which contains total and loaded bytes.
     * @param onError — A function to be called if an error occurs during loading. The function
     *     receives the error as an argument.
     *//*
    public native Texture load(
            String url, OnLoadCallback<Texture> onLoad, OnProgressCallback onProgress, OnErrorCallback onError);*/
}
