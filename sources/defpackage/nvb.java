package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.FrameLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public final class nvb extends FrameLayout implements eph {
    public static final /* synthetic */ zv8[] c;
    public final zb a;
    public final TextView b;

    static {
        z8b z8bVar = new z8b(nvb.class, "appearance", "getAppearance()Lone/me/sdk/uikit/common/buttonold/OneMeActionButton$Appearance;");
        zfe.a.getClass();
        c = new zv8[]{z8bVar};
    }

    public nvb(Context context) {
        super(context, null);
        this.a = new zb(this);
        TextView textView = new TextView(context);
        textView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        q9i.a(q9i.q, textView);
        textView.setGravity(17);
        this.b = textView;
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        setMinimumHeight(gm0.K(yl5.d().getDisplayMetrics().density * 40.0f));
        setMinimumWidth(gm0.K(40.0f * yl5.d().getDisplayMetrics().density));
        setClipToOutline(true);
        setOutlineProvider(new nt4(yl5.d().getDisplayMetrics().density * 12.0f));
        setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 16.0f), gm0.K(yl5.d().getDisplayMetrics().density * 10.0f), gm0.K(16.0f * yl5.d().getDisplayMetrics().density), gm0.K(10.0f * yl5.d().getDisplayMetrics().density));
        addView(textView);
        onThemeChanged(pq3.j.h(this));
    }

    private final RippleDrawable getBackgroundDrawable() {
        return col.b(((bs0) pq3.j.h(this).u().c.g).c, null, new ColorDrawable(-1));
    }

    public final mvb getAppearance() {
        zv8 zv8Var = c[0];
        return (mvb) this.a.b;
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        int i;
        int iOrdinal = getAppearance().ordinal();
        if (iOrdinal == 0) {
            i = isEnabled() ? kbcVar.getText().h : ((fn8) kbcVar.u().d.h).d;
        } else {
            if (iOrdinal != 1) {
                ore.o();
                return;
            }
            i = isEnabled() ? kbcVar.getText().j : ((fn8) kbcVar.u().d.i).d;
        }
        this.b.setTextColor(i);
        setBackground(getBackgroundDrawable());
        invalidate();
    }

    public final void setAppearance(mvb mvbVar) {
        this.a.B(this, c[0], mvbVar);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        onThemeChanged(pq3.j.h(this));
    }

    public final void setText(int i) {
        this.b.setText(i);
    }
}
