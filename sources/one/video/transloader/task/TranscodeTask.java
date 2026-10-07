package one.video.transloader.task;

import android.os.HandlerThread;
import android.os.Looper;
import defpackage.a0i;
import defpackage.b0i;
import defpackage.c0i;
import defpackage.c5f;
import defpackage.cqk;
import defpackage.d0i;
import defpackage.e0i;
import defpackage.lbh;
import defpackage.ore;
import defpackage.os1;
import defpackage.tzh;
import defpackage.xre;
import defpackage.ze9;
import defpackage.zzh;
import java.io.File;
import java.io.RandomAccessFile;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lone/video/transloader/task/TranscodeTask;", "", "", "methodName", "Lsbi;", "verifyThread", "(Ljava/lang/String;)V", "one-video-transloader_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TranscodeTask {
    public final ze9 a;
    public final HandlerThread b;
    public final File c;
    public final String d;
    public final RandomAccessFile e;
    public final tzh f;
    public final os1 g;
    public final lbh h;
    public c5f i;
    public e0i j;

    public TranscodeTask(ze9 ze9Var, HandlerThread handlerThread, File file, String str, RandomAccessFile randomAccessFile, tzh tzhVar, os1 os1Var, lbh lbhVar) {
        this.a = ze9Var;
        this.b = handlerThread;
        this.c = file;
        this.d = str;
        this.e = randomAccessFile;
        this.f = tzhVar;
        this.g = os1Var;
        this.h = lbhVar;
    }

    public static final Long a(TranscodeTask transcodeTask) {
        transcodeTask.verifyThread("one.video.transloader.task.TranscodeTask.getFileSizeOrGoFailedState");
        try {
            return Long.valueOf(transcodeTask.e.length());
        } catch (Throwable th) {
            c5f c5fVar = transcodeTask.i;
            if (c5fVar != null) {
                c5fVar.d();
            }
            transcodeTask.i = null;
            transcodeTask.c(new b0i(th));
            return null;
        }
    }

    public final boolean b() {
        e0i e0iVar = this.j;
        if (e0iVar == null || e0iVar.equals(d0i.a) || (e0iVar instanceof c0i)) {
            return false;
        }
        if ((e0iVar instanceof a0i) || (e0iVar instanceof b0i) || e0iVar.equals(zzh.a)) {
            return true;
        }
        ore.o();
        return false;
    }

    public final void c(e0i e0iVar) {
        verifyThread("one.video.transloader.task.TranscodeTask.onStateUpdate");
        this.a.j("TranscodeTask", new xre(this, 25, e0iVar));
        if (b()) {
            return;
        }
        this.j = e0iVar;
        this.g.invoke(e0iVar);
        if (b()) {
            this.h.invoke();
        }
    }

    public final void verifyThread(String methodName) {
        Looper looperMyLooper = Looper.myLooper();
        HandlerThread handlerThread = this.b;
        if (cqk.d(looperMyLooper, handlerThread.getLooper())) {
            return;
        }
        ore.g("Internal error: the method ", methodName, " must be called on orchestration thread only (", handlerThread, "), but called on ", Thread.currentThread());
    }
}
