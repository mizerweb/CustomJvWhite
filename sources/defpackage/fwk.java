package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class fwk extends iwk {
    final transient int d;
    final transient int e;
    final /* synthetic */ iwk f;

    public fwk(iwk iwkVar, int i, int i2) {
        this.f = iwkVar;
        this.d = i;
        this.e = i2;
    }

    @Override // defpackage.tvk
    public final int b() {
        return this.f.c() + this.d + this.e;
    }

    @Override // defpackage.tvk
    public final int c() {
        return this.f.c() + this.d;
    }

    @Override // defpackage.tvk
    public final Object[] f() {
        return this.f.f();
    }

    @Override // defpackage.iwk, java.util.List
    /* JADX INFO: renamed from: g */
    public final iwk subList(int i, int i2) {
        vpk.e(i, i2, this.e);
        int i3 = this.d;
        return this.f.subList(i + i3, i2 + i3);
    }

    @Override // java.util.List
    public final Object get(int i) {
        vpk.a(i, this.e, "index");
        return this.f.get(i + this.d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.e;
    }
}
