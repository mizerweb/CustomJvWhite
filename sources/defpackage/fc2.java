package defpackage;

import android.content.res.TypedArray;
import android.graphics.SurfaceTexture;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.util.Log;
import android.view.Surface;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class fc2 implements id2 {
    public final /* synthetic */ CountDownLatch a;
    public final /* synthetic */ b40 b;
    public final /* synthetic */ Surface c;
    public final /* synthetic */ SurfaceTexture d;

    public fc2(CountDownLatch countDownLatch, b40 b40Var, Surface surface, SurfaceTexture surfaceTexture) {
        this.a = countDownLatch;
        this.b = b40Var;
        this.c = surface;
        this.d = surfaceTexture;
    }

    @Override // defpackage.id2
    public final void a() {
    }

    @Override // defpackage.mnf
    public final void b() {
    }

    @Override // defpackage.id2
    public final void c() {
        Log.d("CXCP", "Empty capture session configure failed");
        if (this.b.a()) {
            this.c.release();
            this.d.release();
        }
        this.a.countDown();
    }

    @Override // defpackage.mnf
    public final void d() {
    }

    @Override // defpackage.id2
    public final void e() {
    }

    @Override // defpackage.id2
    public final void f() {
        Log.d("CXCP", "Empty capture session closed");
        if (this.b.a()) {
            this.c.release();
            this.d.release();
        }
    }

    @Override // defpackage.id2
    public final void g() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.id2
    public final void h(jd2 jd2Var) throws Exception {
        boolean zIsTerminated;
        Log.d("CXCP", "Empty capture session configured. Closing it");
        if (jd2Var instanceof AutoCloseable) {
            jd2Var.close();
        } else if (jd2Var instanceof ExecutorService) {
            ExecutorService executorService = (ExecutorService) jd2Var;
            if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                executorService.shutdown();
                boolean z = false;
                while (!zIsTerminated) {
                    try {
                        zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                    } catch (InterruptedException unused) {
                        if (!z) {
                            executorService.shutdownNow();
                            z = true;
                        }
                    }
                }
                if (z) {
                    Thread.currentThread().interrupt();
                }
            }
        } else if (jd2Var instanceof TypedArray) {
            ((TypedArray) jd2Var).recycle();
        } else if (jd2Var instanceof MediaMetadataRetriever) {
            ((MediaMetadataRetriever) jd2Var).release();
        } else {
            if (!(jd2Var instanceof MediaDrm)) {
                ore.a();
                return;
            }
            ((MediaDrm) jd2Var).release();
        }
        this.a.countDown();
    }
}
