package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* JADX INFO: loaded from: classes3.dex */
public final class gu3 extends CharacterStyle implements UpdateAppearance, Parcelable, gn9 {
    public static final Parcelable.Creator<gu3> CREATOR = new s9(10);
    public final int a;
    public final int b;

    public gu3(int i) {
        this.a = i;
        this.b = 9;
    }

    @Override // defpackage.ft4
    public final ft4 copy() {
        return new gu3();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.gn9
    public final int getType() {
        return this.b;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setColor(this.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }

    public /* synthetic */ gu3() {
        this(-65536);
    }

    public gu3(Parcel parcel) {
        this(parcel.readInt());
    }
}
