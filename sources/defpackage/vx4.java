package defpackage;

import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class vx4 implements Parcelable {
    public static final Parcelable.Creator<vx4> CREATOR = new s9(21);
    public final RectF a;
    public final float b;
    public final float[] c;

    public vx4(Parcel parcel) {
        this.a = (RectF) parcel.readParcelable(RectF.class.getClassLoader());
        this.b = parcel.readFloat();
        float[] fArr = new float[9];
        this.c = fArr;
        parcel.readFloatArray(fArr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || vx4.class != obj.getClass()) {
            return false;
        }
        vx4 vx4Var = (vx4) obj;
        if (Float.compare(vx4Var.b, this.b) == 0 && this.a.equals(vx4Var.a)) {
            return Arrays.equals(this.c, vx4Var.c);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        float f = this.b;
        return Arrays.hashCode(this.c) + ((iHashCode + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeFloat(this.b);
        parcel.writeFloatArray(this.c);
    }

    public vx4(RectF rectF, float f, float[] fArr) {
        this.a = rectF;
        this.b = f;
        this.c = fArr;
    }
}
