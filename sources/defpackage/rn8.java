package defpackage;

import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public class rn8 extends tee implements xee {
    public Rect A;
    public long B;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public final qn8 m;
    public int o;
    public int q;
    public RecyclerView r;
    public VelocityTracker t;
    public ArrayList u;
    public ArrayList v;
    public rj5 x;
    public pn8 y;
    public final ArrayList a = new ArrayList();
    public final float[] b = new float[2];
    public lfe c = null;
    public int l = -1;
    public int n = 0;
    public final ArrayList p = new ArrayList();
    public final pi s = new pi(23, this);
    public View w = null;
    public final hj1 z = new hj1(1, this);

    public rn8(qn8 qn8Var) {
        this.m = qn8Var;
    }

    public static boolean p(View view, float f, float f2, float f3, float f4) {
        return f >= f3 && f <= f3 + ((float) view.getWidth()) && f2 >= f4 && f2 <= f4 + ((float) view.getHeight());
    }

    @Override // defpackage.xee
    public final void b(View view) {
        if (view == this.w) {
            this.w = null;
        }
        lfe lfeVarS = this.r.S(view);
        if (lfeVarS == null) {
            return;
        }
        lfe lfeVar = this.c;
        if (lfeVar != null && lfeVarS == lfeVar) {
            r(null, 0);
            return;
        }
        m(lfeVarS, false);
        if (this.a.remove(lfeVarS.a)) {
            this.m.b(this.r, lfeVarS);
        }
    }

    @Override // defpackage.xee
    public final void d(View view) {
    }

    @Override // defpackage.tee
    public final void f(Rect rect, View view, RecyclerView recyclerView, hfe hfeVar) {
        rect.setEmpty();
    }

    @Override // defpackage.tee
    public final void g(Canvas canvas, RecyclerView recyclerView, hfe hfeVar) {
        float f;
        float f2;
        if (this.c != null) {
            float[] fArr = this.b;
            o(fArr);
            float f3 = fArr[0];
            f = fArr[1];
            f2 = f3;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        lfe lfeVar = this.c;
        int i = this.n;
        qn8 qn8Var = this.m;
        qn8Var.getClass();
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            nn8 nn8Var = (nn8) arrayList.get(i2);
            lfe lfeVar2 = nn8Var.e;
            float f4 = nn8Var.a;
            float f5 = nn8Var.c;
            if (f4 == f5) {
                nn8Var.i = lfeVar2.a.getTranslationX();
            } else {
                nn8Var.i = c0a.c(f5, f4, nn8Var.m, f4);
            }
            float f6 = nn8Var.b;
            float f7 = nn8Var.d;
            if (f6 == f7) {
                nn8Var.j = lfeVar2.a.getTranslationY();
            } else {
                nn8Var.j = c0a.c(f7, f6, nn8Var.m, f6);
            }
            int iSave = canvas.save();
            lfe lfeVar3 = nn8Var.e;
            float f8 = nn8Var.i;
            float f9 = nn8Var.j;
            int i3 = nn8Var.f;
            qn8 qn8Var2 = qn8Var;
            qn8Var2.m(canvas, recyclerView, lfeVar3, f8, f9, i3, false);
            canvas.restoreToCount(iSave);
            i2++;
            qn8Var = qn8Var2;
        }
        qn8 qn8Var3 = qn8Var;
        if (lfeVar != null) {
            int iSave2 = canvas.save();
            qn8Var3.m(canvas, recyclerView, lfeVar, f2, f, i, true);
            canvas.restoreToCount(iSave2);
        }
    }

    @Override // defpackage.tee
    public final void h(Canvas canvas, RecyclerView recyclerView) {
        boolean z = false;
        if (this.c != null) {
            float[] fArr = this.b;
            o(fArr);
            float f = fArr[0];
            float f2 = fArr[1];
        }
        lfe lfeVar = this.c;
        this.m.getClass();
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            nn8 nn8Var = (nn8) arrayList.get(i);
            int iSave = canvas.save();
            View view = nn8Var.e.a;
            canvas.restoreToCount(iSave);
        }
        if (lfeVar != null) {
            canvas.restoreToCount(canvas.save());
        }
        for (int i2 = size - 1; i2 >= 0; i2--) {
            nn8 nn8Var2 = (nn8) arrayList.get(i2);
            boolean z2 = nn8Var2.l;
            if (z2 && !nn8Var2.h) {
                arrayList.remove(i2);
            } else if (!z2) {
                z = true;
            }
        }
        if (z) {
            recyclerView.invalidate();
        }
    }

    public final void i(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.r;
        if (recyclerView2 == recyclerView) {
            return;
        }
        hj1 hj1Var = this.z;
        if (recyclerView2 != null) {
            recyclerView2.o0(this);
            this.r.q0(hj1Var);
            this.r.p0(this);
            ArrayList arrayList = this.p;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                nn8 nn8Var = (nn8) arrayList.get(0);
                nn8Var.g.cancel();
                this.m.b(this.r, nn8Var.e);
            }
            arrayList.clear();
            this.w = null;
            VelocityTracker velocityTracker = this.t;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.t = null;
            }
            pn8 pn8Var = this.y;
            if (pn8Var != null) {
                pn8Var.a = false;
                this.y = null;
            }
            if (this.x != null) {
                this.x = null;
            }
        }
        this.r = recyclerView;
        if (recyclerView != null) {
            Resources resources = recyclerView.getResources();
            this.f = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_velocity);
            this.g = resources.getDimension(R.dimen.item_touch_helper_swipe_escape_max_velocity);
            this.q = ViewConfiguration.get(this.r.getContext()).getScaledTouchSlop();
            this.r.h(this, -1);
            this.r.j(hj1Var);
            this.r.i(this);
            this.y = new pn8(this);
            this.x = new rj5(this.r.getContext(), this.y);
        }
    }

    public final int j(lfe lfeVar, int i) {
        if ((i & 12) == 0) {
            return 0;
        }
        int i2 = this.h > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.t;
        qn8 qn8Var = this.m;
        if (velocityTracker != null && this.l > -1) {
            float f = this.g;
            qn8Var.getClass();
            velocityTracker.computeCurrentVelocity(1000, f);
            float xVelocity = this.t.getXVelocity(this.l);
            float yVelocity = this.t.getYVelocity(this.l);
            int i3 = xVelocity > 0.0f ? 8 : 4;
            float fAbs = Math.abs(xVelocity);
            if ((i3 & i) != 0 && i2 == i3 && fAbs >= qn8Var.f(this.f) && fAbs > Math.abs(yVelocity)) {
                return i3;
            }
        }
        float fG = qn8Var.g() * this.r.getWidth();
        if ((i & i2) == 0 || Math.abs(this.h) <= fG) {
            return 0;
        }
        return i2;
    }

    public final void k(int i, int i2, MotionEvent motionEvent) {
        View viewN;
        if (this.c == null && i == 2 && this.n != 2) {
            qn8 qn8Var = this.m;
            if (qn8Var.l() && this.r.getScrollState() != 1) {
                vee layoutManager = this.r.getLayoutManager();
                int i3 = this.l;
                lfe lfeVarS = null;
                if (i3 != -1) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(i3);
                    float x = motionEvent.getX(iFindPointerIndex) - this.d;
                    float y = motionEvent.getY(iFindPointerIndex) - this.e;
                    float fAbs = Math.abs(x);
                    float fAbs2 = Math.abs(y);
                    float f = this.q;
                    if ((fAbs >= f || fAbs2 >= f) && ((fAbs <= fAbs2 || !layoutManager.getE()) && ((fAbs2 <= fAbs || !layoutManager.f()) && (viewN = n(motionEvent)) != null))) {
                        lfeVarS = this.r.S(viewN);
                    }
                }
                if (lfeVarS == null) {
                    return;
                }
                RecyclerView recyclerView = this.r;
                int i4 = qn8Var.d;
                int i5 = qn8Var.c;
                int i6 = (i5 << 8) | i5 | i4 | (i4 << 16);
                WeakHashMap weakHashMap = i7j.a;
                int iC = (qn8.c(i6, recyclerView.getLayoutDirection()) & 65280) >> 8;
                if (iC == 0) {
                    return;
                }
                float x2 = motionEvent.getX(i2);
                float y2 = motionEvent.getY(i2);
                float f2 = x2 - this.d;
                float f3 = y2 - this.e;
                float fAbs3 = Math.abs(f2);
                float fAbs4 = Math.abs(f3);
                float f4 = this.q;
                if (fAbs3 >= f4 || fAbs4 >= f4) {
                    if (fAbs3 > fAbs4) {
                        if (f2 < 0.0f && (iC & 4) == 0) {
                            return;
                        }
                        if (f2 > 0.0f && (iC & 8) == 0) {
                            return;
                        }
                    } else {
                        if (f3 < 0.0f && (iC & 1) == 0) {
                            return;
                        }
                        if (f3 > 0.0f && (iC & 2) == 0) {
                            return;
                        }
                    }
                    this.i = 0.0f;
                    this.h = 0.0f;
                    this.l = motionEvent.getPointerId(0);
                    r(lfeVarS, 1);
                }
            }
        }
    }

    public final int l(lfe lfeVar, int i) {
        if ((i & 3) == 0) {
            return 0;
        }
        int i2 = this.i > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.t;
        qn8 qn8Var = this.m;
        if (velocityTracker != null && this.l > -1) {
            float f = this.g;
            qn8Var.getClass();
            velocityTracker.computeCurrentVelocity(1000, f);
            float xVelocity = this.t.getXVelocity(this.l);
            float yVelocity = this.t.getYVelocity(this.l);
            int i3 = yVelocity > 0.0f ? 2 : 1;
            float fAbs = Math.abs(yVelocity);
            if ((i3 & i) != 0 && i3 == i2 && fAbs >= qn8Var.f(this.f) && fAbs > Math.abs(xVelocity)) {
                return i3;
            }
        }
        float fG = qn8Var.g() * this.r.getHeight();
        if ((i & i2) == 0 || Math.abs(this.i) <= fG) {
            return 0;
        }
        return i2;
    }

    public final void m(lfe lfeVar, boolean z) {
        ArrayList arrayList = this.p;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            nn8 nn8Var = (nn8) arrayList.get(size);
            if (nn8Var.e == lfeVar) {
                nn8Var.k |= z;
                if (!nn8Var.l) {
                    nn8Var.g.cancel();
                }
                arrayList.remove(size);
                return;
            }
        }
    }

    public final View n(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        lfe lfeVar = this.c;
        if (lfeVar != null) {
            View view = lfeVar.a;
            if (p(view, x, y, this.j + this.h, this.k + this.i)) {
                return view;
            }
        }
        ArrayList arrayList = this.p;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            nn8 nn8Var = (nn8) arrayList.get(size);
            View view2 = nn8Var.e.a;
            if (p(view2, x, y, nn8Var.i, nn8Var.j)) {
                return view2;
            }
        }
        return this.r.F(x, y);
    }

    public final void o(float[] fArr) {
        if ((this.o & 12) != 0) {
            fArr[0] = (this.j + this.h) - this.c.a.getLeft();
        } else {
            fArr[0] = this.c.a.getTranslationX();
        }
        if ((this.o & 3) != 0) {
            fArr[1] = (this.k + this.i) - this.c.a.getTop();
        } else {
            fArr[1] = this.c.a.getTranslationY();
        }
    }

    public final void q(lfe lfeVar) {
        ArrayList arrayList;
        int bottom;
        int iAbs;
        int top;
        int iAbs2;
        int left;
        int iAbs3;
        int right;
        int iAbs4;
        int i;
        if (!this.r.isLayoutRequested() && this.n == 2) {
            qn8 qn8Var = this.m;
            qn8Var.getClass();
            int i2 = (int) (this.j + this.h);
            int i3 = (int) (this.k + this.i);
            View view = lfeVar.a;
            if (Math.abs(i3 - view.getTop()) >= view.getHeight() * 0.5f || Math.abs(i2 - view.getLeft()) >= view.getWidth() * 0.5f) {
                ArrayList arrayList2 = this.u;
                if (arrayList2 == null) {
                    this.u = new ArrayList();
                    this.v = new ArrayList();
                } else {
                    arrayList2.clear();
                    this.v.clear();
                }
                int iRound = Math.round(this.j + this.h);
                int iRound2 = Math.round(this.k + this.i);
                int width = view.getWidth() + iRound;
                int height = view.getHeight() + iRound2;
                int i4 = (iRound + width) / 2;
                int i5 = (iRound2 + height) / 2;
                vee layoutManager = this.r.getLayoutManager();
                int iW = layoutManager.w();
                int i6 = 0;
                while (i6 < iW) {
                    View viewV = layoutManager.v(i6);
                    if (viewV == view) {
                        i = i6;
                    } else {
                        i = i6;
                        if (viewV.getBottom() >= iRound2 && viewV.getTop() <= height && viewV.getRight() >= iRound && viewV.getLeft() <= width) {
                            lfe lfeVarS = this.r.S(viewV);
                            if (qn8Var.a(lfeVarS)) {
                                int iAbs5 = Math.abs(i4 - ((viewV.getRight() + viewV.getLeft()) / 2));
                                int iAbs6 = Math.abs(i5 - ((viewV.getBottom() + viewV.getTop()) / 2));
                                int i7 = (iAbs6 * iAbs6) + (iAbs5 * iAbs5);
                                int size = this.u.size();
                                int i8 = 0;
                                int i9 = 0;
                                while (i8 < size) {
                                    int i10 = size;
                                    if (i7 <= ((Integer) this.v.get(i8)).intValue()) {
                                        break;
                                    }
                                    i9++;
                                    i8++;
                                    size = i10;
                                }
                                this.u.add(i9, lfeVarS);
                                this.v.add(i9, Integer.valueOf(i7));
                            }
                        }
                        i6 = i + 1;
                        i2 = i2;
                        i3 = i3;
                        iRound = iRound;
                    }
                    i6 = i + 1;
                    i2 = i2;
                    i3 = i3;
                    iRound = iRound;
                }
                int i11 = i2;
                int i12 = i3;
                ArrayList arrayList3 = this.u;
                if (arrayList3.size() == 0) {
                    return;
                }
                int width2 = view.getWidth() + i11;
                int height2 = view.getHeight() + i12;
                int left2 = i11 - view.getLeft();
                int top2 = i12 - view.getTop();
                int size2 = arrayList3.size();
                lfe lfeVar2 = null;
                int i13 = -1;
                int i14 = 0;
                while (i14 < size2) {
                    lfe lfeVar3 = (lfe) arrayList3.get(i14);
                    if (left2 <= 0 || (right = lfeVar3.a.getRight() - width2) >= 0) {
                        arrayList = arrayList3;
                    } else {
                        arrayList = arrayList3;
                        if (lfeVar3.a.getRight() > view.getRight() && (iAbs4 = Math.abs(right)) > i13) {
                            i13 = iAbs4;
                            lfeVar2 = lfeVar3;
                        }
                    }
                    if (left2 < 0 && (left = lfeVar3.a.getLeft() - i11) > 0 && lfeVar3.a.getLeft() < view.getLeft() && (iAbs3 = Math.abs(left)) > i13) {
                        i13 = iAbs3;
                        lfeVar2 = lfeVar3;
                    }
                    if (top2 < 0 && (top = lfeVar3.a.getTop() - i12) > 0 && lfeVar3.a.getTop() < view.getTop() && (iAbs2 = Math.abs(top)) > i13) {
                        i13 = iAbs2;
                        lfeVar2 = lfeVar3;
                    }
                    if (top2 > 0 && (bottom = lfeVar3.a.getBottom() - height2) < 0 && lfeVar3.a.getBottom() > view.getBottom() && (iAbs = Math.abs(bottom)) > i13) {
                        i13 = iAbs;
                        lfeVar2 = lfeVar3;
                    }
                    i14++;
                    arrayList3 = arrayList;
                }
                if (lfeVar2 == null) {
                    this.u.clear();
                    this.v.clear();
                    return;
                }
                View view2 = lfeVar2.a;
                int iK = lfeVar2.k();
                lfeVar.k();
                if (qn8Var.n(lfeVar, lfeVar2)) {
                    RecyclerView recyclerView = this.r;
                    vee layoutManager2 = recyclerView.getLayoutManager();
                    if (layoutManager2 instanceof LinearLayoutManager) {
                        ((LinearLayoutManager) layoutManager2).k1(view, view2);
                        return;
                    }
                    if (layoutManager2.getE()) {
                        if (vee.B(view2) <= recyclerView.getPaddingLeft()) {
                            recyclerView.w0(iK);
                        }
                        if (vee.E(view2) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                            recyclerView.w0(iK);
                        }
                    }
                    if (layoutManager2.f()) {
                        if (vee.F(view2) <= recyclerView.getPaddingTop()) {
                            recyclerView.w0(iK);
                        }
                        if (vee.z(view2) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                            recyclerView.w0(iK);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0047  */
    /* JADX WARN: Code duplicated, block: B:43:0x00bc  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.view.ViewParent] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r21v0, types: [rn8] */
    /* JADX WARN: Type inference failed for: r2v1, types: [lfe] */
    /* JADX WARN: Type inference failed for: r4v1, types: [qn8] */
    /* JADX WARN: Type inference failed for: r4v2, types: [qn8] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void r(lfe lfeVar, int i) {
        ?? r12;
        boolean z;
        ?? r4;
        ?? r13;
        ?? r14;
        lfe lfeVar2;
        ?? r5;
        char c;
        int iL;
        float fSignum;
        long jF;
        if (lfeVar == this.c && i == this.n) {
            return;
        }
        this.B = Long.MIN_VALUE;
        int i2 = this.n;
        m(lfeVar, true);
        this.n = i;
        if (i == 2) {
            if (lfeVar == null) {
                ore.p("Must pass a ViewHolder when dragging");
                return;
            }
            this.w = lfeVar.a;
        }
        int i3 = (1 << ((i * 8) + 8)) - 1;
        ?? r2 = this.c;
        qn8 qn8Var = this.m;
        if (r2 != 0) {
            View view = r2.a;
            if (view.getParent() != null) {
                if (i2 == 2 || this.n == 2) {
                    iL = 0;
                    c = 0;
                } else {
                    RecyclerView recyclerView = this.r;
                    int i4 = qn8Var.d;
                    int i5 = qn8Var.c;
                    int i6 = (i4 << 16) | i5 | i4 | (i5 << 8);
                    WeakHashMap weakHashMap = i7j.a;
                    int iC = (qn8.c(i6, recyclerView.getLayoutDirection()) & 65280) >> 8;
                    if (iC == 0) {
                        iL = 0;
                        c = 0;
                    } else {
                        int i7 = (i6 & 65280) >> 8;
                        c = 0;
                        if (Math.abs(this.h) > Math.abs(this.i)) {
                            iL = j(r2, iC);
                            if (iL <= 0) {
                                iL = l(r2, iC);
                                if (iL <= 0) {
                                    iL = 0;
                                }
                            } else if ((i7 & iL) == 0) {
                                iL = qn8.d(iL, this.r.getLayoutDirection());
                            }
                        } else {
                            iL = l(r2, iC);
                            if (iL <= 0) {
                                iL = j(r2, iC);
                                if (iL <= 0) {
                                    iL = 0;
                                } else if ((i7 & iL) == 0) {
                                    iL = qn8.d(iL, this.r.getLayoutDirection());
                                }
                            }
                        }
                    }
                }
                VelocityTracker velocityTracker = this.t;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.t = null;
                }
                char c2 = 4;
                float fSignum2 = 0.0f;
                if (iL == 1 || iL == 2) {
                    fSignum = Math.signum(this.i) * this.r.getHeight();
                } else if (iL == 4 || iL == 8 || iL == 16 || iL == 32) {
                    fSignum = 0.0f;
                    fSignum2 = Math.signum(this.h) * this.r.getWidth();
                } else {
                    fSignum = 0.0f;
                }
                if (i2 == 2) {
                    c2 = '\b';
                } else if (iL > 0) {
                    c2 = 2;
                }
                float[] fArr = this.b;
                o(fArr);
                char c3 = c2;
                ?? r15 = c;
                nn8 nn8Var = new nn8(this, r2, i2, fArr[c], fArr[1], fSignum2, fSignum, iL, r2);
                RecyclerView recyclerView2 = this.r;
                qn8Var.getClass();
                see itemAnimator = recyclerView2.getItemAnimator();
                if (itemAnimator == null) {
                    jF = c3 == '\b' ? 200L : 250L;
                } else {
                    jF = c3 == '\b' ? itemAnimator.f() : itemAnimator.d;
                }
                ValueAnimator valueAnimator = nn8Var.g;
                valueAnimator.setDuration(jF);
                this.p.add(nn8Var);
                r2.y(r15);
                valueAnimator.start();
                r5 = qn8Var;
                lfeVar2 = null;
                z = true;
                r14 = r15;
            } else {
                r14 = 0;
                if (view == this.w) {
                    lfeVar2 = null;
                    this.w = null;
                } else {
                    lfeVar2 = null;
                }
                ?? r6 = qn8Var;
                r6.b(this.r, r2);
                z = false;
                r5 = r6;
            }
            this.c = lfeVar2;
            r4 = r5;
            r12 = r14;
        } else {
            r12 = 0;
            z = false;
        }
        if (lfeVar != null) {
            r4 = qn8Var;
            View view2 = lfeVar.a;
            RecyclerView recyclerView3 = this.r;
            int i8 = r4.d;
            int i9 = r4.c;
            int i10 = (i8 << 16) | (i9 << 8) | i9 | i8;
            WeakHashMap weakHashMap2 = i7j.a;
            this.o = (qn8.c(i10, recyclerView3.getLayoutDirection()) & i3) >> (this.n * 8);
            this.j = view2.getLeft();
            this.k = view2.getTop();
            this.c = lfeVar;
            if (i == 2) {
                view2.performHapticFeedback(r12 == true ? 1 : 0);
            }
        }
        r4 = qn8Var;
        ?? parent = this.r.getParent();
        if (parent != 0) {
            if (this.c != null) {
                r13 = r12;
                r13 = 1;
            }
            r13 = r12;
            parent.requestDisallowInterceptTouchEvent(r13);
        }
        if (!z) {
            this.r.getLayoutManager().f = true;
        }
        r4.o(this.c, this.n);
        this.r.invalidate();
    }

    public final void s(lfe lfeVar) {
        RecyclerView recyclerView = this.r;
        qn8 qn8Var = this.m;
        int i = qn8Var.d;
        int i2 = qn8Var.c;
        int i3 = (i2 << 8) | i2 | i | (i << 16);
        WeakHashMap weakHashMap = i7j.a;
        if ((qn8.c(i3, recyclerView.getLayoutDirection()) & 16711680) == 0) {
            Log.e("ItemTouchHelper", "Start drag has been called but dragging is not enabled");
            return;
        }
        if (lfeVar.a.getParent() != this.r) {
            Log.e("ItemTouchHelper", "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper.");
            return;
        }
        VelocityTracker velocityTracker = this.t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.t = VelocityTracker.obtain();
        this.i = 0.0f;
        this.h = 0.0f;
        r(lfeVar, 2);
    }

    public final void t(int i, int i2, MotionEvent motionEvent) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f = x - this.d;
        this.h = f;
        this.i = y - this.e;
        if ((i & 4) == 0) {
            this.h = Math.max(0.0f, f);
        }
        if ((i & 8) == 0) {
            this.h = Math.min(0.0f, this.h);
        }
        if ((i & 1) == 0) {
            this.i = Math.max(0.0f, this.i);
        }
        if ((i & 2) == 0) {
            this.i = Math.min(0.0f, this.i);
        }
    }
}
