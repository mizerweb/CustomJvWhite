package defpackage;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public interface y41 extends mdg, ReadableByteChannel {
    int K0(chc chcVar);

    long N0();

    InputStream Q0();

    String R();

    void c0(long j);

    d71 f0(long j);

    String j(long j);

    byte[] n0();

    void q0(long j, l31 l31Var);

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    long readLong();

    short readShort();

    void skip(long j);

    String y0(Charset charset);
}
