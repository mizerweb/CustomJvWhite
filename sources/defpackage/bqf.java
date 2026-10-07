package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class bqf implements psf {
    public final long a;
    public final int b;
    public final aqf c;
    public final ynh d;

    public bqf(long j, int i, aqf aqfVar) {
        xnh xnhVar;
        this.a = j;
        this.b = i;
        this.c = aqfVar;
        if (aqfVar instanceof zpf) {
            xnhVar = ((zpf) aqfVar).a;
        } else {
            if (!(aqfVar instanceof ypf)) {
                ore.o();
                throw null;
            }
            xnhVar = ynh.b;
        }
        this.d = xnhVar;
    }

    @Override // defpackage.psf
    public final int A() {
        return this.b;
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
        return null;
    }

    @Override // defpackage.psf
    public final dz8 e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bqf)) {
            return false;
        }
        bqf bqfVar = (bqf) obj;
        return this.a == bqfVar.a && this.b == bqfVar.b && this.c.equals(bqfVar.c);
    }

    @Override // defpackage.psf
    public final ynh f() {
        return null;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.a;
    }

    @Override // defpackage.psf
    public final ynh getTitle() {
        return this.d;
    }

    @Override // defpackage.psf
    public final osf getType() {
        return osf.b;
    }

    public final int hashCode() {
        return this.c.hashCode() + zo5.c(this.b, Long.hashCode(this.a) * 31, 31);
    }

    @Override // defpackage.psf, defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return R.id.oneme_section_name_viewtype;
    }

    public final String toString() {
        StringBuilder sbQ = c0a.q(this.b, this.a, "SettingSectionNameItem(itemId=", ", sectionId=");
        sbQ.append(", titleElement=");
        sbQ.append(this.c);
        sbQ.append(")");
        return sbQ.toString();
    }
}
