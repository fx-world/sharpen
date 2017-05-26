namespace annotations
{
	internal class Indexed : System.Attribute
	{
	}

	[annotations.Indexed]
	internal class Annotated
	{
		[annotations.Indexed]
		public string field;
	}
}