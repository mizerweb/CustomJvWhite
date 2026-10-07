package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class byf implements eyf {
    public final String a;
    public final int b;

    public byf(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof byf)) {
            return false;
        }
        byf byfVar = (byf) obj;
        return this.a.equals(byfVar.a) && this.b == byfVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return c0a.l(this.b, "RedirectToStoryEditor(uri=", this.a, ", mediaType=", ")");
    }
}
