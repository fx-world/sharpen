namespace generics
{
	public class GenericNested<T1>
	{
		public generics.GenericNested<T1>.Internal<T1> intClass;

		public class Internal<T2>
		{
			public T2 v;
		}
	}
}