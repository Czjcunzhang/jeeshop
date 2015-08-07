/**
 * 2012-7-7
 * jqsl2012@163.com
 */
package net.jeeshop.core;

import java.util.List;

import net.jeeshop.core.dao.page.PagerModel;


/**
 * 该接口提供业务逻辑最基本的服务，所有的业逻辑类都必须实现此接口，这样该业务逻辑类对应
 * 的action就免去了写基本selectList、insert、update、toEdit、deletes麻烦s
 * 
 * @author huangf
 * 
 */
public interface DaoManager<E extends PagerModel> {
	/**
	 * 添加
	 * 
	 * @param e
	 * @return
	 */
	public int insert(E e);

	/**
	 * 删除
	 * 
	 * @param e
	 * @return
	 */
	public int delete(E e);

	/**
	 * 修改
	 * 
	 * @param e
	 * @return
	 */
	public int update(E e);

	/**
	 * 查询一条记录
	 * 
	 * @param e
	 * @return
	 */
	public E selectOne(E e);

	/**
	 * 分页查询
	 * 
	 * @param e
	 * @return
	 */
	public PagerModel selectPageList(E e);
	
	/**
	 * 根据条件查询所有
	 * @return
	 */
	public List<E> selectList(E e);

	/**
	 * 根据ID来删除一条记录
	 * @param id
	 */
	public int deleteById(int id);

	/**
	 * 根据ID查询一条记录
	 * @param id
	 * @return
	 */
	public E selectById(String id);
	
	
	
	/**
	 * 查询一条记录
	 * 
	 * @param e
	 * @return
	 */
	public E selectOne(String id);
	
	/**
	 * 查询一个数字
	 * 
	 * @param e
	 * @return
	 */
	public Integer selectInt(String id);
	
	/**
	 * 查询一个数字
	 * 
	 * @param e
	 * @param params
	 * @return
	 */
	public Integer selectInt(String id,Object params);
	
	
	/**
	 * 查询一个字符串
	 * 
	 * @param e
	 * @return
	 */
	public String selectString(String id);
	
	/**
	 * 查询一个字符串
	 * 
	 * @param e
	 * @param params
	 * @return
	 */
	public String selectString(String id,Object params);
	
	/**
	 * 根据ID查询一条记录
	 * @param id
	 * @param params 参数
	 * @return
	 */
	public E selectOne(String id,Object params);
	
	/**
	 * 根据ID查询一条记录
	 * @param id
	 * @return
	 */
	public List<E> selectList(String id);
	
	/**
	 * 根据ID查询一条记录
	 * @param id
	 * @param params 参数
	 * @return
	 */
	public List<E> selectList(String id,Object params);
	
	
	
}
