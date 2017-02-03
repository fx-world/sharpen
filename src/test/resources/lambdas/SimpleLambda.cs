namespace lambdas {
    public class SimpleLambda {
        private static readonly System.Func<string> supplier = () => "supplier";

        private static readonly System.Action<string> consumer = (string s) =>  {
            System.Console.Out.WriteLine("consumer " + s);
        };

        private static readonly System.Func<string, string> function = (string s) => s + "+";

        public static void Main(string[] args) {
            string a = supplier.Invoke();
            consumer.Invoke("a");
            string b = function.Invoke("b");
        }
    }
}