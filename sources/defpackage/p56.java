package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class p56 extends s7g {
    public final ShapeDrawable u;
    public final kbc v;
    public final l1c w;
    public final xme x;
    public final int y;
    public bo2 z;

    public p56(Context context, ShapeDrawable shapeDrawable, nv4 nv4Var, kbc kbcVar) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 36.0f), gm0.K(36.0f * yl5.d().getDisplayMetrics().density));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(layoutParams);
        int iK = gm0.K(6.0f * yl5.d().getDisplayMetrics().density);
        frameLayout.setPadding(iK, iK, iK, iK);
        l1c l1cVar = new l1c(context);
        l1cVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
        ((wj7) l1cVar.getHierarchy()).h(i1f.m);
        frameLayout.addView(l1cVar);
        super(frameLayout);
        this.u = shapeDrawable;
        this.v = kbcVar;
        View childAt = frameLayout.getChildAt(0);
        lq4 lq4Var = null;
        this.w = childAt instanceof l1c ? (l1c) childAt : null;
        this.x = p90.M(new n52(context, 5));
        this.y = gm0.K(24.0f * yl5.d().getDisplayMetrics().density);
        n1g.N(new ud9(this, lq4Var, 18), frameLayout);
        qe7.H(frameLayout, 300L, new z36(this, 1, nv4Var));
    }

    @Override // defpackage.s7g
    public final void B(k79 k79Var) {
        bo2 bo2Var = (bo2) k79Var;
        String str = bo2Var.f;
        this.z = bo2Var;
        int i = bo2Var.h;
        String str2 = bo2Var.e;
        xme xmeVar = this.x;
        l1c l1cVar = this.w;
        if (str2 != null) {
            if (l1cVar != null) {
                l1cVar.setVisibility(0);
            }
            if (l1cVar != null) {
                l1c.j(l1cVar, v78.b(str2), null, 6);
            }
            if (str != null) {
                bj9 bj9Var = (bj9) xmeVar.getValue();
                n7j.a((ViewGroup) this.a, bj9Var, -1);
                bj9Var.setVisibility(0);
                int i2 = this.y;
                boolean zA = bj9Var.a(i2, i2, str);
                if (l1cVar != null) {
                    l1cVar.setVisibility(zA ? 0 : 8);
                }
                bj9Var.setOnFirstFrameListener(new s63(21, this));
            } else if (xmeVar.d()) {
                bj9 bj9Var2 = (bj9) xmeVar.getValue();
                bj9Var2.f();
                bj9Var2.setVisibility(8);
            }
        } else {
            if (l1cVar != null) {
                l1cVar.setVisibility(0);
            }
            if (l1cVar != null) {
                l1cVar.setImageResource(i);
            }
            if (xmeVar.d()) {
                bj9 bj9Var3 = (bj9) xmeVar.getValue();
                bj9Var3.f();
                bj9Var3.setVisibility(8);
            }
        }
        H(bo2Var.c);
    }

    public final void H(boolean z) {
        View view = this.a;
        ((ViewGroup) view).setBackground(z ? this.u : null);
        kbc kbcVarH = this.v;
        if (kbcVarH == null) {
            kbcVarH = pq3.j.h(view);
        }
        l1c l1cVar = this.w;
        if (l1cVar != null) {
            l1cVar.setImageTintList(ColorStateList.valueOf(z ? kbcVarH.getIcon().b : kbcVarH.getIcon().d));
        }
    }
}
