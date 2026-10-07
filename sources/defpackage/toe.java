package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class toe {
    public final int a;
    public final xg b;

    public toe(int i, xg xgVar) {
        this.a = i;
        this.b = xgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof toe)) {
            return false;
        }
        toe toeVar = (toe) obj;
        return this.a == toeVar.a && cqk.d(this.b, toeVar.b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        xg xgVar = this.b;
        return iHashCode + (xgVar == null ? 0 : xgVar.hashCode());
    }

    public final String toString() {
        return "Result3A(status=" + ((Object) ("Status(value=" + this.a + ')')) + ", frameMetadata=" + this.b + ')';
    }
}
