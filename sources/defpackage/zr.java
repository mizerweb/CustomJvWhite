package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.widget.a;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class zr extends EditText implements aub {
    public final ma a;
    public final bt b;
    public final v2a c;
    public final toh d;
    public final xp9 e;
    public yr f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zr(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        jth.a(context);
        dqh.a(this, getContext());
        ma maVar = new ma(this);
        this.a = maVar;
        maVar.t(attributeSet, R.attr.editTextStyle);
        bt btVar = new bt(this);
        this.b = btVar;
        btVar.f(attributeSet, R.attr.editTextStyle);
        btVar.b();
        v2a v2aVar = new v2a(8, false);
        v2aVar.b = this;
        this.c = v2aVar;
        this.d = new toh();
        xp9 xp9Var = new xp9(this);
        this.e = xp9Var;
        xp9Var.Q(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (xp9.P(keyListener)) {
            boolean zIsFocusable = isFocusable();
            boolean zIsClickable = isClickable();
            boolean zIsLongClickable = isLongClickable();
            int inputType = getInputType();
            KeyListener keyListenerO = xp9Var.O(keyListener);
            if (keyListenerO == keyListener) {
                return;
            }
            super.setKeyListener(keyListenerO);
            setRawInputType(inputType);
            setFocusable(zIsFocusable);
            setClickable(zIsClickable);
            setLongClickable(zIsLongClickable);
        }
    }

    private yr getSuperCaller() {
        if (this.f == null) {
            this.f = new yr(this);
        }
        return this.f;
    }

    @Override // defpackage.aub
    public final zo4 a(zo4 zo4Var) {
        return this.d.a(this, zo4Var);
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

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : getEditableText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        v2a v2aVar;
        if (Build.VERSION.SDK_INT >= 28 || (v2aVar = this.c) == null) {
            return getSuperCaller().a();
        }
        TextClassifier textClassifier = (TextClassifier) v2aVar.c;
        return textClassifier == null ? vs.a((TextView) v2aVar.b) : textClassifier;
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArrF;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.b.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 && inputConnectionOnCreateInputConnection != null) {
            ovl.c(editorInfo, getText());
        }
        ktk.c(editorInfo, inputConnectionOnCreateInputConnection, this);
        if (inputConnectionOnCreateInputConnection != null && i <= 30 && (strArrF = i7j.f(this)) != null) {
            ovl.b(editorInfo, strArrF);
            inputConnectionOnCreateInputConnection = c4m.c(this, inputConnectionOnCreateInputConnection, editorInfo);
        }
        return this.e.S(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        if (huk.b(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        if (huk.c(this, i)) {
            return true;
        }
        return super.onTextContextMenuItem(i);
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

    public void setEmojiCompatEnabled(boolean z) {
        this.e.U(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.e.O(keyListener));
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

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        v2a v2aVar;
        if (Build.VERSION.SDK_INT >= 28 || (v2aVar = this.c) == null) {
            getSuperCaller().b(textClassifier);
        } else {
            v2aVar.c = textClassifier;
        }
    }
}
