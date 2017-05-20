package com.jin.rocketmq.demo;

import org.apache.rocketmq.client.producer.DefaultMQProducer;

/**
 * Created by wujinqing on 17/5/19.
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("aa");
        DefaultMQProducer producer = new
                DefaultMQProducer("please_rename_unique_group_name");

    }
}
