package springConf;

import org.springframework.context.annotation.*;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

import javax.persistence.EntityManagerFactory;

@Configuration
public class SpringFactory {
    @Bean(name = "factory2") public EntityManagerFactory jpaFactory() {
        LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();
        factoryBean.setPersistenceXmlLocation("classpath:META-INF/persistence-2.xml");
        factoryBean.afterPropertiesSet();
        return factoryBean.getObject();
    }
}
