package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class c49 implements l49, j49 {
    public static final Parcelable.Creator<c49> CREATOR = new v39(6);
    public final long a;
    public final long b;
    public final boolean c;
    public final Long d;
    public final boolean e;
    public final String f;

    public /* synthetic */ c49(long j, long j2, Long l, String str, int i) {
        this(j, (i & 2) != 0 ? 0L : j2, (i & 4) == 0, (i & 8) != 0 ? null : l, (i & 16) != 0, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.l49, defpackage.j49
    public final String i() {
        return this.f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        Long l = this.d;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeString(this.f);
    }

    public c49(long j, long j2, boolean z, Long l, boolean z2, String str) {
        this.a = j;
        this.b = j2;
        this.c = z;
        this.d = l;
        this.e = z2;
        this.f = str;
    }
}
