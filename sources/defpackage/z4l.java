package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class z4l extends v4l {
    public static final z4l e = new z4l(new Object[0], 0);
    public final transient Object[] c;
    public final transient int d;

    public z4l(Object[] objArr, int i) {
        this.c = objArr;
        this.d = i;
    }

    @Override // defpackage.j4l
    public final Object[] a() {
        return this.c;
    }

    @Override // defpackage.j4l
    public final int b() {
        return 0;
    }

    @Override // defpackage.j4l
    public final int c() {
        return this.d;
    }

    @Override // defpackage.j4l
    public final boolean d() {
        return false;
    }

    @Override // defpackage.v4l, defpackage.j4l
    public final int f(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        srh.b(i, this.d);
        Object obj = this.c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
