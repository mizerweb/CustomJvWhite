package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ehj extends es8 {
    public final String c;
    public final boolean d;

    public ehj(String str, boolean z) {
        this.c = str;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ehj)) {
            return false;
        }
        ehj ehjVar = (ehj) obj;
        return cqk.d(this.c, ehjVar.c) && this.d == ehjVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + (this.c.hashCode() * 31);
    }

    public final String toString() {
        return "RequestDownloadFile(fileName=" + this.c + ", needStoragePermission=" + this.d + ")";
    }
}
