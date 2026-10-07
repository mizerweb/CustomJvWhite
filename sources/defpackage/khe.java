package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class khe extends c98 {
    public final transient Object[] c;
    public final transient int d;
    public final transient int e;

    public khe(Object[] objArr, int i, int i2) {
        this.c = objArr;
        this.d = i;
        this.e = i2;
    }

    @Override // defpackage.s88
    public final boolean g() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        lvb.U(i, this.e);
        Object obj = this.c[(i * 2) + this.d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.e;
    }
}
