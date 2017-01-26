namespace collections
{
	internal class Empties
	{
		public virtual void test()
		{
			System.Collections.Generic.IList<string> list = new System.Collections.Generic.List<
				string>();
			System.Collections.Generic.ICollection<string> collection = new System.Collections.Generic.List<
				string>();
			System.Collections.Generic.HashSet<string> set = new System.Collections.Generic.HashSet<
				string>();
			System.Collections.Generic.ICollection<string> collection2 = new System.Collections.Generic.HashSet<
				string>();
			System.Collections.Generic.IDictionary<int, string> map = new System.Collections.Generic.Dictionary<
				int, string>();
		}
	}
}