package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class gii extends x0m {
    public final String a;

    public gii(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gii) && this.a.equals(((gii) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return c0a.o("VideoMessage(thumbhashBase64=", this.a, ")");
    }
}
