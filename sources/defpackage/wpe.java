package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wpe implements Parcelable {
    public static final Parcelable.Creator<wpe> CREATOR = new pkk(18);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        hmk hmkVar = (hmk) this;
        parcel.writeParcelable(hmkVar.a, 0);
        parcel.writeInt(hmkVar.b ? 1 : 0);
    }
}
