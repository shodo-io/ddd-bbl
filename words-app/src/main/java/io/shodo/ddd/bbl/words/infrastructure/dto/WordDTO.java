package io.shodo.ddd.bbl.words.infrastructure.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;
import java.time.ZonedDateTime;

@Document(collection = WordDTO.MONGO_COLLECTION_NAME)
public class WordDTO implements Serializable {

    public static final String MONGO_COLLECTION_NAME = "words";
    public static final String MONGO_FIELD_CONTENT = "content";
    private static final String MONGO_FIELD_CREATION_DATE = "creation_date";

    @Id
    private String id;

    @Field(MONGO_FIELD_CONTENT)
    private String content;

    @Field(MONGO_FIELD_CREATION_DATE)
    private ZonedDateTime creationDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public ZonedDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(ZonedDateTime creationDate) {
        this.creationDate = creationDate;
    }
}
