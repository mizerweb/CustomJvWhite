package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gll {
    public static char a(long j) {
        char c = (char) j;
        lvb.N(j, "Out of range: %s", ((long) c) == j);
        return c;
    }

    public static boolean b(char c, char[] cArr) {
        for (char c2 : cArr) {
            if (c2 == c) {
                return true;
            }
        }
        return false;
    }

    public static char c(byte b, byte b2) {
        return (char) ((b << 8) | (b2 & 255));
    }

    public static String d(int i) {
        return c0a.k(i, "ProfileEditItemId(value=", ")");
    }
}
