package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public class hb9 extends t2 implements Parcelable {
    public static final Parcelable.Creator<hb9> CREATOR = new v39(15);
    public final long b;
    public final String c;
    public final String d;
    public final int e;
    public final long f;
    public final String g;
    public final long h;
    public Uri i;

    /* JADX WARN: Illegal instructions before constructor call */
    public hb9(Parcel parcel) {
        int i = parcel.readInt();
        long j = parcel.readLong();
        String string = parcel.readByte() == 1 ? parcel.readString() : null;
        String string2 = parcel.readByte() == 1 ? parcel.readString() : null;
        this(i, j, string, string2, parcel.readInt(), parcel.readLong(), parcel.readString(), parcel.readLong(), (Uri) (parcel.readByte() == 1 ? parcel.readParcelable(Uri.class.getClassLoader()) : null));
    }

    @Override // defpackage.t2
    public String a() {
        Uri uri = this.i;
        return uri != null ? uri.toString() : this.c;
    }

    public Uri d() {
        Uri uri = this.i;
        if (uri != null) {
            return uri;
        }
        try {
            Uri uri2 = Uri.parse(this.c);
            this.i = uri2;
            return uri2;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeLong(this.b);
        String str = this.c;
        byte b = str != null ? (byte) 1 : (byte) 0;
        parcel.writeByte(b);
        if (b != 0) {
            parcel.writeString(str);
        }
        String str2 = this.d;
        byte b2 = str2 != null ? (byte) 1 : (byte) 0;
        parcel.writeByte(b2);
        if (b2 != 0) {
            parcel.writeString(str2);
        }
        parcel.writeInt(this.e);
        parcel.writeLong(this.f);
        parcel.writeString(this.g);
        parcel.writeLong(this.h);
        Uri uri = this.i;
        byte b3 = uri != null ? (byte) 1 : (byte) 0;
        parcel.writeByte(b3);
        if (b3 != 0) {
            parcel.writeParcelable(uri, i);
        }
    }

    public hb9(int i, long j, String str, String str2, int i2, long j2, String str3, long j3, Uri uri) {
        super(i);
        this.b = j;
        this.c = str;
        this.d = str2;
        this.e = i2;
        this.f = j2;
        this.g = str3;
        this.h = j3;
        this.i = uri;
    }
}
