package defpackage;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class du3 {
    public static final du3 b = new du3(0);
    public static final du3 c = new du3(1);
    public final /* synthetic */ int a;

    public /* synthetic */ du3(int i) {
        this.a = i;
    }

    private final void b(Object obj) {
    }

    public final void a(Object obj) throws Exception {
        boolean zIsTerminated;
        switch (this.a) {
            case 0:
                AutoCloseable autoCloseable = (AutoCloseable) obj;
                if (autoCloseable != null) {
                    if (autoCloseable instanceof AutoCloseable) {
                        autoCloseable.close();
                    } else if (autoCloseable instanceof ExecutorService) {
                        ExecutorService executorService = (ExecutorService) autoCloseable;
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
                    } else if (autoCloseable instanceof TypedArray) {
                        ((TypedArray) autoCloseable).recycle();
                    } else if (autoCloseable instanceof MediaMetadataRetriever) {
                        ((MediaMetadataRetriever) autoCloseable).release();
                    } else if (!(autoCloseable instanceof MediaDrm)) {
                        ore.a();
                    } else {
                        ((MediaDrm) autoCloseable).release();
                    }
                }
                break;
        }
    }
}
