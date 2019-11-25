package com.daviyang35.jmeter.processor;

import org.apache.jmeter.protocol.http.sampler.HTTPSamplerProxy;
import org.apache.jmeter.threads.JMeterContext;
import org.apache.jmeter.threads.JMeterContextService;
import org.apache.jmeter.threads.JMeterVariables;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Properties;

/**
 * JMeter BeanShell 前置脚本处理器
 *
 * @author davi
 */
public abstract class PreBeanShell {
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
     * 采样器实例
     */
    protected HTTPSamplerProxy sampler = new HTTPSamplerProxy();

    /**
     * 日志 org.apache.logging.slf4j.Log4jLogger
     */
    protected Logger log = LoggerFactory.getLogger(getClass());

    /**
     * 此方法的方法体为BeanShell脚本本体
     */
    public abstract void exec();
}
