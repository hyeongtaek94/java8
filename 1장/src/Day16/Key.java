package Day16;	//hash코드와 equals를 재정의 사용

public class Key {
	public int number;
	public Key(int number) {
			this.number = number;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			Key compareKey = (Key) obj;
			if(this.number == compareKey.number) {
					return true;
			}
		}
		return false;
	}
//	
//	@Override
//	public int hashCode(){
//		return number;
		
		@Override
		public String toString() {
			return "Key 객체에 저장된 Number: " + number;
		}
	}

