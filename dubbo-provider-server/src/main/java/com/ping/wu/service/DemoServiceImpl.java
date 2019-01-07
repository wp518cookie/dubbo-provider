package com.ping.wu.service;

import com.alibaba.dubbo.rpc.RpcException;
import com.ping.wu.api.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author wuping
 * @date 2019/1/3
 */
@Service
public class DemoServiceImpl implements DemoService {
    private static final Logger LOGGER = LoggerFactory.getLogger(DemoServiceImpl.class);
    @Override
    public void saySomething() {
        LOGGER.info("hello world!");
    }

    @Override
    public void reply(String msg) {
        LOGGER.info("hello " + msg);
    }

    @Override
    public String testMock() {
        throw new RpcException();
    }
}
