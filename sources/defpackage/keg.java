package defpackage;

import java.util.Arrays;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes.dex */
public final class keg implements Cloneable {
    public /* synthetic */ int[] a;
    public /* synthetic */ Object[] b;
    public /* synthetic */ int c;

    public keg(int i) {
        int i2;
        int i3 = 4;
        while (true) {
            i2 = 40;
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (40 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 4;
        this.a = new int[i5];
        this.b = new Object[i5];
    }

    public final Object a(int i) {
        Object obj;
        int iH = rx8.h(this.c, i, this.a);
        if (iH < 0 || (obj = this.b[iH]) == cqk.d) {
            return null;
        }
        return obj;
    }

    public final void b(int i, Object obj) {
        int iH = rx8.h(this.c, i, this.a);
        if (iH >= 0) {
            this.b[iH] = obj;
            return;
        }
        int i2 = ~iH;
        int i3 = this.c;
        if (i2 < i3) {
            Object[] objArr = this.b;
            if (objArr[i2] == cqk.d) {
                this.a[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (i3 >= this.a.length) {
            int i4 = (i3 + 1) * 4;
            for (int i5 = 4; i5 < 32; i5++) {
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
            }
            int i7 = i4 / 4;
            this.a = Arrays.copyOf(this.a, i7);
            this.b = Arrays.copyOf(this.b, i7);
        }
        int i8 = this.c;
        if (i8 - i2 != 0) {
            int[] iArr = this.a;
            int i9 = i2 + 1;
            a.P0(i9, i2, i8, iArr, iArr);
            Object[] objArr2 = this.b;
            a.Q0(i9, i2, this.c, objArr2, objArr2);
        }
        this.a[i2] = i;
        this.b[i2] = obj;
        this.c++;
    }

    public final Object c(int i) {
        Object[] objArr = this.b;
        if (i < objArr.length) {
            return objArr[i];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final Object clone() {
        keg kegVar = (keg) super.clone();
        kegVar.a = (int[]) this.a.clone();
        kegVar.b = (Object[]) this.b.clone();
        return kegVar;
    }

    public final String toString() {
        int i = this.c;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        int i2 = this.c;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(this.a[i3]);
            sb.append('=');
            Object objC = c(i3);
            if (objC != this) {
                sb.append(objC);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
