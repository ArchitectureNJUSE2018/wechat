package cn.edu.nju.impl;

import cn.edu.nju.Model.Friend;
import cn.edu.nju.Model.FriendRequest;
import cn.edu.nju.UserRelationshipService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRelationshipServiceImpl implements UserRelationshipService{

    public void add(Friend friend) {

    }

    public void acceptFriend(Friend friend) {

    }

    public List<FriendRequest> friendRequests(Friend friend) {
        return null;
    }

    public boolean delete(Friend friend) {
        return false;
    }

    public List<Friend> viewFriend(Friend friend) {
        return null;
    }
}
