package com.zy.study11;

import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;
import com.zy.study10.MethodAreaTest;
import org.objenesis.ObjenesisStd;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Author: Zy
 * @Date: 2021/9/1 14:55
 * 测试对象创建的几种方法
 * 1.new
 * 1.1单例也算new的方式
 * 1.2建造者模式和工厂模式产生的对象都是new
 * 1.2.1StringBuilder
 * 1.2.2BeanFactory
 * 2.Class.newInstance
 * 3.Constructor.newInstance
 * 4.clone() 需实现clonable接口
 * 5.反序列化,可以从二进制流中反序列化出对象
 * 6.第三方库Objenesis
 */
public class ObjectCreateTest {

    static class ObjectCreate implements Cloneable, Serializable {
        private int x;
        private int y;

        public ObjectCreate(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public ObjectCreate() {
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, CloneNotSupportedException, IOException, ClassNotFoundException {
        //1. new
        ObjectCreate objectCreate = new ObjectCreate();
        System.out.println("new对象的内存地址: "+objectCreate);

        //2. Class.newInstance
        ObjectCreate objectCreate1 = ObjectCreate.class.newInstance();
        System.out.println("Class.newInstance对象的内存地址: "+objectCreate1);

        //3.Constructor.newInstance
        ObjectCreate objectCreate2 = ObjectCreate.class.getConstructor().newInstance();
        System.out.println("Constructor.newInstance对象的内存地址: "+objectCreate2);

        // 4.clone
        ObjectCreate clone = (ObjectCreate) objectCreate.clone();
        System.out.println("clone对象的内存地址: "+clone);

        // 5.反序列化
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new ObjectOutputStream(byteArrayOutputStream).writeObject(objectCreate);
        ObjectCreate unSerializable = (ObjectCreate) new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray())).readObject();
        System.out.println("反序列化对象的内存地址: "+unSerializable);

        // 6.第三方库 Objenesis
        ObjenesisStd objenesisStd = new ObjenesisStd();
        ObjectCreate objectCreate3 = objenesisStd.getInstantiatorOf(ObjectCreate.class).newInstance();
        System.out.println("Objenesis生成的内存地址: "+objectCreate3);

    }
}
