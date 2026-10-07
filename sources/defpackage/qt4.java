package defpackage;

import java.util.Iterator;
import one.me.android.initialization.AccountInitializer;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class qt4 implements s72 {
    public static final /* synthetic */ int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};

    public static /* synthetic */ void A(Object obj) {
        if (obj == null) {
            return;
        }
        ore.m();
    }

    public static void B(String str, String str2, StringBuilder sb, boolean z, boolean z2) {
        sb.append(z);
        sb.append(str);
        sb.append(z2);
        sb.append(str2);
    }

    public static void C(boolean z, mjg mjgVar, Object obj) {
        Boolean boolValueOf = Boolean.valueOf(z);
        mjgVar.getClass();
        mjgVar.j(obj, boolValueOf);
    }

    public static /* synthetic */ int D(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    public static /* synthetic */ String E(int i) {
        switch (i) {
            case 1:
                return "UNKNOWN";
            case 2:
                return "STICKER";
            case 3:
                return "STICKER_SET";
            case 4:
                return "FAVORITE_STICKER";
            case 5:
                return "FAVORITE_STICKER_SET";
            case 6:
                return "RECENT";
            case 7:
                return "BACKGROUND";
            case 8:
                return "ANIMOJI";
            case 9:
                return "ANIMOJI_SET";
            case 10:
                return "REACTION";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String F(int i) {
        if (i != 1) {
            return i != 2 ? "null" : "VIDEO_MESSAGE";
        }
        return "VIDEO";
    }

    public static /* synthetic */ String G(int i) {
        if (i == 1) {
            return "SUSPEND";
        }
        if (i != 2) {
            return i != 3 ? "null" : "DROP_LATEST";
        }
        return "DROP_OLDEST";
    }

    public static /* synthetic */ int[] H(int i) {
        int[] iArr = new int[i];
        System.arraycopy(a, 0, iArr, 0, i);
        return iArr;
    }

    public static int a(int i) {
        for (int i2 : H(2)) {
            if (D(i2) == i) {
                return i2;
            }
        }
        return 1;
    }

    public static /* synthetic */ Integer b(int i) {
        if (i == 0) {
            return null;
        }
        return Integer.valueOf(i - 1);
    }

    public static /* synthetic */ void c(int i) {
        if (i == 0) {
            throw null;
        }
    }

    public static /* synthetic */ int d(int i, int i2) {
        if (i == 0 || i2 == 0) {
            throw null;
        }
        return i - i2;
    }

    public static /* synthetic */ boolean e(int i, int i2) {
        if (i != 0) {
            return i == i2;
        }
        throw null;
    }

    public static /* synthetic */ String f(int i) {
        switch (i) {
            case 1:
                return "UNKNOWN";
            case 2:
                return "STICKER";
            case 3:
                return "STICKER_SET";
            case 4:
                return "FAVORITE_STICKER";
            case 5:
                return "FAVORITE_STICKER_SET";
            case 6:
                return "RECENT";
            case 7:
                return "BACKGROUND";
            case 8:
                return "ANIMOJI";
            case 9:
                return "ANIMOJI_SET";
            case 10:
                return "REACTION";
            default:
                throw null;
        }
    }

    public static int g(int i, int i2, long j) {
        return (Long.hashCode(j) + i) * i2;
    }

    public static ClassCastException h(Iterator it) {
        it.next().getClass();
        return new ClassCastException();
    }

    public static Object i(AccountInitializer accountInitializer, int i) {
        return accountInitializer.d().getAccessor().d(i).getValue();
    }

    public static String j(int i, String str, String str2) {
        return str + str2 + i;
    }

    public static String k(long j, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(j);
        return sb.toString();
    }

    public static String l(String str, int i, int i2, String str2) {
        return str + i + str2 + i2;
    }

    public static String m(String str, m65 m65Var) {
        return (str + m65Var).toString();
    }

    public static String n(String str, String str2, String str3, boolean z) {
        return str + str2 + str3 + z;
    }

    public static String o(String str, boolean z, String str2, boolean z2, String str3) {
        return str + z + str2 + z2 + str3;
    }

    public static String p(StringBuilder sb, int i, char c) {
        sb.append(i);
        sb.append(c);
        return sb.toString();
    }

    public static String q(StringBuilder sb, String str, String str2, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return sb.toString();
    }

    public static String r(StringBuilder sb, boolean z, String str) {
        sb.append(z);
        sb.append(str);
        return sb.toString();
    }

    public static StringBuilder s(long j, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(j);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder t(long j, String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(j);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder u(long j, String str, String str2, boolean z) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(j);
        sb.append(str2);
        sb.append(z);
        return sb;
    }

    public static StringBuilder v(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static void w(float f, float f2, bsb bsbVar) {
        bsbVar.a(gm0.K(f * f2));
    }

    public static void x(int i, int i2, String str, String str2, StringBuilder sb) {
        sb.append(i);
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
    }

    public static void y(int i, String str, String str2) {
        lvb.G0(str2, str + i);
    }

    public static void z(long j, String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(j);
        sb.append(str2);
    }
}
