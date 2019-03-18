package testing;

public class InterestCalculation {
		public int simple(int Principle,int Time,int Rate){
			return (Principle*Time*Rate)/100;
		}
		public int compound(int Principle,int Time,int Rate){
			int interest=0,temp=0;
			for(int i=Time;i>0;i--){
				temp=(Principle+interest)*Time*Rate;
				interest=interest+temp/100;
			}
			return interest;
		}

	}



