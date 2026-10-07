package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class bid extends e48 {
    public final String b;
    public final byte[] c;

    public bid(byte[] bArr, String str) {
        super("PRIV");
        this.b = str;
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || bid.class != obj.getClass()) {
            return false;
        }
        bid bidVar = (bid) obj;
        return this.b.equals(bidVar.b) && Arrays.equals(this.c, bidVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c) + zo5.d(527, 31, this.b);
    }

    @Override // defpackage.e48
    public final String toString() {
        return this.a + ": owner=" + this.b;
    }
}
