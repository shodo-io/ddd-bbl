package io.shodo.ddd.bbl.words.infrastructure.dbmigrations;

import com.github.mongobee.changeset.ChangeLog;
import com.github.mongobee.changeset.ChangeSet;
import io.shodo.ddd.bbl.words.application.dto.MongoWord;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@ChangeLog(order = "001")
public class ChangeSet001Words {

    @ChangeSet(order = "01", author = "sch", id = "01-words")
    public void addProducts(MongoTemplate mongoTemplate) throws IOException, URISyntaxException {
        final URI uri = getClass().getClassLoader().getResource("words.txt").toURI();
        try (Stream<String> stream = Files.lines(Paths.get(uri))) {
            List<MongoWord> words = new ArrayList<>();
            List<String> fileWords = stream.collect(Collectors.toList());
            for(int i = 0; i < fileWords.size(); i++) {
                final MongoWord mongoWord = new MongoWord();
                mongoWord.setId(String.valueOf(i));
                mongoWord.setContent(fileWords.get(i));
                mongoWord.setCreationDate(ZonedDateTime.of(1970, 1, 1, 0, 0,
                        0, 0, ZoneId.systemDefault()).plusDays(i));
                words.add(mongoWord);
            };
            mongoTemplate.insert(words, MongoWord.MONGO_COLLECTION_NAME);
        }
    }
}
