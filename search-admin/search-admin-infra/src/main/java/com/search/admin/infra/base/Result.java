package com.search.admin.infra.base;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Result<T> {

    private String code;

    private String msg;

    private T data;

}
