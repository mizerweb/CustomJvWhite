package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.core.widget.a;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public class cr extends Button implements lg0 {
    public final ma a;
    public final bt b;
    public as c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cr(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        jth.a(context);
        dqh.a(this, getContext());
        ma maVar = new ma(this);
        this.a = maVar;
        maVar.t(attributeSet, i);
        bt btVar = new bt(this);
        this.b = btVar;
        btVar.f(attributeSet, i);
        btVar.b();
        getEmojiTextViewHelper().b(attributeSet, i);
    }

    private as getEmojiTextViewHelper() {
        if (this.c == null) {
            this.c = new as(this);
        }
        return this.c;
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
    public int getAutoSizeMaxTextSize() {
        if (r9j.c) {
            return super.getAutoSizeMaxTextSize();
        }
        bt btVar = this.b;
        if (btVar != null) {
            return Math.round(btVar.i.e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (r9j.c) {
            return super.getAutoSizeMinTextSize();
        }
        bt btVar = this.b;
        if (btVar != null) {
            return Math.round(btVar.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (r9j.c) {
            return super.getAutoSizeStepGranularity();
        }
        bt btVar = this.b;
        if (btVar != null) {
            return Math.round(btVar.i.c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (r9j.c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        bt btVar = this.b;
        return btVar != null ? btVar.i.f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (r9j.c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        bt btVar = this.b;
        if (btVar != null) {
            return btVar.i.a;
        }
        return 0;
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

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        bt btVar = this.b;
        if (btVar == null || r9j.c) {
            return;
        }
        btVar.i.a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        bt btVar = this.b;
        if (btVar != null) {
            kt ktVar = btVar.i;
            if (r9j.c || !ktVar.f()) {
                return;
            }
            ktVar.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView, defpackage.lg0
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (r9j.c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        bt btVar = this.b;
        if (btVar != null) {
            btVar.h(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (r9j.c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        bt btVar = this.b;
        if (btVar != null) {
            btVar.i(iArr, i);
        }
    }

    @Override // android.widget.TextView, defpackage.lg0
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (r9j.c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        bt btVar = this.b;
        if (btVar != null) {
            btVar.j(i);
        }
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
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(a.f(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        bt btVar = this.b;
        if (btVar != null) {
            btVar.a.setAllCaps(z);
        }
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
    public final void setTextSize(int i, float f) {
        boolean z = r9j.c;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        bt btVar = this.b;
        if (btVar != null) {
            kt ktVar = btVar.i;
            if (z || ktVar.f()) {
                return;
            }
            ktVar.g(i, f);
        }
    }

    public cr(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }
}
