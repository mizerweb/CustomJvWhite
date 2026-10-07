package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class ezh {
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    public final int a;
    public final hyh b;
    public final boolean c;
    public final int[] d;
    public final boolean[] e;

    static {
        String str = vqi.a;
        f = Integer.toString(0, 36);
        g = Integer.toString(1, 36);
        h = Integer.toString(3, 36);
        i = Integer.toString(4, 36);
    }

    public ezh(hyh hyhVar, boolean z, int[] iArr, boolean[] zArr) {
        int i2 = hyhVar.a;
        this.a = i2;
        boolean z2 = false;
        lvb.R(i2 == iArr.length && i2 == zArr.length);
        this.b = hyhVar;
        if (z && i2 > 1) {
            z2 = true;
        }
        this.c = z2;
        this.d = (int[]) iArr.clone();
        this.e = (boolean[]) zArr.clone();
    }

    public final ezh a(String str) {
        return new ezh(new hyh(str, this.b.d), this.c, this.d, this.e);
    }

    public final hyh b() {
        return this.b;
    }

    public final b87 c(int i2) {
        return this.b.d[i2];
    }

    public final int d(int i2) {
        return this.d[i2];
    }

    public final int e() {
        return this.b.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ezh.class == obj.getClass()) {
            ezh ezhVar = (ezh) obj;
            if (this.c == ezhVar.c && this.b.equals(ezhVar.b) && Arrays.equals(this.d, ezhVar.d) && Arrays.equals(this.e, ezhVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        for (boolean z : this.e) {
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final boolean g(int i2) {
        return this.e[i2];
    }

    public final boolean h(int i2) {
        return this.d[i2] == 4;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.e) + ((Arrays.hashCode(this.d) + (((this.b.hashCode() * 31) + (this.c ? 1 : 0)) * 31)) * 31);
    }
}
