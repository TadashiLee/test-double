package stub;


import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class GradeServiceTest {
    /* 需求描述：
    编写GradeService类的单元测试，单元测试calculateAverageGrades方法
    * */
    @Mock
    private GradeSystem mockGradeSystem;

    @InjectMocks
    private GradeService gradeService;

    @Test
    public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100() {
        //Assertions.assertEquals(90.0, result);
        long studentId = 1;
//        doReturn(Arrays.asList(80.0, 90.0, 100.0))
//                .when(mockGradeSystem).gradesFor(studentId);
        when(mockGradeSystem.gradesFor(studentId))
                .thenReturn(Arrays.asList(80.0, 90.0, 100.0));

        double result = gradeService.calculateAverageGrades(studentId);

        assertEquals(90.0, result);
    }
}
