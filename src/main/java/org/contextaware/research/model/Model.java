package org.contextaware.research.model;

import org.bson.codecs.pojo.annotations.BsonProperty;
import org.contextaware.research.ModelToAccess;
import org.contextaware.research.data.ModelToAccessSiblingPackage;

import io.quarkus.mongodb.panache.PanacheMongoEntity;

public class Model extends PanacheMongoEntity {
    @BsonProperty("idX")
    public String idX;

    public void test() {
        this.idX = "Y";

        ModelToAccess samePackage = new ModelToAccess();
        samePackage.idX = "X";

        ModelToAccessSiblingPackage siblingPackage = new ModelToAccessSiblingPackage();
        siblingPackage.idX = "X";
    }
}