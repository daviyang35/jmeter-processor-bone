package com.daviyang35.jmeter.listener;

import org.apache.jmeter.protocol.http.sampler.HTTPSampleResult;
import org.apache.jmeter.samplers.SampleEvent;
import org.apache.jmeter.threads.JMeterContext;
import org.apache.jmeter.threads.JMeterContextService;
import org.apache.jmeter.threads.JMeterVariables;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Properties;

/**
 * @author davi
 */
public abstract class BeanShellListener {
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

    protected SampleEvent sampleEvent = new SampleEvent();

    /**
     * 采样结果集
     */
    protected HTTPSampleResult sampleResult = new HTTPSampleResult();

    /**
     * 采样结果集
     */
    protected HTTPSampleResult prev = new HTTPSampleResult();

    /**
     * 日志
     */
    protected Logger log = LoggerFactory.getLogger(getClass());

    /**
     * 此方法的方法体为BeanShell脚本本体
     */
    public abstract void exec();
}
