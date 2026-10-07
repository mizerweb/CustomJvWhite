package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class vcm extends xyl {
    public final transient Object[] c;
    public final transient int d;
    public final transient int e = 1;

    public vcm(Object[] objArr, int i) {
        this.c = objArr;
        this.d = i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        e9i.O0(i, this.e);
        Object obj = this.c[i + i + this.d];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.e;
    }
}
