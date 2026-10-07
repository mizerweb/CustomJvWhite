package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class hyh {
    public static final String f;
    public static final String g;
    public final int a;
    public final String b;
    public final int c;
    public final b87[] d;
    public int e;

    static {
        String str = vqi.a;
        f = Integer.toString(0, 36);
        g = Integer.toString(1, 36);
    }

    public hyh(String str, b87... b87VarArr) {
        lvb.R(b87VarArr.length > 0);
        this.b = str;
        this.d = b87VarArr;
        this.a = b87VarArr.length;
        String str2 = b87VarArr[0].n;
        this.c = TextUtils.isEmpty(str2) ? uya.h(b87VarArr[0].m) : uya.h(str2);
        String str3 = b87VarArr[0].d;
        str3 = (str3 == null || str3.equals("und")) ? "" : str3;
        int i = b87VarArr[0].f | 16384;
        for (int i2 = 1; i2 < b87VarArr.length; i2++) {
            String str4 = b87VarArr[i2].d;
            if (!str3.equals((str4 == null || str4.equals("und")) ? "" : str4)) {
                c(i2, "languages", b87VarArr[0].d, b87VarArr[i2].d);
                return;
            } else {
                if (i != (b87VarArr[i2].f | 16384)) {
                    c(i2, "role flags", Integer.toBinaryString(b87VarArr[0].f), Integer.toBinaryString(b87VarArr[i2].f));
                    return;
                }
            }
        }
    }

    public static hyh a(Bundle bundle) {
        ghe gheVarA;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f);
        if (parcelableArrayList == null) {
            a98 a98Var = c98.b;
            gheVarA = ghe.e;
        } else {
            gheVarA = l51.a(new ahc(26), parcelableArrayList);
        }
        return new hyh(bundle.getString(g, ""), (b87[]) gheVarA.toArray(new b87[0]));
    }

    public static void c(int i, String str, String str2, String str3) {
        StringBuilder sbQ = qv1.q("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        sbQ.append(str3);
        sbQ.append("' (track ");
        sbQ.append(i);
        sbQ.append(")");
        lvb.l0("TrackGroup", "", new IllegalStateException(sbQ.toString()));
    }

    public final int b(b87 b87Var) {
        int i = 0;
        while (true) {
            b87[] b87VarArr = this.d;
            if (i >= b87VarArr.length) {
                return -1;
            }
            if (b87Var == b87VarArr[i]) {
                return i;
            }
            i++;
        }
    }

    public final Bundle d() {
        Bundle bundle = new Bundle();
        b87[] b87VarArr = this.d;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(b87VarArr.length);
        for (b87 b87Var : b87VarArr) {
            arrayList.add(b87Var.d());
        }
        bundle.putParcelableArrayList(f, arrayList);
        bundle.putString(g, this.b);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && hyh.class == obj.getClass()) {
            hyh hyhVar = (hyh) obj;
            if (this.b.equals(hyhVar.b) && Arrays.equals(this.d, hyhVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.e == 0) {
            this.e = Arrays.hashCode(this.d) + zo5.d(527, 31, this.b);
        }
        return this.e;
    }

    public final String toString() {
        return this.b + ": " + Arrays.toString(this.d);
    }
}
