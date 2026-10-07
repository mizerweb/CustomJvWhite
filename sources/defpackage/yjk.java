package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class yjk {
    public final pv0 a;
    public final ekk b;

    public yjk(pv0 pv0Var, ekk ekkVar) {
        this.a = pv0Var;
        this.b = ekkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yjk)) {
            return false;
        }
        yjk yjkVar = (yjk) obj;
        return this.a.equals(yjkVar.a) && this.b == yjkVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "EnrichedBatterySnapshot(snapshot=" + this.a + ", visibility=" + this.b + ')';
    }
}
