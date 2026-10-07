package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class v29 implements w29 {
    public final String a;

    public v29(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v29) && this.a.equals(((v29) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return c0a.o("ExternalCallback(params=", this.a, ")");
    }
}
