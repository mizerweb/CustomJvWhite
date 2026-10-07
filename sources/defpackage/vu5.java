package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public final class vu5 implements Parcelable {
    public static final Parcelable.Creator<vu5> CREATOR = new uu5(0);
    public int a;
    public final UUID b;
    public final String c;
    public final String d;
    public final byte[] e;

    public vu5(Parcel parcel) {
        this.b = new UUID(parcel.readLong(), parcel.readLong());
        this.c = parcel.readString();
        String string = parcel.readString();
        String str = vqi.a;
        this.d = string;
        this.e = parcel.createByteArray();
    }

    public final boolean a(UUID uuid) {
        UUID uuid2 = f71.a;
        UUID uuid3 = this.b;
        return uuid2.equals(uuid3) || uuid.equals(uuid3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vu5)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        vu5 vu5Var = (vu5) obj;
        return Objects.equals(this.c, vu5Var.c) && Objects.equals(this.d, vu5Var.d) && Objects.equals(this.b, vu5Var.b) && Arrays.equals(this.e, vu5Var.e);
    }

    public final int hashCode() {
        if (this.a == 0) {
            int iHashCode = this.b.hashCode() * 31;
            String str = this.c;
            this.a = Arrays.hashCode(this.e) + zo5.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        }
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        UUID uuid = this.b;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeByteArray(this.e);
    }

    public vu5(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.b = uuid;
        this.c = str;
        str2.getClass();
        this.d = uya.n(str2);
        this.e = bArr;
    }
}
