package org.gwtproject.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 10/18/20
 */
@Retention(RUNTIME)
@Target(METHOD)
public @interface GwtEntryPoint {

}
