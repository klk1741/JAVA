package inter;

public class DaoEx {

	public static void main(String[] args) {
OracleDao oracle = new OracleDao();
dbWork(oracle);

Mysql mysql = new Mysql();
dbWork(mysql);
//dbWork2(oracle);
	}

	static void dbWork(DataAccessObject dat) {
		dat.select();
		dat.insert();
		dat.update();
		dat.delete();
	}
//	static void dbWork2(OracleDao oracle) {
//		oracle.select();
//		oracle.select();
//		oracle.select();
//		oracle.select();
//	}
}
