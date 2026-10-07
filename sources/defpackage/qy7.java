package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class qy7 {
    public final String a;
    public final boolean b;

    public qy7(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qy7)) {
            return false;
        }
        qy7 qy7Var = (qy7) obj;
        return cqk.d(this.a, qy7Var.a) && this.b == qy7Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "HoldStateChangedEvent(participantId=" + this.a + ", isHeld=" + this.b + ")";
    }
}
