package one.me.chats.tab;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.appbar.AppBarLayout$Behavior;
import defpackage.a5d;
import defpackage.cqk;
import defpackage.cy5;
import defpackage.et4;
import defpackage.fsg;
import defpackage.gm0;
import defpackage.iug;
import defpackage.k96;
import defpackage.lfe;
import defpackage.lt7;
import defpackage.mjg;
import defpackage.mo3;
import defpackage.ny8;
import defpackage.oc9;
import defpackage.org;
import defpackage.p0m;
import defpackage.p90;
import defpackage.pqg;
import defpackage.qq;
import defpackage.rcc;
import defpackage.rq;
import defpackage.rx8;
import defpackage.t3a;
import defpackage.vee;
import defpackage.yg6;
import defpackage.yl5;
import defpackage.zo5;
import defpackage.zv8;
import kotlin.Metadata;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lone/me/chats/tab/StoriesAppBarBehavior;", "Lcom/google/android/material/appbar/AppBarLayout$Behavior;", "Lqq;", "<init>", "()V", "t3a", "pqg", "chats-list"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class StoriesAppBarBehavior extends AppBarLayout$Behavior implements qq {
    public boolean A;
    public Integer B;
    public float C;
    public final ny8 D;
    public mo3 E;
    public boolean F;
    public boolean G;
    public t3a p;
    public final float q = 0.5f;
    public int r;
    public rq s;
    public k96 t;
    public org u;
    public rcc v;
    public final mjg w;
    public final mjg x;
    public float y;
    public boolean z;

    public StoriesAppBarBehavior() {
        mjg mjgVarA = p90.a(pqg.a);
        this.w = mjgVarA;
        this.x = mjgVarA;
        this.A = true;
        this.D = rx8.P(3, new a5d(26));
        this.F = true;
        this.o = new cy5(24);
    }

    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior, defpackage.ys4
    /* JADX INFO: renamed from: A */
    public final void l(et4 et4Var, rq rqVar, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i5 == 0) {
            int id = view.getId();
            if (id != R.id.oneme_folder_empty_view_scrollable_container_id) {
                if (id != R.id.chats_list_view) {
                    return;
                }
                k96 k96Var = view instanceof k96 ? (k96) view : null;
                if (k96Var == null || k96Var.canScrollVertically(-1)) {
                    return;
                }
            }
            super.l(et4Var, rqVar, view, i, i2, i3, i4, i5, iArr);
        }
    }

    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior, defpackage.ys4
    /* JADX INFO: renamed from: B */
    public final boolean p(et4 et4Var, rq rqVar, View view, View view2, int i, int i2) {
        if (!this.F) {
            return this.w.getValue() != pqg.d;
        }
        if (i != 2) {
            return false;
        }
        int id = view2.getId();
        return id == R.id.oneme_folder_empty_view_scrollable_container_id || id == R.id.chats_list_view;
    }

    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior, defpackage.ys4
    /* JADX INFO: renamed from: C */
    public final void q(et4 et4Var, rq rqVar, View view, int i) {
        int totalScrollRange;
        int i2;
        super.q(et4Var, rqVar, view, i);
        if (!this.G && (totalScrollRange = rqVar.getTotalScrollRange()) != 0 && (i2 = this.r) != 0 && Math.abs(i2) != totalScrollRange) {
            float fAbs = Math.abs(this.r) / totalScrollRange;
            boolean zA = ((pqg) this.w.getValue()).a();
            float f = this.q;
            rqVar.g(!zA ? fAbs >= 1.0f - f : fAbs >= f, true, true);
        }
        this.G = false;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0084  */
    @Override // defpackage.oq
    public final void R0(rq rqVar, int i) {
        boolean z;
        pqg pqgVar;
        org orgVar;
        rcc rccVar;
        int iIntValue;
        View view;
        k96 k96Var;
        rq rqVar2;
        this.r = i;
        rq rqVar3 = this.s;
        if (rqVar3 != null) {
            float totalScrollRange = rqVar3.getTotalScrollRange();
            if (totalScrollRange == 0.0f) {
                return;
            }
            float fU = oc9.u(Math.abs(i) / totalScrollRange, 0.0f, 1.0f);
            boolean z2 = this.z;
            boolean z3 = z2 && fU > this.y;
            boolean z4 = z2 && fU < this.y;
            float f = this.q;
            float f2 = 1.0f - f;
            boolean z5 = z3 && fU >= f && this.y < f;
            boolean z6 = !z3 && fU <= f2 && this.y > f2;
            if (z2 && ((z5 || z6) && (rqVar2 = this.s) != null)) {
                p0m.a(rqVar2, lt7.CONFIRM);
            }
            mjg mjgVar = this.w;
            pqg pqgVar2 = (pqg) mjgVar.getValue();
            org orgVar2 = this.u;
            if (orgVar2 != null) {
                fsg fsgVar = orgVar2.c;
                if (fsgVar.a(fU) <= fsgVar.d) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            boolean z7 = z3 || (!z4 && pqgVar2.a());
            pqg pqgVar3 = pqg.d;
            pqg pqgVar4 = pqg.a;
            if (fU <= 0.0f) {
                pqgVar = pqgVar4;
            } else if (fU >= 1.0f) {
                pqgVar = pqgVar3;
            } else if (z7) {
                pqgVar = z ? pqg.c : pqg.b;
            } else {
                pqgVar = z ? pqg.e : pqg.f;
            }
            if (pqgVar != pqgVar2) {
                pqg pqgVar5 = (pqg) mjgVar.getValue();
                this.A = pqgVar == pqgVar4 || pqgVar == pqgVar3;
                if (pqgVar.a() && !pqgVar5.a() && (k96Var = this.t) != null) {
                    vee layoutManager = k96Var.getLayoutManager();
                    LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                    if (linearLayoutManager != null) {
                        int iX0 = linearLayoutManager.X0();
                        int iZ0 = linearLayoutManager.Z0();
                        int iU0 = linearLayoutManager.U0();
                        if (iX0 != -1) {
                            View viewR = linearLayoutManager.r(iX0);
                            int left = viewR != null ? viewR.getLeft() : 0;
                            boolean z8 = iX0 != iU0;
                            int iD = zo5.D(8.0f, yl5.d().getDisplayMetrics().density, left);
                            org orgVar3 = this.u;
                            if (orgVar3 != null) {
                                orgVar3.g = iD;
                                orgVar3.c.setOffsetLeft(iD);
                            }
                            t3a t3aVar = this.p;
                            if (t3aVar != null) {
                                ChatsTabWidget chatsTabWidget = (ChatsTabWidget) t3aVar.a;
                                zv8[] zv8VarArr = ChatsTabWidget.B1;
                                iug iugVarB1 = chatsTabWidget.B1();
                                yg6 yg6Var = new yg6(iX0, iZ0, z8);
                                mjg mjgVar2 = iugVarB1.l.f;
                                mjgVar2.getClass();
                                mjgVar2.j(null, yg6Var);
                            }
                        }
                    }
                }
                mjgVar.j(null, pqgVar);
            }
            k96 k96Var2 = this.t;
            if (k96Var2 != null && (orgVar = this.u) != null && (rccVar = this.v) != null) {
                k96Var2.setAlpha(fU <= 0.0f ? 1.0f : 0.0f);
                k96Var2.setClickable(fU <= 0.0f);
                vee layoutManager2 = k96Var2.getLayoutManager();
                LinearLayoutManager linearLayoutManager2 = layoutManager2 instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager2 : null;
                int iU1 = linearLayoutManager2 != null ? linearLayoutManager2.U0() : 0;
                Integer num = this.B;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    lfe lfeVarK = k96Var2.K(Math.max(0, iU1));
                    ny8 ny8Var = this.D;
                    if (lfeVarK != null && (view = lfeVarK.a) != null) {
                        view.getGlobalVisibleRect((Rect) ny8Var.getValue());
                    }
                    this.B = Integer.valueOf(((Rect) ny8Var.getValue()).left);
                    iIntValue = ((Rect) ny8Var.getValue()).left;
                }
                int iK = gm0.K(16.0f * yl5.d().getDisplayMetrics().density);
                float fMax = Math.max(this.C, rccVar.getTitle().getRight());
                this.C = fMax;
                float fK = fMax + gm0.K(8.0f * yl5.d().getDisplayMetrics().density);
                int measuredHeight = rccVar.getMeasuredHeight();
                float measuredHeight2 = (rccVar.getMeasuredHeight() / 2.0f) - ((orgVar.getMeasuredHeight() - iK) / 2.0f);
                float f3 = iIntValue;
                orgVar.setTranslationX(((fK - f3) * fU) + f3);
                float f4 = measuredHeight;
                orgVar.setTranslationY(((measuredHeight2 - f4) * fU) + f4);
                orgVar.setProgress(fU);
            }
            this.y = fU;
            this.z = true;
        }
    }

    @Override // defpackage.ys4
    public final void f() {
        rq rqVar = this.s;
        if (rqVar != null) {
            rqVar.f(this);
        }
        this.s = null;
    }

    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior, defpackage.n8j, defpackage.ys4
    public final /* bridge */ /* synthetic */ boolean h(et4 et4Var, View view, int i) {
        y(et4Var, (rq) view, i);
        return true;
    }

    @Override // defpackage.ys4
    public final boolean j(View view, View view2, float f) {
        this.G = Math.abs(f) > 1000.0f;
        return false;
    }

    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior
    public final void y(et4 et4Var, rq rqVar, int i) {
        if (!cqk.d(this.s, rqVar)) {
            rq rqVar2 = this.s;
            if (rqVar2 != null) {
                rqVar2.f(this);
            }
            this.s = rqVar;
            rqVar.a(this);
        }
        super.y(et4Var, rqVar, i);
    }
}
