package defpackage;

import java.nio.channels.WritableByteChannel;

/* JADX INFO: loaded from: classes.dex */
public interface x41 extends kag, WritableByteChannel {
    x41 A0(long j);

    x41 L(String str);

    x41 N(d71 d71Var);

    @Override // defpackage.kag, java.io.Flushable
    void flush();

    l31 getBuffer();

    x41 w();

    x41 write(byte[] bArr);

    x41 writeByte(int i);

    x41 writeInt(int i);

    x41 writeShort(int i);
}
