package io.bootique.shiro.demo;

import io.bootique.Bootique;
import io.bootique.di.BQModule;
import io.bootique.di.Binder;
import io.bootique.jersey.JerseyModule;
import io.bootique.shiro.demo.controller.LoginController;
import io.bootique.shiro.demo.controller.ShiroController;

public class Application implements BQModule {

    public static void main(String[] args) {
        Bootique
                .app(args)
                .autoLoadModules()
                .module(Application.class)
                .args("-s", "--config=classpath:bootique.yml")
                .exec()
                .exit();
    }

    @Override
    public void configure(Binder binder) {
        JerseyModule.extend(binder)
                .addResource(ShiroController.class)
                .addResource(LoginController.class);
    }
}
