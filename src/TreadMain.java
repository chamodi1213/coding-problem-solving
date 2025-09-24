public class TreadMain {

    public static void main(String[] args){
        MyRunnable1 myRunnable1 = new MyRunnable1();
        Thread t1 = new Thread(myRunnable1);
        t1.start();

//        try{
//            t1.join();
//        } catch (InterruptedException e){
//            System.out.println(e.getMessage());
//        }

        Runnable r = () -> {
            for(int i=0; i < 10 ; i++){
                System.out.println("Runnable r - " + i);
            }
        };

        Thread t2 = new Thread(r);
        t2.start();

        try{
            t2.join();
        } catch (InterruptedException e){
            System.out.println(e.getMessage());
        }

        for(int i=0; i < 10 ; i++){
            System.out.println("TreadMain - " + i);
        }
    }


}

/*
* @SprintBootApplication - @SprintBootConfiguration - @Configuration
                         - @EnableAutoConfiguration
                         - @ComponentScan
 * */


