import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class JUnitTest {
    @DisplayName("1 + 2는 3이다")
    @Test
    public void junitTet() {
        int a = 1;
        int b = 2;
        int sum = 3;

        //Assertions.assertEquals(sum, a + b);
        assertThat(a+b).isEqualTo(sum);
    }

    // AssertJ 는 JUnit 과 함께 사용하여 검증문의 가독성을 높여주는 라이브러리 입니다
    // 기대 값과 비교값이 잘 구분되지 않는 Assertion
    // Assertions.assertEquals(sum, a + b);
    // assertThat(a+b).isEqualTo(sum)

}
