package defpackage;

import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.os.Build;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class v42 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g52 b;

    public /* synthetic */ v42(g52 g52Var, int i) {
        this.a = i;
        this.b = g52Var;
    }

    /* JADX WARN: Code duplicated, block: B:86:0x0196  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        char c;
        char c2;
        boolean z;
        ViewParent parent;
        boolean zOnTouchEvent;
        ViewParent parent2;
        ValueAnimator valueAnimatorOfPropertyValuesHolder;
        int i = this.a;
        a8g a8gVar = pq3.j;
        sbi sbiVar = sbi.a;
        g52 g52Var = this.b;
        switch (i) {
            case 0:
                ((Boolean) obj).getClass();
                g52.E(g52Var);
                return sbiVar;
            case 1:
                MotionEvent motionEvent = (MotionEvent) obj;
                i72 i72Var = g52Var.w1;
                if (i72Var != null) {
                    View view = i72Var.a;
                    float[] fArr = i72Var.q;
                    float[] fArr2 = i72Var.r;
                    ScaleGestureDetector scaleGestureDetector = i72Var.j;
                    Matrix matrix = i72Var.h;
                    Matrix matrix2 = i72Var.t;
                    if (!i72Var.v) {
                        i72Var.g();
                    }
                    if (i72Var.x) {
                        zOnTouchEvent = scaleGestureDetector.onTouchEvent(motionEvent);
                    } else {
                        if ((motionEvent.getPointerCount() >= 2 || i72Var.C > 100) && (parent = view.getParent()) != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                        scaleGestureDetector.onTouchEvent(motionEvent);
                        if (i72Var.x) {
                            zOnTouchEvent = true;
                        } else {
                            if (i72Var.n.onTouchEvent(motionEvent) && ((i72Var.k || i72Var.l) && (parent2 = view.getParent()) != null)) {
                                parent2.requestDisallowInterceptTouchEvent(false);
                            }
                            zOnTouchEvent = false;
                        }
                    }
                    if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 3) && !scaleGestureDetector.isInProgress()) {
                        boolean z2 = i72Var.x;
                        ViewParent parent3 = view.getParent();
                        if (parent3 != null) {
                            parent3.requestDisallowInterceptTouchEvent(false);
                        }
                        i72Var.x = false;
                        boolean z3 = i72Var.m;
                        i72Var.m = false;
                        if (z2 && i72Var.A) {
                            view.performHapticFeedback(Build.VERSION.SDK_INT >= 30 ? 16 : 1);
                        }
                        matrix2.mapPoints(fArr2, fArr);
                        matrix.mapPoints(i72Var.s, fArr);
                        ylc ylcVarC = i72Var.c(fArr2);
                        float fFloatValue = ((Number) ylcVarC.a).floatValue();
                        float fFloatValue2 = ((Number) ylcVarC.b).floatValue();
                        float f = fArr2[0];
                        float f2 = fFloatValue + f;
                        float f3 = fArr2[1];
                        float f4 = fFloatValue2 + f3;
                        qw1 qw1Var = new qw1(i72Var, f, f2, f3, f4);
                        if (v3e.a(matrix2) < v3e.a(matrix)) {
                            c = 0;
                        } else {
                            c = 0;
                            if (!qw1Var.c) {
                                if (!zOnTouchEvent && !z2 && !z3) {
                                    zOnTouchEvent = false;
                                }
                            }
                            zOnTouchEvent = true;
                        }
                        if (v3e.a(matrix2) < v3e.a(matrix)) {
                            valueAnimatorOfPropertyValuesHolder = ValueAnimator.ofFloat(1.0f, 0.0f);
                            valueAnimatorOfPropertyValuesHolder.addUpdateListener(new e72(i72Var));
                        } else {
                            float[] fArr3 = new float[2];
                            fArr3[c] = f;
                            fArr3[1] = f3;
                            float[] fArr4 = new float[2];
                            fArr4[c] = f2;
                            fArr4[1] = f4;
                            valueAnimatorOfPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofMultiFloat("", new float[][]{fArr3, fArr4}));
                            valueAnimatorOfPropertyValuesHolder.addUpdateListener(new f72(qw1Var, i72Var));
                        }
                        valueAnimatorOfPropertyValuesHolder.setInterpolator(i72Var.w);
                        valueAnimatorOfPropertyValuesHolder.setDuration(400L);
                        i72Var.u = valueAnimatorOfPropertyValuesHolder;
                        valueAnimatorOfPropertyValuesHolder.start();
                        zOnTouchEvent = true;
                    } else {
                        c = 0;
                    }
                    if (zOnTouchEvent) {
                        c2 = 1;
                    }
                    boolean zOnTouchEvent2 = g52Var.v1.onTouchEvent(motionEvent);
                    if (c2 == 0 || zOnTouchEvent2) {
                        z = 1;
                    } else {
                        z = c;
                    }
                    return Boolean.valueOf(z);
                }
                c = 0;
                c2 = c;
                boolean zOnTouchEvent3 = g52Var.v1.onTouchEvent(motionEvent);
                if (c2 == 0) {
                    z = 1;
                } else {
                    z = 1;
                }
                return Boolean.valueOf(z);
            case 2:
                ((Boolean) obj).getClass();
                g52Var.e0(g52Var.A1);
                return sbiVar;
            case 3:
                ((Boolean) obj).getClass();
                g52.z(g52Var);
                return sbiVar;
            case 4:
                a8gVar.h(g52Var);
                return -1;
            default:
                a8gVar.h(g52Var);
                return 0;
        }
    }
}
