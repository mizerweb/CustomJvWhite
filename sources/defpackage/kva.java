package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kva implements lva {
    public final int a;
    public final tnh b;
    public final int c;
    public final long d;
    public final dz8 e;
    public final osf f;
    public final ynh g;
    public final msf h;

    public kva(int i, tnh tnhVar, int i2, long j, bz8 bz8Var, tnh tnhVar2, msf msfVar, int i3) {
        bz8Var = (i3 & 16) != 0 ? null : bz8Var;
        tnhVar2 = (i3 & 64) != 0 ? null : tnhVar2;
        this.a = i;
        this.b = tnhVar;
        this.c = i2;
        this.d = j;
        this.e = bz8Var;
        this.f = osf.b;
        this.g = tnhVar2;
        this.h = msfVar;
    }

    @Override // defpackage.psf
    public final int A() {
        return this.c;
    }

    @Override // defpackage.lva
    public final int a() {
        return this.a;
    }

    @Override // defpackage.lva, defpackage.psf
    public final msf d() {
        return this.h;
    }

    @Override // defpackage.lva, defpackage.psf
    public final dz8 e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kva)) {
            return false;
        }
        kva kvaVar = (kva) obj;
        return this.a == kvaVar.a && this.b.equals(kvaVar.b) && this.c == kvaVar.c && this.d == kvaVar.d && cqk.d(this.e, kvaVar.e) && this.f == kvaVar.f && cqk.d(this.g, kvaVar.g) && this.h.equals(kvaVar.h);
    }

    @Override // defpackage.lva, defpackage.psf
    public final ynh f() {
        return this.g;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.d;
    }

    @Override // defpackage.psf
    public final ynh getTitle() {
        return this.b;
    }

    @Override // defpackage.lva, defpackage.psf
    public final osf getType() {
        return this.f;
    }

    public final int hashCode() {
        int iG = qt4.g(zo5.c(this.c, zo5.c(this.b.c, qt4.D(this.a) * 31, 31), 31), 31, this.d);
        dz8 dz8Var = this.e;
        int iHashCode = (this.f.hashCode() + ((iG + (dz8Var == null ? 0 : dz8Var.hashCode())) * 31)) * 31;
        ynh ynhVar = this.g;
        return this.h.hashCode() + ((iHashCode + (ynhVar != null ? ynhVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Setting(sectionItemType=");
        sb.append(pye.q(this.a));
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", sectionId=");
        c0a.v(sb, this.c, ", itemId=", this.d);
        sb.append(", leadingElementProperties=");
        sb.append(this.e);
        sb.append(", type=");
        sb.append(this.f);
        sb.append(", descriptionRes=");
        sb.append(this.g);
        sb.append(", endView=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }
}
