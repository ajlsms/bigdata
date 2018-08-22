package com.bigdata.java18.lambda.basic;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;

public class TestLambda {

   // @Test
    public void basicTest()throws IOException{

        String result = LambdaBasic.processFile((BufferedReader br) ->
                br.readLine() + br.readLine());
    }
}
