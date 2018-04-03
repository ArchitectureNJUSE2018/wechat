package cn.edu.nju;

import cn.edu.nju.Model.Message;

public interface MessageQueueService {
    Message pop();

    void Push(Message message);

    void distribute();
}
