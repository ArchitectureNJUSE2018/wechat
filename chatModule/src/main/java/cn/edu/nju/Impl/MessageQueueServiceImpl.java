package cn.edu.nju.Impl;

import cn.edu.nju.MessageQueueService;
import cn.edu.nju.Model.Message;
import org.springframework.stereotype.Service;

@Service
public class MessageQueueServiceImpl implements MessageQueueService {
    public Message pop() {
        return null;
    }

    public void Push(Message message) {

    }

    public void distribute() {

    }
}
