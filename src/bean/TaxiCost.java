package bean;

import iface.IPrice;

/**
 * С��������۸�
 * 
 * @author MtmWp
 *
 */
public class TaxiCost implements IPrice {

	@Override
	public String countPrice(int path) {
		return path*3+1+"";
		
	}

}
