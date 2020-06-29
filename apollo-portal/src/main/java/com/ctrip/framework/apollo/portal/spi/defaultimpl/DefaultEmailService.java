package com.ctrip.framework.apollo.portal.spi.defaultimpl;

import com.ctrip.framework.apollo.portal.entity.bo.Email;
import com.ctrip.framework.apollo.portal.spi.EmailService;

/**
 * @author jys
 */
public class DefaultEmailService implements EmailService {

    @Override
    public void send(Email email) {
        //do nothing
    }
}
