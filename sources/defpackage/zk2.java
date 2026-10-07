package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import one.me.stories.edit.EditStoryScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class zk2 extends View implements r46 {
    public ValueAnimator A;
    public boolean B;
    public cf7 C;
    public wf7 D;
    public cf7 E;
    public cf7 F;
    public af7 G;
    public qf7 H;
    public a2i I;
    public af7 J;
    public boolean K;
    public final ny8 a;
    public ArrayList b;
    public ArrayList c;
    public ArrayList d;
    public boolean e;
    public final Rect f;
    public boolean g;
    public ArrayList h;
    public ArrayList i;
    public final l8b j;
    public List k;
    public i8b l;
    public yk2 m;
    public final float n;
    public final gy8 n1;
    public final float o;
    public final Paint o1;
    public final float p;
    public final agf p1;
    public final int q;
    public final float r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public RectF w;
    public float x;
    public float y;
    public float z;

    public zk2(Context context, ny8 ny8Var) {
        super(context);
        this.a = ny8Var;
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = true;
        this.f = new Rect();
        l8b l8bVar = ki9.a;
        this.j = new l8b();
        this.k = r66.a;
        this.n = yl5.d().getDisplayMetrics().density * 24.0f;
        this.o = yl5.d().getDisplayMetrics().density * 48.0f;
        this.p = yl5.d().getDisplayMetrics().density * 2.0f;
        this.q = ViewConfiguration.get(context).getScaledTouchSlop();
        this.r = yl5.d().getDisplayMetrics().density * 12.0f;
        this.K = true;
        this.n1 = new gy8(this);
        Paint paint = new Paint(1);
        a8g a8gVar = pq3.j;
        paint.setColor(a8gVar.e(context).m().l().k);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(yl5.d().getDisplayMetrics().density * 2.5f);
        this.o1 = paint;
        this.p1 = new agf(new bgf(yl5.d().getDisplayMetrics().density * 8.0f, yl5.d().getDisplayMetrics().density * 2.5f, 4.0f * yl5.d().getDisplayMetrics().density, 20.0f * yl5.d().getDisplayMetrics().density, yl5.d().getDisplayMetrics().density * 2.0f, yl5.d().getDisplayMetrics().density * 8.0f, yl5.d().getDisplayMetrics().density * 16.0f, yl5.d().getDisplayMetrics().density * 2.0f, a8gVar.e(context).m().l().d, lvb.I0(-16777216, 0.5f)));
    }

    private final f66 getEmojiWorker() {
        return (f66) this.a.getValue();
    }

    public final ArrayList a(boolean z) {
        ArrayList arrayList = new ArrayList(this.k.size());
        for (vk2 vk2Var : this.k) {
            if (z || !(vk2Var instanceof sk2)) {
                a2i a2iVar = (a2i) this.j.f(vk2Var.getId());
                if (a2iVar != null) {
                    arrayList.add(a2iVar);
                }
            }
        }
        return arrayList;
    }

    public final void b(Long l) {
        lu5 lu5Var;
        qf7 qf7Var = this.H;
        if (qf7Var == null || getWidth() == 0 || getHeight() == 0) {
            return;
        }
        Rect rect = new Rect(0, 0, getWidth(), getHeight());
        ArrayList arrayList = new ArrayList(this.d.size());
        for (z1i z1iVar : this.d) {
            long j = z1iVar.j.a;
            if (l == null || j != l.longValue()) {
                va2 va2Var = z1iVar.a;
                if (va2Var.c == va2Var.a && va2Var.d == va2Var.b && va2Var.f == 1.0f && va2Var.e == 0.0f && cqk.d(z1iVar.j.c, rect)) {
                    lu5Var = z1iVar.j;
                } else {
                    long j2 = z1iVar.j.a;
                    float f = va2Var.f;
                    Matrix matrix = z1iVar.o;
                    float f2 = va2Var.c;
                    float f3 = va2Var.d;
                    float f4 = va2Var.e;
                    float f5 = va2Var.a;
                    float f6 = va2Var.b;
                    matrix.reset();
                    matrix.postTranslate(-f5, -f6);
                    matrix.postScale(f, f);
                    matrix.postRotate(f4);
                    matrix.postTranslate(f2, f3);
                    jy8 jy8Var = z1iVar.j.b;
                    int i = jy8Var.a;
                    int i2 = jy8Var.b;
                    int color = z1iVar.l.c.getColor();
                    float strokeWidth = z1iVar.l.c.getStrokeWidth() * f;
                    ArrayList<mu5> arrayList2 = z1iVar.l.a;
                    ArrayList arrayList3 = new ArrayList(yw3.W0(arrayList2, 10));
                    for (mu5 mu5Var : arrayList2) {
                        float[] fArr = mu5Var.b;
                        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
                        matrix.mapPoints(fArrCopyOf);
                        arrayList3.add(new mu5(mu5Var.a, fArrCopyOf));
                    }
                    lu5Var = new lu5(j2, new jy8(i, i2, color, strokeWidth, arrayList3), rect);
                }
                arrayList.add(lu5Var);
            }
        }
        qf7Var.invoke(arrayList, rect);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void c() {
        i8b i8bVar = this.l;
        if (i8bVar == null) {
            return;
        }
        this.l = null;
        cf7 cf7Var = this.F;
        if (cf7Var != null) {
            int i = i8bVar.b;
            long[] jArr = new long[i];
            for (int i2 = 0; i2 < i; i2++) {
                jArr[i2] = i8bVar.b(i2);
            }
            cf7Var.invoke(jArr);
        }
    }

    public final void d(boolean z) {
        Object value;
        Object objA;
        AnimatedVectorDrawable animatedVectorDrawable;
        yk2 yk2Var = this.m;
        if (yk2Var != null) {
            EditStoryScreen editStoryScreen = (EditStoryScreen) ((uvc) yk2Var).b;
            zv8[] zv8VarArr = EditStoryScreen.A1;
            mjg mjgVar = editStoryScreen.C1().s.i;
            do {
                value = mjgVar.getValue();
                objA = (myg) value;
                if (objA instanceof kyg) {
                    objA = kyg.a((kyg) objA, false, false, z, 3);
                }
            } while (!mjgVar.h(value, objA));
            if (editStoryScreen.getView() != null) {
                if (z) {
                    Drawable drawable = editStoryScreen.v1().p.getDrawable();
                    animatedVectorDrawable = drawable instanceof AnimatedVectorDrawable ? (AnimatedVectorDrawable) drawable : null;
                    if (animatedVectorDrawable == null) {
                        return;
                    }
                    animatedVectorDrawable.stop();
                    animatedVectorDrawable.start();
                    return;
                }
                fy8 fy8VarV1 = editStoryScreen.v1();
                ImageView imageView = fy8VarV1.p;
                Drawable drawable2 = imageView.getDrawable();
                AnimatedVectorDrawable animatedVectorDrawable2 = drawable2 instanceof AnimatedVectorDrawable ? (AnimatedVectorDrawable) drawable2 : null;
                if (animatedVectorDrawable2 != null) {
                    animatedVectorDrawable2.stop();
                }
                Drawable drawable3 = fy8VarV1.getContext().getDrawable(R.drawable.avd_delete_hover_out);
                animatedVectorDrawable = drawable3 instanceof AnimatedVectorDrawable ? (AnimatedVectorDrawable) drawable3 : null;
                if (animatedVectorDrawable == null) {
                    return;
                }
                imageView.setImageDrawable(animatedVectorDrawable);
                animatedVectorDrawable.start();
            }
        }
    }

    public final void e(boolean z, boolean z2) {
        Object value;
        Object objA;
        this.s = z;
        this.t = z2;
        boolean z3 = z || z2;
        if (z3) {
            this.u = z;
            this.v = z2;
        }
        if (this.B != z3) {
            this.B = z3;
            ValueAnimator valueAnimatorOfFloat = this.A;
            if (valueAnimatorOfFloat == null) {
                valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.setDuration(300L);
                valueAnimatorOfFloat.addUpdateListener(new ak(7, this));
                this.A = valueAnimatorOfFloat;
            }
            valueAnimatorOfFloat.cancel();
            this.y = this.x;
            this.z = z3 ? 1.0f : 0.0f;
            valueAnimatorOfFloat.start();
        }
        yk2 yk2Var = this.m;
        if (yk2Var != null) {
            uvc uvcVar = (uvc) yk2Var;
            EditStoryScreen editStoryScreen = (EditStoryScreen) uvcVar.b;
            zv8[] zv8VarArr = EditStoryScreen.A1;
            mjg mjgVar = editStoryScreen.C1().s.i;
            do {
                value = mjgVar.getValue();
                objA = (myg) value;
                if (objA instanceof kyg) {
                    objA = kyg.a((kyg) objA, z, z2, false, 4);
                }
            } while (!mjgVar.h(value, objA));
            if (z || z2) {
                p0m.a((zk2) uvcVar.c, kt7.CLOCK_TICK);
            }
        }
    }

    public final void f(long j) {
        wf7 wf7Var;
        a2i a2iVar = (a2i) this.j.f(j);
        if (a2iVar instanceof z1i) {
            b(null);
        } else {
            if (a2iVar == null || (wf7Var = this.D) == null) {
                return;
            }
            wf7Var.g(Long.valueOf(j), Float.valueOf(a2iVar.g()), Float.valueOf(a2iVar.h()), Float.valueOf(a2iVar.e()), Float.valueOf(a2iVar.d()));
        }
    }

    @Override // defpackage.r46
    public final void g() {
        invalidate();
    }

    public RectF getDeleteZoneRect() {
        return this.w;
    }

    public List<a2i> getGestureLayers() {
        ArrayList arrayList = this.h;
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayListA = a(this.g && this.e);
        this.h = arrayListA;
        return arrayListA;
    }

    public float getHandleTouchTargetPx() {
        return this.o;
    }

    public final yk2 getListener() {
        return this.m;
    }

    public a2i getMediaGestureLayer() {
        a2i a2iVar = this.I;
        if (a2iVar == null || !this.K) {
            return null;
        }
        return a2iVar;
    }

    public final a2i getMediaLayer() {
        return this.I;
    }

    public final qf7 getOnDrawingLayersChanged() {
        return this.H;
    }

    public final af7 getOnEmptyAreaDoubleTapped() {
        return this.G;
    }

    public final cf7 getOnLayerEditRequested() {
        return this.E;
    }

    public final cf7 getOnLayerReordered() {
        return this.F;
    }

    public final cf7 getOnLayerSelected() {
        return this.C;
    }

    public final wf7 getOnLayerTransformChanged() {
        return this.D;
    }

    public final af7 getOnMediaTransformChanged() {
        return this.J;
    }

    public float getSnapDeltaPx() {
        return this.p;
    }

    public int getTouchSlop() {
        return this.q;
    }

    public int getViewHeight() {
        return getHeight();
    }

    public int getViewWidth() {
        return getWidth();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        gy8 gy8Var = this.n1;
        gy8Var.p = null;
        gy8Var.r = false;
        if (gy8Var.I != 1) {
            gy8Var.h(1);
            gy8Var.e = -1;
            gy8Var.f = -1;
        }
        gy8Var.q = null;
        c();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z;
        Canvas canvas2;
        a2i a2iVar;
        gy8 gy8Var = this.n1;
        Long l = gy8Var.c;
        Long l2 = gy8Var.d;
        ArrayList arrayListA = this.i;
        if (arrayListA == null) {
            arrayListA = a(this.e);
            this.i = arrayListA;
        }
        Iterator it = arrayListA.iterator();
        while (true) {
            z = false;
            if (!it.hasNext()) {
                break;
            }
            a2i a2iVar2 = (a2i) it.next();
            long jA = a2iVar2.a();
            if (l2 == null || jA != l2.longValue()) {
                long jA2 = a2iVar2.a();
                if (l == null || jA2 != l.longValue()) {
                    a2iVar2.b = false;
                    a2iVar2.draw(canvas);
                }
            }
        }
        if (this.x == 0.0f) {
            canvas2 = canvas;
        } else {
            Paint paint = this.o1;
            int alpha = paint.getAlpha();
            paint.setAlpha((int) (this.x * 255.0f));
            float width = getWidth() / 2.0f;
            float height = getHeight() / 2.0f;
            if (!this.B && this.x > 0.0f) {
                z = true;
            }
            if (this.s || (z && this.u)) {
                canvas2 = canvas;
                canvas2.drawLine(width, 0.0f, width, getHeight(), paint);
            } else {
                canvas2 = canvas;
            }
            if (this.t || (z && this.v)) {
                canvas2.drawLine(0.0f, height, getWidth(), height, paint);
            }
            paint.setAlpha(alpha);
        }
        if (l != null) {
            long jLongValue = l.longValue();
            if ((l2 != null && jLongValue == l2.longValue()) || (a2iVar = (a2i) this.j.f(l.longValue())) == null) {
                return;
            }
            if (!(a2iVar instanceof z1i) || this.e) {
                a2iVar.b = true;
                a2iVar.draw(canvas2);
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        setLayers(this.k);
    }

    /* JADX WARN: Code duplicated, block: B:142:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:36:0x0072 A[PHI: r3
  0x0072: PHI (r3v22 a2i) = (r3v21 a2i), (r3v24 a2i) binds: [B:34:0x006e, B:25:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x007e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0082  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:42:0x00fd  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int iFindPointerIndex;
        int iFindPointerIndex2;
        a2i a2iVarG;
        int actionIndex;
        int iFindPointerIndex3;
        gy8 gy8Var = this.n1;
        zk2 zk2Var = gy8Var.a;
        ny8 ny8Var = gy8Var.G;
        ny8 ny8Var2 = gy8Var.H;
        float[] fArr = gy8Var.A;
        int actionMasked = motionEvent.getActionMasked();
        Long l = null;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            gy8Var.e = motionEvent.getPointerId(0);
            gy8Var.r = false;
            a2i a2iVarG2 = gy8Var.g(gy8Var.c);
            if (a2iVarG2 != null) {
                long jA = a2iVarG2.a();
                Long l2 = gy8Var.d;
                if (l2 != null && jA == l2.longValue()) {
                    a2iVarG2 = null;
                }
            } else {
                a2iVarG2 = null;
            }
            if (a2iVarG2 == null || gy8Var.e(a2iVarG2, x, y) == 1) {
                a2i a2iVarC = gy8Var.c(x, y);
                if (a2iVarC != null) {
                    gy8Var.a(a2iVarC, x, y);
                } else if (a2iVarG2 == null || !a2iVarG2.j(x, y)) {
                    if (gy8Var.c != null) {
                        gy8Var.c = null;
                        gy8Var.h(1);
                        cf7 cf7Var = zk2Var.C;
                        if (cf7Var != null) {
                            cf7Var.invoke(null);
                        }
                        zk2Var.invalidate();
                    }
                    gy8Var.n = null;
                    long asLong = gy8Var.b.getAsLong();
                    if (asLong - gy8Var.o < 300) {
                        af7 af7Var = zk2Var.G;
                        if (af7Var != null) {
                            af7Var.invoke();
                        }
                        gy8Var.o = 0L;
                    } else {
                        gy8Var.o = asLong;
                    }
                    a2i mediaGestureLayer = zk2Var.getMediaGestureLayer();
                    if (mediaGestureLayer != null) {
                        gy8Var.q = mediaGestureLayer;
                        gy8Var.g = x;
                        gy8Var.h = y;
                    }
                } else {
                    gy8Var.a(a2iVarG2, x, y);
                }
            } else {
                gy8Var.h(3);
                gy8Var.g = x;
                gy8Var.h = y;
                gy8Var.i = a2iVarG2.e();
                gy8Var.j = a2iVarG2.d();
                gy8Var.i(a2iVarG2);
                gy8Var.k = tqk.a(x, y, gy8Var.y, gy8Var.z);
                gy8Var.l = (float) Math.atan2(y - gy8Var.z, x - gy8Var.y);
            }
        } else if (actionMasked == 1) {
            gy8Var.d(false);
        } else if (actionMasked == 2) {
            int iFindPointerIndex4 = motionEvent.findPointerIndex(gy8Var.e);
            if (iFindPointerIndex4 >= 0) {
                float x2 = motionEvent.getX(iFindPointerIndex4);
                float y2 = motionEvent.getY(iFindPointerIndex4);
                int iD = qt4.D(gy8Var.I);
                if (iD != 0) {
                    if (iD != 1) {
                        if (iD == 2) {
                            a2i a2iVarG3 = gy8Var.g(gy8Var.c);
                            if (a2iVarG3 != null) {
                                gy8Var.i(a2iVarG3);
                                float fA = tqk.a(x2, y2, gy8Var.y, gy8Var.z);
                                float fAtan2 = (float) Math.atan2(y2 - gy8Var.z, x2 - gy8Var.y);
                                float f = gy8Var.k;
                                if (f > 0.0f) {
                                    a2iVarG3.o(gy8Var.i * (fA / f));
                                }
                                a2iVarG3.n(gy8Var.j + ((float) Math.toDegrees(fAtan2 - gy8Var.l)));
                                zk2Var.invalidate();
                            }
                        } else {
                            if (iD != 3) {
                                ore.o();
                                return false;
                            }
                            float[] fArr2 = gy8Var.B;
                            a2i a2iVarG4 = gy8Var.q;
                            if ((a2iVarG4 != null || (a2iVarG4 = gy8Var.g(gy8Var.c)) != null) && (iFindPointerIndex = motionEvent.findPointerIndex(gy8Var.f)) >= 0 && (iFindPointerIndex2 = motionEvent.findPointerIndex(gy8Var.e)) >= 0) {
                                float x3 = motionEvent.getX(iFindPointerIndex2);
                                float y3 = motionEvent.getY(iFindPointerIndex2);
                                float x4 = motionEvent.getX(iFindPointerIndex);
                                float y4 = motionEvent.getY(iFindPointerIndex);
                                float fA2 = tqk.a(x3, y3, x4, y4);
                                float fAtan3 = (float) Math.atan2(y3 - y4, x3 - x4);
                                float f2 = gy8Var.k;
                                if (f2 > 0.0f) {
                                    a2iVarG4.o(gy8Var.i * (fA2 / f2));
                                }
                                a2iVarG4.n(gy8Var.j + ((float) Math.toDegrees(fAtan3 - gy8Var.l)));
                                float fE = a2iVarG4.e();
                                Matrix matrix = (Matrix) ny8Var.getValue();
                                float f3 = gy8Var.E;
                                float f4 = gy8Var.F;
                                float fD = a2iVarG4.d();
                                float fB = a2iVarG4.b();
                                float fC = a2iVarG4.c();
                                matrix.reset();
                                matrix.postTranslate(-fB, -fC);
                                matrix.postScale(fE, fE);
                                matrix.postRotate(fD);
                                matrix.postTranslate(f3, f4);
                                fArr2[0] = fArr[0];
                                fArr2[1] = fArr[1];
                                ((Matrix) ny8Var.getValue()).mapPoints(fArr2);
                                a2iVarG4.p((gy8Var.C - fArr2[0]) + gy8Var.E);
                                a2iVarG4.q((gy8Var.D - fArr2[1]) + gy8Var.F);
                                if (!gy8Var.f()) {
                                    zk2Var.invalidate();
                                }
                            }
                        }
                    } else if (gy8Var.f()) {
                        a2i a2iVar = gy8Var.q;
                        if (a2iVar != null) {
                            a2iVar.p((x2 - gy8Var.g) + a2iVar.g());
                            a2iVar.q((y2 - gy8Var.h) + a2iVar.h());
                            gy8Var.g = x2;
                            gy8Var.h = y2;
                        }
                    } else {
                        a2i a2iVarG5 = gy8Var.g(gy8Var.c);
                        if (a2iVarG5 != null) {
                            float f5 = x2 - gy8Var.g;
                            float f6 = y2 - gy8Var.h;
                            a2iVarG5.p(a2iVarG5.g() + f5);
                            a2iVarG5.q(a2iVarG5.h() + f6);
                            float viewWidth = zk2Var.getViewWidth() / 2.0f;
                            float viewHeight = zk2Var.getViewHeight() / 2.0f;
                            gy8Var.i(a2iVarG5);
                            boolean z = Math.abs(gy8Var.y - viewWidth) < zk2Var.getSnapDeltaPx();
                            boolean z2 = Math.abs(gy8Var.z - viewHeight) < zk2Var.getSnapDeltaPx();
                            if (z) {
                                a2iVarG5.p((viewWidth - gy8Var.y) + a2iVarG5.g());
                            }
                            if (z2) {
                                a2iVarG5.q((viewHeight - gy8Var.z) + a2iVarG5.h());
                            }
                            if (z != gy8Var.s || z2 != gy8Var.t) {
                                gy8Var.s = z;
                                gy8Var.t = z2;
                                zk2Var.e(z, z2);
                            }
                            RectF deleteZoneRect = zk2Var.getDeleteZoneRect();
                            boolean z3 = deleteZoneRect != null && deleteZoneRect.contains(x2, y2);
                            if (z3 != gy8Var.u) {
                                gy8Var.u = z3;
                                zk2Var.d(z3);
                            }
                            gy8Var.g = x2;
                            gy8Var.h = y2;
                            zk2Var.invalidate();
                        }
                    }
                } else if (gy8Var.f()) {
                    a2i a2iVar2 = gy8Var.q;
                    if (a2iVar2 != null) {
                        float f7 = x2 - gy8Var.g;
                        float f8 = y2 - gy8Var.h;
                        float touchSlop = zk2Var.getTouchSlop();
                        if (Math.abs(f7) >= touchSlop || Math.abs(f8) >= touchSlop) {
                            gy8Var.h(2);
                            a2iVar2.p(a2iVar2.g() + f7);
                            a2iVar2.q(a2iVar2.h() + f8);
                            gy8Var.g = x2;
                            gy8Var.h = y2;
                        }
                    }
                } else {
                    a2i a2iVarG6 = gy8Var.g(gy8Var.p);
                    if (a2iVarG6 != null) {
                        float f9 = x2 - gy8Var.g;
                        float f10 = y2 - gy8Var.h;
                        float touchSlop2 = zk2Var.getTouchSlop();
                        if (Math.abs(f9) >= touchSlop2 || Math.abs(f10) >= touchSlop2) {
                            gy8Var.r = false;
                            gy8Var.h(2);
                            a2iVarG6.p(a2iVarG6.g() + f9);
                            a2iVarG6.q(a2iVarG6.h() + f10);
                            gy8Var.g = x2;
                            gy8Var.h = y2;
                            zk2Var.invalidate();
                        }
                    }
                }
            }
        } else if (actionMasked == 3) {
            gy8Var.d(true);
        } else if (actionMasked == 5) {
            boolean zF = gy8Var.f();
            int i = gy8Var.I;
            if (!zF) {
                int iD2 = qt4.D(i);
                if (iD2 == 0) {
                    l = gy8Var.p;
                } else if (iD2 == 1) {
                    l = gy8Var.c;
                }
                a2iVarG = gy8Var.g(l);
                if (a2iVarG != null) {
                    actionIndex = motionEvent.getActionIndex();
                    iFindPointerIndex3 = motionEvent.findPointerIndex(gy8Var.e);
                    if (iFindPointerIndex3 < 0) {
                        gy8Var.f = -1;
                    } else {
                        gy8Var.f = motionEvent.getPointerId(actionIndex);
                        float x5 = motionEvent.getX(iFindPointerIndex3);
                        float y5 = motionEvent.getY(iFindPointerIndex3);
                        float x6 = motionEvent.getX(actionIndex);
                        float y6 = motionEvent.getY(actionIndex);
                        gy8Var.r = false;
                        gy8Var.h(4);
                        gy8Var.i = a2iVarG.e();
                        gy8Var.j = a2iVarG.d();
                        gy8Var.E = a2iVarG.g();
                        gy8Var.F = a2iVarG.h();
                        gy8Var.k = tqk.a(x5, y5, x6, y6);
                        gy8Var.l = (float) Math.atan2(y5 - y6, x5 - x6);
                        gy8Var.C = (x5 + x6) / 2.0f;
                        gy8Var.D = (y5 + y6) / 2.0f;
                        if (a2iVarG.f().invert((Matrix) ny8Var2.getValue())) {
                            fArr[0] = gy8Var.C;
                            fArr[1] = gy8Var.D;
                            ((Matrix) ny8Var2.getValue()).mapPoints(fArr);
                        } else {
                            fArr[0] = a2iVarG.b();
                            fArr[1] = a2iVarG.c();
                        }
                    }
                }
            } else if ((i == 1 || i == 2) && (a2iVarG = gy8Var.q) != null) {
                actionIndex = motionEvent.getActionIndex();
                iFindPointerIndex3 = motionEvent.findPointerIndex(gy8Var.e);
                if (iFindPointerIndex3 < 0) {
                    gy8Var.f = -1;
                } else {
                    gy8Var.f = motionEvent.getPointerId(actionIndex);
                    float x7 = motionEvent.getX(iFindPointerIndex3);
                    float y7 = motionEvent.getY(iFindPointerIndex3);
                    float x8 = motionEvent.getX(actionIndex);
                    float y8 = motionEvent.getY(actionIndex);
                    gy8Var.r = false;
                    gy8Var.h(4);
                    gy8Var.i = a2iVarG.e();
                    gy8Var.j = a2iVarG.d();
                    gy8Var.E = a2iVarG.g();
                    gy8Var.F = a2iVarG.h();
                    gy8Var.k = tqk.a(x7, y7, x8, y8);
                    gy8Var.l = (float) Math.atan2(y7 - y8, x7 - x8);
                    gy8Var.C = (x7 + x8) / 2.0f;
                    gy8Var.D = (y7 + y8) / 2.0f;
                    if (a2iVarG.f().invert((Matrix) ny8Var2.getValue())) {
                        fArr[0] = gy8Var.C;
                        fArr[1] = gy8Var.D;
                        ((Matrix) ny8Var2.getValue()).mapPoints(fArr);
                    } else {
                        fArr[0] = a2iVarG.b();
                        fArr[1] = a2iVarG.c();
                    }
                }
            }
        } else if (actionMasked == 6) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            int i2 = gy8Var.f;
            if (pointerId == i2) {
                gy8Var.f = -1;
                gy8Var.b(motionEvent);
            } else if (pointerId == gy8Var.e) {
                gy8Var.e = i2;
                gy8Var.f = -1;
                gy8Var.b(motionEvent);
            }
        }
        int actionMasked2 = motionEvent.getActionMasked();
        if (actionMasked2 != 1 && actionMasked2 != 3) {
            return true;
        }
        c();
        return true;
    }

    public final void setDeleteZoneRect(RectF rectF) {
        this.w = rectF;
    }

    public final void setDrawingInteractive(boolean z) {
        if (this.g == z) {
            return;
        }
        this.g = z;
        this.h = null;
        invalidate();
    }

    public final void setDrawingLayersVisible(boolean z) {
        if (this.e == z) {
            return;
        }
        this.e = z;
        this.i = null;
        this.h = null;
        invalidate();
    }

    public final void setEditingId(Long l) {
        gy8 gy8Var = this.n1;
        gy8Var.d = l;
        gy8Var.a.invalidate();
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
    public final void setLayers(List<? extends vk2> list) {
        this.k = list;
        i8b i8bVar = this.l;
        if (i8bVar != null) {
            int size = list.size();
            long[] jArrCopyOf = size == 0 ? ui9.b : new long[size];
            Iterator<? extends vk2> it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                long id = it.next().getId();
                int i2 = i + 1;
                if (jArrCopyOf.length < i2) {
                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, Math.max(i2, (jArrCopyOf.length * 3) / 2));
                }
                jArrCopyOf[i] = id;
                i = i2;
            }
            int i3 = i8bVar.b;
            long[] jArr = i8bVar.a;
            for (int i4 = i3 - 1; -1 < i4; i4--) {
                long j = jArr[i4];
                int i5 = 0;
                while (true) {
                    if (i5 >= i) {
                        i8bVar.c(i4);
                        break;
                    } else if (jArrCopyOf[i5] == j) {
                        break;
                    } else {
                        i5++;
                    }
                }
            }
            for (vk2 vk2Var : list) {
                long id2 = vk2Var.getId();
                long[] jArr2 = i8bVar.a;
                int i6 = i8bVar.b;
                int i7 = 0;
                while (true) {
                    if (i7 >= i6) {
                        i8bVar.a(vk2Var.getId());
                        break;
                    } else if (jArr2[i7] == id2) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            if (i8bVar.b == 0) {
                this.l = null;
            }
        }
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        ArrayList<sk2> arrayList3 = new ArrayList(list.size());
        for (vk2 vk2Var2 : list) {
            if (vk2Var2 instanceof uk2) {
                arrayList.add(vk2Var2);
            } else if (vk2Var2 instanceof tk2) {
                arrayList2.add(vk2Var2);
            } else {
                if (!(vk2Var2 instanceof sk2)) {
                    ore.o();
                    return;
                }
                arrayList3.add(vk2Var2);
            }
        }
        if (!arrayList3.isEmpty() && getWidth() != 0 && getHeight() != 0) {
            int width = getWidth();
            int height = getHeight();
            Rect rect = this.f;
            rect.set(0, 0, width, height);
            l8b l8bVar = new l8b(this.d.size());
            for (z1i z1iVar : this.d) {
                l8bVar.l(z1iVar.j.a, z1iVar);
            }
            ArrayList arrayList4 = new ArrayList(arrayList3.size());
            for (sk2 sk2Var : arrayList3) {
                z1i z1iVar2 = (z1i) l8bVar.f(sk2Var.a.a);
                lu5 lu5Var = sk2Var.a;
                if (z1iVar2 != null) {
                    if (lu5Var != z1iVar2.j || !rect.equals(z1iVar2.m)) {
                        boolean z = (cqk.d(lu5Var.b, z1iVar2.j.b) && cqk.d(lu5Var.c, z1iVar2.j.c) && rect.equals(z1iVar2.m)) ? false : true;
                        z1iVar2.j = lu5Var;
                        if (z) {
                            z1iVar2.l = xr8.g(lu5Var, rect);
                            z1iVar2.m = new Rect(rect);
                            z1iVar2.s();
                        }
                    }
                    arrayList4.add(z1iVar2);
                } else {
                    arrayList4.add(new z1i(lu5Var, this.f, this.p1, this.n, this.r));
                }
            }
            this.d = arrayList4;
        } else if (!this.d.isEmpty()) {
            this.d = new ArrayList();
        }
        l8b l8bVar2 = new l8b(this.b.size());
        for (lmh lmhVar : this.b) {
            l8bVar2.l(lmhVar.g.a, lmhVar);
        }
        ArrayList arrayList5 = new ArrayList(arrayList.size());
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            umh umhVar = ((uk2) it2.next()).a;
            lmh lmhVar2 = (lmh) l8bVar2.f(umhVar.a);
            if (lmhVar2 != null) {
                umh umhVar2 = lmhVar2.g;
                boolean z2 = cqk.d(umhVar2.e, umhVar.e) && umhVar2.c == umhVar.c && umhVar2.d == umhVar.d && umhVar2.b == umhVar.b && umhVar2.f == umhVar.f && umhVar2.g == umhVar.g;
                lmhVar2.g = umhVar;
                if (!z2) {
                    lmhVar2.s();
                    CharSequence charSequenceF = lmhVar2.k.f((int) lmhVar2.o, lmhVar2.g.e);
                    if (charSequenceF == null) {
                        charSequenceF = lmhVar2.g.e;
                    }
                    lmhVar2.w = charSequenceF;
                    lmhVar2.t = lmhVar2.t();
                    lmhVar2.u = -1.0f;
                    lmhVar2.v = true;
                }
                arrayList5.add(lmhVar2);
            } else {
                arrayList5.add(new lmh(umhVar, getContext(), this.p1, this.n, getEmojiWorker()));
            }
        }
        this.b = arrayList5;
        l8b l8bVar3 = new l8b(this.c.size());
        for (f29 f29Var : this.c) {
            l8bVar3.l(f29Var.g.a, f29Var);
        }
        ArrayList arrayList6 = new ArrayList(arrayList2.size());
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            g59 g59Var = ((tk2) it3.next()).a;
            f29 f29Var2 = (f29) l8bVar3.f(g59Var.a);
            if (f29Var2 != null) {
                g59 g59Var2 = f29Var2.g;
                boolean z3 = g59Var2.b.equals(g59Var.b) && cqk.d(g59Var2.c, g59Var.c) && g59Var2.d == g59Var.d;
                f29Var2.g = g59Var;
                if (!z3) {
                    f29Var2.s();
                }
                arrayList6.add(f29Var2);
            } else {
                arrayList6.add(new f29(g59Var, getContext(), this.p1, this.n));
            }
        }
        this.c = arrayList6;
        l8b l8bVar4 = this.j;
        l8bVar4.a();
        for (lmh lmhVar3 : this.b) {
            l8bVar4.l(lmhVar3.g.a, lmhVar3);
        }
        for (f29 f29Var3 : this.c) {
            l8bVar4.l(f29Var3.g.a, f29Var3);
        }
        for (z1i z1iVar3 : this.d) {
            l8bVar4.l(z1iVar3.j.a, z1iVar3);
        }
        this.h = null;
        this.i = null;
        invalidate();
    }

    public final void setListener(yk2 yk2Var) {
        this.m = yk2Var;
    }

    public final void setMediaLayer(a2i a2iVar) {
        this.I = a2iVar;
    }

    public final void setMediaTransformEnabled(boolean z) {
        this.K = z;
    }

    public final void setOnDrawingLayersChanged(qf7 qf7Var) {
        this.H = qf7Var;
    }

    public final void setOnEmptyAreaDoubleTapped(af7 af7Var) {
        this.G = af7Var;
    }

    public final void setOnLayerEditRequested(cf7 cf7Var) {
        this.E = cf7Var;
    }

    public final void setOnLayerReordered(cf7 cf7Var) {
        this.F = cf7Var;
    }

    public final void setOnLayerSelected(cf7 cf7Var) {
        this.C = cf7Var;
    }

    public final void setOnLayerTransformChanged(wf7 wf7Var) {
        this.D = wf7Var;
    }

    public final void setOnMediaTransformChanged(af7 af7Var) {
        this.J = af7Var;
    }

    public final void setSelectedId(Long l) {
        gy8 gy8Var = this.n1;
        if (cqk.d(gy8Var.c, l)) {
            return;
        }
        gy8Var.c = l;
        gy8Var.a.invalidate();
    }
}
