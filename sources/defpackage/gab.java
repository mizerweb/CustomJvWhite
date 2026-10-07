package defpackage;

import java.nio.ByteBuffer;
import one.video.calls.sdk_private.j;

/* JADX INFO: loaded from: classes3.dex */
public abstract class gab {
    public final int a(ByteBuffer byteBuffer, int i, int i2) throws j {
        if (byteBuffer.limit() - byteBuffer.position() < 4) {
            p51.g("extension underflow");
            return 0;
        }
        if ((byteBuffer.getShort() & 65535) != i) {
            c.t();
            return 0;
        }
        int i3 = byteBuffer.getShort() & 65535;
        if (i3 >= i2) {
            if (byteBuffer.limit() - byteBuffer.position() >= i3) {
                return i3;
            }
            p51.g("extension underflow");
            return 0;
        }
        throw new j(getClass().getSimpleName() + " can't be less than " + i2 + " bytes");
    }

    public abstract byte[] b();
}
