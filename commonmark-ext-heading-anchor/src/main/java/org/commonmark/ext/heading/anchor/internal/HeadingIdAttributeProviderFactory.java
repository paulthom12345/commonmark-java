package org.commonmark.ext.heading.anchor.internal;

import org.commonmark.html.AttributeProvider;
import org.commonmark.html.AttributeProviderFactory;

/**
 * Created by pathompson on 19/09/2016.
 */
public class HeadingIdAttributeProviderFactory implements AttributeProviderFactory {

    private HeadingIdAttributeProviderFactory() {
    }

    public static HeadingIdAttributeProviderFactory create() {
        return new HeadingIdAttributeProviderFactory();
    }

    @Override
    public AttributeProvider newInstance() {
        return HeadingIdAttributeProvider.create();
    }

}
