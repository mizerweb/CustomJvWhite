package kotlin.collections;

import defpackage.b76;
import defpackage.c5b;
import defpackage.c76;
import defpackage.cf7;
import defpackage.dai;
import defpackage.f0m;
import defpackage.jai;
import defpackage.ohf;
import defpackage.ore;
import defpackage.r66;
import defpackage.rl0;
import defpackage.sb8;
import defpackage.sw;
import defpackage.t9i;
import defpackage.tre;
import defpackage.wm9;
import defpackage.wv;
import defpackage.y9i;
import defpackage.ylc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends tre {
    public static ohf K0(Object[] objArr) {
        return objArr.length == 0 ? b76.a : new sw(0, objArr);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0010 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0012 A[RETURN] */
    public static boolean L0(int i, int[] iArr) {
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            if (i == iArr[i2]) {
                if (i2 >= 0) {
                    return true;
                }
                return false;
            }
            i2++;
        }
        i2 = -1;
        if (i2 >= 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0012 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0014 A[RETURN] */
    public static boolean M0(long j, long[] jArr) {
        int length = jArr.length;
        int i = 0;
        while (i < length) {
            if (j == jArr[i]) {
                if (i >= 0) {
                    return true;
                }
                return false;
            }
            i++;
        }
        i = -1;
        if (i >= 0) {
            return true;
        }
        return false;
    }

    public static boolean N0(Object[] objArr, Object obj) {
        return e1(objArr, obj) >= 0;
    }

    public static boolean O0(Object[] objArr, Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        if (objArr != null && objArr2 != null && objArr.length == objArr2.length) {
            int length = objArr.length;
            for (int i = 0; i < length; i++) {
                Object obj = objArr[i];
                Object obj2 = objArr2[i];
                if (obj != obj2) {
                    if (obj != null && obj2 != null) {
                        if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                            if (!O0((Object[]) obj, (Object[]) obj2)) {
                            }
                        } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                            if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                            }
                        } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                            if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                            }
                        } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                            if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                            }
                        } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                            if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                            }
                        } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                            if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                            }
                        } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                            if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                            }
                        } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                            if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                            }
                        } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                            if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                            }
                        } else if ((obj instanceof t9i) && (obj2 instanceof t9i)) {
                            if (!f0m.c(((t9i) obj).a(), ((t9i) obj2).a())) {
                            }
                        } else if ((obj instanceof jai) && (obj2 instanceof jai)) {
                            if (!f0m.a(((jai) obj).a(), ((jai) obj2).a())) {
                            }
                        } else if ((obj instanceof y9i) && (obj2 instanceof y9i)) {
                            if (!f0m.b(((y9i) obj).a(), ((y9i) obj2).a())) {
                            }
                        } else if ((obj instanceof dai) && (obj2 instanceof dai)) {
                            if (!f0m.d(((dai) obj).a(), ((dai) obj2).a())) {
                            }
                        } else if (!obj.equals(obj2)) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static void P0(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        System.arraycopy(iArr, i2, iArr2, i, i3 - i2);
    }

    public static void Q0(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static void R0(byte[] bArr, int i, byte[] bArr2, int i2) {
        System.arraycopy(bArr, i, bArr2, 0, i2 - i);
    }

    public static void S0(Object[] objArr, Object[] objArr2, int i, int i2, int i3, int i4) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static byte[] T0(int i, byte[] bArr, int i2) {
        tre.Q(i2, bArr.length);
        return Arrays.copyOfRange(bArr, i, i2);
    }

    public static Object[] U0(Object[] objArr, int i, int i2) {
        tre.Q(i2, objArr.length);
        return Arrays.copyOfRange(objArr, i, i2);
    }

    public static void V0(float[] fArr, float f) {
        Arrays.fill(fArr, 0, fArr.length, f);
    }

    public static void W0(long[] jArr) {
        Arrays.fill(jArr, 0, jArr.length, -9187201950435737472L);
    }

    public static void X0(Object[] objArr, c5b c5bVar) {
        Arrays.fill(objArr, 0, objArr.length, c5bVar);
    }

    public static List Y0(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static long Z0(long[] jArr) {
        if (jArr.length != 0) {
            return jArr[0];
        }
        ore.f("Array is empty.");
        return 0L;
    }

    public static Object a1(Object[] objArr) {
        if (objArr.length != 0) {
            return objArr[0];
        }
        ore.f("Array is empty.");
        return null;
    }

    public static Object b1(Object[] objArr) {
        if (objArr.length == 0) {
            return null;
        }
        return objArr[0];
    }

    public static Integer c1(int i, int[] iArr) {
        if (i < 0 || i >= iArr.length) {
            return null;
        }
        return Integer.valueOf(iArr[i]);
    }

    public static Object d1(Object[] objArr, int i) {
        if (i < 0 || i >= objArr.length) {
            return null;
        }
        return objArr[i];
    }

    public static int e1(Object[] objArr, Object obj) {
        int i = 0;
        if (obj == null) {
            int length = objArr.length;
            while (i < length) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = objArr.length;
        while (i < length2) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static String f1(int i, long[] jArr) {
        String str = (i & 1) != 0 ? ", " : ",";
        String str2 = (i & 2) != 0 ? "" : "[";
        String str3 = (i & 4) == 0 ? "]" : "";
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str2);
        int i2 = 0;
        for (long j : jArr) {
            i2++;
            if (i2 > 1) {
                sb.append((CharSequence) str);
            }
            sb.append((CharSequence) String.valueOf(j));
        }
        sb.append((CharSequence) str3);
        return sb.toString();
    }

    public static String g1(byte[] bArr) {
        rl0 rl0Var = rl0.r;
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (byte b : bArr) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) "");
            }
            sb.append((CharSequence) rl0Var.invoke(Byte.valueOf(b)));
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static String h1(Object[] objArr, String str, String str2, String str3, cf7 cf7Var, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "";
        }
        if ((i & 32) != 0) {
            cf7Var = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str2);
        int i2 = 0;
        for (Object obj : objArr) {
            i2++;
            if (i2 > 1) {
                sb.append((CharSequence) str);
            }
            sb8.d(sb, obj, cf7Var);
        }
        sb.append((CharSequence) str3);
        return sb.toString();
    }

    public static Comparable i1(Comparable[] comparableArr) {
        if (comparableArr.length == 0) {
            return null;
        }
        Comparable comparable = comparableArr[0];
        int i = 1;
        int length = comparableArr.length - 1;
        if (1 <= length) {
            while (true) {
                Comparable comparable2 = comparableArr[i];
                if (comparable.compareTo(comparable2) < 0) {
                    comparable = comparable2;
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return comparable;
    }

    public static Object[] j1(Object[] objArr, Object[] objArr2) {
        int length = objArr.length;
        int length2 = objArr2.length;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, length + length2);
        System.arraycopy(objArr2, 0, objArrCopyOf, length, length2);
        return objArrCopyOf;
    }

    public static List k1(Object[] objArr, Comparator comparator) {
        if (objArr.length != 0) {
            objArr = Arrays.copyOf(objArr, objArr.length);
            if (objArr.length > 1) {
                Arrays.sort(objArr, comparator);
            }
        }
        return Arrays.asList(objArr);
    }

    public static final void l1(Object[] objArr, HashSet hashSet) {
        for (Object obj : objArr) {
            hashSet.add(obj);
        }
    }

    public static List m1(long[] jArr) {
        int length = jArr.length;
        if (length == 0) {
            return r66.a;
        }
        if (length == 1) {
            return Collections.singletonList(Long.valueOf(jArr[0]));
        }
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j : jArr) {
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public static List n1(Object[] objArr) {
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? new ArrayList(new wv(objArr, false)) : Collections.singletonList(objArr[0]);
        }
        return r66.a;
    }

    public static Set o1(long[] jArr) {
        int length = jArr.length;
        if (length == 0) {
            return c76.a;
        }
        if (length == 1) {
            return Collections.singleton(Long.valueOf(jArr[0]));
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(wm9.P0(jArr.length));
        for (long j : jArr) {
            linkedHashSet.add(Long.valueOf(j));
        }
        return linkedHashSet;
    }

    public static Set p1(Object[] objArr) {
        int length = objArr.length;
        if (length == 0) {
            return c76.a;
        }
        if (length == 1) {
            return Collections.singleton(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(wm9.P0(objArr.length));
        l1(objArr, linkedHashSet);
        return linkedHashSet;
    }

    public static ArrayList q1(Object[] objArr, Object[] objArr2) {
        int iMin = Math.min(objArr.length, objArr2.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(new ylc(objArr[i], objArr2[i]));
        }
        return arrayList;
    }
}
