package com.example.memcachedemo;

import org.junit.Test;

public class MemcacheToolTest {
    @Test
    public void test(){
        System.out.println(MemcacheTool.get("7758"));
        System.out.println(MemcacheTool.get("1234"));
    }
}
