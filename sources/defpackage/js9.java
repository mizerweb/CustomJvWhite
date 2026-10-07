package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class js9 implements Parcelable {
    public static final Parcelable.Creator<js9> CREATOR = new v39(18);
    public final int a;
    public final uv9 b;

    public js9(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = uv9.CREATOR.createFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "MediaItem{mFlags=" + this.a + ", mDescription=" + this.b + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        this.b.writeToParcel(parcel, i);
    }
}
