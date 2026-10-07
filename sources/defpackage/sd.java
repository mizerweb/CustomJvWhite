package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class sd implements xd {
    public final fu1 a;
    public final boolean b;

    public sd(fu1 fu1Var, boolean z) {
        this.a = fu1Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sd)) {
            return false;
        }
        sd sdVar = (sd) obj;
        return this.a.equals(sdVar.a) && this.b == sdVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DisableCameraForParticipant(id=" + this.a + ", isSuccess=" + this.b + ")";
    }
}
