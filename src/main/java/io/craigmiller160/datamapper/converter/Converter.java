package io.craigmiller160.datamapper.converter;

import io.craigmiller160.datamapper.context.MappingContext;

@FunctionalInterface
public interface Converter<S,D> {

    void convert(final MappingContext<S,D> context);

}
