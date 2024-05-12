/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package i.ogeyingbo.springboot.demoapp.config;

import  org.springframework.context.annotation.Bean;
import   org.springframework.context.annotation.Configuration;
import   com.dinstone.vertx.starter.EnableVertxWebServer; 
import io.vertx.core.DeploymentOptions;

/**
 *
 * @author BOLAJI-OGEYINGBO
 */
@Configuration
@EnableVertxWebServer
@EnableVertx
public class  AnotherConfiguration {

    // This verticle will be deployed automatically...
    @Bean
    @VerticleDeployment(ha = true, instances = 4)
    public AutoVerticle autoVerticle() { return new AutoVerticle(); }

    // ...but this one will not
    @Bean
    @VerticleDeployment(false)
    public ManualVerticle manualVerticle() { return new ManualVerticle(); }
    
  
     
    @Bean
    public VerticleRegistrationBean myVerticle() {
        
        DeploymentOptions options = new DeploymentOptions()
            .setHa(true)
            .setInstances(4);
        return new VerticleRegistrationBean(new MyVerticle())
            .setDeploymentOptions(options);
        
    }
    
    
    
}