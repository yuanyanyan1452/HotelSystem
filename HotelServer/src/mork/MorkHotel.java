package mork;

import objects.Hotel;

public class MorkHotel extends Hotel{
	int hotelid;
	public MorkHotel(int id){
		hotelid = id;
	}
	public int getid(){
		return this.hotelid;
	}
}
