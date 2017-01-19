namespace collections
{
	internal class IsEmpty
	{
		public virtual void test()
		{
			System.Collections.Generic.List<string> list = new System.Collections.Generic.List
				<string>();
			System.Collections.Generic.ICollection<string> collection = list;
			System.Collections.Generic.HashSet<int> hashSet = new System.Collections.Generic.HashSet
				<int>();
			java.util.TreeSet<int> treeSet = new java.util.TreeSet<int>();
			System.Collections.Generic.ICollection<int> set = hashSet;
			System.Collections.Generic.Dictionary<int, string> hashMap = new System.Collections.Generic.Dictionary
				<int, string>();
			System.Collections.Generic.SortedDictionary<int, string> treeMap = new System.Collections.Generic.SortedDictionary
				<int, string>();
			System.Collections.Generic.IDictionary<int, string> map = hashMap;
			(list.Count == 0);
			(collection.Count == 0);
			(hashSet.Count == 0);
			(treeSet.Count == 0);
			(set.Count == 0);
			(hashMap.Count == 0);
			(treeMap.Count == 0);
			(map.Count == 0);
		}
	}
}