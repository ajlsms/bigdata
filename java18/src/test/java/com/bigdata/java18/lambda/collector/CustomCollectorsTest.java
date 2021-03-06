package com.bigdata.java18.lambda.collector;

import com.bigdata.java18.collector.CustomCollectors;
import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class CustomCollectorsTest {

    private List<String> names = Lists.newArrayList("foo","1","bar","2","baz","3");

    @Test
    public void testOf() throws Exception {
       String expectedValue = "foo1bar2baz3";
       StringBuilder builder = names.stream().collect(CustomCollectors.of(StringBuilder::new, StringBuilder::append));
       assertThat(builder.toString(),is(expectedValue));
    }

    @Test(expected = RuntimeException.class)
    public void testOf_parallel() throws Exception {
        StringBuilder builder = names.stream().parallel().collect(CustomCollectors.of(StringBuilder::new, StringBuilder::append));
    }
}