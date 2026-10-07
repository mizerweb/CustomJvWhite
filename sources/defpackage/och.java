package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.PixelCopy;
import android.view.SurfaceView;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class och extends hhd {
    public SurfaceView e;
    public final nch f;

    public och(FrameLayout frameLayout, bhd bhdVar) {
        super(frameLayout, bhdVar);
        this.f = new nch(this);
    }

    @Override // defpackage.hhd
    public final View a() {
        return this.e;
    }

    @Override // defpackage.hhd
    public final Bitmap b() {
        SurfaceView surfaceView = this.e;
        if (surfaceView == null || surfaceView.getHolder().getSurface() == null || !this.e.getHolder().getSurface().isValid()) {
            return null;
        }
        final Semaphore semaphore = new Semaphore(0);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.e.getWidth(), this.e.getHeight(), Bitmap.Config.ARGB_8888);
        HandlerThread handlerThread = new HandlerThread("pixelCopyRequest Thread");
        handlerThread.start();
        PixelCopy.request(this.e, bitmapCreateBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: mch
            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
            public final void onPixelCopyFinished(int i) {
                if (i == 0) {
                    tvj.a("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() succeeded");
                } else {
                    tvj.c("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() failed with error " + i);
                }
                semaphore.release();
            }
        }, new Handler(handlerThread.getLooper()));
        try {
            if (!semaphore.tryAcquire(1, 100L, TimeUnit.MILLISECONDS)) {
                tvj.c("SurfaceViewImpl", "Timed out while trying to acquire screenshot.");
            }
            return bitmapCreateBitmap;
        } catch (InterruptedException e) {
            tvj.d("SurfaceViewImpl", "Interrupted while trying to acquire screenshot.", e);
            return bitmapCreateBitmap;
        } finally {
            handlerThread.quitSafely();
        }
    }

    @Override // defpackage.hhd
    public final void c() {
    }

    @Override // defpackage.hhd
    public final void d() {
    }

    @Override // defpackage.hhd
    public final void e(ich ichVar, oo ooVar) {
        SurfaceView surfaceView = this.e;
        boolean zEquals = Objects.equals(this.a, ichVar.b);
        if (surfaceView == null || !zEquals) {
            Size size = ichVar.b;
            this.a = size;
            size.getClass();
            FrameLayout frameLayout = this.b;
            SurfaceView surfaceView2 = new SurfaceView(frameLayout.getContext());
            this.e = surfaceView2;
            surfaceView2.setLayoutParams(new FrameLayout.LayoutParams(this.a.getWidth(), this.a.getHeight()));
            frameLayout.removeAllViews();
            frameLayout.addView(this.e);
            this.e.getHolder().addCallback(this.f);
        }
        Executor executorO = np4.o(this.e.getContext());
        ichVar.l.a(new f4g(8, ooVar), executorO);
        this.e.post(new alg(this, ichVar, ooVar, 2));
    }

    @Override // defpackage.hhd
    public final e89 g() {
        return g88.c;
    }
}
