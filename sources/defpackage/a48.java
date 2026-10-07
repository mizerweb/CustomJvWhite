package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class a48 implements jwa {
    public final byte[] a;
    public final String b;
    public final String c;

    public a48(byte[] bArr, String str, String str2) {
        this.a = bArr;
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.jwa
    public final void b(zz9 zz9Var) {
        String str = this.b;
        if (str != null) {
            zz9Var.a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a48.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.a, ((a48) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return zo5.t(qv1.q("ICY: title=\"", this.b, "\", url=\"", this.c, "\", rawMetadata.length=\""), this.a.length, "\"");
    }
}
