package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class naf implements oaf {
    public final int a;
    public final tnh b;
    public final int c;
    public final long d;
    public final osf e;
    public final ynh f;
    public final msf g;

    public naf(int i, tnh tnhVar, int i2, long j, tnh tnhVar2, msf msfVar, int i3) {
        tnhVar2 = (i3 & 32) != 0 ? null : tnhVar2;
        this.a = i;
        this.b = tnhVar;
        this.c = i2;
        this.d = j;
        this.e = osf.b;
        this.f = tnhVar2;
        this.g = msfVar;
    }

    @Override // defpackage.psf
    public final int A() {
        return this.c;
    }

    @Override // defpackage.oaf
    public final int a() {
        return this.a;
    }

    @Override // defpackage.oaf, defpackage.psf
    public final msf d() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof naf)) {
            return false;
        }
        naf nafVar = (naf) obj;
        return this.a == nafVar.a && this.b.equals(nafVar.b) && this.c == nafVar.c && this.d == nafVar.d && this.e == nafVar.e && cqk.d(this.f, nafVar.f) && this.g.equals(nafVar.g);
    }

    @Override // defpackage.oaf, defpackage.psf
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

    @Override // defpackage.oaf, defpackage.psf
    public final osf getType() {
        return this.e;
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + qt4.g(zo5.c(this.c, zo5.c(this.b.c, qt4.D(this.a) * 31, 31), 31), 31, this.d)) * 31;
        ynh ynhVar = this.f;
        return this.g.hashCode() + ((iHashCode + (ynhVar == null ? 0 : ynhVar.hashCode())) * 31);
    }

    @Override // defpackage.psf, defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return R.id.oneme_settings_battery_screen_settings_item_vh;
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
        sb.append(")");
        return sb.toString();
    }
}
