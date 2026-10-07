package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class r4l extends v4l {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ v4l e;

    public r4l(v4l v4lVar, int i, int i2) {
        this.e = v4lVar;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.j4l
    public final Object[] a() {
        return this.e.a();
    }

    @Override // defpackage.j4l
    public final int b() {
        return this.e.b() + this.c;
    }

    @Override // defpackage.j4l
    public final int c() {
        return this.e.b() + this.c + this.d;
    }

    @Override // defpackage.j4l
    public final boolean d() {
        return true;
    }

    @Override // defpackage.v4l, java.util.List
    /* JADX INFO: renamed from: g */
    public final v4l subList(int i, int i2) {
        srh.c(i, i2, this.d);
        int i3 = this.c;
        return this.e.subList(i + i3, i2 + i3);
    }

    @Override // java.util.List
    public final Object get(int i) {
        srh.b(i, this.d);
        return this.e.get(i + this.c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
