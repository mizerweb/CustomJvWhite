package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public final class udb implements Parcelable, k79 {
    public static final Parcelable.Creator<udb> CREATOR = new v39(26);
    public final long a;
    public final String b;
    public final int c;
    public final boolean d;

    public udb(int i, long j, String str, boolean z) {
        this.a = j;
        this.b = str;
        this.c = i;
        this.d = z;
    }

    public static udb C(udb udbVar, boolean z) {
        long j = udbVar.a;
        String str = udbVar.b;
        int i = udbVar.c;
        udbVar.getClass();
        return new udb(i, j, str, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof udb)) {
            return false;
        }
        udb udbVar = (udb) obj;
        return this.a == udbVar.a && cqk.d(this.b, udbVar.b) && this.c == udbVar.c && this.d == udbVar.d;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + zo5.c(this.c, zo5.d(Long.hashCode(this.a) * 31, 31, this.b), 31);
    }

    @Override // defpackage.k79
    public final int j() {
        return 1;
    }

    public final String toString() {
        StringBuilder sbT = qt4.t(this.a, "NeuroAvatarModel(id=", ", url=", this.b);
        sbT.append(", categoryId=");
        sbT.append(this.c);
        sbT.append(", isSelected=");
        sbT.append(this.d);
        sbT.append(")");
        return sbT.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
