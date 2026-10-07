package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class lbf implements nbf {
    public final tnh a;
    public final long b;
    public final xnh c;

    public lbf(tnh tnhVar, long j, xnh xnhVar) {
        this.a = tnhVar;
        this.b = j;
        this.c = xnhVar;
    }

    @Override // defpackage.psf
    public final int A() {
        return 1;
    }

    @Override // defpackage.nbf
    public final int a() {
        return 3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lbf)) {
            return false;
        }
        lbf lbfVar = (lbf) obj;
        return this.a.equals(lbfVar.a) && this.b == lbfVar.b && this.c.equals(lbfVar.c);
    }

    @Override // defpackage.psf
    public final ynh f() {
        return this.c;
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
        return this.c.hashCode() + c0a.f(3, qt4.g(zo5.c(1, Integer.hashCode(this.a.c) * 31, 31), 31, this.b), 31);
    }

    @Override // defpackage.psf, defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return R.id.oneme_settings_storage_screen_settings_button_vh;
    }

    public final String toString() {
        return "ClearCacheButton(title=" + this.a + ", sectionId=1, itemId=" + this.b + ", sectionItemType=LAST, descriptionRes=" + this.c + ")";
    }
}
