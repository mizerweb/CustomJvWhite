package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ltd implements ntd {
    public final yhh a;

    public ltd(yhh yhhVar) {
        this.a = yhhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ltd) && cqk.d(this.a, ((ltd) obj).a);
    }

    public final int hashCode() {
        yhh yhhVar = this.a;
        if (yhhVar == null) {
            return 0;
        }
        return yhhVar.hashCode();
    }

    public final String toString() {
        return "Error(error=" + this.a + ")";
    }
}
