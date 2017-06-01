namespace collections
{
	public class Map2
	{
		internal static void test()
		{
			System.Collections.Generic.IDictionary<string, string> map = new System.Collections.Generic.Dictionary
				<string, string>();
			if (map.ContainsKey("foo"))
			{
				object value = map.GetOrNull("foo");
			}
			foreach (object value in map.Values)
			{
			}
			foreach (object key in map.Keys)
			{
			}
			object removed = Sharpen.Collections.Remove(map, "foo");
			Sharpen.Collections.Put(map, "foo", "bar");
			string evicted = Sharpen.Collections.Put(map, "foo", "bar2");
		}

		internal static string putEvict(System.Collections.Generic.IDictionary<string, string
			> map)
		{
			return Sharpen.Collections.Put(map, "a", "b");
		}

		internal static System.Collections.IDictionary genericSortedMap()
		{
			return new System.Collections.Generic.SortedDictionary<string, string>();
		}

		internal static System.Collections.IDictionary sortedMap()
		{
			return new System.Collections.Generic.SortedDictionary<object, object>();
		}
	}
}