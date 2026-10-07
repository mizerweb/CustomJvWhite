package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class g7 implements i7 {
    public final bz8 a;
    public final tnh b;

    public g7(bz8 bz8Var, tnh tnhVar) {
        this.a = bz8Var;
        this.b = tnhVar;
    }

    @Override // defpackage.psf
    public final int A() {
        return 0;
    }

    @Override // defpackage.i7
    public final int a() {
        return 3;
    }

    @Override // defpackage.psf
    public final msf d() {
        return null;
    }

    @Override // defpackage.psf
    public final dz8 e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g7)) {
            return false;
        }
        g7 g7Var = (g7) obj;
        return this.a.equals(g7Var.a) && this.b.equals(g7Var.b);
    }

    @Override // defpackage.psf
    public final ynh f() {
        return null;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return -1L;
    }

    @Override // defpackage.psf
    public final ynh getTitle() {
        return this.b;
    }

    @Override // defpackage.psf
    public final osf getType() {
        return osf.a;
    }

    public final int hashCode() {
        return qt4.D(3) + qt4.g(zo5.c(0, zo5.c(this.b.c, this.a.hashCode() * 31, 31), 31), 31, -1L);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AddButton(leadingElementProperties=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", sectionId=0, itemId=-1, sectionItemType=");
        return zo5.w(sb, "LAST", ")");
    }
}
