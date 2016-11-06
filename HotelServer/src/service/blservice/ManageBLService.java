package service.blservice;

import Objects.ResultMessage;
import VO.ClientVO;
import VO.HotelWorkerVO;
import VO.WebMarketVO;

public interface ManageBLService {
	//�ṩ��������õĽӿ�
	public ClientVO manage_searchClient(int clientid);
	
	public ResultMessage manage_updateClient(int clientid);
	
	public ResultMessage manage_addHotel(int hotelid);
	
	public ResultMessage manage_addHotelWorker(int hotelid,HotelWorkerVO w);
	
	public HotelWorkerVO manage_searchHotelWorker(int hotelid);
	
	public ResultMessage manage_updateHotelWorker(int hotelid);
	
	public ResultMessage manage_addMarketWorker(WebMarketVO mw);
	
	public WebMarketVO manage_searchMarketWorker(int marketWorkerid);
	
	public ResultMessage manage_updateMarketWorker(WebMarketVO mw);
	
}