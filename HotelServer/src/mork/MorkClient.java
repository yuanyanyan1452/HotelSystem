package mork;

import objects.Client;

public class MorkClient extends Client{
	int clientid;
	public MorkClient(int id){
		clientid = id;
	}
	public int getid(){
		return this.clientid;
	}
}
