集群注意事项：

7001 7002 7003 三个都要启动，才能正常运行

集群启动后进行 8081 8082 注册

注册成功后，启动80端口进行消费

全部正常运行后，7001 7002 7003 宕机2个不影响正常访问 8081 8082 宕机1个也不影响访问

网关部署在消费者里 gateway负责负载均衡

服务熔断：可以理解为对方法异常的处理
服务降级：可以理解为对服务器宕机的处理

*---------------------------------*

github 常用命令 *

echo "# myvueproject" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin git@github.com:ct4433/springboot.git
git push -u origin main

添加所有文件	git add .

*---------------------------------*

maven添加依赖，dependencies没有响应，可以先clean一下，看看有没有报错，若果有，先把报错解决了，再次clean，然后再添加依赖

feign就是在ribbon的基础上实现了面向接口编程，本质上还是ribbon，性能会降低

服务降级是在feign工程实现，接口在api工程里，当8081 8082 都宕机时，会进行服务降级，恢复任意一个服务，即可恢复

-----
bus总结

要加入注解    @ResponseBody 否则不能自动刷新

3355 是客户端 启动的配置文件要写在bootstrap.yml里面
其余配置可以写在git里，远程读取，远程的会覆盖本地的application.yml
bootstrap.yml
spring:
cloud:
config:
uri: http://localhost:3344
name: client
profile: dev
label: master

远程的配置文件可以写在一个目录下面
文件名 client.yml
第一部分 全局
第二部分 dev
第三部分 test

通过bootstrap.yml切换dev、test

---
STREAM

https://www.jianshu.com/p/f3611a94bf98

启动报错，如何解决

在application.yml spring 目录下，添加rabbitmq的配置

---
linux启动zipkin
docker run --name zipkin -d -p 9411:9411 openzipkin/zipkin

---
zipkin

docker里面的zipkin版本要和springcloud里面的版本一致

zipkin的dependencies中显示的事springcloud application name中定义的名字
所以要取相应的名字，否则依赖关系图会显示default