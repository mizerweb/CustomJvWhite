package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class v65 implements Parcelable {
    public static final Parcelable.Creator<v65> CREATOR = new eu1(1);
    public final Uri a;

    public /* synthetic */ v65(Uri uri) {
        this.a = uri;
    }

    public static final String a(Uri uri) {
        String path = uri.getPath();
        if (path == null) {
            path = "";
        }
        return r5h.f1(path, "/");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v65) {
            return cqk.d(this.a, ((v65) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }
}
