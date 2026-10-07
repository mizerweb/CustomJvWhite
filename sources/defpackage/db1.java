package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class db1 implements fb1 {
    public final tnh a;
    public final int b;

    public db1(int i, tnh tnhVar) {
        int i2 = vyb.u;
        this.a = tnhVar;
        this.b = i;
    }

    @Override // defpackage.psf
    public final int A() {
        return this.b;
    }

    @Override // defpackage.fb1
    public final int a() {
        return 4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof db1)) {
            return false;
        }
        db1 db1Var = (db1) obj;
        if (!this.a.equals(db1Var.a) || this.b != db1Var.b) {
            return false;
        }
        long j = vyb.b;
        return j == j;
    }

    @Override // defpackage.fb1
    public final boolean g() {
        return false;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return vyb.b;
    }

    @Override // defpackage.psf
    public final ynh getTitle() {
        return this.a;
    }

    public final int hashCode() {
        return qt4.D(4) + qt4.g(zo5.c(this.b, Integer.hashCode(this.a.c) * 31, 31), 31, vyb.b);
    }

    @Override // defpackage.psf, defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return R.id.call_admin_settings_header_vh;
    }

    public final String toString() {
        return "Header(title=" + this.a + ", sectionId=" + this.b + ", itemId=" + vyb.b + ", sectionItemType=" + pye.q(4) + ")";
    }
}
