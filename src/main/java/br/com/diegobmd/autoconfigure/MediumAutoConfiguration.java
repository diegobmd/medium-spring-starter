package br.com.diegobmd.autoconfigure;

import br.com.diegobmd.bean.MediumBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MediumAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public MediumBean mediumBean(){
        return new MediumBean("diegobmd");
    }

}
