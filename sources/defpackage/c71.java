package defpackage;

import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public class c71 implements Iterable, Serializable {
    public static final c71 c = new c71(wj8.b);
    public static final b71 d;
    public int a = 0;
    public final byte[] b;

    static {
        d = ag.a() ? new zpe(19) : new l6m(18);
    }

    public c71(byte[] bArr) {
        bArr.getClass();
        this.b = bArr;
    }

    public static c71 a(int i, byte[] bArr, int i2) {
        int i3 = i + i2;
        int length = bArr.length;
        if (((i3 - i) | i | i3 | (length - i3)) < 0) {
            if (i < 0) {
                c.r(c0a.k(i, "Beginning index: ", " < 0"));
            } else if (i3 < i) {
                c.r(qt4.l("Beginning index larger than ending index: ", i, i3, ", "));
            } else {
                c.r(qt4.l("End index: ", i3, length, " >= "));
            }
        }
        return new c71(d.d(i, bArr, i2));
    }

    public int b() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c71) || size() != ((c71) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof c71)) {
            return obj.equals(this);
        }
        c71 c71Var = (c71) obj;
        int i = this.a;
        int i2 = c71Var.a;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        int size = size();
        if (size > c71Var.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > c71Var.size()) {
            StringBuilder sbY = zo5.y(size, "Ran off end of other: 0, ", ", ");
            sbY.append(c71Var.size());
            throw new IllegalArgumentException(sbY.toString());
        }
        byte[] bArr = c71Var.b;
        int iB = b() + size;
        int iB2 = b();
        int iB3 = c71Var.b();
        while (iB2 < iB) {
            if (this.b[iB2] != bArr[iB3]) {
                return false;
            }
            iB2++;
            iB3++;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.a;
        if (i != 0) {
            return i;
        }
        int size = size();
        int iB = b();
        int i2 = size;
        for (int i3 = iB; i3 < iB + size; i3++) {
            i2 = (i2 * 31) + this.b[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.a = i2;
        return i2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new a71(this);
    }

    public int size() {
        return this.b.length;
    }

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }
}
