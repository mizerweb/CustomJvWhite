package defpackage;

import android.util.Base64;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class ij0 {
    public final String a;
    public final byte[] b;
    public final vhd c;

    public ij0(String str, byte[] bArr, vhd vhdVar) {
        this.a = str;
        this.b = bArr;
        this.c = vhdVar;
    }

    public static xtj a() {
        xtj xtjVar = new xtj(2, false);
        xtjVar.d = vhd.a;
        return xtjVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ij0) {
            ij0 ij0Var = (ij0) obj;
            if (this.a.equals(ij0Var.a) && Arrays.equals(this.b, ij0Var.b) && this.c.equals(ij0Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003);
    }

    public final String toString() {
        byte[] bArr = this.b;
        String strEncodeToString = bArr == null ? "" : Base64.encodeToString(bArr, 2);
        StringBuilder sb = new StringBuilder("TransportContext(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        return zo5.w(sb, strEncodeToString, ")");
    }
}
