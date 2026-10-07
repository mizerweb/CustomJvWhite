package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class nnk extends snk {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ snk e;

    public nnk(snk snkVar, int i, int i2) {
        this.e = snkVar;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.zmk
    public final Object[] a() {
        return this.e.a();
    }

    @Override // defpackage.zmk
    public final int b() {
        return this.e.b() + this.c;
    }

    @Override // defpackage.zmk
    public final int c() {
        return this.e.b() + this.c + this.d;
    }

    @Override // defpackage.snk, java.util.List
    /* JADX INFO: renamed from: g */
    public final snk subList(int i, int i2) {
        e2k.g(i, i2, this.d);
        int i3 = this.c;
        return this.e.subList(i + i3, i2 + i3);
    }

    @Override // java.util.List
    public final Object get(int i) {
        e2k.f(i, this.d);
        return this.e.get(i + this.c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
