package defpackage;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes2.dex */
public final class dgb extends z2f {
    public static final pxe c = new pxe("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx3.newthread-priority", 5).intValue())), false);
    public final ThreadFactory b = c;

    @Override // defpackage.z2f
    public final y2f a() {
        return new egb(this.b);
    }
}
