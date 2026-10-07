package defpackage;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class a7h extends nee {
    public final v6h d;
    public final rea e;
    public RecyclerView f;
    public Long g;
    public List h = r66.a;
    public boolean i = true;

    public a7h(v6h v6hVar, rea reaVar) {
        this.d = v6hVar;
        this.e = reaVar;
        D(true);
    }

    @Override // defpackage.nee
    public final void B(lfe lfeVar) {
        z6h z6hVar = (z6h) lfeVar;
        z6hVar.x = null;
        y6h y6hVar = z6hVar.u;
        ValueAnimator valueAnimator = y6hVar.j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        y6hVar.j = null;
        y6hVar.g = null;
        y6hVar.b();
        y6hVar.animate().cancel();
        y6hVar.setScaleX(1.0f);
        y6hVar.setScaleY(1.0f);
        y6hVar.setOnClickListener(null);
    }

    public final void F(Long l, boolean z) {
        x6h x6hVar;
        if (cqk.d(this.g, l)) {
            return;
        }
        this.g = l;
        RecyclerView recyclerView = this.f;
        if (recyclerView != null) {
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                lfe lfeVarS = recyclerView.S(recyclerView.getChildAt(i));
                z6h z6hVar = lfeVarS instanceof z6h ? (z6h) lfeVarS : null;
                if (z6hVar != null && (x6hVar = z6hVar.x) != null) {
                    y6h y6hVar = z6hVar.u;
                    boolean zBooleanValue = ((Boolean) z6hVar.w.invoke(Long.valueOf(x6hVar.a))).booleanValue();
                    if (y6hVar.isSelected() != zBooleanValue) {
                        y6hVar.setSelected(zBooleanValue);
                        ValueAnimator valueAnimator = y6hVar.j;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        float f = zBooleanValue ? 1.0f : 0.0f;
                        if (z) {
                            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(y6hVar.i, f);
                            valueAnimatorOfFloat.setDuration(180L);
                            valueAnimatorOfFloat.setInterpolator(c7h.q2);
                            valueAnimatorOfFloat.addUpdateListener(new xcf(5, y6hVar));
                            valueAnimatorOfFloat.start();
                            y6hVar.j = valueAnimatorOfFloat;
                        } else {
                            y6hVar.i = f;
                            y6hVar.invalidate();
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.nee
    public final int l() {
        if (!this.i || this.h.size() <= 1) {
            return this.h.size();
        }
        return Integer.MAX_VALUE;
    }

    @Override // defpackage.nee
    public final long m(int i) {
        return i;
    }

    @Override // defpackage.nee
    public final int n(int i) {
        return 0;
    }

    @Override // defpackage.nee
    public final void t(RecyclerView recyclerView) {
        this.f = recyclerView;
    }

    @Override // defpackage.nee
    public final void u(lfe lfeVar, int i) {
        z6h z6hVar = (z6h) lfeVar;
        List list = this.h;
        x6h x6hVar = (x6h) list.get(i % list.size());
        z6hVar.x = x6hVar;
        y6h y6hVar = z6hVar.u;
        boolean zBooleanValue = ((Boolean) z6hVar.w.invoke(Long.valueOf(x6hVar.a))).booleanValue();
        ValueAnimator valueAnimator = y6hVar.j;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        y6hVar.g = x6hVar;
        y6hVar.setSelected(zBooleanValue);
        y6hVar.i = zBooleanValue ? 1.0f : 0.0f;
        y6hVar.c(x6hVar);
        y6hVar.b();
        y6hVar.invalidate();
        y6hVar.setOnClickListener(new jvf(z6hVar, 12, x6hVar));
    }

    @Override // defpackage.nee
    public final lfe w(ViewGroup viewGroup, int i) {
        y6h y6hVar = new y6h(viewGroup.getContext(), this.d);
        y6hVar.setLayoutParams(new wee(gm0.K(yl5.d().getDisplayMetrics().density * 48.0f), gm0.K(48.0f * yl5.d().getDisplayMetrics().density)));
        return new z6h(y6hVar, this.e, new ptf(16, this));
    }

    @Override // defpackage.nee
    public final void x(RecyclerView recyclerView) {
        this.f = null;
    }
}
