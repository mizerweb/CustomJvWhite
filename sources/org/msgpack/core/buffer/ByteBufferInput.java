package org.msgpack.core.buffer;

import defpackage.e9i;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class ByteBufferInput implements MessageBufferInput {
    private ByteBuffer input;
    private boolean isRead = false;

    public ByteBufferInput(ByteBuffer byteBuffer) {
        e9i.v(byteBuffer, "input ByteBuffer is null");
        this.input = byteBuffer.slice();
    }

    @Override // org.msgpack.core.buffer.MessageBufferInput, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // org.msgpack.core.buffer.MessageBufferInput
    public MessageBuffer next() {
        if (this.isRead) {
            return null;
        }
        MessageBuffer messageBufferWrap = MessageBuffer.wrap(this.input);
        this.isRead = true;
        return messageBufferWrap;
    }

    public ByteBuffer reset(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = this.input;
        e9i.v(byteBuffer, "input ByteBuffer is null");
        this.input = byteBuffer.slice();
        this.isRead = false;
        return byteBuffer2;
    }
}
