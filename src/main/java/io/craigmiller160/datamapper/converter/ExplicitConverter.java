package io.craigmiller160.datamapper.converter;

import io.craigmiller160.datamapper.context.MappingContext;

@FunctionalInterface
public interface ExplicitConverter<S,D> extends Converter<S,D, MappingContext<S,D>> { }
