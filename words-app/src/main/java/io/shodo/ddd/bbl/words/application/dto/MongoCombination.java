package io.shodo.ddd.bbl.words.application.dto;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = MongoCombination.MONGO_COLLECTION_NAME)
public class MongoCombination {

    public static final String MONGO_COLLECTION_NAME = "combinations";
    public static final String MONGO_FIELD_FIRST_WORD = "first_word";
    public static final String MONGO_FIELD_SECOND_WORD = "second_word";

    @Field(MONGO_FIELD_FIRST_WORD)
    private MongoWord firstWord;

    @Field(MONGO_FIELD_SECOND_WORD)
    private MongoWord secondWord;

    public MongoWord getFirstWord() {
        return firstWord;
    }

    public void setFirstWord(MongoWord firstWord) {
        this.firstWord = firstWord;
    }

    public MongoWord getSecondWord() {
        return secondWord;
    }

    public void setSecondWord(MongoWord secondWord) {
        this.secondWord = secondWord;
    }
}
