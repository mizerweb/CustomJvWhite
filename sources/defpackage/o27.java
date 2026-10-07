package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class o27 implements psf {
    public final long a;
    public final tnh b;
    public final bz8 c;
    public final ksf d;
    public final int e;

    public o27(long j, tnh tnhVar, bz8 bz8Var, ksf ksfVar, int i) {
        this.a = j;
        this.b = tnhVar;
        this.c = bz8Var;
        this.d = ksfVar;
        this.e = i;
    }

    @Override // defpackage.psf
    public final int A() {
        return 0;
    }

    @Override // defpackage.psf
    public final esf b() {
        return null;
    }

    @Override // defpackage.psf
    public final ynh c() {
        return null;
    }

    @Override // defpackage.psf
    public final msf d() {
        return this.d;
    }

    @Override // defpackage.psf
    public final dz8 e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o27)) {
            return false;
        }
        o27 o27Var = (o27) obj;
        return this.a == o27Var.a && this.b.equals(o27Var.b) && this.c.equals(o27Var.c) && this.d.equals(o27Var.d) && this.e == o27Var.e;
    }

    @Override // defpackage.psf
    public final ynh f() {
        return null;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.a;
    }

    @Override // defpackage.psf
    public final ynh getTitle() {
        return this.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + zo5.c(0, (this.d.hashCode() + ((this.c.hashCode() + zo5.c(this.b.c, Long.hashCode(this.a) * 31, 31)) * 31)) * 923521, 31);
    }

    @Override // defpackage.psf, defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FolderEditFilterItem(itemId=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", leadingElementProperties=");
        sb.append(this.c);
        sb.append(", endView=");
        sb.append(this.d);
        return qv1.o(sb, ", upperText=null, descriptionRes=null, counterType=null, sectionId=0, viewType=", this.e, ")");
    }
}
