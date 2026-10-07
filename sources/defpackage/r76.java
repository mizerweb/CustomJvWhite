package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class r76 {
    public final z86 a;
    public final byte[] b;

    public r76(z86 z86Var, byte[] bArr) {
        if (z86Var == null) {
            ore.n("encoding is null");
            throw null;
        }
        if (bArr == null) {
            ore.n("bytes is null");
            throw null;
        }
        this.a = z86Var;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r76)) {
            return false;
        }
        r76 r76Var = (r76) obj;
        if (this.a.equals(r76Var.a)) {
            return Arrays.equals(this.b, r76Var.b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.a + ", bytes=[...]}";
    }
}
