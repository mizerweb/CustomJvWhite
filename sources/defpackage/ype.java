package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
public final class ype extends b2 implements RandomAccess {
    public final Object[] a;
    public final int b;
    public int c;
    public int d;

    public ype(Object[] objArr, int i) {
        this.a = objArr;
        if (i < 0) {
            c.o(zo5.h(i, "ring buffer filled size should not be negative but it is "));
            throw null;
        }
        if (i <= objArr.length) {
            this.b = objArr.length;
            this.d = i;
        } else {
            StringBuilder sbY = zo5.y(i, "ring buffer filled size: ", " cannot be larger than the buffer size: ");
            sbY.append(objArr.length);
            throw new IllegalArgumentException(sbY.toString().toString());
        }
    }

    public final void a(Object obj) {
        if (c()) {
            ore.k("ring buffer is full");
            return;
        }
        this.a[(getSize() + this.c) % this.b] = obj;
        this.d = getSize() + 1;
    }

    public final ype b(int i) {
        int i2 = this.b;
        int i3 = i2 + (i2 >> 1) + 1;
        if (i3 <= i) {
            i = i3;
        }
        return new ype(this.c == 0 ? Arrays.copyOf(this.a, i) : toArray(new Object[i]), getSize());
    }

    public final boolean c() {
        return getSize() == this.b;
    }

    public final void d(int i) {
        if (i < 0) {
            c.o(zo5.h(i, "n shouldn't be negative but it is "));
            return;
        }
        if (i > this.d) {
            StringBuilder sbY = zo5.y(i, "n shouldn't be greater than the buffer size: n = ", ", size = ");
            sbY.append(this.d);
            throw new IllegalArgumentException(sbY.toString().toString());
        }
        if (i > 0) {
            int i2 = this.c;
            int i3 = this.b;
            int i4 = (i2 + i) % i3;
            Object[] objArr = this.a;
            if (i2 > i4) {
                Arrays.fill(objArr, i2, i3, (Object) null);
                Arrays.fill(objArr, 0, i4, (Object) null);
            } else {
                Arrays.fill(objArr, i2, i4, (Object) null);
            }
            this.c = i4;
            this.d -= i;
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        int size = getSize();
        if (i < 0 || i >= size) {
            c.r(qt4.l("index: ", i, size, ", size: "));
            return null;
        }
        return this.a[(this.c + i) % this.b];
    }

    @Override // defpackage.b2
    public final int getSize() {
        return this.d;
    }

    @Override // defpackage.b2, java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new xpe(this);
    }

    @Override // defpackage.b2, java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Object[] objArr2;
        int length = objArr.length;
        int i = this.d;
        if (length < i) {
            objArr = Arrays.copyOf(objArr, i);
        }
        int i2 = this.d;
        int i3 = this.c;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            objArr2 = this.a;
            if (i5 >= i2 || i3 >= this.b) {
                break;
            }
            objArr[i5] = objArr2[i3];
            i5++;
            i3++;
        }
        while (i5 < i2) {
            objArr[i5] = objArr2[i4];
            i5++;
            i4++;
        }
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // defpackage.b2, java.util.List, java.util.Collection
    public final Object[] toArray() {
        return toArray(new Object[getSize()]);
    }

    public ype(int i) {
        this(new Object[i], 0);
    }
}
