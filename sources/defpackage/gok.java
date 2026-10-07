package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class gok extends snk {
    public static final gok e = new gok(new Object[0], 0);
    public final transient Object[] c;
    public final transient int d;

    public gok(Object[] objArr, int i) {
        this.c = objArr;
        this.d = i;
    }

    @Override // defpackage.zmk
    public final Object[] a() {
        return this.c;
    }

    @Override // defpackage.zmk
    public final int b() {
        return 0;
    }

    @Override // defpackage.zmk
    public final int c() {
        return this.d;
    }

    @Override // defpackage.snk, defpackage.zmk
    public final int d(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        e2k.f(i, this.d);
        Object obj = this.c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
