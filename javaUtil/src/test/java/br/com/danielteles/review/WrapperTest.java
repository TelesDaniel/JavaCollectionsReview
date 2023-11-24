package br.com.danielteles.review;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * @since  14-02-2022
 * @apiNote  Verificando classes Wrapper(Embrulho) vs Primitivos
 * Autoboxing : Integer i = 1;
 * Boxing : Integer i = Integer.valueOf(1);
 * Unboxing : i.intValue()
 * */

@RunWith(BlockJUnit4ClassRunner.class)
public class WrapperTest {

    private int[] oprNumbers;
    private final int count = 1500000;

    private double calcDuration(long start){
        return ((System.nanoTime() - start) / Math.pow(10, 6));
    }

    @Before
    public void init() {
        oprNumbers = new int[count];
        for(int i = 0; i < count; i++)
            oprNumbers[i] = i;
    }

    @Test
    public void intTest() {
        int total = 1;
        long start = System.nanoTime();

        for(int i : oprNumbers)
            total = i * total;

        System.out.println("Ending intTest... Time: " + calcDuration(start));
    }

    @Test
    public void integerTest() {
        Integer total = 1; //Autoboxing
        long start = System.nanoTime();

        for(Integer i : oprNumbers)
            total = i * total;

        System.out.println("Ending integerTest... Time: " + calcDuration(start));

    }

    @Test
    public void longTest() {
        long total = 1;
        long start = System.nanoTime();

        for(Integer i : oprNumbers)
            total = i * total;

        System.out.println("Ending longTest... Time: " + calcDuration(start));
    }

    @Test
    public void longWrapperTest() {
        Long total = 1L; //Autoboxing
        long start = System.nanoTime();

        for(Integer i : oprNumbers)
            total = i * total;

        System.out.println("Ending longWrapperTest... Time: " + calcDuration(start));
    }

    @Before
    public void clean() {
        oprNumbers = new int[0];
    }
}
