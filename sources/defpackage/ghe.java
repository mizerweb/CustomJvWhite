package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ghe extends c98 {
    public static final ghe e = new ghe(new Object[0], 0);
    public final transient Object[] c;
    public final transient int d;

    public ghe(Object[] objArr, int i) {
        this.c = objArr;
        this.d = i;
    }

    @Override // defpackage.c98, defpackage.s88
    public final int b(Object[] objArr, int i) {
        Object[] objArr2 = this.c;
        int i2 = this.d;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // defpackage.s88
    public final Object[] c() {
        return this.c;
    }

    @Override // defpackage.s88
    public final int d() {
        return this.d;
    }

    @Override // defpackage.s88
    public final int f() {
        return 0;
    }

    @Override // defpackage.s88
    public final boolean g() {
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        lvb.U(i, this.d);
        Object obj = this.c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
