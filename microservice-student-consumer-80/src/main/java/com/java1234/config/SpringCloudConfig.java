package com.java1234.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.BestAvailableRule;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RetryRule;
/**
 * springCloud相关配置
 * @author anjun
 *
 */
@Configuration
public class SpringCloudConfig {
	@Bean
	@LoadBalanced  // 引入ribbon负载均衡
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
	/**
     * 自定义轮询算法
     * @return
     */
    @Bean
    public IRule myRule(){
    	//RetryRule
        return new BestAvailableRule();
    }
}
