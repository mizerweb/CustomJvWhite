package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aig implements cig {
    public final String a;
    public final long b;

    public aig(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aig)) {
            return false;
        }
        aig aigVar = (aig) obj;
        return cqk.d(this.a, aigVar.a) && this.b == aigVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbB = nbh.B(this.b, "ShowWarningBottomSheet(fileUrl=", this.a, ", fileSize=");
        sbB.append(")");
        return sbB.toString();
    }
}
