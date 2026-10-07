package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public final class seh extends qn8 implements eph {
    public final WeakReference g;
    public final Context h;
    public final msa i;
    public final lsa j;
    public final String k;
    public final ny8 l;
    public boolean m;
    public boolean n;
    public long o;
    public boolean p;
    public final RectF q;
    public final Paint r;
    public final Paint s;
    public PorterDuffColorFilter t;
    public final ny8 u;

    public seh(ny8 ny8Var, WeakReference weakReference, ar arVar, msa msaVar, lsa lsaVar) {
        super(0, 4);
        this.g = weakReference;
        this.h = arVar;
        this.i = msaVar;
        this.j = lsaVar;
        this.k = seh.class.getName();
        this.l = ny8Var;
        this.m = true;
        this.q = new RectF();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        this.r = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        this.s = paint2;
        pq3.j.e(arVar).m();
        this.t = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        this.u = rx8.P(3, new xre(ny8Var, 22, this));
    }

    @Override // defpackage.qn8
    public final void b(RecyclerView recyclerView, lfe lfeVar) {
        ViewParent viewParent;
        je9 je9Var = je9.d;
        super.b(recyclerView, lfeVar);
        String str = this.k;
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str, "clearView: reset state", null);
        }
        tea teaVar = lfeVar instanceof tea ? (tea) lfeVar : null;
        if (teaVar != null && (viewParent = teaVar.y) != null) {
            azf azfVar = viewParent instanceof azf ? (azf) viewParent : null;
            if (azfVar != null) {
                azfVar.setShareButtonSwipeProgress(0.0f);
            }
            k24 k24Var = viewParent instanceof k24 ? (k24) viewParent : null;
            if (k24Var != null) {
                k24Var.setCommentCompactShareProgress(0.0f);
            }
        }
        if (this.n && !this.p) {
            String str2 = this.k;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, str2, zo5.j(this.o, "clearView: trigger fallback reply with messageId="), null);
            }
            View view = (View) this.g.get();
            if (view != null) {
                nl9.d(view, false);
            }
            long j = this.o;
            String str3 = this.k;
            if (j > 0) {
                a4c a4cVar3 = gm0.f;
                if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                    a4cVar3.c(je9Var, str3, zo5.j(this.o, "clearView: invoking reply callback with messageId="), null);
                }
                this.j.invoke(Long.valueOf(this.o));
                this.p = true;
            } else {
                a4c a4cVar4 = gm0.f;
                if (a4cVar4 != null && a4cVar4.b(je9Var)) {
                    a4cVar4.c(je9Var, str3, zo5.j(this.o, "clearView: skip callback, invalid messageId="), null);
                }
            }
        }
        this.n = false;
        this.o = 0L;
        this.p = false;
        this.m = true;
    }

    @Override // defpackage.qn8
    public final float f(float f) {
        return Float.MAX_VALUE;
    }

    @Override // defpackage.qn8
    public final float g() {
        return 1.0f;
    }

    @Override // defpackage.qn8
    public final boolean l() {
        return ((Boolean) this.i.invoke()).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:87:0x0276  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.qn8
    public final void m(Canvas canvas, RecyclerView recyclerView, lfe lfeVar, float f, float f2, int i, boolean z) {
        float fB;
        long j;
        je9 je9Var = je9.d;
        if (lfeVar instanceof tea) {
            tea teaVar = (tea) lfeVar;
            if (teaVar.C) {
                float f3 = 96.0f;
                float fU = oc9.u(f, -(yl5.d().getDisplayMetrics().density * 96.0f), 0.0f);
                String str = this.k;
                a4c a4cVar = gm0.f;
                if (a4cVar == null) {
                    f3 = 96.0f;
                } else if (a4cVar.b(je9Var)) {
                    boolean z2 = this.p;
                    StringBuilder sbN = bc1.n("onChildDraw: dX=", f, ", restrictedX=", fU, ", actionState=");
                    sbN.append(i);
                    sbN.append(", isCurrentlyActive=");
                    sbN.append(z);
                    sbN.append(", isReplyTriggeredForCurrentSwipe=");
                    sbN.append(z2);
                    a4cVar.c(je9Var, str, sbN.toString(), null);
                }
                super.m(canvas, recyclerView, lfeVar, fU, f2, i, z);
                float fAbs = Math.abs(fU) / (yl5.d().getDisplayMetrics().density * f3);
                Paint paint = this.r;
                paint.setAlpha((int) (255.0f * fAbs));
                paint.setColorFilter(this.t);
                a8g a8gVar = pq3.j;
                Context context = this.h;
                int iAlpha = Color.alpha(a8gVar.e(context).m().t().b);
                Paint paint2 = this.s;
                paint2.setColor(a8gVar.e(context).m().t().b);
                paint2.setAlpha((int) (iAlpha * fAbs));
                ViewGroup viewGroup = teaVar.y;
                azf azfVar = viewGroup instanceof azf ? (azf) viewGroup : null;
                if (azfVar != null) {
                    azfVar.setShareButtonSwipeProgress(fAbs);
                }
                k24 k24Var = viewGroup instanceof k24 ? (k24) viewGroup : null;
                if (k24Var != null) {
                    k24Var.setCommentCompactShareProgress(fAbs);
                }
                float right = (yl5.d().getDisplayMetrics().density * 6.0f) + viewGroup.getRight() + fU + ((1.0f - fAbs) * yl5.d().getDisplayMetrics().density * 32.0f) + (yl5.d().getDisplayMetrics().density * 16.0f);
                View view = lfeVar.a;
                if (viewGroup instanceof azf) {
                    fB = ((azf) viewGroup).b(viewGroup.getHeight()) + viewGroup.getTop() + view.getTop();
                } else {
                    int bottom = ((RecyclerView) view.getParent()).getBottom();
                    float f4 = (yl5.d().getDisplayMetrics().density * 16.0f) + (yl5.d().getDisplayMetrics().density * 6.0f);
                    float f5 = (yl5.d().getDisplayMetrics().density * 16.0f) + f4;
                    if (viewGroup.getHeight() < f5 || bottom - view.getTop() < f5) {
                        float top = (yl5.d().getDisplayMetrics().density * 16.0f) + view.getTop();
                        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                        fB = top + (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
                    } else if (view.getBottom() < bottom) {
                        float bottom2 = view.getBottom();
                        ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                        fB = bottom2 - ((marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0) + f4);
                    } else {
                        fB = bottom - f4;
                    }
                }
                canvas.drawCircle(right, fB, yl5.d().getDisplayMetrics().density * 16.0f, this.s);
                float f6 = (yl5.d().getDisplayMetrics().density * 20.0f) / 2.0f;
                this.q.set(right - f6, fB - f6, right + f6, fB + f6);
                canvas.drawBitmap((Bitmap) this.u.getValue(), (Rect) null, this.q, this.r);
                boolean z3 = fU < (-(yl5.d().getDisplayMetrics().density * 70.0f));
                if (z3 && this.m) {
                    String str2 = this.k;
                    a4c a4cVar2 = gm0.f;
                    if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                        a4cVar2.c(je9Var, str2, "performHapticIfNeed: trigger haptic, restrictedX=" + fU, null);
                    }
                    View view2 = (View) this.g.get();
                    if (view2 != null) {
                        p0m.a(view2, lt7.CONFIRM);
                    }
                    this.m = false;
                } else if (!z3) {
                    this.m = true;
                }
                boolean z4 = fU < (-(yl5.d().getDisplayMetrics().density * 70.0f));
                if (z) {
                    this.n = z4;
                    this.o = z4 ? teaVar.A : 0L;
                    if (z4) {
                        String str3 = this.k;
                        a4c a4cVar3 = gm0.f;
                        if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                            float f7 = -(yl5.d().getDisplayMetrics().density * 70.0f);
                            j = 0;
                            long j2 = this.o;
                            StringBuilder sbN2 = bc1.n("onChildDraw: threshold reached, restrictedX=", fU, ", threshold=", f7, ", messageId=");
                            sbN2.append(j2);
                            a4cVar3.c(je9Var, str3, sbN2.toString(), null);
                        } else {
                            j = 0;
                        }
                    } else {
                        j = 0;
                    }
                } else {
                    j = 0;
                }
                if (z || !z4 || this.p) {
                    return;
                }
                this.p = true;
                String str4 = this.k;
                a4c a4cVar4 = gm0.f;
                if (a4cVar4 != null && a4cVar4.b(je9Var)) {
                    a4cVar4.c(je9Var, str4, "onChildDraw: trigger reply, restrictedX=" + fU + ", threshold=" + (-(yl5.d().getDisplayMetrics().density * 70.0f)), null);
                }
                View view3 = (View) this.g.get();
                if (view3 != null) {
                    nl9.d(view3, false);
                }
                long j3 = this.o;
                if (j3 <= j) {
                    j3 = teaVar.A;
                }
                String str5 = this.k;
                if (j3 > j) {
                    a4c a4cVar5 = gm0.f;
                    if (a4cVar5 != null && a4cVar5.b(je9Var)) {
                        a4cVar5.c(je9Var, str5, zo5.j(j3, "onChildDraw: invoking reply callback with messageId="), null);
                    }
                    this.j.invoke(Long.valueOf(j3));
                    return;
                }
                a4c a4cVar6 = gm0.f;
                if (a4cVar6 != null && a4cVar6.b(je9Var)) {
                    a4cVar6.c(je9Var, str5, zo5.j(j3, "onChildDraw: skip callback, invalid messageId="), null);
                    return;
                }
                return;
            }
        }
        String str6 = this.k;
        a4c a4cVar7 = gm0.f;
        if (a4cVar7 != null && a4cVar7.b(je9Var)) {
            StringBuilder sbR = c0a.r(i, "onChildDraw: skip, swipe disabled for ", lfeVar.getClass().getSimpleName(), ", actionState=", ", dX=");
            sbR.append(f);
            sbR.append(", isCurrentlyActive=");
            sbR.append(z);
            a4cVar7.c(je9Var, str6, sbR.toString(), null);
        }
    }

    @Override // defpackage.qn8
    public final boolean n(lfe lfeVar, lfe lfeVar2) {
        return false;
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        this.t = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
    }
}
