package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class y7m extends xyl {
    public static final y7m e = new y7m(new Object[0], 0);
    public final transient Object[] c;
    public final transient int d;

    public y7m(Object[] objArr, int i) {
        this.c = objArr;
        this.d = i;
    }

    @Override // defpackage.xyl, defpackage.apl
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.c;
        int i = this.d;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // defpackage.apl
    public final int b() {
        return this.d;
    }

    @Override // defpackage.apl
    public final int c() {
        return 0;
    }

    @Override // defpackage.apl
    public final Object[] d() {
        return this.c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        e9i.O0(i, this.d);
        Object obj = this.c[i];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
