package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import androidx.fragment.app.b;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public abstract class n9 extends np4 {
    public static void N(ar arVar) {
        arVar.finishAffinity();
    }

    public static void O(Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new Handler(activity.getMainLooper()).post(new c3(2, activity));
        }
    }

    public static void P(b bVar, String[] strArr, int i) {
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (TextUtils.isEmpty(strArr[i2])) {
                ore.p(zo5.w(new StringBuilder("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
                return;
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i2], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i2));
            }
        }
        int size = hashSet.size();
        String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i3 = 0;
            for (int i4 = 0; i4 < strArr.length; i4++) {
                if (!hashSet.contains(Integer.valueOf(i4))) {
                    strArr2[i3] = strArr[i4];
                    i3++;
                }
            }
        }
        bVar.requestPermissions(strArr, i);
    }

    public static void Q(b bVar, Intent intent, int i, Bundle bundle) {
        bVar.startActivityForResult(intent, i, bundle);
    }

    public static void R(b bVar, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        bVar.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
