package com.example.androiddevchallenge.data

import com.example.androiddevchallenge.R

object PuppyData {

    private val hula = Puppy(
        1,
        "Hula",
        Sex.Female,
        "Young",
        "German Shepherd Dog/Australian Cattle Dog Mix",
        "Tan/Yellow/Fawn - with Black",
        "West Hollywood, CA",
        R.drawable.hula,
        "Hula is a super smart amazing dog with so much love to give. " +
                "Hula is well trained knows all commands sit, heal, go to your bed, stay on your bed, go to your crate, paw she knows it all. " +
                "Hula is very protective and so loving g she needs a experienced owner who keeps her in check and loves her. " +
                "She loves to play with toys she is a great fetcher and will be the most loyal dog you will ever know. " +
                "We require that you meet with our trainer and that you take 15 training sessions with our trainer. " +
                "You will love our trainer he has been training for 30 years. Give Hula a chance to be your forever best friend. " +
                "She was abandoned and given up and hit in the face and she has come through it all."
    )

    private val lucas = Puppy(
        2,
        "Lucas",
        Sex.Male,
        "Young",
        "English Bulldog",
        "White - with Tan, Yellow or Fawn",
        "West Hollywood, CA",
        R.drawable.lucas,
        "Lucas was left in a balcony tied up and all because they had a baby and decided he would not be ok with their baby. " +
                "He never dis anything wrong. " +
                "After the trauma they caused Lucas would not allow a collar on his neck who could blame him. " +
                "Good news we brought Luca to the best trainer in LA and Luca walks on a Kesha and wares the right gear. " +
                "Lucas would love all the love he missed out in as a baby. " +
                "Lucas would love to be your only dog, he has so much live to give. " +
                "He loves to be loved he gets so happy when he is being petted and he loves his belly rubs. " +
                "He is local to LA and sorry we don’t ship dogs out of state. " +
                "He is truly incredible and deserves a loving experienced bully breed owner."
    )

    private val precious = Puppy(
        3,
        "Precious",
        Sex.Female,
        "Young",
        "American Bulldog",
        "White - with Brown or Chocolate",
        "West Hollywood, CA",
        R.drawable.precious,
        "Precious is a loving pup who just wants to be near her people. " +
                "She likes sitting next to you on the couch watching tv or reading a book, " +
                "she like finding a free corner to sit and watch you cook in the kitchen, " +
                "and she likes sitting in the back seat to run errands. " +
                "She's energetic and friendly and is searching for her perfect permanent family!"
    )

    private val edison = Puppy(
        4,
        "Edison",
        Sex.Male,
        "Adult",
        "Boxer/Labrador Retriever Mix",
        "Tan/Yellow/Fawn - with White",
        "West Hollywood, CA",
        R.drawable.edison,
        "Edison was found as a stray injured when he was attached by another dog. " +
                "Edison does not get along well with other dogs, would do great as a single dog in a home. " +
                "Very cautious when first meeting, but a love bug and very obedient. " +
                "He knows sit and stays with you with no reaction towards other dogs except being cautious with males because of his experience. " +
                "He's been coming out of his shell very nicely, wagging his tail and walking great on a leash. " +
                "His foster says that he is just the best & will make a wonderful forever friend to some lucky adopter. " +
                "Who knows, that could be you!"
    )

    private val shelly = Puppy(
        5,
        "SHELLY",
        Sex.Male,
        "Adult",
        "Mixed Breed (Medium) Mix",
        "White",
        "West Hollywood, CA",
        R.drawable.shelly,
        "Shelly is a captivating 4-year old, 55 lb. " +
                "girl who is creamy white with brown speckles on her ears, about 55 pounds, " +
                "with an endearing face, is very smart, eager to please for a food treat, and would love to be your furever pup!"
    )

    val puppyList = listOf<Puppy>(hula, lucas, precious, edison, shelly)
}