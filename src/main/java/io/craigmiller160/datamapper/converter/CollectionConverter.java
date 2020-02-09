package io.craigmiller160.datamapper.converter;

import io.craigmiller160.datamapper.context.MappingContext;

public class CollectionConverter<S,D> implements Converter<S,D,MappingContext<S,D>> {

    @Override
    public void convert(final MappingContext<S, D> context) {
        throw new RuntimeException("Finish this");
    }

}
