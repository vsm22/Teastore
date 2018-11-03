package dazzledeer.teastore.inventoryservice.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.Properties;

@Component
public class DataBeans {

    @Bean
    @Autowired
    public LocalSessionFactoryBean localSessionFactoryBean(DataSource dataSource) {

        LocalSessionFactoryBean sfb = new LocalSessionFactoryBean();
        sfb.setDataSource(dataSource);
        sfb.setPackagesToScan("com.dazzledeer.teastore.inventoryservice.domain");
        Properties props = new Properties();
        props.setProperty("dialect", "org.hibernate.dialect.MySQLDialect");
        sfb.setHibernateProperties(props);
        return sfb;
    }
}
