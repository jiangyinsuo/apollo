package com.ctrip.framework.foundation.spi;

import com.ctrip.framework.foundation.spi.provider.Provider;

/**
 * @author jys
 */
public interface ProviderManager {
    public String getProperty(String name, String defaultValue);

    public <T extends Provider> T provider(Class<T> clazz);
}
