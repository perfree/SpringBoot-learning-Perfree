package com.perfree.multipledatasource.datasource;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * Test2数据源配置
 */
@Configuration
// 扫描 Mapper 接口并容器管理
@MapperScan(basePackages = DataSource2Config.PACKAGE, sqlSessionFactoryRef = "test2SqlSessionFactory")
public class DataSource2Config {

    // 配置范围，精确到 test2 目录，以便跟其他数据源隔离
    static final String PACKAGE = "com.perfree.multipledatasource.mapper.test2";
    static final String MAPPER_LOCATION = "classpath:mapper/test2/*.xml";

    //下面这些@Value都是从application.properties读取设置好的数据源
    @Value("${test2.datasource.url}")
    private String url;

    @Value("${test2.datasource.username}")
    private String user;

    @Value("${test2.datasource.password}")
    private String password;

    @Value("${test2.datasource.driver-class-name}")
    private String driverClass;

    //Druid连接池
    @Bean(name = "test2DataSource")
    public DataSource test2DataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driverClass);
        dataSource.setUrl(url);
        dataSource.setUsername(user);
        dataSource.setPassword(password);
        return dataSource;
    }

    //TransactionManager
    @Bean(name = "test2TransactionManager")
    public DataSourceTransactionManager test2TransactionManager() {
        return new DataSourceTransactionManager(test2DataSource());
    }

    //SqlSessionFactory
    @Bean(name = "test2SqlSessionFactory")
    public SqlSessionFactory test2SqlSessionFactory(@Qualifier("test2DataSource") DataSource test2DataSource)
            throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(test2DataSource);
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources(DataSource2Config.MAPPER_LOCATION));
        return sessionFactory.getObject();
    }
}