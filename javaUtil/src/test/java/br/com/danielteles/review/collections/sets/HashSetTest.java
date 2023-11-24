package br.com.danielteles.review.collections.sets;

import br.com.danielteles.review.collections.TestCollection;
import br.com.danielteles.review.collections.factory.enums.ETypes;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import java.util.ArrayList;

/**
 * 16-02-2022
 * Verificando para HashSet
 * Set não é indexado (Bolsa de itens)
 * Apenas itens unicos e não garante a ordem de inserção
 * Rápido para verificações/ remoçoes
 * + memória ao iniciar
 */

@RunWith(BlockJUnit4ClassRunner.class)
public class HashSetTest extends TestCollection<ArrayList<String>> {
    @Override
    protected void setType() { type = ETypes.HASHSET;}
}
