package io.shodo.ddd.bbl.words.application.dto;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = CombinationDTO.MONGO_COLLECTION_NAME)
public class CombinationDTO {

    public static final String MONGO_COLLECTION_NAME = "combinations";
    public static final String MONGO_FIELD_FIRST_WORD = "first_word";
    public static final String MONGO_FIELD_SECOND_WORD = "second_word";

    @Field(MONGO_FIELD_FIRST_WORD)
    private WordDTO firstWord;

    @Field(MONGO_FIELD_SECOND_WORD)
    private WordDTO secondWord;

    public WordDTO getFirstWord() {
        return firstWord;
    }

    public void setFirstWord(WordDTO firstWord) {
        this.firstWord = firstWord;
    }

    public WordDTO getSecondWord() {
        return secondWord;
    }

    public void setSecondWord(WordDTO secondWord) {
        this.secondWord = secondWord;
    }
}
