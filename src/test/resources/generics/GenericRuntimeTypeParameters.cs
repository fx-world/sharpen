namespace Generics
{
	internal class GenericRuntimeTypeParameters
	{
		internal static System.Collections.Generic.IEnumerable<T> Query<T>()
		{
			Print(typeof(T).FullName);
			return null;
		}

		internal static void Test()
		{
			System.Collections.Generic.IEnumerable<string> items = Query<string>();
			System.Type stringClass = typeof(string);
			System.Collections.IEnumerable items2 = Query<string>();
		}

		internal static void Print(string s)
		{
		}
	}
}