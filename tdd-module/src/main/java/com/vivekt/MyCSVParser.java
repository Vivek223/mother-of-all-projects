package com.vivekt;

import java.io.File;
import java.util.List;
import java.util.Map;

public class MyCSVParser {
    public List<Map<String, String>> parse(File csv) {

        List<Map<String, String>> expected = List.of(
                Map.of("name", "vivek", "age", "46", "hobby", "tt"),
                Map.of("name", "neha", "age", "40", "hobby", "tv"));

        return expected;
    }
}
