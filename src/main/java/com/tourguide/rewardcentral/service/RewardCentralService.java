package com.tourguide.rewardcentral.service;

import com.tourguide.rewardcentral.controller.RewardCentralController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;
import rewardCentral.RewardCentral;

import java.util.UUID;

@Service
public class RewardCentralService {

    private Logger logger = LogManager.getLogger(RewardCentralController.class);
    RewardCentral rewardCentral = new RewardCentral();

    public Integer getAttractionRewardPoints(UUID userUuid, UUID attractionUuid) {

        logger.debug("rewardCentral call for " + userUuid + " for attraction "+ attractionUuid);

        return rewardCentral.getAttractionRewardPoints(attractionUuid, userUuid);
    }
}
