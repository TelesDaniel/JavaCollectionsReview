package br.com.danielteles.review.collections.factory;

import br.com.danielteles.review.collections.factory.enums.ETypes;

import java.util.*;
import java.util.function.Supplier;

public class CollectionFactory {

    //TODO - mudar dps de string para algo generico
    Map<ETypes, Supplier<Collection<String>>> map = new EnumMap<>(ETypes.class);
    private static CollectionFactory factory;

    public static CollectionFactory factory() {
        if(factory == null)
            factory = new CollectionFactory();
        return factory;
    }

    private CollectionFactory() {
        map.put(ETypes.ARRAYLIST, ArrayList::new);
        map.put(ETypes.LINKEDLIST, LinkedList::new);
        map.put(ETypes.VECTOR, Vector::new);
        map.put(ETypes.HASHSET, HashSet::new);
    }

    public Collection<String> getNewInstance(ETypes type) {
        return map.containsKey(type) ? map.get(type).get() : null;
    }
}
