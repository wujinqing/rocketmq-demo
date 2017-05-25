package com.jin.rocketmq.demo01;

import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.common.RemotingHelper;
import org.apache.rocketmq.remoting.exception.RemotingException;

import java.io.UnsupportedEncodingException;

/**
 * Created by wujinqing on 17/5/21.
 */
public class MyProducer {
    public static void main(String[] args) throws MQClientException, UnsupportedEncodingException, RemotingException, InterruptedException, MQBrokerException {
        DefaultMQProducer producer = new DefaultMQProducer("my_first_producer_group");
        producer.setNamesrvAddr("localhost:9876");
        producer.start();

        Message message = new Message("FirstTopic", "FirstTag", "first message content".getBytes(RemotingHelper.DEFAULT_CHARSET));

        SendResult sendResult = producer.send(message);

        System.out.println("发送结果" + sendResult);

        producer.shutdown();
    }
}
