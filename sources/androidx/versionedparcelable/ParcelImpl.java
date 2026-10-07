package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.p8c;
import defpackage.xsi;
import defpackage.ysi;

/* JADX INFO: loaded from: classes2.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new p8c(14);
    public final ysi a;

    public ParcelImpl(Parcel parcel) {
        this.a = new xsi(parcel).h();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new xsi(parcel).l(this.a);
    }

    public ParcelImpl(ysi ysiVar) {
        this.a = ysiVar;
    }
}
