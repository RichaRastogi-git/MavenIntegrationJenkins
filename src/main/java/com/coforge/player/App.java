package com.coforge.player;

import com.coforge.player.model.Players;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Players sachin = new Players(10,"Sachin Tendulkar","Mumbai");
		System.out.println(sachin.getJerseyNo()+" : "+sachin.getPlayerName()+" : "+sachin.getState());

    }
}
