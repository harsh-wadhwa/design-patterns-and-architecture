package ChatRoomExample;

public class Main {
    public static void main(String[] args) {

        ChatMediator chatRoom = new ChatRoom();

        User user1 = new ConcreteUser(chatRoom, "Alice");
        User user2 = new ConcreteUser(chatRoom, "Bob");
        User user3 = new ConcreteUser(chatRoom, "Charlie");

        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);

        user1.send("Hello Everyone!");
        user2.send("Hi Alice");
        user3.send("Good Morning, all!");

    }
}