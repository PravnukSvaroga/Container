/**
 * Реализация класса контейнер по принципу однонапрвленного списка
 * @param <T> тип элементов контейнера
 */

public class Container<T> {

    private Node<T> head;
    private int size;
    /**
     * Инициализация пустого контейнера
     */
    public Container(){
        head = null;
        size = 0;
    };

    /**
     * Инициализация с созданием первого элемента
     * @param data значение первого элемента
     */
    public Container(T data){
        head = new Node<T>(data);
        size = 1;
    }

    /**
     * Возвращение значения количества элементов контейнера
     * @return size количество элементов контейнера
     */
    public int getSize(){
        return size;
    }

    /**
     * Добавление элемента в контейнер. Добавляемый элемент становится последним
     * @param data значение добавляемого элемента
     */
    public void add(T data) {
        Node<T> addNode = new Node<>(data);
        if (this.head == null) {
            head = addNode;
        }
        else {
            Node<T> pNode = this.head;
            while (pNode.next != null)
                pNode = pNode.next;
            pNode.next = addNode;
            size++;
        }
    }

    /**
     * Удаление из контейнера первого элемента с заданным значением
     * @param data значение удаляемого элемента
     * @return true если элемент удален
     */
    public boolean remove(T data) {
        if (head == null) {
            return false;
        }
        if (head.data.equals(data)) {
            head = head.next;
            size--;
            return true;
        }
        Node<T> current = head;
        while (current.next != null) {
            if (current.next.data.equals(data)) {
                current.next = current.next.next;
                size--;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    /**
     *
     * @param index индекс извлекаемого значения элемента
     * @return если индекс корректный - значение извлеченного элемента, иначе - null
     */
    public T get(int index) {
        Node<T> currentNode = head;
        while (index > 0 & currentNode != null) {
            --index;
            currentNode = currentNode.next;
        }
        if (currentNode != null) {
            return currentNode.data;
        }
        //System.out.println("Node with specified index doesn't exist");
        return null;
    }
}
