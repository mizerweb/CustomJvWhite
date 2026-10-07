package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.method.PasswordTransformationMethod;
import android.text.method.SingleLineTransformationMethod;
import android.widget.EditText;
import android.widget.TextView;

/* JADX INFO: loaded from: classes3.dex */
public final class bc4 extends EditText implements eph {
    public static final lge b = new lge("[0-9]*");
    public static final ac4 c = new ac4(0);
    public boolean a;

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z || !this.a) {
            return;
        }
        postInvalidateDelayed(1500L);
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        setBackground(new ColorDrawable(pq3.j.h(this).b().e));
        Drawable drawableR = np4.r(this);
        GradientDrawable gradientDrawable = drawableR instanceof GradientDrawable ? (GradientDrawable) drawableR : null;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(ColorStateList.valueOf(kbcVar.getText().h));
        }
        setTextColor(kbcVar.getText().b);
    }

    public final void setSecure(boolean z) {
        this.a = z;
        if (!z) {
            removeTextChangedListener(PasswordTransformationMethod.getInstance());
            setTransformationMethod(SingleLineTransformationMethod.getInstance());
            setInputType(2);
        } else {
            setTransformationMethod(PasswordTransformationMethod.getInstance());
            setInputType(524306);
            removeTextChangedListener(PasswordTransformationMethod.getInstance());
            addTextChangedListener(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        setSecure(this.a);
        super.setText(charSequence, bufferType);
    }
}
