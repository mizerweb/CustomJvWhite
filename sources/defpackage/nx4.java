package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class nx4 implements Parcelable {
    public static final Parcelable.Creator<nx4> CREATOR = new s9(19);
    public final float[] a;
    public final boolean b;
    public final float c;

    public nx4(float[] fArr, boolean z, float f) {
        this.a = fArr;
        this.b = z;
        this.c = f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!nx4.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        nx4 nx4Var = (nx4) obj;
        return Arrays.equals(this.a, nx4Var.a) && this.b == nx4Var.b && this.c == nx4Var.c;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + nbh.n(Arrays.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbA = zo5.A("TransformSnapshot(avatarTransformValues=", Arrays.toString(this.a), ", imageOrientationChanged=", ", cropRotationWheelAngle=", this.b);
        sbA.append(this.c);
        sbA.append(")");
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloatArray(this.a);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeFloat(this.c);
    }
}
