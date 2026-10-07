package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;

/* JADX INFO: loaded from: classes2.dex */
public final class bwc extends z1k {
    public static final /* synthetic */ zv8[] A;
    public final String s;
    public final GestureDetector t;
    public ScaleGestureDetector u;
    public zvc v;
    public b68 w;
    public boolean x;
    public float y;
    public final awc z;

    static {
        z8b z8bVar = new z8b(bwc.class, "resetScale", "getResetScale()Z");
        zfe.a.getClass();
        A = new zv8[]{z8bVar};
    }

    public bwc(Context context) {
        super(context);
        this.s = bwc.class.getName();
        this.z = new awc(this, context);
        GestureDetector gestureDetector = new GestureDetector(context, new pi9(12, this));
        this.t = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        xj7 xj7Var = new xj7(getResources());
        xj7Var.l = i1f.n;
        xj7Var.b = 0;
        setHierarchy(xj7Var.a());
    }

    private final t1d getControllerBuilder() {
        t1d t1dVar = vd7.a.get();
        b68 b68Var = this.w;
        t1dVar.h = b68Var != null && b68Var.b;
        bne bneVar = null;
        Long l = b68Var != null ? b68Var.d : null;
        Long l2 = b68Var != null ? b68Var.e : null;
        Long l3 = b68Var != null ? b68Var.f : null;
        t1dVar.b = (l3 == null || l == null || l2 == null) ? null : new q78(l.longValue(), l2.longValue(), l3.longValue());
        b68 b68Var2 = this.w;
        Uri uri = b68Var2 != null ? b68Var2.a : null;
        if (uri != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            sb8.M(getContext()).getDefaultDisplay().getMetrics(displayMetrics);
            w78 w78VarD = w78.d(uri);
            int i = displayMetrics.widthPixels;
            int i2 = displayMetrics.heightPixels;
            if (i2 > 0 && i > 0) {
                bneVar = new bne(i, i2, Math.max(Math.max(i, i2), 2048.0f), 8);
            }
            w78VarD.d = bneVar;
            float f = this.y;
            if (f == 90.0f) {
                w78VarD.e = new iue((int) f, false);
            }
            t1dVar.c = w78VarD.a();
        } else {
            t1dVar.c = null;
        }
        t1dVar.i = true;
        t1dVar.j = getController();
        return t1dVar;
    }

    @Override // defpackage.z1k
    public final void f(Throwable th) {
        super.f(th);
        this.x = true;
        gm0.V(this.s, "Set photo attach failed", th);
        zvc zvcVar = this.v;
        if (zvcVar != null) {
            zvcVar.i(th);
        }
    }

    @Override // defpackage.z1k
    public final void g(l68 l68Var) {
        super.g(l68Var);
        this.x = false;
        zvc zvcVar = this.v;
        if (zvcVar != null) {
            zvcVar.e();
        }
    }

    public final boolean getFailure() {
        return this.x;
    }

    public final float getImageRotation() {
        return this.y;
    }

    public final boolean getResetScale() {
        zv8 zv8Var = A[0];
        return ((Boolean) this.z.b).booleanValue();
    }

    public final void k(b68 b68Var, boolean z) {
        boolean z2 = !b68Var.equals(this.w) || z;
        this.w = b68Var;
        this.x = false;
        if (z2) {
            t1d controllerBuilder = getControllerBuilder();
            Uri uri = b68Var.c;
            if (uri != null) {
                w78 w78VarD = w78.d(uri);
                if (this.y == 90.0f) {
                    w78VarD.e = new iue((int) getRotation(), false);
                }
                controllerBuilder.d = w78VarD.a();
            }
            setController(controllerBuilder.a());
        }
    }

    @Override // defpackage.z1k, defpackage.fu5, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.t.onTouchEvent(motionEvent);
        ScaleGestureDetector scaleGestureDetector = this.u;
        if (scaleGestureDetector != null) {
            scaleGestureDetector.onTouchEvent(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setImageRotation(float f) {
        this.y = f;
    }

    public final void setListener(zvc zvcVar) {
        this.v = zvcVar;
    }

    public final void setResetScale(boolean z) {
        this.z.B(this, A[0], Boolean.valueOf(z));
    }
}
