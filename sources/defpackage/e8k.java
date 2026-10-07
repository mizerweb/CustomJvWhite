package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class e8k {
    public static final e8k b = new e8k(1);
    public static final e8k c = new e8k(1798521807);
    public final int a;

    public e8k(int i) {
        this.a = i;
    }

    public final byte[] a() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.putInt(this.a);
        return byteBufferAllocate.array();
    }

    public final boolean b() {
        return this.a == 1798521807;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e8k) && this.a == ((e8k) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        int i = this.a;
        if (i == 1) {
            return "v1";
        }
        if (i != 1798521807) {
            return (i <= -16777216 || i > -16777182) ? qv1.k("v-", Integer.toHexString(i)) : zo5.h(i - (-16777216), "draft-");
        }
        return "v2";
    }
}
