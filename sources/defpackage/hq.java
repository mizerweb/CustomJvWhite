package defpackage;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class hq extends e48 {
    public final String b;
    public final String c;
    public final int d;
    public final byte[] e;

    public hq(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = bArr;
    }

    @Override // defpackage.jwa
    public final void b(zz9 zz9Var) {
        zz9Var.a(this.d, this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hq.class != obj.getClass()) {
            return false;
        }
        hq hqVar = (hq) obj;
        return this.d == hqVar.d && this.b.equals(hqVar.b) && Objects.equals(this.c, hqVar.c) && Arrays.equals(this.e, hqVar.e);
    }

    public final int hashCode() {
        int iD = zo5.d((527 + this.d) * 31, 31, this.b);
        String str = this.c;
        return Arrays.hashCode(this.e) + ((iD + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // defpackage.e48
    public final String toString() {
        return this.a + ": mimeType=" + this.b + ", description=" + this.c;
    }
}
