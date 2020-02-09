package io.craigmiller160.datamapper.converter;

import io.craigmiller160.datamapper.context.PropertyMappingContext;

public class DateConverter<S,D> implements PropertyConverter<S,D> {

    // TODO this one may not need to be generic

    @Override
    public void convert(PropertyMappingContext<S, D> context) {
        throw new RuntimeException();
    }
}
