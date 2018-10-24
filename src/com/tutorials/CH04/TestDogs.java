package com.tutorials.CH04;

public class TestDogs

{
    public static void main(String[] args)
    {
        DogTriathlonParticipant dog1 = new DogTriathlonParticipant("Bowser", 2, 85, 89, 0 );
        dog1.display();
        DogTriathlonParticipant dog2 = new DogTriathlonParticipant("Hlesto", 3 , 78, 72, 80);
        dog2.display();
        DogTriathlonParticipant dog3 = new DogTriathlonParticipant("Thayika", 3 , 90, 86, 72);
        dog3.display();
        dog1.display();
    }
}
