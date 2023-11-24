package br.com.danielteles.review.collections;

import br.com.danielteles.review.collections.factory.enums.ETypes;
import br.com.danielteles.review.collections.factory.CollectionFactory;

import java.lang.reflect.InvocationTargetException;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.util.Base64;
import java.util.Collection;
import java.util.Iterator;

public class CollectionsManagement<Y extends Collection<String>> implements Management<Y> {

    public Y values;
    protected ETypes type;

    public CollectionsManagement(ETypes type){
        this.type = type;
    }

    public void init(int count) {
        values = newGenericInstance();

        for(int i = 0 ; i < count; i++)
            values.add(Base64.getEncoder().encodeToString(Instant.now().toString().getBytes(StandardCharsets.UTF_8)));
    }

    public void iterateValues() {

        for(Iterator<String> it = values.iterator(); it.hasNext();){
            String v = it.next();
            v += "Iterate";
        }
    }

    public void iterateLambdaValues() {
        values.forEach(v -> v += "Iterate");
    }

    public void removeValues() {
        for(Iterator<String> it = values.iterator(); it.hasNext();){
            it.next();
            it.remove();
        }
    }

    public void compareValues() {
        for(String v : values){
            boolean result = values.contains(v);
        }
    }

    @SuppressWarnings("unchecked")
    public Y newGenericInstance() {
        return (Y) CollectionFactory.factory().getNewInstance(type);
    }
}
