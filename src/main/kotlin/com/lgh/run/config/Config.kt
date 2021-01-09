package com.lgh.run.config

import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.context.annotation.ComponentScan
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@ComponentScan("com.lgh")
@EntityScan("com.lgh.entity")
@EnableJpaRepositories("com.lgh.repository")
class Config