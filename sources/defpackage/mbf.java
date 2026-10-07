package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class mbf implements nbf {
    public final int a;
    public final tnh b;
    public final long c;
    public final osf d = osf.b;
    public final isf e;

    public mbf(int i, tnh tnhVar, long j, isf isfVar) {
        this.a = i;
        this.b = tnhVar;
        this.c = j;
        this.e = isfVar;
    }

    @Override // defpackage.psf
    public final int A() {
        return 1;
    }

    @Override // defpackage.nbf
    public final int a() {
        return this.a;
    }

    @Override // defpackage.nbf, defpackage.psf
    public final msf d() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mbf)) {
            return false;
        }
        mbf mbfVar = (mbf) obj;
        return this.a == mbfVar.a && this.b.equals(mbfVar.b) && this.c == mbfVar.c && this.d == mbfVar.d && this.e.equals(mbfVar.e);
    }

    @Override // defpackage.psf
    public final ynh f() {
        return null;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.c;
    }

    @Override // defpackage.psf
    public final ynh getTitle() {
        return this.b;
    }

    @Override // defpackage.nbf, defpackage.psf
    public final osf getType() {
        return this.d;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + qt4.g(zo5.c(1, zo5.c(this.b.c, qt4.D(this.a) * 31, 31), 31), 31, this.c)) * 961);
    }

    @Override // defpackage.psf, defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return R.id.oneme_settings_storage_screen_settings_item_vh;
    }

    public final String toString() {
        return "SettingStorageItem(sectionItemType=" + pye.q(this.a) + ", title=" + this.b + ", sectionId=1, itemId=" + this.c + ", type=" + this.d + ", descriptionRes=null, endView=" + this.e + ")";
    }
}
