package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class cb1 implements fb1 {
    public final int a;
    public final tnh b;
    public final int c;
    public final long d;
    public final osf e;
    public final ynh f;
    public final ksf g;
    public final bz8 h;
    public final boolean i;
    public final int j;

    public cb1(int i, tnh tnhVar, int i2, long j, tnh tnhVar2, ksf ksfVar, Integer num, int i3) {
        tnhVar2 = (i3 & 32) != 0 ? null : tnhVar2;
        bz8 bz8Var = new bz8(num.intValue(), 0, 6);
        this.a = i;
        this.b = tnhVar;
        this.c = i2;
        this.d = j;
        this.e = osf.b;
        this.f = tnhVar2;
        this.g = ksfVar;
        this.h = bz8Var;
        this.i = true;
        this.j = R.id.call_admin_settings_item_vh;
    }

    @Override // defpackage.psf
    public final int A() {
        return this.c;
    }

    @Override // defpackage.fb1
    public final int a() {
        return this.a;
    }

    @Override // defpackage.fb1, defpackage.psf
    public final msf d() {
        return this.g;
    }

    @Override // defpackage.fb1, defpackage.psf
    public final dz8 e() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cb1)) {
            return false;
        }
        cb1 cb1Var = (cb1) obj;
        return this.a == cb1Var.a && cqk.d(this.b, cb1Var.b) && this.c == cb1Var.c && this.d == cb1Var.d && this.e == cb1Var.e && cqk.d(this.f, cb1Var.f) && cqk.d(this.g, cb1Var.g) && cqk.d(this.h, cb1Var.h) && this.i == cb1Var.i;
    }

    @Override // defpackage.fb1, defpackage.psf
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

    @Override // defpackage.fb1, defpackage.psf
    public final osf getType() {
        return this.e;
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + qt4.g(zo5.c(this.c, zo5.c(this.b.c, qt4.D(this.a) * 31, 31), 31), 31, this.d)) * 31;
        ynh ynhVar = this.f;
        int iHashCode2 = (iHashCode + (ynhVar == null ? 0 : ynhVar.hashCode())) * 31;
        ksf ksfVar = this.g;
        int iHashCode3 = (iHashCode2 + (ksfVar == null ? 0 : ksfVar.hashCode())) * 31;
        bz8 bz8Var = this.h;
        return Boolean.hashCode(this.i) + ((iHashCode3 + (bz8Var != null ? bz8Var.hashCode() : 0)) * 31);
    }

    @Override // defpackage.psf, defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return this.j;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallAdminSettingsItem(sectionItemType=");
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
        sb.append(", leadingElementProperties=");
        sb.append(this.h);
        return nbh.z(sb, ", clickable=", this.i, ")");
    }
}
