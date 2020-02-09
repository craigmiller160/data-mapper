package io.craigmiller160.datamapper.converter;

import io.craigmiller160.datamapper.context.MappingContext;

public class ArrayConverter<S,D> implements Converter<S,D,MappingContext<S,D>> {

    @Override
    public void convert(final MappingContext<S, D> context) {
        throw new RuntimeException("Finish this");
    }

}
