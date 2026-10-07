package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class f12 {
    public final dnf a;

    public f12(cnf cnfVar) {
        cnfVar.getClass();
        this.a = cnfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f12) && cqk.d(this.a, ((f12) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RemovedParams(roomId=" + this.a + ")";
    }
}
