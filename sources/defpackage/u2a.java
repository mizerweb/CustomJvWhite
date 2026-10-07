package defpackage;

import android.media.session.MediaSession;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class u2a implements Parcelable {
    public static final Parcelable.Creator<u2a> CREATOR = new v39(22);
    public final MediaSession.Token b;
    public d38 c;
    public final Object a = new Object();
    public ysi d = null;

    public u2a(MediaSession.Token token, d38 d38Var) {
        this.b = token;
        this.c = d38Var;
    }

    public final d38 a() {
        d38 d38Var;
        synchronized (this.a) {
            d38Var = this.c;
        }
        return d38Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u2a) {
            return this.b.equals(((u2a) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
    }
}
