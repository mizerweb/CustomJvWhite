package defpackage;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* JADX INFO: loaded from: classes3.dex */
public final class fqh extends CharacterStyle implements UpdateAppearance, eph {
    public final cf7 a;
    public int b;

    public fqh(kbc kbcVar, cf7 cf7Var) {
        this.a = cf7Var;
        this.b = ((Number) cf7Var.invoke(kbcVar)).intValue();
    }

    public final int a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fqh) && this.b == ((fqh) obj).b;
    }

    public final int hashCode() {
        return (Integer.hashCode(this.b) * 31) + fqh.class.hashCode();
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        this.b = ((Number) this.a.invoke(kbcVar)).intValue();
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            textPaint.setColor(this.b);
        }
    }
}
