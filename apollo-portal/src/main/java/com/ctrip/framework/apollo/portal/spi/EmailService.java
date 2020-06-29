package com.ctrip.framework.apollo.portal.spi;

import com.ctrip.framework.apollo.portal.entity.bo.Email;

/**
 * @author jys
 */
public interface EmailService {

    void send(Email email);

}
