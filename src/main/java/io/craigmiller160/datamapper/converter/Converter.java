package io.craigmiller160.datamapper.converter;

import io.craigmiller160.datamapper.context.MappingContext;

@FunctionalInterface
public interface Converter<S,D,CTX extends MappingContext<S,D>> {

    void convert(final CTX context);

}
