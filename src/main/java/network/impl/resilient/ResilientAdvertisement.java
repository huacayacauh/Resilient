package network.impl.advertisement;

import java.util.UUID;
import network.api.advertisement.PeerAdvertisementInterface;
import network.api.annotation.AdvertisementAttribute;
import network.impl.AbstractAdvertisement;

public class ResilientAdvertisement extends AbstractAdvertisement implements ResilientAdvertisementInterface{
	
	@AdvertisementAttribute(indexed = true)
	private String publicKey;

	@Override
	public String getKey() {
		
		return  publicKey;
	}
	
	public void setKey(String newKey) {
		
		publicKey=newKey;
	}

	@Override
	public String getAdvertisementType(Peer peer) {
		return null;
	}
}