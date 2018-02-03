package softwarehw2;

public class CalculatorModel {
	
	int operator=0;
	double opr1,opr2,result;
	
	public void setOpr(String operator) {
		if(!operator.equals("")) {
			if(this.operator==0) 
				opr1=Double.valueOf(operator);
				else opr2=Double.valueOf(operator);
			}
		}
	public void setOperator(int operator)
	{
		this.operator=operator;
	}
	
	public double getResult() {
		return result;
	}
	public void setResult(double result)
	{
		this.result=result;
	}
	public void FindOperation()
	{
		switch (operator) {
		case 1:
			result=opr1+opr2;
			break;
		case 2:
			result=opr1-opr2;
			break;
		case 3:
			result=opr1*opr2;
			break;
		case 4:
			result=opr1/opr2;
			break;
		case 5:
			result=opr1%opr2;
			break;
		case 6:
			result=Math.sqrt(opr1);
		}
		opr1=result;
	}

}
