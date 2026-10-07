package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class s1l extends z3 {
    public static final Parcelable.Creator<s1l> CREATOR = new pkk(22);
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final v4l e;
    public final s1l f;

    static {
        Process.myUid();
        Process.myPid();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [z4l] */
    /* JADX WARN: Type inference failed for: r7v5 */
    public s1l(int i, String str, String str2, String str3, ArrayList arrayList, s1l s1lVar) {
        if (s1lVar != null && s1lVar.f != null) {
            ore.p("Failed requirement.");
            throw null;
        }
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3 == null ? s1lVar != null ? s1lVar.d : null : str3;
        if (arrayList == 0) {
            arrayList = s1lVar != null ? s1lVar.e : 0;
            if (arrayList == 0) {
                n4l n4lVar = v4l.b;
                arrayList = z4l.e;
            }
        }
        n4l n4lVar2 = v4l.b;
        Object[] array = arrayList.toArray();
        int length = array.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (array[i2] == null) {
                ore.n(zo5.v(new StringBuilder(String.valueOf(i2).length() + 9), "at index ", i2));
                throw null;
            }
        }
        this.e = length == 0 ? z4l.e : new z4l(array, length);
        this.f = s1lVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s1l)) {
            return false;
        }
        s1l s1lVar = (s1l) obj;
        return this.a == s1lVar.a && cqk.d(this.b, s1lVar.b) && cqk.d(this.c, s1lVar.c) && cqk.d(this.d, s1lVar.d) && cqk.d(this.f, s1lVar.f) && cqk.d(this.e, s1lVar.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.d, this.f});
    }

    public final String toString() {
        String str = this.b;
        int length = str.length() + 18;
        String str2 = this.c;
        StringBuilder sb = new StringBuilder(length + (str2 != null ? str2.length() : 0));
        sb.append(this.a);
        sb.append("/");
        sb.append(str);
        if (str2 != null) {
            sb.append("[");
            if (z5h.K0(str2, str, false)) {
                sb.append((CharSequence) str2, str.length(), str2.length());
            } else {
                sb.append(str2);
            }
            sb.append("]");
        }
        String str3 = this.d;
        if (str3 != null) {
            sb.append("/");
            sb.append(Integer.toHexString(str3.hashCode()));
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iT = jol.t(20293, parcel);
        jol.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        jol.o(parcel, 3, this.b);
        jol.o(parcel, 4, this.c);
        jol.o(parcel, 6, this.d);
        jol.n(parcel, 7, this.f, i);
        jol.r(parcel, this.e, 8);
        jol.u(iT, parcel);
    }
}
