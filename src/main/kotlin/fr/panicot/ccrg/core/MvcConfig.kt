package fr.panicot.ccrg.core

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry


/**
 * Created by William on 11/02/2017.
 */

@Configuration
open class MvcConfig : WebMvcConfigurerAdapter() {

    override fun addViewControllers(registry: ViewControllerRegistry) {
        registry.addViewController("/login").setViewName("login")
        registry.addViewController("/error").setViewName("forward:/login")
        registry.addViewController("/").setViewName("forward:/html/index.html")
    }

}