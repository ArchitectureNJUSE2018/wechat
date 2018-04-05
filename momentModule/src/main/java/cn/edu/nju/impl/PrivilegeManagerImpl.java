package cn.edu.nju.impl;

import cn.edu.nju.PrivilegeManageService;
import cn.edu.nju.model.Friend;
import org.springframework.stereotype.Service;

@Service
public class PrivilegeManagerImpl implements PrivilegeManageService {
    public boolean judgeFriends(Friend a, Friend b) {
        return false;
    }

    public boolean setPermissions() {
        return false;
    }
}
