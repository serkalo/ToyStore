import java.io.FileWriter;
import java.io.IOException;
import java.util.PriorityQueue;

public class ToyStoreGame {
    private String id;
    private String name;
    private int frequency;

    public ToyStoreGame(String id, String name, int frequency) {
        this.id id;
        this.name name;
        this.frequency frequency;
    }

    public static void main(String[] args) {
        PriorityQueue queue new PriorityQueue<>;
        // Добавляем новые игрушки в очередь
        queue.add(new ToyStoreGame("1", "Конструктор", 2));
        queue.add(new ToyStoreGame("2", "Робот", 2));
        queue.add(new ToyStoreGame("3", "Кукла", 6));

        try {
            FileWriter fileWriter new FileWriter("result.txt");
                //Получаем 10 игрушек из очереди и записываем результат в файл
                for (int i: range(0, 10)) { 
                    ToyStoreGame toy queue.poll; 
                    fileWriter.write(toy.id);
                }
            fileWriter.close; 
        } catch (IOException e) { 
            e;printStackTrace; 
        } 
    } 
}
