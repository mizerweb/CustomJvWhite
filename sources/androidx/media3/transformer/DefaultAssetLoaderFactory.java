package androidx.media3.transformer;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.media.metrics.LogSessionId;
import android.os.Looper;
import defpackage.a9m;
import defpackage.ay;
import defpackage.cy;
import defpackage.dy;
import defpackage.ey;
import defpackage.fik;
import defpackage.h1b;
import defpackage.hu3;
import defpackage.izl;
import defpackage.jy9;
import defpackage.k1b;
import defpackage.p95;
import defpackage.qt3;
import defpackage.ry9;
import defpackage.s26;
import defpackage.s95;
import defpackage.syh;
import defpackage.uya;
import defpackage.w25;
import defpackage.w4a;
import defpackage.xx0;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultAssetLoaderFactory implements cy {
    private static final String TAG = "DefaultAssetLoaderFact";
    private final xx0 bitmapLoader;
    private final qt3 clock;
    private final Context context;
    private final hu3 decoderFactory;
    private cy exoPlayerAssetLoaderFactory;
    private cy imageAssetLoaderFactory;
    private final LogSessionId logSessionId;
    private final w4a mediaSourceFactory;
    private final syh trackSelectorFactory;

    public DefaultAssetLoaderFactory(Context context, hu3 hu3Var, qt3 qt3Var, LogSessionId logSessionId) {
        h1b k1bVar;
        this.context = context.getApplicationContext();
        this.decoderFactory = hu3Var;
        this.clock = qt3Var;
        this.mediaSourceFactory = null;
        this.trackSelectorFactory = null;
        this.logSessionId = logSessionId;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        if (executorServiceNewSingleThreadExecutor instanceof h1b) {
            k1bVar = (h1b) executorServiceNewSingleThreadExecutor;
        } else {
            k1bVar = executorServiceNewSingleThreadExecutor instanceof ScheduledExecutorService ? new k1b((ScheduledExecutorService) executorServiceNewSingleThreadExecutor) : new h1b(executorServiceNewSingleThreadExecutor);
        }
        this.bitmapLoader = new w25(k1bVar, new p95(context), options);
    }

    @Override // defpackage.cy
    public ey createAssetLoader(s26 s26Var, Looper looper, dy dyVar, ay ayVar) {
        ry9 ry9Var = s26Var.a;
        String strI = izl.i(this.context, ry9Var);
        if (strI != null && uya.k(strI)) {
            jy9 jy9Var = ry9Var.b;
            jy9Var.getClass();
            if (jy9Var.h != -9223372036854775807L) {
                if (this.imageAssetLoaderFactory == null) {
                    this.imageAssetLoaderFactory = new fik(this.context, 19, this.bitmapLoader);
                }
                return this.imageAssetLoaderFactory.createAssetLoader(s26Var, looper, dyVar, ayVar);
            }
        }
        if (this.exoPlayerAssetLoaderFactory == null) {
            this.exoPlayerAssetLoaderFactory = new ExoPlayerAssetLoader$Factory(this.context, this.decoderFactory, this.clock, this.mediaSourceFactory, this.trackSelectorFactory, this.logSessionId, null);
        }
        return this.exoPlayerAssetLoaderFactory.createAssetLoader(s26Var, looper, dyVar, ayVar);
    }

    public DefaultAssetLoaderFactory(Context context, xx0 xx0Var) {
        this.context = context.getApplicationContext();
        this.bitmapLoader = xx0Var;
        this.decoderFactory = new s95(new a9m(context));
        this.clock = qt3.a;
        this.mediaSourceFactory = null;
        this.trackSelectorFactory = null;
        this.logSessionId = null;
    }

    public DefaultAssetLoaderFactory(Context context, hu3 hu3Var, qt3 qt3Var, w4a w4aVar, xx0 xx0Var) {
        this.context = context.getApplicationContext();
        this.decoderFactory = hu3Var;
        this.clock = qt3Var;
        this.mediaSourceFactory = w4aVar;
        this.bitmapLoader = xx0Var;
        this.trackSelectorFactory = null;
        this.logSessionId = null;
    }

    public DefaultAssetLoaderFactory(Context context, hu3 hu3Var, qt3 qt3Var, w4a w4aVar, xx0 xx0Var, syh syhVar) {
        this.context = context.getApplicationContext();
        this.decoderFactory = hu3Var;
        this.clock = qt3Var;
        this.mediaSourceFactory = w4aVar;
        this.bitmapLoader = xx0Var;
        this.trackSelectorFactory = syhVar;
        this.logSessionId = null;
    }
}
