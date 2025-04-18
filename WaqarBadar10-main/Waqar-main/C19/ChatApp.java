package C19;

// Problem: Simulate two-way chat using threads and synchronization.

class Chat {
    synchronized void send(String msg) {
        System.out.println(Thread.currentThread().getName() + ": " + msg);
    }
}

class User extends Thread {
    Chat chat; String[] msgs;
    User(Chat c, String[] m, String name) { chat = c; msgs = m; setName(name); }
    public void run() { for (String msg : msgs) chat.send(msg); }
}

public class ChatApp {
    public static void main(String[] args) {
        Chat c = new Chat();
        new User(c, new String[]{"Hi", "How are you?"}, "User1").start();
        new User(c, new String[]{"Hello", "Fine, thanks!"}, "User2").start();
    }
}

/* Output (order may vary):
User1: Hi
User2: Hello
User1: How are you?
User2: Fine, thanks!
*/
