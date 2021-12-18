package com.tourguide.rewardcentral.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class TestRewardCentralService {

    @Autowired
    RewardCentralService rewardCentralService;

    @Test
    public void shouldGetRewardsPoints() {

        Integer points = rewardCentralService.getAttractionRewardPoints(UUID.randomUUID(), UUID.randomUUID());

        assertTrue(points >= 0 && points <= 1000);
    }
}
