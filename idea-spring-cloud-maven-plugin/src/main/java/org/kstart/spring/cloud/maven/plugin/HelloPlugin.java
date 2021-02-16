package org.kstart.spring.cloud.maven.plugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;

/**
 * @author jinlong2010@qq.com
 * @create 2021-02-15 20:46
 */
@Mojo(name = "hello", defaultPhase = LifecyclePhase.COMPILE)
public class HelloPlugin extends AbstractMojo {
    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        System.out.println("..................Hello World!!!.............");
    }
}
