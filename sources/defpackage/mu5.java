package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class mu5 implements Parcelable {
    public static final Parcelable.Creator<mu5> CREATOR = new s9(28);
    public final int a;
    public final float[] b;

    public mu5(Parcel parcel) {
        this.b = parcel.createFloatArray();
        this.a = x05.s(parcel.readString());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || mu5.class != obj.getClass()) {
            return false;
        }
        mu5 mu5Var = (mu5) obj;
        if (this.a != mu5Var.a) {
            return false;
        }
        return Arrays.equals(this.b, mu5Var.b);
    }

    public final int hashCode() {
        int i = this.a;
        return Arrays.hashCode(this.b) + ((i != 0 ? qt4.D(i) : 0) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloatArray(this.b);
        parcel.writeString(x05.n(this.a));
    }

    public mu5(int i, float[] fArr) {
        this.a = i;
        this.b = fArr;
    }
}
