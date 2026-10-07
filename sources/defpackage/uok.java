package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class uok extends jnk {
    public final transient Object[] c;
    public final transient int d;
    public final transient int e;

    public uok(Object[] objArr, int i, int i2) {
        this.c = objArr;
        this.d = i;
        this.e = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        qyj.Z(i, this.e);
        Object obj = this.c[i + i + this.d];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.e;
    }
}
