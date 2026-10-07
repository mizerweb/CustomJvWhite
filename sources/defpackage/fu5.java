package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public abstract class fu5 extends ImageView {
    public static boolean g;
    public final gx a;
    public float b;
    public eu5 c;
    public boolean d;
    public boolean e;
    public Object f;

    public fu5(Context context) {
        super(context);
        this.a = new gx();
        this.b = 0.0f;
        this.d = false;
        this.e = false;
        this.f = null;
        a(context);
    }

    public static void setGlobalLegacyVisibilityHandlingEnabled(boolean z) {
        g = z;
    }

    public final void a(Context context) {
        try {
            qe7.v();
            if (this.d) {
                return;
            }
            boolean z = true;
            this.d = true;
            this.c = new eu5(null);
            ColorStateList imageTintList = getImageTintList();
            if (imageTintList == null) {
                return;
            }
            setColorFilter(imageTintList.getDefaultColor());
            if (!g || context.getApplicationInfo().targetSdkVersion < 24) {
                z = false;
            }
            this.e = z;
        } finally {
            qe7.v();
        }
    }

    public final void b() {
        Drawable drawable;
        if (!this.e || (drawable = getDrawable()) == null) {
            return;
        }
        drawable.setVisible(getVisibility() == 0, false);
    }

    public void c() {
        this.c.g();
    }

    public float getAspectRatio() {
        return this.b;
    }

    public au5 getController() {
        return this.c.e;
    }

    public Object getExtraData() {
        return this.f;
    }

    public du5 getHierarchy() {
        du5 du5Var = this.c.d;
        du5Var.getClass();
        return du5Var;
    }

    public Drawable getTopLevelDrawable() {
        return this.c.d();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        b();
        this.c.f();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
        c();
    }

    @Override // android.view.View
    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        b();
        this.c.f();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        gx gxVar = this.a;
        gxVar.a = i;
        gxVar.b = i2;
        avk.b(gxVar, this.b, getLayoutParams(), getPaddingRight() + getPaddingLeft(), getPaddingBottom() + getPaddingTop());
        super.onMeasure(gxVar.a, gxVar.b);
    }

    @Override // android.view.View
    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        b();
        c();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        eu5 eu5Var = this.c;
        if (eu5Var.e()) {
            u0 u0Var = (u0) eu5Var.e;
            u0Var.getClass();
            if (pj6.a.h(2)) {
                pj6.f(u0.v, "controller %x %s: onTouchEvent %s", Integer.valueOf(System.identityHashCode(u0Var)), u0Var.j, motionEvent);
            }
            dk7 dk7Var = u0Var.e;
            if (dk7Var != null && (dk7Var.b() || u0Var.q())) {
                u0Var.e.d(motionEvent);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        b();
    }

    public void setAspectRatio(float f) {
        if (f == this.b) {
            return;
        }
        this.b = f;
        requestLayout();
    }

    public void setController(au5 au5Var) {
        this.c.i(au5Var);
        super.setImageDrawable(this.c.d());
    }

    public void setExtraData(Object obj) {
        this.f = obj;
    }

    public void setHierarchy(du5 du5Var) {
        this.c.j(du5Var);
        super.setImageDrawable(this.c.d());
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageBitmap(Bitmap bitmap) {
        a(getContext());
        this.c.i(null);
        super.setImageBitmap(bitmap);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageDrawable(Drawable drawable) {
        a(getContext());
        this.c.i(null);
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageResource(int i) {
        a(getContext());
        this.c.i(null);
        super.setImageResource(i);
    }

    @Override // android.widget.ImageView
    @Deprecated
    public void setImageURI(Uri uri) {
        a(getContext());
        this.c.i(null);
        super.setImageURI(uri);
    }

    public void setLegacyVisibilityHandlingEnabled(boolean z) {
        this.e = z;
    }

    @Override // android.view.View
    public final String toString() {
        dc9 dc9VarC = qdl.c(this);
        eu5 eu5Var = this.c;
        dc9VarC.v(eu5Var != null ? eu5Var.toString() : "<no holder set>", "holder");
        return dc9VarC.toString();
    }

    public fu5(Context context, int i) {
        super(context, null, 0);
        this.a = new gx();
        this.b = 0.0f;
        this.d = false;
        this.e = false;
        this.f = null;
        a(context);
    }
}
