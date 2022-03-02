package com.nowcoder.community.config;

public class SingleTon {
    /**
     * 饿汉式-线程安全
     */
//    private SingleTon(){}
//
//    private static final SingleTon instance = new SingleTon();
//
//    public SingleTon getInstance() {
//        return instance;
//    }

    /**
     * 懒汉式-线程不安全
     */

//    private SingleTon() {}
//
//    private static SingleTon instance;
//
//    public static SingleTon getInstance() {
//        if (instance == null) {
//            instance = new SingleTon();
//        }
//        return instance;
//    }

    /**
     * 懒汉式-线程安全
     */
//    private SingleTon() {}
//
//    private static SingleTon instance;
//
//    public synchronized static SingleTon getInstance() {
//        if (instance == null) {
//            instance = new SingleTon();
//        }
//        return instance;
//    }


    /**
     * 双重检查锁-线程安全
     */
    private SingleTon() {}

    public volatile static SingleTon instance;

    public static SingleTon getInstance() {
        if (instance == null) {
            synchronized (SingleTon.class) {
                if (instance == null) {
                    instance = new SingleTon();
                }
            }
        }
        return instance;
    }

    /**
     * 静态内部类实现单例-线程安全
     */
//    private SingleTon() {}
//
//    public static SingleTon getInstance() {
//        return InnerClass.INSTANCE;
//    }
//
//    private static class InnerClass {
//        private final static SingleTon INSTANCE = new SingleTon();
//    }

}

/**
 * 枚举实现单例
 */

enum Singleton{
    INSTANCE;
    public void doSomething(String str) {
        System.out.println(str);
    }
}