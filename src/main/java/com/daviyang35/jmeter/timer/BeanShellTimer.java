package com.daviyang35.jmeter.timer;

import org.apache.jmeter.protocol.http.sampler.HTTPSampleResult;
import org.apache.jmeter.threads.JMeterContext;
import org.apache.jmeter.threads.JMeterContextService;
import org.apache.jmeter.threads.JMeterVariables;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Properties;

/**
 * @author davi
 */
public abstract class BeanShellTimer {
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
     * 日志
     */
    protected Logger log = LoggerFactory.getLogger(getClass());

    /**
     * 此方法的方法体为脚本本体。
     *
     * @return 返回值用作等待的毫秒数。
     */
    public abstract Long exec();
}
