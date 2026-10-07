package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class h7 implements i7 {
    public final dz8 a;
    public final ynh b;
    public final long c;
    public final int d;
    public final ynh e;
    public final osf f;
    public final esf g;

    public h7(dz8 dz8Var, ynh ynhVar, long j, int i, ynh ynhVar2, osf osfVar, esf esfVar) {
        this.a = dz8Var;
        this.b = ynhVar;
        this.c = j;
        this.d = i;
        this.e = ynhVar2;
        this.f = osfVar;
        this.g = esfVar;
    }

    public static h7 i(h7 h7Var, int i, dsf dsfVar, int i2) {
        dz8 dz8Var = h7Var.a;
        ynh ynhVar = h7Var.b;
        h7Var.getClass();
        long j = h7Var.c;
        if ((i2 & 16) != 0) {
            i = h7Var.d;
        }
        int i3 = i;
        ynh ynhVar2 = h7Var.e;
        osf osfVar = h7Var.f;
        esf esfVar = dsfVar;
        if ((i2 & np0.m) != 0) {
            esfVar = h7Var.g;
        }
        h7Var.getClass();
        return new h7(dz8Var, ynhVar, j, i3, ynhVar2, osfVar, esfVar);
    }

    @Override // defpackage.psf
    public final int A() {
        return 0;
    }

    @Override // defpackage.i7
    public final int a() {
        return this.d;
    }

    @Override // defpackage.i7, defpackage.psf
    public final esf b() {
        return this.g;
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
        if (!(obj instanceof h7)) {
            return false;
        }
        h7 h7Var = (h7) obj;
        return this.a.equals(h7Var.a) && this.b.equals(h7Var.b) && this.c == h7Var.c && this.d == h7Var.d && cqk.d(this.e, h7Var.e) && this.f == h7Var.f && cqk.d(this.g, h7Var.g);
    }

    @Override // defpackage.psf
    public final ynh f() {
        return this.e;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.c;
    }

    @Override // defpackage.psf
    public final ynh getTitle() {
        return this.b;
    }

    @Override // defpackage.psf
    public final osf getType() {
        return this.f;
    }

    public final int hashCode() {
        int iF = c0a.f(this.d, qt4.g(zo5.c(0, bc1.h(this.a.hashCode() * 31, 31, this.b), 31), 31, this.c), 31);
        ynh ynhVar = this.e;
        int iHashCode = (this.f.hashCode() + ((iF + (ynhVar == null ? 0 : ynhVar.hashCode())) * 31)) * 31;
        esf esfVar = this.g;
        return iHashCode + (esfVar != null ? esfVar.hashCode() : 0);
    }

    public final String toString() {
        return "Element(leadingElementProperties=" + this.a + ", title=" + this.b + ", sectionId=0, itemId=" + this.c + ", sectionItemType=" + pye.q(this.d) + ", descriptionRes=" + this.e + ", type=" + this.f + ", counterType=" + this.g + ")";
    }
}
