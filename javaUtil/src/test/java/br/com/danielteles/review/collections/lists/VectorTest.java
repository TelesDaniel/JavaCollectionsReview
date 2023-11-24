package br.com.danielteles.review.collections.lists;

import br.com.danielteles.review.collections.factory.enums.ETypes;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import java.util.Vector;

/**
 * 14-02-2022
 * Verificando para Vector
 * Internamente se comporta como um ArrayList (Legado)
 * Utilizado especificamente em concorrência
 * É Thread-Safe
 */

@RunWith(BlockJUnit4ClassRunner.class)
public class VectorTest extends TestList<Vector<String>> {
    @Override
    protected void setType() { type = ETypes.VECTOR;}
}
