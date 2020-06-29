package com.ctrip.framework.apollo.portal.api;


import com.ctrip.framework.apollo.portal.component.RetryableRestTemplate;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author jys
 */
public abstract class API {

    @Autowired
    protected RetryableRestTemplate restTemplate;

}
