/**
 * Класс элемента контейнера
 * @param <T> тип элемента контейнера
 */
public class Node<T> {
    public T data;
    public Node<T> next;

    /**
     * Инициализация элемента контейнера
     * @param data значение элемента контейнера
     */
    public Node(T data){
        this.data = data;
        this.next = null;
    }

};