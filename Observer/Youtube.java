package Observer;

// Eg. Channel and subscriber, subscriber acts as observer to when the video gets uploaded
// behavioural pattern

public class Youtube {

    public static void main(String[] args) {
    Subject c1 = new Channel();

    Subscriber s1 = new Subscriber("Akshay");
    Subscriber s2 = new Subscriber("Vishwas");
    Subscriber s3 = new Subscriber("Ajay");
    Subscriber s4 = new Subscriber("Ravi");

    c1.subscribe(s1);
    c1.subscribe(s2);
    c1.subscribe(s3);
    c1.subscribe(s4);
    c1.unsubscribe(s2);

    s1.subscribeChannel(c1);
    s2.subscribeChannel(c1);
    s3.subscribeChannel(c1);
    s4.subscribeChannel(c1);

    c1.upload("How to learn programming");
    }

}
