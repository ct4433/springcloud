集群注意事项：

7001 7002 7003 三个都要启动，才能正常运行

集群启动后进行 8081 8082 注册

注册成功后，启动80端口进行消费

全部正常运行后，7001 7002 7003 宕机2个不影响正常访问 8081 8082 宕机1个也不影响访问

网关部署在消费者里 gateway负责负载均衡

*---------------------------------*

github 常用命令

echo "# myvueproject" >> README.md
git init
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin git@github.com:ct4433/springboot.git
git push -u origin main

添加所有文件	git add .

*---------------------------------*