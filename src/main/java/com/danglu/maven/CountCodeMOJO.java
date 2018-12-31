package com.danglu.maven;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import java.util.List;

/**
 * @ClassName: CodoCountMOJO
 * @Description: TODO
 * @Author: Dang Lu
 * @Date: 2018/12/20 7:20
 * @Version: v1.0
 **/

@Mojo(name="countCode", defaultPhase = LifecyclePhase.PACKAGE)
public class CountCodeMOJO extends AbstractMojo {

    @Parameter
    private String msg;

    @Parameter
    private List<String> options;

    @Parameter(property = "testPara")
    private String testPara;


    public void execute() throws MojoExecutionException, MojoFailureException {
        System.out.println("======================================");
        System.out.println("This is dang lu's maven plugin test and its parameter is " + msg);
        System.out.println("This is a list: " + options);
        System.out.println("Passed in parameter: " + testPara);
        System.out.println("======================================");
    }
}
