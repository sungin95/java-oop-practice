package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatCode;

/**
- 비밀번호는 최소 8자 이상 12자 이하여야 한다.
- 비밀번호 8자 미만 또는 12자 초과인 경우 IllegalArgumentException 예외를 발생시킨다.
- 경계조건에 대해 테스트 코드를 작성해야 한다.
 */
public class PasswordValidatorTest {
    @DisplayName("비밀번호가 최소 8자 이상, 12자 이하면 예외가 발생하지 않는다.")
    @Test
    void validatePasswordTest() {
        assertThatCode(() -> PasswordValidator.validate("serverwizad"))
                .doesNotThrowAnyException();
    }

    @DisplayName("비밀번호가 8자 미만 또는 12자 초과하는 경우 IllegalArgumentException 예외가 발생")
    @ParameterizedTest // 링크 클릭하면 공식문서를 통해 다양한 활용법을 알 수 있다.
    @ValueSource(strings = {"aabbcce", "aabbccddeeffg"})
    void validatePasswordTest2(String password) {
        assertThatCode(() -> PasswordValidator.validate(password))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("비밀 번호는 최소 8자 이상 12자 이하여야 한다.");
    }
}
