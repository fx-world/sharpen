namespace formattings
{
	public class IndentStylePascalCaseIdentifiers
	{
		public int field1;

		public long field2;

		public string field3;

		public virtual void Blocks()
		{
			while (field1 > 0)
			{
				field1--;
				if (field1 % 10 == 0)
				{
					break;
				}
				if (field1 % 2 == 0)
				{
					field2 += 2;
				}
				else if (field1 % 3 == 0)
				{
					field2 += 3;
				}
				else if (field1 % 4 == 0)
				{
					if (field2 == 1)
					{
						field2 += 4;
					}
					else if (field2 == 2)
					{
						field2 += 5;
					}
					else
					{
						field2 += 6;
					}
				}
				else
				{
					field2 += 7;
				}
			}
			for (long i = 0; i < field2; i++)
			{
				if (i % 100 == 0)
				{
					field1++;
				}
				else
				{
					field2--;
				}
			}
			try
			{
				do
				{
					field1--;
				}
				while (field1 > 10);
			}
			catch (System.Exception e)
			{
				System.Console.Out.WriteLine(e);
			}
			finally
			{
				System.Console.Out.WriteLine("done");
			}
			foreach (int v in Sharpen.Arrays.AsList(1, 2, 3))
			{
				System.Console.Out.WriteLine(v);
				switch (v)
				{
					case 1:
					{
						System.Console.Out.WriteLine("a");
						break;
					}

					case 2:
					{
						System.Console.Out.WriteLine("b");
						break;
					}

					default:
					{
						System.Console.Out.WriteLine(string.Empty);
						break;
					}
				}
			}
		}

		public virtual void Method1(int v)
		{
			field1 = v;
		}

		public virtual string GetField3()
		{
			return field3;
		}

		public virtual void SetField3(string field3)
		{
			this.field3 = field3;
		}

		public virtual void MethodTryCatch1()
		{
			try
			{
				System.Console.Out.WriteLine(1);
			}
			catch (System.Exception)
			{
				System.Console.Out.WriteLine(2);
			}
		}

		public virtual void MethodTryCatch2()
		{
			try
			{
				System.Console.Out.WriteLine(1);
			}
			catch (System.Exception)
			{
				System.Console.Out.WriteLine(2);
			}
			catch
			{
				System.Console.Out.WriteLine(3);
			}
			System.Console.Out.WriteLine(4);
		}

		private class InnerClass
		{
			public long field1;

			public long field2;

			public InnerClass()
			{
			}

			public InnerClass(long field1, long field2)
			{
				this.field1 = field1;
				this.field2 = field2;
			}

			public virtual void Method1(long v)
			{
				field1 = v;
			}

			public virtual void Method2(long v)
			{
				field2 = v;
			}
		}

		[System.Serializable]
		public sealed class MyEnum1 : nonamespace.EnumBase
		{
			public static readonly formattings.IndentStylePascalCaseIdentifiers.MyEnum1 VALUE1
				 = new formattings.IndentStylePascalCaseIdentifiers.MyEnum1(0, "VALUE1");

			public static readonly formattings.IndentStylePascalCaseIdentifiers.MyEnum1 VALUE2
				 = new formattings.IndentStylePascalCaseIdentifiers.MyEnum1(1, "VALUE2");

			public static readonly formattings.IndentStylePascalCaseIdentifiers.MyEnum1 VALUE3
				 = new formattings.IndentStylePascalCaseIdentifiers.MyEnum1(2, "VALUE3");

			private MyEnum1(int ordinal, string name)
				: base(ordinal, name)
			{
			}

			public static MyEnum1[] values()
			{
				return new MyEnum1[] { VALUE1, VALUE2, VALUE3 };
			}

			static MyEnum1()
			{
				RegisterValues<MyEnum1>(values());
			}
		}
	}
}
