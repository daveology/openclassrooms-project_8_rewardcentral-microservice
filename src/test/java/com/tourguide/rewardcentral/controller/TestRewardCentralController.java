package com.tourguide.rewardcentral.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import java.util.UUID;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class TestRewardCentralController {

    @Autowired
    private MockMvc mock;

    @Test
    public void shouldAccessRewardsPoints() throws Exception {

        mock.perform(get("/attractionRewardsPoints")
                        .param("userUuid", String.valueOf(UUID.randomUUID()))
                        .param("attractionUuid", String.valueOf(UUID.randomUUID())))
                .andExpect(status().isOk());
    }
}
