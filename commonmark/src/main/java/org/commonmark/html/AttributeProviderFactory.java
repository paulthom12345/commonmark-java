package org.commonmark.html;

/**
 * Extension point for adding/changing attributes on the primary HTML tag for a node.
 */
public interface AttributeProviderFactory {

     /**
     * Create an {@link AttributeProvider} to use to generate attribuetes for the tags in the HTML rendered document
      *
      * @return {@link AttributeProvider} to be used in the rending of the document
     */
    AttributeProvider newInstance();

}
