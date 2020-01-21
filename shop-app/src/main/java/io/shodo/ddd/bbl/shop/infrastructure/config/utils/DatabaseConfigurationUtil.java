package io.shodo.ddd.bbl.shop.infrastructure.config.utils;

import org.springframework.core.convert.converter.Converter;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.convert.*;
import org.springframework.data.mongodb.core.mapping.MongoMappingContext;

import java.util.ArrayList;
import java.util.List;

public final class DatabaseConfigurationUtil {

    private DatabaseConfigurationUtil() {
    }

    public static CustomConversions customConverters() {
        List<Converter<?, ?>> converters = new ArrayList<>();
        converters.add(JSR310DateConverters.DateToZonedDateTimeConverter.INSTANCE);
        converters.add(JSR310DateConverters.ZonedDateTimeToDateConverter.INSTANCE);
        converters.add(BigDecimalConverters.BigDecimalToDbObjectConverter.INSTANCE);
        converters.add(BigDecimalConverters.DbObjectToBigDecimalConverter.INSTANCE);
        return new CustomConversions(converters);
    }


    public static MongoConverter mongoConverters(MongoDbFactory mongoDbFactory) {
        MongoMappingContext mappingContext = new MongoMappingContext();
        DbRefResolver dbRefResolver = new DefaultDbRefResolver(mongoDbFactory);
        MappingMongoConverter mongoConverter = new MappingMongoConverter(dbRefResolver, mappingContext);
        mongoConverter.setCustomConversions(customConverters());
        return mongoConverter;
    }
}

