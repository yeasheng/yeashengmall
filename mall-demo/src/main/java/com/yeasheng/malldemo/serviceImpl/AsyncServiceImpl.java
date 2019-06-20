package com.yeasheng.malldemo.serviceImpl;

import com.yeasheng.malldemo.service.AsyncService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Desc:
 * @author: yansheng
 * @date: 2019/6/19
 */
@Service
public class AsyncServiceImpl implements AsyncService {
private static Logger logger = LoggerFactory.getLogger(AsyncServiceImpl.class);
	@Override
	@Async("asyncServiceExcutor")
	public void executeAsync() {
		logger.info("start executeAsync");
		try{
			Thread.sleep(1000);
		}catch(Exception e){
			e.printStackTrace();
		}
		logger.info("end executeAsync");
	}

}
