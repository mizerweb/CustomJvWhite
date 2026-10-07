package defpackage;

import android.os.Parcel;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class vnh extends ynh {
    public static final unh CREATOR = new unh();
    public final int c;
    public final List d;

    public vnh(int i, List list) {
        this.c = i;
        this.d = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vnh)) {
            return false;
        }
        vnh vnhVar = (vnh) obj;
        return this.c == vnhVar.c && cqk.d(this.d, vnhVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (Integer.hashCode(this.c) * 31);
    }

    public final String toString() {
        return "ResourceParams(resId=" + this.c + ", args=" + this.d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.c);
        parcel.writeList(this.d);
    }
}
