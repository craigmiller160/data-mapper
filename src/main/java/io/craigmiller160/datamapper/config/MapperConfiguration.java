package io.craigmiller160.datamapper.config;

import io.craigmiller160.datamapper.converter.Converter;

import java.util.List;
import java.util.Map;

public class MapperConfiguration {

    private final List<Converter> explicitConverters;
    private final Map<Class<?>,List<String>> propertyIgnoreMap;

    public MapperConfiguration(final List<Converter> explicitConverters,
                               final Map<Class<?>,List<String>> propertyIgnoreMap) {
        this.explicitConverters = explicitConverters;
        this.propertyIgnoreMap = propertyIgnoreMap;
    }

    public List<Converter> getExplicitConverters() {
        return explicitConverters;
    }

    public Map<Class<?>,List<String>> getPropertyIgnoreMap() {
        return propertyIgnoreMap;
    }

}
