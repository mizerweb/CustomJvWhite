package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mna implements tna {
    public final long a;
    public final oxi b;

    public mna(long j, oxi oxiVar) {
        this.a = j;
        this.b = oxiVar;
    }

    @Override // defpackage.tna
    public final oxi b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mna)) {
            return false;
        }
        mna mnaVar = (mna) obj;
        return this.a == mnaVar.a && this.b.equals(mnaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    @Override // defpackage.una
    public final long l() {
        return this.a;
    }

    public final String toString() {
        return "OnPauseRequested(messageId=" + this.a + ", model=" + this.b + ")";
    }
}
