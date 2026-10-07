package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class m18 implements Serializable {
    public final int a;
    public final String b;
    public final String c;

    public m18(int i, String str) {
        this.a = i;
        this.b = str;
        this.c = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && m18.class == obj.getClass() && this.a == ((m18) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return zo5.w(nbh.A(this.a, "HttpError{code=", ", error='", this.b, "', reason='"), this.c, "'}");
    }

    public m18(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }
}
