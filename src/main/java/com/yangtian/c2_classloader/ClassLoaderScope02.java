package main.java.com.yangtian.c2_classloader;

public class ClassLoaderScope02 {
    public static void main(String[] args) {
        //要加载的核心包的位置
        String bootPath = System.getProperty("sun.boot.class.path");
        System.out.println(bootPath.replaceAll(";",System.lineSeparator()));

        System.out.println("------------");
        //要加载的扩展包的位置
        String extPath = System.getProperty("java.ext.dirs");
        System.out.println(extPath.replaceAll(";",System.lineSeparator()));

        System.out.println("------------");
        //加载path下的class文件
        String appPath = System.getProperty("java.class.path");
        System.out.println(appPath.replaceAll(";",System.lineSeparator()));
    }
}
