package mapstruct;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TestMapper {

    TestMapper INSTANCE = Mappers.getMapper(TestMapper.class);

    @Mapping(source = "numberString", target = "number", numberFormat = "#,###,##0.00")
    TestDto testToTestDto(Test test);

    @Mapping(source = "number", target = "numberString", numberFormat = "#,###,##0.00")
    Test testDtoToTest(TestDto test);

}