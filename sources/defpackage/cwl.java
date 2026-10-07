package defpackage;

import android.net.Uri;
import android.os.Build;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import ru.ok.android.externcalls.analytics.internal.upload.UploadHelper;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes3.dex */
public abstract class cwl {
    public static final void a(kjh kjhVar, fkh fkhVar, String str) {
        pkh.i.fine(fkhVar.b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + kjhVar.a);
    }

    public static final String b(n96 n96Var) {
        Object next;
        n96Var.getClass();
        int i = n96Var.j;
        ArrayList arrayList = new ArrayList();
        String str = n96Var.c;
        if (str != null) {
            x05.m("userId", str, arrayList);
        }
        String str2 = n96Var.b;
        if (str2 != null) {
            x05.m(ApiProtocol.KEY_TOKEN, str2, arrayList);
        }
        x05.m(ApiProtocol.PARAM_CONVERSATION_ID, n96Var.a, arrayList);
        if (i >= 6) {
            x05.m("deviceIdx", String.valueOf(n96Var.d), arrayList);
        }
        Long l = n96Var.h;
        if (l != null) {
            x05.m(ApiProtocol.PARAM_PEER_ID, String.valueOf(l.longValue()), arrayList);
        }
        Locale locale = n96Var.p;
        if (locale != null) {
            x05.m("locale", locale.getLanguage(), arrayList);
        }
        x05.m("version", String.valueOf(i), arrayList);
        x05.m(ApiProtocol.PARAM_CAPABILITIES, n96Var.k, arrayList);
        arrayList.add(new ylc("device", zo5.p(Build.MANUFACTURER, "/", Build.MODEL)));
        arrayList.add(new ylc("platform", UploadHelper.SDK_TYPE_STRING));
        x05.m("clientType", n96Var.i, arrayList);
        x05.m("appVersion", n96Var.g, arrayList);
        x05.m("osVersion", String.valueOf(Build.VERSION.SDK_INT), arrayList);
        x05.m("ispAsOrg", n96Var.m, arrayList);
        x05.m("locCc", n96Var.n, arrayList);
        x05.m("locReg", n96Var.o, arrayList);
        Integer num = n96Var.l;
        if (num != null) {
            x05.m("ispAsNo", String.valueOf(num.intValue()), arrayList);
        }
        String str3 = n96Var.q;
        if (str3 != null) {
            x05.m("compression", str3, arrayList);
        }
        long j = n96Var.r;
        if (j > 0) {
            x05.m("recoverTs", String.valueOf(j), arrayList);
        }
        Uri.Builder builderBuildUpon = Uri.parse(n96Var.e).buildUpon();
        builderBuildUpon.getClass();
        Uri uriBuild = builderBuildUpon.build();
        Set<String> queryParameterNames = uriBuild.getQueryParameterNames();
        ArrayList arrayList2 = new ArrayList();
        queryParameterNames.getClass();
        for (String str4 : queryParameterNames) {
            List<String> queryParameters = uriBuild.getQueryParameters(str4);
            queryParameters.getClass();
            for (String str5 : queryParameters) {
                Iterator it = arrayList.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!cqk.d(((ylc) next).a, str4));
                ylc ylcVar = (ylc) next;
                if (ylcVar == null) {
                    x05.m(str4, str5, arrayList2);
                } else {
                    arrayList2.add(new ylc(str4, ylcVar.b));
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList) {
            if (!queryParameterNames.contains(((ylc) obj).a)) {
                arrayList3.add(obj);
            }
        }
        int size = arrayList3.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj2 = arrayList3.get(i3);
            i3++;
            arrayList2.add((ylc) obj2);
        }
        builderBuildUpon.clearQuery();
        int size2 = arrayList2.size();
        while (i2 < size2) {
            Object obj3 = arrayList2.get(i2);
            i2++;
            ylc ylcVar2 = (ylc) obj3;
            builderBuildUpon.appendQueryParameter((String) ylcVar2.a, (String) ylcVar2.b);
        }
        String string = builderBuildUpon.build().toString();
        string.getClass();
        return string;
    }

    public static final String c(long j) {
        String strM;
        if (j <= -999500000) {
            strM = c0a.m((j - 500000000) / 1000000000, " s ", new StringBuilder());
        } else if (j <= -999500) {
            strM = c0a.m((j - 500000) / 1000000, " ms", new StringBuilder());
        } else if (j <= 0) {
            strM = c0a.m((j - 500) / 1000, " µs", new StringBuilder());
        } else if (j < 999500) {
            strM = c0a.m((j + 500) / 1000, " µs", new StringBuilder());
        } else if (j < 999500000) {
            strM = c0a.m((j + 500000) / 1000000, " ms", new StringBuilder());
        } else {
            strM = c0a.m((j + 500000000) / 1000000000, " s ", new StringBuilder());
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{strM}, 1));
    }
}
