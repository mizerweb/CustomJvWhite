package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class aw9 extends bw9 {
    public final String b;
    public final long c;

    public aw9(String str, long j) {
        this.b = str;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aw9)) {
            return false;
        }
        aw9 aw9Var = (aw9) obj;
        return this.b.equals(aw9Var.b) && this.c == aw9Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbB = nbh.B(this.c, "OpenDrawScreen(uriAsString=", this.b, ", mediaId=");
        sbB.append(")");
        return sbB.toString();
    }
}
