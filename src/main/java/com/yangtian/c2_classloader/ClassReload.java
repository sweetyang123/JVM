package main.java.com.yangtian.c2_classloader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ClassReload {
    private static class MyLoader extends ClassLoader{
        @Override
        public Class<?> loadClass(String name) throws ClassNotFoundException {
            File f = new File("E:/code/mashibing/github/JVM/" + name.replace(".", "/").concat(".class"));
            if(!f.exists()) return super.loadClass(name);
            try {
                InputStream is = new FileInputStream(f);
                byte[] b = new byte[is.available()];
                is.read(b);
                return defineClass(name, b, 0, b.length);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return super.loadClass(name);
        }
    }

    public static void main(String[] args) throws ClassNotFoundException {
        MyLoader m = new MyLoader();
        Class clazz = m.loadClass("main.java.com.yangtian.c2_classloader.Hello");

        m = new MyLoader();
        Class clazzNew = m.loadClass("main.java.com.yangtian.c2_classloader.Hello");

        System.out.println(clazz == clazzNew);
    }
}
