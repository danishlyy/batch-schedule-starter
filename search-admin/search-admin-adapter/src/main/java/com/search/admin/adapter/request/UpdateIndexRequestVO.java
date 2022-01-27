package com.search.admin.adapter.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UpdateIndexRequestVO {

    /**
     * 索引的id
     */
    private String indexId;
    /**
     * 索引名称
     */
    private String indexName;
}
