package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class oj extends FrameLayout {
    public cyb a;
    public cyb b;
    public boolean c;
    public ValueAnimator d;
    public ifg e;

    public oj(Context context) {
        super(context);
        setClipToOutline(true);
    }

    public static final void a(final oj ojVar, final cyb cybVar) {
        ifg ifgVar = new ifg((Object) cybVar.getTextView(), (lvb) ifg.q, 0.0f);
        jfg jfgVar = new jfg(0.0f);
        jfgVar.b(200.0f);
        jfgVar.a(0.5f);
        ifgVar.m = jfgVar;
        ifgVar.a = 500.0f;
        yw5 yw5Var = new yw5() { // from class: nj
            @Override // defpackage.yw5
            public final void a(float f, boolean z) {
                oj ojVar2 = this.a;
                ojVar2.e = null;
                cybVar.setClickable(true);
                ojVar2.c = false;
            }
        };
        ArrayList arrayList = ifgVar.k;
        if (!arrayList.contains(yw5Var)) {
            arrayList.add(yw5Var);
        }
        ifgVar.g();
        ojVar.e = ifgVar;
    }

    private final void setupViewsPosition(boolean z) {
        cyb cybVar = this.a;
        if (z) {
            if (cybVar != null) {
                cybVar.setTranslationY(0.0f);
            }
            cyb cybVar2 = this.b;
            if (cybVar2 != null) {
                cybVar2.setTranslationY(getMeasuredHeight());
                return;
            }
            return;
        }
        if (cybVar != null) {
            cybVar.setTranslationY(-getMeasuredHeight());
        }
        cyb cybVar3 = this.b;
        if (cybVar3 != null) {
            cybVar3.setTranslationY(0.0f);
        }
    }

    public final void b() {
        ValueAnimator valueAnimator = this.d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.d = null;
        ifg ifgVar = this.e;
        if (ifgVar != null) {
            ifgVar.b();
        }
        this.e = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        measureChildren(i, i2);
        cyb cybVar = this.b;
        int measuredHeight = cybVar != null ? cybVar.getMeasuredHeight() : 0;
        cyb cybVar2 = this.a;
        super.onMeasure(i, Math.max(measuredHeight, cybVar2 != null ? cybVar2.getMeasuredHeight() : 0));
        cyb cybVar3 = this.a;
        if (cybVar3 != null) {
            cybVar3.setVisibility(0);
        }
        cyb cybVar4 = this.b;
        if (cybVar4 != null) {
            cybVar4.setVisibility(0);
        }
        setupViewsPosition(isEnabled());
    }

    public final void setActiveButtonClickListener(af7 af7Var) {
        cyb cybVar = this.a;
        if (cybVar != null) {
            qe7.H(cybVar, 300L, new d8(1, af7Var));
        }
    }

    public final void setActiveButtonLoaderState(boolean z) {
        cyb cybVar = this.a;
        if (cybVar != null) {
            cybVar.setLoading(z);
            cybVar.setClickable(!z);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        cyb cybVar;
        ifg ifgVar;
        if (isEnabled() == z) {
            return;
        }
        if (z && this.c) {
            cyb cybVar2 = this.a;
            if (cybVar2 != null && (cybVar = this.b) != null) {
                ValueAnimator valueAnimator = this.d;
                int i = 1;
                if ((valueAnimator != null && valueAnimator.isRunning()) || ((ifgVar = this.e) != null && ifgVar.f)) {
                    b();
                }
                float height = getHeight();
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, height);
                valueAnimatorOfFloat.setDuration(200L);
                valueAnimatorOfFloat.addUpdateListener(new mj(cybVar, cybVar2, height, 0));
                valueAnimatorOfFloat.addListener(new li(2, cybVar2));
                valueAnimatorOfFloat.addListener(new d7(this, i, cybVar2));
                valueAnimatorOfFloat.start();
                this.d = valueAnimatorOfFloat;
            }
        } else {
            b();
            setupViewsPosition(z);
        }
        super.setEnabled(z);
    }

    public final void setupActiveButton(cf7 cf7Var) {
        cyb cybVar = new cyb(getContext());
        cf7Var.invoke(cybVar);
        cybVar.setOutlineProvider(null);
        cybVar.setVisibility(cybVar.isEnabled() ? 0 : 8);
        this.a = cybVar;
        addView(cybVar);
    }

    public final void setupDisabledButton(cf7 cf7Var) {
        cyb cybVar = new cyb(getContext());
        cf7Var.invoke(cybVar);
        setOutlineProvider(cybVar.getOutlineProvider());
        cybVar.setOutlineProvider(null);
        cybVar.setVisibility(!cybVar.isEnabled() ? 0 : 8);
        this.b = cybVar;
        addView(cybVar);
    }
}
