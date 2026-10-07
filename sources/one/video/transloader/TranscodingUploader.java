package one.video.transloader;

import android.content.Context;
import android.os.HandlerThread;
import android.os.Looper;
import defpackage.a9m;
import defpackage.bpg;
import defpackage.cqk;
import defpackage.dul;
import defpackage.e3i;
import defpackage.ewe;
import defpackage.ore;
import defpackage.yvg;
import defpackage.ze9;
import java.io.RandomAccessFile;
import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lone/video/transloader/TranscodingUploader;", "", "", "methodName", "Lsbi;", "verifyThread", "(Ljava/lang/String;)V", "one-video-transloader_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TranscodingUploader {
    public final ExecutorService a;
    public final e3i b;
    public final ze9 c;
    public final a9m d;
    public int e;
    public final LinkedList f;
    public final ewe g;

    public TranscodingUploader(Context context, ExecutorService executorService, e3i e3iVar) {
        dul dulVar = dul.k;
        this.a = executorService;
        this.b = e3iVar;
        this.c = dulVar;
        this.d = new a9m(dulVar);
        this.f = new LinkedList();
        this.g = new ewe(context, dulVar, false, 8);
    }

    public final void a(RandomAccessFile randomAccessFile, AtomicBoolean atomicBoolean) {
        verifyThread("one.video.transloader.TranscodingUploader.tearDown");
        this.d.j();
        atomicBoolean.set(true);
        try {
            randomAccessFile.close();
        } catch (Throwable th) {
            this.c.s("TranscodingUpl", new yvg(21), new bpg(19, th));
        }
    }

    public final void verifyThread(String methodName) {
        HandlerThread handlerThread;
        Looper looperMyLooper = Looper.myLooper();
        a9m a9mVar = this.d;
        synchronized (a9mVar.e) {
            handlerThread = (HandlerThread) a9mVar.d;
        }
        Looper looper = handlerThread != null ? handlerThread.getLooper() : null;
        if (cqk.d(looperMyLooper, looper)) {
            return;
        }
        ore.g("Internal error: the method ", methodName, " must be called on orchestration thread only (", looper, "), but was called on ", looperMyLooper);
    }
}
