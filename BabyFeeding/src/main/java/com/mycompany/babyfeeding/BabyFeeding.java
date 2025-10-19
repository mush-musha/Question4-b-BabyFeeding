/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.babyfeeding;

/**
 *
 * @author MUSHABE ALLOYSIUS
 */
public class BabyFeeding {

    
    public static void main(String[] args) {
        // Given data
        final double CUP_CAPACITY = 0.5;    // 0.5 liters per cup
        final int PORRIDGE_TIME = 45;       // minutes per porridge feed
        final int MILK_TIME = 30;           // minutes per milk feed
        final double PORRIDGE_VOLUME = 2.0; // 2 liters total
        final double MILK_VOLUME = 2.0;     // 2 liters total
        
        // Calculate number of feeds
        int porridgeFeeds = (int) (PORRIDGE_VOLUME / CUP_CAPACITY); // 4 feeds
        int milkFeeds = (int) (MILK_VOLUME / CUP_CAPACITY);         // 4 feeds
        
        System.out.println("**** BABY FEEDING CALCULATION ****");
        System.out.println("Porridge: " + PORRIDGE_VOLUME + "L = " + porridgeFeeds + " feeds");
        System.out.println("Milk: " + MILK_VOLUME + "L = " + milkFeeds + " feeds");
        
        // Since we have equal number of feeds (4 each), we can calculate directly
        
        int totalTime;
        
        if (porridgeFeeds == milkFeeds) {
            
            totalTime = (porridgeFeeds * PORRIDGE_TIME) + (milkFeeds * MILK_TIME);
        } else if (porridgeFeeds > milkFeeds) {
            totalTime = (milkFeeds * (PORRIDGE_TIME + MILK_TIME)) + 
                       ((porridgeFeeds - milkFeeds) * PORRIDGE_TIME);
        } else {
            totalTime = (porridgeFeeds * (PORRIDGE_TIME + MILK_TIME)) + 
                       ((milkFeeds - porridgeFeeds) * MILK_TIME);
        }
        
        // Display results
        System.out.println("\nFEEDING SCHEDULE:");
       
        
        int currentTime = 0;
        for (int i = 0; i < Math.max(porridgeFeeds, milkFeeds); i++) {
            if (i < porridgeFeeds) {
                currentTime += PORRIDGE_TIME;
                System.out.println(currentTime + " min: Porridge feed " + (i + 1));
            }
            if (i < milkFeeds) {
                currentTime += MILK_TIME;
                System.out.println(currentTime + " min: Milk feed " + (i + 1));
            }
        }
        
        System.out.println("\nSUMMARY:");
        System.out.println("Total porridge feeds: " + porridgeFeeds);
        System.out.println("Total milk feeds: " + milkFeeds);
        System.out.println("Total time required: " + totalTime + " minutes");
        System.out.println("Which is " + (totalTime / 60) + " hours and " + (totalTime % 60) + " minutes");
    }
}