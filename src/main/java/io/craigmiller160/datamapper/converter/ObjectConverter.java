package io.craigmiller160.datamapper.converter;

import io.craigmiller160.datamapper.context.MappingContext;

public class ObjectConverter<S,D> implements Converter<S,D,MappingContext<S,D>> {

    // TODO if the object types match (and it's not a special type like BigDecimal), then just set the value.
    // TODO otherwise, do the nested property mapping
    // TODO think about references with this approach

    @Override
    public void convert(MappingContext<S, D> context) {
        throw new RuntimeException("Finish this");
    }

}
