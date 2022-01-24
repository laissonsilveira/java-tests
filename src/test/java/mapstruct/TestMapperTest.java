package mapstruct;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TestMapperTest {

    @org.junit.Test
    public void shouldTestToTestDto() {
        Test test = new Test("Teste", "31.9506949314182233484805837029");
        TestDto testDto = TestMapper.INSTANCE.testToTestDto(test);

        assertNotNull(testDto);
        assertEquals("Teste", testDto.getName());
        assertEquals(31.950694931418223, testDto.getNumber(), 0);
    }

    @org.junit.Test
    public void shouldTestDtoToTest() {
        TestDto testDto = new TestDto("Teste", 31.9506949314182233484805837029);
        Test test = TestMapper.INSTANCE.testDtoToTest(testDto);

        assertNotNull(test);
        assertEquals("Teste", test.getName());
        assertEquals("31.95", test.getNumberString());
    }

}
