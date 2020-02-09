package io.craigmiller160.datamapper;

import io.craigmiller160.datamapper.config.MapperConfiguration;
import io.craigmiller160.datamapper.converter.Converter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataMapperBuilder {

    private List<Converter<?,?>> explicitConverters = new ArrayList<>();
    private Map<Class<?>,List<String>> propertyIgnoreMap = new HashMap<>();

    public DataMapper build() {
        final MapperConfiguration configuration = new MapperConfiguration(explicitConverters, propertyIgnoreMap);
        return new DataMapper(configuration);
    }

    public DataMapperBuilder addExplicitConverter(final Converter<?,?> converter) {
        explicitConverters.add(converter);
        return this;
    }

    public DataMapperBuilder addPropertyIgnore(final Class<?> sourceType, final String propertyName) {
        final List<String> propIgnoreList = propertyIgnoreMap.getOrDefault(sourceType, new ArrayList<>());
        propIgnoreList.add(propertyName);
        return this;
    }

}
