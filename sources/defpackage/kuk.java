package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public abstract class kuk {
    public static final Object a(mj9 mj9Var, jpa jpaVar, n17 n17Var) {
        Object objC = mj9Var.c(jpaVar);
        if (objC != null) {
            return objC;
        }
        Object objInvoke = n17Var.invoke(jpaVar);
        mj9Var.d(jpaVar, objInvoke);
        return objInvoke;
    }

    public static ru b(uq uqVar) {
        int i;
        boolean z = uqVar.f;
        u8b u8bVar = new u8b();
        boolean z2 = uqVar.f;
        long j = uqVar.a;
        i8b i8bVar = uqVar.e;
        int i2 = i8bVar.b;
        long[] jArrCopyOf = i2 == 0 ? ui9.b : new long[i2];
        int i3 = i8bVar.b;
        if (i3 == 0) {
            i = 0;
        } else {
            int i4 = i3 + 0;
            if (jArrCopyOf.length < i4) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, Math.max(i4, (jArrCopyOf.length * 3) / 2));
            }
            System.arraycopy(i8bVar.a, 0, jArrCopyOf, 0, i8bVar.b);
            i = i8bVar.b + 0;
        }
        for (int i5 = 0; i5 < i; i5++) {
            if (i5 < 0 || i5 >= i) {
                gol.e("Index must be between 0 and size");
                throw null;
            }
            long j2 = jArrCopyOf[i5];
            u8bVar.b(new e5i(Boolean.valueOf(z2), Long.valueOf(j), Long.valueOf(j2)));
            z2 = !z2;
            j = 1 + j2;
        }
        u8bVar.b(new e5i(Boolean.valueOf(z2), Long.valueOf(j), Long.valueOf(uqVar.c)));
        return new ru(u8bVar, z);
    }

    public static Parcelable c(Bundle bundle, String str) {
        ClassLoader classLoader = kuk.class.getClassLoader();
        yab.s(classLoader);
        bundle.setClassLoader(classLoader);
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            return null;
        }
        bundle2.setClassLoader(classLoader);
        return bundle2.getParcelable(str);
    }

    public static void d(Bundle bundle, Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return;
        }
        Parcelable parcelableC = c(bundle, "MapOptions");
        if (parcelableC != null) {
            e(bundle2, "MapOptions", parcelableC);
        }
        Parcelable parcelableC2 = c(bundle, "StreetViewPanoramaOptions");
        if (parcelableC2 != null) {
            e(bundle2, "StreetViewPanoramaOptions", parcelableC2);
        }
        Parcelable parcelableC3 = c(bundle, "camera");
        if (parcelableC3 != null) {
            e(bundle2, "camera", parcelableC3);
        }
        if (bundle.containsKey("position")) {
            bundle2.putString("position", bundle.getString("position"));
        }
        if (bundle.containsKey("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT")) {
            bundle2.putBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", bundle.getBoolean("com.google.android.wearable.compat.extra.LOWBIT_AMBIENT", false));
        }
    }

    public static void e(Bundle bundle, String str, Parcelable parcelable) {
        ClassLoader classLoader = kuk.class.getClassLoader();
        yab.s(classLoader);
        bundle.setClassLoader(classLoader);
        Bundle bundle2 = bundle.getBundle("map_state");
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        bundle2.setClassLoader(classLoader);
        bundle2.putParcelable(str, parcelable);
        bundle.putBundle("map_state", bundle2);
    }
}
