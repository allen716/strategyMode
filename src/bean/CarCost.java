package bean;

import iface.IPrice;

/**
 * ���⳵����۸�
 * 
 * @author MtmWp
 *
 */
public class CarCost implements IPrice {

	@Override
	public String countPrice(int path) {
		return path*2+5+"";
	}

}
