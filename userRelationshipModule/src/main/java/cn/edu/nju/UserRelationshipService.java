package cn.edu.nju;

import cn.edu.nju.Model.Friend;
import cn.edu.nju.Model.FriendRequest;

import java.util.List;


public interface UserRelationshipService {
    void add(Friend friend);

    void acceptFriend(Friend friend);

    List<FriendRequest> friendRequests(Friend friend);

    boolean delete(Friend friend);

    List<Friend> viewFriend(Friend friend);
}
