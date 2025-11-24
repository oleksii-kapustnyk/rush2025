package com.ua.rush.module2.lesson13;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main2 {

    public static void main(String[] args) throws InterruptedException {
//        Sum sum = new Sum(1, 2);
//        Sum sum2 = new Sum(3, 4);

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        List<Callable<Integer>> lc1 = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            lc1.add(new Sum(i, i + 1));
        }

        List<Future<Integer>> results = executorService.invokeAll(lc1);

        results.forEach(result -> {
            try {
                System.out.println(result.get());
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }
        });


//        Future<Integer> sum1Result = executorService.submit(sum);
//        Future<Integer> sum2Result = executorService.submit(sum2);

//        try {
//            System.out.println("before get result 1");
//            int r1 = sum1Result.get();
//            System.out.println("before get result 2");
//            int r2 = sum2Result.get();
//            System.out.println(r1 + " " + r2);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        } catch (ExecutionException e) {
//            throw new RuntimeException(e);
//        }
        System.out.println("before shutdown");
        executorService.shutdown();

    }
}
