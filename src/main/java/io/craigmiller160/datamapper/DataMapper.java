package io.craigmiller160.datamapper;

import io.craigmiller160.datamapper.config.MapperConfiguration;

public class DataMapper {

    private final MapperConfiguration configuration;

    DataMapper(final MapperConfiguration configuration) {
        this.configuration = configuration;
    }

    public <S,D> D mapToType(final S source, final Class<D> destination) {
        throw new RuntimeException("Finish this");
    }

    public <S,D> void mapToInstance(final S source, final D destination) {
        throw new RuntimeException("Finish this");
    }

}
