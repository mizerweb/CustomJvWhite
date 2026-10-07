package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes2.dex */
public final class j5f extends FrameLayout implements eph {
    public final ImageView a;
    public final v0c b;

    public j5f(Context context) {
        super(context);
        ImageView imageView = new ImageView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 44.0f), gm0.K(44.0f * yl5.d().getDisplayMetrics().density));
        layoutParams.gravity = 83;
        imageView.setLayoutParams(layoutParams);
        x05.j(12.0f, yl5.d().getDisplayMetrics().density, imageView);
        imageView.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        imageView.setBackground(gradientDrawable);
        this.a = imageView;
        v0c v0cVar = new v0c(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 53;
        v0cVar.setVisibility(8);
        v0cVar.setLayoutParams(layoutParams2);
        this.b = v0cVar;
        setLayoutParams(new FrameLayout.LayoutParams(-2, gm0.K(46.0f * yl5.d().getDisplayMetrics().density)));
        addView(imageView);
        addView(v0cVar);
        onThemeChanged(pq3.j.h(this));
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        ImageView imageView = this.a;
        Drawable background = imageView.getBackground();
        GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        if (gradientDrawable != null) {
            gradientDrawable.setStroke(2, kbcVar.B().c);
        }
        Drawable background2 = imageView.getBackground();
        GradientDrawable gradientDrawable2 = background2 instanceof GradientDrawable ? (GradientDrawable) background2 : null;
        if (gradientDrawable2 != null) {
            gradientDrawable2.setColor(pq3.j.h(this).k().h);
        }
        imageView.setImageTintList(ColorStateList.valueOf(kbcVar.getIcon().b));
        this.b.onThemeChanged(kbcVar);
    }

    public final void setCounter$message_list(int i) {
        int i2 = i > 0 ? 0 : 8;
        v0c v0cVar = this.b;
        v0cVar.setVisibility(i2);
        pu4.c(v0cVar, Integer.valueOf(i), false, 6);
    }

    public final void setImageDrawable$message_list(Drawable drawable) {
        this.a.setImageDrawable(drawable);
    }
}
