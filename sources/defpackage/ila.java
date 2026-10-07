package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ila {
    public final long a;
    public final boolean b;

    public ila(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ila)) {
            return false;
        }
        ila ilaVar = (ila) obj;
        return this.a == ilaVar.a && this.b == ilaVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sbU = qt4.u(this.a, "InputEditData(messageId=", ", shouldInsertOriginalText=", this.b);
        sbU.append(")");
        return sbU.toString();
    }
}
