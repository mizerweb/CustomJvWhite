package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class c8i implements d8i {
    public final int a;
    public final tnh b;
    public final int c;
    public final long d;
    public final osf e;
    public final ynh f;
    public final msf g;

    public c8i(int i, tnh tnhVar, int i2, long j, xnh xnhVar, int i3) {
        osf osfVar = (i3 & 16) != 0 ? osf.b : osf.d;
        xnhVar = (i3 & 32) != 0 ? null : xnhVar;
        fsf fsfVar = (i3 & 64) != 0 ? fsf.a : null;
        this.a = i;
        this.b = tnhVar;
        this.c = i2;
        this.d = j;
        this.e = osfVar;
        this.f = xnhVar;
        this.g = fsfVar;
    }

    @Override // defpackage.psf
    public final int A() {
        return this.c;
    }

    @Override // defpackage.d8i
    public final int a() {
        return this.a;
    }

    @Override // defpackage.d8i, defpackage.psf
    public final msf d() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c8i)) {
            return false;
        }
        c8i c8iVar = (c8i) obj;
        return this.a == c8iVar.a && this.b.equals(c8iVar.b) && this.c == c8iVar.c && this.d == c8iVar.d && this.e == c8iVar.e && cqk.d(this.f, c8iVar.f) && cqk.d(this.g, c8iVar.g);
    }

    @Override // defpackage.d8i, defpackage.psf
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

    @Override // defpackage.d8i, defpackage.psf
    public final osf getType() {
        return this.e;
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + qt4.g(zo5.c(this.c, zo5.c(this.b.c, qt4.D(this.a) * 31, 31), 31), 31, this.d)) * 31;
        ynh ynhVar = this.f;
        int iHashCode2 = (iHashCode + (ynhVar == null ? 0 : ynhVar.hashCode())) * 31;
        msf msfVar = this.g;
        return iHashCode2 + (msfVar != null ? msfVar.hashCode() : 0);
    }

    @Override // defpackage.psf, defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return R.id.oneme_settings_twofa_configuration_setting_item;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Setting(sectionItemType=");
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
        sb.append(")");
        return sb.toString();
    }
}
