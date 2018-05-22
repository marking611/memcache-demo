package com.example.memcachedemo;

import net.spy.memcached.MemcachedClient;

import java.io.IOException;
import java.net.InetSocketAddress;

public class MemcacheTool {
    private static String host = "127.0.0.1";
    private static int port = 11211;
    private static MemcachedClient client;

    static {
        try {
            client = new MemcachedClient(new InetSocketAddress(host,port));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void set(String key,Object value){
        client.set(key,0,value);
    }

    public static Object get(String key){
        return client.get(key);
    }

}
