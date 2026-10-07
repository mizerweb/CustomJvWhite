package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: loaded from: classes4.dex */
public final class ub7 implements WritableByteChannel {
    public final WritableByteChannel a;
    public long b = 0;

    public ub7(WritableByteChannel writableByteChannel) {
        this.a = writableByteChannel;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return this.a.isOpen();
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) throws IOException {
        int iWrite = this.a.write(byteBuffer);
        this.b += (long) iWrite;
        return iWrite;
    }
}
