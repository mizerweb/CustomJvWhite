package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tij extends wij {
    public final String c;
    public final aa8 d;
    public final boolean e;

    public tij(String str, aa8 aa8Var, boolean z) {
        this.c = str;
        this.d = aa8Var;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tij)) {
            return false;
        }
        tij tijVar = (tij) obj;
        return cqk.d(this.c, tijVar.c) && this.d == tijVar.d && this.e == tijVar.e;
    }

    @Override // defpackage.wij
    public final boolean f() {
        return this.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + (this.c.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Impact(queryId=");
        sb.append(this.c);
        sb.append(", impactStyle=");
        sb.append(this.d);
        sb.append(", disableVibrationFallback=");
        return qt4.r(sb, this.e, ")");
    }
}
