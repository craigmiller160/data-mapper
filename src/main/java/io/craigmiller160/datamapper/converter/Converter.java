package io.craigmiller160.datamapper.converter;

import io.craigmiller160.datamapper.context.MappingContext;

// TODO for public consumption, have a custom converter version of this that doesn't require the MappingContext type param

@FunctionalInterface
public interface Converter<S,D,CTX extends MappingContext<S,D>> {

    void convert(final CTX context);

}
