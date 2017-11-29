package com.techcompany.DAOImpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.techcompany.DAO.UserDAO;
import com.techcompany.Model.User;

@Repository("userDAO")
@Transactional
public class UserDAOImpl implements UserDAO {

	public static Logger log = LoggerFactory.getLogger(UserDAOImpl.class);

	@Autowired
	private SessionFactory sessionFactory;

	public UserDAOImpl(SessionFactory sessionFactory) {

		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public boolean save(User user) {
		try {

			sessionFactory.getCurrentSession().save(user);
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
		return true;

	}

	@Transactional
	public boolean update(User user) {
		try {

			sessionFactory.getCurrentSession().update(user);
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
		return true;

	}

	@Transactional
	public boolean delete(User user) {
		try {

			sessionFactory.getCurrentSession().delete(user);
		} catch (HibernateException e) {
			e.printStackTrace();
			return false;
		}
		return true;

	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<User> userlist() {

		return sessionFactory.getCurrentSession().createQuery("from User").list();
	}

	@Transactional
	public User getByUserId(String uid) {
		return (User) sessionFactory.getCurrentSession().get(User.class, uid);

	}

	@SuppressWarnings("unchecked")
	@Transactional
	public boolean validate(String uid, String password) {
		log.debug("starting of valid method");
		System.out.println("starting of Valid method");
		String hql = "from User where uid=" + uid + "and password=" + password + "'";
		System.out.println(hql);
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		log.debug("ending of valid method");

		if (query.uniqueResult() == null) {
			return false;

		} else {
			System.out.println("ending od valid method");
			return true;
		}
	}
}
