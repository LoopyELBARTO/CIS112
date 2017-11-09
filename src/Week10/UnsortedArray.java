//---------------------------------------------------------------------------
// ArrayListMap.java          by Dale/Joyce/Weems                   Chapter 8
//
// Implements a map using an ArrayList.
//
// A map provides (K = key, V = value) pairs, mapping the key onto the value.
// Keys are unique. Keys cannot be null.
//
// Methods throw IllegalArgumentException if passed a null key argument.
//
// Values can be null, so a null value returned by put, get, or remove does 
// not necessarily mean that an entry did not exist.
//---------------------------------------------------------------------------
package Week10;

import ch08.maps.MapEntry;
import ch08.maps.MapInterface;

import java.lang.reflect.Array;
import java.util.*;  // Iterator, ArrayList

public class UnsortedArray<K, V>  implements MapInterface<K,V>
{
    protected MapEntry<K, V >[] map;

    public UnsortedArray()
    {
        map = (MapEntry<K, V>[]) new MapEntry[10];
    }

    public UnsortedArray(int initCapacity)
    {
        //map = new ArrayList<MapEntry<K, V>>(initCapacity);
        map = (MapEntry<K,V>[]) new MapEntry[initCapacity];
    }

    public V put(K k, V v)
    // If an entry in this map with key k already exists then the value
    // associated with that entry is replaced by value v and the original
    // value is returned; otherwise, adds the (k, v) pair to the map and
    // returns null.
    {
        if (k == null)
            throw new IllegalArgumentException("Maps do not allow null keys.");

        MapEntry<K, V> entry = new MapEntry<K, V>(k, v);

        MapEntry<K,V> temp;
        Iterable<MapEntry<K,V>> search = Arrays.asList(map); // Arraylist iterator
        while (search.iterator().hasNext())
        {
            temp = search.iterator().next();
            if (temp != null && temp.getKey().equals(k))
            {
                search.iterator().remove();
                Arrays.asList(map).add(entry);
                return temp.getValue(); // k found, exits method
            }
        }

        // No entry is associated with k.
        //map.add(entry);
        Arrays.asList(map).add(entry);
        return null;
    }

    public V get(K k)
    // If an entry in this map with a key k exists then the value associated
    // with that entry is returned; otherwise null is returned.
    {
        if (k == null)
            throw new IllegalArgumentException("Maps do not allow null keys.");

        for (MapEntry<K,V> temp: map)   // uses ArrayList iterator
            if (temp.getKey().equals(k))
                return temp.getValue();     // k found, exits method

        // No entry is associated with k.
        return null;
    }

    public V remove(K k)
    // If an entry in this map with key k exists then the entry is removed
    // from the map and the value associated with that entry is returned;
    // otherwise null is returned.
    {
        if (k == null)
            throw new IllegalArgumentException("Maps do not allow null keys.");

        MapEntry<K,V> temp;
        Iterator<MapEntry<K,V>> search = Arrays.asList(map).iterator(); // Arraylist iterator
        while (search.hasNext())
        {
            temp = search.next();
            if (temp.getKey().equals(k))
            {
                search.remove();
                return temp.getValue();    // k found, exits method
            }
        }

        // No entry is associated with k.
        return null;
    }

    public boolean contains(K k)
    // Returns true if an entry in this map with key k exists;
    // Returns false otherwise.
    {
        if (k == null)
            throw new IllegalArgumentException("Maps do not allow null keys.");

        for (MapEntry<K,V> temp: map)
            if (temp.getKey().equals(k))
                return true;     // k found, exits method

        // No entry is associated with k.
        return false;
    }

    public boolean isEmpty()
    // Returns true if this map is empty; otherwise, returns false.
    {
        //return (map.size() == 0);   // uses ArrayList size
        return  (Arrays.asList(map).size() == 0);
    }

    public boolean isFull()
    // Returns true if this map is full; otherwise, returns false.
    {
        return false;  // An ArrayListMap is never full
    }

    public int size()
    // Returns the number of entries in this map.
    {
        //return map.size();   // uses ArrayList size
        return  Arrays.asList(map).size();
    }

    public Iterator<MapEntry<K,V>> iterator()
    // Returns the Iterator provided by ArrayList.
    {
        //return map.iterator();  // returns ArrayList iterator
        return  Arrays.asList(map).iterator();
    }

    public static void main(String[] args) {
        {
            boolean result;
            MapInterface<String, String> test;
            test = new UnsortedArray<>();
            System.out.println("Expect 'true':\t" + test.isEmpty());
            System.out.println("Expect '0':\t" + test.size());
            
            test.put("s", null);
            System.out.println("Expect 'null':\t" + test.get("s"));
            System.out.println("Expect 'true':\t" + test.contains("s"));
            test = new UnsortedArray<>();

            System.out.println("Expect 'null':\t" + test.put("1", "One"));
            System.out.println("Expect 'false':\t" + test.isEmpty());
            System.out.println("Expect '1':\t" + test.size());

            System.out.println("Expect 'One':\t" + test.put("1", "One"));
            System.out.println("Expect 'false':\t" + test.isEmpty());
            System.out.println("Expect '1':\t" + test.size());

            test.put("2", "Two");
            test.put("3", "Three");
            test.put("4", "Four");
            test.put("5", "Five");
            System.out.println("Expect '5':\t" + test.size());

            System.out.println("Expect 'Three':\t" + test.put("3", "Three XXX"));
            System.out.println("Expect 'Three XXX':\t" + test.put("3", "Three"));
            System.out.println("Expect '5':\t" + test.size());

            System.out.println("Expect 'One':\t" + test.get("1"));
            System.out.println("Expect 'One':\t" + test.get("1"));
            System.out.println("Expect 'Two':\t" + test.get("2"));
            System.out.println("Expect 'Three':\t" + test.get("3"));
            System.out.println("Expect 'Four':\t" + test.get("4"));
            System.out.println("Expect 'Five':\t" + test.get("5"));
            System.out.println("Expect 'null':\t" + test.get("6"));

            System.out.println("Expect 'true':\t" + test.contains("5"));
            System.out.println("Expect 'false':\t" + test.contains("6"));

            System.out.println("Expect 'Four':\t" + test.remove("4"));
            System.out.println("Expect 'null':\t" + test.remove("4"));
            System.out.println("Expect 'false':\t" + test.contains("4"));
            System.out.println("Expect '4':\t" + test.size());

            System.out.println("\nThe Map is:\n");
            for (MapEntry<String, String> m : test)
                System.out.println(m + "\n");

        }
    }
}