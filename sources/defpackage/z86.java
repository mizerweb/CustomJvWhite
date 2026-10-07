package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class z86 {
    public final String a;

    public z86(String str) {
        if (str != null) {
            this.a = str;
        } else {
            ore.n("name is null");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z86)) {
            return false;
        }
        return this.a.equals(((z86) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return zo5.w(new StringBuilder("Encoding{name=\""), this.a, "\"}");
    }
}
