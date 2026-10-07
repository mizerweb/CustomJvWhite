package defpackage;

import android.net.Uri;
import android.os.Build;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import ru.ok.android.externcalls.analytics.internal.upload.UploadHelper;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes3.dex */
public final class t5g {
    public static final String a(t5g t5gVar, String str, List list, g5g g5gVar) {
        String authority;
        t5gVar.getClass();
        Uri uriBuild = Uri.parse(str);
        uriBuild.getClass();
        list.getClass();
        if (!list.isEmpty() && (authority = uriBuild.getAuthority()) != null) {
            int iIndexOf = list.indexOf(authority);
            if (iIndexOf < 0) {
                iIndexOf = -1;
            }
            int i = iIndexOf + 1;
            if (i >= list.size()) {
                i = 0;
            }
            uriBuild = uriBuild.buildUpon().encodedAuthority((String) list.get(i)).build();
            uriBuild.getClass();
        }
        String string = uriBuild.toString();
        string.getClass();
        g5gVar.d("Provide new endpoint " + string + "\ninstead of " + str);
        return string;
    }

    public static String b(n96 n96Var) {
        n96Var.getClass();
        int i = n96Var.j;
        Uri.Builder builderBuildUpon = Uri.parse(n96Var.e).buildUpon();
        String str = n96Var.c;
        if (str != null) {
            builderBuildUpon.appendQueryParameter("userId", str);
        }
        builderBuildUpon.appendQueryParameter(ApiProtocol.KEY_TOKEN, n96Var.b).appendQueryParameter(ApiProtocol.PARAM_CONVERSATION_ID, n96Var.a);
        if (i >= 6) {
            builderBuildUpon.appendQueryParameter("deviceIdx", String.valueOf(n96Var.d));
        }
        Long l = n96Var.h;
        if (l != null) {
            builderBuildUpon.appendQueryParameter(ApiProtocol.PARAM_PEER_ID, String.valueOf(l.longValue()));
        }
        Locale locale = n96Var.p;
        if (locale != null) {
            builderBuildUpon.appendQueryParameter("locale", locale.getLanguage());
        }
        long j = n96Var.r;
        if (j > 0) {
            builderBuildUpon.appendQueryParameter("recoverTs", String.valueOf(j));
        }
        Uri.Builder builderAppendQueryParameter = builderBuildUpon.appendQueryParameter("version", String.valueOf(i)).appendQueryParameter(ApiProtocol.PARAM_CAPABILITIES, n96Var.k).appendQueryParameter("device", Build.MANUFACTURER + "/" + Build.MODEL).appendQueryParameter("platform", UploadHelper.SDK_TYPE_STRING).appendQueryParameter("clientType", n96Var.i).appendQueryParameter("appVersion", n96Var.g).appendQueryParameter("osVersion", String.valueOf(Build.VERSION.SDK_INT)).appendQueryParameter("ispAsOrg", n96Var.m).appendQueryParameter("locCc", n96Var.n).appendQueryParameter("locReg", n96Var.o);
        Integer num = n96Var.l;
        if (num != null) {
            builderAppendQueryParameter.appendQueryParameter("ispAsNo", String.valueOf(num.intValue()));
        }
        String str2 = n96Var.q;
        if (str2 != null) {
            builderAppendQueryParameter.appendQueryParameter("compression", str2);
        }
        String string = builderAppendQueryParameter.build().toString();
        string.getClass();
        return string;
    }

    public static String c(String str, String str2, String str3) {
        Uri.Builder builderBuildUpon;
        str.getClass();
        str2.getClass();
        str3.getClass();
        Uri uri = Uri.parse(str);
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        if (queryParameterNames.contains(str2)) {
            builderBuildUpon = uri.buildUpon().clearQuery();
            builderBuildUpon.getClass();
            for (String str4 : queryParameterNames) {
                if (str2.equals(str4)) {
                    builderBuildUpon.appendQueryParameter(str4, str3);
                } else {
                    builderBuildUpon.appendQueryParameter(str4, uri.getQueryParameter(str4));
                }
            }
        } else {
            builderBuildUpon = uri.buildUpon();
            builderBuildUpon.getClass();
            builderBuildUpon.appendQueryParameter(str2, str3);
        }
        String string = builderBuildUpon.build().toString();
        string.getClass();
        return string;
    }
}
