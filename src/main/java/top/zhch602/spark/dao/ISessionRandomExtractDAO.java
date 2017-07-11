package top.zhch602.spark.dao;

import top.zhch602.spark.domain.SessionRandomExtract;

/**
 * session随机抽取模块DAO接口
 * @author Administrator
 *
 */
public interface ISessionRandomExtractDAO {

	/**
	 * 插入session随机抽取
	 * @param sessionRandomExtract
	 */
	void insert(SessionRandomExtract sessionRandomExtract);
	
}
