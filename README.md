# spring + springmvc + mybatis

搭建SSM框架

Spring值得我们深度学习

转载
http://blog.csdn.net/lxfHaHaHa/article/details/57078994?locationNum=5&fps=1

Spring原理

What-Where-When

AOP 和 IOC

AOP面向切面编程

点分离技术

切分业务逻辑功能，分别处理业务

Spring容器

https://zhuanlan.zhihu.com/p/29344811

1.读取Bean的配置信息
2.生成相应Bean的注册表，根据注册表，实例化Bean
3.把实例化的Bean存入Spring容器

Spring通过配置文件建立Bean与Bean之间的依赖关系
SpringIOC提供Bean实例的服务

SpringIOC容器 底层用BeanFactory、ApplicationContext 和 WebApplicationContext

### 容器启动原理
SpringIOC容器通过Tomcat的Servlet或Lisenter监听加载
SpringMVC容器通过DispatchServlet作为入口加载，Spring是SpringMVC的父容器

### 容器加载原理
1.BeanDefinitionReader读取Resource所指向的配置文件资源，然后解析配置文件。
配置文件中每一个<bean>解析成一个BeanDefinition对象，并保存到BeanDefinitionRegistry中
2.容器扫描BeanDefinitonRegistry中每一个BeanDefinition对象，调用InstantiationStaragy进行Bean实例化工作；
  调用BeanWrapper完成Bean属性的设置工作
3.单例缓存池：Spring在DefaultSingletonBeanRegistry类中提供一个用于缓存单实例Bean的缓存器，它是一个用HashMap实现的容器
  单实例的Bean以beanName保存在HashMap中
 
 深入理解springMVC思想
 https://www.cnblogs.com/baiduligang/p/4247164.html
