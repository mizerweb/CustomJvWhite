package defpackage;

import com.fasterxml.jackson.core.exc.StreamConstraintsException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class f8e {
    public static final char[] m = new char[0];
    public final x31 a;
    public char[] b;
    public int c;
    public int d;
    public ArrayList e;
    public boolean f;
    public int g;
    public char[] h;
    public int i;
    public String j;
    public char[] k;
    public final sa6 l;

    public f8e(sa6 sa6Var, x31 x31Var) {
        this.a = x31Var;
        this.l = sa6Var;
    }

    public static void a(int i, int i2) {
        throw new IllegalStateException(nbh.s(((long) i) + ((long) i2), "TextBuffer overrun: size reached (", ") exceeds maximum of 2147483647"));
    }

    public final char[] b(int i) {
        x31 x31Var = this.a;
        return x31Var != null ? x31Var.a(2, i) : new char[Math.max(i, 500)];
    }

    public final void c() {
        this.f = false;
        this.e.clear();
        this.g = 0;
        this.i = 0;
    }

    public final char[] d() throws StreamConstraintsException {
        int i;
        char[] cArrCopyOf = this.k;
        if (cArrCopyOf == null) {
            String str = this.j;
            if (str != null) {
                cArrCopyOf = str.toCharArray();
            } else {
                int i2 = this.c;
                char[] cArr = m;
                if (i2 >= 0) {
                    int i3 = this.d;
                    if (i3 < 1) {
                        cArrCopyOf = cArr;
                    } else {
                        o(i3);
                        int i4 = this.c;
                        char[] cArr2 = this.b;
                        cArrCopyOf = i4 == 0 ? Arrays.copyOf(cArr2, i3) : Arrays.copyOfRange(cArr2, i4, i3 + i4);
                    }
                } else {
                    int iM = m();
                    if (iM < 1) {
                        if (iM < 0) {
                            a(this.g, this.i);
                            throw null;
                        }
                        cArrCopyOf = cArr;
                    } else {
                        o(iM);
                        cArrCopyOf = new char[iM];
                        ArrayList arrayList = this.e;
                        if (arrayList != null) {
                            int size = arrayList.size();
                            i = 0;
                            for (int i5 = 0; i5 < size; i5++) {
                                char[] cArr3 = (char[]) this.e.get(i5);
                                int length = cArr3.length;
                                System.arraycopy(cArr3, 0, cArrCopyOf, i, length);
                                i += length;
                            }
                        } else {
                            i = 0;
                        }
                        System.arraycopy(this.h, 0, cArrCopyOf, i, this.i);
                    }
                }
            }
            this.k = cArrCopyOf;
        }
        return cArrCopyOf;
    }

    public final int e(boolean z) {
        char[] cArr;
        int i = this.c;
        if (i >= 0 && (cArr = this.b) != null) {
            int i2 = this.d;
            return z ? -kpb.g(cArr, i + 1, i2 - 1) : kpb.g(cArr, i, i2);
        }
        char[] cArr2 = this.h;
        int i3 = this.i;
        return z ? -kpb.g(cArr2, 1, i3 - 1) : kpb.g(cArr2, 0, i3);
    }

    public final String f() throws StreamConstraintsException {
        if (this.j == null) {
            char[] cArr = this.k;
            if (cArr != null) {
                this.j = new String(cArr);
            } else if (this.c >= 0) {
                int i = this.d;
                if (i < 1) {
                    this.j = "";
                    return "";
                }
                o(i);
                this.j = new String(this.b, this.c, this.d);
            } else {
                int i2 = this.g;
                int i3 = this.i;
                if (i2 != 0) {
                    int i4 = i2 + i3;
                    if (i4 < 0) {
                        a(i2, i3);
                        throw null;
                    }
                    o(i4);
                    StringBuilder sb = new StringBuilder(i4);
                    ArrayList arrayList = this.e;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        for (int i5 = 0; i5 < size; i5++) {
                            char[] cArr2 = (char[]) this.e.get(i5);
                            sb.append(cArr2, 0, cArr2.length);
                        }
                    }
                    sb.append(this.h, 0, this.i);
                    this.j = sb.toString();
                } else if (i3 == 0) {
                    this.j = "";
                } else {
                    o(i3);
                    this.j = new String(this.h, 0, i3);
                }
            }
        }
        return this.j;
    }

    public final char[] g() {
        this.c = -1;
        this.i = 0;
        this.d = 0;
        this.b = null;
        this.j = null;
        this.k = null;
        if (this.f) {
            c();
        }
        char[] cArr = this.h;
        if (cArr != null) {
            return cArr;
        }
        char[] cArrB = b(0);
        this.h = cArrB;
        return cArrB;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0028 A[PHI: r1
  0x0028: PHI (r1v9 int) = (r1v7 int), (r1v8 int) binds: [B:8:0x0026, B:11:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    public final void h() {
        if (this.e == null) {
            this.e = new ArrayList();
        }
        char[] cArr = this.h;
        this.f = true;
        this.e.add(cArr);
        int length = this.g + cArr.length;
        this.g = length;
        if (length < 0) {
            a(length - cArr.length, cArr.length);
            throw null;
        }
        this.i = 0;
        int length2 = cArr.length;
        int i = length2 + (length2 >> 1);
        int i2 = 500;
        if (i < 500) {
            i = i2;
        } else {
            i2 = 65536;
            if (i > 65536) {
                i = i2;
            }
        }
        this.h = new char[i];
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002c A[PHI: r1
  0x002c: PHI (r1v7 int) = (r1v5 int), (r1v6 int) binds: [B:8:0x002a, B:11:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
    public final char[] i() throws StreamConstraintsException {
        if (this.e == null) {
            this.e = new ArrayList();
        }
        this.f = true;
        this.e.add(this.h);
        int length = this.h.length;
        int i = this.g + length;
        this.g = i;
        if (i < 0) {
            a(i - length, length);
            throw null;
        }
        this.i = 0;
        o(i);
        int i2 = length + (length >> 1);
        int i3 = 500;
        if (i2 < 500) {
            i2 = i3;
        } else {
            i3 = 65536;
            if (i2 > 65536) {
                i2 = i3;
            }
        }
        char[] cArr = new char[i2];
        this.h = cArr;
        return cArr;
    }

    public final char[] j() {
        if (this.c >= 0) {
            n(1);
        } else {
            char[] cArr = this.h;
            if (cArr == null) {
                this.h = b(0);
            } else if (this.i >= cArr.length) {
                h();
            }
        }
        return this.h;
    }

    public final char[] k() {
        if (this.c >= 0) {
            return this.b;
        }
        char[] cArr = this.k;
        if (cArr != null) {
            return cArr;
        }
        String str = this.j;
        if (str != null) {
            char[] charArray = str.toCharArray();
            this.k = charArray;
            return charArray;
        }
        if (this.f) {
            return d();
        }
        char[] cArr2 = this.h;
        return cArr2 == null ? m : cArr2;
    }

    public final void l(char[] cArr, int i, int i2) {
        this.j = null;
        this.k = null;
        this.b = cArr;
        this.c = i;
        this.d = i2;
        if (this.f) {
            c();
        }
    }

    public final int m() {
        if (this.c >= 0) {
            return this.d;
        }
        char[] cArr = this.k;
        if (cArr != null) {
            return cArr.length;
        }
        String str = this.j;
        return str != null ? str.length() : this.g + this.i;
    }

    public final void n(int i) {
        int i2 = this.d;
        this.d = 0;
        char[] cArr = this.b;
        this.b = null;
        int i3 = this.c;
        this.c = -1;
        int i4 = i + i2;
        char[] cArr2 = this.h;
        if (cArr2 == null || i4 > cArr2.length) {
            this.h = b(i4);
        }
        if (i2 > 0) {
            System.arraycopy(cArr, i3, this.h, 0, i2);
        }
        this.g = 0;
        this.i = i2;
    }

    public final void o(int i) throws StreamConstraintsException {
        sa6 sa6Var = this.l;
        if (i <= 20000000) {
            sa6Var.getClass();
            return;
        }
        Integer numValueOf = Integer.valueOf(i);
        sa6Var.getClass();
        sa6.b("String value length (%d) exceeds the maximum allowed (%d, from %s)", numValueOf, 20000000, sa6.a("getMaxStringLength"));
        throw null;
    }

    public final String toString() {
        try {
            return f();
        } catch (IOException unused) {
            return "TextBuffer: Exception when reading contents";
        }
    }
}
