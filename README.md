# jmeter-processor-bone
JMeter Processor bone. 

Easy to use IDE smart code completion function to develop various JMeter Java extension code. include:

方便使用IDE提供的代码提醒功能，开发JMeter各种扩展代码。包括如下几个类型:

- Assertion
- Listener
- Processor: Pre && Post
- Timer

```textmate
└── src
    ├── main
    │   ├── java
    │   │   └── com
    │   │       └── daviyang35
    │   │           └── jmeter
    │   │               ├── assertion
    │   │               │   ├── BeanShellAssertion.java
    │   │               │   └── JSR223Assertion.java
    │   │               ├── listener
    │   │               │   ├── BeanShellListener.java
    │   │               │   └── JSR223Listener.java
    │   │               ├── processor
    │   │               │   ├── PostBeanShell.java
    │   │               │   ├── PostJSR223Groovy.java
    │   │               │   ├── PreBeanShell.java
    │   │               │   └── PreJSR223Groovy.java
    │   │               └── timer
    │   │                   ├── BeanShellTimer.java
    │   │                   └── JSR223Timer.java
    │   └── resources
    └── test
        └── java
            └── TestSample.java

```
