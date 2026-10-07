package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class d5c extends LinearLayout implements eph {
    public c5c a;
    public nvb b;
    public final ImageView c;

    public d5c(Context context) {
        super(context);
        this.a = b5c.a;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        setPadding(gm0.K(44.0f * yl5.d().getDisplayMetrics().density), gm0.K(yl5.d().getDisplayMetrics().density * 8.0f), 0, gm0.K(8.0f * yl5.d().getDisplayMetrics().density));
        layoutParams.weight = 1.0f;
        setLayoutParams(layoutParams);
        setGravity(16);
        setOrientation(0);
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(new ViewGroup.MarginLayoutParams(bc1.g(12.0f, yl5.d().getDisplayMetrics().density, 2, gm0.K(yl5.d().getDisplayMetrics().density * 20.0f)), bc1.g(12.0f, yl5.d().getDisplayMetrics().density, 2, gm0.K(20.0f * yl5.d().getDisplayMetrics().density))));
        int iK = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        imageView.setPadding(iK, iK, iK, iK);
        imageView.setImageResource(R.drawable.icon_cross_round);
        this.c = imageView;
        onThemeChanged(pq3.j.h(this));
    }

    public final c5c getAppearance() {
        return this.a;
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        this.c.setImageTintList(ColorStateList.valueOf(kbcVar.getIcon().d));
        nvb nvbVar = this.b;
        if (nvbVar != null) {
            nvbVar.onThemeChanged(kbcVar);
        }
    }

    public final void setAppearance(c5c c5cVar) {
        if (cqk.d(this.a, c5cVar)) {
            return;
        }
        this.a = c5cVar;
        removeAllViews();
        if (c5cVar instanceof a5c) {
            nvb nvbVar = this.b;
            if (nvbVar == null) {
                nvbVar = new nvb(getContext());
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.weight = 1.0f;
                nvbVar.setLayoutParams(layoutParams);
                nvbVar.setAppearance(mvb.b);
                nvbVar.setText(R.string.report_and_leave);
                this.b = nvbVar;
            }
            this.b = nvbVar;
            addView(nvbVar);
        } else {
            if (!c5cVar.equals(b5c.a)) {
                ore.o();
                return;
            }
            gm0.Y(d5c.class.getName(), "Undefined appearance");
        }
        addView(this.c);
        setPadding(gm0.K(44.0f * yl5.d().getDisplayMetrics().density), gm0.K(yl5.d().getDisplayMetrics().density * 8.0f), 0, gm0.K(8.0f * yl5.d().getDisplayMetrics().density));
    }

    public final void setOnAcceptButtonClickListener(View.OnClickListener onClickListener) {
    }

    public final void setOnCloseButtonClickListener(View.OnClickListener onClickListener) {
        qe7.H(this.c, 300L, onClickListener);
    }

    public final void setOnDeclineButtonClickListener(View.OnClickListener onClickListener) {
        nvb nvbVar = this.b;
        if (nvbVar != null) {
            qe7.H(nvbVar, 300L, onClickListener);
        }
    }
}
