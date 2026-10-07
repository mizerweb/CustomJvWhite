package defpackage;

import java.net.DatagramPacket;
import java.nio.ByteBuffer;
import java.time.Instant;

/* JADX INFO: loaded from: classes3.dex */
public final class ubk {
    public final Instant a;
    public final ByteBuffer b;

    public ubk(DatagramPacket datagramPacket, Instant instant) {
        this.a = instant;
        this.b = ByteBuffer.wrap(datagramPacket.getData(), 0, datagramPacket.getLength());
    }
}
