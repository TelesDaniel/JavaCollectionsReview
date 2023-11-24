package br.com.danielteles.review.collections.lists;

import br.com.danielteles.review.collections.factory.enums.ETypes;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import java.util.ArrayList;

/**
 * 14-02-2022
 * Verificando para ArrayList
 * Lista que utiliza Arrays internamente
 * Mais performático na iteração / busca por indice
 * Cria novo array sempre que o inicial não tem mais posições livres ou quando ocorre remoção, movendo todos os indices
 */

@RunWith(BlockJUnit4ClassRunner.class)
public class ArrayListTest extends TestList<ArrayList<String>> {
    @Override
    protected void setType() { type = ETypes.ARRAYLIST;}
}
