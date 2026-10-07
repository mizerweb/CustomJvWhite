package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ug6 {
    public final byte[] a;

    public ug6(byte[] bArr) {
        this.a = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ug6) && cqk.d(this.a, ((ug6) obj).a);
    }

    public final int hashCode() {
        byte[] bArr = this.a;
        if (bArr == null) {
            return 0;
        }
        return Arrays.hashCode(bArr);
    }

    public final String toString() {
        return c0a.o("ExpObject(chatsCountGroups=", Arrays.toString(this.a), ")");
    }
}
