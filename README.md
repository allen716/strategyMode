����ģʽ
====================
����:���㳵��
---------------------
˼·: ������ȡһ������Interface���������������ͬ��ʵ�ּƷѽӿ�,����һ���� ����������ֲ�ͬ�����ļƷѹ���


- ���ֳ������ù�ͬ��Ϊ���㳵��
- ��ͬ��Ϊ�������Ͳ�ͬ
- ��������
- ���⳵��
- С������


 ### 1.�����Ʒѽӿ�

```java
/**
 * ����۸�
 *
 * @author MtmWp
 */
public abstract interface IPrice {
	
	/**
	 * ���ؼ����ļ۸�
	 * @param path
	 * @return
	 */
	String countPrice(int path); 
	
}
```
 ### 2.������,���⳵,С�������ԼƷ���
 
 ```java
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

 ```
 
 ```java
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

 ```
  ```java
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


 ```
 
  ### 3.ͳһ�������ͷ�����
  
  ```java
  
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

  ```
## �������� 

  ```java
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
  ```
    
### ���:
    ����������:24

    С��������:29

    ���⳵����:37

