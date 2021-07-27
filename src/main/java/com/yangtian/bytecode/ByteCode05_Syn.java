package main.java.com.yangtian.bytecode;

public class ByteCode05_Syn {
    synchronized void M(){
    }

    /**
     *  0 aload_0
     *  1 dup
     *  2 astore_1
     *  3 monitorenter
     *  4 aload_1
     *  5 monitorexit
     *  6 goto 14 (+8)
     *  9 astore_2
     * 10 aload_1
     * 11 monitorexit
     * 12 aload_2
     * 13 athrow
     * 14 return
     *
     * 两次monitorexit，在catch到异常时调用一次，正常结束再调用一次
     */
   void n(){
        synchronized (this){

        }
   }

    public static void main(String[] args) {

    }

}
