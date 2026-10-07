package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class eb1 implements fb1 {
    public final tnh a;

    public eb1(tnh tnhVar) {
        int i = vyb.u;
        this.a = tnhVar;
    }

    @Override // defpackage.psf
    public final int A() {
        return 0;
    }

    @Override // defpackage.fb1
    public final int a() {
        return 4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eb1) || !this.a.equals(((eb1) obj).a)) {
            return false;
        }
        long j = vyb.a;
        return j == j;
    }

    @Override // defpackage.fb1, defpackage.psf
    public final ynh f() {
        return null;
    }

    @Override // defpackage.fb1
    public final boolean g() {
        return false;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return vyb.a;
    }

    @Override // defpackage.psf
    public final ynh getTitle() {
        return this.a;
    }

    public final int hashCode() {
        return c0a.f(4, qt4.g(zo5.c(0, Integer.hashCode(this.a.c) * 31, 31), 31, vyb.a), 31);
    }

    @Override // defpackage.psf, defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return R.id.call_admin_settings_header_bottom_vh;
    }

    public final String toString() {
        return "HeaderBottom(title=" + this.a + ", sectionId=0, itemId=" + vyb.a + ", sectionItemType=" + pye.q(4) + ", descriptionRes=null)";
    }
}
