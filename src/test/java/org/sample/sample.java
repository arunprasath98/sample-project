package org.sample;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources"},glue= {"org.step"})
@CucumberOptions(features= {"src\\test\\resources"},glue= {"org.step"})

public class sample {
public static void main(String[] args) {
	System.out.println("maniplayboy");
}
}
