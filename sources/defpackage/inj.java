package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class inj implements ynj {
    public final String a;

    public inj(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof inj) && cqk.d(this.a, ((inj) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return c0a.o("OpenLinkExternal(url=", this.a, ")");
    }
}
