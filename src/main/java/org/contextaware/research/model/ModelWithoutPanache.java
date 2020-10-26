package org.contextaware.research.model;

import org.contextaware.research.ModelToAccess;
import org.contextaware.research.data.ModelToAccessSiblingPackage;

public class ModelWithoutPanache {
    public String idX;

    public void test() {
        this.idX = "Y";

        ModelToAccess samePackage = new ModelToAccess();
        samePackage.idX = "X";

        ModelToAccessSiblingPackage siblingPackage = new ModelToAccessSiblingPackage();
        siblingPackage.idX = "X";
    }
}