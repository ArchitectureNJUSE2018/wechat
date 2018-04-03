package cn.edu.nju;

import cn.edu.nju.model.Friend;
import cn.edu.nju.model.Moment;

public interface PublishSubscribeService {
    void publish(Moment moment);

    void subscribe(Friend friend);

    void get(Friend friend);

    void getPersonal(Friend friend);
}
