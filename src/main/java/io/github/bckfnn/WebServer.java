package io.github.bckfnn;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;
import io.vertx.ext.routematcher.RouteMatcher;

public class WebServer extends AbstractVerticle {
    @Override
    public void start(Future<Void> startFuture) {
        System.out.println(Thread.currentThread().getContextClassLoader());
        System.out.println(getClass().getClassLoader());

        RouteMatcher.routeMatcher();
    }
}

