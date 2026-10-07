package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class saf implements waf {
    public final ynh a;
    public final cf7 b;

    public saf(ynh ynhVar, chf chfVar) {
        int i = x7c.o;
        this.a = ynhVar;
        this.b = chfVar;
    }

    @Override // defpackage.psf
    public final int A() {
        return 0;
    }

    @Override // defpackage.waf
    public final int a() {
        return 3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof saf)) {
            return false;
        }
        saf safVar = (saf) obj;
        if (!this.a.equals(safVar.a)) {
            return false;
        }
        long j = x7c.m;
        return j == j && cqk.d(this.b, safVar.b);
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return x7c.m;
    }

    @Override // defpackage.psf
    public final ynh getTitle() {
        return this.a;
    }

    public final int hashCode() {
        int iF = c0a.f(3, qt4.g(zo5.c(0, this.a.hashCode() * 31, 31), 31, x7c.m), 31);
        cf7 cf7Var = this.b;
        return iF + (cf7Var != null ? cf7Var.hashCode() : 0);
    }

    @Override // defpackage.psf, defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return R.id.oneme_settings_privacy_screen_settings_warning_vh;
    }

    @Override // defpackage.waf
    public final cf7 p() {
        return this.b;
    }

    public final String toString() {
        return "Warning(title=" + this.a + ", sectionId=0, itemId=" + x7c.m + ", sectionItemType=LAST, sectionBorderColor=" + this.b + ")";
    }
}
