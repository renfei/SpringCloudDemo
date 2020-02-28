//package net.renfei.gateway.config;
//
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.cloud.context.config.annotation.RefreshScope;
//import org.springframework.cloud.netflix.zuul.filters.ZuulProperties;
//import org.springframework.stereotype.Component;
//
///**
// * Zuul的配置实现动态从配置中心拉取
// *
// * @author RenFei
// */
//@Component
//public class ZuulConfig {
//    @RefreshScope
//    @ConfigurationProperties("zuul")
//    public ZuulProperties zuulProperties() {
//        return new ZuulProperties();
//    }
//}
