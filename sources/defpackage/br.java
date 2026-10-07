package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import androidx.core.widget.a;

/* JADX INFO: loaded from: classes2.dex */
public class br extends AutoCompleteTextView {
    public static final int[] d = {R.attr.popupBackground};
    public final ma a;
    public final bt b;
    public final xp9 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public br(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        jth.a(context);
        dqh.a(this, getContext());
        vbf vbfVarK = vbf.k(getContext(), attributeSet, d, i);
        if (((TypedArray) vbfVarK.b).hasValue(0)) {
            setDropDownBackgroundDrawable(vbfVarK.d(0));
        }
        vbfVarK.l();
        ma maVar = new ma(this);
        this.a = maVar;
        maVar.t(attributeSet, i);
        bt btVar = new bt(this);
        this.b = btVar;
        btVar.f(attributeSet, i);
        btVar.b();
        xp9 xp9Var = new xp9(this);
        this.c = xp9Var;
        xp9Var.Q(attributeSet, i);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerO = xp9Var.O(keyListener);
        if (keyListenerO == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerO);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        ma maVar = this.a;
        if (maVar != null) {
            maVar.i();
        }
        bt btVar = this.b;
        if (btVar != null) {
            btVar.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return a.e(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        ma maVar = this.a;
        if (maVar != null) {
            return maVar.p();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        ma maVar = this.a;
        if (maVar != null) {
            return maVar.q();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.b.e();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        ktk.c(editorInfo, inputConnectionOnCreateInputConnection, this);
        return this.c.S(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        ma maVar = this.a;
        if (maVar != null) {
            maVar.w();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        ma maVar = this.a;
        if (maVar != null) {
            maVar.x(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        bt btVar = this.b;
        if (btVar != null) {
            btVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        bt btVar = this.b;
        if (btVar != null) {
            btVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(a.f(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(wk8.o(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.c.U(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.c.O(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        ma maVar = this.a;
        if (maVar != null) {
            maVar.D(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        ma maVar = this.a;
        if (maVar != null) {
            maVar.E(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        bt btVar = this.b;
        btVar.k(colorStateList);
        btVar.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        bt btVar = this.b;
        btVar.l(mode);
        btVar.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        bt btVar = this.b;
        if (btVar != null) {
            btVar.g(context, i);
        }
    }

    public br(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ru.oneme.app.R.attr.autoCompleteTextViewStyle);
    }
}
