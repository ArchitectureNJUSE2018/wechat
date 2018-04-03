package cn.edu.nju;

import cn.edu.nju.Model.Message;

public interface EncryptService {
    Message encrypt(Message object);

    Message decrypt(Message object);
}
