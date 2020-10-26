package org.contextaware.research;

import org.contextaware.research.data.ModelToAccessSiblingPackage;
import org.contextaware.research.model.Model;
import org.contextaware.research.model.ModelWithoutPanache;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class ExampleResourceTest {

    @Test
    public void testHelloEndpoint() {
        // Works
        ModelToAccess samePackage = new ModelToAccess();
        samePackage.idX = "X";

        // Works too
        Model model = new Model();
        model.test();

        // Works too
        ModelWithoutPanache modelWithoutPanache = new ModelWithoutPanache();
        modelWithoutPanache.idX = "X";
        //modelWithoutPanache.test(); //if uncommented we have the Problem in the test()-operation: tried to access protected field org.contextaware.research.ModelToAccess.idX

        // Error : tried to access protected field org.contextaware.research.model.Model.idX
        model.idX = "X";
    }

}