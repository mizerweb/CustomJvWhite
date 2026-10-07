package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

/* JADX INFO: loaded from: classes3.dex */
public final class phe implements t0k {
    public final agi a;

    public phe(agi agiVar) {
        this.a = agiVar;
    }

    @Override // defpackage.t0k
    public final int write(ByteBuffer byteBuffer) {
        return ((SocketChannel) this.a.e.a).write(byteBuffer);
    }
}
