package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.text.style.RelativeSizeSpan;

/* JADX INFO: loaded from: classes3.dex */
public final class ju7 extends RelativeSizeSpan implements gn9, Parcelable {
    public static final Parcelable.Creator<ju7> CREATOR = new uu5(8);
    public final float a;
    public final int b;

    public ju7(float f) {
        super(f);
        this.a = f;
        this.b = 8;
    }

    @Override // defpackage.ft4
    public final ft4 copy() {
        return new ju7(this.a);
    }

    @Override // defpackage.gn9
    public final int getType() {
        return this.b;
    }

    @Override // android.text.style.RelativeSizeSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setFakeBoldText(true);
    }

    @Override // android.text.style.RelativeSizeSpan, android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        super.updateMeasureState(textPaint);
        textPaint.setFakeBoldText(true);
    }

    @Override // android.text.style.RelativeSizeSpan, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.a);
    }

    public /* synthetic */ ju7() {
        this(1.3f);
    }
}
