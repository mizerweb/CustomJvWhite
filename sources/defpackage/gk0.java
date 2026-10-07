package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class gk0 implements hk0 {
    public final String a;
    public final String b;

    public gk0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gk0)) {
            return false;
        }
        gk0 gk0Var = (gk0) obj;
        return this.a.equals(gk0Var.a) && this.b.equals(gk0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return nbh.w("CropAvatar(uriAsString=", this.a, ", path=", this.b, ")");
    }
}
