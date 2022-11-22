

编译器源代码拷自[aamine/cbc: Cb (C flat) compiler. Cb is simplified C. (github.com)](https://github.com/aamine/cbc)。

引入https://github.com/javacc/javacc pom.xml

```xml
<dependencies>
    <!-- https://mvnrepository.com/artifact/net.java.dev.javacc/javacc -->
    <dependency>
        <groupId>net.java.dev.javacc</groupId>
        <artifactId>javacc</artifactId>
        <version>7.0.12</version>
    </dependency>
</dependencies>
```

使用javacc解析resource包下的parser.jj

```shell
javacc ~\how-to-develop-a-compiler\src\main\resources\Parser.jj
```

测试

```shell
compiler --help
```



```
compiler D:\JavaProject\individual\application\how-to-develop-a-compiler\src\main\resources\test\hello.cb -I D:\JavaProject\individual\application\how-to-develop-a-compiler\src\main\resources\import --print-asm
```



# 参考

《自制编译器》