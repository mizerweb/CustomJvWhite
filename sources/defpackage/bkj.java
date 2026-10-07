package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class bkj extends ckj {
    public final String a;

    public bkj(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bkj) && cqk.d(this.a, ((bkj) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return c0a.o("OpenLinkExternal(url=", this.a, ")");
    }
}
