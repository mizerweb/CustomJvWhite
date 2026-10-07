package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public final class wu5 implements Comparator, Parcelable {
    public static final Parcelable.Creator<wu5> CREATOR = new s9(29);
    public final vu5[] a;
    public int b;
    public final String c;
    public final int d;

    public wu5(Parcel parcel) {
        this.c = parcel.readString();
        vu5[] vu5VarArr = (vu5[]) parcel.createTypedArray(vu5.CREATOR);
        String str = vqi.a;
        this.a = vu5VarArr;
        this.d = vu5VarArr.length;
    }

    public final wu5 a(String str) {
        return Objects.equals(this.c, str) ? this : new wu5(str, false, this.a);
    }

    public final vu5 b(int i) {
        return this.a[i];
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        vu5 vu5Var = (vu5) obj;
        vu5 vu5Var2 = (vu5) obj2;
        UUID uuid = f71.a;
        if (uuid.equals(vu5Var.b)) {
            return uuid.equals(vu5Var2.b) ? 0 : 1;
        }
        return vu5Var.b.compareTo(vu5Var2.b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && wu5.class == obj.getClass()) {
            wu5 wu5Var = (wu5) obj;
            if (Objects.equals(this.c, wu5Var.c) && Arrays.equals(this.a, wu5Var.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.b == 0) {
            String str = this.c;
            this.b = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.a);
        }
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeTypedArray(this.a, 0);
    }

    public wu5(String str, boolean z, vu5... vu5VarArr) {
        this.c = str;
        vu5VarArr = z ? (vu5[]) vu5VarArr.clone() : vu5VarArr;
        this.a = vu5VarArr;
        this.d = vu5VarArr.length;
        Arrays.sort(vu5VarArr, this);
    }

    public wu5(String str, ArrayList arrayList) {
        this(str, false, (vu5[]) arrayList.toArray(new vu5[0]));
    }
}
