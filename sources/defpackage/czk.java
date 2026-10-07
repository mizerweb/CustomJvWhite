package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class czk extends iwk {
    static final iwk f = new czk(new Object[0], 0);
    final transient Object[] d;
    private final transient int e;

    public czk(Object[] objArr, int i) {
        this.d = objArr;
        this.e = i;
    }

    @Override // defpackage.iwk, defpackage.tvk
    public final int a(Object[] objArr, int i) {
        System.arraycopy(this.d, 0, objArr, i, this.e);
        return i + this.e;
    }

    @Override // defpackage.tvk
    public final int b() {
        return this.e;
    }

    @Override // defpackage.tvk
    public final int c() {
        return 0;
    }

    @Override // defpackage.tvk
    public final Object[] f() {
        return this.d;
    }

    @Override // java.util.List
    public final Object get(int i) {
        vpk.a(i, this.e, "index");
        Object obj = this.d[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.e;
    }
}
