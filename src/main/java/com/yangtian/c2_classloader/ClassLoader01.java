package main.java.com.yangtian.c2_classloader;

public class ClassLoader01 {
    public static void main(String[] args) {
        //null
        System.out.println(String.class.getClassLoader());
        //null
        System.out.println(sun.awt.HKSCS.class.getClassLoader());
        //sun.misc.Launcher$ExtClassLoader@7f31245a
        System.out.println(sun.net.spi.nameservice.dns.DNSNameService.class.getClassLoader());
        //sun.misc.Launcher$AppClassLoader@18b4aac2
        System.out.println(ClassLoader01.class.getClassLoader());
        //null
        System.out.println(sun.net.spi.nameservice.dns.DNSNameService.class.getClassLoader().getClass().getClassLoader());
        //null
        System.out.println(ClassLoader01.class.getClassLoader().getClass().getClassLoader());
        //sun.misc.Launcher$AppClassLoader@18b4aac2
        System.out.println(ClassLoader.getSystemClassLoader());
    }
}
