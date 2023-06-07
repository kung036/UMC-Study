package com.example.umcstudy.noStop;

import org.junit.jupiter.api.Test;
import org.springframework.mock.env.MockEnvironment;
import static org.assertj.core.api.Assertions.assertThat;

class ProfileControllerTest {

    @Test
    public void active_profile이_없으면_default가_조회된다() {
        //given
        String expectedProfile = "default";
        MockEnvironment env = new MockEnvironment();
        ProfileController controller = new ProfileController(env);

        //when
        String profile = controller.profile();

        //then
        assertThat(profile).isEqualTo(expectedProfile);
    }
}