package net.jeeshop.services.manage.attribute_link.dao;import net.jeeshop.core.DaoManager;import net.jeeshop.services.manage.attribute_link.bean.Attribute_link;public interface Attribute_linkDao extends DaoManager<Attribute_link> {	/**	 * @param e	 * @return	 */	int deleteByCondition(Attribute_link e);	/**	 * 根据属性ID删除属性关联表的数据	 * @param id	 */	void deleteByAttributeId(int id);}