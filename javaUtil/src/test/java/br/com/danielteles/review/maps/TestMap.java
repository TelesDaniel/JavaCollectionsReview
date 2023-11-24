package br.com.danielteles.review.maps;

import br.com.danielteles.review.collections.CollectionsManagement;
import br.com.danielteles.review.collections.factory.enums.ETypes;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;
import java.util.Map;

public abstract class TestMap<T, Y> {

    protected MapManagement<String, Y> management;
    protected final int count = 150000;
    protected ETypes type;

    protected abstract void setType();

    @Before
    public void init() {
        setType();
        if(management == null)
            management = new MapManagement<>(type);

        System.out.println("Starting init ...");
        long start = System.nanoTime();

        management.init(count);

        System.out.println("Ending init Time: " + calcDuration(start));
    }

    @Test
    public void testComparingObject() {
        long start = System.nanoTime();
        management.compareValues();

        System.out.println(" Ending Comparing test... Time: " + calcDuration(start));
    }

    @Test
    public void testRemovingObject() {
        long start = System.nanoTime();
        management.removeValues();

        System.out.println(" Ending Removing test... Time: " + calcDuration(start));
    }

    @Test
    public void testIterationTime() {
        long start = System.nanoTime();

        management.iterateValues();

        System.out.println("Ending Iteration test... Time: " + calcDuration(start));
    }

    @Test
    public void testIterationLambdaTime() {
        long start = System.nanoTime();

        management.iterateLambdaValues();

        System.out.println("Ending Iteration lambda test... Time: " + calcDuration(start));
    }

    protected void setManagement(MapManagement<String, Y> management) {
        this.management = management;
    }

    protected double calcDuration(long start){
        return ((System.nanoTime() - start) / Math.pow(10, 6) / 1000);
    }
}
