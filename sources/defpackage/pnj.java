package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class pnj implements ynj {
    public final String a;
    public final boolean b;

    public pnj(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pnj)) {
            return false;
        }
        pnj pnjVar = (pnj) obj;
        return cqk.d(this.a, pnjVar.a) && this.b == pnjVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowDownloadFileBottomSheet(fileName=" + this.a + ", needStoragePermission=" + this.b + ")";
    }
}
