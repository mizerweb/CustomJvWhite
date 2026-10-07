package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.PowerManager;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.a;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class wsc {
    public static final String[] e = {"android.permission.READ_CONTACTS"};
    public static final String[] f = {"android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS"};
    public static final String[] g = {"android.permission.READ_CONTACTS"};
    public static final String[] h = {"android.permission.WRITE_CONTACTS"};
    public static final String[] i = {"android.permission.RECORD_AUDIO"};
    public static final String[] j = {"android.permission.CAMERA", "android.permission.RECORD_AUDIO", "android.permission.READ_PHONE_STATE"};
    public static final String[] k = {"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
    public static final String[] l = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};
    public static final String[] m;
    public static final String[] n;
    public static final String[] o;
    public static final String[] p;
    public static final String[] q;
    public static final String[] r;
    public final Context a;
    public final lsi b;
    public final fbc c;
    public final ConcurrentHashMap d = new ConcurrentHashMap();

    static {
        String[] strArr;
        String[] strArr2 = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            Object[] objArrCopyOf = Arrays.copyOf(strArr2, 3);
            objArrCopyOf[2] = "android.permission.ACCESS_BACKGROUND_LOCATION";
        }
        m = new String[]{"android.permission.POST_NOTIFICATIONS"};
        String[] strArr3 = {"android.permission.CAMERA"};
        n = strArr3;
        if (i2 >= 34) {
            strArr = new String[]{"android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"};
        } else if (i2 >= 33) {
            strArr = new String[]{"android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_IMAGES"};
        } else {
            v3f.a.getClass();
            strArr = u3f.c;
        }
        o = strArr;
        p = (String[]) a.j1(strArr, strArr3);
        q = new String[]{"android.permission.USE_FULL_SCREEN_INTENT"};
        r = new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
    }

    public wsc(Context context, lsi lsiVar) {
        this.a = context;
        this.b = lsiVar;
        this.c = new fbc(context, 8);
    }

    public static void h(wsc wscVar, svj svjVar, String[] strArr, int i2, boolean z, int i3, int i4, lsc lscVar, iua iuaVar, int i5) {
        iua iuaVar2 = (i5 & np0.n) != 0 ? null : iuaVar;
        if (z || r(svjVar, strArr)) {
            svjVar.a(strArr, i2, i4, i3, R.string.permissions_dialog_yes, lscVar);
        } else if (iuaVar2 == null || !wscVar.c.r(strArr)) {
            wscVar.m(svjVar, strArr, i2);
        } else {
            iuaVar2.invoke();
        }
    }

    public static void i(wsc wscVar, svj svjVar) {
        fbc fbcVar = wscVar.c;
        String[] strArr = f;
        boolean z = !fbcVar.r(strArr);
        wscVar.getClass();
        h(wscVar, svjVar, strArr, 156, z, R.string.permissions_contacts_request_rationale, R.string.permissions_contacts_request, new jsc(R.drawable.contacts_avd), null, np0.n);
    }

    public static void q(wsc wscVar, svj svjVar, String[] strArr, int i2, int i3, int i4, jsc jscVar, int i5) {
        int i6 = (i5 & 16) != 0 ? R.string.permissions_allow_access : i4;
        jsc jscVar2 = (i5 & 32) != 0 ? null : jscVar;
        wscVar.getClass();
        h(wscVar, svjVar, strArr, i2, false, i3, i6, jscVar2, null, 320);
    }

    public static boolean r(svj svjVar, String[] strArr) {
        for (String str : strArr) {
            if (svjVar.d(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean s(String[] strArr, int[] iArr, String[] strArr2) {
        for (String str : strArr2) {
            int iE1 = a.e1(strArr, str);
            Integer numValueOf = Integer.valueOf(iE1);
            if (iE1 < 0) {
                numValueOf = null;
            }
            if (numValueOf == null || iArr[numValueOf.intValue()] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void t(svj svjVar, String[] strArr, int[] iArr, int i2, int i3) {
        int i4;
        rw rwVar = new rw(1, new d2(3, strArr));
        int iP0 = wm9.P0(yw3.W0(rwVar, 10));
        if (iP0 < 16) {
            iP0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iP0);
        Iterator it = rwVar.iterator();
        while (true) {
            sv5 sv5Var = (sv5) it;
            boolean z = false;
            if (!sv5Var.b.hasNext()) {
                break;
            }
            dd8 dd8Var = (dd8) sv5Var.next();
            int i5 = dd8Var.a;
            String str = (String) dd8Var.b;
            if (iArr[i5] == 0) {
                z = true;
            }
            linkedHashMap.put(str, Boolean.valueOf(z));
        }
        Object obj = linkedHashMap.get("android.permission.READ_MEDIA_VIDEO");
        Boolean bool = Boolean.TRUE;
        if ((cqk.d(obj, bool) && cqk.d(linkedHashMap.get("android.permission.READ_MEDIA_IMAGES"), bool)) || cqk.d(linkedHashMap.get("android.permission.READ_MEDIA_VISUAL_USER_SELECTED"), bool)) {
            return;
        }
        v3f.a.getClass();
        for (String str2 : u3f.c) {
            if (!cqk.d(linkedHashMap.get("android.permission.READ_MEDIA_VIDEO"), Boolean.TRUE)) {
                svj.e(svjVar, i2, Integer.valueOf(i3), null, null, false, null, 60);
                return;
            }
        }
    }

    public static boolean u(svj svjVar, String[] strArr, int[] iArr, String[] strArr2, int i2, int i3, jsc jscVar) {
        if (s(strArr, iArr, strArr2)) {
            gm0.n("wsc", "all permissions granted");
            return true;
        }
        if (r(svjVar, strArr2)) {
            gm0.n("wsc", "some permissions denied");
            return false;
        }
        svj.e(svjVar, i2, Integer.valueOf(i3), null, jscVar, false, null, 48);
        gm0.n("wsc", "some permissions denied forever");
        return false;
    }

    public static /* synthetic */ boolean v(wsc wscVar, svj svjVar, String[] strArr, int[] iArr, String[] strArr2, int i2, int i3, int i4) {
        wscVar.getClass();
        return u(svjVar, strArr, iArr, strArr2, i2, i3, null);
    }

    public final boolean a(svj svjVar, boolean z) {
        if (c(j)) {
            return true;
        }
        String[] strArr = i;
        if (!z && c(strArr)) {
            return true;
        }
        if (z) {
            m(svjVar, (String[]) a.j1(strArr, n), 178);
            return false;
        }
        m(svjVar, strArr, 178);
        return false;
    }

    public final boolean b() {
        Context context = this.a;
        return ((PowerManager) context.getSystemService("power")).isIgnoringBatteryOptimizations(context.getPackageName());
    }

    public final boolean c(String[] strArr) {
        for (String str : strArr) {
            if (np4.c(this.a, str) != 0) {
                return false;
            }
        }
        return true;
    }

    public final void d() {
        Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            ((usc) it.next()).e();
        }
    }

    public final boolean e() {
        int i2 = Build.VERSION.SDK_INT;
        Context context = this.a;
        if (i2 >= 33) {
            return np4.c(context, "android.permission.POST_NOTIFICATIONS") == 0;
        }
        return new umb(context).b.areNotificationsEnabled();
    }

    public final boolean f() {
        if (c(o)) {
            return true;
        }
        return Build.VERSION.SDK_INT >= 34 ? c(new String[]{"android.permission.READ_MEDIA_VISUAL_USER_SELECTED"}) : false;
    }

    public final xx6 g(String str, af7 af7Var) {
        return (xx6) this.d.computeIfAbsent(str, new mm(15, new vsc(0, af7Var)));
    }

    public final void j(svj svjVar, boolean z) {
        Integer numValueOf = Integer.valueOf(R.string.permissions_post_notification_request_rationale);
        int i2 = Build.VERSION.SDK_INT;
        Context context = this.a;
        if (i2 < 33) {
            String str = sj8.a;
            svj.e(svjVar, R.string.permissions_post_notification_request_title, numValueOf, sj8.e(context), new ksc(R.raw.bell_anim), false, null, 48);
            return;
        }
        String[] strArr = m;
        if (r(svjVar, strArr) || !this.c.r(strArr)) {
            gm0.n("wsc", "rationalePermissionRequest for post notification permission");
            svjVar.a(strArr, 177, R.string.permissions_post_notification_request_title, R.string.permissions_post_notification_request_rationale, R.string.permissions_post_notification_request_positive_button, new ksc(R.raw.bell_anim));
        } else if (z) {
            gm0.n("wsc", "Force show settings for post notification permission");
            String str2 = sj8.a;
            svj.e(svjVar, R.string.permissions_post_notification_request_title, numValueOf, sj8.e(context), new ksc(R.raw.bell_anim), false, null, 48);
        }
    }

    public final void k(svj svjVar, int i2) {
        q(this, svjVar, i, 160, i2, R.string.permissions_audio_title, null, 32);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:18:0x003b  */
    /* JADX WARN: Code duplicated, block: B:19:0x003f  */
    public final void l(svj svjVar) {
        int i2;
        switch (Build.MANUFACTURER.toLowerCase(Locale.ROOT)) {
            case "huawei":
                i2 = R.string.permission_request_ignore_battery_optimizations_huawei;
                break;
            case "xiaomi":
                i2 = R.string.permission_request_ignore_battery_optimizations_xiaomi;
                break;
            case "honor":
                i2 = R.string.permission_request_ignore_battery_optimizations_huawei;
                break;
            case "tecno":
                i2 = R.string.permission_request_ignore_battery_optimizations_tecno;
                break;
            default:
                i2 = R.string.permission_request_ignore_battery_optimizations;
                break;
        }
        Integer numValueOf = Integer.valueOf(i2);
        String str = sj8.a;
        svj.e(svjVar, R.string.permission_request_ignore_battery_optimizations_title, numValueOf, sj8.f(this.a), new isc(R.drawable.warning_fill_avd, Collections.singletonList("triangle"), xw3.P0("line", "dot"), 500L), false, Integer.valueOf(R.string.permissions_dialog_go_to_settings), 16);
    }

    public final void m(svj svjVar, String[] strArr, int i2) {
        svjVar.c(i2, strArr);
        SharedPreferences.Editor editorEdit = ((SharedPreferences) ((ifh) this.c.c).getValue()).edit();
        for (String str : strArr) {
            editorEdit.putBoolean(str + "_req", true);
        }
        editorEdit.apply();
    }

    public final void n(svj svjVar) {
        q(this, svjVar, n, 158, R.string.permissions_camera_request_photo, 0, null, 48);
    }

    public final void o(svj svjVar) {
        m(svjVar, o, 157);
    }

    public final void p(svj svjVar) {
        q(this, svjVar, n, 159, R.string.permissions_camera_request_video, 0, null, 48);
    }
}
