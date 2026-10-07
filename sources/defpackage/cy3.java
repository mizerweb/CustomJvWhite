package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class cy3 implements Parcelable {
    public static final Parcelable.Creator<cy3> CREATOR = new s9(11);
    public final int a;
    public final int b;

    public cy3(Parcel parcel) {
        this.b = parcel.readInt();
        String string = parcel.readString();
        if (string == null) {
            ore.n("Name is null");
        } else if (!string.equals("ADD")) {
            ore.p("No enum constant one.me.photoeditor.state.CommandState.Type.".concat(string));
        }
        this.a = 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || cy3.class != obj.getClass()) {
            return false;
        }
        cy3 cy3Var = (cy3) obj;
        return this.b == cy3Var.b && this.a == cy3Var.a;
    }

    public final int hashCode() {
        int i = this.a;
        return ((i != 0 ? qt4.D(i) : 0) * 31) + this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        if (this.a != 1) {
            throw null;
        }
        parcel.writeString("ADD");
    }

    public cy3(int i) {
        this.a = 1;
        this.b = i;
    }
}
