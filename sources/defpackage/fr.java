package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.core.widget.a;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class fr extends CheckedTextView {
    public final gr a;
    public final ma b;
    public final bt c;
    public as d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fr(Context context, AttributeSet attributeSet) {
        int resourceId;
        int resourceId2;
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        jth.a(context);
        dqh.a(this, getContext());
        bt btVar = new bt(this);
        this.c = btVar;
        btVar.f(attributeSet, R.attr.checkedTextViewStyle);
        btVar.b();
        ma maVar = new ma(this);
        this.b = maVar;
        maVar.t(attributeSet, R.attr.checkedTextViewStyle);
        this.a = new gr(this);
        Context context2 = getContext();
        int[] iArr = l3e.l;
        vbf vbfVarK = vbf.k(context2, attributeSet, iArr, R.attr.checkedTextViewStyle);
        TypedArray typedArray = (TypedArray) vbfVarK.b;
        i7j.k(this, getContext(), iArr, attributeSet, (TypedArray) vbfVarK.b, R.attr.checkedTextViewStyle, 0);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(wk8.o(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        setCheckMarkDrawable(wk8.o(getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(wk8.o(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                setCheckMarkTintList(vbfVarK.c(2));
            }
            if (typedArray.hasValue(3)) {
                setCheckMarkTintMode(vt5.c(typedArray.getInt(3, -1), null));
            }
            vbfVarK.l();
            getEmojiTextViewHelper().b(attributeSet, R.attr.checkedTextViewStyle);
        } catch (Throwable th) {
            vbfVarK.l();
            throw th;
        }
    }

    private as getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new as(this);
        }
        return this.d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        bt btVar = this.c;
        if (btVar != null) {
            btVar.b();
        }
        ma maVar = this.b;
        if (maVar != null) {
            maVar.i();
        }
        gr grVar = this.a;
        if (grVar != null) {
            grVar.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return a.e(super.getCustomSelectionActionModeCallback());
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

    public ColorStateList getSupportCheckMarkTintList() {
        gr grVar = this.a;
        if (grVar != null) {
            return grVar.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
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

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        ktk.c(editorInfo, inputConnectionOnCreateInputConnection, this);
        return inputConnectionOnCreateInputConnection;
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

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        gr grVar = this.a;
        if (grVar != null) {
            if (grVar.e) {
                grVar.e = false;
            } else {
                grVar.e = true;
                grVar.b();
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

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(a.f(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
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

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        gr grVar = this.a;
        if (grVar != null) {
            grVar.a = colorStateList;
            grVar.c = true;
            grVar.b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        gr grVar = this.a;
        if (grVar != null) {
            grVar.b = mode;
            grVar.d = true;
            grVar.b();
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

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        bt btVar = this.c;
        if (btVar != null) {
            btVar.g(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(wk8.o(getContext(), i));
    }
}
