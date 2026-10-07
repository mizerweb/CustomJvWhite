package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ooj {
    public final String a;
    public final boolean b;
    public final koj c;
    public final String d;
    public final boolean e;
    public final boolean f;

    public ooj(String str, boolean z, koj kojVar, String str2, boolean z2, boolean z3) {
        this.a = str;
        this.b = z;
        this.c = kojVar;
        this.d = str2;
        this.e = z2;
        this.f = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ooj)) {
            return false;
        }
        ooj oojVar = (ooj) obj;
        return cqk.d(this.a, oojVar.a) && this.b == oojVar.b && this.c.equals(oojVar.c) && cqk.d(this.d, oojVar.d) && this.e == oojVar.e && this.f == oojVar.f;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + nbh.n(this.a.hashCode() * 31, 31, this.b)) * 31;
        String str = this.d;
        return Boolean.hashCode(this.f) + nbh.n((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sbA = zo5.A("WebAppRootViewState(title=", this.a, ", isVerified=", ", loadingState=", this.b);
        sbA.append(this.c);
        sbA.append(", url=");
        sbA.append(this.d);
        sbA.append(", needShowCloseConfirmationDialog=");
        return bc1.m(", isBrightnessMaximized=", ")", sbA, this.e, this.f);
    }
}
