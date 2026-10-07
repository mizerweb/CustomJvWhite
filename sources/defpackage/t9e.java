package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
public final class t9e extends LinearLayout implements eph {
    public final kwb a;
    public final TextView b;

    public t9e(Context context) {
        super(context, null);
        kwb kwbVar = new kwb(context);
        kwbVar.setId(View.generateViewId());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 64.0f), gm0.K(64.0f * yl5.d().getDisplayMetrics().density));
        layoutParams.gravity = 17;
        layoutParams.setMargins(0, 0, 0, gm0.K(8.0f * yl5.d().getDisplayMetrics().density));
        kwbVar.setLayoutParams(layoutParams);
        kwbVar.setAvatarShape(awb.a);
        this.a = kwbVar;
        TextView textView = new TextView(context);
        textView.setId(View.generateViewId());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        setHorizontalGravity(17);
        textView.setLayoutParams(layoutParams2);
        textView.setMaxWidth(gm0.K(yl5.d().getDisplayMetrics().density * 82.0f));
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(17);
        q9i.k.b(textView, bx5.b);
        textView.setTextColor(pq3.j.h(textView).getText().b);
        this.b = textView;
        setOrientation(1);
        setLayoutParams(new ViewGroup.LayoutParams(gm0.K(82.0f * yl5.d().getDisplayMetrics().density), -2));
        addView(kwbVar);
        addView(textView);
    }

    public final kwb getAvatar() {
        return this.a;
    }

    public final TextView getName() {
        return this.b;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (soh.c(this.b)) {
            setVerified(true);
        }
        super.onMeasure(i, i2);
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        this.b.setTextColor(kbcVar.getText().b);
    }

    public final void setAbbreviation(tj0 tj0Var) {
        ghb ghbVar = kwb.r1;
        this.a.t(tj0Var, true);
    }

    public final void setAvatar(String str) {
        this.a.setAvatarUrl(str);
    }

    public final void setAvatarShape(dwb dwbVar) {
        this.a.setAvatarShape(dwbVar);
    }

    public final void setName(CharSequence charSequence) {
        this.b.setText(charSequence);
    }

    public final void setOnline(boolean z) {
        this.a.setOnlineBadgeVisibility(z);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0032  */
    public final void setVerified(boolean z) {
        osi osiVar;
        TextView textView = this.b;
        int iI0 = oc9.i0(soh.e(textView));
        if (z) {
            osi osiVarA = soh.a(textView);
            if ((osiVarA != null ? osiVarA.a : 0) == iI0) {
                return;
            }
        }
        if (z) {
            osi osiVarA2 = soh.a(textView);
            if ((osiVarA2 != null ? osiVarA2.a : 0) != iI0) {
                osiVar = new osi(getContext(), iI0, so2.l);
            } else {
                osiVar = null;
            }
        } else {
            osiVar = null;
        }
        soh.d(textView, osiVar);
    }
}
