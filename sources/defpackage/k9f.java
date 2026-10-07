package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;

/* JADX INFO: loaded from: classes2.dex */
public final class k9f implements Parcelable {
    public static final Parcelable.Creator<k9f> CREATOR = new c5e(5);
    public final ForegroundColorSpan a;
    public final BackgroundColorSpan b;

    public k9f(ForegroundColorSpan foregroundColorSpan, BackgroundColorSpan backgroundColorSpan) {
        this.a = foregroundColorSpan;
        this.b = backgroundColorSpan;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
    }
}
