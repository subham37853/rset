package com.tcs.bfsi.rtes.ui.model;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.Id;
import javax.persistence.Index;

@Document("Errors")
public class ProcessError {
    @Id
    @Field(name = "id")
    @Indexed(unique = true)
    private long msgId;
    @Field(name ="parentId")
    private long parentMsgId;
    private String errorCode;
    private String errorDesc;
    private String message;
}
