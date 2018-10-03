package com.perfree.multipledatasource.datasource;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * 配置test1数据源
 */
@Configuration// 扫描 Mapper 接口并容器管理
@MapperScan(basePackages = DataSource1Config.PACKAGE, sqlSessionFactoryRef = "test1SqlSessionFactory")
public class DataSource1Config {

    // 配置范围，精确到 test1 目录，以便跟其他数据源隔离
    static final String PACKAGE = "com.perfree.multipledatasource.mapper.test1";
    static final String MAPPER_LOCATION = "classpath:mapper/test1/*.xml";

    //下面这些@Value都是从application.properties读取设置好的数据源
    @Value("${test1.datasource.url}")
    private String url;

    @Value("${test1.datasource.username}")
    private String user;

    @Value("${test1.datasource.password}")
    private String password;

    @Value("${test1.datasource.driver-class-name}")
    private String driverClass;

    //Druid连接池
    @Bean(name = "test1DataSource")
    @Primary
    public DataSource test1DataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driverClass);
        dataSource.setUrl(url);
        dataSource.setUsername(user);
        dataSource.setPassword(password);
        return dataSource;
    }

    //TransactionManager
    @Bean(name = "test1TransactionManager")
    @Primary
    public DataSourceTransactionManager test1TransactionManager() {
        return new DataSourceTransactionManager(test1DataSource());
    }

    //SqlSessionFactory
    @Bean(name = "test1SqlSessionFactory")
    @Primary
    public SqlSessionFactory test1SqlSessionFactory(@Qualifier("test1DataSource") DataSource test1DataSource)
            throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(test1DataSource);
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(DataSource1Config.MAPPER_LOCATION));
        return sessionFactory.getObject();
    }
}