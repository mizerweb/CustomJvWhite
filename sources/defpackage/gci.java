package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class gci extends LinearLayout {
    public final nvb a;
    public final nvb b;
    public final ny8 c;

    public gci(Context context) {
        super(context);
        nvb nvbVar = new nvb(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 8.0f), gm0.K(16.0f * yl5.d().getDisplayMetrics().density), gm0.K(yl5.d().getDisplayMetrics().density * 8.0f));
        layoutParams.weight = 1.0f;
        nvbVar.setLayoutParams(layoutParams);
        nvbVar.setAppearance(mvb.a);
        nvbVar.setText(R.string.unknown_contact_add_to_contact);
        this.a = nvbVar;
        nvb nvbVar2 = new nvb(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(0, gm0.K(yl5.d().getDisplayMetrics().density * 8.0f), gm0.K(12.0f * yl5.d().getDisplayMetrics().density), gm0.K(8.0f * yl5.d().getDisplayMetrics().density));
        layoutParams2.weight = 1.0f;
        nvbVar2.setLayoutParams(layoutParams2);
        nvbVar2.setAppearance(mvb.b);
        nvbVar2.setText(R.string.unknown_contact_block_contact);
        this.b = nvbVar2;
        this.c = rx8.P(3, new j0i(context, 5, this));
        setOrientation(0);
        addView(nvbVar);
        addView(nvbVar2);
    }

    public final void setCloseButton(View.OnClickListener onClickListener) {
        nvb nvbVar = this.b;
        ny8 ny8Var = this.c;
        if (onClickListener == null) {
            ViewGroup.LayoutParams layoutParams = nvbVar.getLayoutParams();
            if (layoutParams == null) {
                ore.n("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                return;
            }
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.setMargins(((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin, ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin, gm0.K(12.0f * yl5.d().getDisplayMetrics().density), ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin);
            nvbVar.setLayoutParams(layoutParams2);
            if (ny8Var.d()) {
                ((ImageView) ny8Var.getValue()).setVisibility(8);
                return;
            }
            return;
        }
        if (!ny8Var.d()) {
            addView((View) ny8Var.getValue());
        }
        ImageView imageView = (ImageView) ny8Var.getValue();
        imageView.setVisibility(0);
        qe7.H(imageView, 300L, onClickListener);
        ViewGroup.LayoutParams layoutParams3 = nvbVar.getLayoutParams();
        if (layoutParams3 == null) {
            ore.n("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            return;
        }
        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
        layoutParams4.setMargins(((ViewGroup.MarginLayoutParams) layoutParams4).leftMargin, ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin, 0, ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin);
        nvbVar.setLayoutParams(layoutParams4);
    }

    public final void setOnAddContactClickListener(View.OnClickListener onClickListener) {
        qe7.H(this.a, 300L, onClickListener);
    }

    public final void setOnBlockContactClickListener(View.OnClickListener onClickListener) {
        qe7.H(this.b, 300L, onClickListener);
    }
}
