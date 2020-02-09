package io.craigmiller160.datamapper.converter;

import io.craigmiller160.datamapper.context.PropertyMappingContext;

public class BigNumberConverter<S,D> implements PropertyConverter<S,D> {

    // TODO BigInt and BigDecimal

    @Override
    public void convert(PropertyMappingContext<S, D> context) {
        throw new RuntimeException();
    }
}
