package io.shodo.ddd.bbl.words.infrastructure.config.utils;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;

public final class DatabaseUtil {

    private DatabaseUtil() {
    }

    public static String toObjectIdHex(String value) {
        return String.format("%040x", new BigInteger(1, value.getBytes(StandardCharsets.UTF_8/*YOUR_CHARSET?*/)));
    }
}
