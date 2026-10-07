package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lag {
    public static final lag c = new lag(-1, -1);
    public final int a;
    public final int b;

    static {
        new lag(0, 0);
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public lag(int i, int i2) {
        lvb.R((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0));
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof lag) {
            lag lagVar = (lag) obj;
            if (this.a == lagVar.a && this.b == lagVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = i << 16;
        return this.b ^ ((i >>> 16) | i2);
    }

    public final String toString() {
        return this.a + "x" + this.b;
    }
}
