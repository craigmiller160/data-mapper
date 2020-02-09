package io.craigmiller160.datamapper.converter;

import io.craigmiller160.datamapper.context.PropertyMappingContext;

public class PrimitiveConverter<S,D> implements PropertyConverter<S,D> {

    @Override
    public void convert(final PropertyMappingContext<S, D> context) {
        throw new RuntimeException("Finish this");
    }

}
