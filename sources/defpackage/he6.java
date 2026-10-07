package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes2.dex */
public final class he6 {
    public static final Charset d = StandardCharsets.US_ASCII;
    public static final String[] e = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    public static final int[] f = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    public final int a;
    public final int b;
    public final byte[] c;

    public he6(int i, byte[] bArr, int i2) {
        this.a = i;
        this.b = i2;
        this.c = bArr;
    }

    public static he6 a(long j, ByteOrder byteOrder) {
        return b(new long[]{j}, byteOrder);
    }

    public static he6 b(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[f[4] * jArr.length]);
        byteBufferWrap.order(byteOrder);
        for (long j : jArr) {
            byteBufferWrap.putInt((int) j);
        }
        return new he6(4, byteBufferWrap.array(), jArr.length);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(e[this.a]);
        sb.append(", data length:");
        return zo5.t(sb, this.c.length, ")");
    }
}
