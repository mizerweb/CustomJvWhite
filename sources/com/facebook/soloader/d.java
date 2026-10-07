package com.facebook.soloader;

import android.os.StrictMode;
import android.os.Trace;
import defpackage.dvk;
import defpackage.o7j;
import defpackage.qt4;
import defpackage.t36;
import defpackage.u36;
import defpackage.vql;
import defpackage.vya;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d {
    static {
        new ReentrantReadWriteLock();
    }

    public static String[] a(String str, t36 t36Var) {
        boolean z = SoLoader.a;
        if (z) {
            Api18TraceUtils.a("soloader.NativeDeps.getDependencies[", str, "]");
        }
        try {
            try {
                String[] strArrA = dvk.a(t36Var);
                if (z) {
                    Trace.endSection();
                }
                return strArrA;
            } catch (vya e) {
                throw vql.b(str, e);
            }
        } catch (Throwable th) {
            if (SoLoader.a) {
                Trace.endSection();
            }
            throw th;
        }
    }

    public static void b(String str, u36 u36Var, int i, StrictMode.ThreadPolicy threadPolicy) {
        String[] strArrA = a(str, u36Var);
        StringBuilder sbV = qt4.v("Loading ", str, "'s dependencies: ");
        sbV.append(Arrays.toString(strArrA));
        o7j.b("SoLoader", sbV.toString());
        for (String str2 : strArrA) {
            if (!str2.startsWith("/")) {
                SoLoader.m(str2, null, i | 1, threadPolicy);
            }
        }
    }
}
