package defpackage;

import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class tx4 implements Parcelable {
    public static final Parcelable.Creator<tx4> CREATOR = new s9(20);
    public final int a;
    public final RectF b;
    public final float[] c;
    public final float d;

    public tx4(int i, RectF rectF, float[] fArr, float f) {
        this.a = i;
        this.b = rectF;
        this.c = fArr;
        this.d = f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!tx4.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        tx4 tx4Var = (tx4) obj;
        return this.a == tx4Var.a && cqk.d(this.b, tx4Var.b) && Arrays.equals(this.c, tx4Var.c) && this.d == tx4Var.d;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + ((Arrays.hashCode(this.c) + ((this.b.hashCode() + (this.a * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CropPhotoViewState(rotationQuarterTurns=" + this.a + ", cropRect=" + this.b + ", imageMatrix=" + Arrays.toString(this.c) + ", cropRotationWheelAngle=" + this.d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeFloatArray(this.c);
        parcel.writeFloat(this.d);
    }
}
