package net.jeeshop.services.front.favorite.dao.impl;import java.util.List;import net.jeeshop.core.DaoManagerImp;import net.jeeshop.core.dao.BaseDao;import net.jeeshop.core.dao.page.PagerModel;import net.jeeshop.services.front.comment.bean.Comment;import net.jeeshop.services.front.favorite.bean.Favorite;import net.jeeshop.services.front.favorite.dao.FavoriteDao;public class FavoriteDaoImpl extends DaoManagerImp<Favorite> implements FavoriteDao {	private BaseDao dao;	public void setDao(BaseDao dao) {		this.dao = dao;	}	public PagerModel selectPageList(Favorite e) {		return dao.selectPageList("front.favorite.selectPageList",				"front.favorite.selectPageCount", e);	}	public List selectList(Favorite e) {		return dao.selectList("front.favorite.selectList", e);	}	public Favorite selectOne(Favorite e) {		return (Favorite) dao.selectOne("front.favorite.selectOne", e);	}	public int delete(Favorite e) {		return dao.delete("front.favorite.delete", e);	}	public int update(Favorite e) {		return dao.update("front.favorite.update", e);	}	public int deletes(String[] ids) {		Favorite e = new Favorite();		for (int i = 0; i < ids.length; i++) {			e.setId(ids[i]);			delete(e);		}		return 0;	}	public int insert(Favorite e) {		return dao.insert("front.favorite.insert", e);	}	public int deleteById(int id) {		return dao.delete("front.favorite.deleteById", id);	}	@Override	public Favorite selectById(String id) {		return (Favorite) dao.selectOne("front.favorite.selectOne", id);	}	@Override	public int selectCount(Favorite favorite) {		Object obj = dao.selectOne("front.favorite.selectCount", favorite);		if(obj==null){			return 0;		}		return Integer.valueOf(obj.toString());	}}