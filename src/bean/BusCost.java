package bean;

import iface.IPrice;

/**
 * ����������۸�
 * 
 * @author MtmWp
 *
 */
public class BusCost implements IPrice {

	@Override
	public String countPrice(int path) {
		return path*2+"";
	}

}
