package org.msgpack.core.buffer;

import defpackage.e9i;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes3.dex */
public class InputStreamBufferInput implements MessageBufferInput {
    private final byte[] buffer;
    private InputStream in;

    public InputStreamBufferInput(InputStream inputStream, int i) {
        e9i.v(inputStream, "input is null");
        this.in = inputStream;
        this.buffer = new byte[i];
    }

    public static MessageBufferInput newBufferInput(InputStream inputStream) {
        FileChannel channel;
        e9i.v(inputStream, "InputStream is null");
        return (!(inputStream instanceof FileInputStream) || (channel = ((FileInputStream) inputStream).getChannel()) == null) ? new InputStreamBufferInput(inputStream) : new ChannelBufferInput(channel);
    }

    @Override // org.msgpack.core.buffer.MessageBufferInput, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.in.close();
    }

    @Override // org.msgpack.core.buffer.MessageBufferInput
    public MessageBuffer next() throws IOException {
        int i = this.in.read(this.buffer);
        if (i == -1) {
            return null;
        }
        return MessageBuffer.wrap(this.buffer, 0, i);
    }

    public InputStream reset(InputStream inputStream) throws IOException {
        InputStream inputStream2 = this.in;
        this.in = inputStream;
        return inputStream2;
    }

    public InputStreamBufferInput(InputStream inputStream) {
        this(inputStream, 8192);
    }
}
