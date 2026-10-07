package defpackage;

import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes2.dex */
public final class n4e extends FrameLayout implements eph {
    public static final /* synthetic */ zv8[] e;
    public final ny8 a;
    public final ColorMatrixColorFilter b;
    public final nt4 c;
    public final t5d d;

    static {
        z8b z8bVar = new z8b(n4e.class, "size", "getSize()Lone/me/calls/ui/bottomsheet/ratecall/view/RateCallButton$Size;");
        zfe.a.getClass();
        e = new zv8[]{z8bVar};
    }

    public n4e(Context context) {
        super(context, null);
        this.a = rx8.P(3, new bzb(context, 24));
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        this.b = new ColorMatrixColorFilter(colorMatrix);
        nt4 nt4Var = new nt4(gm0.K(32.0f * yl5.d().getDisplayMetrics().density));
        this.c = nt4Var;
        this.d = new t5d(this);
        setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        setClipToOutline(true);
        setOutlineProvider(nt4Var);
        setBackgroundColor(pq3.j.h(this).h().b);
        setClickable(true);
        addView(getImageView());
    }

    private final ImageView getImageView() {
        return (ImageView) this.a.getValue();
    }

    public final void a() {
        invalidate();
        requestLayout();
    }

    public final m4e getSize() {
        zv8 zv8Var = e[0];
        return (m4e) this.d.b;
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        setBackgroundColor(kbcVar.h().b);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        getImageView().setColorFilter(z ? null : this.b);
    }

    public final void setImage(Integer num) {
        if (num != null) {
            getImageView().setImageResource(num.intValue());
            a();
        }
    }

    public final void setSize(m4e m4eVar) {
        this.d.B(this, e[0], m4eVar);
    }
}
