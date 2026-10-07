package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class rx {
    public final dnf a;
    public final ob1 b;

    public rx(dnf dnfVar, ob1 ob1Var) {
        this.a = dnfVar;
        this.b = ob1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rx)) {
            return false;
        }
        rx rxVar = (rx) obj;
        return this.a.equals(rxVar.a) && this.b.equals(rxVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "StartAsrRecord(sessionRoomId=" + this.a + ", callAsrInfo=" + this.b + ")";
    }
}
