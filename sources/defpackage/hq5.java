package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hq5 implements jq5 {
    public final int a;

    public hq5(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hq5) && this.a == ((hq5) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return c0a.k(this.a, "DownloadFailed(textFailRes=", ")");
    }
}
