package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class hj1 implements zee {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hj1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void b(boolean z) {
    }

    private final void d(MotionEvent motionEvent) {
    }

    @Override // defpackage.zee
    public final void a(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                break;
            default:
                rn8 rn8Var = (rn8) this.b;
                pi piVar = rn8Var.s;
                ((GestureDetector) rn8Var.x.b).onTouchEvent(motionEvent);
                VelocityTracker velocityTracker = rn8Var.t;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
                if (rn8Var.l != -1) {
                    int actionMasked = motionEvent.getActionMasked();
                    int iFindPointerIndex = motionEvent.findPointerIndex(rn8Var.l);
                    if (iFindPointerIndex >= 0) {
                        rn8Var.k(actionMasked, iFindPointerIndex, motionEvent);
                    }
                    lfe lfeVar = rn8Var.c;
                    if (lfeVar != null) {
                        if (actionMasked != 1) {
                            if (actionMasked == 2) {
                                if (iFindPointerIndex >= 0) {
                                    rn8Var.t(rn8Var.o, iFindPointerIndex, motionEvent);
                                    rn8Var.q(lfeVar);
                                    rn8Var.r.removeCallbacks(piVar);
                                    piVar.run();
                                    rn8Var.r.invalidate();
                                }
                                break;
                            } else if (actionMasked == 3) {
                                VelocityTracker velocityTracker2 = rn8Var.t;
                                if (velocityTracker2 != null) {
                                    velocityTracker2.clear();
                                }
                            } else if (actionMasked == 6) {
                                int actionIndex = motionEvent.getActionIndex();
                                if (motionEvent.getPointerId(actionIndex) == rn8Var.l) {
                                    rn8Var.l = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                                    rn8Var.t(rn8Var.o, actionIndex, motionEvent);
                                }
                                break;
                            }
                        }
                        rn8Var.r(null, 0);
                        rn8Var.l = -1;
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.zee
    public final boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
        int iFindPointerIndex;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                if (recyclerView.F(motionEvent.getX(), motionEvent.getY()) == null) {
                    ((lj1) obj).z.onTouchEvent(motionEvent);
                }
                return false;
            default:
                rn8 rn8Var = (rn8) obj;
                ((GestureDetector) rn8Var.x.b).onTouchEvent(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                nn8 nn8Var = null;
                if (actionMasked == 0) {
                    rn8Var.l = motionEvent.getPointerId(0);
                    rn8Var.d = motionEvent.getX();
                    rn8Var.e = motionEvent.getY();
                    VelocityTracker velocityTracker = rn8Var.t;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                    }
                    rn8Var.t = VelocityTracker.obtain();
                    if (rn8Var.c == null) {
                        ArrayList arrayList = rn8Var.p;
                        if (!arrayList.isEmpty()) {
                            View viewN = rn8Var.n(motionEvent);
                            for (int size = arrayList.size() - 1; size >= 0; size--) {
                                nn8 nn8Var2 = (nn8) arrayList.get(size);
                                if (nn8Var2.e.a == viewN) {
                                    nn8Var = nn8Var2;
                                }
                            }
                        }
                        if (nn8Var != null) {
                            lfe lfeVar = nn8Var.e;
                            rn8Var.d -= nn8Var.i;
                            rn8Var.e -= nn8Var.j;
                            rn8Var.m(lfeVar, true);
                            if (rn8Var.a.remove(lfeVar.a)) {
                                rn8Var.m.b(rn8Var.r, lfeVar);
                            }
                            rn8Var.r(lfeVar, nn8Var.f);
                            rn8Var.t(rn8Var.o, 0, motionEvent);
                        }
                    }
                } else if (actionMasked == 3 || actionMasked == 1) {
                    rn8Var.l = -1;
                    rn8Var.r(null, 0);
                } else {
                    int i2 = rn8Var.l;
                    if (i2 != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i2)) >= 0) {
                        rn8Var.k(actionMasked, iFindPointerIndex, motionEvent);
                    }
                }
                VelocityTracker velocityTracker2 = rn8Var.t;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
                return rn8Var.c != null;
        }
    }

    @Override // defpackage.zee
    public final void e(boolean z) {
        switch (this.a) {
            case 0:
                break;
            default:
                if (z) {
                    ((rn8) this.b).r(null, 0);
                    break;
                }
                break;
        }
    }
}
