package defpackage;

import java.util.Arrays;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes.dex */
public final class vi9 implements Cloneable {
    public /* synthetic */ boolean a;
    public /* synthetic */ long[] b;
    public /* synthetic */ Object[] c;
    public /* synthetic */ int d;

    public vi9(int i) {
        if (i == 0) {
            this.b = rx8.c;
            this.c = rx8.d;
            return;
        }
        int i2 = i * 8;
        for (int i3 = 4; i3 < 32; i3++) {
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
        }
        int i5 = i2 / 8;
        this.b = new long[i5];
        this.c = new Object[i5];
    }

    public final void a() {
        int i = this.d;
        Object[] objArr = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.d = 0;
        this.a = false;
    }

    public final Object b(long j) {
        Object obj;
        int i = rx8.i(this.d, j, this.b);
        if (i < 0 || (obj = this.c[i]) == qyj.c) {
            return null;
        }
        return obj;
    }

    public final int c(long j) {
        if (this.a) {
            int i = this.d;
            long[] jArr = this.b;
            Object[] objArr = this.c;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != qyj.c) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.a = false;
            this.d = i2;
        }
        return rx8.i(this.d, j, this.b);
    }

    public final Object clone() {
        vi9 vi9Var = (vi9) super.clone();
        vi9Var.b = (long[]) this.b.clone();
        vi9Var.c = (Object[]) this.c.clone();
        return vi9Var;
    }

    public final boolean d() {
        return i() == 0;
    }

    public final long e(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.d)) {
            gol.c("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        if (this.a) {
            long[] jArr = this.b;
            Object[] objArr = this.c;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != qyj.c) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.a = false;
            this.d = i3;
        }
        return this.b[i];
    }

    public final void f(long j, Object obj) {
        Object obj2 = qyj.c;
        int i = rx8.i(this.d, j, this.b);
        if (i >= 0) {
            this.c[i] = obj;
            return;
        }
        int i2 = ~i;
        int i3 = this.d;
        if (i2 < i3) {
            Object[] objArr = this.c;
            if (objArr[i2] == obj2) {
                this.b[i2] = j;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.a) {
            long[] jArr = this.b;
            if (i3 >= jArr.length) {
                Object[] objArr2 = this.c;
                int i4 = 0;
                for (int i5 = 0; i5 < i3; i5++) {
                    Object obj3 = objArr2[i5];
                    if (obj3 != obj2) {
                        if (i5 != i4) {
                            jArr[i4] = jArr[i5];
                            objArr2[i4] = obj3;
                            objArr2[i5] = null;
                        }
                        i4++;
                    }
                }
                this.a = false;
                this.d = i4;
                i2 = ~rx8.i(i4, j, this.b);
            }
        }
        int i6 = this.d;
        if (i6 >= this.b.length) {
            int i7 = (i6 + 1) * 8;
            for (int i8 = 4; i8 < 32; i8++) {
                int i9 = (1 << i8) - 12;
                if (i7 <= i9) {
                    i7 = i9;
                    break;
                }
            }
            int i10 = i7 / 8;
            this.b = Arrays.copyOf(this.b, i10);
            this.c = Arrays.copyOf(this.c, i10);
        }
        int i11 = this.d - i2;
        if (i11 != 0) {
            long[] jArr2 = this.b;
            int i12 = i2 + 1;
            System.arraycopy(jArr2, i2, jArr2, i12, i11);
            Object[] objArr3 = this.c;
            a.Q0(i12, i2, this.d, objArr3, objArr3);
        }
        this.b[i2] = j;
        this.c[i2] = obj;
        this.d++;
    }

    public final void g(vi9 vi9Var) {
        int i = vi9Var.i();
        for (int i2 = 0; i2 < i; i2++) {
            f(vi9Var.e(i2), vi9Var.j(i2));
        }
    }

    public final void h(long j) {
        int i = rx8.i(this.d, j, this.b);
        if (i >= 0) {
            Object[] objArr = this.c;
            Object obj = objArr[i];
            Object obj2 = qyj.c;
            if (obj != obj2) {
                objArr[i] = obj2;
                this.a = true;
            }
        }
    }

    public final int i() {
        if (this.a) {
            int i = this.d;
            long[] jArr = this.b;
            Object[] objArr = this.c;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != qyj.c) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.a = false;
            this.d = i2;
        }
        return this.d;
    }

    public final Object j(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.d)) {
            gol.c("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        if (this.a) {
            long[] jArr = this.b;
            Object[] objArr = this.c;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != qyj.c) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.a = false;
            this.d = i3;
        }
        return this.c[i];
    }

    public final String toString() {
        if (i() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.d * 28);
        sb.append('{');
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(e(i2));
            sb.append('=');
            Object objJ = j(i2);
            if (objJ != sb) {
                sb.append(objJ);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public /* synthetic */ vi9(Object obj) {
        this(10);
    }
}
