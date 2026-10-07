package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.Looper;
import android.util.Rational;
import android.util.Size;
import android.view.Display;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk;
import androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class ghd extends FrameLayout {
    public dhd a;
    public hhd b;
    public final h4f c;
    public final bhd d;
    public boolean e;
    public final g8b f;
    public final AtomicReference g;
    public he2 h;
    public final ihd i;
    public final r1k j;
    public nf2 k;
    public MotionEvent l;
    public final eo5 m;
    public final ci1 n;
    public final c7k o;

    public ghd(Context context) {
        super(context, null, 0, 0);
        this.a = dhd.PERFORMANCE;
        bhd bhdVar = new bhd();
        bhdVar.h = ehd.FILL_CENTER;
        this.d = bhdVar;
        this.e = true;
        this.f = new g8b(fhd.a);
        this.g = new AtomicReference();
        this.i = new ihd(bhdVar);
        this.m = new eo5(1, this);
        this.n = new ci1(6, this);
        this.o = new c7k(21, this);
        wxl.a();
        Resources.Theme theme = context.getTheme();
        int[] iArr = d3e.a;
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(null, iArr, 0, 0);
        i7j.k(this, context, iArr, null, typedArrayObtainStyledAttributes, 0, 0);
        try {
            int integer = typedArrayObtainStyledAttributes.getInteger(1, bhdVar.h.a);
            for (ehd ehdVar : ehd.values()) {
                if (ehdVar.a == integer) {
                    setScaleType(ehdVar);
                    int integer2 = typedArrayObtainStyledAttributes.getInteger(0, 0);
                    for (dhd dhdVar : dhd.values()) {
                        if (dhdVar.a == integer2) {
                            setImplementationMode(dhdVar);
                            typedArrayObtainStyledAttributes.recycle();
                            this.j = new r1k(context, new qyb(9, this));
                            if (getBackground() == null) {
                                setBackgroundColor(getContext().getColor(R.color.black));
                            }
                            h4f h4fVar = new h4f(context, null, 0, 0);
                            h4fVar.setBackgroundColor(-1);
                            h4fVar.setAlpha(0.0f);
                            h4fVar.setElevation(Float.MAX_VALUE);
                            this.c = h4fVar;
                            h4fVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                            return;
                        }
                    }
                    throw new IllegalArgumentException("Unknown implementation mode id " + integer2);
                }
            }
            throw new IllegalArgumentException("Unknown scale type id " + integer);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static boolean c(ich ichVar, dhd dhdVar) {
        boolean zEquals = ichVar.e.j().C().equals("androidx.camera.camera2.legacy");
        boolean z = (tk5.a.b(SurfaceViewStretchedQuirk.class) == null && tk5.a.b(SurfaceViewNotCroppedByParentQuirk.class) == null) ? false : true;
        if (!zEquals && !z) {
            int iOrdinal = dhdVar.ordinal();
            if (iOrdinal == 0) {
                return false;
            }
            if (iOrdinal != 1) {
                qr7.y(dhdVar, "Invalid implementation mode: ");
                return false;
            }
        }
        return true;
    }

    private DisplayManager getDisplayManager() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        return (DisplayManager) context.getSystemService("display");
    }

    private x58 getScreenFlashInternal() {
        return this.c.getScreenFlash();
    }

    private int getViewPortScaleType() {
        int iOrdinal = getScaleType().ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i = 1;
        if (iOrdinal != 1) {
            i = 2;
            if (iOrdinal != 2) {
                i = 3;
                if (iOrdinal != 3 && iOrdinal != 4 && iOrdinal != 5) {
                    qr7.x(getScaleType(), "Unexpected scale type: ");
                    return 0;
                }
            }
        }
        return i;
    }

    private void setScreenFlashUiInfo(x58 x58Var) {
        he2 he2Var = this.h;
        if (he2Var == null) {
            tvj.a("PreviewView", "setScreenFlashUiInfo: mCameraController is null!");
            return;
        }
        e4f e4fVar = e4f.a;
        f4f f4fVar = new f4f(e4fVar, x58Var);
        f4f f4fVarI = he2Var.i();
        he2Var.I.put(e4fVar, f4fVar);
        f4f f4fVarI2 = he2Var.i();
        if (f4fVarI2 == null || f4fVarI2.equals(f4fVarI)) {
            return;
        }
        he2Var.w();
    }

    public final void a(boolean z) {
        wxl.a();
        b9j viewPort = getViewPort();
        if (this.h == null || viewPort == null || !isAttachedToWindow()) {
            return;
        }
        try {
            this.h.a(getSurfaceProvider(), viewPort);
        } catch (IllegalStateException e) {
            if (!z) {
                throw e;
            }
            tvj.d("PreviewView", e.toString(), e);
        }
    }

    public final void b() {
        Rect rect;
        Display defaultDisplay;
        nf2 nf2Var;
        wxl.a();
        if (this.b != null) {
            if (this.e && (defaultDisplay = getDefaultDisplay()) != null && (nf2Var = this.k) != null) {
                bhd bhdVar = this.d;
                int iD = nf2Var.D(defaultDisplay.getRotation());
                int rotation = defaultDisplay.getRotation();
                if (bhdVar.g) {
                    bhdVar.c = iD;
                    bhdVar.e = rotation;
                }
            }
            this.b.f();
        }
        ihd ihdVar = this.i;
        Size size = new Size(getWidth(), getHeight());
        int layoutDirection = getLayoutDirection();
        ihdVar.getClass();
        wxl.a();
        synchronized (ihdVar) {
            try {
                if (size.getWidth() == 0 || size.getHeight() == 0 || (rect = ihdVar.c) == null) {
                    ihdVar.d = null;
                } else {
                    ihdVar.d = ihdVar.b.a(size, layoutDirection, rect);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        he2 he2Var = this.h;
        if (he2Var != null) {
            Matrix sensorToViewTransform = getSensorToViewTransform();
            wxl.a();
            p48 p48Var = he2Var.h;
            if (p48Var != null && p48Var.f() == 1) {
                he2Var.h.m(sensorToViewTransform);
            }
        }
    }

    public Bitmap getBitmap() {
        wxl.a();
        hhd hhdVar = this.b;
        if (hhdVar == null) {
            return null;
        }
        FrameLayout frameLayout = hhdVar.b;
        Bitmap bitmapB = hhdVar.b();
        if (bitmapB == null) {
            return null;
        }
        bhd bhdVar = hhdVar.c;
        Size size = new Size(frameLayout.getWidth(), frameLayout.getHeight());
        int layoutDirection = frameLayout.getLayoutDirection();
        if (!bhdVar.f()) {
            return bitmapB;
        }
        Matrix matrixD = bhdVar.d();
        RectF rectFE = bhdVar.e(layoutDirection, size);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), bitmapB.getConfig());
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Matrix matrix = new Matrix();
        matrix.postConcat(matrixD);
        matrix.postScale(rectFE.width() / bhdVar.a.getWidth(), rectFE.height() / bhdVar.a.getHeight());
        matrix.postTranslate(rectFE.left, rectFE.top);
        canvas.drawBitmap(bitmapB, matrix, new Paint(7));
        return bitmapCreateBitmap;
    }

    public he2 getController() {
        wxl.a();
        return this.h;
    }

    public Display getDefaultDisplay() {
        if (getDisplay() == null) {
            return null;
        }
        Display display = getDisplayManager().getDisplay(0);
        return display != null ? display : getDisplay();
    }

    public dhd getImplementationMode() {
        wxl.a();
        return this.a;
    }

    public jxa getMeteringPointFactory() {
        wxl.a();
        return this.i;
    }

    public dkc getOutputTransform() {
        Matrix matrixC;
        bhd bhdVar = this.d;
        wxl.a();
        try {
            matrixC = bhdVar.c(getLayoutDirection(), new Size(getWidth(), getHeight()));
        } catch (IllegalStateException unused) {
            matrixC = null;
        }
        Rect rect = bhdVar.b;
        if (matrixC == null || rect == null) {
            tvj.a("PreviewView", "Transform info is not ready");
            return null;
        }
        RectF rectF = y1i.a;
        RectF rectF2 = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(y1i.a, rectF2, Matrix.ScaleToFit.FILL);
        matrixC.preConcat(matrix);
        if (this.b instanceof bph) {
            matrixC.postConcat(getMatrix());
        } else if (!getMatrix().isIdentity()) {
            tvj.g("PreviewView", "PreviewView needs to be in COMPATIBLE mode for the transform to work correctly.");
        }
        new Size(rect.width(), rect.height());
        return new dkc();
    }

    public b99 getPreviewStreamState() {
        return this.f;
    }

    public ehd getScaleType() {
        wxl.a();
        return this.d.h;
    }

    public x58 getScreenFlash() {
        return getScreenFlashInternal();
    }

    public Matrix getSensorToViewTransform() {
        wxl.a();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        Size size = new Size(getWidth(), getHeight());
        int layoutDirection = getLayoutDirection();
        bhd bhdVar = this.d;
        if (!bhdVar.f()) {
            return null;
        }
        Matrix matrix = new Matrix(bhdVar.d);
        matrix.postConcat(bhdVar.c(layoutDirection, size));
        return matrix;
    }

    public hgd getSurfaceProvider() {
        wxl.a();
        return this.o;
    }

    public b9j getViewPort() {
        wxl.a();
        Display defaultDisplay = getDefaultDisplay();
        if (defaultDisplay == null) {
            return null;
        }
        int rotation = defaultDisplay.getRotation();
        wxl.a();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        Rational rational = new Rational(getWidth(), getHeight());
        int viewPortScaleType = getViewPortScaleType();
        int layoutDirection = getLayoutDirection();
        b9j b9jVar = new b9j();
        b9jVar.a = viewPortScaleType;
        b9jVar.b = rational;
        b9jVar.c = rotation;
        b9jVar.d = layoutDirection;
        return b9jVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        DisplayManager displayManager;
        super.onAttachedToWindow();
        if (!isInEditMode() && (displayManager = getDisplayManager()) != null) {
            displayManager.registerDisplayListener(this.m, new Handler(Looper.getMainLooper()));
        }
        addOnLayoutChangeListener(this.n);
        hhd hhdVar = this.b;
        if (hhdVar != null) {
            hhdVar.c();
        }
        a(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        DisplayManager displayManager;
        super.onDetachedFromWindow();
        removeOnLayoutChangeListener(this.n);
        hhd hhdVar = this.b;
        if (hhdVar != null) {
            hhdVar.d();
        }
        he2 he2Var = this.h;
        if (he2Var != null) {
            he2Var.b();
        }
        if (isInEditMode() || (displayManager = getDisplayManager()) == null) {
            return;
        }
        displayManager.unregisterDisplayListener(this.m);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0158  */
    /* JADX WARN: Code duplicated, block: B:102:0x015c  */
    /* JADX WARN: Code duplicated, block: B:112:0x018f  */
    /* JADX WARN: Code duplicated, block: B:115:0x019b  */
    /* JADX WARN: Code duplicated, block: B:125:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:127:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:132:0x0144 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x0117 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00db  */
    /* JADX WARN: Code duplicated, block: B:74:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:80:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:86:0x0100  */
    /* JADX WARN: Code duplicated, block: B:88:0x0104  */
    /* JADX WARN: Code duplicated, block: B:90:0x0109 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x010b  */
    /* JADX WARN: Code duplicated, block: B:96:0x012a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x012c  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        int actionIndex;
        int i;
        int i2;
        float x;
        float y;
        float f;
        float f2;
        int i3;
        float fAbs;
        float fAbs2;
        float f3;
        float fHypot;
        boolean z3;
        if (this.h == null) {
            return super.onTouchEvent(motionEvent);
        }
        boolean z4 = motionEvent.getPointerCount() == 1;
        boolean z5 = motionEvent.getAction() == 1;
        boolean z6 = motionEvent.getEventTime() - motionEvent.getDownTime() < ((long) ViewConfiguration.getLongPressTimeout());
        if (z4 && z5 && z6) {
            this.l = motionEvent;
            performClick();
            return true;
        }
        r1k r1kVar = this.j;
        int i4 = r1kVar.a;
        qyb qybVar = r1kVar.b;
        motionEvent.getEventTime();
        int actionMasked = motionEvent.getActionMasked();
        if (r1kVar.c) {
            r1kVar.l.onTouchEvent(motionEvent);
        }
        int pointerCount = motionEvent.getPointerCount();
        boolean z7 = (motionEvent.getButtonState() & 32) != 0;
        boolean z8 = r1kVar.k == 2 && !z7;
        boolean z9 = actionMasked == 1 || actionMasked == 3 || z8;
        if (actionMasked == 0 || z9) {
            if (r1kVar.g) {
                r1kVar.a();
                qybVar.i(new p1k());
                r1kVar.g = false;
                r1kVar.h = 0.0f;
                r1kVar.k = 0;
            } else if (r1kVar.b() && z9) {
                r1kVar.g = false;
                r1kVar.h = 0.0f;
                r1kVar.k = 0;
            }
            if (!z9) {
                if (!r1kVar.g && r1kVar.d && !r1kVar.b() && !z9 && z7) {
                    r1kVar.i = motionEvent.getX();
                    r1kVar.j = motionEvent.getY();
                    r1kVar.k = 2;
                    r1kVar.h = 0.0f;
                }
                if (actionMasked != 0 || actionMasked == 6 || actionMasked == 5 || z8) {
                    z = true;
                } else {
                    z = false;
                }
                if (actionMasked == 6) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    actionIndex = motionEvent.getActionIndex();
                } else {
                    actionIndex = -1;
                }
                if (z2) {
                    i = pointerCount - 1;
                } else {
                    i = pointerCount;
                }
                if (r1kVar.b()) {
                    f2 = r1kVar.i;
                    f = r1kVar.j;
                    if (motionEvent.getY() < f) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    r1kVar.m = z3;
                } else {
                    x = 0.0f;
                    y = 0.0f;
                    for (i2 = 0; i2 < pointerCount; i2++) {
                        if (actionIndex != i2) {
                            x = motionEvent.getX(i2) + x;
                            y = motionEvent.getY(i2) + y;
                        }
                    }
                    float f4 = i;
                    float f5 = x / f4;
                    f = y / f4;
                    f2 = f5;
                }
                fAbs = 0.0f;
                fAbs2 = 0.0f;
                for (i3 = 0; i3 < pointerCount; i3++) {
                    if (actionIndex != i3) {
                        fAbs = Math.abs(motionEvent.getX(i3) - f2) + fAbs;
                        fAbs2 = Math.abs(motionEvent.getY(i3) - f) + fAbs2;
                    }
                }
                float f6 = i;
                f3 = (fAbs / f6) * 2.0f;
                fHypot = 2.0f * (fAbs2 / f6);
                if (r1kVar.b()) {
                    fHypot = (float) Math.hypot(f3, fHypot);
                }
                boolean z10 = r1kVar.g;
                gm0.K(f2);
                gm0.K(f);
                if (!r1kVar.b() && r1kVar.g && (fHypot < 0 || z)) {
                    r1kVar.a();
                    qybVar.i(new p1k());
                    r1kVar.g = false;
                    r1kVar.h = fHypot;
                }
                if (z) {
                    r1kVar.e = fHypot;
                    r1kVar.f = fHypot;
                    r1kVar.h = fHypot;
                }
                int i5 = r1kVar.b() ? i4 : 0;
                if (!r1kVar.g && fHypot >= i5 && (z10 || Math.abs(fHypot - r1kVar.h) > i4)) {
                    r1kVar.e = fHypot;
                    r1kVar.f = fHypot;
                    qybVar.i(new p1k());
                    r1kVar.g = true;
                }
                if (actionMasked == 2) {
                    r1kVar.e = fHypot;
                    if (r1kVar.g) {
                        qybVar.i(new q1k(r1kVar.a()));
                    }
                    r1kVar.f = r1kVar.e;
                }
            }
        } else {
            if (!r1kVar.g) {
                r1kVar.i = motionEvent.getX();
                r1kVar.j = motionEvent.getY();
                r1kVar.k = 2;
                r1kVar.h = 0.0f;
            }
            if (actionMasked != 0) {
                z = true;
            } else {
                z = true;
            }
            if (actionMasked == 6) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                actionIndex = motionEvent.getActionIndex();
            } else {
                actionIndex = -1;
            }
            if (z2) {
                i = pointerCount - 1;
            } else {
                i = pointerCount;
            }
            if (r1kVar.b()) {
                f2 = r1kVar.i;
                f = r1kVar.j;
                if (motionEvent.getY() < f) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                r1kVar.m = z3;
            } else {
                x = 0.0f;
                y = 0.0f;
                while (i2 < pointerCount) {
                    if (actionIndex != i2) {
                        x = motionEvent.getX(i2) + x;
                        y = motionEvent.getY(i2) + y;
                    }
                }
                float f7 = i;
                float f8 = x / f7;
                f = y / f7;
                f2 = f8;
            }
            fAbs = 0.0f;
            fAbs2 = 0.0f;
            while (i3 < pointerCount) {
                if (actionIndex != i3) {
                    fAbs = Math.abs(motionEvent.getX(i3) - f2) + fAbs;
                    fAbs2 = Math.abs(motionEvent.getY(i3) - f) + fAbs2;
                }
            }
            float f9 = i;
            f3 = (fAbs / f9) * 2.0f;
            fHypot = 2.0f * (fAbs2 / f9);
            if (r1kVar.b()) {
                fHypot = (float) Math.hypot(f3, fHypot);
            }
            boolean z11 = r1kVar.g;
            gm0.K(f2);
            gm0.K(f);
            if (!r1kVar.b()) {
                r1kVar.a();
                qybVar.i(new p1k());
                r1kVar.g = false;
                r1kVar.h = fHypot;
            }
            if (z) {
                r1kVar.e = fHypot;
                r1kVar.f = fHypot;
                r1kVar.h = fHypot;
            }
            if (r1kVar.b()) {
            }
            if (!r1kVar.g) {
                r1kVar.e = fHypot;
                r1kVar.f = fHypot;
                qybVar.i(new p1k());
                r1kVar.g = true;
            }
            if (actionMasked == 2) {
                r1kVar.e = fHypot;
                if (r1kVar.g) {
                    qybVar.i(new q1k(r1kVar.a()));
                }
                r1kVar.f = r1kVar.e;
            }
        }
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.h != null) {
            MotionEvent motionEvent = this.l;
            float x = motionEvent != null ? motionEvent.getX() : getWidth() / 2.0f;
            MotionEvent motionEvent2 = this.l;
            float y = motionEvent2 != null ? motionEvent2.getY() : getHeight() / 2.0f;
            he2 he2Var = this.h;
            ihd ihdVar = this.i;
            g8b g8bVar = he2Var.C;
            long j = he2Var.J;
            if (!he2Var.k()) {
                tvj.g("CameraController", "Use cases not attached to camera.");
            } else if (he2Var.y) {
                PointF pointF = new PointF(x, y);
                ixa ixaVarA = ihdVar.a(pointF.x, pointF.y, 0.16666667f);
                ixa ixaVarA2 = ihdVar.a(pointF.x, pointF.y, 0.25f);
                q36 q36Var = new q36();
                q36Var.b = new ArrayList();
                q36Var.c = new ArrayList();
                q36Var.d = new ArrayList();
                q36Var.a = 5000L;
                q36Var.b(ixaVarA, 1);
                q36Var.b(ixaVarA2, 2);
                if (j > 0) {
                    qyj.h("autoCancelDuration must be at least 1", j >= 1);
                    q36Var.a = j / 1000000;
                } else {
                    q36Var.a = 0L;
                }
                q36 q36Var2 = new q36();
                q36Var2.b = Collections.unmodifiableList((ArrayList) q36Var.b);
                q36Var2.c = Collections.unmodifiableList((ArrayList) q36Var.c);
                q36Var2.d = Collections.unmodifiableList((ArrayList) q36Var.d);
                q36Var2.a = q36Var.a;
                tvj.a("CameraController", "Tap to focus started: " + x + ", " + y);
                ch chVar = he2Var.z;
                if (chVar != null) {
                    synchronized (chVar.d) {
                        chVar.b = true;
                    }
                }
                g8bVar.i(new vih(1));
                ch chVar2 = new ch(pointF, g8bVar);
                he2Var.z = chVar2;
                o9b.a(((be2) ((ia) he2Var.q.r()).d).i(q36Var2), chVar2, zjl.a());
                long j2 = j / 1000000;
                tvj.a("CameraController", "Tap to focus auto cancel duration: " + j2 + " ms");
                if (j2 > 0) {
                    new Handler(Looper.getMainLooper()).postDelayed(new c3(28, chVar2), j2);
                }
            } else {
                tvj.a("CameraController", "Tap to focus disabled. ");
            }
        }
        this.l = null;
        return super.performClick();
    }

    public void setController(he2 he2Var) {
        wxl.a();
        he2 he2Var2 = this.h;
        if (he2Var2 != null && he2Var2 != he2Var) {
            he2Var2.b();
            setScreenFlashUiInfo(null);
        }
        this.h = he2Var;
        a(false);
        setScreenFlashUiInfo(getScreenFlashInternal());
    }

    public void setImplementationMode(dhd dhdVar) {
        wxl.a();
        this.a = dhdVar;
    }

    public void setScaleType(ehd ehdVar) {
        wxl.a();
        this.d.h = ehdVar;
        b();
        a(false);
    }

    public void setScreenFlashOverlayColor(int i) {
        this.c.setBackgroundColor(i);
    }

    public void setScreenFlashWindow(Window window) {
        wxl.a();
        this.c.setScreenFlashWindow(window);
        setScreenFlashUiInfo(getScreenFlashInternal());
    }
}
