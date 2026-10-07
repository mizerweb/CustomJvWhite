package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class y62 extends LinearLayout {
    public final ny8 a;
    public final TextView b;

    public y62(Context context) {
        super(context, null);
        this.a = rx8.P(3, new z2(context, 27, this));
        o7j.f(yl5.d().getDisplayMetrics().density * 20.0f, this);
        setOrientation(1);
        setBackground(getAnimatedBackground());
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(new LinearLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 48.0f), gm0.K(48.0f * yl5.d().getDisplayMetrics().density)));
        setGravity(17);
        a8g a8gVar = pq3.j;
        a8gVar.l(imageView);
        imageView.setImageTintList(ColorStateList.valueOf(-1));
        imageView.setImageResource(R.drawable.ic_user_waiting_room_48);
        TextView textView = new TextView(context);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        textView.setGravity(17);
        q9i.a(q9i.c, textView);
        a8gVar.l(textView);
        textView.setTextColor(-1);
        int iK = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        textView.setPadding(iK, iK, iK, iK);
        this.b = textView;
        addView(imageView);
        addView(textView);
    }

    private final b1g getAnimatedBackground() {
        return (b1g) this.a.getValue();
    }

    @Override // android.view.View
    public b1g getBackground() {
        Drawable background = super.getBackground();
        if (background instanceof b1g) {
            return (b1g) background;
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b1g background = getBackground();
        if (background != null) {
            background.onThemeChanged(pq3.j.l(this).b);
        }
        b1g background2 = getBackground();
        if (background2 != null) {
            background2.start();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b1g background = getBackground();
        if (background != null) {
            background.stop();
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        b1g background;
        super.onLayout(z, i, i2, i3, i4);
        if (z && (background = getBackground()) != null) {
            int i5 = (i3 - i) / 2;
            background.f = i5;
            if (background.getBounds().isEmpty()) {
                return;
            }
            background.a(i5, background.getBounds());
        }
    }

    public final void setTitle(int i) {
        this.b.setText(i);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable)) {
            return true;
        }
        b1g background = getBackground();
        if (background != null) {
            if (drawable == background) {
                return true;
            }
            int numberOfLayers = background.getNumberOfLayers();
            for (int i = 0; i < numberOfLayers; i++) {
                if (background.getDrawable(i) == drawable) {
                    return true;
                }
            }
        }
        return false;
    }
}
