package io.github.bckfnn;

import io.vertx.core.DeploymentOptions;
import io.vertx.core.Vertx;

public class Main {
    public static void main(String[] args) throws Exception {
        DeploymentOptions op = new DeploymentOptions().setIsolationGroup("xx");
        Vertx.vertx().deployVerticle("java:io.github.bckfnn.WebServer", op);
    }
}

