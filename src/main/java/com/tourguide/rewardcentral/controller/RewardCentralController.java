package com.tourguide.rewardcentral.controller;

import com.tourguide.rewardcentral.service.RewardCentralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class RewardCentralController {

    @Autowired
    RewardCentralService rewardCentralService;

    @GetMapping(value="/attractionRewardsPoints")
    public Integer getAttractionRewardPoints(@RequestParam UUID userUuid, @RequestParam UUID attractionUuid) {

        return rewardCentralService.getAttractionRewardPoints(attractionUuid, userUuid);
    }
}
