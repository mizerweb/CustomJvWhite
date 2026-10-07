package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class nzk extends iwk {
    private final transient Object[] d;
    private final transient int e;
    private final transient int f = 1;

    public nzk(Object[] objArr, int i, int i2) {
        this.d = objArr;
        this.e = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        vpk.a(i, this.f, "index");
        Object obj = this.d[i + i + this.e];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f;
    }
}
