package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ouk {
    public static final mw a(ylc... ylcVarArr) {
        mw mwVar = new mw(ylcVarArr.length);
        for (ylc ylcVar : ylcVarArr) {
            mwVar.put(ylcVar.a, ylcVar.b);
        }
        return mwVar;
    }

    public static boolean b() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            ov6.b();
            ov6 ov6VarB = ov6.b();
            ov6VarB.a();
            Context context = ov6VarB.a;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), np0.m)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:117:0x012b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x0165 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x0145 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x0136  */
    /* JADX WARN: Code duplicated, block: B:87:0x014f  */
    /* JADX WARN: Code duplicated, block: B:89:0x0159  */
    /* JADX WARN: Code duplicated, block: B:90:0x015b  */
    public static void c(Intent intent) {
        long j;
        ov6 ov6VarB;
        yv6 yv6Var;
        String str;
        String str2;
        String[] strArrSplit;
        String str3;
        if (e(intent)) {
            d(intent.getExtras(), "_nr");
        }
        int iIntValue = 0;
        if ((intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction())) ? false : b()) {
            d4i d4iVar = (d4i) FirebaseMessaging.k.get();
            if (d4iVar == null) {
                Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
                return;
            }
            hwa hwaVar = null;
            str = null;
            String str4 = null;
            if (intent != null) {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    extras = Bundle.EMPTY;
                }
                Object obj = extras.get("google.ttl");
                if (obj instanceof Integer) {
                    iIntValue = ((Integer) obj).intValue();
                } else if (obj instanceof String) {
                    try {
                        iIntValue = Integer.parseInt((String) obj);
                    } catch (NumberFormatException unused) {
                        Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
                    }
                }
                int i = iIntValue;
                String string = extras.getString("google.to");
                if (TextUtils.isEmpty(string)) {
                    try {
                        string = (String) gwl.a(sv6.d(ov6.b()).c());
                    } catch (InterruptedException | ExecutionException e) {
                        qr7.o(e);
                        return;
                    }
                }
                String str5 = string;
                ov6 ov6VarB2 = ov6.b();
                ov6VarB2.a();
                String packageName = ov6VarB2.a.getPackageName();
                fwa fwaVar = up4.A(extras) ? fwa.DISPLAY_NOTIFICATION : fwa.DATA_MESSAGE;
                String string2 = extras.getString("google.message_id");
                if (string2 == null) {
                    string2 = extras.getString("message_id");
                }
                String str6 = string2 != null ? string2 : "";
                String string3 = extras.getString("from");
                if (string3 != null && string3.startsWith("/topics/")) {
                    str4 = string3;
                }
                String str7 = str4 != null ? str4 : "";
                String string4 = extras.getString("collapse_key");
                String str8 = string4 != null ? string4 : "";
                String string5 = extras.getString("google.c.a.m_l");
                String str9 = string5 != null ? string5 : "";
                String string6 = extras.getString("google.c.a.c_l");
                String str10 = string6 != null ? string6 : "";
                if (extras.containsKey("google.c.sender.id")) {
                    try {
                        j = Long.parseLong(extras.getString("google.c.sender.id"));
                    } catch (NumberFormatException e2) {
                        Log.w("FirebaseMessaging", "error parsing project number", e2);
                        ov6VarB = ov6.b();
                        yv6Var = ov6VarB.c;
                        ov6VarB.a();
                        str = yv6Var.e;
                        if (str != null) {
                            try {
                                j = Long.parseLong(str);
                            } catch (NumberFormatException e3) {
                                Log.w("FirebaseMessaging", "error parsing sender ID", e3);
                                ov6VarB.a();
                                str2 = yv6Var.b;
                                if (str2.startsWith("1:")) {
                                    strArrSplit = str2.split(":");
                                    if (strArrSplit.length < 2) {
                                        j = 0;
                                    } else {
                                        str3 = strArrSplit[1];
                                        if (str3.isEmpty()) {
                                            j = 0;
                                        } else {
                                            try {
                                                j = Long.parseLong(str3);
                                            } catch (NumberFormatException e4) {
                                                Log.w("FirebaseMessaging", "error parsing app ID", e4);
                                                j = 0;
                                            }
                                        }
                                    }
                                } else {
                                    try {
                                        j = Long.parseLong(str2);
                                    } catch (NumberFormatException e5) {
                                        Log.w("FirebaseMessaging", "error parsing app ID", e5);
                                        j = 0;
                                    }
                                }
                            }
                        } else {
                            ov6VarB.a();
                            str2 = yv6Var.b;
                            if (str2.startsWith("1:")) {
                                j = Long.parseLong(str2);
                            } else {
                                strArrSplit = str2.split(":");
                                if (strArrSplit.length < 2) {
                                    j = 0;
                                } else {
                                    str3 = strArrSplit[1];
                                    if (str3.isEmpty()) {
                                        j = 0;
                                    } else {
                                        j = Long.parseLong(str3);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    ov6VarB = ov6.b();
                    yv6Var = ov6VarB.c;
                    ov6VarB.a();
                    str = yv6Var.e;
                    if (str != null) {
                        j = Long.parseLong(str);
                    } else {
                        ov6VarB.a();
                        str2 = yv6Var.b;
                        if (str2.startsWith("1:")) {
                            j = Long.parseLong(str2);
                        } else {
                            strArrSplit = str2.split(":");
                            if (strArrSplit.length < 2) {
                                j = 0;
                            } else {
                                str3 = strArrSplit[1];
                                if (str3.isEmpty()) {
                                    j = 0;
                                } else {
                                    j = Long.parseLong(str3);
                                }
                            }
                        }
                    }
                }
                hwaVar = new hwa(j > 0 ? j : 0L, str6, str5, fwaVar, packageName, str8, i, str7, str9, str10);
            }
            if (hwaVar == null) {
                return;
            }
            try {
                ((e4i) d4iVar).a("FCM_CLIENT_EVENT_LOGGING", new z86("proto"), new f4a(23)).a(new jh0(new iwa(hwaVar), vhd.a, new ni0(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)))));
            } catch (RuntimeException e6) {
                Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", e6);
            }
        }
    }

    public static void d(Bundle bundle, String str) {
        try {
            ov6.b();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString("label", string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String string5 = bundle.getString("from");
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                bundle2.putString("_nt", string5);
            }
            String string6 = bundle.getString("google.c.a.ts");
            if (string6 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string6));
                } catch (NumberFormatException e) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e);
                }
            }
            String string7 = bundle.containsKey("google.c.a.udt") ? bundle.getString("google.c.a.udt") : null;
            if (string7 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(string7));
                } catch (NumberFormatException e2) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e2);
                }
            }
            String str2 = up4.A(bundle) ? "display" : "data";
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            ov6 ov6VarB = ov6.b();
            ov6VarB.a();
            if (ov6VarB.d.a(tf.class) == null) {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            } else {
                ore.m();
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    public static boolean e(Intent intent) {
        Bundle extras;
        if (intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return "1".equals(extras.getString("google.c.a.e"));
    }
}
