package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes2.dex */
public final class h6e extends s7g implements eph {
    public final i6e u;
    public final GradientDrawable v;
    public final RippleDrawable w;
    public final RippleDrawable x;
    public final gn y;

    public h6e(Context context, i6e i6eVar) {
        ImageView imageView = new ImageView(context);
        super(imageView);
        this.u = i6eVar;
        a8g a8gVar = pq3.j;
        GradientDrawable gradientDrawableO = qyj.O(Integer.valueOf(a8gVar.h(imageView).b().e));
        this.v = gradientDrawableO;
        this.w = col.b(lvb.I0(a8gVar.h(imageView).getText().b, 0.3f), gradientDrawableO, qyj.O(-65536));
        this.x = col.c(lvb.I0(a8gVar.h(imageView).getText().b, 0.3f), null, null, 6);
        this.y = new gn(6, this);
        imageView.setLayoutParams(new wee(gm0.K(i6eVar.a() * yl5.d().getDisplayMetrics().density), gm0.K(i6eVar.a() * yl5.d().getDisplayMetrics().density)));
        imageView.setClipToOutline(false);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.addOnAttachStateChangeListener(new ga0(imageView, 11, this));
    }

    @Override // defpackage.s7g
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public final void B(g6e g6eVar) {
        int iK;
        View view = this.a;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        boolean z = g6eVar.d;
        if (z) {
            i6e i6eVar = this.u;
            iK = gm0.K(((i6eVar.a() - (hsl.c(i6eVar.a) >= 360 ? 22 : 20)) / 2) * yl5.d().getDisplayMetrics().density);
        } else {
            iK = 0;
        }
        view.setPadding(iK, iK, iK, iK);
        view.setBackground(z ? this.w : this.x);
        ((ImageView) view).setImageDrawable(g6eVar.c);
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        this.w.setColor(ColorStateList.valueOf(lvb.I0(kbcVar.getText().b, 0.3f)));
        this.v.setColor(kbcVar.b().e);
        this.x.setColor(ColorStateList.valueOf(lvb.I0(kbcVar.getText().b, 0.3f)));
    }
}
