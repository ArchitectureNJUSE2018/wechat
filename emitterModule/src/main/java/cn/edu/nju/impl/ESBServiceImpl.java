package cn.edu.nju.impl;

import cn.edu.nju.AuthorityManagementService;
import cn.edu.nju.ESBService;
import cn.edu.nju.LogAuditService;
import cn.edu.nju.SafetyManagementService;

/**
 * @author hiki on 2018-04-05
 */

public class ESBServiceImpl implements ESBService {

    private SafetyManagementService safetyManagementService;

    private LogAuditService logAuditService;

    private AuthorityManagementService authorityManagementService;

    @Override
    public void manageRequest() {

    }
}
