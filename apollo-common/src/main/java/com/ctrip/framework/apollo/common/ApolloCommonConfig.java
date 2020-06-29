package com.ctrip.framework.apollo.common;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author jys
 */
@EnableAutoConfiguration
@Configuration
@ComponentScan(basePackageClasses = ApolloCommonConfig.class)
public class ApolloCommonConfig {

}
