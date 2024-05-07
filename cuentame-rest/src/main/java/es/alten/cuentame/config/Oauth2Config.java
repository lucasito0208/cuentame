package es.alten.cuentame.config;

import es.alten.cuentame.security.CustomUserAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.provider.client.JdbcClientDetailsService;
import org.springframework.security.oauth2.provider.code.AuthorizationCodeServices;
import org.springframework.security.oauth2.provider.code.JdbcAuthorizationCodeServices;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JdbcTokenStore;

import javax.sql.DataSource;

@Configuration
public class Oauth2Config {

  private DataSource dataSource;
  private CustomUserAuthentication customUserAuthentication;

  @Autowired
  public void setDataSource(DataSource dataSource) {
    this.dataSource = dataSource;
  }

  @Autowired
  public void setCustomUserAuthentication(CustomUserAuthentication customUserAuthentication) {
    this.customUserAuthentication = customUserAuthentication;
  }

  @Autowired
  public void init(AuthenticationManagerBuilder auth) {
    auth.authenticationProvider(customUserAuthentication);
  }

  @Configuration
  @EnableWebSecurity
  public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
      return super.authenticationManagerBean();
    }
  }

  @Configuration
  @EnableAuthorizationServer
  public class AuthorizationConfig extends AuthorizationServerConfigurerAdapter {

    @Qualifier("authenticationManagerBean")
    private AuthenticationManager authenticationManager;

    @Autowired
    public void setAuthenticationManager(AuthenticationManager authenticationManager) {
      this.authenticationManager = authenticationManager;
    }

    @Bean
    public JdbcClientDetailsService clientDetailsService() {
      return new JdbcClientDetailsService(dataSource);
    }

    @Bean
    public TokenStore tokenStore() {
      return new JdbcTokenStore(dataSource);
    }

    @Bean
    public AuthorizationCodeServices authorizationCodeServices() {
      return new JdbcAuthorizationCodeServices(dataSource);
    }

    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
      clients.jdbc(dataSource);
    }

    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) {
      endpoints
          .authorizationCodeServices(authorizationCodeServices())
          .authenticationManager(authenticationManager)
          .tokenStore(tokenStore())
          .approvalStoreDisabled();
    }
  }

  @Configuration
  @EnableResourceServer
  public class ResourceConfig extends ResourceServerConfigurerAdapter {

    @Override
    public void configure(HttpSecurity http) throws Exception {
      http.authorizeRequests().anyRequest().permitAll();
    }
  }
}
