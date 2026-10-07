package defpackage;

import java.util.concurrent.LinkedTransferQueue;

/* JADX INFO: loaded from: classes.dex */
public final class h69 extends LinkedTransferQueue {
    @Override // java.util.concurrent.LinkedTransferQueue, java.util.AbstractCollection, java.util.Collection, java.util.concurrent.BlockingQueue
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof Runnable) {
            return super.contains((Runnable) obj);
        }
        return false;
    }

    @Override // java.util.concurrent.LinkedTransferQueue, java.util.Queue, java.util.concurrent.BlockingQueue
    public final boolean offer(Object obj) {
        return tryTransfer((Runnable) obj);
    }

    @Override // java.util.concurrent.LinkedTransferQueue, java.util.AbstractCollection, java.util.Collection, java.util.concurrent.BlockingQueue
    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null ? true : obj instanceof Runnable) {
            return super.remove((Runnable) obj);
        }
        return false;
    }
}
