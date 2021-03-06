package org.codnect.firesnap.binder;

import org.codnect.firesnap.core.MetadataContext;
import org.codnect.firesnap.core.ModelNodeReference;
import org.codnect.firesnap.mapping.Node;

/**
 * Created by Burak Koken on 29.9.2018.
 *
 * @author Burak Koken
 */
public class NodeBinder {

    public static Node bindNode(String nodeName,
                                ModelNodeReference superModelNodeReference,
                                boolean isAbstract,
                                MetadataContext metadataContext) {

        Node node;
        if(superModelNodeReference != null) {
            node = metadataContext.getMetadataCollector().addDenormalizedNode(nodeName, superModelNodeReference.getNode());
        } else {
            node = metadataContext.getMetadataCollector().addNode(nodeName);
        }
        node.setAbstract(isAbstract);
        return node;
    }

}
