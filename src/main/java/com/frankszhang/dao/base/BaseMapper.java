package com.frankszhang.dao.base;

/**
 * dao的基础接口
 * @author zwf
 *
 */
public interface BaseMapper<T> {

	/**
	 * @description 添加一条记录
	 * @param t
	 * @return
	 */
    public int insert(T t);

    /**
     * @description 根据主键删除记录
     * @param id
     * @return
     */
    public int deleteByPrimaryKey(String id);
    
    /**
     * @description 
     * @param t
     * @return
     */
    public int insertSelective(T t);

    /**
     * @description 通过主键查找记录
     * @param id
     * @return
     */
    public T selectByPrimaryKey(String id);

    /**
     * @description 
     * @param t
     * @return
     */
    public int updateByPrimaryKeySelective(T t);

    /**
     * @description 通过对象的主键来更新记录
     * @param t
     * @return
     */
    public int updateByPrimaryKey(T t);
}
