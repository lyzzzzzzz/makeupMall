# 2019-03-24

1、新增com.lyz.makeupMall.controller下的全局异常捕获类：

`GlobalExceptionHandler.java`

2、新增com.lyz.makeupMall.component下的Component类：

```
ResultCode.java
SmsSend.java
```

3、新增UserController类下的函数：

```
Login(@RequestBody User loginUser)
Register(@RequestBody User loginUser)
RegisterCode(@RequestBody User loginUser)
```

4、新增IUserService接口以及其实现类UserServiceImpl下的函数：

```
selectUserByUserId(User user)
checkUserLoginpwd(User user)
registerUser(User user)
registerCode(User user)
```

5、新增UserMapper接口以及其映射文件UserMapper.xml下的函数：

```
selectUserByUserId(User user)
selectUserByUserPhone(User user);
insertUser(User user)
```

6、更新application.yml下的数据库密码，变为空

7、添加pom.xml下的新依赖：

```
<dependency>
  	<groupId>com.aliyun</groupId>
  	<artifactId>aliyun-java-sdk-core</artifactId>
  	<version>4.0.3</version>
</dependency>
```

# 2019-03-25

1、补全UserController类下的函数：

`registerCode(@RequestBody User loginUser)`

2、补全UserServiceImpl类下的函数：

`registerCode(User user)`

3、新增ResultCode类下的返回码：

```
REGISTERCODE_SUCCESS = "{\"code\":\"106\",\"msg\":\"发送成功\"}";
REGISTERCODE_ILLEGAL = "{\"code\":\"107\",\"msg\":\"无效号码\"}";
```

4、新增pom.xml下的JSON依赖：

```
<dependency>
    <groupId>com.fasterxml.jackson.core</groupId>
    <artifactId>jackson-databind</artifactId>
    <version>2.9.8</version>
</dependency>
```

5、完善发送短信验证码并保存流程

# 2019-03-26

1、完善登录、短信验证码注册流程，已可测试，新增验证码表phonecode：

```
CREATE TABLE phonecode (
phonecode_id INT UNSIGNED AUTO_INCREMENT,
phonecode_phone VARCHAR(20) NOT NULL,
phonecode_code INT UNSIGNED NOT NULL,
phonecode_time BIGINT UNSIGNED NOT NULL,
PRIMARY KEY ( phonecode_id )
);
```

2、新增个人信息修改以及个人信息查询流程
3、新增返回码：

```
PHONECODE_OVERTIME = "{\"code\":\"109\",\"msg\":\"验证码已失效\"}";
PHONECODE_NOT_EXIST = "{\"code\":\"110\",\"msg\":\"验证码不存在\"}";
```