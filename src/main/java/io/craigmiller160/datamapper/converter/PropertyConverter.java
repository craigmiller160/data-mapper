package io.craigmiller160.datamapper.converter;

import io.craigmiller160.datamapper.context.PropertyMappingContext;

public interface PropertyConverter<S,D> extends Converter<S,D, PropertyMappingContext<S,D>> { }
