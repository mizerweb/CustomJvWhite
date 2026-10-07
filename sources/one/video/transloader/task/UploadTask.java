package one.video.transloader.task;

import android.net.Uri;
import android.os.HandlerThread;
import android.os.Looper;
import defpackage.af7;
import defpackage.bpg;
import defpackage.cki;
import defpackage.cqk;
import defpackage.dji;
import defpackage.dki;
import defpackage.eji;
import defpackage.eth;
import defpackage.f4g;
import defpackage.fji;
import defpackage.gji;
import defpackage.hji;
import defpackage.i0i;
import defpackage.iji;
import defpackage.j0i;
import defpackage.lji;
import defpackage.ore;
import defpackage.sp9;
import defpackage.ufe;
import defpackage.uik;
import defpackage.v56;
import defpackage.vhi;
import defpackage.yfi;
import defpackage.ze9;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import one.video.upload.exceptions.InputFileCorruptException;
import one.video.upload.exceptions.UploadServerErrorException;
import one.video.upload.exceptions.UploadUrlExpiredException;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lone/video/transloader/task/UploadTask;", "", "", "methodName", "Lsbi;", "verifyThread", "(Ljava/lang/String;)V", "one-video-transloader_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UploadTask {
    public final ze9 a;
    public final HandlerThread b;
    public final ExecutorService c;
    public final Uri d;
    public final RandomAccessFile e;
    public final String f;
    public final cki g;
    public final af7 h;
    public final vhi i;
    public final af7 j;
    public final v56 k;
    public volatile iji l;
    public long m;
    public volatile Future n;
    public volatile dki o;
    public volatile boolean p;
    public final ReentrantLock q;
    public final Condition r;

    public UploadTask(ze9 ze9Var, HandlerThread handlerThread, ExecutorService executorService, Uri uri, RandomAccessFile randomAccessFile, String str, cki ckiVar, af7 af7Var, vhi vhiVar, af7 af7Var2) {
        this.a = ze9Var;
        this.b = handlerThread;
        this.c = executorService;
        this.d = uri;
        this.e = randomAccessFile;
        this.f = str;
        this.g = ckiVar;
        this.h = af7Var;
        this.i = vhiVar;
        this.j = af7Var2;
        this.k = new v56(handlerThread.getLooper());
        ReentrantLock reentrantLock = new ReentrantLock();
        this.q = reentrantLock;
        this.r = reentrantLock.newCondition();
    }

    public final void a() {
        verifyThread("one.video.transloader.task.UploadTask.cancel");
        this.a.b("UploadTask", new i0i(this, 3));
        if (b()) {
            return;
        }
        Future future = this.n;
        if (future != null) {
            future.cancel(true);
        }
        d(dji.a);
    }

    public final boolean b() {
        iji ijiVar = this.l;
        if (ijiVar == null || ijiVar.equals(hji.a) || (ijiVar instanceof gji)) {
            return false;
        }
        if ((ijiVar instanceof eji) || (ijiVar instanceof fji) || ijiVar.equals(dji.a)) {
            return true;
        }
        ore.o();
        return false;
    }

    public final void c(long j, boolean z) {
        verifyThread("one.video.transloader.task.UploadTask.notifyOnFileUpdate");
        this.p = z;
        if (j != this.m || z) {
            this.m = j;
            dki dkiVar = this.o;
            if (dkiVar != null) {
                dkiVar.c(j, z);
            }
            if (z) {
                ReentrantLock reentrantLock = this.q;
                reentrantLock.lock();
                try {
                    this.r.signal();
                } finally {
                    reentrantLock.unlock();
                }
            }
        }
    }

    public final void d(iji ijiVar) {
        verifyThread("one.video.transloader.task.UploadTask.onStateUpdate");
        this.a.j("UploadTask", new j0i(this, 7, ijiVar));
        if (b()) {
            return;
        }
        this.l = ijiVar;
        this.i.g(ijiVar);
        if (b()) {
            this.j.invoke();
        }
    }

    public final void e() {
        final ufe ufeVar = new ufe();
        final int i = 0;
        boolean z = false;
        while (!b()) {
            try {
                if (ufeVar.a != 0 && !z) {
                    ReentrantLock reentrantLock = this.q;
                    reentrantLock.lock();
                    try {
                        if (this.p) {
                            reentrantLock.unlock();
                        } else {
                            this.r.await(1000L, TimeUnit.MILLISECONDS);
                            reentrantLock.unlock();
                        }
                    } catch (Throwable th) {
                        reentrantLock.unlock();
                        throw th;
                    }
                }
                final int i2 = 1;
                try {
                    this.e.seek(0L);
                    dki dkiVar = new dki(this.d, this.e, this.f, 2, this.g, new eth(this), new uik(28, this), this.a);
                    final int i3 = 2;
                    try {
                        this.o = dkiVar;
                        this.k.K(new j0i(this, 6, dkiVar));
                        this.a.b("UploadTask", new yfi(2));
                        boolean zD = dkiVar.d();
                        Future future = this.n;
                        boolean z2 = future != null && future.isCancelled();
                        this.a.m("UploadTask", new sp9(1, zD, z2));
                        v56 v56Var = this.k;
                        if (z2) {
                            v56Var.K(new i0i(this, 1));
                        } else {
                            v56Var.K(new i0i(this, 2));
                        }
                    } catch (Throwable th2) {
                        try {
                            ufeVar.a++;
                            if ((th2 instanceof Error) || (th2 instanceof FileNotFoundException) || (th2 instanceof InputFileCorruptException) || (th2 instanceof UploadUrlExpiredException) || (th2 instanceof UploadServerErrorException)) {
                                final int i4 = 3;
                                this.a.r("UploadTask", new af7() { // from class: kji
                                    @Override // defpackage.af7
                                    public final Object invoke() {
                                        int i5;
                                        String str;
                                        int i6 = i4;
                                        ufe ufeVar2 = ufeVar;
                                        switch (i6) {
                                            case 0:
                                                i5 = ufeVar2.a;
                                                str = "Upload failed, retrying while transcode in progress, attempt: ";
                                                break;
                                            case 1:
                                                i5 = ufeVar2.a;
                                                str = "Upload failed, retrying last time after file completion, attempt: ";
                                                break;
                                            case 2:
                                                i5 = ufeVar2.a;
                                                str = "Upload failed (retries exhausted), attempt=";
                                                break;
                                            default:
                                                i5 = ufeVar2.a;
                                                str = "Upload failed with non-recoverable error, attempt: ";
                                                break;
                                        }
                                        return zo5.h(i5, str);
                                    }
                                }, new bpg(19, th2));
                                this.k.K(new lji(this, th2, 2));
                            } else if (((Boolean) this.h.invoke()).booleanValue()) {
                                this.a.y(new af7() { // from class: kji
                                    @Override // defpackage.af7
                                    public final Object invoke() {
                                        int i5;
                                        String str;
                                        int i6 = i;
                                        ufe ufeVar2 = ufeVar;
                                        switch (i6) {
                                            case 0:
                                                i5 = ufeVar2.a;
                                                str = "Upload failed, retrying while transcode in progress, attempt: ";
                                                break;
                                            case 1:
                                                i5 = ufeVar2.a;
                                                str = "Upload failed, retrying last time after file completion, attempt: ";
                                                break;
                                            case 2:
                                                i5 = ufeVar2.a;
                                                str = "Upload failed (retries exhausted), attempt=";
                                                break;
                                            default:
                                                i5 = ufeVar2.a;
                                                str = "Upload failed with non-recoverable error, attempt: ";
                                                break;
                                        }
                                        return zo5.h(i5, str);
                                    }
                                }, new bpg(19, th2));
                                this.o = null;
                            } else if (!this.p || z) {
                                this.a.r("UploadTask", new af7() { // from class: kji
                                    @Override // defpackage.af7
                                    public final Object invoke() {
                                        int i5;
                                        String str;
                                        int i6 = i3;
                                        ufe ufeVar2 = ufeVar;
                                        switch (i6) {
                                            case 0:
                                                i5 = ufeVar2.a;
                                                str = "Upload failed, retrying while transcode in progress, attempt: ";
                                                break;
                                            case 1:
                                                i5 = ufeVar2.a;
                                                str = "Upload failed, retrying last time after file completion, attempt: ";
                                                break;
                                            case 2:
                                                i5 = ufeVar2.a;
                                                str = "Upload failed (retries exhausted), attempt=";
                                                break;
                                            default:
                                                i5 = ufeVar2.a;
                                                str = "Upload failed with non-recoverable error, attempt: ";
                                                break;
                                        }
                                        return zo5.h(i5, str);
                                    }
                                }, new bpg(19, th2));
                                this.k.K(new lji(this, th2, 0));
                            } else {
                                this.a.y(new af7() { // from class: kji
                                    @Override // defpackage.af7
                                    public final Object invoke() {
                                        int i5;
                                        String str;
                                        int i6 = i2;
                                        ufe ufeVar2 = ufeVar;
                                        switch (i6) {
                                            case 0:
                                                i5 = ufeVar2.a;
                                                str = "Upload failed, retrying while transcode in progress, attempt: ";
                                                break;
                                            case 1:
                                                i5 = ufeVar2.a;
                                                str = "Upload failed, retrying last time after file completion, attempt: ";
                                                break;
                                            case 2:
                                                i5 = ufeVar2.a;
                                                str = "Upload failed (retries exhausted), attempt=";
                                                break;
                                            default:
                                                i5 = ufeVar2.a;
                                                str = "Upload failed with non-recoverable error, attempt: ";
                                                break;
                                        }
                                        return zo5.h(i5, str);
                                    }
                                }, new bpg(19, th2));
                                this.o = null;
                                z = true;
                            }
                        } catch (Throwable th3) {
                            this.o = null;
                            throw th3;
                        }
                    }
                    this.o = null;
                    return;
                } catch (Throwable th4) {
                    this.k.K(new lji(this, th4, 1));
                    return;
                }
            } catch (InterruptedException unused) {
                this.k.K(new i0i(this, 5));
                return;
            }
        }
    }

    public final void f() {
        verifyThread("one.video.transloader.task.UploadTask.startUpload");
        this.a.b("UploadTask", new yfi(1));
        if (b()) {
            return;
        }
        try {
            if (this.n != null) {
                return;
            }
            this.n = this.c.submit(new f4g(16, this));
        } catch (Throwable th) {
            d(hji.a);
            this.a.r("UploadTask", new yfi(4), new bpg(19, th));
            d(new fji(th));
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
