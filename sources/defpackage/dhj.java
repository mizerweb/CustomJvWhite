package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class dhj extends es8 {
    public final String c;
    public final String d;

    public dhj(String str, String str2) {
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dhj)) {
            return false;
        }
        dhj dhjVar = (dhj) obj;
        return cqk.d(this.c, dhjVar.c) && cqk.d(this.d, dhjVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }

    public final String toString() {
        return nbh.w("DownloadFile(url=", this.c, ", fileName=", this.d, ")");
    }
}
