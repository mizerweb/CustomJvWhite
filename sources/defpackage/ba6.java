package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ba6 {
    public final ov0 a;
    public final maj b;

    public ba6(ov0 ov0Var, maj majVar) {
        this.a = ov0Var;
        this.b = majVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ba6)) {
            return false;
        }
        ba6 ba6Var = (ba6) obj;
        return this.a.equals(ba6Var.a) && this.b == ba6Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "EnrichedBatterySnapshot(snapshot=" + this.a + ", visibility=" + this.b + ")";
    }
}
