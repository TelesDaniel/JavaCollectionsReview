package br.com.danielteles.review.collections.lists;

import br.com.danielteles.review.collections.factory.enums.ETypes;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import java.util.LinkedList;

/**
 * 14-02-2022
 * Verificando para LinkedList
 * Lista duplamente encadeada
 * performática na edição da lista, adição e remoção de elementos
 * demorada na iteração
*/

@RunWith(BlockJUnit4ClassRunner.class)
public class LinkedTest extends TestList<LinkedList<String>> {
    @Override
    protected void setType() { type = ETypes.LINKEDLIST;}
}
