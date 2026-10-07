package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class laf implements oaf {
    public final tnh a;
    public final long b;

    public laf(tnh tnhVar, long j) {
        this.a = tnhVar;
        this.b = j;
    }

    @Override // defpackage.psf
    public final int A() {
        return 1;
    }

    @Override // defpackage.oaf
    public final int a() {
        return 4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof laf)) {
            return false;
        }
        laf lafVar = (laf) obj;
        return this.a.equals(lafVar.a) && this.b == lafVar.b;
    }

    @Override // defpackage.oaf
    public final boolean g() {
        return false;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.b;
    }

    @Override // defpackage.psf
    public final ynh getTitle() {
        return this.a;
    }

    public final int hashCode() {
        return qt4.D(4) + qt4.g(zo5.c(1, Integer.hashCode(this.a.c) * 31, 31), 31, this.b);
    }

    @Override // defpackage.psf, defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return R.id.oneme_settings_battery_screen_settings_footer_vh;
    }

    public final String toString() {
        return "Footer(title=" + this.a + ", sectionId=1, itemId=" + this.b + ", sectionItemType=" + pye.q(4) + ")";
    }
}
