package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
public abstract class z4e {
    public static final String a;

    static {
        String str = vqi.a;
        a = Integer.toString(0, 36);
    }

    public static z4e a(Bundle bundle) {
        String str = a;
        int i = bundle.getInt(str, -1);
        if (i == 0) {
            String str2 = ru7.d;
            lvb.R(bundle.getInt(str, -1) == 0);
            return bundle.getBoolean(ru7.d, false) ? new ru7(bundle.getBoolean(ru7.e, false)) : new ru7();
        }
        if (i == 1) {
            String str3 = iqc.c;
            lvb.R(bundle.getInt(str, -1) == 1);
            float f = bundle.getFloat(iqc.c, -1.0f);
            return f == -1.0f ? new iqc() : new iqc(f);
        }
        if (i == 2) {
            String str4 = wgg.d;
            lvb.R(bundle.getInt(str, -1) == 2);
            int i2 = bundle.getInt(wgg.d, 5);
            float f2 = bundle.getFloat(wgg.e, -1.0f);
            return f2 == -1.0f ? new wgg(i2) : new wgg(i2, f2);
        }
        if (i != 3) {
            ore.p(zo5.h(i, "Unknown RatingType: "));
            return null;
        }
        String str5 = orh.d;
        lvb.R(bundle.getInt(str, -1) == 3);
        return bundle.getBoolean(orh.d, false) ? new orh(bundle.getBoolean(orh.e, false)) : new orh();
    }

    public abstract boolean b();

    public abstract Bundle c();
}
