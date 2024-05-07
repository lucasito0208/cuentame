package es.alten.cuentame.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class CorsConfig {

  @Bean
  public FilterRegistrationBean<CorsFilter> corsFilterRegistrationBean() {

    UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();

    CorsConfiguration config = new CorsConfiguration();
    config.setAllowCredentials(true);
    List<String> exposes = new ArrayList<>();
    exposes.add("set-cookie");
    exposes.add("x-csrf-token");
    exposes.add("x-http-method");
    config.setExposedHeaders(exposes);
    config.addAllowedHeader("setcookie");
    config.addAllowedHeader("origin");
    config.addAllowedHeader("maxdataserviceversion");
    config.addAllowedHeader("x-csrf-token");
    config.addAllowedHeader("dataserviceversion");
    config.addAllowedHeader("accept-language");
    config.addAllowedHeader("x-httpmethod");
    config.addAllowedHeader("X-Requested-With");
    config.addAllowedHeader("Authorization");
    config.addAllowedHeader("Content-Type");
    config.addAllowedHeader("Accept");
    config.addAllowedHeader("uid");
    config.addAllowedHeader("jwt");
    config.addAllowedHeader("apikey");
    config.addAllowedHeader("apiCache");
    config.addAllowedMethod("POST");
    config.addAllowedMethod("PATCH");
    config.addAllowedMethod("GET");
    config.addAllowedMethod("DELETE");
    config.addAllowedMethod("PUT");
    config.addAllowedMethod("OPTIONS");
    config.addAllowedMethod("PATCH");
    source.registerCorsConfiguration("/**", config); // Global for all paths

    FilterRegistrationBean<CorsFilter> bean = new FilterRegistrationBean<>(new CorsFilter(source));
    bean.setOrder(Ordered.HIGHEST_PRECEDENCE);
    return bean;
  }
}
