package com.search.admin.adapter.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class CreateIndexRequestVO implements Serializable {

    /**
     * 索引名称
     */
    private String indexName;
}
