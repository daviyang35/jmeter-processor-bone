package com.daviyang35.jmeter.assertion;

import org.apache.jmeter.protocol.http.sampler.HTTPSampleResult;
import org.apache.jmeter.threads.JMeterContext;
import org.apache.jmeter.threads.JMeterContextService;
import org.apache.jmeter.threads.JMeterVariables;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Properties;

public abstract class BeanShellAssertion {
    /** ----------------------- 只读对象 ---------------------------- */
    /**
     * 采样结果集
     */
    protected HTTPSampleResult Response = new HTTPSampleResult();
    /**
     * 采样请求头
     */
    protected String RequestHeaders = "";
    /**
     * 采样Label标签
     */
    protected String SampleLabel = "";
    /**
     * 采样请求样本数据
     */
    protected String SamplerData = "";
    /**
     * 上下文
     */
    protected JMeterContext ctx = JMeterContextService.getContext();
    /** ----------------------- 只读对象 ---------------------------- */

    /** ----------------------- 可写对象 ---------------------------- */
    /**
     * 可写。设置为 true 断言失败
     */
    protected boolean Failure = false;

    /**
     * 可写。Failure 设置为 true 时，断言失败提示
     */
    protected String FailureMessage = "";

    /**
     * 可写。prev别名。
     */
    protected HTTPSampleResult SampleResult = new HTTPSampleResult();

    /**
     * 可写。SampleResult别名。
     */
    protected HTTPSampleResult prev = new HTTPSampleResult();

    /**
     * 当前线程变量，只能保存 String(put) 或者 Object(putObject)
     */
    protected JMeterVariables vars = new JMeterVariables();

    /**
     * 全局配置表，可以跨线程组使用
     */
    protected Properties props = new Properties();

    /**
     * 日志 org.apache.logging.slf4j.Log4jLogger
     */
    protected Logger log = LoggerFactory.getLogger(getClass());
    /** ----------------------- 可写对象 ---------------------------- */
}
