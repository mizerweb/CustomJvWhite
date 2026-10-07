package one.me.sdk.media.ffmpeg;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import defpackage.aj;
import defpackage.di;
import defpackage.ebb;
import defpackage.nn5;
import defpackage.rn5;
import defpackage.ry0;
import defpackage.sy0;
import defpackage.uy0;
import defpackage.ww6;
import defpackage.yi;
import defpackage.zi;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import one.me.rlottie.ImageReceiver;
import one.me.rlottie.RLottieDrawable;

/* JADX INFO: loaded from: classes3.dex */
public class AnimatedFileDrawable extends BitmapDrawable implements Animatable, sy0, ebb {
    public static final float[] V1 = new float[8];
    public static final ScheduledThreadPoolExecutor W1 = new ScheduledThreadPoolExecutor(8, new ThreadPoolExecutor.DiscardPolicy());
    public static final Rect rectTmp = new Rect();
    public boolean B1;
    public boolean D1;
    public uy0 E1;
    public ww6 F1;
    public int[] G;
    public boolean H1;
    public aj I1;
    public boolean K;
    public yi O1;
    public long P1;
    public Bitmap Q1;
    public long R1;
    public int S1;
    public int T1;
    public volatile boolean Y;
    public volatile boolean Z;
    public long a;
    public int b;
    public zi e;
    public Bitmap f;
    public int g;
    public Bitmap h;
    public int i;
    public boolean ignoreNoParent;
    public boolean isWebmSticker;
    public Bitmap j;
    public int k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean n1;
    public volatile long nativePtr;
    public boolean o;
    public nn5 o1;
    public boolean p;
    public float p1;
    public File q;
    public float q1;
    public final String r;
    public final int r1;
    public int repeatCount;
    public boolean s;
    public final int s1;
    public boolean skipFrameUpdate;
    public final boolean t1;
    public final ry0 u1;
    public boolean v;
    public boolean x;
    public long y;
    public View y1;
    public int c = 50;
    public final int[] d = new int[6];
    public volatile long t = -1;
    public volatile long u = -1;
    public final Object w = new Object();
    public final RectF z = new RectF();
    public final BitmapShader[] A = new BitmapShader[3];
    public final BitmapShader[] B = new BitmapShader[3];
    public final BitmapShader[] C = new BitmapShader[3];
    public final BitmapShader[] D = new BitmapShader[3];
    public final ArrayList E = new ArrayList();
    public final int[] F = new int[4];
    public final Path[] H = new Path[3];
    public float I = 1.0f;
    public float J = 1.0f;
    public final RectF X = new RectF();
    public float v1 = 1.0f;
    public final RectF[] w1 = new RectF[2];
    public final Paint[] x1 = new Paint[2];
    public final ArrayList z1 = new ArrayList();
    public final ArrayList A1 = new ArrayList();
    public boolean C1 = true;
    public final zi G1 = new zi(this, 0);
    public final zi J1 = new zi(this, true ? 1 : 0);
    public final zi K1 = new zi(this, 2);
    public int L1 = 0;
    public final zi M1 = new zi(this, 3);
    public final yi N1 = new yi(this, 1);
    public final Set U1 = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));

    public interface OnNextFrameRenderedListener {
        void onNextFrameRendered(AnimatedFileDrawable animatedFileDrawable);
    }

    public AnimatedFileDrawable(File file, int i, int i2, ry0 ry0Var, String str) {
        setIsWebmSticker(true);
        this.r1 = i2;
        this.s1 = i;
        this.t1 = ry0Var != null && i > 0 && i2 > 0;
        this.u1 = ry0Var;
        this.r = str;
        if (file == null) {
            return;
        }
        d(file, ry0Var);
    }

    public static void a(AnimatedFileDrawable animatedFileDrawable) {
        if (animatedFileDrawable.M1 == null && animatedFileDrawable.l && animatedFileDrawable.nativePtr != 0 && !animatedFileDrawable.H1) {
            destroyDecoder(animatedFileDrawable.nativePtr);
            animatedFileDrawable.nativePtr = 0L;
        }
        if (animatedFileDrawable.canLoadFrames()) {
            return;
        }
        Bitmap bitmap = animatedFileDrawable.f;
        if (bitmap != null) {
            bitmap.recycle();
            animatedFileDrawable.f = null;
        }
        Bitmap bitmap2 = animatedFileDrawable.j;
        if (bitmap2 != null) {
            bitmap2.recycle();
            animatedFileDrawable.j = null;
        }
        nn5 nn5Var = animatedFileDrawable.o1;
        if (nn5Var != null) {
            nn5Var.a.getLooper().quit();
            animatedFileDrawable.o1 = null;
        }
        int i = 0;
        while (true) {
            int size = animatedFileDrawable.E.size();
            ArrayList arrayList = animatedFileDrawable.E;
            if (i >= size) {
                arrayList.clear();
                animatedFileDrawable.invalidateInternal();
                return;
            } else {
                ((Bitmap) arrayList.get(i)).recycle();
                i++;
            }
        }
    }

    public static native long createDecoder(String str, int[] iArr);

    public static native void destroyDecoder(long j);

    public static native int getFrameAtTime(long j, long j2, Bitmap bitmap, int[] iArr, int i);

    public static native int getVideoFrame(long j, Bitmap bitmap, int[] iArr, int i, boolean z, float f, float f2, boolean z2);

    public static native void prepareToSeek(long j);

    public static native void seekToMs(long j, long j2, int[] iArr, boolean z);

    public static native void stopDecoder(long j);

    public void addOnNextFrameRenderedListener(OnNextFrameRenderedListener onNextFrameRenderedListener) {
        this.U1.add(onNextFrameRenderedListener);
    }

    public void addParent(ImageReceiver imageReceiver) {
        if (imageReceiver != null && !this.A1.contains(imageReceiver)) {
            this.A1.add(imageReceiver);
            if (this.Y) {
                e();
            }
        }
        checkCacheCancel();
    }

    public void addSecondParentView(View view) {
        if (view != null) {
            ArrayList arrayList = this.z1;
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
        }
    }

    public final void b(RectF rectF, Paint paint, Canvas canvas, float f, float f2) {
        canvas.translate(rectF.left, rectF.top);
        int i = this.d[2];
        if (i == 90) {
            canvas.rotate(90.0f);
            canvas.translate(0.0f, -rectF.width());
        } else if (i == 180) {
            canvas.rotate(180.0f);
            canvas.translate(-rectF.width(), -rectF.height());
        } else if (i == 270) {
            canvas.rotate(270.0f);
            canvas.translate(-rectF.height(), 0.0f);
        }
        canvas.scale(f, f2);
        canvas.drawBitmap(this.f, 0.0f, 0.0f, paint);
    }

    public final void c() {
        Set set = this.U1;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((OnNextFrameRenderedListener) it.next()).onNextFrameRendered(this);
            it.remove();
        }
    }

    public boolean canLoadFrames() {
        if (this.t1) {
            return this.E1 != null;
        }
        return (this.nativePtr == 0 && this.m) ? false : true;
    }

    public void checkCacheCancel() {
        yi yiVar;
        if (this.E1 == null) {
            return;
        }
        boolean zIsEmpty = this.A1.isEmpty();
        if (zIsEmpty && this.O1 == null) {
            yi yiVar2 = new yi(this, 2);
            this.O1 = yiVar2;
            di.e(yiVar2, 600L);
        } else {
            if (zIsEmpty || (yiVar = this.O1) == null) {
                return;
            }
            di.a.removeCallbacks(yiVar);
            this.O1 = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
    
        r3.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void checkCacheExist() throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r7.t1
            if (r0 == 0) goto L5f
            uy0 r7 = r7.E1
            if (r7 == 0) goto L5f
            boolean r0 = r7.r
            if (r0 == 0) goto Ld
            goto L5f
        Ld:
            r0 = 1
            r1 = 0
            java.lang.Object r2 = r7.h     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L58
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L58
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L41
            java.io.File r4 = r7.m     // Catch: java.lang.Throwable -> L41
            java.lang.String r5 = "r"
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> L41
            boolean r1 = r3.readBoolean()     // Catch: java.lang.Throwable -> L35
            r7.s = r1     // Catch: java.lang.Throwable -> L35
            int r1 = r3.readInt()     // Catch: java.lang.Throwable -> L35
            long r4 = (long) r1     // Catch: java.lang.Throwable -> L35
            r3.seek(r4)     // Catch: java.lang.Throwable -> L35
            int r1 = r3.readInt()     // Catch: java.lang.Throwable -> L35
            if (r1 > 0) goto L37
            r1 = 0
            r7.s = r1     // Catch: java.lang.Throwable -> L35
            r7.q = r0     // Catch: java.lang.Throwable -> L35
            goto L37
        L35:
            r1 = move-exception
            goto L45
        L37:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L35
            r3.close()     // Catch: java.io.IOException -> L3c
            goto L5d
        L3c:
            r1 = move-exception
            r1.printStackTrace()
            goto L5d
        L41:
            r3 = move-exception
            r6 = r3
            r3 = r1
            r1 = r6
        L45:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L35
            throw r1     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4a
        L47:
            r7 = move-exception
            r1 = r3
            goto L4d
        L4a:
            r1 = r3
            goto L58
        L4c:
            r7 = move-exception
        L4d:
            if (r1 == 0) goto L57
            r1.close()     // Catch: java.io.IOException -> L53
            goto L57
        L53:
            r0 = move-exception
            r0.printStackTrace()
        L57:
            throw r7
        L58:
            if (r1 == 0) goto L5d
            r1.close()     // Catch: java.io.IOException -> L3c
        L5d:
            r7.r = r0
        L5f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.sdk.media.ffmpeg.AnimatedFileDrawable.checkCacheExist():void");
    }

    public final void d(File file, ry0 ry0Var) {
        this.q = file;
        getPaint().setFlags(3);
        if (!this.t1) {
            this.nativePtr = createDecoder(file.getAbsolutePath(), this.d);
            this.n1 = this.nativePtr == 0 && (!this.isWebmSticker || this.L1 > 15);
            if (this.nativePtr != 0) {
                int[] iArr = this.d;
                if (iArr[0] > 3840 || iArr[1] > 3840) {
                    destroyDecoder(this.nativePtr);
                    this.nativePtr = 0L;
                }
            }
            g();
            this.m = true;
        }
        if (this.t1) {
            this.nativePtr = createDecoder(file.getAbsolutePath(), this.d);
            this.n1 = this.nativePtr == 0 && (!this.isWebmSticker || this.L1 > 15);
            if (this.nativePtr != 0) {
                int[] iArr2 = this.d;
                if (iArr2[0] > 3840 || iArr2[1] > 3840) {
                    destroyDecoder(this.nativePtr);
                    this.nativePtr = 0L;
                    return;
                }
            }
            this.E1 = new uy0(file, this, ry0Var, this.s1, this.r1, true ^ this.D1);
        }
    }

    public boolean decoderFailed() {
        return this.m && this.n1;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        drawInternal(canvas, false, System.currentTimeMillis(), 0);
    }

    public void drawFrame(Canvas canvas, int i) {
        if (this.nativePtr == 0) {
            return;
        }
        for (int i2 = 0; i2 < i; i2++) {
            getNextFrame(true);
        }
        Bitmap backgroundBitmap = getBackgroundBitmap();
        if (backgroundBitmap == null) {
            backgroundBitmap = getNextFrame(true);
        }
        Rect rect = rectTmp;
        rect.set(0, 0, backgroundBitmap.getWidth(), backgroundBitmap.getHeight());
        canvas.drawBitmap(getBackgroundBitmap(), rect, getBounds(), getPaint());
    }

    public void drawInBackground(Canvas canvas, float f, float f2, float f3, float f4, int i, ColorFilter colorFilter, int i2) {
        RectF[] rectFArr = this.w1;
        RectF rectF = rectFArr[i2];
        Paint[] paintArr = this.x1;
        if (rectF == null) {
            rectFArr[i2] = new RectF();
            paintArr[i2] = new Paint();
            paintArr[i2].setFilterBitmap(true);
        }
        paintArr[i2].setAlpha(i);
        paintArr[i2].setColorFilter(colorFilter);
        rectFArr[i2].set(f, f2, f3 + f, f4 + f2);
        drawInternal(canvas, true, 0L, i2);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c8 A[LOOP:1: B:56:0x00c3->B:58:0x00c8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:61:0x00db  */
    /* JADX WARN: Code duplicated, block: B:62:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f3 A[LOOP:0: B:41:0x009d->B:66:0x00f3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:69:0x00f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00d6 A[EDGE_INSN: B:71:0x00d6->B:59:0x00d6 BREAK  A[LOOP:1: B:56:0x00c3->B:58:0x00c8], SYNTHETIC] */
    public void drawInternal(Canvas canvas, boolean z, long j, int i) {
        float f;
        float fWidth;
        float f2;
        int i2;
        int[] iArr;
        int i3;
        Path[] pathArr;
        Path path;
        int length;
        float[] fArr;
        RectF rectF;
        if (!canLoadFrames() || this.l) {
            return;
        }
        if (j == 0) {
            j = System.currentTimeMillis();
        }
        RectF rectF2 = z ? this.w1[i] : this.X;
        Paint paint = z ? this.x1[i] : getPaint();
        int i4 = 0;
        if (!z) {
            updateCurrentFrame(j, false);
        }
        Bitmap bitmap = this.f;
        if (bitmap == null) {
            return;
        }
        float f3 = this.I;
        float fHeight = this.J;
        int[] iArr2 = this.d;
        if (z) {
            int width = bitmap.getWidth();
            int height = this.f.getHeight();
            int i5 = iArr2[2];
            if (i5 == 90 || i5 == 270) {
                height = width;
                width = height;
            }
            fWidth = rectF2.width() / width;
            fHeight = rectF2.height() / height;
        } else {
            if (this.K) {
                int width2 = bitmap.getWidth();
                int height2 = this.f.getHeight();
                int i6 = iArr2[2];
                if (i6 == 90 || i6 == 270) {
                    height2 = width2;
                    width2 = height2;
                }
                rectF2.set(getBounds());
                fWidth = rectF2.width() / width2;
                this.I = fWidth;
                fHeight = rectF2.height() / height2;
                this.J = fHeight;
                this.K = false;
            } else {
                f = f3;
            }
            f2 = fHeight;
            i2 = 0;
            while (true) {
                iArr = this.F;
                if (i2 < iArr.length) {
                    b(rectF2, paint, canvas, f, f2);
                    return;
                }
                if (iArr[i2] != 0) {
                    if (z) {
                        i3 = i + 1;
                    } else {
                        i3 = 0;
                    }
                    pathArr = this.H;
                    path = pathArr[i3];
                    if (path == null) {
                        path = new Path();
                        pathArr[i3] = path;
                    }
                    if (this.C1 || z) {
                        if (!z) {
                            this.C1 = false;
                        }
                        while (true) {
                            length = iArr.length;
                            fArr = V1;
                            if (i4 >= length) {
                                break;
                            }
                            int i7 = i4 * 2;
                            float f4 = iArr[i4];
                            fArr[i7] = f4;
                            fArr[i7 + 1] = f4;
                            i4++;
                        }
                        path.rewind();
                        if (z) {
                            rectF = rectF2;
                        } else {
                            rectF = this.z;
                        }
                        path.addRoundRect(rectF, fArr, Path.Direction.CW);
                    }
                    canvas.save();
                    canvas.clipPath(path);
                    b(rectF2, paint, canvas, f, f2);
                    canvas.restore();
                    return;
                }
                i2++;
            }
        }
        f = fWidth;
        f2 = fHeight;
        i2 = 0;
        while (true) {
            iArr = this.F;
            if (i2 < iArr.length) {
                b(rectF2, paint, canvas, f, f2);
                return;
            }
            if (iArr[i2] != 0) {
                if (z) {
                    i3 = i + 1;
                } else {
                    i3 = 0;
                }
                pathArr = this.H;
                path = pathArr[i3];
                if (path == null) {
                    path = new Path();
                    pathArr[i3] = path;
                }
                if (this.C1) {
                    if (!z) {
                        this.C1 = false;
                    }
                    while (true) {
                        length = iArr.length;
                        fArr = V1;
                        if (i4 >= length) {
                            break;
                            break;
                        }
                        int i8 = i4 * 2;
                        float f5 = iArr[i4];
                        fArr[i8] = f5;
                        fArr[i8 + 1] = f5;
                        i4++;
                    }
                    path.rewind();
                    if (z) {
                        rectF = rectF2;
                    } else {
                        rectF = this.z;
                    }
                    path.addRoundRect(rectF, fArr, Path.Direction.CW);
                } else {
                    if (!z) {
                        this.C1 = false;
                    }
                    while (true) {
                        length = iArr.length;
                        fArr = V1;
                        if (i4 >= length) {
                            break;
                            break;
                        }
                        int i9 = i4 * 2;
                        float f6 = iArr[i4];
                        fArr[i9] = f6;
                        fArr[i9 + 1] = f6;
                        i4++;
                    }
                    path.rewind();
                    if (z) {
                        rectF = rectF2;
                    } else {
                        rectF = this.z;
                    }
                    path.addRoundRect(rectF, fArr, Path.Direction.CW);
                }
                canvas.save();
                canvas.clipPath(path);
                b(rectF2, paint, canvas, f, f2);
                canvas.restore();
                return;
            }
            i2++;
        }
    }

    public final void e() {
        f(true, false);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void f(boolean z, boolean z2) {
        zi ziVar;
        zi ziVar2;
        if ((this.e == null || z2) && this.h == null && canLoadFrames() && !this.l) {
            if (!this.Y) {
                boolean z3 = this.n;
                if (!z3) {
                    return;
                }
                if (z3 && this.o) {
                    return;
                }
            }
            if ((this.A1.size() != 0 || this.ignoreNoParent) && !this.H1) {
                long jMin = 0;
                if (z && this.y != 0) {
                    long j = this.c;
                    jMin = Math.min(j, Math.max(0L, j - (System.currentTimeMillis() - this.y)));
                }
                if (!this.B1) {
                    if (this.o1 == null) {
                        this.o1 = new nn5("decodeQueue" + this);
                    }
                    if (z2 && (ziVar = this.e) != null) {
                        this.o1.a(ziVar);
                    }
                    nn5 nn5Var = this.o1;
                    zi ziVar3 = this.M1;
                    this.e = ziVar3;
                    nn5Var.c(ziVar3, jMin);
                    return;
                }
                if (this.D1) {
                    zi ziVar4 = this.M1;
                    this.e = ziVar4;
                    rn5.a(ziVar4, false);
                    return;
                }
                if (z2 && (ziVar2 = this.e) != null) {
                    W1.remove(ziVar2);
                }
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = W1;
                zi ziVar5 = this.M1;
                this.e = ziVar5;
                scheduledThreadPoolExecutor.schedule(ziVar5, jMin, TimeUnit.MILLISECONDS);
            }
        }
    }

    public final void finalize() throws Throwable {
        try {
            this.z1.clear();
            recycle();
        } finally {
            super.finalize();
        }
    }

    public final void g() {
        int i;
        int i2;
        int[] iArr;
        int i3;
        int i4;
        if (this.isWebmSticker || (i = this.r1) <= 0 || (i2 = this.s1) <= 0 || (i3 = (iArr = this.d)[0]) <= 0 || (i4 = iArr[1]) <= 0) {
            this.v1 = 1.0f;
            return;
        }
        float fMax = Math.max(i2 / i3, i / i4);
        this.v1 = fMax;
        if (fMax <= 0.0f || fMax > 0.7d) {
            this.v1 = 1.0f;
        }
    }

    public Bitmap getAnimatedBitmap() {
        Bitmap bitmap = this.f;
        if (bitmap != null) {
            return bitmap;
        }
        Bitmap bitmap2 = this.h;
        if (bitmap2 != null) {
            return bitmap2;
        }
        return null;
    }

    public Bitmap getBackgroundBitmap() {
        return this.j;
    }

    public float getCurrentProgress() {
        float f;
        int i;
        if (this.d[4] == 0) {
            return 0.0f;
        }
        if (this.u >= 0) {
            f = this.u;
            i = this.d[4];
        } else {
            int[] iArr = this.d;
            f = iArr[3];
            i = iArr[4];
        }
        return f / i;
    }

    public int getCurrentProgressMs() {
        if (this.u >= 0) {
            return (int) this.u;
        }
        int i = this.i;
        return i != 0 ? i : this.g;
    }

    public int getDurationMs() {
        return this.d[4];
    }

    public File getFilePath() {
        return this.q;
    }

    public Bitmap getFirstFrame(Bitmap bitmap) {
        int i = this.s1;
        if (bitmap == null) {
            bitmap = Bitmap.createBitmap(i, this.r1, Bitmap.Config.ARGB_8888);
        }
        Canvas canvas = new Canvas(bitmap);
        String absolutePath = this.q.getAbsolutePath();
        int[] iArr = this.d;
        long jCreateDecoder = createDecoder(absolutePath, iArr);
        if (jCreateDecoder == 0) {
            return bitmap;
        }
        if (this.Q1 == null) {
            this.Q1 = Bitmap.createBitmap(Math.max(1, iArr[0]), Math.max(1, iArr[1]), Bitmap.Config.ARGB_8888);
        }
        Bitmap bitmap2 = this.Q1;
        getVideoFrame(jCreateDecoder, bitmap2, this.d, bitmap2.getRowBytes(), false, this.p1, this.q1, true);
        destroyDecoder(jCreateDecoder);
        bitmap.eraseColor(0);
        canvas.save();
        float width = i / this.Q1.getWidth();
        canvas.scale(width, width);
        canvas.drawBitmap(this.Q1, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
        return bitmap;
    }

    public int getFps() {
        return this.d[5];
    }

    public Bitmap getFrameAtTime(long j, boolean z) {
        if (this.m && this.nativePtr != 0) {
            if (!z) {
                seekToMs(this.nativePtr, j, this.d, z);
            }
            int[] iArr = this.d;
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr[0], iArr[1], Bitmap.Config.ARGB_8888);
            long j2 = this.nativePtr;
            if ((z ? getFrameAtTime(j2, j, bitmapCreateBitmap, this.d, bitmapCreateBitmap.getRowBytes()) : getVideoFrame(j2, bitmapCreateBitmap, this.d, bitmapCreateBitmap.getRowBytes(), true, 0.0f, 0.0f, true)) != 0) {
                return bitmapCreateBitmap;
            }
        }
        return null;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        int i = 0;
        if (this.m) {
            int[] iArr = this.d;
            int i2 = iArr[2];
            i = (i2 == 90 || i2 == 270) ? iArr[0] : iArr[1];
        }
        return i == 0 ? di.a(100.0f) : (int) (i * this.v1);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        int i = 0;
        if (this.m) {
            int[] iArr = this.d;
            int i2 = iArr[2];
            i = (i2 == 90 || i2 == 270) ? iArr[1] : iArr[0];
        }
        return i == 0 ? di.a(100.0f) : (int) (i * this.v1);
    }

    public long getLastFrameTimestamp() {
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        int i = 0;
        if (this.m) {
            int[] iArr = this.d;
            int i2 = iArr[2];
            i = (i2 == 90 || i2 == 270) ? iArr[0] : iArr[1];
        }
        return i == 0 ? di.a(100.0f) : i;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        int i = 0;
        if (this.m) {
            int[] iArr = this.d;
            int i2 = iArr[2];
            i = (i2 == 90 || i2 == 270) ? iArr[1] : iArr[0];
        }
        return i == 0 ? di.a(100.0f) : i;
    }

    @Override // defpackage.sy0
    public int getNextFrame(Bitmap bitmap) {
        int i;
        if (this.R1 == 0) {
            return -1;
        }
        Canvas canvas = new Canvas(bitmap);
        Bitmap bitmap2 = this.Q1;
        int[] iArr = this.d;
        if (bitmap2 == null) {
            this.Q1 = Bitmap.createBitmap(iArr[0], iArr[1], Bitmap.Config.ARGB_8888);
        }
        long j = this.R1;
        Bitmap bitmap3 = this.Q1;
        getVideoFrame(j, bitmap3, this.d, bitmap3.getRowBytes(), false, this.p1, this.q1, true);
        long j2 = this.P1;
        if (j2 != 0 && ((i = iArr[3]) == 0 || j2 > i)) {
            return 0;
        }
        int i2 = this.T1;
        int i3 = iArr[3];
        if (i2 == i3) {
            int i4 = this.S1 + 1;
            this.S1 = i4;
            if (i4 > 5) {
                return 0;
            }
        }
        this.T1 = i3;
        bitmap.eraseColor(0);
        canvas.save();
        float width = this.s1 / this.Q1.getWidth();
        canvas.scale(width, width);
        canvas.drawBitmap(this.Q1, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
        this.P1 = iArr[3];
        return 1;
    }

    public Bitmap getNextRenderingBitmap() {
        return this.h;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    public int getOrientation() {
        return this.d[2];
    }

    public int getProgressMs() {
        return this.d[3];
    }

    public Bitmap getRenderingBitmap() {
        return this.f;
    }

    public int getRenderingHeight() {
        return this.r1;
    }

    public int getRenderingWidth() {
        return this.s1;
    }

    public long getStartTime() {
        return (long) (this.p1 * 1000.0f);
    }

    public boolean hasBitmap() {
        if (canLoadFrames()) {
            return (this.f == null && this.h == null) ? false : true;
        }
        return false;
    }

    public void invalidateInternal() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A1;
            if (i >= arrayList.size()) {
                return;
            }
            ((ImageReceiver) arrayList.get(i)).invalidate();
            i++;
        }
    }

    public boolean isRecycled() {
        return this.Z || this.L1 >= 15;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.Y;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.K = true;
    }

    @Override // defpackage.ebb
    public void onFailed(Throwable th) {
        WebmConfig.getLogger().e("Fail load webm by url: " + this.r, th);
    }

    @Override // defpackage.ebb
    public void onFinished(String str, File file, String str2) {
        WebmConfig.getLogger().l("Success load webm by url: " + str);
        d(file, this.u1);
        di.d(new yi(this, 0));
    }

    @Override // defpackage.sy0
    public void prepareForGenerateCache() {
        this.R1 = createDecoder(this.q.getAbsolutePath(), this.d);
    }

    public void recycle() {
        if (!this.z1.isEmpty()) {
            this.s = true;
            return;
        }
        this.Y = false;
        this.Z = true;
        if (this.I1 != null) {
            uy0.c();
            RLottieDrawable.lottieCacheGenerateQueue.a(this.I1);
            this.I1 = null;
        }
        if (this.e == null) {
            if (this.nativePtr != 0) {
                destroyDecoder(this.nativePtr);
                this.nativePtr = 0L;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.f);
            arrayList.add(this.h);
            arrayList.add(this.j);
            arrayList.addAll(this.E);
            this.E.clear();
            this.f = null;
            this.h = null;
            this.j = null;
            nn5 nn5Var = this.o1;
            if (nn5Var != null) {
                nn5Var.a.getLooper().quit();
                this.o1 = null;
            }
            getPaint().setShader(null);
            di.c(arrayList);
        } else {
            this.l = true;
        }
        invalidateInternal();
    }

    @Override // defpackage.sy0
    public void releaseForGenerateCache() {
        long j = this.R1;
        if (j != 0) {
            destroyDecoder(j);
        }
    }

    public void removeOnNextFrameRenderedListener(OnNextFrameRenderedListener onNextFrameRenderedListener) {
        this.U1.remove(onNextFrameRenderedListener);
    }

    public void removeParent(ImageReceiver imageReceiver) {
        ArrayList arrayList = this.A1;
        arrayList.remove(imageReceiver);
        if (arrayList.isEmpty()) {
            this.repeatCount = 0;
        }
        checkCacheCancel();
    }

    public void removeSecondParentView(View view) {
        ArrayList arrayList = this.z1;
        arrayList.remove(view);
        if (arrayList.isEmpty()) {
            if (this.s) {
                recycle();
                return;
            }
            int[] iArr = this.G;
            if (iArr != null) {
                setRoundRadius(iArr);
            }
        }
    }

    public void replaceAnimatedBitmap(Bitmap bitmap) {
        Bitmap bitmap2 = this.f;
        ArrayList arrayList = this.E;
        if (bitmap2 != null) {
            arrayList.add(bitmap2);
        }
        Bitmap bitmap3 = this.h;
        if (bitmap3 != null) {
            arrayList.add(bitmap3);
        }
        this.f = bitmap;
        this.h = null;
    }

    public void resetStream(boolean z) {
        if (this.nativePtr != 0) {
            long j = this.nativePtr;
            if (z) {
                stopDecoder(j);
            } else {
                prepareToSeek(j);
            }
        }
    }

    public void seekTo(long j, boolean z, boolean z2) {
        synchronized (this.w) {
            try {
                this.t = j;
                this.u = j;
                if (this.nativePtr != 0) {
                    prepareToSeek(this.nativePtr);
                }
                if (z2 && this.n) {
                    this.o = false;
                    if (this.e == null) {
                        f(false, true);
                    } else {
                        this.p = true;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void seekToSync(long j) {
        if (this.nativePtr == 0) {
            return;
        }
        seekToMs(this.nativePtr, j, this.d, true);
    }

    public void setActualDrawRect(float f, float f2, float f3, float f4) {
        float f5 = f4 + f2;
        float f6 = f3 + f;
        RectF rectF = this.z;
        if (rectF.left == f && rectF.top == f2 && rectF.right == f6 && rectF.bottom == f5) {
            return;
        }
        rectF.set(f, f2, f6, f5);
        this.C1 = true;
    }

    public void setAllowDecodeSingleFrame(boolean z) {
        this.n = z;
        if (z) {
            e();
        }
    }

    public void setInvalidateParentViewWithSecond(boolean z) {
        this.x = z;
    }

    public void setIsWebmSticker(boolean z) {
        this.isWebmSticker = z;
        if (z) {
            this.B1 = true;
        }
    }

    public void setLimitFps(boolean z) {
        this.D1 = z;
    }

    public void setParentView(View view) {
        if (this.y1 != null) {
            return;
        }
        this.y1 = view;
    }

    public void setRoundRadius(int[] iArr) {
        boolean zIsEmpty = this.z1.isEmpty();
        int[] iArr2 = this.F;
        if (!zIsEmpty) {
            if (this.G == null) {
                this.G = new int[4];
            }
            int[] iArr3 = this.G;
            System.arraycopy(iArr2, 0, iArr3, 0, iArr3.length);
        }
        for (int i = 0; i < 4; i++) {
            if (!this.C1 && iArr[i] != iArr2[i]) {
                this.C1 = true;
            }
            iArr2[i] = iArr[i];
        }
    }

    public void setStartEndTime(long j, long j2) {
        this.p1 = j / 1000.0f;
        this.q1 = j2 / 1000.0f;
        if (j < 0 || getCurrentProgressMs() >= j) {
            return;
        }
        seekTo(j, true);
    }

    public void setUseSharedQueue(boolean z) {
        if (this.isWebmSticker) {
            return;
        }
        this.B1 = z;
    }

    public void skipNextFrame(boolean z) {
        if (this.nativePtr == 0) {
            return;
        }
        getVideoFrame(this.nativePtr, null, this.d, 0, false, this.p1, this.q1, z);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (this.Y) {
            return;
        }
        if (!this.A1.isEmpty() || this.ignoreNoParent) {
            this.Y = true;
            e();
            di.d(this.N1);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.Y = false;
    }

    public void updateCurrentFrame(long j, boolean z) {
        if (!this.Y) {
            if (this.Y || !this.n || Math.abs(j - this.a) < this.c || this.h == null) {
                return;
            }
            this.E.add(this.f);
            this.f = this.h;
            this.g = this.i;
            for (int i = 0; i < this.D.length; i++) {
                BitmapShader[] bitmapShaderArr = this.A;
                BitmapShader[] bitmapShaderArr2 = this.B;
                bitmapShaderArr[i] = bitmapShaderArr2[i];
                BitmapShader[] bitmapShaderArr3 = this.C;
                bitmapShaderArr2[i] = bitmapShaderArr3[i];
                bitmapShaderArr3[i] = null;
            }
            this.i = 0;
            this.h = null;
            this.a = j;
            c();
            e();
            return;
        }
        Bitmap bitmap = this.f;
        if (bitmap == null && this.h == null) {
            e();
            return;
        }
        if (this.h == null || (bitmap != null && (Math.abs(j - this.a) < this.c || this.skipFrameUpdate || this.u >= 0))) {
            invalidateInternal();
            return;
        }
        this.E.add(this.f);
        this.f = this.h;
        this.g = this.i;
        for (int i2 = 0; i2 < this.D.length; i2++) {
            BitmapShader[] bitmapShaderArr4 = this.A;
            BitmapShader[] bitmapShaderArr5 = this.B;
            bitmapShaderArr4[i2] = bitmapShaderArr5[i2];
            BitmapShader[] bitmapShaderArr6 = this.C;
            bitmapShaderArr5[i2] = bitmapShaderArr6[i2];
            bitmapShaderArr6[i2] = null;
        }
        this.i = 0;
        this.h = null;
        this.a = j;
        c();
        e();
    }

    public void seekTo(long j, boolean z) {
        seekTo(j, z, false);
    }

    public Bitmap getFrameAtTime(long j) {
        return getFrameAtTime(j, false);
    }

    public Bitmap getNextFrame(boolean z) {
        long j = this.nativePtr;
        Bitmap bitmap = this.j;
        if (j == 0) {
            return bitmap;
        }
        if (bitmap == null) {
            if (!this.E.isEmpty()) {
                this.j = (Bitmap) this.E.remove(0);
            } else {
                int[] iArr = this.d;
                float f = iArr[0];
                float f2 = this.v1;
                this.j = Bitmap.createBitmap((int) (f * f2), (int) (iArr[1] * f2), Bitmap.Config.ARGB_8888);
            }
        }
        long j2 = this.nativePtr;
        Bitmap bitmap2 = this.j;
        getVideoFrame(j2, bitmap2, this.d, bitmap2.getRowBytes(), false, this.p1, this.q1, z);
        return this.j;
    }
}
