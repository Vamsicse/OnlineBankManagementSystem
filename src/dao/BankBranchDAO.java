package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import models.BankBranch;
import exceptions.NotFoundException;

/**
 * @author VAMSI KRISHNA MYALAPALLI (vamsikrishna.vasu@gmail.com)
 *
 */
public interface BankBranchDAO {
    BankBranch createValueObject();
    BankBranch getObject(Connection conn, int bank_branch_id) throws NotFoundException, SQLException;
    void load(Connection conn, BankBranch valueObject) throws NotFoundException, SQLException;
    List loadAll(Connection conn) throws SQLException;
    void create(Connection conn, BankBranch valueObject) throws SQLException;
    void save(Connection conn, BankBranch valueObject) throws NotFoundException, SQLException;
    void delete(Connection conn, BankBranch valueObject) throws NotFoundException, SQLException;
    void deleteAll(Connection conn) throws SQLException;
    int countAll(Connection conn) throws SQLException;
    List searchMatching(Connection conn, BankBranch valueObject) throws SQLException;
    int databaseUpdate(Connection conn, PreparedStatement stmt) throws SQLException;
    void singleQuery(Connection conn, PreparedStatement stmt, BankBranch valueObject) throws NotFoundException, SQLException;
    List listQuery(Connection conn, PreparedStatement stmt) throws SQLException;
}

