package com.dto;

import lombok.Data;

/**
 * json格式的数据封装
 * @param <T>
 */
@Data
public class SimpleDataResult<T> {

    private boolean success;

    private T data;

    private String errorMsg;

    public SimpleDataResult(boolean success, T data) {
        this.success = success;
        this.data = data;
    }

    public SimpleDataResult(boolean success, String errorMsg) {
        this.success = success;
        this.errorMsg = errorMsg;
    }
}
