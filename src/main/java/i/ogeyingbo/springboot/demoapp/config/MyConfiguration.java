/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package i.ogeyingbo.springboot.demoapp.config;

import   org.springframework.context.annotation.Configuration;
import  com.dinstone.vertx.starter.EnableVertx;

/**
 *
 * @author BOLAJI-OGEYINGBO
 */
@Configuration
@EnableVertx(deployVerticles = false)
public class MyConfiguration implements VertxConfigurer {

    @Override
    public void configure(SpringVertx.Builder builder) {
        
        builder
            // Register a custom Verticle for deployment
            .verticle(new MyVerticle())
            // Modify the VertxOptions
            .options(opt -> opt.setClustered(true));
    }
}