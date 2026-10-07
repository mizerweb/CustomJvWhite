package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class ss5 implements Parcelable {
    public static final Parcelable.Creator<ss5> CREATOR = new s9(25);
    public final String a;
    public final Uri b;
    public final String c;
    public final List d;
    public final byte[] e;
    public final String f;
    public final byte[] g;
    public final qs5 h;
    public final rs5 i;

    public ss5(Parcel parcel) {
        String string = parcel.readString();
        String str = vqi.a;
        this.a = string;
        this.b = Uri.parse(parcel.readString());
        this.c = parcel.readString();
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add((k4h) parcel.readParcelable(k4h.class.getClassLoader()));
        }
        this.d = Collections.unmodifiableList(arrayList);
        this.e = parcel.createByteArray();
        this.f = parcel.readString();
        this.g = parcel.createByteArray();
        this.h = (qs5) parcel.readParcelable(qs5.class.getClassLoader());
        this.i = (rs5) parcel.readParcelable(rs5.class.getClassLoader());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.List] */
    public final ss5 a(ss5 ss5Var) {
        ?? arrayList;
        String str = ss5Var.a;
        List list = ss5Var.d;
        lvb.R(this.a.equals(str));
        List list2 = this.d;
        if (list2.isEmpty() || list.isEmpty()) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList(list2);
            for (int i = 0; i < list.size(); i++) {
                k4h k4hVar = (k4h) list.get(i);
                if (!arrayList.contains(k4hVar)) {
                    arrayList.add(k4hVar);
                }
            }
        }
        ?? r7 = arrayList;
        return new ss5(this.a, ss5Var.b, ss5Var.c, r7, ss5Var.e, ss5Var.f, ss5Var.g, ss5Var.h, ss5Var.i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ss5)) {
            return false;
        }
        ss5 ss5Var = (ss5) obj;
        return this.a.equals(ss5Var.a) && this.b.equals(ss5Var.b) && Objects.equals(this.c, ss5Var.c) && this.d.equals(ss5Var.d) && Arrays.equals(this.e, ss5Var.e) && Objects.equals(this.f, ss5Var.f) && Arrays.equals(this.g, ss5Var.g) && Objects.equals(this.h, ss5Var.h) && Objects.equals(this.i, ss5Var.i);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 961)) * 31;
        String str = this.c;
        int iHashCode2 = (Arrays.hashCode(this.e) + ((this.d.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        String str2 = this.f;
        int iHashCode3 = (Arrays.hashCode(this.g) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31;
        qs5 qs5Var = this.h;
        int iHashCode4 = (iHashCode3 + (qs5Var != null ? qs5Var.hashCode() : 0)) * 31;
        rs5 rs5Var = this.i;
        return iHashCode4 + (rs5Var != null ? rs5Var.hashCode() : 0);
    }

    public final String toString() {
        return this.c + ":" + this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b.toString());
        parcel.writeString(this.c);
        List list = this.d;
        parcel.writeInt(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            parcel.writeParcelable((Parcelable) list.get(i2), 0);
        }
        parcel.writeByteArray(this.e);
        parcel.writeString(this.f);
        parcel.writeByteArray(this.g);
        parcel.writeParcelable(this.h, 0);
        parcel.writeParcelable(this.i, 0);
    }

    public ss5(String str, Uri uri, String str2, List list, byte[] bArr, String str3, byte[] bArr2, qs5 qs5Var, rs5 rs5Var) {
        int iN = vqi.N(uri, str2);
        if (iN != 0 && iN != 2 && iN != 1) {
            this.h = qs5Var;
            this.i = null;
        } else {
            lvb.Q("customCacheKey must be null for type: %s", iN, str3 == null);
            this.h = null;
            this.i = rs5Var;
        }
        this.a = str;
        this.b = uri;
        this.c = str2;
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        this.d = Collections.unmodifiableList(arrayList);
        this.e = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        this.f = str3;
        this.g = bArr2 != null ? Arrays.copyOf(bArr2, bArr2.length) : vqi.b;
    }
}
