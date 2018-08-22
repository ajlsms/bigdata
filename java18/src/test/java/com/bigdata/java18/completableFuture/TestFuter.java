package com.bigdata.java18.completableFuture;

import org.junit.jupiter.api.*;

import java.util.concurrent.CompletableFuture;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

//import static org.junit.jupiter.api.Assertions.assertEquals;
//https://www.ibm.com/developerworks/cn/java/j-cf-of-jdk8/index.html
public class TestFuter {


    @Test
    public void testComFuter(){
        CompletableFuture<String> cf = CompletableFuture.completedFuture("message");
        System.out.println(cf.isDone() +"----");
        System.out.println("message" + cf.getNow(null));
      //  assertEquals(2,2);
    }

    @Test
    static void runAsyncExample() {
        CompletableFuture<Void>cf = CompletableFuture.runAsync(() -> {
            assertTrue(Thread.currentThread().isDaemon());
            /*randomSleep();*/

        });
        assertFalse(cf.isDone());
        //sleepEnough();
        assertTrue(cf.isDone());
    }







}
