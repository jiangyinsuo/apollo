package com.ctrip.framework.apollo.portal.service;

import com.ctrip.framework.apollo.common.entity.App;

/**
 * @author jys
 */
public interface RoleInitializationService {

    public void initAppRoles(App app);

    public void initNamespaceRoles(String appId, String namespaceName, String operator);

    public void initNamespaceEnvRoles(String appId, String namespaceName, String operator);

    public void initNamespaceSpecificEnvRoles(String appId, String namespaceName, String env, String operator);

    public void initCreateAppRole();

    public void initManageAppMasterRole(String appId, String operator);

}
