package lk.ijse.pos.dao.custom.impl;

import lk.ijse.pos.dao.CrudDAOimpl;
import lk.ijse.pos.dao.custom.CustomerDAO;
import lk.ijse.pos.entity.Customer;
import org.hibernate.query.NativeQuery;

public class CustomerDAOImpl extends CrudDAOimpl<Customer,String> implements CustomerDAO {

    public CustomerDAOImpl(){super();}

    @Override
    public NativeQuery<Integer> count() throws Exception {
        return session.createNativeQuery("SELECT COUNT(*) FROM", Integer.class);
    }
}
