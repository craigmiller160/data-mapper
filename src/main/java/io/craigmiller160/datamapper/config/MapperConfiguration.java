package io.craigmiller160.datamapper.config;

import io.craigmiller160.datamapper.converter.ExplicitConverter;

import java.util.List;
import java.util.Map;

public class MapperConfiguration {

    // TODO maybe make this a map and tie the converter to the types being converted
    private final List<ExplicitConverter<?,?>> explicitConverters;
    private final Map<Class<?>,List<String>> propertyIgnoreMap;

    public MapperConfiguration(final List<ExplicitConverter<?,?>> explicitConverters,
                               final Map<Class<?>,List<String>> propertyIgnoreMap) {
        this.explicitConverters = explicitConverters;
        this.propertyIgnoreMap = propertyIgnoreMap;
    }

    public List<ExplicitConverter<?,?>> getExplicitConverters() {
        return explicitConverters;
    }

    public Map<Class<?>,List<String>> getPropertyIgnoreMap() {
        return propertyIgnoreMap;
    }

}
