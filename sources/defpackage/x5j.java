package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class x5j extends FrameLayout implements TextureView.SurfaceTextureListener {
    public static final /* synthetic */ zv8[] o = {new z8b(x5j.class, "videoShape", "getVideoShape()Lone/me/sdk/media/player/view/VideoView$VideoShape;"), zo5.e(zfe.a, x5j.class, "videoContentMode", "getVideoContentMode()Lone/me/sdk/media/player/view/VideoView$VideoContentMode;"), new z8b(x5j.class, "canUseTextureFill", "getCanUseTextureFill()Z")};
    public static final a8b p;
    public final String a;
    public v5j b;
    public Surface c;
    public SurfaceTexture d;
    public uvi e;
    public q5j f;
    public int g;
    public int h;
    public int i;
    public final int[] j;
    public final w5j k;
    public final w5j l;
    public final w5j m;
    public final Path n;

    static {
        int i = rx6.a;
        a8b a8bVar = new a8b(2);
        a8bVar.a(90.0f);
        a8bVar.a(-90.0f);
        p = a8bVar;
    }

    public x5j(Context context) {
        super(context);
        this.a = x5j.class.getName();
        this.j = new int[2];
        this.k = new w5j(this, 0);
        this.l = new w5j(this, 1);
        this.m = new w5j(this, 2);
        this.n = new Path();
    }

    private final void setupVideoDebugView(boolean z) {
        uvi uviVar = this.e;
        if (!z) {
            if (uviVar != null) {
                removeView(uviVar);
            }
            this.e = null;
            return;
        }
        if (uviVar == null) {
            Context context = getContext();
            uviVar = new uvi(context, null, 0);
            tvi tviVar = new tvi(context);
            uviVar.a = tviVar;
            uviVar.addView(tviVar, -2, -2);
            addView(uviVar);
            uviVar.setTranslationZ(1.0f);
        }
        this.e = uviVar;
    }

    public final void a(q5j q5jVar) {
        je9 je9Var = je9.d;
        String str = this.a;
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, "Video view. Bind listener and create surface, has listener:" + (q5jVar != null) + ", debug = " + (q5jVar != null ? Boolean.valueOf(q5jVar.isDebugEnabled()) : null), null);
        }
        this.f = q5jVar;
        this.i = q5jVar != null ? q5jVar.v() : 0;
        setupVideoDebugView(q5jVar != null ? q5jVar.isDebugEnabled() : false);
        e();
        if (this.b == null) {
            v5j v5jVar = new v5j(this, getContext());
            v5jVar.setSurfaceTextureListener(this);
            addView(v5jVar);
            this.b = v5jVar;
            return;
        }
        String str2 = this.a;
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, str2, zo5.s("Video view. Already has texture, has surface:", this.c != null), null);
        }
        Surface surface = this.c;
        if (surface == null || q5jVar == null) {
            return;
        }
        q5jVar.x(surface, this.e);
    }

    public final void b() {
        this.f = null;
        this.i = 0;
        this.g = 0;
        this.h = 0;
        uvi uviVar = this.e;
        if (uviVar != null) {
            uviVar.a.setPlayer(null);
        }
        v5j v5jVar = this.b;
        if (v5jVar != null) {
            v5jVar.setSurfaceTextureListener(null);
            removeView(v5jVar);
            this.b = null;
        }
        c();
    }

    public final void c() {
        String str = this.a;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "Video view. Surface release, " + this.d, null);
            }
        }
        Surface surface = this.c;
        if (surface != null) {
            surface.release();
        }
        this.c = null;
        SurfaceTexture surfaceTexture = this.d;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        this.d = null;
    }

    public final void d(int i, int i2, boolean z) {
        Matrix matrix;
        String str;
        if (z) {
            int i3 = this.i;
            boolean z2 = i > 0 && i2 > 0;
            boolean z3 = getMeasuredWidth() > 0 && getMeasuredHeight() > 0;
            if (z2 && z3 && i3 != 0) {
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                Matrix matrix2 = new Matrix();
                int iD = qt4.D(i3);
                if (iD == 0) {
                    float f = i2 / measuredHeight;
                    matrix = new Matrix();
                    matrix.setScale(i / measuredWidth, f, 0.0f, 0.0f);
                } else if (iD == 1) {
                    float f2 = measuredWidth;
                    float f3 = f2 / i;
                    float f4 = measuredHeight;
                    float f5 = f4 / i2;
                    float fMin = Math.min(f3, f5);
                    matrix = new Matrix();
                    matrix.setScale(fMin / f3, fMin / f5, f2 / 2.0f, f4 / 2.0f);
                } else {
                    if (iD != 2) {
                        if (i3 == 1) {
                            str = "NONE";
                        } else if (i3 != 2) {
                            str = i3 != 3 ? "null" : "CENTER_CROP";
                        } else {
                            str = "FIT_CENTER";
                        }
                        ore.p("Unknown scale type = ".concat(str));
                        return;
                    }
                    float f6 = measuredWidth;
                    float f7 = f6 / i;
                    float f8 = measuredHeight;
                    float f9 = f8 / i2;
                    float fMax = Math.max(f7, f9);
                    matrix = new Matrix();
                    matrix.setScale(fMax / f7, fMax / f9, f6 / 2.0f, f8 / 2.0f);
                }
                matrix2.postConcat(matrix);
                if (getVideoContentMode() == r5j.b && getCanUseTextureFill()) {
                    v5j v5jVar = this.b;
                    if (v5jVar != null) {
                        v5jVar.setTransform(null);
                    }
                } else {
                    v5j v5jVar2 = this.b;
                    if (v5jVar2 != null) {
                        v5jVar2.setTransform(matrix2);
                    }
                }
                this.g = i;
                this.h = i2;
            }
        } else {
            this.g = i;
            this.h = i2;
            requestLayout();
        }
        v5j v5jVar3 = this.b;
        if (v5jVar3 != null) {
            v5jVar3.setVisibility((this.g <= 0 || this.h <= 0) ? 4 : 0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Path path = this.n;
        if (path.isEmpty()) {
            super.dispatchDraw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.clipPath(path);
        try {
            super.dispatchDraw(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean zIsInstance;
        Class<?> cls = canvas.getClass();
        if (Build.VERSION.SDK_INT >= 29) {
            ny8 ny8Var = rk2.a;
            zIsInstance = ho.s(canvas);
        } else {
            zIsInstance = ((Class) rk2.a.getValue()).isInstance(canvas);
        }
        return (zIsInstance || cls.equals(Canvas.class)) && super.drawChild(canvas, view, j);
    }

    public final void e() {
        q5j q5jVar = this.f;
        int iN = q5jVar != null ? q5jVar.n() : 0;
        q5j q5jVar2 = this.f;
        d(iN, q5jVar2 != null ? q5jVar2.k() : 0, false);
    }

    public final boolean getCanUseTextureFill() {
        zv8 zv8Var = o[2];
        return ((Boolean) this.m.b).booleanValue();
    }

    public final r5j getVideoContentMode() {
        zv8 zv8Var = o[1];
        return (r5j) this.l.b;
    }

    public final u5j getVideoShape() {
        zv8 zv8Var = o[0];
        return (u5j) this.k.b;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int[] iArr;
        int[] iArr2;
        if (this.g <= 0 || this.h <= 0) {
            super.onMeasure(i, i2);
        } else {
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            int iOrdinal = getVideoContentMode().ordinal();
            if (iOrdinal == 0) {
                a8b a8bVar = p;
                float rotation = getRotation();
                float[] fArr = a8bVar.a;
                int i3 = a8bVar.b;
                int i4 = 0;
                while (true) {
                    if (i4 >= i3) {
                        int i5 = this.g;
                        int i6 = this.h;
                        iArr = this.j;
                        k4m.e(size, size2, i5, i6, iArr);
                        break;
                    }
                    if (fArr[i4] == rotation) {
                        int i7 = this.g;
                        int i8 = this.h;
                        iArr = this.j;
                        k4m.e(size2, size, i7, i8, iArr);
                        break;
                    }
                    i4++;
                }
                iArr2 = iArr;
            } else if (iOrdinal != 1) {
                ore.o();
                return;
            } else {
                iArr2 = this.j;
                iArr2[0] = size;
                iArr2[1] = size2;
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iArr2[0], 1073741824), View.MeasureSpec.makeMeasureSpec(iArr2[1], 1073741824));
            d(this.g, this.h, true);
        }
        u5j videoShape = getVideoShape();
        if (videoShape == null || getMeasuredWidth() <= 0 || getMeasuredHeight() <= 0) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        this.n.reset();
        if (!(videoShape instanceof s5j)) {
            if (videoShape instanceof t5j) {
                this.n.addRoundRect(0.0f, 0.0f, measuredWidth, measuredHeight, ((t5j) videoShape).a, Path.Direction.CW);
                return;
            } else {
                ore.o();
                return;
            }
        }
        if (measuredWidth == measuredHeight) {
            float f = measuredWidth / 2.0f;
            this.n.addCircle(f, measuredHeight / 2.0f, f, Path.Direction.CW);
            return;
        }
        String str = this.a;
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.f;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, qt4.l("VideoShape.AsCircle requires square dimensions but got width=", measuredWidth, measuredHeight, ", height="), null);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        String str = this.a;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "Video view. Surface available " + surfaceTexture + ", has listener:" + (this.f != null), null);
            }
        }
        SurfaceTexture surfaceTexture2 = this.d;
        if (surfaceTexture2 == null || !surfaceTexture2.equals(surfaceTexture)) {
            c();
            this.d = surfaceTexture;
            this.c = new Surface(surfaceTexture);
        }
        e();
        q5j q5jVar = this.f;
        if (q5jVar != null) {
            q5jVar.x(this.c, this.e);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        e();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public final void setCanUseTextureFill(boolean z) {
        this.m.B(this, o[2], Boolean.valueOf(z));
    }

    public final void setVideoContentMode(r5j r5jVar) {
        this.l.B(this, o[1], r5jVar);
    }

    public final void setVideoShape(u5j u5jVar) {
        this.k.B(this, o[0], u5jVar);
    }
}
