package apachecamel;

import apachecamel.dto.JSONDto;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.exc.UnrecognizedPropertyException;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertNotNull;

public class JsonDtoTest {

    @Test(expected = UnrecognizedPropertyException.class)
    public void givenJsonHasUnknownValues_whenDeserializing_thenException() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String jsonAsString = "{\"stringValue\":\"a\"," +
                "\"intValue\":1," +
                "\"booleanValue\":true," +
                "\"stringValue2\":\"something\"}";
        JSONDto readValue = mapper.readValue(jsonAsString, JSONDto.class);
        System.out.println(readValue);
        assertNotNull(readValue);
    }

}
