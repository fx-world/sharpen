namespace generics
{
	public class GenericMultipleConstraint<T>
		where T : System.IComparable, System.Collections.Generic.IList<object>
	{
	}
}