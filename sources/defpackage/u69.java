package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes4.dex */
public class u69 implements Parcelable {
    public static final Parcelable.Creator<u69> CREATOR = new v39(14);
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public u69(Parcel parcel) {
        this.a = parcel.readLong();
        this.b = parcel.readLong();
        this.c = parcel.readLong();
        this.d = parcel.readLong();
    }

    public static u69 a(long j) {
        return new u69(j, 0L, 0L, 0L);
    }

    public static u69 b(long j) {
        return new u69(0L, 0L, j, 0L);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeepLinkData{chatId=");
        sb.append(this.a);
        sb.append(", messageServerId=");
        sb.append(this.b);
        sb.append(", contactId=");
        sb.append(this.c);
        sb.append(", stickerSetId=");
        return zo5.u(sb, this.d, '}');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
        parcel.writeLong(this.c);
        parcel.writeLong(this.d);
    }

    public u69(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }
}
