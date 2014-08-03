package oop.asg08;

public class TestMyList {
	public static void main(String args[]){
		MyList l = new MyList();
		MyList l2 = new MyList();
		l.append(new NumeralItem(1));
		l.append(new NumeralItem(2));
		l2.append(new StringItem("a"));
		l2.append(new StringItem("b"));
		l.print();
		l2.print();
		l.appendList(l2);
		l.print();
	}

}
