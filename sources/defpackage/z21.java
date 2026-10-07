package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class z21 {
    public final int a;

    public static final boolean a(int i) {
        if (b(i)) {
            return ((134217728 & i) == 0 && (i & 268435456) == 0) ? false : true;
        }
        return false;
    }

    public static final boolean b(int i) {
        return (i & 67108864) != 0;
    }

    public static String c(int i) {
        String str;
        if ((268435456 & i) != 0) {
            str = "First";
        } else if ((536870912 & i) != 0) {
            str = "Middle";
        } else if ((1073741824 & i) != 0) {
            str = "Last";
        } else {
            str = (134217728 & i) != 0 ? "Single" : "unknown!";
        }
        return "BubbleType(" + str + " " + (b(i) ? (char) 8595 : (char) 8593) + ")";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z21) {
            return this.a == ((z21) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return c(this.a);
    }
}
