package com.example.tdd.app;

public class ArtikYilKontrol {
	

	public ArtikYilKontrol() {
		
	}

	public boolean artikYilmi(int yil) 
    {
        boolean artik = false;
         
        if( yil % 4 == 0 )
        {
            if( yil % 100 == 0  && yil % 400 == 0 )
                artik = true;
            else if( yil % 100 != 0  && yil % 400 != 0 )
                artik = true;
            else
                artik = false;      
        }
         
        return artik;       
    }

}
