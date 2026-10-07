package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class q24 implements Parcelable {
    public static final Parcelable.Creator<q24> CREATOR = new s9(12);
    public final long a;
    public final long b;

    public q24(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final long a() {
        return this.a;
    }

    public final long b() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q24)) {
            return false;
        }
        q24 q24Var = (q24) obj;
        return this.a == q24Var.a && this.b == q24Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return c0a.m(this.b, ")", qt4.s(this.a, "CommentsId(chatServerId=", ", messageServerId="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
    }
}
