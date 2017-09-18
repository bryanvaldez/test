/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bryan.crud.dao.impl;

import com.bryan.crud.dao.UserDao;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.bryan.crud.model.User;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.SQLQuery;
import org.hibernate.criterion.Order;

/**
 *
 * @author bvaldez
 */
@Repository("userDao")
public class UserDaoImpl extends AbstractDao<Integer, User> implements UserDao{

    @Override
    public User findBySSO(String usuario) {
        Criteria criteria = createEntityCriteria();
        criteria.add(Restrictions.eq("usuario", usuario));
        return (User) criteria.uniqueResult();
    }

    @Override
    public User findById(int id) {
        return getByKey(id);
    }

    @Override
    public void save(User user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteBySSO(String sso) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<User> findAllUsers() {
        Criteria criteria = createEntityCriteria();
        criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
        List<User> users = (List<User>) criteria.list();
        
        return users;    
    }

    @Override
    public ArrayList allUsers() {
        String sql = "SELECT A.N_USUARIO_PK AS id, A.C_APELLIDO_MATERNO AS apellidoMaterno, A.C_APELLIDO_PATERNO AS apellidoPaterno, A.C_NOMBRE AS nombre"
                + " , B.C_NOMBRE_PERFIL as nombrePerfil, B.N_ESTADO as estado"
                + " FROM TAB_USUARIO A" 
                + " LEFT OUTER JOIN TAB_PERFIL B ON A.N_PERFIL = B.N_PERFIL_PK";
        SQLQuery query = getSession().createSQLQuery(sql);
        query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
        ArrayList list = new ArrayList(query.list());
        return list;
    }

}
