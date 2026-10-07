package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uld extends cmd {
    public final String b;

    public uld(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uld) && cqk.d(this.b, ((uld) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return c0a.o("CopyToClipboard(link=", this.b, ")");
    }
}
