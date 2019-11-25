package com.daviyang35.jmeter.processor;

import org.apache.jmeter.protocol.http.sampler.HTTPSamplerProxy;
import org.apache.jmeter.threads.JMeterContext;
import org.apache.jmeter.threads.JMeterContextService;
import org.apache.jmeter.threads.JMeterVariables;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.PrintStream;
import java.util.Properties;

/**
 * JMeter JSR223 groovy 前置脚本处理器
 *
 * @author davi
 */
public abstract class PreJSR223Groovy {

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
     * 处理器的标签名称字符串
     */
    protected String Label = "";

    /**
     * 脚本文件名。如果是文件
     */
    protected String FileName = "";

    /**
     * 脚本所有参数字符串
     */
    protected String Parameters = "";

    /**
     * 脚本参数表，参数按空格拆分
     */
    protected String[] args = new String[]{};

    /**
     * System.out 的别名
     */
    protected PrintStream OUT = System.out;

    /**
     * 此方法的方法体为脚本本体
     */
    public abstract void exec();
}
