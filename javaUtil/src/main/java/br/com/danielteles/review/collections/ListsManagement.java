package br.com.danielteles.review.collections;

import br.com.danielteles.review.collections.CollectionsManagement;
import br.com.danielteles.review.collections.factory.enums.ETypes;

import java.util.*;

public class ListsManagement<T extends List<String>> extends CollectionsManagement<T> {

    public List<String> copy;

    public ListsManagement(ETypes type) {
        super(type);
    }

    @Override
   public void init(int count) {
        super.init(count);
        copy = new ArrayList<String>(values);
    }

    @Override
    public void iterateValues() {
        for(int i = 0; i < values.size(); i++){
            values.set(i, values.get(i) + "i");
        }
    }

    @Override
    public void iterateLambdaValues() {
        values.forEach(v -> v.concat(String.valueOf(1)));
    }

    public void listModifyAll() {
        for(int i = 0; i < copy.size(); i++){
            String v = copy.get(i);
            values.remove(v);
        }
    }

    public void compareAll() {
        for(int i = 0; i < copy.size(); i++){
            String v = copy.get(i);
            values.contains(v);
        }
    }

    /**
     *  objeto que criamos para encapsular uma função ou método. As classes anônimas facilitam um pouco a criação desses objetos.
     *  lambda, implementa a interface comparator
     */
    public void sortAll() {
        values.sort((o1, o2) -> o1.compareToIgnoreCase(o2));
    }

    public void operations() {
        Collections.reverse(values);
        Collections.shuffle(values);
        Collections.rotate(values, values.size());
        values.sort(null); // é colocado na ordem natual (má prática)
    }
}
