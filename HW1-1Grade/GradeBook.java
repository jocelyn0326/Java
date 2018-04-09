public class GradeBook {
	private String IDnumber;
	private int Chinese;
	private int Math;
	private int English;


	public GradeBook(String number , int gradech , int gradema , int gradeen ){
	setIDnumber (number);
	setChinese (gradech);
	setMath(gradema);
	setEnglish(gradeen);
	}

	//若輸入的值不在0~100之間，則成績為0
	public void setIDnumber(String _IDnumber){
	IDnumber = _IDnumber;
	}

	public void setChinese(int _chinese) {
		if(_chinese >= 0 && _chinese <= 100){
			 Chinese=_chinese;
		}
		else {
			Chinese = 0;
		}
	}
	public void setMath(int _math) {
		if(_math >= 0 && _math <= 100) Math=_math;
		else Math = 0;
	}
	public void setEnglish(int _english) {
		if(_english >=0  && _english <= 100) English=_english;
		else English = 0;
	}
	
	public String getIDnumber(){
		return IDnumber;
	}
	public int getChinese() {
		return Chinese; 
	}
	public int getMath() {
		return Math;
	}
	public int getEnglish() {
		return English;
	}

}
		



