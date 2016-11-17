//Chris Kosior//
//Yusuf Albayram//
//CSE1102-SEC12//
//Lab-09//
//4/8/2015//
public class Main {

	public static void main(String[] args) {
		MyPublisher OneyNG = new MyPublisher("Chris ONeill");
		MyPublisher Markiplier = new MyPublisher("Mark Fischbach");
		MySubscriber sub1 = new MySubscriber("Psychic Pebbles");
		MySubscriber sub2 = new MySubscriber("StamperTV");
		MySubscriber sub3 = new MySubscriber("Niall");
		MySubscriber sub4 = new MySubscriber("Adolf Hitler");
		OneyNG.subscribe(sub1);
		OneyNG.subscribe(sub2);
		OneyNG.subscribe(sub3);
		OneyNG.subscribe(sub4);
		Markiplier.subscribe(sub1);
		Markiplier.subscribe(sub2);
		Markiplier.subscribe(sub3);
		Markiplier.subscribe(sub4);
		OneyNG.publish();
		Markiplier.publish();

	}

}
