package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gnk extends jnk {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ jnk e;

    public gnk(jnk jnkVar, int i, int i2) {
        this.e = jnkVar;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.wmk
    public final int b() {
        return this.e.c() + this.c + this.d;
    }

    @Override // defpackage.wmk
    public final int c() {
        return this.e.c() + this.c;
    }

    @Override // defpackage.wmk
    public final Object[] d() {
        return this.e.d();
    }

    @Override // defpackage.jnk, java.util.List
    /* JADX INFO: renamed from: f */
    public final jnk subList(int i, int i2) {
        qyj.b0(i, i2, this.d);
        int i3 = this.c;
        return this.e.subList(i + i3, i2 + i3);
    }

    @Override // java.util.List
    public final Object get(int i) {
        qyj.Z(i, this.d);
        return this.e.get(i + this.c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }
}
