package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tla implements ama {
    public final q87 a;

    public tla(q87 q87Var) {
        this.a = q87Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tla) && cqk.d(this.a, ((tla) obj).a);
    }

    public final int hashCode() {
        q87 q87Var = this.a;
        if (q87Var == null) {
            return 0;
        }
        return q87Var.hashCode();
    }

    public final String toString() {
        return "OnMessageSend(forwardMessagesSendData=" + this.a + ")";
    }
}
