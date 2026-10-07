package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class xi1 {
    public final js6 a;
    public final String b;

    public xi1(js6 js6Var, String str) {
        this.a = js6Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xi1)) {
            return false;
        }
        xi1 xi1Var = (xi1) obj;
        return cqk.d(this.a, xi1Var.a) && this.b.equals(xi1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "UploadStage(event=" + this.a + ", destinationUrl=" + this.b + ")";
    }
}
