package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class wh0 {
    public final String a;
    public final String b;

    public wh0(String str, String str2) {
        this.a = str;
        if (str2 != null) {
            this.b = str2;
        } else {
            ore.n("Null version");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wh0)) {
            return false;
        }
        wh0 wh0Var = (wh0) obj;
        return this.a.equals(wh0Var.a) && this.b.equals(wh0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.a);
        sb.append(", version=");
        return zo5.w(sb, this.b, "}");
    }
}
