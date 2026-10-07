package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class unk extends z3 {
    public static final Parcelable.Creator<unk> CREATOR = new znk();
    public int a;
    public boolean b;

    public unk(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof unk)) {
            return false;
        }
        unk unkVar = (unk) obj;
        return this.a == unkVar.a && f55.h(Boolean.valueOf(this.b), Boolean.valueOf(unkVar.b));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Boolean.valueOf(this.b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = jol.t(20293, parcel);
        int i2 = this.a;
        jol.s(parcel, 2, 4);
        parcel.writeInt(i2);
        boolean z = this.b;
        jol.s(parcel, 3, 4);
        parcel.writeInt(z ? 1 : 0);
        jol.u(iT, parcel);
    }

    public unk() {
    }
}
