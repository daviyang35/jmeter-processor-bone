package com.daviyang35.jmeter.processor;

import org.apache.jmeter.protocol.http.sampler.HTTPSampleResult;
import org.apache.jmeter.threads.JMeterContext;
import org.apache.jmeter.threads.JMeterContextService;
import org.apache.jmeter.threads.JMeterVariables;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Properties;

/**
 * JMeter BeanShell 后置脚本处理器
 *
 * @author davi
 */
public abstract class PostBeanShell {
    /**
     * 上下文
     */
    protected JMeterContext ctx = JMeterContextService.getContext();

    /**
     * 当前线程变量，只能保存 String(put) 或者 Object(putObject)
     */
    protected JMeterVariables vars = new JMeterVariables();

    /**
     * 全局配置表，可以跨线程组使用
     */
    protected Properties props = new Properties();

    /**
     * 采样结果集
     */
    protected HTTPSampleResult prev = new HTTPSampleResult();

    /**
     * 服务器响应内容
     */
    protected byte[] data = new byte[1];

    /**
     * 日志
     */
    protected Logger log = LoggerFactory.getLogger(getClass());

    /**
     * 此方法的方法体为BeanShell脚本本体
     */
    public abstract void exec();
}
