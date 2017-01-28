package by.trc.equpment.service.factory;

import by.trc.equpment.service.ClientService;
import by.trc.equpment.service.ShopService;
import by.trc.equpment.service.impl.ClientServiceImpl;
import by.trc.equpment.service.impl.ShopServiceImpl;

public class ServiceFactory {
	private static final ServiceFactory instance = new ServiceFactory();
	
	private final ClientService clientService = new ClientServiceImpl();
	private final ShopService shopService = new ShopServiceImpl();
	
	public static ServiceFactory getInstance(){
		return instance;
	}
	
	public ClientService getClientService(){
		return clientService;
	}
	public ShopService getShopService(){
		return shopService;
	}

}
