package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.Pipe;

/* JADX INFO: loaded from: classes3.dex */
public final class mr6 implements wdf {
    public final euc a;
    public final ze9 b;
    public final Pipe.SourceChannel c;
    public final bad d;
    public final ByteBuffer e = ByteBuffer.allocate(9);

    public mr6(euc eucVar, ze9 ze9Var, Pipe.SourceChannel sourceChannel, bad badVar) {
        this.a = eucVar;
        this.b = ze9Var;
        this.c = sourceChannel;
        this.d = badVar;
    }

    @Override // defpackage.wdf
    public final void G() {
        this.b.k("FileInfoUpdateReceiver", new s35(24));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Pipe.SourceChannel sourceChannel = this.c;
        try {
            sourceChannel.close();
        } catch (Throwable th) {
            this.b.r("FileInfoUpdateReceiver", new s35(23), new bpg(19, th));
        }
        this.a.K(sourceChannel);
    }

    @Override // defpackage.wdf
    public final void l0() throws Exception {
        Pipe.SourceChannel sourceChannel = this.c;
        ByteBuffer byteBuffer = this.e;
        if (sourceChannel.read(byteBuffer) > 0 && byteBuffer.position() == 9) {
            byteBuffer.flip();
            lr6 lr6Var = new lr6(byteBuffer.getLong(), byteBuffer.get() == 1);
            this.d.invoke(lr6Var);
            if (lr6Var.b) {
                close();
            }
            byteBuffer.rewind();
        }
    }

    @Override // defpackage.wdf
    public final void onConnected() {
        this.b.k("FileInfoUpdateReceiver", new s35(24));
    }
}
