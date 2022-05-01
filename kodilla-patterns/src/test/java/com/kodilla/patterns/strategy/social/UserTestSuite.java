package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies(){

        //Given
        User robert = new Millenials("Robert Brown");
        User peter = new YGeneration("Peter Snow");
        User jack = new ZGeneration("Jack Sparrow");

        //When
        String robertsSocialMedia = robert.publish();
        System.out.println("Robert -> "+ robertsSocialMedia);
        String petersSocialMedia = peter.publish();
        System.out.println("Peter -> "+petersSocialMedia);
        String jacksSocialMedia = jack.publish();
        System.out.println("Jack -> "+jacksSocialMedia);

        //Then
        assertEquals("I am using Facebook",robertsSocialMedia);
        assertEquals("I am using Twitter",petersSocialMedia);
        assertEquals("I am using Snapchat",jacksSocialMedia);

    }

    @Test
    void testIndividualSharingStrategy(){

        //Given
        User robert = new Millenials("Robert Brown");

        //When
        String robertsSocialMedia = robert.publish();
        System.out.println("Robert -> "+ robertsSocialMedia);
        robert.setSocialPublisher(new SnapchatPublisher());
        robertsSocialMedia = robert.publish();
        System.out.println("Robert now saying, that -> "+robertsSocialMedia);

        //Then
        assertEquals("I am using Snapchat",robertsSocialMedia);


    }
}
