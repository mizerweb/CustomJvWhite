package defpackage;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class hn extends ViewGroup {
    public final ImageView a;
    public final TextView b;
    public final gn c;

    public hn(Context context) {
        super(context);
        ImageView imageViewD = qv1.d(context, R.id.oneme_messages_settings_reaction_image);
        imageViewD.setLayoutParams(new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 24.0f), gm0.K(24.0f * yl5.d().getDisplayMetrics().density)));
        this.a = imageViewD;
        TextView textViewE = qv1.e(context, R.id.oneme_messages_settings_reaction_title);
        textViewE.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        q9i.a(q9i.f, textViewE);
        textViewE.setPadding(0, 0, 0, 0);
        textViewE.setMaxLines(2);
        textViewE.setEllipsize(TextUtils.TruncateAt.END);
        int i = 3;
        n1g.N(new f7(i, null, 2), textViewE);
        this.b = textViewE;
        this.c = new gn(0, this);
        setOutlineProvider(new fn(0));
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        addView(textViewE);
        addView(imageViewD);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        String name = hn.class.getName();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, "onAttachedToWindow", null);
            }
        }
        osk.c(this.a, this.c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        osk.e(this.a, this.c);
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iK = gm0.K(yl5.d().getDisplayMetrics().density * 12.0f);
        int measuredHeight = getMeasuredHeight() / 2;
        TextView textView = this.b;
        qyj.M(textView, iK, measuredHeight - (textView.getMeasuredHeight() / 2), 0, 12);
        int iD = zo5.D(12.0f, yl5.d().getDisplayMetrics().density, getWidth());
        ImageView imageView = this.a;
        qyj.M(imageView, iD - imageView.getMeasuredWidth(), (getMeasuredHeight() / 2) - (imageView.getMeasuredHeight() / 2), 0, 12);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int iA = qv1.a(24.0f, yl5.d().getDisplayMetrics().density, 1073741824);
        ImageView imageView = this.a;
        imageView.measure(iA, iA);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(r5a.f(12.0f, yl5.d().getDisplayMetrics().density, 2, zo5.D(4.0f, yl5.d().getDisplayMetrics().density, size - imageView.getMeasuredWidth())), Integer.MIN_VALUE);
        TextView textView = this.b;
        measureChild(textView, iMakeMeasureSpec, i2);
        setMeasuredDimension(size, bc1.g(4.0f, yl5.d().getDisplayMetrics().density, 2, Math.max(gm0.K(48.0f * yl5.d().getDisplayMetrics().density), textView.getMeasuredHeight())));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setReaction(Drawable drawable) {
        ImageView imageView = this.a;
        imageView.setImageDrawable(drawable);
        if (drawable != 0) {
            if (drawable instanceof qn) {
                osk.c(imageView, this.c);
            } else if (drawable instanceof Animatable) {
                ((Animatable) drawable).start();
            }
        }
        invalidate();
    }

    public final void setText(CharSequence charSequence) {
        this.b.setText(charSequence);
        requestLayout();
        invalidate();
    }
}
