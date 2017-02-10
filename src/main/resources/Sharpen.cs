using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.CompilerServices;

namespace Sharpen {

    public abstract class EnumBase : IComparable<EnumBase>, IComparable {
        private static readonly Dictionary<Type, EnumBase[]> VALUES_MAP = new Dictionary<Type, EnumBase[]>();

        private readonly int _ordinal;
        private readonly string _name;

        protected EnumBase(int ordinal, string name) {
            _ordinal = ordinal;
            _name = name;
        }

        public int ordinal() {
            return _ordinal;
        }

        public string name() {
            return _name;
        }

        public override string ToString() {
            return _name;
        }

        public int CompareTo(object obj) {
            return CompareTo((EnumBase) obj);
        }

        public int CompareTo(EnumBase other) {
            return this._ordinal - other._ordinal;
        }

        public static bool IsEnum(Type t) {
            return VALUES_MAP.ContainsKey(t);
        }

        protected static void RegisterValues<T>(EnumBase[] values) where T : EnumBase {
            VALUES_MAP[typeof(T)] = values;
        }

        public static EnumBase[] GetEnumValue(Type enumType) {
            EnumBase[] result;
            if (VALUES_MAP.TryGetValue(enumType, out result)) {
                return result;
            } else {
                RuntimeHelpers.RunClassConstructor(enumType.TypeHandle);
                return VALUES_MAP[enumType];
            }
        }

    }

    public class System {
        public static readonly DateTime EPOCH = new DateTime(1970, 1, 1, 0, 0, 0, DateTimeKind.Utc);

        public static int Compare(int x, int y) {
            return (x < y) ? -1 : ((x == y) ? 0 : 1);
        }

        public static int Compare(long x, long y) {
            return (x < y) ? -1 : ((x == y) ? 0 : 1);
        }

        public static long CurrentTimeMillis() {
            return (long) (DateTime.UtcNow - EPOCH).TotalMilliseconds;
        }

    }

    public class Arrays {
        public static void Fill<T>(T[] a, T val) {
            Fill(a, 0, a.Length, val);
        }

        public static void Fill<T>(T[] a, int from, int to, T val) {
            for (int i = from; i < to; i++) {
                a[i] = val;
            }
        }

        public static T[] CopyOf<T>(T[] a, int newSize) {
            T[] result = new T[newSize];
            a.CopyTo(result, 0);
            return result;
        }

        public static int HashCode<T>(T[] a) {
            if (a == null) {
                return 0;
            }

            int result = 1;
            foreach (var element in a) {
                result = 31 * result + element.GetHashCode();
            }
            return result;
        }
    }

    public static class Runtime {
        public static string substring(string s, int from, int to) {
            return s.Substring(from, to - from);
        }
    }

    public class IdentityHashMap<K, V> : Dictionary<K, V> {
        public IdentityHashMap() : base(new IdentityEqualityComparer<K>()) {
        }
    }

    public class IdentityEqualityComparer<T> : IEqualityComparer<T> {
        public bool Equals(T x, T y) {
            return ReferenceEquals(x, y);
        }

        public int GetHashCode(T obj) {
            return RuntimeHelpers.GetHashCode(obj);
        }
    }

    public static class Lists {
        public static void Add<T>(this IList<T> list, int index, T value) {
            list.Insert(index, value);
        }

        public static T RemoveAtReturningValue<T>(this IList<T> list, int index) {
            T value = list[index];
            list.RemoveAt(index);
            return value;
        }
    }

    public static class Maps {

        public static V GetOrDefault<K, V>(this IDictionary<K, V> map, K key, V defaultValue) {
            V result;
            return map.TryGetValue(key, out result) ? result : defaultValue;
        }

        public static V GetOrNull<K, V>(this IDictionary<K, V> map, K key) where V : class {
            V result;
            return map.TryGetValue(key, out result) ? result : null;
        }

        public static V? GetOrNullable<K, V>(this IDictionary<K, V> map, K key) where V : struct {
            V result;
            return map.TryGetValue(key, out result) ? result : new V?();
        }

    }

}