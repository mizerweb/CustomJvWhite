package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public class fs extends RadioButton implements lth {
    public final gr a;
    public final ma b;
    public final bt c;
    public as d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fs(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.radioButtonStyle);
        jth.a(context);
        dqh.a(this, getContext());
        gr grVar = new gr(this);
        this.a = grVar;
        grVar.c(attributeSet, R.attr.radioButtonStyle);
        ma maVar = new ma(this);
        this.b = maVar;
        maVar.t(attributeSet, R.attr.radioButtonStyle);
        bt btVar = new bt(this);
        this.c = btVar;
        btVar.f(attributeSet, R.attr.radioButtonStyle);
        getEmojiTextViewHelper().b(attributeSet, R.attr.radioButtonStyle);
    }

    private as getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new as(this);
        }
        return this.d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        ma maVar = this.b;
        if (maVar != null) {
            maVar.i();
        }
        bt btVar = this.c;
        if (btVar != null) {
            btVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        ma maVar = this.b;
        if (maVar != null) {
            return maVar.p();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        ma maVar = this.b;
        if (maVar != null) {
            return maVar.q();
        }
        return null;
    }

    @Override // defpackage.lth
    public ColorStateList getSupportButtonTintList() {
        gr grVar = this.a;
        if (grVar != null) {
            return grVar.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        gr grVar = this.a;
        if (grVar != null) {
            return grVar.b;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.c.e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        ma maVar = this.b;
        if (maVar != null) {
            maVar.w();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        ma maVar = this.b;
        if (maVar != null) {
            maVar.x(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        gr grVar = this.a;
        if (grVar != null) {
            if (grVar.e) {
                grVar.e = false;
            } else {
                grVar.e = true;
                grVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        bt btVar = this.c;
        if (btVar != null) {
            btVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        bt btVar = this.c;
        if (btVar != null) {
            btVar.b();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        ma maVar = this.b;
        if (maVar != null) {
            maVar.D(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        ma maVar = this.b;
        if (maVar != null) {
            maVar.E(mode);
        }
    }

    @Override // defpackage.lth
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        gr grVar = this.a;
        if (grVar != null) {
            grVar.a = colorStateList;
            grVar.c = true;
            grVar.a();
        }
    }

    @Override // defpackage.lth
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        gr grVar = this.a;
        if (grVar != null) {
            grVar.b = mode;
            grVar.d = true;
            grVar.a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        bt btVar = this.c;
        btVar.k(colorStateList);
        btVar.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        bt btVar = this.c;
        btVar.l(mode);
        btVar.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(wk8.o(getContext(), i));
    }

    public fs(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
