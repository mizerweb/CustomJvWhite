package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.Shape;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class p5d extends FrameLayout implements oqe, eph {
    public final ShapeDrawable a;
    public final RippleDrawable b;
    public final ImageView c;
    public final TextView d;

    public p5d(Context context) {
        super(context, null);
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        this.a = shapeDrawable;
        a8g a8gVar = pq3.j;
        RippleDrawable rippleDrawableB = col.b(((bs0) a8gVar.h(this).u().c.g).c, null, shapeDrawable);
        this.b = rippleDrawableB;
        ImageView imageView = new ImageView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 24.0f), gm0.K(yl5.d().getDisplayMetrics().density * 24.0f), 8388627);
        layoutParams.leftMargin = gm0.K(yl5.d().getDisplayMetrics().density * 16.0f);
        layoutParams.rightMargin = gm0.K(yl5.d().getDisplayMetrics().density * 16.0f);
        layoutParams.topMargin = gm0.K(yl5.d().getDisplayMetrics().density * 12.0f);
        layoutParams.bottomMargin = gm0.K(yl5.d().getDisplayMetrics().density * 12.0f);
        imageView.setLayoutParams(layoutParams);
        imageView.setImageResource(R.drawable.icon_plus);
        x05.j(2.0f, yl5.d().getDisplayMetrics().density, imageView);
        this.c = imageView;
        TextView textView = new TextView(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2, 8388627);
        layoutParams2.leftMargin = zo5.b(24.0f, yl5.d().getDisplayMetrics().density, c0a.d(16.0f, yl5.d().getDisplayMetrics().density, 2));
        layoutParams2.rightMargin = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
        textView.setLayoutParams(layoutParams2);
        q9i.a(q9i.f, textView);
        textView.setText(R.string.oneme_poll_create__add_answer_button_title);
        this.d = textView;
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        setClipChildren(false);
        setBackground(rippleDrawableB);
        addView(imageView);
        addView(textView);
        onThemeChanged(a8gVar.h(this));
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        a8g a8gVar = pq3.j;
        this.c.setImageTintList(ColorStateList.valueOf(a8gVar.h(this).getIcon().h));
        this.d.setTextColor(a8gVar.h(this).getText().h);
        this.b.setColor(ColorStateList.valueOf(((bs0) kbcVar.u().c.g).c));
    }

    @Override // defpackage.oqe
    public void setRippleMask(Shape shape) {
        this.a.setShape(shape);
    }
}
