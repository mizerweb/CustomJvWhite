package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zrh implements Parcelable {
    public static final Parcelable.Creator<zrh> CREATOR = new c5e(24);
    public final int a;
    public final String b;

    public zrh(int i) {
        this.a = i;
        this.b = String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zrh) && this.a == ((zrh) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }
}
