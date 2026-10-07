package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class swl extends xyl {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ xyl e;

    public swl(xyl xylVar, int i, int i2) {
        this.e = xylVar;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.apl
    public final int b() {
        return this.e.c() + this.c + this.d;
    }

    @Override // defpackage.apl
    public final int c() {
        return this.e.c() + this.c;
    }

    @Override // defpackage.apl
    public final Object[] d() {
        return this.e.d();
    }

    @Override // defpackage.xyl, java.util.List
    /* JADX INFO: renamed from: f */
    public final xyl subList(int i, int i2) {
        e9i.P0(i, i2, this.d);
        int i3 = this.c;
        return this.e.subList(i + i3, i2 + i3);
    }

    @Override // java.util.List
    public final Object get(int i) {
        e9i.O0(i, this.d);
        return this.e.get(i + this.c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
