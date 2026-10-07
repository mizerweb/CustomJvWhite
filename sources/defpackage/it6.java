package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class it6 implements Parcelable {
    public static final Parcelable.Creator<it6> CREATOR = new uu5(2);
    public final String a;
    public final String b;
    public final boolean c;

    public it6(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof it6)) {
            return false;
        }
        it6 it6Var = (it6) obj;
        return this.a.equals(it6Var.a) && this.b.equals(it6Var.b) && this.c == it6Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + zo5.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return qt4.r(qv1.q("FileUploadEvent(filePath=", this.a, ", destinationUrl=", this.b, ", removeAfterUpload="), this.c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeBoolean(this.c);
    }
}
