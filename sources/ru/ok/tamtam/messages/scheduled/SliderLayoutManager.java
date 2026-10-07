package ru.ok.tamtam.messages.scheduled;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.cfe;
import defpackage.cqk;
import defpackage.gj8;
import defpackage.hfe;
import defpackage.kt7;
import defpackage.oc9;
import defpackage.p0m;
import defpackage.pag;
import defpackage.r35;
import java.util.Iterator;
import kotlin.Metadata;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ok/tamtam/messages/scheduled/SliderLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "pag", "scheduled-send-picker-dialog"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SliderLayoutManager extends LinearLayoutManager {
    public final pag E;
    public RecyclerView F;
    public final float G;
    public final float H;
    public final float I;
    public final float J;
    public CharSequence K;
    public final r35 L;

    public SliderLayoutManager(Context context, pag pagVar) {
        this.E = pagVar;
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(R.dimen.picker_scale_factor, typedValue, true);
        this.G = typedValue.getFloat();
        TypedValue typedValue2 = new TypedValue();
        context.getResources().getValue(R.dimen.picker_min_scale_factor, typedValue2, true);
        this.H = typedValue2.getFloat();
        TypedValue typedValue3 = new TypedValue();
        context.getResources().getValue(R.dimen.picker_alpha_factor, typedValue3, true);
        this.I = typedValue3.getFloat();
        TypedValue typedValue4 = new TypedValue();
        context.getResources().getValue(R.dimen.picker_min_alpha_factor, typedValue4, true);
        this.J = typedValue4.getFloat();
        this.L = new r35(ViewConfiguration.get(context).getScaledMaximumFlingVelocity());
        q1(1);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.vee
    public final int A0(int i, cfe cfeVar, hfe hfeVar) {
        if (this.p != 1) {
            return 0;
        }
        int iA0 = super.A0(i, cfeVar, hfeVar);
        if (iA0 != 0) {
            v1();
        }
        return iA0;
    }

    @Override // defpackage.vee
    public final void X(RecyclerView recyclerView) {
        this.F = recyclerView;
        this.L.b(recyclerView);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, defpackage.vee
    public final void k0(cfe cfeVar, hfe hfeVar) {
        super.k0(cfeVar, hfeVar);
        v1();
    }

    public final void v1() {
        int i = this.o / 2;
        Iterator it = oc9.f0(0, w()).iterator();
        while (true) {
            gj8 gj8Var = (gj8) it;
            if (!gj8Var.c) {
                return;
            }
            View viewV = v(gj8Var.nextInt());
            AppCompatTextView appCompatTextView = viewV instanceof AppCompatTextView ? (AppCompatTextView) viewV : null;
            if (appCompatTextView != null) {
                float fAbs = Math.abs(((appCompatTextView.getHeight() / 2.0f) + appCompatTextView.getY()) - i);
                float fMax = Math.max(1, appCompatTextView.getHeight());
                boolean z = fAbs <= fMax / 2.0f;
                if (z && !cqk.d(this.K, appCompatTextView.getText())) {
                    p0m.a(appCompatTextView, kt7.CLOCK_TICK);
                    this.K = appCompatTextView.getText();
                }
                float fMin = Math.min(1.0f, (((this.G - 1.0f) * fAbs) / fMax) + 1.0f);
                float f = this.H;
                if (fMin < f) {
                    fMin = f;
                }
                appCompatTextView.setScaleX(fMin);
                appCompatTextView.setScaleY(fMin);
                appCompatTextView.setAlpha(Math.min(1.0f, Math.max(this.J, 1.0f - (((1.0f - this.I) * fAbs) / fMax))));
                if (z && this.F != null) {
                    int iR = RecyclerView.R(appCompatTextView);
                    pag pagVar = this.E;
                    if (pagVar != null) {
                        pagVar.a(iR);
                    }
                }
            }
        }
    }
}
