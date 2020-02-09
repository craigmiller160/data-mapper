package io.craigmiller160.datamapper.context;

public class MappingContext<S,D> {

    private final S source;
    private final D destination;

    public MappingContext(final S source, final D destination) {
        this.source = source;
        this.destination = destination;
    }

    public S getSource() {
        return source;
    }

    public D getDestination() {
        return destination;
    }

}
