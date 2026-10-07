package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class bbf implements ebf {
    public final int a;
    public final ynh b;
    public final int c;
    public final long d;
    public final osf e;
    public final ynh f;
    public final msf g;
    public final dz8 h;
    public final esf i;

    public /* synthetic */ bbf(int i, tnh tnhVar, int i2, long j, osf osfVar, tnh tnhVar2, msf msfVar, bz8 bz8Var, int i3) {
        this(i, tnhVar, i2, j, (i3 & 16) != 0 ? osf.b : osfVar, (i3 & 32) != 0 ? null : tnhVar2, msfVar, (i3 & np0.m) != 0 ? null : bz8Var, (i3 & np0.n) == 0 ? csf.a : null);
    }

    @Override // defpackage.psf
    public final int A() {
        return this.c;
    }

    @Override // defpackage.ebf
    public final int a() {
        return this.a;
    }

    @Override // defpackage.ebf, defpackage.psf
    public final esf b() {
        return this.i;
    }

    @Override // defpackage.ebf, defpackage.psf
    public final msf d() {
        return this.g;
    }

    @Override // defpackage.ebf, defpackage.psf
    public final dz8 e() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bbf)) {
            return false;
        }
        bbf bbfVar = (bbf) obj;
        return this.a == bbfVar.a && cqk.d(this.b, bbfVar.b) && this.c == bbfVar.c && this.d == bbfVar.d && this.e == bbfVar.e && cqk.d(this.f, bbfVar.f) && cqk.d(this.g, bbfVar.g) && cqk.d(this.h, bbfVar.h) && cqk.d(this.i, bbfVar.i);
    }

    @Override // defpackage.ebf, defpackage.psf
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

    @Override // defpackage.ebf, defpackage.psf
    public final osf getType() {
        return this.e;
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + qt4.g(zo5.c(this.c, bc1.h(qt4.D(this.a) * 31, 31, this.b), 31), 31, this.d)) * 31;
        ynh ynhVar = this.f;
        int iHashCode2 = (iHashCode + (ynhVar == null ? 0 : ynhVar.hashCode())) * 31;
        msf msfVar = this.g;
        int iHashCode3 = (iHashCode2 + (msfVar == null ? 0 : msfVar.hashCode())) * 31;
        dz8 dz8Var = this.h;
        int iHashCode4 = (iHashCode3 + (dz8Var == null ? 0 : dz8Var.hashCode())) * 31;
        esf esfVar = this.i;
        return iHashCode4 + (esfVar != null ? esfVar.hashCode() : 0);
    }

    @Override // defpackage.psf, defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return R.id.oneme_settings_media_screen_settings_item_vh;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SettingMediaItem(sectionItemType=");
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
        sb.append(")");
        return sb.toString();
    }

    public bbf(int i, ynh ynhVar, int i2, long j, osf osfVar, ynh ynhVar2, msf msfVar, dz8 dz8Var, esf esfVar) {
        this.a = i;
        this.b = ynhVar;
        this.c = i2;
        this.d = j;
        this.e = osfVar;
        this.f = ynhVar2;
        this.g = msfVar;
        this.h = dz8Var;
        this.i = esfVar;
    }
}
