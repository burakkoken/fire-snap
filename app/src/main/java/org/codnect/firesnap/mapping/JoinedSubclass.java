package org.codnect.firesnap.mapping;

import org.codnect.firesnap.core.MetadataContext;

/**
 * Created by Burak Koken on 20.5.2018.
 *
 * @author Burak Koken
 */
public class JoinedSubclass extends Subclass {

    private Node node;

    public JoinedSubclass(MetadataContext metadataContext, PersistentClass superModel) {
        super(metadataContext, superModel);
    }

    @Override
    public boolean isNodeOwner() {
        return true;
    }

    @Override
    public void setNode(Node node) {
        this.node = node;
    }

    @Override
    public Node getNode() {
        return node;
    }

}
