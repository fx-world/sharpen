namespace generics
{
	public class GenericNested
	{
		public class X<T1>
		{
			public generics.GenericNested.X.NestedItem<T1> intClass;
		}

		public static class X
		{
			public class NestedItem<T2>
			{
				public T2 v;
			}

			public static void foo()
			{
			}

			public static int bar;
		}

		public static void Main(string[] args)
		{
			generics.GenericNested.X.foo();
			int i = generics.GenericNested.X.bar;
			generics.GenericNested.X.NestedItem<string> a = new generics.GenericNested.X.NestedItem
				<string>();
		}
	}
}