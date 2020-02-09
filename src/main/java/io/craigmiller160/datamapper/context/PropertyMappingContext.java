package io.craigmiller160.datamapper.context;

public class PropertyMappingContext<S,D> extends MappingContext<S,D> {

    private final String propertyName;

    public PropertyMappingContext(S source, D destination, String propertyName) {
        super(source, destination);
        this.propertyName = propertyName;
    }

    public String getPropertyName() {
        return propertyName;
    }

}
