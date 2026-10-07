package org.msgpack.core.buffer;

import defpackage.e9i;
import defpackage.ore;
import defpackage.zo5;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;

/* JADX INFO: loaded from: classes3.dex */
public class ChannelBufferInput implements MessageBufferInput {
    private final MessageBuffer buffer;
    private ReadableByteChannel channel;

    public ChannelBufferInput(ReadableByteChannel readableByteChannel, int i) {
        e9i.v(readableByteChannel, "input channel is null");
        this.channel = readableByteChannel;
        boolean z = i > 0;
        String strH = zo5.h(i, "buffer size must be > 0: ");
        if (z) {
            this.buffer = MessageBuffer.allocate(i);
        } else {
            ore.p(strH);
            throw null;
        }
    }

    @Override // org.msgpack.core.buffer.MessageBufferInput, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.channel.close();
    }

    @Override // org.msgpack.core.buffer.MessageBufferInput
    public MessageBuffer next() throws IOException {
        ByteBuffer byteBufferSliceAsByteBuffer = this.buffer.sliceAsByteBuffer();
        if (this.channel.read(byteBufferSliceAsByteBuffer) == -1) {
            return null;
        }
        byteBufferSliceAsByteBuffer.flip();
        return this.buffer.slice(0, byteBufferSliceAsByteBuffer.limit());
    }

    public ReadableByteChannel reset(ReadableByteChannel readableByteChannel) throws IOException {
        ReadableByteChannel readableByteChannel2 = this.channel;
        this.channel = readableByteChannel;
        return readableByteChannel2;
    }

    public ChannelBufferInput(ReadableByteChannel readableByteChannel) {
        this(readableByteChannel, 8192);
    }
}
