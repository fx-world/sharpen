namespace annotations
{
	internal class Indexed : System.Attribute
	{
	}

	internal class Annotated
	{
		[annotations.Indexed]
		public string field;
	}
}