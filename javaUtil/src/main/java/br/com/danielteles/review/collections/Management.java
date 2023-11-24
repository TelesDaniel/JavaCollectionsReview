package br.com.danielteles.review.collections;

import java.util.Collection;

public interface Management<T> {

    void iterateValues();

    void iterateLambdaValues();

    void removeValues();

    void compareValues();

    T newGenericInstance();
}
