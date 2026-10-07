package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class zf1 implements ag1 {
    public final tnh a;

    public zf1(tnh tnhVar) {
        int i = vyb.u;
        this.a = tnhVar;
    }

    @Override // defpackage.psf
    public final int A() {
        return 0;
    }

    @Override // defpackage.ag1
    public final int a() {
        return 4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zf1) || !this.a.equals(((zf1) obj).a)) {
            return false;
        }
        long j = vyb.p;
        return j == j;
    }

    @Override // defpackage.ag1
    public final boolean g() {
        return false;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return vyb.p;
    }

    @Override // defpackage.psf
    public final ynh getTitle() {
        return this.a;
    }

    public final int hashCode() {
        return qt4.D(4) + qt4.g(zo5.c(0, Integer.hashCode(this.a.c) * 31, 31), 31, vyb.p);
    }

    @Override // defpackage.psf, defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return R.id.call_debug_menu_settings_header_vh;
    }

    public final String toString() {
        return "Header(title=" + this.a + ", sectionId=0, itemId=" + vyb.p + ", sectionItemType=" + pye.q(4) + ")";
    }
}
