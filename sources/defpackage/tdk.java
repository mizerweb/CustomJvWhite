package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class tdk implements eek {
    public final int a;
    public final String b;

    public tdk(InputStream inputStream) throws IOException {
        ti8.d(inputStream);
        int iD = ti8.d(inputStream);
        byte[] bArr = new byte[iD];
        if (vm9.a(inputStream, bArr, iD) != iD) {
            throw new EOFException("Unexpected end of stream");
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        this.a = byteBufferWrap.getInt();
        this.b = new String(byteBufferWrap.array(), byteBufferWrap.position(), byteBufferWrap.remaining());
    }

    @Override // defpackage.eek
    public final long a() {
        return 10307L;
    }

    public final String toString() {
        return String.format("CloseWebtransportSessionCapsule[%d,%s]", Integer.valueOf(this.a), this.b);
    }
}
