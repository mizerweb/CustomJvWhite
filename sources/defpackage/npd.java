package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class npd extends rpd {
    public final String a;

    public npd(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof npd) && this.a.equals(((npd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return c0a.o("CopyToClipboard(text=", this.a, ")");
    }
}
