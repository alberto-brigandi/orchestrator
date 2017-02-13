package it.reply.orchestrator.config.persistence;

import it.reply.orchestrator.annotation.SpringDefaultProfile;
import it.reply.workflowmanager.spring.orchestrator.annotations.WorkflowPersistenceUnit;
import it.reply.workflowmanager.utils.Constants;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

import javax.sql.DataSource;

@Configuration
@SpringDefaultProfile
public class WorkflowPersistenceConfig {

  private static final Logger LOG = LoggerFactory.getLogger(WorkflowPersistenceConfig.class);

  @Bean
  @WorkflowPersistenceUnit
  public DataSource workflowDataSource() {
    JndiDataSourceLookup dataSourceLookup = new JndiDataSourceLookup();
    return dataSourceLookup.getDataSource("java:jboss/datasources/WorkflowManager/JBPM-DS");
  }

  /**
   * Create a {@Link LocalContainerEntityManagerFactoryBean} for the jbpm workflow.
   */
  @Bean
  @WorkflowPersistenceUnit
  public LocalContainerEntityManagerFactoryBean workflowEntityManagerFactory() {
    LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
    factory.setPersistenceUnitName(Constants.PERSISTENCE_UNIT_NAME);
    factory.setPersistenceXmlLocation("classpath:/META-INF/persistence.xml");
    factory.setJtaDataSource(workflowDataSource());
    // factory.afterPropertiesSet();
    // factory.setLoadTimeWeaver(new JBossLoadTimeWeaver());
    return factory;
  }
}