package action;

import iface.IPrice;

/**
 * ͳһ���������Լ�������
 * 
 * @author MtmWp
 *
 */
public class CountCostManager {
	
	IPrice iPrice;
	
	/**
	 * ���ó�����
	 * 
	 * @param price
	 */
	public void setCostType(IPrice price){
		iPrice = price;
	}
	
	/**
	 * ����۸�
	 * 
	 * @param path
	 * @return
	 */
	public String countCost(int path){
		return iPrice.countPrice(path);
	}

}
