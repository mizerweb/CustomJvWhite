package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ctf implements psf {
    public final long a;
    public final int b;
    public final ynh c;
    public final ynh d;
    public final osf e;
    public final ynh f;
    public final dz8 g;
    public final msf h;
    public final esf i;
    public final boolean j;
    public final ynh k;

    public /* synthetic */ ctf(long j, int i, ynh ynhVar, tnh tnhVar, osf osfVar, ynh ynhVar2, dz8 dz8Var, msf msfVar, csf csfVar, boolean z, ynh ynhVar3, int i2) {
        this(j, i, ynhVar, (i2 & 8) != 0 ? ynh.b : tnhVar, (i2 & 16) != 0 ? osf.b : osfVar, (i2 & 32) != 0 ? null : ynhVar2, (i2 & 64) != 0 ? null : dz8Var, (i2 & np0.m) != 0 ? null : msfVar, (i2 & np0.n) != 0 ? null : csfVar, (i2 & np0.o) != 0 ? false : z, (i2 & 1024) != 0 ? null : ynhVar3);
    }

    public static ctf i(ctf ctfVar, rnh rnhVar, isf isfVar, dsf dsfVar, int i) {
        long j = ctfVar.a;
        int i2 = ctfVar.b;
        ynh ynhVar = (i & 4) != 0 ? ctfVar.c : rnhVar;
        ynh ynhVar2 = ctfVar.d;
        osf osfVar = ctfVar.e;
        ynh ynhVar3 = ctfVar.f;
        dz8 dz8Var = ctfVar.g;
        msf msfVar = (i & np0.m) != 0 ? ctfVar.h : isfVar;
        esf esfVar = (i & np0.n) != 0 ? ctfVar.i : dsfVar;
        boolean z = ctfVar.j;
        ynh ynhVar4 = ctfVar.k;
        ctfVar.getClass();
        return new ctf(j, i2, ynhVar, ynhVar2, osfVar, ynhVar3, dz8Var, msfVar, esfVar, z, ynhVar4);
    }

    @Override // defpackage.psf
    public final int A() {
        return this.b;
    }

    @Override // defpackage.psf
    public final esf b() {
        return this.i;
    }

    @Override // defpackage.psf
    public final ynh c() {
        return this.k;
    }

    @Override // defpackage.psf
    public final msf d() {
        return this.h;
    }

    @Override // defpackage.psf
    public final dz8 e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ctf)) {
            return false;
        }
        ctf ctfVar = (ctf) obj;
        return this.a == ctfVar.a && this.b == ctfVar.b && cqk.d(this.c, ctfVar.c) && cqk.d(this.d, ctfVar.d) && this.e == ctfVar.e && cqk.d(this.f, ctfVar.f) && cqk.d(this.g, ctfVar.g) && cqk.d(this.h, ctfVar.h) && cqk.d(this.i, ctfVar.i) && this.j == ctfVar.j && cqk.d(this.k, ctfVar.k);
    }

    @Override // defpackage.psf
    public final ynh f() {
        return this.f;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.a;
    }

    @Override // defpackage.psf
    public final ynh getTitle() {
        return this.c;
    }

    @Override // defpackage.psf
    public final osf getType() {
        return this.e;
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + bc1.h(bc1.h(zo5.c(this.b, Long.hashCode(this.a) * 31, 31), 31, this.c), 31, this.d)) * 31;
        ynh ynhVar = this.f;
        int iHashCode2 = (iHashCode + (ynhVar == null ? 0 : ynhVar.hashCode())) * 31;
        dz8 dz8Var = this.g;
        int iHashCode3 = (iHashCode2 + (dz8Var == null ? 0 : dz8Var.hashCode())) * 31;
        msf msfVar = this.h;
        int iHashCode4 = (iHashCode3 + (msfVar == null ? 0 : msfVar.hashCode())) * 31;
        esf esfVar = this.i;
        int iN = nbh.n((iHashCode4 + (esfVar == null ? 0 : esfVar.hashCode())) * 31, 31, this.j);
        ynh ynhVar2 = this.k;
        return iN + (ynhVar2 != null ? ynhVar2.hashCode() : 0);
    }

    @Override // defpackage.psf
    public final boolean t() {
        return this.j;
    }

    public final String toString() {
        StringBuilder sbQ = c0a.q(this.b, this.a, "SettingsItemModel(itemId=", ", sectionId=");
        sbQ.append(", title=");
        sbQ.append(this.c);
        sbQ.append(", titleSpanExt=");
        sbQ.append(this.d);
        sbQ.append(", type=");
        sbQ.append(this.e);
        sbQ.append(", descriptionRes=");
        sbQ.append(this.f);
        sbQ.append(", leadingElementProperties=");
        sbQ.append(this.g);
        sbQ.append(", endView=");
        sbQ.append(this.h);
        sbQ.append(", counterType=");
        sbQ.append(this.i);
        sbQ.append(", showTitleBadge=");
        sbQ.append(this.j);
        sbQ.append(", upperText=");
        sbQ.append(this.k);
        sbQ.append(")");
        return sbQ.toString();
    }

    @Override // defpackage.psf
    public final ynh v() {
        return this.d;
    }

    public ctf(long j, int i, ynh ynhVar, ynh ynhVar2, osf osfVar, ynh ynhVar3, dz8 dz8Var, msf msfVar, esf esfVar, boolean z, ynh ynhVar4) {
        this.a = j;
        this.b = i;
        this.c = ynhVar;
        this.d = ynhVar2;
        this.e = osfVar;
        this.f = ynhVar3;
        this.g = dz8Var;
        this.h = msfVar;
        this.i = esfVar;
        this.j = z;
        this.k = ynhVar4;
    }
}
