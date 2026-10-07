package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class lok extends jnk {
    public static final lok e = new lok(new Object[0], 0);
    public final transient Object[] c;
    public final transient int d;

    public lok(Object[] objArr, int i) {
        this.c = objArr;
        this.d = i;
    }

    @Override // defpackage.jnk, defpackage.wmk
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // defpackage.wmk
    public final int b() {
        return this.d;
    }

    @Override // defpackage.wmk
    public final int c() {
        return 0;
    }

    @Override // defpackage.wmk
    public final Object[] d() {
        return this.c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        qyj.Z(i, this.d);
        Object obj = this.c[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
