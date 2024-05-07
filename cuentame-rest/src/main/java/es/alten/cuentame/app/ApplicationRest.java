package es.alten.cuentame.app;

import com.zaxxer.hikari.HikariDataSource;
import es.alten.cuentame.web.i18n.CustomReloadableResourceBundleMessageSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.http.converter.BufferedImageHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import javax.annotation.PostConstruct;
import javax.servlet.MultipartConfigElement;
import javax.sql.DataSource;
import java.awt.image.BufferedImage;
import java.util.Locale;
import java.util.TimeZone;

@SpringBootApplication
@EntityScan("es.alten.cuentame.domain")
@EnableJpaRepositories("es.alten.cuentame.dao")
@ComponentScan({
  "es.alten.cuentame.rest",
  "es.alten.cuentame.controller",
  "es.alten.cuentame.bo",
  "es.alten.cuentame.config",
  "es.alten.cuentame.security",
  "es.alten.cuentame.dao"
})
@EnableScheduling
@EnableSpringDataWebSupport
@EnableAsync
public class ApplicationRest extends SpringBootServletInitializer {
  public static void main(final String[] args) {
    SpringApplication.run(ApplicationRest.class);
  }

  @Bean
  @Primary
  @ConfigurationProperties("spring.datasource")
  public DataSource dataSource() {
    return DataSourceBuilder.create().build();
  }

  @Bean
  @ConfigurationProperties("spring.datasource")
  public HikariDataSource dataSource(DataSourceProperties properties) {
    return properties.initializeDataSourceBuilder().type(HikariDataSource.class).build();
  }

  @Bean
  public PasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
  }

  @Bean
  public MultipartConfigElement multipartConfigElement() {
    return new MultipartConfigElement("");
  }

  @Bean(name = "multipartResolver")
  public StandardServletMultipartResolver multipartResolver() {
    return new StandardServletMultipartResolver();
  }

  @Bean(name = "messageSource")
  public MessageSource messageSource() {
    CustomReloadableResourceBundleMessageSource messageSource =
        new CustomReloadableResourceBundleMessageSource();
    messageSource.setBasename("classpath:/i18n/messages");
    messageSource.setCacheSeconds(-1);
    messageSource.setLocaleResolver(localeResolver());
    return messageSource;
  }

  @Bean
  public LocalValidatorFactoryBean validator(MessageSource messageSource) {
    LocalValidatorFactoryBean bean = new LocalValidatorFactoryBean();
    bean.setValidationMessageSource(messageSource);
    return bean;
  }

  @Bean(name = "localeResolver")
  public LocaleResolver localeResolver() {
    return new SessionLocaleResolver();
  }

  @Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
    return builder.sources(ApplicationRest.class);
  }

  @PostConstruct
  void started() {
    TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
    Locale.setDefault(new Locale("en"));
  }

  @Bean
  public HttpMessageConverter<BufferedImage> bufferedImageHttpMessageConverter() {
    return new BufferedImageHttpMessageConverter();
  }
}
