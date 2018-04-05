package cn.edu.nju.impl;

import cn.edu.nju.AuthorityManagementService;
import cn.edu.nju.ESBService;
import cn.edu.nju.LogAuditService;
import cn.edu.nju.SafetyManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.Oneway;

/**
 * @author hiki on 2018-04-05
 */

@Service
public class ESBServiceImpl implements ESBService {

    @Autowired
    private SafetyManagementService safetyManagementService;

    @Autowired
    private LogAuditService logAuditService;

    @Autowired
    private AuthorityManagementService authorityManagementService;

    @Override
    public void manageRequest() {

    }
}
