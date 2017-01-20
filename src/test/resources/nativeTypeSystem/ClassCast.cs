namespace nativeTypeSystem
{
	public class ClassCast
	{
		public virtual void test()
		{
			object obj = "abc";
			string @string = ((string)obj);
		}
	}
}