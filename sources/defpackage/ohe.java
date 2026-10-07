package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

/* JADX INFO: loaded from: classes3.dex */
public final class ohe implements m8e {
    public final agi a;

    public ohe(agi agiVar) {
        this.a = agiVar;
    }

    @Override // defpackage.m8e
    public final int read(ByteBuffer byteBuffer) {
        return ((SocketChannel) this.a.e.a).read(byteBuffer);
    }
}
