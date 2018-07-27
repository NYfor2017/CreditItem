package com.ny.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ny.entity.Invest;
/**
 * Invest��Dao��
 * @author N.Y
 *
 */
public interface InvestDao {
	/**
	 * ��ȡ�û���Ͷ����Ŀ�б�
	 * @param user_id
	 * @return
	 */
	List<Invest> getOwnInvest(@Param("user_id")int user_id);
	
	/**
	 * ���Ͷ����Ŀ��Ϣ
	 * @param invest_itemName
	 * @param invest_amount
	 * @param user_id
	 * @return
	 */
	int addInvest(@Param("invest_itemName")String invest_itemName, @Param("invest_amount")int invest_amount, @Param("user_id")int user_id);
	
	/**
	 * ����Ͷ����Ŀ��Ϣ
	 * @param invest_id
	 * @param invest_itemName
	 * @param invest_amount
	 * @return
	 */
	int updateInvest(@Param("invest_id")int invest_id,@Param("invest_itemName")String invest_itemName, @Param("invest_amount")int invest_amount);
	
	/**
	 * ɾ��Ͷ����Ŀ��Ϣ
	 * @param invest_id
	 * @return
	 */
	int deleteInvest(@Param("invest_id")int invest_id);

}
