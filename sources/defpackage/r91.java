package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class r91 implements psf {
    public final int a;
    public final tnh b;
    public final long c;
    public final osf d;
    public final ynh e;
    public final msf f;
    public final bz8 g;
    public final int h;
    public final boolean i;

    public r91(tnh tnhVar, long j, tnh tnhVar2, Integer num, int i, boolean z, int i2) {
        osf osfVar = (i2 & 16) != 0 ? osf.b : osf.e;
        tnhVar2 = (i2 & 32) != 0 ? null : tnhVar2;
        fsf fsfVar = (i2 & 64) == 0 ? fsf.a : null;
        i = (i2 & np0.n) != 0 ? R.id.call_more_actions_vh : i;
        z = (i2 & np0.o) != 0 ? true : z;
        bz8 bz8Var = new bz8(num.intValue(), 0, 6);
        this.a = 4;
        this.b = tnhVar;
        this.c = j;
        this.d = osfVar;
        this.e = tnhVar2;
        this.f = fsfVar;
        this.g = bz8Var;
        this.h = i;
        this.i = z;
    }

    @Override // defpackage.psf
    public final int A() {
        return 0;
    }

    @Override // defpackage.psf
    public final esf b() {
        return null;
    }

    @Override // defpackage.psf
    public final ynh c() {
        return null;
    }

    @Override // defpackage.psf
    public final msf d() {
        return this.f;
    }

    @Override // defpackage.psf
    public final dz8 e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r91)) {
            return false;
        }
        r91 r91Var = (r91) obj;
        return this.a == r91Var.a && cqk.d(this.b, r91Var.b) && this.c == r91Var.c && this.d == r91Var.d && cqk.d(this.e, r91Var.e) && cqk.d(this.f, r91Var.f) && cqk.d(this.g, r91Var.g) && this.h == r91Var.h && this.i == r91Var.i;
    }

    @Override // defpackage.psf
    public final ynh f() {
        return this.e;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.c;
    }

    @Override // defpackage.psf
    public final ynh getTitle() {
        return this.b;
    }

    @Override // defpackage.psf
    public final osf getType() {
        return this.d;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + qt4.g(zo5.c(0, zo5.c(this.b.c, qt4.D(this.a) * 31, 31), 31), 31, this.c)) * 31;
        ynh ynhVar = this.e;
        int iHashCode2 = (iHashCode + (ynhVar == null ? 0 : ynhVar.hashCode())) * 31;
        msf msfVar = this.f;
        int iHashCode3 = (iHashCode2 + (msfVar == null ? 0 : msfVar.hashCode())) * 31;
        bz8 bz8Var = this.g;
        return Boolean.hashCode(this.i) + zo5.c(this.h, (iHashCode3 + (bz8Var != null ? bz8Var.hashCode() : 0)) * 31, 31);
    }

    @Override // defpackage.psf, defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return this.h;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionItem(sectionItemType=");
        sb.append(pye.q(this.a));
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", sectionId=0, itemId=");
        sb.append(this.c);
        sb.append(", type=");
        sb.append(this.d);
        sb.append(", descriptionRes=");
        sb.append(this.e);
        sb.append(", endView=");
        sb.append(this.f);
        sb.append(", leadingElementProperties=");
        sb.append(this.g);
        sb.append(", viewType=");
        sb.append(this.h);
        return nbh.z(sb, ", isAvailable=", this.i, ")");
    }
}
