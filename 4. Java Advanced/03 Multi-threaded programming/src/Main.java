public class Main {
    static boolean isFive = false;
    static boolean win = false;

    public static void main(String[] args) {
//        RunnableTimer runnableTimer = new RunnableTimer();
//        Thread timer = new Thread(runnableTimer);
//        timer.start();

//        Thread timer = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    for (int i = 0; i < 1000000; i++) {
//                        System.out.println(1);
//                        Thread.sleep(1000);
//                    }
//                } catch (Exception e) {
//
//                }
//
//            }
//        });
//
//        timer.start();
//
//        for (int i = 0; i < 1000000; i++) {
//            System.out.println(2);
//        }

//        Thread timer2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    for (int i = 0; i < 1000000; i++) {
//                        System.out.println(2);
//                        Thread.sleep(1000);
//                    }
//                } catch (Exception e) {
//
//                }
//
//            }
//        });
//
//        timer2.start();


        Thread timer = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    int i = 0;
                    while (true) {
                        if (i == 5) {
                            isFive = true;
                        }
                        System.out.println(i);
                        i++;
                        Thread.sleep(1000);
                    }
                } catch (Exception e) {

                }

            }
        });

        timer.start();

        Thread timer2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    int i = 0;
                    while (!isFive) {
                        System.out.println(i);
                        i++;
                        Thread.sleep(1000);
                    }
                } catch (Exception e) {

                }

            }
        });

        timer2.start();


        ////////////////////////////////////////////////////
        // Homework
        ////////////////////////////////////////////////////

        int random = (int) (Math.random() * 1000000000);
        System.out.println(random);

        Thread timer3 = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                try {
                    while (!win) {
                        System.out.println(i);
                        i++;
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {
                }
            }
        });

        Thread player = new Thread(new Runnable() {
            @Override
            public void run() {
                while (!win) {
                    int guessNumber = (int) (Math.random() * 1000000000);
                    if (guessNumber == random) {
                        win = true;
                        System.out.println(guessNumber);
                    }
                }
            }
        });
        timer3.start();
        player.start();

    }
}
