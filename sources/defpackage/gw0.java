package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class gw0 extends e48 {
    public final byte[] b;

    public gw0(byte[] bArr, String str) {
        super(str);
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gw0.class != obj.getClass()) {
            return false;
        }
        gw0 gw0Var = (gw0) obj;
        return this.a.equals(gw0Var.a) && Arrays.equals(this.b, gw0Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + zo5.d(527, 31, this.a);
    }
}
