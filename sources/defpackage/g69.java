package defpackage;

import one.me.sdk.concurrent.LinkedTransferQueue34;

/* JADX INFO: loaded from: classes3.dex */
public final class g69 extends LinkedTransferQueue34 {
    @Override // one.me.sdk.concurrent.LinkedTransferQueue34, java.util.AbstractCollection, java.util.Collection, java.util.concurrent.BlockingQueue
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof Runnable) {
            return super.contains((Runnable) obj);
        }
        return false;
    }

    @Override // one.me.sdk.concurrent.LinkedTransferQueue34, java.util.Queue, java.util.concurrent.BlockingQueue
    public final boolean offer(Object obj) {
        return tryTransfer((Runnable) obj);
    }

    @Override // one.me.sdk.concurrent.LinkedTransferQueue34, java.util.AbstractCollection, java.util.Collection, java.util.concurrent.BlockingQueue
    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null ? true : obj instanceof Runnable) {
            return super.remove((Runnable) obj);
        }
        return false;
    }
}
