package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class raf implements waf {
    public final int a;
    public final tnh b;
    public final int c;
    public final long d;
    public final osf e;
    public final ynh f;
    public final msf g;
    public final dz8 h;
    public final esf i;
    public final cf7 j;
    public final boolean k;

    public raf(int i, tnh tnhVar, int i2, long j, osf osfVar, tnh tnhVar2, msf msfVar, bz8 bz8Var, csf csfVar, chf chfVar, boolean z, int i3) {
        osfVar = (i3 & 16) != 0 ? osf.b : osfVar;
        tnhVar2 = (i3 & 32) != 0 ? null : tnhVar2;
        bz8Var = (i3 & np0.m) != 0 ? null : bz8Var;
        csfVar = (i3 & np0.n) != 0 ? null : csfVar;
        chfVar = (i3 & np0.o) != 0 ? null : chfVar;
        z = (i3 & 1024) != 0 ? true : z;
        this.a = i;
        this.b = tnhVar;
        this.c = i2;
        this.d = j;
        this.e = osfVar;
        this.f = tnhVar2;
        this.g = msfVar;
        this.h = bz8Var;
        this.i = csfVar;
        this.j = chfVar;
        this.k = z;
    }

    @Override // defpackage.psf
    public final int A() {
        return this.c;
    }

    @Override // defpackage.waf
    public final int a() {
        return this.a;
    }

    @Override // defpackage.waf, defpackage.psf
    public final esf b() {
        return this.i;
    }

    @Override // defpackage.waf, defpackage.psf
    public final msf d() {
        return this.g;
    }

    @Override // defpackage.waf, defpackage.psf
    public final dz8 e() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof raf)) {
            return false;
        }
        raf rafVar = (raf) obj;
        return this.a == rafVar.a && this.b.equals(rafVar.b) && this.c == rafVar.c && this.d == rafVar.d && this.e == rafVar.e && cqk.d(this.f, rafVar.f) && this.g.equals(rafVar.g) && cqk.d(this.h, rafVar.h) && cqk.d(this.i, rafVar.i) && cqk.d(this.j, rafVar.j) && this.k == rafVar.k;
    }

    @Override // defpackage.waf, defpackage.psf
    public final ynh f() {
        return this.f;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.d;
    }

    @Override // defpackage.psf
    public final ynh getTitle() {
        return this.b;
    }

    @Override // defpackage.waf, defpackage.psf
    public final osf getType() {
        return this.e;
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + qt4.g(zo5.c(this.c, zo5.c(this.b.c, qt4.D(this.a) * 31, 31), 31), 31, this.d)) * 31;
        ynh ynhVar = this.f;
        int iHashCode2 = (this.g.hashCode() + ((iHashCode + (ynhVar == null ? 0 : ynhVar.hashCode())) * 31)) * 31;
        dz8 dz8Var = this.h;
        int iHashCode3 = (iHashCode2 + (dz8Var == null ? 0 : dz8Var.hashCode())) * 31;
        esf esfVar = this.i;
        int iHashCode4 = (iHashCode3 + (esfVar == null ? 0 : esfVar.hashCode())) * 31;
        cf7 cf7Var = this.j;
        return Boolean.hashCode(this.k) + ((iHashCode4 + (cf7Var != null ? cf7Var.hashCode() : 0)) * 31);
    }

    @Override // defpackage.psf, defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return R.id.oneme_settings_privacy_screen_settings_item_vh;
    }

    @Override // defpackage.waf
    public final cf7 p() {
        return this.j;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SettingPrivacyItem(sectionItemType=");
        sb.append(pye.q(this.a));
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", sectionId=");
        c0a.v(sb, this.c, ", itemId=", this.d);
        sb.append(", type=");
        sb.append(this.e);
        sb.append(", descriptionRes=");
        sb.append(this.f);
        sb.append(", endView=");
        sb.append(this.g);
        sb.append(", leadingElementProperties=");
        sb.append(this.h);
        sb.append(", counterType=");
        sb.append(this.i);
        sb.append(", sectionBorderColor=");
        sb.append(this.j);
        return nbh.z(sb, ", clickable=", this.k, ")");
    }
}
