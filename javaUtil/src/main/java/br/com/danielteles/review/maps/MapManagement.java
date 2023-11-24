package br.com.danielteles.review.maps;

import br.com.danielteles.review.collections.Management;
import br.com.danielteles.review.collections.factory.CollectionFactory;
import br.com.danielteles.review.collections.factory.enums.ETypes;

import java.lang.reflect.InvocationTargetException;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.util.Base64;
import java.util.Collection;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class MapManagement<T, Y> implements Management<Map<T, Y>> {

    public Map<T,Y> values;
    protected ETypes type;

    public MapManagement(ETypes type){
        this.type = type;
    }

    public void init(int count) {
        values = newGenericInstance();

        for(Integer i = 0 ; i < count; i++)
            values.put((T) i , (Y) Base64.getEncoder().encodeToString(Instant.now().toString().getBytes(StandardCharsets.UTF_8)));
    }

    @Override
    @SuppressWarnings("unchecked")
    public Map<T,Y> newGenericInstance() {
        return (Map<T,Y>) CollectionFactory.factory().getNewInstance(type);
    }

    @Override
    public void iterateValues() {

    }

    @Override
    public void iterateLambdaValues() {

    }

    @Override
    public void removeValues() {

    }

    @Override
    public void compareValues() {

    }
}
