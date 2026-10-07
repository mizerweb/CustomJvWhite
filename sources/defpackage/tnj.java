package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tnj implements ynj {
    public final String a;
    public final wpj b;

    public tnj(String str, wpj wpjVar) {
        this.a = str;
        this.b = wpjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tnj)) {
            return false;
        }
        tnj tnjVar = (tnj) obj;
        return cqk.d(this.a, tnjVar.a) && cqk.d(this.b, tnjVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        wpj wpjVar = this.b;
        return iHashCode + (wpjVar != null ? wpjVar.hashCode() : 0);
    }

    public final String toString() {
        return "ShowShareDialog(text=" + this.a + ", fileInfo=" + this.b + ")";
    }
}
