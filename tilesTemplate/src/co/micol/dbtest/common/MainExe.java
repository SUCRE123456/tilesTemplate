package co.micol.dbtest.common;

public class MainExe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Paging paging = new Paging();
		paging.setTotalCount(100);  //10건씩..
		
		paging.setPageNo(3);
		paging.makePaging();
		
		
		
		System.out.println(paging);
		
	}

}
