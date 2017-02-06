package generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class GenericArrays<T> {
    private List<T>[] genListArray = (List<T>[]) new List[0];
    private Map<T, String>[] genMapArray = (Map<T, String>[]) new HashMap[0];
    private Map<T, T>[] genMapArray2 = (Map<T, T>[]) new HashMap[0];
    private List<T[]>[] genArrayList = (List<T[]>[]) new ArrayList[0];
    private List<T[][]>[] genArrayList2 = (List<T[][]>[]) new ArrayList[0];
}
