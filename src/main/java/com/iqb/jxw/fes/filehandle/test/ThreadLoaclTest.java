package com.iqb.jxw.fes.filehandle.test;

/**
 * Created by hdli on 2018-5-28.
 */
public class ThreadLoaclTest {
    public static void main(String[] args) {
        SequenceNumberRandom r = new SequenceNumberRandom();


        Client c1 = new Client(r);
        Client c2 = new Client(r);
        Client c3 = new Client(r);
        Client c4 = new Client(r);

        c1.start();
        c2.start();
        c3.start();
        c4.start();
    }
}

class SequenceNumberRandom {
//    private int n = 0;
    private  static  ThreadLocal<Integer> n = new ThreadLocal<Integer>(){
        public Integer initialValue(){
            return 0;
        }
    };

    public int getNextNum() {

        int m = n.get() + 1;

        n.set(m);
        return n.get();

//        return n++;
    }

}

class Client extends Thread {

    private SequenceNumberRandom r;

    public Client(SequenceNumberRandom r) {
        this.r = r;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " : "
                    + r.getNextNum());
        }

    }
}
