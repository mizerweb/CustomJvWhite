package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class q8c extends u8c {
    public static final q8c b = new q8c(BuildConfig.MAX_TIME_TO_UPLOAD);
    public static final Parcelable.Creator<q8c> CREATOR = new p8c(0);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof q8c);
    }

    public final int hashCode() {
        return 1868500386;
    }

    public final String toString() {
        return "Indeterminate";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(1);
    }
}
