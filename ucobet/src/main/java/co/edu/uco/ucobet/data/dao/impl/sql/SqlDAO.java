package co.edu.uco.ucobet.data.dao.impl.sql;
import java.sql.Connection;
public class SqlDAO {
	
	private Connection conncetion;
	
	protected SqlDAO(final Connection connection) {
		setConncetion(connection);
	}

	

}
