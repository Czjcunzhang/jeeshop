package net.jeeshop.core;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import net.jeeshop.core.dao.BaseDao;
import net.jeeshop.core.dao.page.PagerModel;
import net.jeeshop.services.manage.commentType.bean.CommentType;

public abstract class DaoManagerImp<E extends PagerModel> implements DaoManager<E> {
		BaseDao baseDao;
		@SuppressWarnings("rawtypes")
		private Class clazz;
		public DaoManagerImp() {
			// 获取泛型类型
	        Type type = getClass().getGenericSuperclass();  
	        Type[] trueType = ((ParameterizedType) type).getActualTypeArguments();
	        this.clazz = (Class<E>) trueType[0];
	        getDao();
		}
		
		
		@Override
		public E selectOne(String id) {
		return (E) getDao().selectOne(id);
		}
		
		@Override
		public E selectOne(String id, Object params) {
			return (E) getDao().selectOne(id,params);
		}
		
		@Override
		public List<E> selectList(String id) {
			return getDao().selectList(id);
		}
		
		@Override
		public List<E> selectList(String id, Object params) {
			return getDao().selectList(id,params);
		}
		
		private BaseDao getDao(){
			if(this.baseDao==null){
				try {
					Field f=getClass().getDeclaredField("dao");
					f.setAccessible(true);
					baseDao=(BaseDao) f.get(this);
				} catch (SecurityException e) {
					e.printStackTrace();
				} catch (NoSuchFieldException e) {
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				}
				
			}
			return baseDao;
		}
		
		@Override
		public String selectString(String id) {
			return (String) getDao().selectOne(id);
		}
		
		@Override
		public String selectString(String id, Object params) {
		return (String) getDao().selectOne(id,params);
		}
		
		@Override
		public Integer selectInt(String id) {
			return (Integer) getDao().selectOne(id);
		}
		
		@Override
		public Integer selectInt(String id, Object params) {
			return (Integer) getDao().selectOne(id,params);
		}
}
