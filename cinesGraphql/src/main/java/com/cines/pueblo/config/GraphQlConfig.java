package com.cines.pueblo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.graphql.execution.RuntimeWiringConfigurer;

import graphql.scalars.ExtendedScalars;
import graphql.schema.GraphQLScalarType;

@Configuration
public class GraphQlConfig {
    @Bean
    public RuntimeWiringConfigurer runtimeWiringConfigurerDateTime() {
        return wiringBuilder -> wiringBuilder.scalar(ExtendedScalars.DateTime);
    }
    
    @Bean
    public RuntimeWiringConfigurer runtimeWiringConfigurerDate() {
        return wiringBuilder -> wiringBuilder.scalar(ExtendedScalars.Date);
    }
	
}