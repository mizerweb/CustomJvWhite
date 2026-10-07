package defpackage;

import java.nio.ByteBuffer;
import one.video.calls.sdk_private.bJ;
import one.video.calls.sdk_private.bp;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o8k {
    public static int e(ByteBuffer byteBuffer) throws bJ {
        try {
            return ti8.f(byteBuffer);
        } catch (bp unused) {
            throw new bJ(2, "value too large");
        }
    }

    public abstract int a();

    public abstract void b(z7k z7kVar, pbk pbkVar, c4h c4hVar);

    public abstract void d(ByteBuffer byteBuffer);

    public boolean h() {
        return !(this instanceof e5k);
    }
}
