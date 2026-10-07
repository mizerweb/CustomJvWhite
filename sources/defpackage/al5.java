package defpackage;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
public final class al5 extends tq0 {
    public static final /* synthetic */ int e = 0;
    public af7 a;
    public final TextView b;
    public final ny8 c;
    public final ny8 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public al5(final Context context) {
        super(context, 0, 0, 24);
        final int i = 0;
        this.a = new s35(7);
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        final int i2 = 1;
        layoutParams.gravity = 1;
        textView.setPadding(0, gm0.K(yl5.d().getDisplayMetrics().density * 8.0f), 0, gm0.K(8.0f * yl5.d().getDisplayMetrics().density));
        textView.setLayoutParams(layoutParams);
        textView.setTextAlignment(4);
        textView.setTextColor(getTitleColor());
        q9i.a(q9i.f, textView);
        this.b = textView;
        this.c = rx8.P(3, new af7() { // from class: zk5
            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i;
                al5 al5Var = this;
                Context context2 = context;
                switch (i3) {
                    case 0:
                        return al5.a(context2, al5Var);
                    default:
                        fj9 fj9Var = new fj9(context2);
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                        layoutParams2.gravity = 1;
                        fj9Var.setPadding(0, gm0.K(yl5.d().getDisplayMetrics().density * 8.0f), 0, gm0.K(8.0f * yl5.d().getDisplayMetrics().density));
                        fj9Var.setLayoutParams(layoutParams2);
                        fj9Var.setTextAlignment(4);
                        qe7.H(fj9Var, 300L, new t8(26, al5Var));
                        yab.e(al5Var, fj9Var, -1);
                        return fj9Var;
                }
            }
        });
        this.d = rx8.P(3, new af7() { // from class: zk5
            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                al5 al5Var = this;
                Context context2 = context;
                switch (i3) {
                    case 0:
                        return al5.a(context2, al5Var);
                    default:
                        fj9 fj9Var = new fj9(context2);
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                        layoutParams2.gravity = 1;
                        fj9Var.setPadding(0, gm0.K(yl5.d().getDisplayMetrics().density * 8.0f), 0, gm0.K(8.0f * yl5.d().getDisplayMetrics().density));
                        fj9Var.setLayoutParams(layoutParams2);
                        fj9Var.setTextAlignment(4);
                        qe7.H(fj9Var, 300L, new t8(26, al5Var));
                        yab.e(al5Var, fj9Var, -1);
                        return fj9Var;
                }
            }
        });
        addView(textView, 0);
    }

    public static TextView a(Context context, al5 al5Var) {
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        textView.setLayoutParams(layoutParams);
        textView.setGravity(1);
        textView.setTextAlignment(4);
        textView.setTextColor(al5Var.getSubtitleColor());
        q9i.a(q9i.i, textView);
        yab.e(al5Var, textView, 1);
        return textView;
    }

    private final fj9 getStickerView() {
        return (fj9) this.d.getValue();
    }

    private final TextView getSubtitle() {
        return (TextView) this.c.getValue();
    }

    private final int getSubtitleColor() {
        return pq3.j.h(this).getText().d;
    }

    private final int getTitleColor() {
        return pq3.j.h(this).getText().b;
    }

    public final void b(e76 e76Var, cta ctaVar) {
        CharSequence charSequenceD = e76Var.a.d(this);
        TextView textView = this.b;
        textView.setText(charSequenceD);
        getSubtitle().setText(e76Var.b.d(this));
        ny8 ny8Var = this.c;
        if (ny8Var.d()) {
            ((TextView) ny8Var.getValue()).setVisibility(0);
        }
        tlg tlgVar = e76Var.c;
        if (tlgVar != null) {
            getStickerView().a(tlgVar, gm0.K(144.0f * yl5.d().getDisplayMetrics().density));
            this.a = ctaVar;
        }
        textView.setGravity(0);
        onThemeChanged(pq3.j.e(getContext()).m());
    }

    @Override // defpackage.tq0, defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        super.onThemeChanged(kbcVar);
        this.b.setTextColor(getTitleColor());
        ny8 ny8Var = this.c;
        if (ny8Var.d()) {
            ((TextView) ny8Var.getValue()).setTextColor(getSubtitleColor());
        }
    }
}
