package com.jkb.fragment.rigger.annotation;

import android.app.Activity;
import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import com.jkb.fragment.rigger.rigger.Rigger;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation class that can only be used on {@link Activity} or {@link Fragment}, a
 * Activity/Fragment class that marked by this annotation can be rigged by {@link Rigger}.
 *
 * @author JingYeoh
 *         <a href="mailto:yangjing9611@foxmail.com">Email me</a>
 *         <a href="https://github.com/justkiddingbaby">Github</a>
 *         <a href="http://blog.justkiddingbaby.com">Blog</a>
 * @since Nov 18,2017
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Puppet {

  /**
   * Optional identifier of the container this fragment is
   * to be placed in.  If 0, it will not be placed in a container.
   */
  @IdRes
  int containerViewId() default 0;

  /**
   * Optional identifier for the Puppet.
   * The Puppet will be closed (Activity will be finished,Fragment will be removed) as the bondContainerView is true
   * when the puppet contain one Fragment(named PopFragment) and the PopFragment is closing.
   * The Puppet will show the ContentView as the container fragment is empty and the bondContainerView is false,
   * the Puppet will be closed.
   */
  boolean bondContainerView() default false;
}
