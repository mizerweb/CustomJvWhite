package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qnf {
    public final String a;
    public final om5 b;

    public qnf(String str, om5 om5Var) {
        this.a = str;
        this.b = om5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qnf)) {
            return false;
        }
        qnf qnfVar = (qnf) obj;
        return cqk.d(this.a, qnfVar.a) && this.b == qnfVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DisconnectInfo(sessionId=" + this.a + ", reason=" + this.b + ")";
    }
}
