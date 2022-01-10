package com.zy.study02;

import java.net.URL;
import java.net.URLClassLoader;

/**
 * @Author: Zy
 * @Date: 2021/7/16 11:02
 */
public class UserDefinedClassLoaderTest extends URLClassLoader {

    public UserDefinedClassLoaderTest(URL[] urls) {
        // 自定义类加载器的逻辑


        super(urls);

    }
}
