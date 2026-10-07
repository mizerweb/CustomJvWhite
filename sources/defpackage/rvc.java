package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class rvc implements Parcelable {
    public static final Parcelable.Creator<rvc> CREATOR = new p8c(19);
    public final Uri a;
    public final Uri b;
    public final vx4 c;
    public final y26 d;
    public final Uri e;

    public rvc(Uri uri, Uri uri2, vx4 vx4Var, y26 y26Var, Uri uri3) {
        this.a = uri;
        this.b = uri2;
        this.c = vx4Var;
        this.d = y26Var;
        this.e = uri3;
    }

    public static Uri a(hb9 hb9Var, rvc rvcVar) {
        if (rvcVar == null) {
            return Uri.parse(hb9Var.a());
        }
        Uri uri = rvcVar.b;
        if (uri != null) {
            return uri;
        }
        Uri uri2 = rvcVar.a;
        return uri2 != null ? uri2 : Uri.parse(hb9Var.a());
    }

    public static boolean b(hb9 hb9Var, rvc rvcVar) {
        if (rvcVar == null) {
            return false;
        }
        return (rvcVar.d == null && rvcVar.c == null && a(hb9Var, rvcVar).equals(Uri.parse(hb9Var.a()))) ? false : true;
    }

    public final g85 c() {
        g85 g85Var = new g85();
        g85Var.a = this.a;
        g85Var.b = this.b;
        g85Var.c = this.c;
        g85Var.d = this.d;
        g85Var.e = this.e;
        return g85Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rvc.class != obj.getClass()) {
            return false;
        }
        rvc rvcVar = (rvc) obj;
        if (Objects.equals(this.a, rvcVar.a) && Objects.equals(this.b, rvcVar.b) && Objects.equals(this.c, rvcVar.c) && Objects.equals(this.d, rvcVar.d)) {
            return Objects.equals(this.e, rvcVar.e);
        }
        return false;
    }

    public final int hashCode() {
        Uri uri = this.a;
        int iHashCode = (uri != null ? uri.hashCode() : 0) * 31;
        Uri uri2 = this.b;
        int iHashCode2 = (iHashCode + (uri2 != null ? uri2.hashCode() : 0)) * 31;
        vx4 vx4Var = this.c;
        int iHashCode3 = (iHashCode2 + (vx4Var != null ? vx4Var.hashCode() : 0)) * 31;
        y26 y26Var = this.d;
        int iHashCode4 = (iHashCode3 + (y26Var != null ? y26Var.hashCode() : 0)) * 31;
        Uri uri3 = this.e;
        return iHashCode4 + (uri3 != null ? uri3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
        parcel.writeParcelable(this.e, i);
    }
}
