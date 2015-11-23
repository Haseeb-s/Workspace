import java.util.*;

public class PriorityQueue<T extends Comparable<T>> {
    private ArrayList<T> elements;  // priority queue elements
    private int lastIndex;          // index of last element in priority queue
    private int maxIndex;           // index of last position in ArrayList

    public PriorityQueue(int maxSize) {
        elements = new ArrayList<T>(maxSize);
        lastIndex = -1;
        maxIndex = maxSize - 1;
    }

    public boolean isEmpty()
    {
        return (lastIndex == -1);
    }

    public boolean isFull()
    {
        return (lastIndex == maxIndex);
    }

    private void reheapUp(T element)
    {
        int hole = lastIndex;
        while ((hole > 0)    // hole is not root and element > hole's parent
                &&
                (element.compareTo(elements.get((hole - 1) / 2)) > 0)) {
            // move hole's parent down and then move hole up
            elements.set(hole, elements.get((hole - 1) / 2));
            hole = (hole - 1) / 2;
        }
        elements.set(hole, element);  // place element into final hole
    }

    public void enqueue(T element) throws PriQOverflowException
    {
        if (lastIndex == maxIndex)
            throw new PriQOverflowException("full");
        else {
            lastIndex++;
            elements.add(lastIndex, element);
            reheapUp(element);
        }
    }

    private int newHole(int hole, T element)
    {
        int left = (hole * 2) + 1;
        int right = (hole * 2) + 2;

        if (left > lastIndex)
            return hole;
        else if (left == lastIndex)
            if (element.compareTo(elements.get(left)) < 0)
                return left;
            else
                return hole;
        else
            if (elements.get(left).compareTo(elements.get(right)) < 0)
                if (elements.get(right).compareTo(element) <= 0)
                    return hole;
                else
                    return right;
            else
                if (elements.get(left).compareTo(element) <= 0)
                    return hole;
                else
                    return left;
    }

    private void reheapDown(T element)
    {
        int hole = 0;
        int newhole;

        newhole = newHole(hole, element);
        while (newhole != hole) {
            elements.set(hole, elements.get(newhole));
            hole = newhole;
            newhole = newHole(hole, element);
        }
        elements.set(hole, element);
    }

    public T dequeue() throws PriQUnderflowException
    {
        T hold;
        T toMove;

        if (lastIndex == -1)
            throw new PriQUnderflowException("Priority queue is empty");
        else {
            hold = elements.get(0);
            toMove = elements.remove(lastIndex);
            lastIndex--;
            if (lastIndex != -1)
                reheapDown(toMove);
            return hold;
        }
    }


    public String toString()
    // Returns a string of all the heap elements.
    {
        String theHeap = new String("the heap is:\n");
        for (int index = 0; index <= lastIndex; index++)
            theHeap = theHeap + index + ". " + elements.get(index) + "\n";
        return theHeap;
    }
}
