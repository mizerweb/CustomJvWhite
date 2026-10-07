package defpackage;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class ck7 extends e48 {
    public final String b;
    public final String c;
    public final String d;
    public final byte[] e;

    public ck7(String str, byte[] bArr, String str2, String str3) {
        super("GEOB");
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ck7.class != obj.getClass()) {
            return false;
        }
        ck7 ck7Var = (ck7) obj;
        return Objects.equals(this.b, ck7Var.b) && this.c.equals(ck7Var.c) && this.d.equals(ck7Var.d) && Arrays.equals(this.e, ck7Var.e);
    }

    public final int hashCode() {
        String str = this.b;
        return Arrays.hashCode(this.e) + zo5.d(zo5.d((527 + (str != null ? str.hashCode() : 0)) * 31, 31, this.c), 31, this.d);
    }

    @Override // defpackage.e48
    public final String toString() {
        return this.a + ": mimeType=" + this.b + ", filename=" + this.c + ", description=" + this.d;
    }
}
