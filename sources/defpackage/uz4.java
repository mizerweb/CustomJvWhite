package defpackage;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.TypefaceSpan;

/* JADX INFO: loaded from: classes4.dex */
public final class uz4 extends TypefaceSpan {
    public final Typeface a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uz4() {
        super((String) null);
        Typeface typeface = Typeface.DEFAULT_BOLD;
        this.a = typeface;
    }

    @Override // android.text.style.TypefaceSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setTypeface(this.a);
        super.updateDrawState(textPaint);
    }

    @Override // android.text.style.TypefaceSpan, android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setTypeface(this.a);
        super.updateMeasureState(textPaint);
    }
}
