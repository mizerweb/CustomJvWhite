package com.google.android.play.core.install;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import defpackage.gmk;
import defpackage.nbh;
import defpackage.ore;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class InstallException extends ApiException {
    /* JADX WARN: Code duplicated, block: B:8:0x0034  */
    /* JADX WARN: Illegal instructions before constructor call */
    public InstallException(int i) {
        String strV;
        Locale locale = Locale.getDefault();
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = gmk.a;
        Integer numValueOf2 = Integer.valueOf(i);
        if (map.containsKey(numValueOf2)) {
            HashMap map2 = gmk.b;
            if (map2.containsKey(numValueOf2)) {
                strV = nbh.v((String) map.get(numValueOf2), " (https://developer.android.com/reference/com/google/android/play/core/install/model/InstallErrorCode#", (String) map2.get(numValueOf2), ")");
            } else {
                strV = "";
            }
        } else {
            strV = "";
        }
        super(new Status(i, String.format(locale, "Install Error(%d): %s", numValueOf, strV), null, null));
        if (i != 0) {
            return;
        }
        ore.p("errorCode should not be 0.");
        throw null;
    }
}
