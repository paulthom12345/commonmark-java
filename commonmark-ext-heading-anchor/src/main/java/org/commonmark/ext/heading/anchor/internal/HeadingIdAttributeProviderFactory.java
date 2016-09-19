package org.commonmark.ext.heading.anchor.internal;

import org.commonmark.html.AttributeProvider;
import org.commonmark.html.AttributeProviderFactory;

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
