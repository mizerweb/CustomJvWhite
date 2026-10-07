package one.me.rlottie;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.ArraySet;
import android.view.View;
import com.google.gson.Gson;
import defpackage.abb;
import defpackage.cqk;
import defpackage.di;
import defpackage.e80;
import defpackage.ebb;
import defpackage.ed7;
import defpackage.en8;
import defpackage.i7b;
import defpackage.nn5;
import defpackage.np0;
import defpackage.pn5;
import defpackage.rn5;
import defpackage.ry0;
import defpackage.s3e;
import defpackage.sy0;
import defpackage.t3e;
import defpackage.u3e;
import defpackage.uy0;
import defpackage.v3e;
import defpackage.v4a;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public class RLottieDrawable extends BitmapDrawable implements Animatable, sy0, ebb {
    public static final Handler V1 = new Handler(Looper.getMainLooper());
    public static final ThreadLocal W1 = new ThreadLocal();
    public static final ThreadLocal X1 = new ThreadLocal();
    public static final pn5 Y1 = new pn5();
    public static final Rect Z1 = new Rect();
    public static Gson gson;
    public static nn5 lottieCacheGenerateQueue;
    public boolean A;
    public ed7 A1;
    public CountDownLatch B;
    public final u3e B1;
    public boolean C;
    public final u3e C1;
    public boolean D;
    public boolean D1;
    public boolean E;
    public final u3e E1;
    public boolean F;
    public final u3e F1;
    public boolean G;
    public uy0 G1;
    public int H;
    public int H1;
    public boolean I;
    public boolean I1;
    public float J;
    public boolean J1;
    public float K;
    public final u3e K1;
    public long L1;
    public int M1;
    public Bitmap N1;
    public String O1;
    public volatile boolean P1;
    public volatile Throwable Q1;
    public String R1;
    public final Set S1;
    public final Set T1;
    public final Set U1;
    public boolean X;
    public boolean Y;
    public final RectF Z;
    public final int a;
    public final int b;
    public final int[] c;
    public int d;
    public int e;
    public boolean f;
    public int[] g;
    public int[] h;
    public final HashMap i;
    public volatile HashMap j;
    public HashMap k;
    public boolean l;
    public boolean m;
    public WeakReference n;
    public final RectF[] n1;
    public View o;
    public final Paint[] o1;
    public final ArraySet p;
    public volatile boolean p1;
    public int q;
    public volatile boolean q1;
    public int r;
    public volatile long r1;
    public int s;
    public boolean s1;
    public boolean scaleByCanvas;
    public boolean skipFrameUpdate;
    public Rect srcRect;
    public long t;
    public boolean t1;
    public volatile boolean u;
    public boolean u1;
    public Runnable v;
    public File v1;
    public u3e w;
    public boolean w1;
    public Runnable whenCacheDone;
    public volatile Bitmap x;
    public Runnable x1;
    public volatile Bitmap y;
    public Runnable y1;
    public volatile Bitmap z;
    public View z1;

    public interface DrawableLoadListener {
        default void onError(Throwable th) {
        }

        default void onLoaded(RLottieDrawable rLottieDrawable) {
        }
    }

    public interface OnAllFramesRenderedListener {
        void onAllFramesRendered(RLottieDrawable rLottieDrawable, boolean z);
    }

    public interface OnNextFrameRenderedListener {
        void onNextFrameRendered(RLottieDrawable rLottieDrawable, int i);
    }

    public RLottieDrawable(File file, int i, int i2, ry0 ry0Var, boolean z, int[] iArr, int i3) {
        int[] iArr2 = new int[3];
        this.c = iArr2;
        this.e = -1;
        this.i = new HashMap();
        this.j = new HashMap();
        this.l = false;
        this.m = true;
        this.p = new ArraySet();
        this.q = 1;
        this.r = -1;
        this.J = 1.0f;
        this.K = 1.0f;
        this.Z = new RectF();
        this.n1 = new RectF[2];
        this.o1 = new Paint[2];
        this.B1 = new u3e(this, 0);
        this.C1 = new u3e(this, 1);
        this.E1 = new u3e(this, 2);
        this.F1 = new u3e(this, 3);
        this.K1 = new u3e(this, 4);
        this.srcRect = new Rect();
        this.M1 = -1;
        this.O1 = null;
        this.P1 = false;
        this.Q1 = null;
        this.S1 = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
        this.T1 = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
        this.U1 = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
        this.a = i;
        this.b = i2;
        this.I = z;
        this.R1 = file.getAbsolutePath();
        this.w1 = ry0Var != null;
        getPaint().setFlags(2);
        this.v1 = file;
        if (this.w1 && lottieCacheGenerateQueue == null) {
            createCacheGenQueue();
        }
        if (this.w1) {
            ed7 ed7Var = new ed7(16, false);
            this.A1 = ed7Var;
            ed7Var.d = file.getAbsoluteFile();
            ed7 ed7Var2 = this.A1;
            ed7Var2.getClass();
            ed7Var2.c = iArr;
            ed7Var2.b = i3;
            e(file, iArr2);
            if (this.I && iArr2[1] < 60) {
                this.I = false;
            }
            this.G1 = new uy0(file, this, ry0Var, i, i2, !z);
        } else {
            this.r1 = create(file.getAbsolutePath(), null, i, i2, iArr2, this.w1, iArr, this.I, i3);
            if (this.r1 == 0) {
                RLottie.getLogger().l("RLottieDrawable nativePtr == 0 " + file.getAbsolutePath() + " remove file");
                file.delete();
            }
            if (this.I && iArr2[1] < 60) {
                this.I = false;
            }
        }
        this.d = Math.max(this.I ? 33 : 16, (int) (1000.0f / iArr2[1]));
        d();
    }

    public static void a(RLottieDrawable rLottieDrawable) {
        Runnable runnable = rLottieDrawable.x1;
        if (runnable != null) {
            runnable.run();
            rLottieDrawable.x1 = null;
        }
    }

    public static native long create(String str, String str2, int i, int i2, int[] iArr, boolean z, int[] iArr2, boolean z2, int i3);

    public static void createCacheGenQueue() {
        lottieCacheGenerateQueue = new nn5("rlottie-generator-queue");
    }

    public static native long createWithJson(String str, String str2, int[] iArr, int[] iArr2);

    public static native void destroy(long j);

    public static native int foo();

    public static native double getDuration(String str, String str2);

    public static native int getFrame(long j, int i, Bitmap bitmap, int i2, int i3, int i4, boolean z);

    public static native long getFramesCount(String str, String str2);

    public static native void replaceColors(long j, int[] iArr);

    public static native void setLayerColor(long j, String str, int i);

    public void addDrawableLoadListener(DrawableLoadListener drawableLoadListener) {
        this.S1.add(drawableLoadListener);
        if (this.P1) {
            drawableLoadListener.onLoaded(this);
        } else if (this.Q1 != null) {
            drawableLoadListener.onError(this.Q1);
        }
    }

    public void addOnAllFramesRenderedListener(OnAllFramesRenderedListener onAllFramesRenderedListener) {
        this.U1.add(onAllFramesRenderedListener);
    }

    public void addOnNextFrameRenderedListener(OnNextFrameRenderedListener onNextFrameRenderedListener) {
        this.T1.add(onNextFrameRenderedListener);
    }

    public void addParentView(ImageReceiver imageReceiver) {
        if (imageReceiver == null) {
            return;
        }
        this.p.add(imageReceiver);
    }

    public final void b() {
        Runnable runnable = this.v;
        if (runnable != null) {
            lottieCacheGenerateQueue.a(runnable);
            uy0.c();
            this.v = null;
        }
        if (hasParent() || this.y == null || this.w == null) {
            return;
        }
        this.w = null;
        this.y = null;
    }

    public void beginApplyLayerColors() {
        this.G = true;
    }

    public final void c() {
        if (this.C) {
            b();
            if (this.w == null && this.v == null && this.r1 != 0) {
                f(true);
            }
        }
        if (this.r1 == 0 && this.G1 == null) {
            g();
            return;
        }
        this.A = true;
        if (!hasParent()) {
            RLottie.getLogger().l("RLottieDrawable. Call stop because !hasParentView() " + this.O1);
            stop();
        }
        if (this.p1) {
            i();
        }
    }

    public void cacheFrame(int i) {
        if (this.M1 != i || this.N1 == null) {
            if (this.N1 == null) {
                this.N1 = Bitmap.createBitmap(this.a, this.b, Bitmap.Config.ARGB_8888);
            }
            long j = this.r1;
            this.M1 = i;
            Bitmap bitmap = this.N1;
            getFrame(j, i, bitmap, this.a, this.b, bitmap.getRowBytes(), true);
        }
    }

    public boolean canLoadFrames() {
        if (this.w1) {
            return this.G1 != null;
        }
        return this.r1 != 0;
    }

    public void checkCache(Runnable runnable) {
        if (this.G1 == null) {
            di.d(runnable);
            return;
        }
        this.D1 = true;
        if (lottieCacheGenerateQueue == null) {
            createCacheGenQueue();
        }
        if (this.v == null) {
            uy0.B++;
            nn5 nn5Var = lottieCacheGenerateQueue;
            t3e t3eVar = new t3e(this, runnable, 0);
            this.v = t3eVar;
            nn5Var.b(t3eVar);
        }
    }

    public void checkCacheCancel() {
        if (this.G1 == null || lottieCacheGenerateQueue == null || this.v == null || !this.p.isEmpty() || getCallback() != null) {
            return;
        }
        View view = this.z1;
        if (view == null || !view.isAttachedToWindow()) {
            Runnable runnable = this.v;
            if (runnable != null) {
                lottieCacheGenerateQueue.a(runnable);
                uy0.c();
                this.v = null;
            }
            this.D1 = false;
            this.I1 = false;
        }
    }

    public void commitApplyLayerColors() {
        if (this.G) {
            this.G = false;
            if (!this.p1 && this.D) {
                if (this.H <= 2) {
                    this.H = 0;
                }
                this.u = false;
                this.E = false;
                if (!i()) {
                    this.F = true;
                }
            }
            invalidateInternal();
        }
    }

    public final void d() {
        this.P1 = true;
        this.Q1 = null;
        if (!di.b()) {
            di.d(new s3e(this, 1));
            return;
        }
        Iterator it = new ArrayList(this.S1).iterator();
        while (it.hasNext()) {
            ((DrawableLoadListener) it.next()).onLoaded(this);
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        drawInternal(canvas, getPaint(), false, 0L, 0);
    }

    public void drawFrame(Canvas canvas, int i) {
        cacheFrame(i);
        if (this.N1 != null) {
            int i2 = this.a;
            int i3 = this.b;
            Rect rect = Z1;
            rect.set(0, 0, i2, i3);
            canvas.drawBitmap(this.N1, rect, getBounds(), getPaint());
        }
    }

    public void drawInBackground(Canvas canvas, float f, float f2, float f3, float f4, int i, ColorFilter colorFilter, int i2) {
        RectF[] rectFArr = this.n1;
        RectF rectF = rectFArr[i2];
        Paint[] paintArr = this.o1;
        if (rectF == null) {
            rectFArr[i2] = new RectF();
            paintArr[i2] = new Paint(1);
            paintArr[i2].setFilterBitmap(true);
        }
        paintArr[i2].setAlpha(i);
        paintArr[i2].setColorFilter(colorFilter);
        rectFArr[i2].set(f, f2, f3 + f, f4 + f2);
        drawInternal(canvas, null, true, 0L, i2);
    }

    public void drawInternal(Canvas canvas, Paint paint, boolean z, long j, int i) {
        float f;
        float f2;
        if (!canLoadFrames() || this.C) {
            return;
        }
        boolean z2 = true;
        if (!z) {
            z = !Looper.getMainLooper().isCurrentThread();
        }
        if (!z) {
            updateCurrentFrame(j, false);
        }
        RectF rectF = z ? this.n1[i] : this.Z;
        if (rectF == null) {
            rectF = this.Z;
        }
        if (paint == null) {
            paint = z ? this.o1[i] : getPaint();
        }
        if (paint.getAlpha() == 0 || this.t1 || this.x == null) {
            return;
        }
        if (z) {
            float fWidth = rectF.width() / this.a;
            float fHeight = rectF.height() / this.b;
            if (Math.abs(rectF.width() - this.a) < di.a(1.0f) && Math.abs(rectF.height() - this.b) < di.a(1.0f)) {
                z2 = false;
            }
            f = fWidth;
            f2 = fHeight;
        } else {
            rectF.set(getBounds());
            if (this.X) {
                this.J = rectF.width() / this.a;
                this.K = rectF.height() / this.b;
                this.X = false;
                if (Math.abs(rectF.width() - this.a) < di.a(1.0f) && Math.abs(rectF.height() - this.b) < di.a(1.0f)) {
                    z2 = false;
                }
                this.Y = z2;
            }
            f = this.J;
            f2 = this.K;
            z2 = this.Y;
        }
        try {
            if (!z2) {
                canvas.drawBitmap(this.x, rectF.left, rectF.top, paint);
            } else if (this.scaleByCanvas) {
                this.srcRect.set(0, 0, this.x.getWidth(), this.x.getHeight());
                canvas.drawBitmap(this.x, this.srcRect, rectF, paint);
            } else {
                canvas.save();
                canvas.translate(rectF.left, rectF.top);
                canvas.scale(f, f2);
                canvas.drawBitmap(this.x, 0.0f, 0.0f, paint);
                canvas.restore();
            }
        } catch (Exception e) {
            RLottie.getLogger().h(e);
        }
        if (!this.p1 || z) {
            return;
        }
        invalidateInternal();
    }

    public final void e(File file, int[] iArr) {
        if (gson == null) {
            gson = new Gson();
        }
        try {
            FileReader fileReader = new FileReader(file.getAbsolutePath());
            if (gson.fromJson(fileReader, v3e.class) != null) {
                throw new ClassCastException();
            }
            try {
                fileReader.close();
            } catch (Exception unused) {
            }
            throw null;
        } catch (Exception e) {
            RLottie.getLogger().h(e);
            String absolutePath = file.getAbsolutePath();
            ed7 ed7Var = this.A1;
            long jCreate = create(absolutePath, null, this.a, this.b, iArr, false, (int[]) ed7Var.c, this.I, ed7Var.b);
            if (jCreate != 0) {
                destroy(jCreate);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RLottieDrawable)) {
            return false;
        }
        RLottieDrawable rLottieDrawable = (RLottieDrawable) obj;
        if (this.a == rLottieDrawable.a && this.b == rLottieDrawable.b && this.q == rLottieDrawable.q) {
            return Objects.equals(this.R1, rLottieDrawable.R1);
        }
        return false;
    }

    public final void f(boolean z) {
        long j = this.r1;
        this.r1 = 0L;
        if (j == 0) {
            return;
        }
        if (z) {
            rn5.a(new v4a(j, 1), false);
            return;
        }
        en8 en8Var = cqk.e.j;
        ((ScheduledExecutorService) en8Var.a.getValue()).execute(new v4a(j, 2));
    }

    public final void finalize() throws Throwable {
        try {
            recycle(false);
        } finally {
            super.finalize();
        }
    }

    public final void g() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.x);
        arrayList.add(this.z);
        arrayList.add(this.y);
        this.y = null;
        this.x = null;
        this.z = null;
        di.c(arrayList);
        if (this.x1 != null) {
            this.x1 = null;
        }
    }

    public Bitmap getAnimatedBitmap() {
        if (this.x != null) {
            return this.x;
        }
        if (this.y != null) {
            return this.y;
        }
        return null;
    }

    public Bitmap getBackgroundBitmap() {
        return this.z;
    }

    public int getCurrentFrame() {
        return this.H;
    }

    public String getCurrentUrl() {
        return this.O1;
    }

    public int getCustomEndFrame() {
        return this.e;
    }

    public long getDuration() {
        int[] iArr = this.c;
        return (long) ((iArr[0] / iArr[1]) * 1000.0f);
    }

    public Bitmap getFirstFrame(Bitmap bitmap) {
        String string = ((File) this.A1.d).toString();
        ed7 ed7Var = this.A1;
        ed7Var.getClass();
        int[] iArr = (int[]) ed7Var.c;
        int i = ed7Var.b;
        long jCreate = create(string, null, this.a, this.b, new int[3], false, iArr, false, i);
        if (jCreate == 0) {
            return bitmap;
        }
        getFrame(jCreate, 0, bitmap, this.a, this.b, bitmap.getRowBytes(), true);
        destroy(jCreate);
        return bitmap;
    }

    public int getFramesCount() {
        return this.c[0];
    }

    public float getGeneratingCacheProgress() {
        uy0 uy0Var = this.G1;
        if (uy0Var != null) {
            if (this.v != null) {
                float framesCount = uy0Var.d.get() / getFramesCount();
                if (!Float.isNaN(framesCount)) {
                    if (!Float.isInfinite(framesCount)) {
                        return Math.max(Math.min(framesCount, 1.0f), 0.0f);
                    }
                }
                return 0.0f;
            }
            if (!uy0Var.q) {
                return -2.0f;
            }
            if (this.G1.g()) {
                return 0.0f;
            }
        }
        return 1.0f;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.b;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.a;
    }

    public long getLastFrameTime() {
        return this.t;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.a;
    }

    @Override // defpackage.sy0
    public int getNextFrame(Bitmap bitmap) {
        long j = this.L1;
        if (j == 0) {
            return -1;
        }
        int i = this.I ? 2 : 1;
        if (getFrame(j, this.H1, bitmap, this.a, this.b, bitmap.getRowBytes(), true) != -5) {
            int i2 = this.H1 + i;
            this.H1 = i2;
            return i2 > this.c[0] ? 0 : 1;
        }
        try {
            Thread.sleep(100L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return getNextFrame(bitmap);
    }

    public Bitmap getNextRenderingBitmap() {
        return this.y;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    public Bitmap getRenderingBitmap() {
        return this.x;
    }

    public float getScaleX() {
        return this.J;
    }

    public float getScaleY() {
        return this.K;
    }

    public int getTimeBetweenFrames() {
        return this.d;
    }

    public final void h() {
        if (!this.G && !this.p1 && this.D) {
            if (this.H <= 2) {
                this.H = 0;
            }
            this.u = false;
            this.E = false;
            if (!i()) {
                this.F = true;
            }
        }
        invalidateInternal();
    }

    public boolean hasBitmap() {
        if (this.q1) {
            return false;
        }
        return ((this.x == null && this.y == null) || this.t1) ? false : true;
    }

    public boolean hasOnNextFrameRenderedListener(OnNextFrameRenderedListener onNextFrameRenderedListener) {
        return this.T1.contains(onNextFrameRenderedListener);
    }

    public boolean hasParent() {
        return (this.p.isEmpty() && this.z1 == null && getCallback() == null) ? false : true;
    }

    public boolean hasParentViews() {
        return !this.p.isEmpty();
    }

    public boolean hasVibrationPattern() {
        return this.k != null;
    }

    public int hashCode() {
        int i = ((this.a * 31) + this.b) * 31;
        String str = this.R1;
        return Integer.hashCode(this.q) + ((i + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final boolean i() {
        if (this.w == null && this.y == null) {
            if (!canLoadFrames() || this.C || (!this.p1 && (!this.D || this.E))) {
                RLottie.getLogger().l("RLottieDrawable. Can't schedule next frame invalid state");
            } else if (!this.D1 || this.J1) {
                if (!this.i.isEmpty()) {
                    this.j.putAll(this.i);
                    this.i.clear();
                }
                int[] iArr = this.g;
                if (iArr != null) {
                    this.h = iArr;
                    this.g = null;
                }
                this.w = this.K1;
                if (this.I && di.b()) {
                    rn5.a(this.w, this.B != null);
                    return true;
                }
                Y1.b(this.w);
                return true;
            }
        }
        return false;
    }

    public void invalidateInternal() {
        if (this.q1) {
            return;
        }
        Iterator it = this.p.iterator();
        while (it.hasNext()) {
            ((ImageReceiver) it.next()).invalidate();
        }
        View view = this.z1;
        if (view != null) {
            view.invalidate();
        }
        if (getCallback() != null) {
            invalidateSelf();
        }
    }

    public boolean isApplyTransformation() {
        return this.X;
    }

    public boolean isCacheFallbacked() {
        return false;
    }

    public boolean isForceFrameRedraw() {
        return this.F;
    }

    public boolean isGeneratingCache() {
        return this.v != null;
    }

    public boolean isHeavyDrawable() {
        return true;
    }

    public boolean isLastFrame() {
        return this.H == getFramesCount() - 1;
    }

    public boolean isLoadingFailed() {
        return (this.P1 || this.Q1 == null) ? false : true;
    }

    public boolean isNeedScale() {
        return this.Y;
    }

    public boolean isRecycled() {
        return this.q1;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.p1;
    }

    public boolean isWaitingForNextTask() {
        return this.A;
    }

    public final void j(long j, long j2, boolean z, long j3) {
        int i;
        this.z = this.x;
        this.x = this.y;
        this.y = null;
        if (this.x == null) {
            RLottie.getLogger().l("rendering bitmap is null");
        }
        if (this.u || (this.r == 0 && this.q == 1)) {
            stop();
        }
        this.w = null;
        if (this.u1) {
            this.u1 = false;
        } else if (this.t1) {
            this.t1 = false;
        }
        this.E = true;
        this.A = false;
        if (RLottie.config.screenRefreshRate <= 60.0f) {
            this.t = j;
        } else {
            this.t = j - Math.min(16L, j2 - j3);
        }
        if (z && this.F) {
            this.E = false;
            this.F = false;
        }
        synchronized (this.T1) {
            try {
                if (!this.T1.isEmpty()) {
                    HashSet hashSet = new HashSet(this.T1);
                    this.T1.clear();
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        ((OnNextFrameRenderedListener) it.next()).onNextFrameRendered(this, this.H);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (isLastFrame() && ((i = this.q) == 2 || i == 1 || i == 3 || this.u)) {
            for (OnAllFramesRenderedListener onAllFramesRenderedListener : this.U1) {
                int i2 = this.q;
                onAllFramesRenderedListener.onAllFramesRendered(this, i2 == 2 || i2 == 1 || i2 == 3);
            }
        }
        i();
    }

    public void multiplySpeed(float f) {
        this.d *= (int) (1.0f / f);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.X = true;
    }

    @Override // defpackage.ebb
    public void onFailed(Throwable th) {
        RLottie.getLogger().h(th);
        this.P1 = false;
        this.Q1 = th;
        di.d(new i7b(this, 26, th));
    }

    @Override // defpackage.ebb
    public void onFinished(String str, File file, String str2) {
        getPaint().setFlags(2);
        this.R1 = file.getAbsolutePath();
        this.v1 = file;
        if (this.w1 && lottieCacheGenerateQueue == null) {
            createCacheGenQueue();
        }
        if (this.w1) {
            this.G1 = new uy0(file, this, new ry0(), this.a, this.b, !this.I);
            ed7 ed7Var = new ed7(16, false);
            this.A1 = ed7Var;
            ed7Var.d = file.getAbsoluteFile();
            this.A1.getClass();
            this.r1 = create(file.getAbsolutePath(), null, this.a, this.b, this.c, this.w1, null, this.I, 0);
            destroy(this.r1);
            this.r1 = 0L;
        } else {
            this.r1 = create(file.getAbsolutePath(), null, this.a, this.b, this.c, this.w1, null, this.I, 0);
            if (this.r1 == 0) {
                file.delete();
            }
        }
        if (this.I && this.c[1] < 60) {
            this.I = false;
        }
        this.d = Math.max(this.I ? 33 : 16, (int) (1000.0f / this.c[1]));
        d();
        di.d(new s3e(this, 0));
    }

    public void post(Runnable runnable) {
        if (this.I && di.b()) {
            rn5.a(new e80(runnable, 3), this.B != null);
        } else {
            Y1.b(new e80(runnable, 4));
        }
    }

    @Override // defpackage.sy0
    public void prepareForGenerateCache() {
        File file;
        String string = ((File) this.A1.d).toString();
        ed7 ed7Var = this.A1;
        ed7Var.getClass();
        long jCreate = create(string, null, this.a, this.b, new int[3], false, (int[]) ed7Var.c, false, ed7Var.b);
        this.L1 = jCreate;
        if (jCreate != 0 || (file = this.v1) == null) {
            return;
        }
        file.delete();
    }

    public void recycle(boolean z) {
        this.p1 = false;
        this.q1 = true;
        b();
        if (this.w != null || this.v != null || this.D1) {
            this.C = true;
            return;
        }
        f(z);
        uy0 uy0Var = this.G1;
        if (uy0Var != null) {
            RandomAccessFile randomAccessFile = uy0Var.u;
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                uy0Var.u = null;
            }
            uy0Var.t = true;
            this.G1 = null;
        }
        g();
    }

    @Override // defpackage.sy0
    public void releaseForGenerateCache() {
        long j = this.L1;
        if (j != 0) {
            destroy(j);
            this.L1 = 0L;
        }
    }

    public void removeDrawableLoadListener(DrawableLoadListener drawableLoadListener) {
        this.S1.remove(drawableLoadListener);
    }

    public void removeOnAllFramesRenderedListener(OnAllFramesRenderedListener onAllFramesRenderedListener) {
        this.U1.remove(onAllFramesRenderedListener);
    }

    public void removeOnNextFrameRenderedListener(OnNextFrameRenderedListener onNextFrameRenderedListener) {
        this.T1.remove(onNextFrameRenderedListener);
    }

    public void removeParentView(ImageReceiver imageReceiver) {
        if (imageReceiver == null) {
            return;
        }
        this.p.remove(imageReceiver);
        checkCacheCancel();
    }

    public void replaceColors(int[] iArr) {
        this.g = iArr;
        h();
    }

    public void resetVibrationAfterRestart(boolean z) {
        this.l = z;
    }

    public boolean restart(boolean z) {
        if (!z && ((this.q < 2 || this.s == 0) && this.r < 0)) {
            return false;
        }
        this.s = 0;
        this.q = 2;
        start();
        return true;
    }

    public void setAllowDecodeSingleFrame(boolean z) {
        this.D = z;
        if (z) {
            i();
        }
    }

    public void setAllowDrawFramesWhileCacheGenerating(boolean z) {
        this.J1 = z;
    }

    public void setAllowVibration(boolean z) {
        this.m = z;
    }

    public void setAutoRepeat(int i) {
        if (this.q == 2 && i == 3 && this.H != 0) {
            return;
        }
        this.q = i;
    }

    public void setAutoRepeatCount(int i) {
        this.r = i;
    }

    public void setAutoRepeatTimeout(long j) {
    }

    public void setCurrentFrame(int i, boolean z, boolean z2) {
        if (i < 0 || i > this.c[0]) {
            return;
        }
        if (this.H != i || z2) {
            this.H = i;
            this.u = false;
            this.E = false;
            if (this.s1) {
                this.t1 = true;
                if (this.w != null) {
                    this.u1 = true;
                }
            }
            if ((!z || z2) && this.A && this.y != null) {
                this.z = this.y;
                this.y = null;
                this.w = null;
                this.A = false;
            }
            if (!z && this.w == null) {
                this.B = new CountDownLatch(1);
            }
            if (z2 && !this.p1) {
                this.p1 = true;
            }
            if (!i()) {
                this.F = true;
            } else if (!z) {
                try {
                    this.B.await();
                } catch (Exception e) {
                    RLottie.getLogger().h(e);
                }
                this.B = null;
            }
            invalidateSelf();
        }
    }

    public void setCurrentParentView(View view) {
        this.o = view;
    }

    public boolean setCustomEndFrame(int i) {
        if (this.e == i || i > this.c[0]) {
            return false;
        }
        this.e = i;
        return true;
    }

    public void setGeneratingFrame(int i) {
        this.H1 = i;
    }

    public void setInvalidateOnProgressSet(boolean z) {
        this.s1 = z;
    }

    public void setLayerColor(String str, int i) {
        this.i.put(str, Integer.valueOf(i));
        h();
    }

    public void setMasterParent(View view) {
        this.z1 = view;
    }

    public void setOnAnimationEndListener(Runnable runnable) {
        this.x1 = runnable;
    }

    public void setOnFinishCallback(Runnable runnable, int i) {
        if (runnable != null) {
            this.n = new WeakReference(runnable);
        } else if (this.n != null) {
            this.n = null;
        }
    }

    public void setOnFrameReadyRunnable(Runnable runnable) {
        this.y1 = runnable;
    }

    public void setPlayInDirectionOfCustomEndFrame(boolean z) {
        this.f = z;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0005 A[PHI: r0
  0x0005: PHI (r0v6 float) = (r0v0 float), (r0v1 float) binds: [B:3:0x0003, B:6:0x000b] A[DONT_GENERATE, DONT_INLINE]] */
    public void setProgress(float f, boolean z) {
        float f2 = 0.0f;
        if (f < 0.0f) {
            f = f2;
        } else {
            f2 = 1.0f;
            if (f > 1.0f) {
                f = f2;
            }
        }
        setCurrentFrame((int) (this.c[0] * f), z);
    }

    public void setProgressMs(long j) {
        setCurrentFrame((int) ((Math.max(0L, j) / ((long) this.d)) % ((long) this.c[0])), true, true);
    }

    public void setVibrationPattern(HashMap<Integer, Integer> map) {
        this.k = map;
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (!RLottie.config.isEnabled || this.p1) {
            return;
        }
        if ((this.q < 2 || this.s == 0) && this.e != this.H) {
            this.p1 = true;
            if (this.s1) {
                this.t1 = true;
                if (this.w != null) {
                    this.u1 = true;
                }
            }
            i();
            invalidateInternal();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.p1 = false;
    }

    public void updateCurrentFrame(long j, boolean z) {
        int i;
        Integer num;
        if (j == 0) {
            j = System.currentTimeMillis();
        }
        long j2 = j;
        long j3 = j2 - this.t;
        if (!z || this.I) {
            float f = RLottie.config.screenRefreshRate;
            i = (f <= 60.0f || (z && f <= 80.0f)) ? this.d - 6 : this.d;
        } else {
            i = this.d - 16;
        }
        if (!this.p1) {
            if ((this.F || (this.D && j3 >= i)) && this.y != null) {
                j(j2, j3, true, i);
                return;
            }
            return;
        }
        if (this.x == null && this.y == null) {
            i();
            return;
        }
        if (this.y != null) {
            if (this.x == null || (j3 >= i && !this.skipFrameUpdate)) {
                HashMap map = this.k;
                if (map != null && this.o != null && this.m && (num = (Integer) map.get(Integer.valueOf(this.H - 1))) != null) {
                    this.o.performHapticFeedback(num.intValue() == 1 ? 0 : 3, 2);
                }
                j(j2, j3, false, i);
            }
        }
    }

    public void draw(Canvas canvas, Paint paint) {
        drawInternal(canvas, paint, false, 0L, 0);
    }

    public boolean restart() {
        return restart(false);
    }

    public void setProgress(float f) {
        setProgress(f, true);
    }

    public void setCurrentFrame(int i, boolean z) {
        setCurrentFrame(i, z, false);
    }

    public void setCurrentFrame(int i) {
        setCurrentFrame(i, true);
    }

    public RLottieDrawable(File file, int i, int i2, ry0 ry0Var, boolean z) {
        this(file, i, i2, ry0Var, z, null, 0);
    }

    public RLottieDrawable(int i, String str, int i2, int i3) {
        this(i, str, i2, i3, true, (int[]) null);
    }

    public RLottieDrawable(int i, String str, int i2, int i3, boolean z, int[] iArr) {
        InputStream inputStreamOpenRawResource;
        this.c = new int[3];
        this.e = -1;
        this.i = new HashMap();
        this.j = new HashMap();
        this.l = false;
        this.m = true;
        this.p = new ArraySet();
        this.q = 1;
        this.r = -1;
        this.J = 1.0f;
        this.K = 1.0f;
        this.Z = new RectF();
        this.n1 = new RectF[2];
        this.o1 = new Paint[2];
        this.B1 = new u3e(this, 0);
        this.C1 = new u3e(this, 1);
        this.E1 = new u3e(this, 2);
        this.F1 = new u3e(this, 3);
        this.K1 = new u3e(this, 4);
        this.srcRect = new Rect();
        this.M1 = -1;
        String str2 = null;
        this.O1 = null;
        this.P1 = false;
        this.Q1 = null;
        this.S1 = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
        this.T1 = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
        this.U1 = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
        this.a = i2;
        this.b = i3;
        this.q = 0;
        ThreadLocal threadLocal = W1;
        byte[] bArr = (byte[]) threadLocal.get();
        if (bArr == null) {
            bArr = new byte[65536];
            threadLocal.set(bArr);
        }
        try {
            abb abbVar = cqk.e;
            if (abbVar == null) {
                abbVar = null;
            }
            inputStreamOpenRawResource = abbVar.l.openRawResource(i);
            try {
                ThreadLocal threadLocal2 = X1;
                byte[] bArr2 = (byte[]) threadLocal2.get();
                if (bArr2 == null) {
                    bArr2 = new byte[np0.r];
                    threadLocal2.set(bArr2);
                }
                int i4 = 0;
                while (true) {
                    int i5 = inputStreamOpenRawResource.read(bArr2, 0, bArr2.length);
                    if (i5 >= 0) {
                        int i6 = i4 + i5;
                        if (bArr.length < i6) {
                            byte[] bArr3 = new byte[bArr.length * 2];
                            System.arraycopy(bArr, 0, bArr3, 0, i4);
                            threadLocal.set(bArr3);
                            bArr = bArr3;
                        }
                        if (i5 > 0) {
                            System.arraycopy(bArr2, 0, bArr, i4, i5);
                            i4 = i6;
                        }
                    } else {
                        try {
                            break;
                        } catch (Throwable unused) {
                        }
                    }
                }
                inputStreamOpenRawResource.close();
                str2 = new String(bArr, 0, i4);
            } catch (Throwable unused2) {
                if (inputStreamOpenRawResource != null) {
                    try {
                        inputStreamOpenRawResource.close();
                    } catch (Throwable unused3) {
                    }
                }
            }
        } catch (Throwable unused4) {
            inputStreamOpenRawResource = null;
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        getPaint().setFlags(2);
        this.r1 = createWithJson(str2, str, this.c, iArr);
        this.d = Math.max(16, (int) (1000.0f / this.c[1]));
        if (z) {
            setAllowDecodeSingleFrame(true);
        }
    }

    public RLottieDrawable(String str, String str2, int i, int i2, boolean z, int[] iArr) {
        int[] iArr2 = new int[3];
        this.c = iArr2;
        this.e = -1;
        this.i = new HashMap();
        this.j = new HashMap();
        this.l = false;
        this.m = true;
        this.p = new ArraySet();
        this.q = 1;
        this.r = -1;
        this.J = 1.0f;
        this.K = 1.0f;
        this.Z = new RectF();
        this.n1 = new RectF[2];
        this.o1 = new Paint[2];
        this.B1 = new u3e(this, 0);
        this.C1 = new u3e(this, 1);
        this.E1 = new u3e(this, 2);
        this.F1 = new u3e(this, 3);
        this.K1 = new u3e(this, 4);
        this.srcRect = new Rect();
        this.M1 = -1;
        this.O1 = null;
        this.P1 = false;
        this.Q1 = null;
        this.S1 = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
        this.T1 = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
        this.U1 = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
        this.a = i;
        this.b = i2;
        this.R1 = str2;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        getPaint().setFlags(2);
        this.r1 = createWithJson(str, str2, iArr2, iArr);
        this.d = Math.max(16, (int) (1000.0f / iArr2[1]));
        if (z) {
            setAllowDecodeSingleFrame(true);
        }
        d();
    }
}
