package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class emf {
    public static final ghe d = c98.r(40010);
    public static final ghe e;
    public static final String f;
    public static final String g;
    public static final String h;
    public final int a;
    public final String b;
    public final Bundle c;

    static {
        Object[] objArr = {50000, 50001, 50002, 50003, 50004, 50005, 50006};
        ch3.e(objArr, 7);
        e = c98.j(objArr, 7);
        String str = vqi.a;
        f = Integer.toString(0, 36);
        g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
    }

    public emf(int i) {
        lvb.O("commandCode shouldn't be COMMAND_CODE_CUSTOM", i != 0);
        this.a = i;
        this.b = "";
        this.c = Bundle.EMPTY;
    }

    public static emf a(Bundle bundle) {
        int i = bundle.getInt(f, 0);
        if (i != 0) {
            return new emf(i);
        }
        String string = bundle.getString(g);
        string.getClass();
        Bundle bundleN = vqi.n(bundle.getBundle(h));
        if (bundleN == null) {
            bundleN = Bundle.EMPTY;
        }
        return new emf(string, bundleN);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt(f, this.a);
        bundle.putString(g, this.b);
        bundle.putBundle(h, this.c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof emf)) {
            return false;
        }
        emf emfVar = (emf) obj;
        return this.a == emfVar.a && TextUtils.equals(this.b, emfVar.b);
    }

    public final int hashCode() {
        return Objects.hash(this.b, Integer.valueOf(this.a));
    }

    public emf(String str, Bundle bundle) {
        this.a = 0;
        str.getClass();
        this.b = str;
        bundle.getClass();
        this.c = new Bundle(bundle);
    }
}
