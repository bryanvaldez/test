/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bryan.crud.dao.impl;
import com.bryan.crud.dao.AmbitoDAO;
import com.bryan.crud.model.Ambito;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.type.StandardBasicTypes;
import org.springframework.stereotype.Repository;

/**
 *
 * @author bvaldez
 */
@Repository("ambitoDao")
public class AmbitoDAOImpl extends AbstractDao<Integer, Ambito> implements AmbitoDAO{

    @Override
    public ArrayList allAmbitos() {
        String sql = "SELECT N_AMBITO_PK AS id, C_NOMBRE_AMBITO AS nombreAmbito, N_TIPO_AMBITO AS tipoAmbito, N_CATEGORIA AS categoria, C_UBIGEO AS ubigeo,"
                    + " C_DEPARTAMENTO AS departamento, C_PROVINCIA AS provincia, C_DISTRITO AS distrito, DBMS_LOB.substr(C_INFORMACION, 4000) AS informacion "
                    + " FROM TAB_AMBITO";
        String sql2 = "SELECT * FROM TAB_AMBITO";
        SQLQuery query = getSession().createSQLQuery(sql);
        query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);        
        return new ArrayList(query.list());
    }

    @Override
    public List<Ambito> findAllAmbitos() {
        Criteria criteria = createEntityCriteria();
        criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
        return (List<Ambito>) criteria.list(); 
    }
    
}
