package kadai_018;

abstract public class Kato_Chapter18 {

	public String familyName = "加藤";
	public String givenName = "";
	public String adress = "東京都中野区〇×";	
	
	//出力メソッド
	  public void commonIntroduce(){
			System.out.println("名前は"+familyName+givenName+"です");
			System.out.println("住所は"+adress+"です");
	  }
	  abstract public void eachIntroduce();
				
	  public void execIntroduce(){
		  commonIntroduce();
		  eachIntroduce();
		  System.out.println();
	  }
					
}
