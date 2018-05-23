package practice.set;

public class JDBCTemplate {
	private DataSource dataSource;

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public JDBCTemplate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public JDBCTemplate(DataSource dataSource) {
		super();
		this.dataSource = dataSource;
	}
	
}
