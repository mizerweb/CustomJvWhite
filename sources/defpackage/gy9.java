package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class gy9 {
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public final UUID a;
    public final Uri b;
    public final g98 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final c98 g;
    public final byte[] h;

    static {
        String str = vqi.a;
        i = Integer.toString(0, 36);
        j = Integer.toString(1, 36);
        k = Integer.toString(2, 36);
        l = Integer.toString(3, 36);
        m = Integer.toString(4, 36);
        n = Integer.toString(5, 36);
        o = Integer.toString(6, 36);
        p = Integer.toString(7, 36);
    }

    public gy9(fy9 fy9Var) {
        lvb.b0((fy9Var.f && fy9Var.b == null) ? false : true);
        UUID uuid = fy9Var.a;
        uuid.getClass();
        this.a = uuid;
        this.b = fy9Var.b;
        this.c = fy9Var.c;
        this.d = fy9Var.d;
        this.f = fy9Var.f;
        this.e = fy9Var.e;
        this.g = fy9Var.g;
        byte[] bArr = fy9Var.h;
        this.h = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
    }

    public static gy9 b(Bundle bundle) {
        Map mapA;
        String string = bundle.getString(i);
        string.getClass();
        UUID uuidFromString = UUID.fromString(string);
        Uri uri = (Uri) bundle.getParcelable(j);
        Bundle bundle2 = Bundle.EMPTY;
        Bundle bundle3 = bundle.getBundle(k);
        if (bundle3 == null) {
            bundle3 = bundle2;
        }
        if (bundle3 == bundle2) {
            mapA = lhe.g;
        } else {
            HashMap map = new HashMap();
            if (bundle3 != bundle2) {
                for (String str : bundle3.keySet()) {
                    String string2 = bundle3.getString(str);
                    if (string2 != null) {
                        map.put(str, string2);
                    }
                }
            }
            mapA = g98.a(map);
        }
        boolean z = bundle.getBoolean(l, false);
        boolean z2 = bundle.getBoolean(m, false);
        boolean z3 = bundle.getBoolean(n, false);
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(o);
        if (integerArrayList != null) {
            arrayList = integerArrayList;
        }
        c98 c98VarN = c98.n(arrayList);
        byte[] byteArray = bundle.getByteArray(p);
        fy9 fy9Var = new fy9();
        fy9Var.a = uuidFromString;
        fy9Var.b = uri;
        fy9Var.c = g98.a(mapA);
        fy9Var.d = z;
        fy9Var.f = z3;
        fy9Var.e = z2;
        fy9Var.g = c98.n(c98VarN);
        fy9Var.h = byteArray != null ? Arrays.copyOf(byteArray, byteArray.length) : null;
        return new gy9(fy9Var);
    }

    public final fy9 a() {
        fy9 fy9Var = new fy9();
        fy9Var.a = this.a;
        fy9Var.b = this.b;
        fy9Var.c = this.c;
        fy9Var.d = this.d;
        fy9Var.e = this.e;
        fy9Var.f = this.f;
        fy9Var.g = this.g;
        fy9Var.h = this.h;
        return fy9Var;
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putString(i, this.a.toString());
        Uri uri = this.b;
        if (uri != null) {
            bundle.putParcelable(j, uri);
        }
        g98 g98Var = this.c;
        if (!g98Var.isEmpty()) {
            Bundle bundle2 = new Bundle();
            for (Map.Entry entry : g98Var.entrySet()) {
                bundle2.putString((String) entry.getKey(), (String) entry.getValue());
            }
            bundle.putBundle(k, bundle2);
        }
        boolean z = this.d;
        if (z) {
            bundle.putBoolean(l, z);
        }
        boolean z2 = this.e;
        if (z2) {
            bundle.putBoolean(m, z2);
        }
        boolean z3 = this.f;
        if (z3) {
            bundle.putBoolean(n, z3);
        }
        c98 c98Var = this.g;
        if (!c98Var.isEmpty()) {
            bundle.putIntegerArrayList(o, new ArrayList<>(c98Var));
        }
        byte[] bArr = this.h;
        if (bArr != null) {
            bundle.putByteArray(p, bArr);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gy9)) {
            return false;
        }
        gy9 gy9Var = (gy9) obj;
        if (this.a.equals(gy9Var.a) && Objects.equals(this.b, gy9Var.b) && Objects.equals(this.c, gy9Var.c) && this.d == gy9Var.d && this.f == gy9Var.f && this.e == gy9Var.e) {
            c98 c98Var = gy9Var.g;
            c98 c98Var2 = this.g;
            c98Var2.getClass();
            if (j8f.a(c98Var2, c98Var) && Arrays.equals(this.h, gy9Var.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Uri uri = this.b;
        return Arrays.hashCode(this.h) + ((this.g.hashCode() + ((((((((this.c.hashCode() + ((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31)) * 31) + (this.d ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31)) * 31);
    }
}
