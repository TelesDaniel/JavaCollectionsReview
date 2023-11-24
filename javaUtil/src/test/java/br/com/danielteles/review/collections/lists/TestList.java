package br.com.danielteles.review.collections.lists;

import br.com.danielteles.review.collections.ListsManagement;
import br.com.danielteles.review.collections.TestCollection;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public abstract class TestList <T extends List<String>> extends TestCollection<T> {

    @Before
    @Override
    public void init() {
        setType();
        super.setManagement(new ListsManagement<>(type));
        super.init();
    }

    @Test
    public void testSortTime() {
        long start = System.nanoTime();

        ((ListsManagement<?>)management).sortAll();

        System.out.println("Ending Sort test... Time: " + calcDuration(start));
    }

    @Test
    public void testOprTime() {
        long start = System.nanoTime();
        ((ListsManagement<?>)management).operations();

        System.out.println("Ending operations test... Time: " + calcDuration(start));
    }
}
