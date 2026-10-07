package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import one.me.mediapicker.crop.CropPhotoScreen;

/* JADX INFO: loaded from: classes4.dex */
public class z1k extends yj7 {
    public static final /* synthetic */ int r = 0;
    public final RectF h;
    public final RectF i;
    public boolean j;
    public final GestureDetector k;
    public x1k l;
    public y1k m;
    public volatile v1k n;
    public final Runnable o;
    public final ex4 p;
    public u1k q;

    public z1k(Context context, int i) {
        super(context, 0);
        d(context);
        this.h = new RectF();
        this.i = new RectF();
        this.n = null;
        this.o = new hx4((mx4) this, 2);
        this.p = new ex4(4, this);
        uf5 uf5Var = new uf5(new h6f(new l5b()));
        this.q = uf5Var;
        uf5Var.b = this;
        this.k = new GestureDetector(getContext(), new pi9(17, this));
    }

    public void f(Throwable th) {
        pj6.d(z1k.class, Integer.valueOf(hashCode()), "onFinalImageSet: view %x");
        x1k x1kVar = this.l;
        if (x1kVar != null) {
            String str = ((CropPhotoScreen) ((s63) x1kVar).b).a;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "Failed to crop photo", th);
                }
            }
        }
        requestLayout();
        postInvalidate();
    }

    public void g(l68 l68Var) {
        pj6.d(z1k.class, Integer.valueOf(hashCode()), "onFinalImageSet: view %x");
        if (!((uf5) this.q).c) {
            j();
            u1k u1kVar = this.q;
            boolean z = this.j;
            uf5 uf5Var = (uf5) u1kVar;
            uf5Var.c = z;
            if (!z) {
                uf5Var.d();
            }
        }
        requestLayout();
        postInvalidate();
    }

    public u1k getZoomableController() {
        return this.q;
    }

    public void h(Matrix matrix) {
        pj6.d(z1k.class, Integer.valueOf(hashCode()), "onTransformChanged: view %x");
        invalidate();
    }

    public final void i(au5 au5Var) {
        au5 controller = getController();
        if (controller instanceof u0) {
            u0 u0Var = (u0) controller;
            ex4 ex4Var = this.p;
            ex4Var.getClass();
            mr4 mr4Var = u0Var.f;
            if (mr4Var instanceof t0) {
                t0 t0Var = (t0) mr4Var;
                synchronized (t0Var) {
                    int iIndexOf = t0Var.a.indexOf(ex4Var);
                    if (iIndexOf != -1) {
                        t0Var.a.set(iIndexOf, null);
                    }
                }
            } else if (mr4Var == ex4Var) {
                u0Var.f = null;
            }
        }
        if (au5Var instanceof u0) {
            ((u0) au5Var).a(this.p);
        }
        super.setController(au5Var);
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        removeCallbacks(this.n);
        this.n = new v1k(this, 0, drawable);
        n7j.p(this, this.n);
    }

    public final void j() {
        t97 t97Var = ((wj7) getHierarchy()).f;
        Matrix matrix = t97.d;
        t97Var.n(matrix);
        Rect bounds = t97Var.getBounds();
        RectF rectF = this.h;
        rectF.set(bounds);
        matrix.mapRect(rectF);
        float width = getWidth();
        float height = getHeight();
        RectF rectF2 = this.i;
        rectF2.set(0.0f, 0.0f, width, height);
        ((uf5) this.q).j.set(rectF);
        ((uf5) this.q).i.set(rectF2);
        pj6.f(z1k.class, "updateZoomableControllerBounds: view %x, view bounds: %s, image bounds: %s", Integer.valueOf(hashCode()), rectF2, rectF);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        int iSave = 0;
        boolean z = this.j && !((uf5) this.q).m.isIdentity();
        if (z) {
            iSave = canvas.save();
            canvas.concat(((uf5) this.q).m);
        }
        super.onDraw(canvas);
        if (z) {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        pj6.d(z1k.class, Integer.valueOf(hashCode()), "onLayout: view %x");
        super.onLayout(z, i, i2, i3, i4);
        j();
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0127  */
    /* JADX WARN: Code duplicated, block: B:46:0x0131  */
    /* JADX WARN: Code duplicated, block: B:54:0x014b  */
    /* JADX WARN: Code duplicated, block: B:57:0x0150 A[LOOP:1: B:45:0x012f->B:57:0x0150, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:75:0x014e A[EDGE_INSN: B:75:0x014e->B:56:0x014e BREAK  A[LOOP:1: B:45:0x012f->B:57:0x0150], SYNTHETIC] */
    @Override // defpackage.fu5, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int pointerCount;
        int i;
        h6f h6fVar;
        this.k.onTouchEvent(motionEvent);
        uf5 uf5Var = (uf5) this.q;
        if (!uf5Var.c) {
            return super.onTouchEvent(motionEvent);
        }
        l5b l5bVar = (l5b) uf5Var.a.b;
        float[] fArr = (float[]) l5bVar.g;
        float[] fArr2 = (float[]) l5bVar.f;
        int[] iArr = (int[]) l5bVar.c;
        int actionMasked = motionEvent.getActionMasked();
        int i2 = 0;
        if (actionMasked == 0 || actionMasked == 1) {
            z = l5bVar.a;
            l5bVar.h();
            l5bVar.g();
            while (i2 < 2) {
                pointerCount = motionEvent.getPointerCount();
                int actionMasked2 = motionEvent.getActionMasked();
                i = ((actionMasked2 != 1 || actionMasked2 == 6) && i2 >= motionEvent.getActionIndex()) ? i2 + 1 : i2;
                if (i >= pointerCount) {
                    i = -1;
                }
                if (i == -1) {
                    break;
                }
                iArr[i2] = motionEvent.getPointerId(i);
                float[] fArr3 = (float[]) l5bVar.d;
                float x = motionEvent.getX(i);
                fArr3[i2] = x;
                fArr2[i2] = x;
                float[] fArr4 = (float[]) l5bVar.e;
                float y = motionEvent.getY(i);
                fArr4[i2] = y;
                fArr[i2] = y;
                l5bVar.b++;
                i2++;
            }
            if (z && l5bVar.b > 0 && !l5bVar.a) {
                l5bVar.a = true;
            }
        } else if (actionMasked == 2) {
            for (int i3 = 0; i3 < 2; i3++) {
                int iFindPointerIndex = motionEvent.findPointerIndex(iArr[i3]);
                if (iFindPointerIndex != -1) {
                    fArr2[i3] = motionEvent.getX(iFindPointerIndex);
                    fArr[i3] = motionEvent.getY(iFindPointerIndex);
                }
            }
            boolean z2 = l5bVar.a;
            if (!z2 && !z2) {
                l5bVar.a = true;
            }
            if (l5bVar.a && (h6fVar = (h6f) l5bVar.h) != null) {
                l5b l5bVar2 = (l5b) h6fVar.b;
                uf5 uf5Var2 = (uf5) h6fVar.c;
                if (uf5Var2 != null) {
                    Matrix matrix = uf5Var2.l;
                    Matrix matrix2 = uf5Var2.m;
                    if (!uf5Var2.e) {
                        uf5Var2.f = false;
                        matrix2.set(matrix);
                        int i4 = l5bVar2.b;
                        float[] fArr5 = (float[]) l5bVar2.g;
                        float[] fArr6 = (float[]) l5bVar2.f;
                        float[] fArr7 = (float[]) l5bVar2.e;
                        float[] fArr8 = (float[]) l5bVar2.d;
                        float fHypot = i4 < 2 ? 1.0f : ((float) Math.hypot(fArr6[1] - fArr6[0], fArr5[1] - fArr5[0])) / ((float) Math.hypot(fArr8[1] - fArr8[0], fArr7[1] - fArr7[0]));
                        matrix2.postScale(fHypot, fHypot, h6f.d(l5bVar2.b, (float[]) l5bVar2.d), h6f.d(l5bVar2.b, (float[]) l5bVar2.e));
                        uf5Var2.b(h6f.d(l5bVar2.b, (float[]) l5bVar2.d), h6f.d(l5bVar2.b, (float[]) l5bVar2.e));
                        matrix2.postTranslate(h6f.d(l5bVar2.b, fArr6) - h6f.d(l5bVar2.b, fArr8), h6f.d(l5bVar2.b, fArr5) - h6f.d(l5bVar2.b, fArr7));
                        uf5Var2.c();
                        if (uf5Var2.f) {
                            matrix.set(matrix2);
                        }
                        z1k z1kVar = uf5Var2.b;
                        if (z1kVar != null) {
                            z1kVar.h(matrix2);
                        }
                    }
                }
            }
        } else if (actionMasked == 3) {
            l5bVar.h();
            l5bVar.g();
        } else if (actionMasked == 5 || actionMasked == 6) {
            z = l5bVar.a;
            l5bVar.h();
            l5bVar.g();
            while (i2 < 2) {
                pointerCount = motionEvent.getPointerCount();
                int actionMasked3 = motionEvent.getActionMasked();
                if (actionMasked3 != 1) {
                }
                if (i >= pointerCount) {
                    i = -1;
                }
                if (i == -1) {
                    break;
                    break;
                }
                iArr[i2] = motionEvent.getPointerId(i);
                float[] fArr9 = (float[]) l5bVar.d;
                float x2 = motionEvent.getX(i);
                fArr9[i2] = x2;
                fArr2[i2] = x2;
                float[] fArr10 = (float[]) l5bVar.e;
                float y2 = motionEvent.getY(i);
                fArr10[i2] = y2;
                fArr[i2] = y2;
                l5bVar.b++;
                i2++;
            }
            if (z) {
                l5bVar.a = true;
            }
        }
        if (v3e.a(((uf5) this.q).m) <= 1.1f) {
            return true;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        return true;
    }

    @Override // defpackage.fu5
    public void setController(au5 au5Var) {
        i(null);
        uf5 uf5Var = (uf5) this.q;
        uf5Var.c = false;
        uf5Var.d();
        i(au5Var);
    }

    public void setDoubleTapToZoomEnabled(boolean z) {
        u1k u1kVar = this.q;
        if (u1kVar != null) {
            ((uf5) u1kVar).d = z;
        }
    }

    public void setListener(x1k x1kVar) {
        this.l = x1kVar;
    }

    public void setOnReleaseListener(y1k y1kVar) {
        this.m = y1kVar;
    }

    public void setZoomEnabled(boolean z) {
        this.j = z;
        u1k u1kVar = this.q;
        if (u1kVar != null) {
            uf5 uf5Var = (uf5) u1kVar;
            uf5Var.c = z;
            if (z) {
                return;
            }
            uf5Var.d();
        }
    }

    public void setZoomableController(u1k u1kVar) {
        u1kVar.getClass();
        ((uf5) this.q).b = null;
        this.q = u1kVar;
        ((uf5) u1kVar).b = this;
    }

    public z1k(Context context) {
        super(context);
        this.h = new RectF();
        this.i = new RectF();
        this.n = null;
        this.o = new w1k(this, 0);
        this.p = new ex4(4, this);
        uf5 uf5Var = new uf5(new h6f(new l5b()));
        this.q = uf5Var;
        uf5Var.b = this;
        this.k = new GestureDetector(getContext(), new pi9(17, this));
    }
}
