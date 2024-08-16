package com.vivekt;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.List;
import java.util.Map;

public class MyCSVParserTest {
    @Test
    void When_CSVFileIsProvide_Expect_LoadedAsListOfMaps(){
        //Act
        MyCSVParser  myCSVParser = new MyCSVParser();
        File csv = new File("test1.csv");
        List<Map<String, String>> expected = List.of(
                Map.of("name", "vivek", "age", "46", "hobby", "tt"),
                Map.of("name", "neha", "age", "40", "hobby", "tv"));
        //Act
        List<Map<String, String>> actual = myCSVParser.parse(csv);

        //Assert
        Assertions.assertEquals(expected.get(0), actual.get(0));
    }
}
