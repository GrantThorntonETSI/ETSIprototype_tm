package com.thorton.grant.uspto.prototypewebapp.config.host.bean.aws.stage;



import com.thorton.grant.uspto.prototypewebapp.config.host.bean.endPoint.HostBean;
import com.thorton.grant.uspto.prototypewebapp.config.host.bean.endPoint.ServerHostConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Profile("AWSstage")
@Configuration
@PropertySource("classpath:server-host-AWS-stage1.properties")
public class AWSstageHostConfig implements ServerHostConfig {




    @Value("${uspto.host}")
    private String host;

    @Value("${uspto.port}")
    private String port;


    @Override
    public String getServerHost() {
        return host;
    }

    @Override
    public String getServerPort() {
        return port;

    }

    @Override
    public String getServerBaseURL() {
        return host+":"+port;
    }


    @Bean
    public HostBean hostBean(){
        HostBean hostBean = new HostBean();

        hostBean.setHost(host);
        hostBean.setPort(port);
        System.out.println("!!!!!!!!!!!!!!!HostBean DI for AWS Stage Host!!!!!!!!!!!!!!!!!");
        return  hostBean;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties (){

        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();

        return  propertySourcesPlaceholderConfigurer;

    }


}
