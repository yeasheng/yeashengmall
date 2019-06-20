package com.yeasheng.malldemo.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Desc:
 * @author: yansheng
 * @date: 2019/6/19
 */
@Configuration
@EnableAsync
public class ExecutorConfig {
	private static Logger logger = LoggerFactory.getLogger(ExecutorConfig.class);

	@Bean
	public Executor asyncServiceExcutor (){
		logger.info("start  sysncServiseExcutor");
		ThreadPoolTaskExecutor excutor = new ThreadPoolTaskExecutor();
		//配置核心线程数
		excutor.setCorePoolSize(5);
		//配置最大线程数
		excutor.setMaxPoolSize(5);
		//配置队列大小
		excutor.setQueueCapacity(9999);
		//配置线程池中线程名称的前缀
		excutor.setThreadNamePrefix("async-service-");
		// rejection-policy：当pool已经达到max size的时候，如何处理新任务
		// CALLER_RUNS：不在新线程中执行任务，而是有调用者所在的线程来执行
		excutor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
		//执行初始化
		excutor.initialize();
		return excutor;
	}

}
