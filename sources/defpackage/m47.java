package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class m47 implements n47 {
    public final String a;

    public m47(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m47) && cqk.d(this.a, ((m47) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return c0a.o("OpenUrl(url=", this.a, ")");
    }
}
