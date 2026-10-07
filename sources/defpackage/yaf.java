package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class yaf implements psf {
    public final long a;
    public final xnh b;
    public final xnh c;
    public final msf d;
    public final int e;

    public yaf(long j, xnh xnhVar, xnh xnhVar2, jsf jsfVar, int i) {
        this.a = j;
        this.b = xnhVar;
        this.c = xnhVar2;
        this.d = jsfVar;
        this.e = i;
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
        return this.d;
    }

    @Override // defpackage.psf
    public final dz8 e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yaf)) {
            return false;
        }
        yaf yafVar = (yaf) obj;
        return this.a == yafVar.a && this.b.equals(yafVar.b) && this.c.equals(yafVar.c) && cqk.d(this.d, yafVar.d) && this.e == yafVar.e;
    }

    @Override // defpackage.psf
    public final ynh f() {
        return this.c;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.a;
    }

    @Override // defpackage.psf
    public final ynh getTitle() {
        return this.b;
    }

    @Override // defpackage.psf
    public final osf getType() {
        return osf.b;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31)) * 31;
        msf msfVar = this.d;
        return qt4.D(this.e) + ((iHashCode + (msfVar == null ? 0 : msfVar.hashCode())) * 31);
    }

    public final String toString() {
        return "Element(itemId=" + this.a + ", title=" + this.b + ", descriptionRes=" + this.c + ", endView=" + this.d + ", sectionItemType=" + pye.q(this.e) + ")";
    }
}
