package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import models.Transaction;
import exceptions.NotFoundException;
/**
 * @author VAMSI KRISHNA MYALAPALLI (vamsikrishna.vasu@gmail.com)
 *
 */
public interface TransactionDAO {
	Transaction createValueObject();
	Transaction getObject(Connection conn, int transaction_id) throws NotFoundException, SQLException;
	void load(Connection conn, Transaction valueObject) throws NotFoundException, SQLException;
	List loadAll(Connection conn) throws SQLException;
    void create(Connection conn, Transaction valueObject) throws SQLException;
    void save(Connection conn, Transaction valueObject) throws NotFoundException, SQLException;
    void delete(Connection conn, Transaction valueObject) throws NotFoundException, SQLException;
    void deleteAll(Connection conn) throws SQLException;
    int countAll(Connection conn) throws SQLException;
    List searchMatching(Connection conn, Transaction valueObject) throws SQLException;
    int databaseUpdate(Connection conn, PreparedStatement stmt) throws SQLException;
    void singleQuery(Connection conn, PreparedStatement stmt, Transaction valueObject) throws NotFoundException, SQLException;
    List listQuery(Connection conn, PreparedStatement stmt) throws SQLException;
}

