package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class n2c {
    public final String a;
    public final ou4 b;

    public n2c(String str, ou4 ou4Var) {
        this.a = str;
        this.b = ou4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n2c)) {
            return false;
        }
        n2c n2cVar = (n2c) obj;
        return cqk.d(this.a, n2cVar.a) && cqk.d(this.b, n2cVar.b);
    }

    public final int hashCode() {
        return Integer.hashCode(this.b.a) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FolderCounter(folderId=" + this.a + ", counter=" + this.b + ")";
    }
}
