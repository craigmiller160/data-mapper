package io.craigmiller160.datamapper.converter;

import io.craigmiller160.datamapper.context.MappingContext;

public class ObjectConverter<S,D> implements Converter<S,D,MappingContext<S,D>> {

    @Override
    public void convert(MappingContext<S, D> context) {
        throw new RuntimeException("Finish this");
    }

}
