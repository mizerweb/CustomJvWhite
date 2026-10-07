package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class n7g {
    public static final n7g d;
    public final Comparable[] a;
    public final Object[] b;
    public final int c;

    static {
        Comparable[] comparableArr = new Comparable[0];
        d = new n7g(comparableArr, comparableArr);
    }

    public n7g(Comparable[] comparableArr, Object[] objArr) {
        if (comparableArr.length == objArr.length) {
            this.a = comparableArr;
            this.b = objArr;
            this.c = comparableArr.length;
        } else {
            StringBuilder sb = new StringBuilder("different array sizes: ");
            sb.append(comparableArr.length);
            sb.append(" keys and ");
            ore.p(zo5.t(sb, objArr.length, " values"));
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n7g)) {
            return false;
        }
        n7g n7gVar = (n7g) obj;
        return n7gVar.c == this.c && Arrays.equals(n7gVar.a, this.a) && Arrays.equals(n7gVar.b, this.b);
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.b) * 31) + Arrays.hashCode(this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < this.c; i++) {
            if (i != 0) {
                sb.append(',');
            }
            sb.append("{");
            sb.append(this.a[i]);
            sb.append(" : ");
            sb.append(this.b[i]);
            sb.append('}');
        }
        sb.append(']');
        return sb.toString();
    }
}
