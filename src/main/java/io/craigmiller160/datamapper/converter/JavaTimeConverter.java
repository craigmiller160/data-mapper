package io.craigmiller160.datamapper.converter;

import io.craigmiller160.datamapper.context.PropertyMappingContext;

public class JavaTimeConverter<S,D> implements PropertyConverter<S,D> {

    @Override
    public void convert(PropertyMappingContext<S, D> context) {
        throw new RuntimeException();
    }
}
