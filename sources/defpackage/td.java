package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class td implements xd {
    public final fu1 a;
    public final boolean b;

    public td(fu1 fu1Var, boolean z) {
        this.a = fu1Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof td)) {
            return false;
        }
        td tdVar = (td) obj;
        return this.a.equals(tdVar.a) && this.b == tdVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DisableMicForParticipant(id=" + this.a + ", isSuccess=" + this.b + ")";
    }
}
