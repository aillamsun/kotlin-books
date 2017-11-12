package com.william.kt.hello.lambda;


import java.util.Arrays;
import java.util.List;

/**
 * Created by sungang on 2017/11/9.
 */
public class Java8LabdaTest {


    public static void main(String[] args) {
        List features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
        features.forEach(n -> System.out.println(n));
    }
}
