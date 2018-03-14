package action;

import bean.BusCost;
import bean.CarCost;
import bean.TaxiCost;

public class MainActivity {
	
	public static void main(String[] args) {
		
		//-----------------����������------------------
		CountCostManager mCountCostManager  = new CountCostManager();
		mCountCostManager.setCostType(new BusCost());//���ó�����
		String price = mCountCostManager.countCost(12);//����·������廨��
		System.err.println("����������:"+price+"\n");
		
		//-----------------С��������------------------
		mCountCostManager.setCostType(new CarCost());//���ó�����
		System.err.println("С��������:"+mCountCostManager.countCost(12)+"\n");
		
		//-----------------���⳵����------------------
		mCountCostManager.setCostType(new TaxiCost());//���ó�����
		mCountCostManager.countCost(12);//����·������廨��
		System.err.println("���⳵����:"+mCountCostManager.countCost(12)+"\n");
	}

}
