package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public class f8h implements Parcelable {
    public static final e8h CREATOR = new e8h();
    public final String a;

    public f8h(Parcel parcel) {
        this(parcel.readString());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }

    public f8h(String str) {
        this.a = str;
    }
}
