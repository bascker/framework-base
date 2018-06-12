# README
## 简介
介绍主流框架的基础搭建，并附上基础操作案例，便于日后开发 or 学习时不用再查资料，进行基础环境的搭建.

## 约定
项目结构约定：以 maven 来组织项目, 每个案例以 module 形式存在.
```
framework-base
|- spring-framework             # 存放 spring 系列框架
    |- spring-mvc               # SpringMVC 环境搭建
    |- spring                   # spring 环境
|- restlet                      # restlet 框架
|- combination-framework        # 组合框架
    |- sr                       # spring & restlet
    |- ssm                      # spring & springmvc & mybatis
```