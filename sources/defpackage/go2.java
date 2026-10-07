package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
public final class go2 implements c4i {
    public final ex8 a;
    public final ConnectivityManager b;
    public final Context c;
    public final URL d;
    public final pt3 e;
    public final pt3 f;
    public final int g;

    public go2(Context context, pt3 pt3Var, pt3 pt3Var2) {
        ft8 ft8Var = new ft8();
        dul.d.e(ft8Var);
        ft8Var.d = true;
        this.a = new ex8(19, ft8Var);
        this.c = context;
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = b(g71.c);
        this.e = pt3Var2;
        this.f = pt3Var;
        this.g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(qv1.k("Invalid url: ", str), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:30:0x010b  */
    public final kh0 a(kh0 kh0Var) {
        int type;
        int subtype;
        HashMap map;
        NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        js8 js8VarC = kh0Var.c();
        int i = Build.VERSION.SDK_INT;
        HashMap map2 = (HashMap) js8VarC.f;
        if (map2 == null) {
            ore.k("Property \"autoMetadata\" has not been set");
            return null;
        }
        map2.put("sdk-version", String.valueOf(i));
        js8VarC.i("model", Build.MODEL);
        js8VarC.i("hardware", Build.HARDWARE);
        js8VarC.i("device", Build.DEVICE);
        js8VarC.i("product", Build.PRODUCT);
        js8VarC.i("os-uild", Build.ID);
        js8VarC.i(AnalyticsBaseParamsConstantsKt.MANUFACTURER, Build.MANUFACTURER);
        js8VarC.i("fingerprint", Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
        HashMap map3 = (HashMap) js8VarC.f;
        if (map3 == null) {
            ore.k("Property \"autoMetadata\" has not been set");
            return null;
        }
        map3.put("tz-offset", String.valueOf(offset));
        int i2 = -1;
        if (activeNetworkInfo == null) {
            SparseArray sparseArray = scb.a;
            type = -1;
        } else {
            type = activeNetworkInfo.getType();
        }
        HashMap map4 = (HashMap) js8VarC.f;
        if (map4 == null) {
            ore.k("Property \"autoMetadata\" has not been set");
            return null;
        }
        map4.put("net-type", String.valueOf(type));
        if (activeNetworkInfo != null) {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                SparseArray sparseArray2 = rcb.a;
                subtype = 100;
            } else if (((rcb) rcb.a.get(subtype)) == null) {
            }
            map = (HashMap) js8VarC.f;
            if (map != null) {
                ore.k("Property \"autoMetadata\" has not been set");
                return null;
            }
            map.put("mobile-subtype", String.valueOf(subtype));
            js8VarC.i("country", Locale.getDefault().getCountry());
            js8VarC.i("locale", Locale.getDefault().getLanguage());
            Context context = this.c;
            js8VarC.i("mcc_mnc", ((TelephonyManager) context.getSystemService("phone")).getSimOperator());
            try {
                i2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException e) {
                e2k.b("CctTransportBackend", "Unable to find version code for package", e);
            }
            js8VarC.i("application_build", Integer.toString(i2));
            return js8VarC.j();
        }
        SparseArray sparseArray3 = rcb.a;
        subtype = 0;
        map = (HashMap) js8VarC.f;
        if (map != null) {
            ore.k("Property \"autoMetadata\" has not been set");
            return null;
        }
        map.put("mobile-subtype", String.valueOf(subtype));
        js8VarC.i("country", Locale.getDefault().getCountry());
        js8VarC.i("locale", Locale.getDefault().getLanguage());
        Context context2 = this.c;
        js8VarC.i("mcc_mnc", ((TelephonyManager) context2.getSystemService("phone")).getSimOperator());
        i2 = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode;
        js8VarC.i("application_build", Integer.toString(i2));
        return js8VarC.j();
    }
}
