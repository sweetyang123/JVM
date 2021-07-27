package main.java.com.yangtian.bytecode;

/**
 * 0 aload_0
 * 1 invokespecial #1 <java/lang/Object.<init>>
 * 4 iinc 1 by 1
 * 7 return
 */
public class ByteCode04_VarIns {
    int i;
    public ByteCode04_VarIns(int i) {
        i++;
    }
}
