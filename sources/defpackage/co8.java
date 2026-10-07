package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class co8 {
    public final String a;
    public final byte[] b;

    public co8(byte[] bArr, String str) {
        this.a = str;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!co8.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        co8 co8Var = (co8) obj;
        return this.a.equals(co8Var.a) && Arrays.equals(this.b, co8Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
