package pl.edu.agh.mwo;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import pl.edu.agh.mwo.model.PitStop;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JsonParser {





    public List<PitStop> readJson () throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(
                DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        File file = new File("src/main/resources/pitstops-data.json");
        List<PitStop> pitstops=objectMapper.readValue(file,new TypeReference<List<PitStop>>() {});
        return pitstops;
    }


}
