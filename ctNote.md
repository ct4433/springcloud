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