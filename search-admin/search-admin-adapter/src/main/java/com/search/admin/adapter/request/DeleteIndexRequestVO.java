package com.search.admin.adapter.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class DeleteIndexRequestVO implements Serializable {

    /**
     * 索引id
     */
    private String indexId;
}
