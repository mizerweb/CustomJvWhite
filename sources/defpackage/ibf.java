package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ibf implements kbf {
    public final tnh a;

    public ibf(tnh tnhVar) {
        int i = y7c.f;
        this.a = tnhVar;
    }

    @Override // defpackage.psf
    public final int A() {
        return 1;
    }

    @Override // defpackage.kbf
    public final int a() {
        return 4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ibf) || !this.a.equals(((ibf) obj).a)) {
            return false;
        }
        long j = y7c.d;
        return j == j;
    }

    @Override // defpackage.kbf
    public final boolean g() {
        return false;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return y7c.d;
    }

    @Override // defpackage.psf
    public final ynh getTitle() {
        return this.a;
    }

    public final int hashCode() {
        return qt4.D(4) + qt4.g(zo5.c(1, Integer.hashCode(this.a.c) * 31, 31), 31, y7c.d);
    }

    @Override // defpackage.psf, defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return R.id.oneme_settings_ringtone_section_header_vh;
    }

    public final String toString() {
        return "Header(title=" + this.a + ", sectionId=1, itemId=" + y7c.d + ", sectionItemType=" + pye.q(4) + ")";
    }
}
