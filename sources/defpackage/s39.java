package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class s39 implements l49, j49 {
    public static final Parcelable.Creator<s39> CREATOR = new uu5(27);
    public final Uri a;
    public final String b;

    public s39(Uri uri, String str) {
        this.a = uri;
        this.b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.l49, defpackage.j49
    public final String i() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(new v65(this.a), i);
        parcel.writeString(this.b);
    }
}
