package com.facebook.soloader;

import android.os.Trace;
import defpackage.nbh;
import defpackage.zo5;

/* JADX INFO: loaded from: classes2.dex */
class Api18TraceUtils {
    public static void a(String str, String str2, String str3) {
        String strP = zo5.p(str, str2, str3);
        if (strP.length() > 127 && str2 != null) {
            int length = (127 - str.length()) - str3.length();
            StringBuilder sbC = nbh.C(str);
            sbC.append(str2.substring(0, length));
            sbC.append(str3);
            strP = sbC.toString();
        }
        Trace.beginSection(strP);
    }
}
