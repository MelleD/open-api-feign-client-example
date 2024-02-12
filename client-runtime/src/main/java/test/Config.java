package test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.security.oauth2.client.OAuth2ClientProperties;
import org.springframework.boot.autoconfigure.security.oauth2.client.OAuth2ClientPropertiesMapper;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.client.registration.InMemoryClientRegistrationRepository;

@Configuration
@EnableFeignClients( basePackageClasses = { test.client1.api.Users1ApiClient.class,
      test.client2.api.Users2ApiClient.class }, defaultConfiguration = org.springframework.cloud.openfeign.FeignClientsConfiguration.class )
@EnableConfigurationProperties( OAuth2ClientProperties.class )
public class Config {

   @Bean
   @ConditionalOnMissingBean( ClientRegistrationRepository.class )
   InMemoryClientRegistrationRepository clientRegistrationRepository( final OAuth2ClientProperties properties ) {
      final List<ClientRegistration> registrations = new ArrayList<>(
            new OAuth2ClientPropertiesMapper( properties ).asClientRegistrations().values() );
      return new InMemoryClientRegistrationRepository( registrations );
   }

}
