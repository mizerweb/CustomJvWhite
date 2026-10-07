package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class yfc extends zfc {
    public final long a;
    public final String b;

    public yfc(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yfc)) {
            return false;
        }
        yfc yfcVar = (yfc) obj;
        return this.a == yfcVar.a && cqk.d(this.b, yfcVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sbT = qt4.t(this.a, "OpenImage(messageId=", ", attachLocalId=", this.b);
        sbT.append(")");
        return sbT.toString();
    }
}
