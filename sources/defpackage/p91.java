package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: loaded from: classes2.dex */
public final class p91 extends wf4 implements eph {
    public final cs s;
    public final AppCompatTextView t;

    public p91(Context context) {
        super(context, null);
        setBackground(getBackgroundDrawable());
        cs csVar = new cs(context);
        csVar.setId(View.generateViewId());
        csVar.setImageTintList(getIconColor());
        csVar.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.s = csVar;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setId(View.generateViewId());
        q9i.a(q9i.f, appCompatTextView);
        appCompatTextView.setMaxLines(1);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        appCompatTextView.setTextColor(getTextColor());
        this.t = appCompatTextView;
        addView(csVar, gm0.K(yl5.d().getDisplayMetrics().density * 24.0f), gm0.K(24.0f * yl5.d().getDisplayMetrics().density));
        addView(appCompatTextView, gm0.K(0.0f * yl5.d().getDisplayMetrics().density), -2);
        eg4 eg4VarH = ch3.h(this);
        int id = csVar.getId();
        eg4VarH.d(id, 3, appCompatTextView.getId(), 3);
        eg4VarH.d(id, 6, 0, 6);
        eg4VarH.d(id, 4, appCompatTextView.getId(), 4);
        int id2 = appCompatTextView.getId();
        eg4VarH.d(id2, 3, 0, 3);
        eg4VarH.d(id2, 6, csVar.getId(), 7);
        qt4.w(16.0f, yl5.d().getDisplayMetrics().density, new bsb(6, eg4VarH, id2));
        eg4VarH.d(id2, 7, 0, 7);
        eg4VarH.d(id2, 4, 0, 4);
        eg4VarH.g(id2).d.l0 = true;
        eg4VarH.a(this);
    }

    private final RippleDrawable getBackgroundDrawable() {
        return col.b(((bs0) pq3.j.h(this).u().c.g).c, null, new ColorDrawable(-1));
    }

    private final ColorStateList getIconColor() {
        return ColorStateList.valueOf(pq3.j.h(this).getIcon().h);
    }

    private final int getTextColor() {
        return pq3.j.h(this).getText().h;
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        this.s.setImageTintList(getIconColor());
        this.t.setTextColor(getTextColor());
        setBackground(getBackgroundDrawable());
    }

    public final void setActionIcon(int i) {
        this.s.setImageResource(i);
    }

    public final void setActionText(int i) {
        this.t.setText(i);
    }
}
