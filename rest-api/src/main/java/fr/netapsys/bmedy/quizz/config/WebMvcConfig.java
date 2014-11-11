package fr.netapsys.bmedy.quizz.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.ServletWebArgumentResolverAdapter;

import java.util.List;

/**
 * Created by medy on 11/11/14.
 */
@Configuration
@EnableWebMvc
public class WebMvcConfig extends WebMvcConfigurerAdapter {
	/*@Override
	public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
		argumentResolvers.add(resolver());
	}*/


	/*@Bean
	public ServletWebArgumentResolverAdapter resolver() {
		return new ServletWebArgumentResolverAdapter(pageable());
	}

	@Bean
	public PageableArgumentResolver pageable() {
		return new PageableArgumentResolver();
	}*/

	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		converters.add(converter());
	}

	@Bean
	public MappingJackson2HttpMessageConverter converter() {
		MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
		converter.setObjectMapper(mapper());
		return converter;
	}

	/**
	 * Provides the Jackson ObjectMapper with custom configuration for our JSON serialization.
	 * @return The Jackson object mapper with non-null serialization configured
	 */
	@Bean
	public ObjectMapper mapper() {
		return new ObjectMapper();
	}
}
