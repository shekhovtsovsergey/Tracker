package com.shekhovtsov.tracker.component;


import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.shekhovtsov.tracker.model.IssueStatus;
import lombok.val;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

public class IssueStatusDeserializer extends StdDeserializer<IssueStatus> {

    public IssueStatusDeserializer() {
        super(IssueStatus.class);
    }

    @Override
    public IssueStatus deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        val statusValue = jsonParser.readValueAs(Map.class).get("current");

        return Arrays.stream(IssueStatus.values())
                .filter(status -> status.name().equals(statusValue))
                .findAny().orElse(null);
    }
}
