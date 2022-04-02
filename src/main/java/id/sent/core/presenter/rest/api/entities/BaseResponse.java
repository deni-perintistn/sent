package id.sent.core.presenter.rest.api.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BaseResponse<T, M> {
    @JsonProperty
    private final T data;
    @JsonProperty
    private final M metadata;

    public BaseResponse(T data, M metadata) {
        this.data = data;
        this.metadata = metadata;
    }
}
