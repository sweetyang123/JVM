package main.java.com.yangtian.c2_classloader;

public class ParentAndChild03 {
    public static void main(String[] args) {
        System.out.println(ParentAndChild03.class.getClassLoader());
        System.out.println(ParentAndChild03.class.getClassLoader().getClass().getClassLoader());
        System.out.println(ParentAndChild03.class.getClassLoader().getParent());
        System.out.println(ParentAndChild03.class.getClassLoader().getParent().getParent());
    }
}
