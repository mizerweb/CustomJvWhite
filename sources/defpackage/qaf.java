package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class qaf implements waf {
    public final tnh a;

    public qaf(tnh tnhVar) {
        int i = x7c.o;
        this.a = tnhVar;
    }

    @Override // defpackage.psf
    public final int A() {
        return 4;
    }

    @Override // defpackage.waf
    public final int a() {
        return 4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qaf) || !this.a.equals(((qaf) obj).a)) {
            return false;
        }
        long j = x7c.c;
        return j == j;
    }

    @Override // defpackage.waf
    public final boolean g() {
        return false;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return x7c.c;
    }

    @Override // defpackage.psf
    public final ynh getTitle() {
        return this.a;
    }

    public final int hashCode() {
        return qt4.D(4) + qt4.g(zo5.c(4, Integer.hashCode(this.a.c) * 31, 31), 31, x7c.c);
    }

    @Override // defpackage.psf, defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return R.id.oneme_settings_privacy_screen_settings_header_vh;
    }

    public final String toString() {
        return "Header(title=" + this.a + ", sectionId=4, itemId=" + x7c.c + ", sectionItemType=" + pye.q(4) + ")";
    }
}
