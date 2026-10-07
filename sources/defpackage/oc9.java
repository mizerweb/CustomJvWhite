package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.opengl.GLES20;
import android.opengl.GLException;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.util.Log;
import androidx.work.WorkerParameters;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.Buffer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import kotlin.collections.a;
import kotlinx.serialization.SerializationException;
import org.xmlpull.v1.XmlPullParser;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class oc9 {
    public static SimpleDateFormat a;
    public static SimpleDateFormat c;
    public static SimpleDateFormat e;
    public static SimpleDateFormat g;
    public static SimpleDateFormat i;
    public static SimpleDateFormat k;
    public static SimpleDateFormat o;
    public static SimpleDateFormat p;
    public static SimpleDateFormat q;
    public static Boolean r;
    public static SimpleDateFormat t;
    public static boolean y;
    public static int z;
    public static final Object b = new Object();
    public static final Object d = new Object();
    public static final Object f = new Object();
    public static final Object h = new Object();
    public static final Object j = new Object();
    public static final Object l = new Object();
    public static final Object m = new Object();
    public static final Object n = new Object();
    public static final Object s = new Object();
    public static final Object u = new Object();
    public static final a8g v = new a8g(17);
    public static final ghb w = new ghb(22);
    public static final Object x = new Object();

    public static void C(int i2, Buffer buffer) {
        GLES20.glEnableVertexAttribArray(i2);
        o("glEnableVertexAttribArray", new int[0]);
        GLES20.glVertexAttribPointer(i2, 2, 5126, false, 8, buffer);
        o("glVertexAttribPointer", new int[0]);
    }

    public static String D(String str, Object... objArr) {
        int iIndexOf;
        StringBuilder sb = new StringBuilder((objArr.length * 16) + str.length());
        int i2 = 0;
        int i3 = 0;
        while (i2 < objArr.length && (iIndexOf = str.indexOf("%s", i3)) != -1) {
            sb.append(str.substring(i3, iIndexOf));
            sb.append(objArr[i2]);
            i3 = iIndexOf + 2;
            i2++;
        }
        sb.append(str.substring(i3));
        if (i2 < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i2]);
            for (int i4 = i2 + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static String E(Context context, Locale locale, long j2, long j3, boolean z2, boolean z3, boolean z4) {
        long j4 = j3 - j2;
        y35 y35VarN = y35.n(j2, TimeZone.getDefault());
        if (j4 < 86400000) {
            if (S(y35.n(j3, TimeZone.getDefault()), y35.n(j2, TimeZone.getDefault()))) {
                return z3 ? String.format(context.getString(R.string.tt_dates_today_at), F(context, j2, locale)) : F(context, j2, locale);
            }
            if (z4) {
                return j4 < 14400000 ? F(context, j2, locale) : context.getString(R.string.tt_dates_yesterday);
            }
            return String.format(context.getString(R.string.tt_dates_yesterday_at), F(context, j2, locale));
        }
        y35 y35VarN2 = y35.n(j3, TimeZone.getDefault());
        if (y35VarN.r().s(1).equals(y35VarN2.r())) {
            return z4 ? context.getString(R.string.tt_dates_yesterday) : String.format(context.getString(R.string.tt_dates_yesterday_at), F(context, j2, locale));
        }
        if (y35VarN.a.equals(y35VarN2.a)) {
            return z2 ? M(context, locale, j2, false) : L(locale, j2, false);
        }
        return z2 ? M(context, locale, j2, true) : L(locale, j2, true);
    }

    public static String F(Context context, long j2, Locale locale) {
        String str;
        synchronized (b) {
            str = I(context, locale).format(Long.valueOf(j2));
        }
        return str;
    }

    public static String G(Locale locale, long j2) {
        String str;
        synchronized ("d MMMM yyyy") {
            if (q == null) {
                q = new SimpleDateFormat("d MMMM yyyy", locale);
            }
            str = q.format(Long.valueOf(j2));
        }
        return str;
    }

    public static String H(String str) {
        Object poeVar;
        if (str != null) {
            try {
                poeVar = new ns4(str);
            } catch (Throwable th) {
                poeVar = new poe(th);
            }
            if (poeVar instanceof poe) {
                poeVar = null;
            }
            ns4 ns4Var = (ns4) poeVar;
            String str2 = ns4Var != null ? ns4Var.a : null;
            ns4 ns4Var2 = str2 != null ? new ns4(str2) : null;
            String str3 = ns4Var2 != null ? ns4Var2.a : null;
            if (str3 != null) {
                return str3;
            }
        }
        return b0();
    }

    public static DateFormat I(Context context, Locale locale) {
        boolean zBooleanValue;
        if (a == null) {
            synchronized (s) {
                try {
                    if (r == null) {
                        r = Boolean.valueOf(android.text.format.DateFormat.is24HourFormat(context));
                    }
                    zBooleanValue = r.booleanValue();
                } catch (Throwable th) {
                    throw th;
                }
            }
            a = new SimpleDateFormat(zBooleanValue ? "HH:mm" : "h:mm a", locale);
        }
        return a;
    }

    public static dc1 J(long j2, long j3) {
        if (j2 <= 0) {
            return dc1.j();
        }
        long j4 = j3 - j2;
        if (j4 < 0) {
            return dc1.j();
        }
        if (j4 < 60000) {
            return dc1.i();
        }
        if (S(y35.n(j3, TimeZone.getDefault()), y35.n(j2, TimeZone.getDefault()))) {
            if (j4 < 3600000) {
                return dc1.g((int) (j4 / 60000));
            }
            if (j4 < 86400000) {
                return dc1.d((int) (j4 / 3600000));
            }
        }
        if (j4 < 3600000) {
            return dc1.g((int) (j4 / 60000));
        }
        if (j4 < 86400000) {
            return dc1.k(j2);
        }
        if (j4 < 129600000) {
            return dc1.k(0L);
        }
        return y35.n(j2, TimeZone.getDefault()).a.equals(y35.n(j3, TimeZone.getDefault()).a) ? dc1.e(j2) : dc1.c(j2);
    }

    public static String K(Locale locale, long j2, boolean z2) {
        String str;
        String str2;
        if (z2) {
            synchronized (j) {
                if (i == null) {
                    i = new SimpleDateFormat("d MMM yyyy", locale);
                }
                str2 = i.format(Long.valueOf(j2));
            }
            return str2;
        }
        synchronized (h) {
            if (g == null) {
                g = new SimpleDateFormat("d MMM", locale);
            }
            str = g.format(Long.valueOf(j2));
        }
        return str;
    }

    public static String L(Locale locale, long j2, boolean z2) {
        String str;
        String str2;
        if (z2) {
            synchronized (f) {
                if (e == null) {
                    e = new SimpleDateFormat("d MMM yyyy", locale);
                }
                str2 = e.format(Long.valueOf(j2));
            }
            return str2;
        }
        synchronized (d) {
            if (c == null) {
                c = new SimpleDateFormat("d MMM", locale);
            }
            str = c.format(Long.valueOf(j2));
        }
        return str;
    }

    public static String M(Context context, Locale locale, long j2, boolean z2) {
        String strK;
        String string = context.getString(R.string.tt_at);
        if (z2) {
            synchronized (l) {
                if (k == null) {
                    k = new SimpleDateFormat("dd.MM.yy", locale);
                }
                strK = k.format(Long.valueOf(j2));
            }
        } else {
            strK = K(locale, j2, false);
        }
        return String.format(string, strK, F(context, j2, locale));
    }

    public static final int N(fif fifVar, qs8 qs8Var, String str) {
        U(qs8Var, fifVar);
        int iC = fifVar.c(str);
        if (iC != -3 || !qs8Var.a.h) {
            return iC;
        }
        ue4 ue4VarA = xs3.a(qs8Var);
        dx4 dx4Var = new dx4(fifVar, 23, qs8Var);
        ConcurrentHashMap concurrentHashMap = ue4VarA.a;
        Map map = (Map) concurrentHashMap.get(fifVar);
        a8g a8gVar = v;
        Object obj = map != null ? map.get(a8gVar) : null;
        Object objInvoke = obj != null ? obj : null;
        if (objInvoke == null) {
            objInvoke = dx4Var.invoke();
            Object concurrentHashMap2 = concurrentHashMap.get(fifVar);
            if (concurrentHashMap2 == null) {
                concurrentHashMap2 = new ConcurrentHashMap(2);
                concurrentHashMap.put(fifVar, concurrentHashMap2);
            }
            ((Map) concurrentHashMap2).put(a8gVar, objInvoke);
        }
        Integer num = (Integer) ((Map) objInvoke).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public static final int O(fif fifVar, qs8 qs8Var, String str, String str2) {
        int iN = N(fifVar, qs8Var, str);
        if (iN != -3) {
            return iN;
        }
        throw new SerializationException(fifVar.i() + " does not contain element with name '" + str + '\'' + str2);
    }

    public static String P(Context context, String str) {
        String packageName = context.getPackageName();
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier(str, "string", packageName);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public static final boolean Q(int i2, int i3, bne bneVar) {
        if (bneVar == null) {
            return ((float) ((int) (((float) i2) * 1.3333334f))) >= 2048.0f && ((int) (((float) i3) * 1.3333334f)) >= 2048;
        }
        return ((int) (((float) i2) * 1.3333334f)) >= bneVar.a && ((int) (((float) i3) * 1.3333334f)) >= bneVar.b;
    }

    public static final boolean R(p76 p76Var, bne bneVar) {
        if (p76Var == null) {
            return false;
        }
        p76Var.Y();
        int i2 = p76Var.c;
        if (i2 == 90 || i2 == 270) {
            p76Var.Y();
            int i3 = p76Var.f;
            p76Var.Y();
            return Q(i3, p76Var.e, bneVar);
        }
        p76Var.Y();
        int i4 = p76Var.e;
        p76Var.Y();
        return Q(i4, p76Var.f, bneVar);
    }

    public static boolean S(y35 y35Var, y35 y35Var2) {
        return y35Var.c.equals(y35Var2.c) && y35Var.b.equals(y35Var2.b) && y35Var.a.equals(y35Var2.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static thf T(qf7 qf7Var) {
        thf thfVar = new thf();
        thfVar.d = ((mq0) qf7Var).create(thfVar, thfVar);
        return thfVar;
    }

    public static final void U(qs8 qs8Var, fif fifVar) {
        cqk.d(fifVar.d(), c6h.f);
    }

    public static final mw V(Map map) {
        mw mwVar = new mw(map.size());
        mwVar.putAll(map);
        return mwVar;
    }

    public static void W(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
        }
    }

    public static void X() {
        synchronized (b) {
            a = null;
        }
        synchronized (d) {
            c = null;
        }
        synchronized (f) {
            e = null;
        }
        synchronized (h) {
            g = null;
        }
        synchronized (j) {
            i = null;
        }
        synchronized (l) {
            k = null;
        }
        synchronized (m) {
        }
        synchronized (n) {
        }
        synchronized (u) {
            t = null;
        }
        synchronized (s) {
            r = null;
        }
    }

    public static final int[] Y(int i2, kbc kbcVar) {
        if (i2 == R.attr.fading_background_surface_step) {
            return ((oac) ((qg7) kbcVar.r().b).b).a;
        }
        if (i2 == R.attr.fading_background_primary_step) {
            return ((nac) ((qg7) kbcVar.r().b).c).a;
        }
        if (i2 == R.attr.fading_float_primary_step) {
            return ((pac) ((pgg) kbcVar.r().c).a).a;
        }
        if (i2 == R.attr.float_overlay_primary_step) {
            return ((nac) kbcVar.k().r.b).a;
        }
        if (i2 == R.attr.float_overlay_surface_step) {
            return ((oac) kbcVar.k().r.c).a;
        }
        if (i2 == R.attr.float_glass_stroke_step) {
            return kbcVar.k().s.a;
        }
        if (i2 == R.attr.float_scroll_edge_top_step) {
            return ((qac) kbcVar.k().t.b).a;
        }
        if (i2 == R.attr.float_scroll_edge_bottom_step) {
            return ((pac) kbcVar.k().t.c).a;
        }
        if (i2 == R.attr.avatar_chat_coral_step) {
            return ((mac) ((qu) kbcVar.a().a).a).a;
        }
        if (i2 == R.attr.avatar_chat_orange_step) {
            return ((oac) ((qu) kbcVar.a().a).b).a;
        }
        if (i2 == R.attr.avatar_chat_green_step) {
            return ((nac) ((qu) kbcVar.a().a).c).a;
        }
        if (i2 == R.attr.avatar_chat_sky_step) {
            return ((pac) ((qu) kbcVar.a().a).d).a;
        }
        if (i2 == R.attr.avatar_chat_violet_step) {
            return ((qac) ((qu) kbcVar.a().a).e).a;
        }
        if (i2 == R.attr.avatar_call_purple_step) {
            return ((oac) ((ag5) kbcVar.a().b).a).a;
        }
        if (i2 == R.attr.avatar_call_grey_step) {
            return ((nac) ((ag5) kbcVar.a().b).b).a;
        }
        if (i2 == R.attr.avatar_call_aqua_step) {
            return ((mac) ((ag5) kbcVar.a().b).c).a;
        }
        if (i2 == R.attr.avatar_call_sky_step) {
            return ((pac) ((ag5) kbcVar.a().b).d).a;
        }
        if (i2 == R.attr.avatar_call_violet_step) {
            return ((qac) ((ag5) kbcVar.a().b).e).a;
        }
        if (i2 == R.attr.avatar_malachite_step) {
            return ((rac) kbcVar.a().c).c;
        }
        if (i2 == R.attr.avatar_dark_sky_step) {
            return ((rac) kbcVar.a().d).c;
        }
        if (i2 == R.attr.avatar_lilac_step) {
            return ((rac) kbcVar.a().e).c;
        }
        if (i2 == R.attr.avatar_orchid_step) {
            return ((rac) kbcVar.a().f).c;
        }
        if (i2 == R.attr.avatar_tangerine_step) {
            return ((rac) kbcVar.a().g).c;
        }
        if (i2 == R.attr.promo_banner_dk_background_vibrant_step) {
            return ((pac) ((gvb) ((qg7) kbcVar.x().c).b).b).a;
        }
        if (i2 == R.attr.promo_banner_dk_background_fantasy_step) {
            return ((mac) ((gvb) ((qg7) kbcVar.x().c).b).c).a;
        }
        if (i2 == R.attr.promo_banner_dk_background_pale_blue_step) {
            return ((oac) ((gvb) ((qg7) kbcVar.x().c).b).d).a;
        }
        if (i2 == R.attr.promo_banner_dk_background_icon_container_step) {
            return ((nac) ((gvb) ((qg7) kbcVar.x().c).b).a).a;
        }
        if (i2 == R.attr.promo_banner_dk_stroke_icon_container_step) {
            return ((qac) ((t3a) ((qg7) kbcVar.x().c).c).a).a;
        }
        if (i2 == R.attr.promo_disclaimer_step) {
            return ((oac) kbcVar.x().d).a;
        }
        if (i2 == R.attr.promo_button_step) {
            return ((nac) kbcVar.x().e).a;
        }
        if (i2 == R.attr.promo_text_step) {
            return ((pac) kbcVar.x().f).a;
        }
        if (i2 == R.attr.bubbles_incoming_background_bubble_gradient_old_step) {
            return ((xac) kbcVar.f().a).a.k.a;
        }
        if (i2 == R.attr.bubbles_incoming_background_bubble_gradient_step) {
            return ((xac) kbcVar.f().a).a.n.a;
        }
        if (i2 == R.attr.bubbles_incoming_background_system_asset_step) {
            return (int[]) ((xac) kbcVar.f().a).a.o.b;
        }
        if (i2 == R.attr.bubbles_incoming_background_system_asset_stroke_step) {
            return (int[]) ((xac) kbcVar.f().a).a.o.c;
        }
        if (i2 == R.attr.bubbles_outgoing_background_bubble_gradient_old_step) {
            return ((xac) kbcVar.f().b).a.k.a;
        }
        if (i2 == R.attr.bubbles_outgoing_background_bubble_gradient_step) {
            return ((xac) kbcVar.f().b).a.n.a;
        }
        if (i2 == R.attr.bubbles_outgoing_background_system_asset_step) {
            return (int[]) ((xac) kbcVar.f().b).a.o.b;
        }
        if (i2 == R.attr.bubbles_outgoing_background_system_asset_stroke_step) {
            return (int[]) ((xac) kbcVar.f().b).a.o.c;
        }
        if (i2 == R.attr.bubbles_system_step) {
            return (int[]) ((t84) kbcVar.f().c).d;
        }
        if (i2 == R.attr.bubbles_system_stroke_step) {
            return (int[]) ((t84) kbcVar.f().c).g;
        }
        if (i2 == R.attr.bubbles_system_stroke_fade_step) {
            return (int[]) ((t84) kbcVar.f().c).h;
        }
        if (i2 == R.attr.bubbles_system_qr_step) {
            return (int[]) ((t84) kbcVar.f().c).i;
        }
        if (i2 == R.attr.chat_background_pattern_gradient_step) {
            return (int[]) kbcVar.C().a.c;
        }
        if (i2 == R.attr.chat_background_pattern_step) {
            return (int[]) kbcVar.C().a.d;
        }
        if (i2 == R.attr.chat_background_additional_step) {
            return (int[]) kbcVar.C().a.e;
        }
        if (i2 == R.attr.chat_background_background_step) {
            return (int[]) kbcVar.C().a.f;
        }
        if (i2 == R.attr.capsule_gradient_primary_step) {
            return ((oac) ((qg7) kbcVar.t().d).b).a;
        }
        if (i2 == R.attr.capsule_gradient_secondary_step) {
            return ((pac) ((qg7) kbcVar.t().d).c).a;
        }
        if (i2 == R.attr.empty_block_icon_wrapper_shape_step) {
            return ((qac) ((qg7) kbcVar.z().c).b).a;
        }
        if (i2 == R.attr.empty_block_icon_wrapper_stroke_step) {
            return ((mac) ((qg7) kbcVar.z().c).c).a;
        }
        if (i2 == R.attr.stories_circle_step) {
            return ((rac) kbcVar.d().a).c;
        }
        if (i2 == R.attr.stories_button_step) {
            return ((oac) kbcVar.d().b).a;
        }
        if (i2 == R.attr.stories_favorite_step) {
            return ((pac) kbcVar.d().c).a;
        }
        if (i2 == R.attr.sferum_venus_step) {
            return kbcVar.j().b;
        }
        if (i2 == R.attr.sferum_venus_stroke_step) {
            return kbcVar.j().c;
        }
        if (i2 == R.attr.sferum_mercury_step) {
            return kbcVar.j().d;
        }
        if (i2 == R.attr.sferum_mercury_stroke_step) {
            return kbcVar.j().e;
        }
        if (i2 == R.attr.sferum_earth_step) {
            return kbcVar.j().f;
        }
        if (i2 == R.attr.sferum_earth_stroke_step) {
            return kbcVar.j().g;
        }
        if (i2 == R.attr.skeleton_cell_step) {
            return ((rac) kbcVar.q().a).c;
        }
        if (i2 == R.attr.skeleton_grid_step) {
            return ((rac) kbcVar.q().b).c;
        }
        if (i2 == R.attr.skeleton_bubble_primary_step) {
            return ((rac) kbcVar.q().c).c;
        }
        if (i2 == R.attr.skeleton_bubble_secondary_step) {
            return ((rac) kbcVar.q().d).c;
        }
        if (i2 == R.attr.skeleton_sticker_primary_base_step) {
            return ((rac) ((fbc) kbcVar.q().e).b).c;
        }
        if (i2 == R.attr.skeleton_sticker_primary_tongue_step) {
            return ((qac) ((fbc) kbcVar.q().e).c).a;
        }
        if (i2 == R.attr.skeleton_sticker_secondary_base_step) {
            return ((rac) ((fbc) kbcVar.q().f).b).c;
        }
        if (i2 == R.attr.skeleton_sticker_secondary_tongue_step) {
            return ((mac) ((fbc) kbcVar.q().f).c).a;
        }
        if (i2 == R.attr.states_promo_button_hover_step) {
            return ((oac) ((ki3) kbcVar.u().k.a).a).a;
        }
        if (i2 == R.attr.states_promo_button_pressed_step) {
            return ((pac) ((ki3) kbcVar.u().k.a).b).a;
        }
        if (i2 == R.attr.states_promo_button_disabled_step) {
            return ((nac) ((ki3) kbcVar.u().k.a).c).a;
        }
        ore.p("not an array of 'COLOR'");
        return null;
    }

    public static final int Z(int i2, kbc kbcVar) {
        if (i2 == R.attr.background_surface) {
            return kbcVar.b().l();
        }
        if (i2 == R.attr.background_primary) {
            return kbcVar.b().j();
        }
        if (i2 == R.attr.background_secondary) {
            return kbcVar.b().k();
        }
        if (i2 == R.attr.background_tertiary) {
            return kbcVar.b().m();
        }
        if (i2 == R.attr.background_card) {
            return kbcVar.b().h();
        }
        if (i2 == R.attr.background_overlay) {
            return kbcVar.b().i();
        }
        if (i2 == R.attr.background_overlay_secondary) {
            return -1728053248;
        }
        if (i2 == R.attr.background_overlay_hard) {
            return -871625458;
        }
        if (i2 == R.attr.background_overlay_media_preview) {
            return -654311424;
        }
        if (i2 == R.attr.background_themed_fade) {
            return kbcVar.b().n();
        }
        if (i2 == R.attr.icon_primary) {
            return kbcVar.getIcon().e();
        }
        if (i2 == R.attr.icon_secondary) {
            return kbcVar.getIcon().h();
        }
        if (i2 == R.attr.icon_tertiary) {
            return kbcVar.getIcon().i();
        }
        if (i2 == R.attr.icon_mute) {
            return kbcVar.getIcon().b();
        }
        if (i2 == R.attr.icon_primary_static) {
            return kbcVar.getIcon().g();
        }
        if (i2 == R.attr.icon_primary_inverse) {
            return kbcVar.getIcon().f();
        }
        if (i2 == R.attr.icon_primary_inverse_static) {
            return -1;
        }
        if (i2 == R.attr.icon_secondary_inverse_static) {
            return -1375731713;
        }
        if (i2 == R.attr.icon_mute_inverse_static) {
            return 1392508927;
        }
        if (i2 == R.attr.icon_themed) {
            return kbcVar.getIcon().j();
        }
        if (i2 == R.attr.icon_positive) {
            return kbcVar.getIcon().d();
        }
        if (i2 == R.attr.icon_negative) {
            return kbcVar.getIcon().c();
        }
        if (i2 == R.attr.icon_attention) {
            return kbcVar.getIcon().a();
        }
        if (i2 == R.attr.text_primary) {
            return kbcVar.getText().e();
        }
        if (i2 == R.attr.text_secondary) {
            return kbcVar.getText().h();
        }
        if (i2 == R.attr.text_tertiary) {
            return kbcVar.getText().i();
        }
        if (i2 == R.attr.text_mute) {
            return kbcVar.getText().b();
        }
        if (i2 == R.attr.text_primary_static) {
            return kbcVar.getText().g();
        }
        if (i2 == R.attr.text_primary_inverse) {
            return kbcVar.getText().f();
        }
        if (i2 == R.attr.text_primary_inverse_static) {
            return -1;
        }
        if (i2 == R.attr.text_secondary_inverse_static) {
            return -855638017;
        }
        if (i2 == R.attr.text_mute_inverse_static) {
            return 1728053247;
        }
        if (i2 == R.attr.text_themed) {
            return kbcVar.getText().j();
        }
        if (i2 == R.attr.text_positive) {
            return kbcVar.getText().d();
        }
        if (i2 == R.attr.text_negative) {
            return kbcVar.getText().c();
        }
        if (i2 == R.attr.text_attention) {
            return kbcVar.getText().a();
        }
        if (i2 == R.attr.stroke_themed) {
            return kbcVar.l().j();
        }
        if (i2 == R.attr.stroke_secondary) {
            return kbcVar.l().g();
        }
        if (i2 == R.attr.stroke_tertiary) {
            return kbcVar.l().i();
        }
        if (i2 == R.attr.stroke_primary_inverse_static) {
            return kbcVar.l().f();
        }
        if (i2 == R.attr.stroke_secondary_inverse_static) {
            return 1308622847;
        }
        if (i2 == R.attr.stroke_positive) {
            return kbcVar.l().d();
        }
        if (i2 == R.attr.stroke_negative) {
            return kbcVar.l().c();
        }
        if (i2 == R.attr.stroke_negative_fade) {
            return -1543557060;
        }
        if (i2 == R.attr.stroke_transparent) {
            return kbcVar.l().k();
        }
        if (i2 == R.attr.stroke_glass) {
            return kbcVar.l().b();
        }
        if (i2 == R.attr.stroke_primary_carver) {
            return kbcVar.l().e();
        }
        if (i2 == R.attr.stroke_card_carver) {
            return kbcVar.l().a();
        }
        if (i2 == R.attr.stroke_snap_guide) {
            return kbcVar.l().h();
        }
        if (i2 == R.attr.divider_primary) {
            return kbcVar.B().f();
        }
        if (i2 == R.attr.divider_secondary) {
            return kbcVar.B().h();
        }
        if (i2 == R.attr.divider_contrast) {
            return kbcVar.B().e();
        }
        if (i2 == R.attr.divider_primary_ghost) {
            return kbcVar.B().g();
        }
        if (i2 == R.attr.button_primary) {
            return kbcVar.h().g();
        }
        if (i2 == R.attr.button_secondary) {
            return kbcVar.h().h();
        }
        if (i2 == R.attr.button_primary_contrast) {
            return -1;
        }
        if (i2 == R.attr.button_secondary_contrast) {
            return kbcVar.h().i();
        }
        if (i2 == R.attr.button_negative) {
            return kbcVar.h().b();
        }
        if (i2 == R.attr.button_negative_fade) {
            return kbcVar.h().c();
        }
        if (i2 == R.attr.button_positive) {
            return kbcVar.h().e();
        }
        if (i2 == R.attr.button_positive_fade) {
            return kbcVar.h().f();
        }
        if (i2 == R.attr.button_bot) {
            return kbcVar.h().a();
        }
        if (i2 == R.attr.button_ghost) {
            return 0;
        }
        if (i2 == R.attr.button_overlay) {
            return kbcVar.h().d();
        }
        if (i2 == R.attr.button_overlay_contrast) {
            return 352321535;
        }
        if (i2 == R.attr.controls_active) {
            return kbcVar.g().b();
        }
        if (i2 == R.attr.controls_inactive) {
            return kbcVar.g().h();
        }
        if (i2 == R.attr.float_primary_blur) {
            return kbcVar.k().j();
        }
        if (i2 == R.attr.float_primary_flat) {
            return kbcVar.k().l();
        }
        if (i2 == R.attr.float_surface_blur) {
            return kbcVar.k().o();
        }
        if (i2 == R.attr.float_surface_flat) {
            return kbcVar.k().q();
        }
        if (i2 == R.attr.float_popup_blur) {
            return kbcVar.k().h();
        }
        if (i2 == R.attr.float_popup_flat) {
            return kbcVar.k().i();
        }
        if (i2 == R.attr.float_fab_blur) {
            return kbcVar.k().a();
        }
        if (i2 == R.attr.float_fab_flat) {
            return kbcVar.k().b();
        }
        if (i2 == R.attr.float_modal) {
            return kbcVar.k().g();
        }
        if (i2 == R.attr.float_scroll_bar) {
            return kbcVar.k().m();
        }
        if (i2 == R.attr.float_primary_carver) {
            return kbcVar.k().k();
        }
        if (i2 == R.attr.float_surface_carver) {
            return kbcVar.k().p();
        }
        if (i2 == R.attr.float_stroke) {
            return kbcVar.k().n();
        }
        if (i2 == R.attr.float_glass_primary) {
            return kbcVar.k().c();
        }
        if (i2 == R.attr.float_glass_surface) {
            return kbcVar.k().e();
        }
        if (i2 == R.attr.float_glass_primary_flat) {
            return kbcVar.k().d();
        }
        if (i2 == R.attr.float_glass_surface_flat) {
            return kbcVar.k().f();
        }
        if (i2 == R.attr.avatar_malachite_text) {
            return kbcVar.a().f().c();
        }
        if (i2 == R.attr.avatar_dark_sky_text) {
            return kbcVar.a().d().c();
        }
        if (i2 == R.attr.avatar_lilac_text) {
            return kbcVar.a().e().c();
        }
        if (i2 == R.attr.avatar_orchid_text) {
            return kbcVar.a().g().c();
        }
        if (i2 == R.attr.avatar_tangerine_text) {
            return kbcVar.a().h().c();
        }
        if (i2 == R.attr.promo_icon) {
            return kbcVar.x().v();
        }
        if (i2 == R.attr.promo_live) {
            return -2678426;
        }
        if (i2 == R.attr.promo_button_shadow_1_color) {
            return 822083583;
        }
        if (i2 == R.attr.promo_button_shadow_2_color) {
            return -1761607681;
        }
        if (i2 == R.attr.bubbles_incoming_background_bubble) {
            return kbcVar.f().i().a().a;
        }
        if (i2 == R.attr.bubbles_incoming_background_action) {
            return kbcVar.f().i().a().b;
        }
        if (i2 == R.attr.bubbles_incoming_background_action_fade) {
            return kbcVar.f().i().a().c;
        }
        if (i2 == R.attr.bubbles_incoming_background_action_secondary) {
            return kbcVar.f().i().a().d;
        }
        if (i2 == R.attr.bubbles_incoming_background_surface_secondary) {
            return kbcVar.f().i().a().e;
        }
        if (i2 == R.attr.bubbles_incoming_background_icon_item) {
            return kbcVar.f().i().a().f;
        }
        if (i2 == R.attr.bubbles_incoming_background_icon_item_negative) {
            return kbcVar.f().i().a().g;
        }
        if (i2 == R.attr.bubbles_incoming_background_mention) {
            return kbcVar.f().i().a().h;
        }
        if (i2 == R.attr.bubbles_incoming_background_mention_pressed) {
            return kbcVar.f().i().a().i;
        }
        if (i2 == R.attr.bubbles_incoming_background_text_focus) {
            return kbcVar.f().i().a().j;
        }
        if (i2 == R.attr.bubbles_incoming_background_reaction_inside_my) {
            return kbcVar.f().i().a().c().b;
        }
        if (i2 == R.attr.bubbles_incoming_background_reaction_inside_others) {
            return kbcVar.f().i().a().c().c;
        }
        if (i2 == R.attr.bubbles_incoming_background_reaction_outside_my) {
            return kbcVar.f().i().a().c().d;
        }
        if (i2 == R.attr.bubbles_incoming_background_reaction_outside_others) {
            return kbcVar.f().i().a().c().e;
        }
        if (i2 == R.attr.bubbles_incoming_background_focus_regular_min) {
            return ((bs0) kbcVar.f().i().a().b().a).b;
        }
        if (i2 == R.attr.bubbles_incoming_background_focus_regular_max) {
            return ((bs0) kbcVar.f().i().a().b().a).c;
        }
        if (i2 == R.attr.bubbles_incoming_background_focus_transparent_min) {
            return ((bs0) kbcVar.f().i().a().b().b).b;
        }
        if (i2 == R.attr.bubbles_incoming_background_focus_transparent_max) {
            return ((bs0) kbcVar.f().i().a().b().b).c;
        }
        if (i2 == R.attr.bubbles_incoming_background_focus_single_media_min) {
            return ((bs0) kbcVar.f().i().a().b().c).b;
        }
        if (i2 == R.attr.bubbles_incoming_background_focus_single_media_max) {
            return ((bs0) kbcVar.f().i().a().b().c).c;
        }
        if (i2 == R.attr.bubbles_incoming_background_bot_button_default) {
            return kbcVar.f().i().a().a().b;
        }
        if (i2 == R.attr.bubbles_incoming_background_bot_button_hovered) {
            return kbcVar.f().i().a().a().c;
        }
        if (i2 == R.attr.bubbles_incoming_background_bot_button_pressed) {
            return kbcVar.f().i().a().a().d;
        }
        if (i2 == R.attr.bubbles_incoming_background_bot_button_loading) {
            return kbcVar.f().i().a().a().e;
        }
        if (i2 == R.attr.bubbles_incoming_text_action) {
            return kbcVar.f().i().d().a;
        }
        if (i2 == R.attr.bubbles_incoming_text_action_fade) {
            return kbcVar.f().i().d().b;
        }
        if (i2 == R.attr.bubbles_incoming_text_comment) {
            return kbcVar.f().i().d().c;
        }
        if (i2 == R.attr.bubbles_incoming_text_body) {
            return kbcVar.f().i().d().d;
        }
        if (i2 == R.attr.bubbles_incoming_text_body_secondary) {
            return kbcVar.f().i().d().e;
        }
        if (i2 == R.attr.bubbles_incoming_text_author) {
            return kbcVar.f().i().d().f;
        }
        if (i2 == R.attr.bubbles_incoming_text_time) {
            return kbcVar.f().i().d().g;
        }
        if (i2 == R.attr.bubbles_incoming_text_reply_name) {
            return kbcVar.f().i().d().h;
        }
        if (i2 == R.attr.bubbles_incoming_text_reply_body) {
            return kbcVar.f().i().d().i;
        }
        if (i2 == R.attr.bubbles_incoming_text_forward_label) {
            return kbcVar.f().i().d().j;
        }
        if (i2 == R.attr.bubbles_incoming_text_forward_name) {
            return kbcVar.f().i().d().k;
        }
        if (i2 == R.attr.bubbles_incoming_text_link) {
            return kbcVar.f().i().d().l;
        }
        if (i2 == R.attr.bubbles_incoming_text_link_underline) {
            return kbcVar.f().i().d().m;
        }
        if (i2 == R.attr.bubbles_incoming_text_md_link) {
            return kbcVar.f().i().d().n;
        }
        if (i2 == R.attr.bubbles_incoming_text_number_reaction_you) {
            return kbcVar.f().i().d().o;
        }
        if (i2 == R.attr.bubbles_incoming_text_number_reaction_other) {
            return kbcVar.f().i().d().p;
        }
        if (i2 == R.attr.bubbles_incoming_text_reaction_inside_my) {
            return kbcVar.f().i().d().a().b;
        }
        if (i2 == R.attr.bubbles_incoming_text_reaction_inside_others) {
            return kbcVar.f().i().d().a().c;
        }
        if (i2 == R.attr.bubbles_incoming_text_reaction_outside_my) {
            return kbcVar.f().i().d().a().d;
        }
        if (i2 == R.attr.bubbles_incoming_text_reaction_outside_others) {
            return kbcVar.f().i().d().a().e;
        }
        if (i2 == R.attr.bubbles_incoming_icon_action) {
            return kbcVar.f().i().b().a;
        }
        if (i2 == R.attr.bubbles_incoming_icon_comment) {
            return kbcVar.f().i().b().b;
        }
        if (i2 == R.attr.bubbles_incoming_icon_action_secondary) {
            return kbcVar.f().i().b().c;
        }
        if (i2 == R.attr.bubbles_incoming_icon_alert) {
            return kbcVar.f().i().b().d;
        }
        if (i2 == R.attr.bubbles_incoming_icon_call_neutral) {
            return kbcVar.f().i().b().e;
        }
        if (i2 == R.attr.bubbles_incoming_icon_call_negative) {
            return kbcVar.f().i().b().f;
        }
        if (i2 == R.attr.bubbles_incoming_icon_icon_item) {
            return kbcVar.f().i().b().g;
        }
        if (i2 == R.attr.bubbles_incoming_icon_read_status) {
            return kbcVar.f().i().b().h;
        }
        if (i2 == R.attr.bubbles_incoming_icon_read_status_capsule) {
            return kbcVar.f().i().b().i;
        }
        if (i2 == R.attr.bubbles_incoming_icon_reply) {
            return kbcVar.f().i().b().j;
        }
        if (i2 == R.attr.bubbles_incoming_icon_reply_forwarded) {
            return kbcVar.f().i().b().k;
        }
        if (i2 == R.attr.bubbles_incoming_icon_verification_author) {
            return kbcVar.f().i().b().l;
        }
        if (i2 == R.attr.bubbles_incoming_icon_verification_reply_name) {
            return kbcVar.f().i().b().m;
        }
        if (i2 == R.attr.bubbles_incoming_icon_verification_reply_body) {
            return kbcVar.f().i().b().n;
        }
        if (i2 == R.attr.bubbles_incoming_icon_verification_forward_name) {
            return kbcVar.f().i().b().o;
        }
        if (i2 == R.attr.bubbles_incoming_icon_verification_body) {
            return kbcVar.f().i().b().p;
        }
        if (i2 == R.attr.bubbles_incoming_stroke_reply) {
            return kbcVar.f().i().c().a;
        }
        if (i2 == R.attr.bubbles_incoming_stroke_reply_outside) {
            return kbcVar.f().i().c().b;
        }
        if (i2 == R.attr.bubbles_incoming_stroke_primary_inverse_static) {
            return kbcVar.f().i().c().c;
        }
        if (i2 == R.attr.bubbles_incoming_stroke_action) {
            return kbcVar.f().i().c().d;
        }
        if (i2 == R.attr.bubbles_incoming_stroke_neutral_secondary) {
            return kbcVar.f().i().c().e;
        }
        if (i2 == R.attr.bubbles_incoming_stroke_control_inactive) {
            return kbcVar.f().i().c().f;
        }
        if (i2 == R.attr.bubbles_incoming_states_background_hovered_surface_secondary) {
            return ((ix2) kbcVar.f().i().e.b).b;
        }
        if (i2 == R.attr.bubbles_incoming_states_background_pressed_surface_secondary) {
            return ((ix2) kbcVar.f().i().e.c).b;
        }
        if (i2 == R.attr.bubbles_outgoing_background_bubble) {
            return kbcVar.f().j().a().a;
        }
        if (i2 == R.attr.bubbles_outgoing_background_action) {
            return kbcVar.f().j().a().b;
        }
        if (i2 == R.attr.bubbles_outgoing_background_action_fade) {
            return kbcVar.f().j().a().c;
        }
        if (i2 == R.attr.bubbles_outgoing_background_action_secondary) {
            return kbcVar.f().j().a().d;
        }
        if (i2 == R.attr.bubbles_outgoing_background_surface_secondary) {
            return kbcVar.f().j().a().e;
        }
        if (i2 == R.attr.bubbles_outgoing_background_icon_item) {
            return kbcVar.f().j().a().f;
        }
        if (i2 == R.attr.bubbles_outgoing_background_icon_item_negative) {
            return kbcVar.f().j().a().g;
        }
        if (i2 == R.attr.bubbles_outgoing_background_mention) {
            return kbcVar.f().j().a().h;
        }
        if (i2 == R.attr.bubbles_outgoing_background_mention_pressed) {
            return kbcVar.f().j().a().i;
        }
        if (i2 == R.attr.bubbles_outgoing_background_text_focus) {
            return kbcVar.f().j().a().j;
        }
        if (i2 == R.attr.bubbles_outgoing_background_reaction_inside_my) {
            return kbcVar.f().j().a().c().b;
        }
        if (i2 == R.attr.bubbles_outgoing_background_reaction_inside_others) {
            return kbcVar.f().j().a().c().c;
        }
        if (i2 == R.attr.bubbles_outgoing_background_reaction_outside_my) {
            return kbcVar.f().j().a().c().d;
        }
        if (i2 == R.attr.bubbles_outgoing_background_reaction_outside_others) {
            return kbcVar.f().j().a().c().e;
        }
        if (i2 == R.attr.bubbles_outgoing_background_focus_regular_min) {
            return ((bs0) kbcVar.f().j().a().b().a).b;
        }
        if (i2 == R.attr.bubbles_outgoing_background_focus_regular_max) {
            return ((bs0) kbcVar.f().j().a().b().a).c;
        }
        if (i2 == R.attr.bubbles_outgoing_background_focus_transparent_min) {
            return ((bs0) kbcVar.f().j().a().b().b).b;
        }
        if (i2 == R.attr.bubbles_outgoing_background_focus_transparent_max) {
            return ((bs0) kbcVar.f().j().a().b().b).c;
        }
        if (i2 == R.attr.bubbles_outgoing_background_focus_single_media_min) {
            return ((bs0) kbcVar.f().j().a().b().c).b;
        }
        if (i2 == R.attr.bubbles_outgoing_background_focus_single_media_max) {
            return ((bs0) kbcVar.f().j().a().b().c).c;
        }
        if (i2 == R.attr.bubbles_outgoing_background_bot_button_default) {
            return kbcVar.f().j().a().a().b;
        }
        if (i2 == R.attr.bubbles_outgoing_background_bot_button_hovered) {
            return kbcVar.f().j().a().a().c;
        }
        if (i2 == R.attr.bubbles_outgoing_background_bot_button_pressed) {
            return kbcVar.f().j().a().a().d;
        }
        if (i2 == R.attr.bubbles_outgoing_background_bot_button_loading) {
            return kbcVar.f().j().a().a().e;
        }
        if (i2 == R.attr.bubbles_outgoing_text_action) {
            return kbcVar.f().j().d().a;
        }
        if (i2 == R.attr.bubbles_outgoing_text_action_fade) {
            return kbcVar.f().j().d().b;
        }
        if (i2 == R.attr.bubbles_outgoing_text_comment) {
            return kbcVar.f().j().d().c;
        }
        if (i2 == R.attr.bubbles_outgoing_text_body) {
            return kbcVar.f().j().d().d;
        }
        if (i2 == R.attr.bubbles_outgoing_text_body_secondary) {
            return kbcVar.f().j().d().e;
        }
        if (i2 == R.attr.bubbles_outgoing_text_author) {
            return kbcVar.f().j().d().f;
        }
        if (i2 == R.attr.bubbles_outgoing_text_time) {
            return kbcVar.f().j().d().g;
        }
        if (i2 == R.attr.bubbles_outgoing_text_reply_name) {
            return kbcVar.f().j().d().h;
        }
        if (i2 == R.attr.bubbles_outgoing_text_reply_body) {
            return kbcVar.f().j().d().i;
        }
        if (i2 == R.attr.bubbles_outgoing_text_forward_name) {
            return kbcVar.f().j().d().k;
        }
        if (i2 == R.attr.bubbles_outgoing_text_forward_label) {
            return kbcVar.f().j().d().j;
        }
        if (i2 == R.attr.bubbles_outgoing_text_link) {
            return kbcVar.f().j().d().l;
        }
        if (i2 == R.attr.bubbles_outgoing_text_link_underline) {
            return kbcVar.f().j().d().m;
        }
        if (i2 == R.attr.bubbles_outgoing_text_md_link) {
            return kbcVar.f().j().d().n;
        }
        if (i2 == R.attr.bubbles_outgoing_text_reaction_inside_my) {
            return kbcVar.f().j().d().a().b;
        }
        if (i2 == R.attr.bubbles_outgoing_text_reaction_inside_others) {
            return kbcVar.f().j().d().a().c;
        }
        if (i2 == R.attr.bubbles_outgoing_text_reaction_outside_my) {
            return kbcVar.f().j().d().a().d;
        }
        if (i2 == R.attr.bubbles_outgoing_text_reaction_outside_others) {
            return kbcVar.f().j().d().a().e;
        }
        if (i2 == R.attr.bubbles_outgoing_text_number_reaction_you) {
            return kbcVar.f().j().d().o;
        }
        if (i2 == R.attr.bubbles_outgoing_text_number_reaction_other) {
            return kbcVar.f().j().d().p;
        }
        if (i2 == R.attr.bubbles_outgoing_icon_action) {
            return kbcVar.f().j().b().a;
        }
        if (i2 == R.attr.bubbles_outgoing_icon_action_secondary) {
            return kbcVar.f().j().b().c;
        }
        if (i2 == R.attr.bubbles_outgoing_icon_comment) {
            return kbcVar.f().j().b().b;
        }
        if (i2 == R.attr.bubbles_outgoing_icon_alert) {
            return kbcVar.f().j().b().d;
        }
        if (i2 == R.attr.bubbles_outgoing_icon_call_neutral) {
            return kbcVar.f().j().b().e;
        }
        if (i2 == R.attr.bubbles_outgoing_icon_call_negative) {
            return kbcVar.f().j().b().f;
        }
        if (i2 == R.attr.bubbles_outgoing_icon_icon_item) {
            return kbcVar.f().j().b().g;
        }
        if (i2 == R.attr.bubbles_outgoing_icon_read_status) {
            return kbcVar.f().j().b().h;
        }
        if (i2 == R.attr.bubbles_outgoing_icon_read_status_capsule) {
            return kbcVar.f().j().b().i;
        }
        if (i2 == R.attr.bubbles_outgoing_icon_reply) {
            return kbcVar.f().j().b().j;
        }
        if (i2 == R.attr.bubbles_outgoing_icon_reply_forwarded) {
            return kbcVar.f().j().b().k;
        }
        if (i2 == R.attr.bubbles_outgoing_icon_verification_author) {
            return kbcVar.f().j().b().l;
        }
        if (i2 == R.attr.bubbles_outgoing_icon_verification_reply_name) {
            return kbcVar.f().j().b().m;
        }
        if (i2 == R.attr.bubbles_outgoing_icon_verification_reply_body) {
            return kbcVar.f().j().b().n;
        }
        if (i2 == R.attr.bubbles_outgoing_icon_verification_forward_name) {
            return kbcVar.f().j().b().o;
        }
        if (i2 == R.attr.bubbles_outgoing_icon_verification_body) {
            return kbcVar.f().j().b().p;
        }
        if (i2 == R.attr.bubbles_outgoing_stroke_reply) {
            return kbcVar.f().j().c().a;
        }
        if (i2 == R.attr.bubbles_outgoing_stroke_reply_outside) {
            return kbcVar.f().j().c().b;
        }
        if (i2 == R.attr.bubbles_outgoing_stroke_primary_inverse_static) {
            return kbcVar.f().j().c().c;
        }
        if (i2 == R.attr.bubbles_outgoing_stroke_action) {
            return kbcVar.f().j().c().d;
        }
        if (i2 == R.attr.bubbles_outgoing_stroke_neutral_secondary) {
            return kbcVar.f().j().c().e;
        }
        if (i2 == R.attr.bubbles_outgoing_stroke_control_inactive) {
            return kbcVar.f().j().c().f;
        }
        if (i2 == R.attr.bubbles_outgoing_states_background_hovered_surface_secondary) {
            return ((ix2) kbcVar.f().j().e.b).b;
        }
        if (i2 == R.attr.bubbles_outgoing_states_background_pressed_surface_secondary) {
            return ((ix2) kbcVar.f().j().e.c).b;
        }
        if (i2 == R.attr.bubbles_system_qr_background) {
            return ((t84) kbcVar.f().c).j();
        }
        if (i2 == R.attr.bubbles_system_media_empty_icon) {
            return ((bs0) ((t84) kbcVar.f().c).e).g();
        }
        if (i2 == R.attr.bubbles_system_media_empty_background) {
            return ((bs0) ((t84) kbcVar.f().c).e).c();
        }
        if (i2 == R.attr.bubbles_system_icon_themed_contrast) {
            return ((t84) kbcVar.f().c).i().g();
        }
        if (i2 == R.attr.bubbles_system_button_themed) {
            return ((t84) kbcVar.f().c).h().f();
        }
        if (i2 == R.attr.chat_background_pattern_color) {
            return kbcVar.C().b().x();
        }
        if (i2 == R.attr.chat_ground) {
            return kbcVar.C().c();
        }
        if (i2 == R.attr.chat_search_highlight) {
            return kbcVar.C().e();
        }
        if (i2 == R.attr.chat_sticker_blank) {
            return kbcVar.C().f();
        }
        if (i2 == R.attr.chat_timeline_active) {
            return -1191182337;
        }
        if (i2 == R.attr.chat_timeline_passive) {
            return 1392508927;
        }
        if (i2 == R.attr.chat_action_outside) {
            return kbcVar.C().a();
        }
        if (i2 == R.attr.chat_pattern_icon) {
            return kbcVar.C().d();
        }
        if (i2 == R.attr.capsule_background) {
            return kbcVar.t().d();
        }
        if (i2 == R.attr.capsule_outside) {
            return kbcVar.t().e();
        }
        if (i2 == R.attr.capsule_secondary) {
            return kbcVar.t().f();
        }
        if (i2 == R.attr.chips_default) {
            return kbcVar.n().c();
        }
        if (i2 == R.attr.chips_active) {
            return kbcVar.n().b();
        }
        if (i2 == R.attr.chips_select_on) {
            return kbcVar.n().f();
        }
        if (i2 == R.attr.chips_select_off) {
            return kbcVar.n().e();
        }
        if (i2 == R.attr.chips_primary) {
            return kbcVar.n().d();
        }
        if (i2 == R.attr.counter_attention) {
            return kbcVar.y().a();
        }
        if (i2 == R.attr.counter_mute) {
            return kbcVar.y().m();
        }
        if (i2 == R.attr.counter_themed) {
            return kbcVar.y().r();
        }
        if (i2 == R.attr.counter_default) {
            return kbcVar.y().b();
        }
        if (i2 == R.attr.counter_mirage) {
            return kbcVar.y().l();
        }
        if (i2 == R.attr.counter_contrast) {
            return -1;
        }
        if (i2 == R.attr.counter_menu) {
            return kbcVar.y().k();
        }
        if (i2 == R.attr.empty_block_halo_bubble_1) {
            return ((w56) kbcVar.z().b).a();
        }
        if (i2 == R.attr.empty_block_halo_bubble_2) {
            return ((w56) kbcVar.z().b).b();
        }
        if (i2 == R.attr.empty_block_halo_bubble_3) {
            return ((w56) kbcVar.z().b).c();
        }
        if (i2 == R.attr.empty_block_halo_bubble_4) {
            return ((w56) kbcVar.z().b).d();
        }
        if (i2 == R.attr.file_type_text) {
            return -520093697;
        }
        if (i2 == R.attr.file_type_background) {
            return kbcVar.w().d();
        }
        if (i2 == R.attr.file_type_presentation_bkg) {
            return kbcVar.w().q();
        }
        if (i2 == R.attr.file_type_presentation_badge) {
            return kbcVar.w().p();
        }
        if (i2 == R.attr.file_type_presentation_icon) {
            return kbcVar.w().s();
        }
        if (i2 == R.attr.file_type_presentation_element) {
            return kbcVar.w().r();
        }
        if (i2 == R.attr.file_type_data_bkg) {
            return kbcVar.w().e();
        }
        if (i2 == R.attr.file_type_data_badge) {
            return -15697601;
        }
        if (i2 == R.attr.file_type_data_icon) {
            return kbcVar.w().g();
        }
        if (i2 == R.attr.file_type_data_element) {
            return kbcVar.w().f();
        }
        if (i2 == R.attr.file_type_text_bkg) {
            return kbcVar.w().x();
        }
        if (i2 == R.attr.file_type_text_badge) {
            return -14983490;
        }
        if (i2 == R.attr.file_type_text_icon) {
            return kbcVar.w().z();
        }
        if (i2 == R.attr.file_type_text_element) {
            return kbcVar.w().y();
        }
        if (i2 == R.attr.file_type_image_bkg) {
            return kbcVar.w().i();
        }
        if (i2 == R.attr.file_type_image_badge) {
            return kbcVar.w().h();
        }
        if (i2 == R.attr.file_type_image_icon) {
            return kbcVar.w().k();
        }
        if (i2 == R.attr.file_type_image_element) {
            return kbcVar.w().j();
        }
        if (i2 == R.attr.file_type_video_bkg) {
            return kbcVar.w().F();
        }
        if (i2 == R.attr.file_type_video_badge) {
            return kbcVar.w().E();
        }
        if (i2 == R.attr.file_type_video_icon) {
            return kbcVar.w().H();
        }
        if (i2 == R.attr.file_type_video_element) {
            return kbcVar.w().G();
        }
        if (i2 == R.attr.file_type_archive_bkg) {
            return kbcVar.w().a();
        }
        if (i2 == R.attr.file_type_archive_badge) {
            return -6543440;
        }
        if (i2 == R.attr.file_type_archive_icon) {
            return kbcVar.w().c();
        }
        if (i2 == R.attr.file_type_archive_element) {
            return kbcVar.w().b();
        }
        if (i2 == R.attr.file_type_program_bkg) {
            return kbcVar.w().u();
        }
        if (i2 == R.attr.file_type_program_badge) {
            return kbcVar.w().t();
        }
        if (i2 == R.attr.file_type_program_icon) {
            return kbcVar.w().w();
        }
        if (i2 == R.attr.file_type_program_element) {
            return kbcVar.w().v();
        }
        if (i2 == R.attr.file_type_music_bkg) {
            return kbcVar.w().m();
        }
        if (i2 == R.attr.file_type_music_badge) {
            return kbcVar.w().l();
        }
        if (i2 == R.attr.file_type_music_icon) {
            return kbcVar.w().o();
        }
        if (i2 == R.attr.file_type_music_element) {
            return kbcVar.w().n();
        }
        if (i2 == R.attr.file_type_unknown_bkg) {
            return kbcVar.w().B();
        }
        if (i2 == R.attr.file_type_unknown_badge) {
            return kbcVar.w().A();
        }
        if (i2 == R.attr.file_type_unknown_icon) {
            return kbcVar.w().D();
        }
        if (i2 == R.attr.file_type_unknown_element) {
            return kbcVar.w().C();
        }
        if (i2 == R.attr.halo_call_pending_bubble_1) {
            return kbcVar.c().F().a();
        }
        if (i2 == R.attr.halo_call_pending_bubble_2) {
            return kbcVar.c().F().b();
        }
        if (i2 == R.attr.halo_call_pending_bubble_3) {
            return kbcVar.c().F().c();
        }
        if (i2 == R.attr.halo_call_pending_bubble_4) {
            return kbcVar.c().F().d();
        }
        if (i2 == R.attr.halo_call_pending_bubble_small_1) {
            return kbcVar.c().F().f();
        }
        if (i2 == R.attr.halo_call_pending_bubble_small_2) {
            return kbcVar.c().F().g();
        }
        if (i2 == R.attr.halo_call_pending_bubble_big) {
            return kbcVar.c().F().e();
        }
        if (i2 == R.attr.halo_call_online_bubble_1) {
            return kbcVar.c().D().a();
        }
        if (i2 == R.attr.halo_call_online_bubble_2) {
            return kbcVar.c().D().b();
        }
        if (i2 == R.attr.halo_call_online_bubble_3) {
            return kbcVar.c().D().c();
        }
        if (i2 == R.attr.halo_call_online_bubble_4) {
            return kbcVar.c().D().d();
        }
        if (i2 == R.attr.halo_call_online_bubble_small_1) {
            return kbcVar.c().D().f();
        }
        if (i2 == R.attr.halo_call_online_bubble_small_2) {
            return kbcVar.c().D().g();
        }
        if (i2 == R.attr.halo_call_online_bubble_big) {
            return kbcVar.c().D().e();
        }
        if (i2 == R.attr.halo_call_offline_bubble_1) {
            return kbcVar.c().C().a();
        }
        if (i2 == R.attr.halo_call_offline_bubble_2) {
            return kbcVar.c().C().b();
        }
        if (i2 == R.attr.halo_call_offline_bubble_3) {
            return kbcVar.c().C().c();
        }
        if (i2 == R.attr.halo_call_offline_bubble_4) {
            return kbcVar.c().C().d();
        }
        if (i2 == R.attr.halo_call_offline_bubble_small_1) {
            return kbcVar.c().C().f();
        }
        if (i2 == R.attr.halo_call_offline_bubble_small_2) {
            return kbcVar.c().C().g();
        }
        if (i2 == R.attr.halo_call_offline_bubble_big) {
            return kbcVar.c().C().e();
        }
        if (i2 == R.attr.halo_call_warning_bubble_1) {
            return -935615;
        }
        if (i2 == R.attr.halo_call_warning_bubble_2) {
            return kbcVar.c().K().a();
        }
        if (i2 == R.attr.halo_call_warning_bubble_3) {
            return -26036;
        }
        if (i2 == R.attr.halo_call_warning_bubble_4) {
            return -1472760;
        }
        if (i2 == R.attr.halo_call_warning_bubble_small_1) {
            return -939190;
        }
        if (i2 == R.attr.halo_call_warning_bubble_small_2) {
            return kbcVar.c().K().c();
        }
        if (i2 == R.attr.halo_call_warning_bubble_big) {
            return kbcVar.c().K().b();
        }
        if (i2 == R.attr.input_background) {
            return kbcVar.e().b();
        }
        if (i2 == R.attr.seekbar_track) {
            return -8815492;
        }
        if (i2 == R.attr.seekbar_buffer) {
            return -4933959;
        }
        if (i2 == R.attr.seekbar_progress || i2 == R.attr.seekbar_handle) {
            return -1;
        }
        if (i2 == R.attr.stories_circle_read) {
            return kbcVar.d().m().a();
        }
        if (i2 == R.attr.sferum_card) {
            return kbcVar.j().a();
        }
        if (i2 == R.attr.skeleton_cell_static_background) {
            return kbcVar.q().j().b();
        }
        if (i2 == R.attr.skeleton_grid_static_background) {
            return kbcVar.q().k().b();
        }
        if (i2 == R.attr.skeleton_bubble_primary_static_background) {
            return kbcVar.q().h().b();
        }
        if (i2 == R.attr.skeleton_bubble_secondary_static_background) {
            return kbcVar.q().i().b();
        }
        if (i2 == R.attr.skeleton_sticker_primary_base_static_background) {
            return kbcVar.q().n().k().b();
        }
        if (i2 == R.attr.skeleton_sticker_secondary_base_static_background) {
            return kbcVar.q().o().n().b();
        }
        if (i2 == R.attr.swipe_actions_unread) {
            return -16745729;
        }
        if (i2 == R.attr.swipe_actions_pin) {
            return kbcVar.o().h();
        }
        if (i2 == R.attr.swipe_actions_mute) {
            return kbcVar.o().g();
        }
        if (i2 == R.attr.swipe_actions_delete) {
            return kbcVar.o().d();
        }
        if (i2 == R.attr.tabbar_inactive) {
            return kbcVar.v().h();
        }
        if (i2 == R.attr.tabbar_active) {
            return kbcVar.v().b();
        }
        if (i2 == R.attr.verification_primary) {
            return kbcVar.s().f();
        }
        if (i2 == R.attr.verification_secondary) {
            return kbcVar.s().h();
        }
        if (i2 == R.attr.verification_tertiary) {
            return kbcVar.s().i();
        }
        if (i2 == R.attr.verification_themed) {
            return kbcVar.s().j();
        }
        if (i2 == R.attr.verification_primary_inverse_static) {
            return -855638017;
        }
        if (i2 == R.attr.writebar_input_blur) {
            return kbcVar.p().g();
        }
        if (i2 == R.attr.writebar_input_flat) {
            return kbcVar.p().h();
        }
        if (i2 == R.attr.writebar_emoji_area) {
            return kbcVar.p().e();
        }
        if (i2 == R.attr.writebar_input_text) {
            return kbcVar.p().j();
        }
        if (i2 == R.attr.writebar_input_stroke) {
            return kbcVar.p().i();
        }
        if (i2 == R.attr.writebar_divider) {
            return kbcVar.p().d();
        }
        if (i2 == R.attr.shadow_android_top_bar_default_color) {
            return ((fbc) ((u50) kbcVar.i().a).a).o().c();
        }
        if (i2 == R.attr.shadow_android_top_bar_scroll_color) {
            return ((fbc) ((u50) kbcVar.i().a).a).q().c();
        }
        if (i2 == R.attr.shadow_android_tab_bar_default_color) {
            return ((qg7) ((u50) kbcVar.i().a).b).i().c();
        }
        if (i2 == R.attr.shadow_android_tab_bar_scroll_color) {
            return ((qg7) ((u50) kbcVar.i().a).b).k().c();
        }
        if (i2 == R.attr.shadow_android_write_bar_color) {
            return ((u50) kbcVar.i().a).i().c();
        }
        if (i2 == R.attr.shadow_glass_color) {
            return kbcVar.i().b().c();
        }
        if (i2 == R.attr.shadow_tabbar_color) {
            return kbcVar.i().d().c();
        }
        if (i2 == R.attr.shadow_elevation_1_primary) {
            return ((bs0) kbcVar.i().d).k();
        }
        if (i2 == R.attr.shadow_elevation_1_secondary) {
            return ((bs0) kbcVar.i().d).l();
        }
        if (i2 == R.attr.shadow_elevation_2_primary) {
            return ((bs0) kbcVar.i().e).k();
        }
        if (i2 == R.attr.shadow_elevation_2_secondary) {
            return ((bs0) kbcVar.i().e).l();
        }
        if (i2 == R.attr.shadow_elevation_3_primary) {
            return ((bs0) kbcVar.i().f).k();
        }
        if (i2 == R.attr.shadow_elevation_3_secondary) {
            return ((bs0) kbcVar.i().f).l();
        }
        if (i2 == R.attr.shadow_elevation_4_primary) {
            return ((bs0) kbcVar.i().g).k();
        }
        if (i2 == R.attr.shadow_elevation_4_secondary) {
            return ((bs0) kbcVar.i().g).l();
        }
        if (i2 == R.attr.shadow_button_icon_overlay_plain_elevation_1_color) {
            return 520093696;
        }
        if (i2 == R.attr.shadow_button_icon_overlay_plain_elevation_2_color) {
            return 687865856;
        }
        if (i2 == R.attr.shadow_focused_default) {
            return ((bs0) kbcVar.i().h).d();
        }
        if (i2 == R.attr.shadow_focused_negative) {
            return ((bs0) kbcVar.i().h).i();
        }
        if (i2 == R.attr.shadow_big_card_color) {
            return kbcVar.i().a().c();
        }
        if (i2 == R.attr.shadow_modal_color) {
            return kbcVar.i().c().c();
        }
        if (i2 == R.attr.states_background_highlighted) {
            return kbcVar.u().a().j();
        }
        if (i2 == R.attr.states_background_card_hover) {
            return kbcVar.u().a().i().f();
        }
        if (i2 == R.attr.states_background_card_pressed) {
            return kbcVar.u().a().i().n();
        }
        if (i2 == R.attr.states_background_card_selected) {
            return kbcVar.u().a().i().o();
        }
        if (i2 == R.attr.states_background_card_selected_hover) {
            return kbcVar.u().a().i().p();
        }
        if (i2 == R.attr.states_background_card_selected_pressed) {
            return kbcVar.u().a().i().q();
        }
        if (i2 == R.attr.states_background_card_disabled) {
            return kbcVar.u().a().i().c();
        }
        if (i2 == R.attr.states_icon_primary_hover) {
            return ((fn8) kbcVar.u().c().a).f();
        }
        if (i2 == R.attr.states_icon_primary_pressed) {
            return ((fn8) kbcVar.u().c().a).i();
        }
        if (i2 == R.attr.states_icon_primary_disabled) {
            return ((fn8) kbcVar.u().c().a).e();
        }
        if (i2 == R.attr.states_icon_secondary_hover) {
            return ((fn8) kbcVar.u().c().b).f();
        }
        if (i2 == R.attr.states_icon_secondary_pressed) {
            return ((fn8) kbcVar.u().c().b).i();
        }
        if (i2 == R.attr.states_icon_secondary_disabled) {
            return ((fn8) kbcVar.u().c().b).e();
        }
        if (i2 == R.attr.states_icon_tertiary_hover) {
            return ((fn8) kbcVar.u().c().c).f();
        }
        if (i2 == R.attr.states_icon_tertiary_pressed) {
            return ((fn8) kbcVar.u().c().c).i();
        }
        if (i2 == R.attr.states_icon_tertiary_disabled) {
            return ((fn8) kbcVar.u().c().c).e();
        }
        if (i2 == R.attr.states_icon_primary_inverse_static_hover) {
            return -2631721;
        }
        if (i2 == R.attr.states_icon_primary_inverse_static_pressed) {
            return ((bs0) kbcVar.u().c().d).j();
        }
        if (i2 == R.attr.states_icon_primary_inverse_static_disabled) {
            return ((bs0) kbcVar.u().c().d).e();
        }
        if (i2 == R.attr.states_icon_themed_hover) {
            return ((fn8) kbcVar.u().c().e).f();
        }
        if (i2 == R.attr.states_icon_themed_pressed) {
            return ((fn8) kbcVar.u().c().e).i();
        }
        if (i2 == R.attr.states_icon_themed_disabled) {
            return ((fn8) kbcVar.u().c().e).e();
        }
        if (i2 == R.attr.states_icon_negative_hover) {
            return ((fn8) kbcVar.u().c().f).f();
        }
        if (i2 == R.attr.states_icon_negative_pressed) {
            return ((fn8) kbcVar.u().c().f).i();
        }
        if (i2 == R.attr.states_icon_negative_disabled) {
            return ((fn8) kbcVar.u().c().f).e();
        }
        if (i2 == R.attr.states_icon_primary_static_disabled) {
            return kbcVar.u().c().g().d();
        }
        if (i2 == R.attr.states_icon_primary_inverse_disabled) {
            return kbcVar.u().c().f().d();
        }
        if (i2 == R.attr.states_icon_positive_disabled) {
            return kbcVar.u().c().e().d();
        }
        if (i2 == R.attr.states_button_primary_hover) {
            return ((fn8) kbcVar.u().b().a).f();
        }
        if (i2 == R.attr.states_button_primary_pressed) {
            return ((fn8) kbcVar.u().b().a).i();
        }
        if (i2 == R.attr.states_button_primary_disabled) {
            return ((fn8) kbcVar.u().b().a).e();
        }
        if (i2 == R.attr.states_button_secondary_hover) {
            return ((fn8) kbcVar.u().b().b).f();
        }
        if (i2 == R.attr.states_button_secondary_pressed) {
            return ((fn8) kbcVar.u().b().b).i();
        }
        if (i2 == R.attr.states_button_secondary_disabled) {
            return ((fn8) kbcVar.u().b().b).e();
        }
        if (i2 == R.attr.states_button_primary_contrast_hover) {
            return -592138;
        }
        if (i2 == R.attr.states_button_primary_contrast_pressed) {
            return -1315861;
        }
        if (i2 == R.attr.states_button_primary_contrast_disabled) {
            return ((ix2) kbcVar.u().b().c).d();
        }
        if (i2 == R.attr.states_button_secondary_contrast_hover) {
            return ((fn8) kbcVar.u().b().d).f();
        }
        if (i2 == R.attr.states_button_secondary_contrast_pressed) {
            return ((fn8) kbcVar.u().b().d).i();
        }
        if (i2 == R.attr.states_button_secondary_contrast_disabled) {
            return ((fn8) kbcVar.u().b().d).e();
        }
        if (i2 == R.attr.states_button_positive_hover) {
            return ((fn8) kbcVar.u().b().e).f();
        }
        if (i2 == R.attr.states_button_positive_pressed) {
            return ((fn8) kbcVar.u().b().e).i();
        }
        if (i2 == R.attr.states_button_positive_disabled) {
            return ((fn8) kbcVar.u().b().e).e();
        }
        if (i2 == R.attr.states_button_negative_hover) {
            return ((fn8) kbcVar.u().b().f).f();
        }
        if (i2 == R.attr.states_button_negative_pressed) {
            return ((fn8) kbcVar.u().b().f).i();
        }
        if (i2 == R.attr.states_button_negative_disabled) {
            return ((fn8) kbcVar.u().b().f).e();
        }
        if (i2 == R.attr.states_button_ghost_hover) {
            return ((bs0) kbcVar.u().b().g).f();
        }
        if (i2 == R.attr.states_button_ghost_pressed) {
            return ((bs0) kbcVar.u().b().g).j();
        }
        if (i2 == R.attr.states_button_ghost_disabled) {
            return 16384255;
        }
        if (i2 == R.attr.states_button_bot_pressed) {
            return ((bs0) kbcVar.u().b().h).j();
        }
        if (i2 == R.attr.states_button_bot_disabled) {
            return ((bs0) kbcVar.u().b().h).e();
        }
        if (i2 == R.attr.states_button_overlay_hover) {
            return ((fn8) kbcVar.u().b().i).f();
        }
        if (i2 == R.attr.states_button_overlay_pressed) {
            return ((fn8) kbcVar.u().b().i).i();
        }
        if (i2 == R.attr.states_button_overlay_disabled) {
            return ((fn8) kbcVar.u().b().i).e();
        }
        if (i2 == R.attr.states_button_overlay_contrast_hover) {
            return 872415231;
        }
        if (i2 == R.attr.states_button_overlay_contrast_pressed) {
            return 1207959551;
        }
        if (i2 == R.attr.states_text_primary_hover) {
            return ((fn8) kbcVar.u().d().b).f();
        }
        if (i2 == R.attr.states_text_primary_pressed) {
            return ((fn8) kbcVar.u().d().b).i();
        }
        if (i2 == R.attr.states_text_primary_disabled) {
            return ((fn8) kbcVar.u().d().b).e();
        }
        if (i2 == R.attr.states_text_secondary_hover) {
            return ((fn8) kbcVar.u().d().c).f();
        }
        if (i2 == R.attr.states_text_secondary_pressed) {
            return ((fn8) kbcVar.u().d().c).i();
        }
        if (i2 == R.attr.states_text_secondary_disabled) {
            return ((fn8) kbcVar.u().d().c).e();
        }
        if (i2 == R.attr.states_text_tertiary_hover) {
            return ((fn8) kbcVar.u().d().d).f();
        }
        if (i2 == R.attr.states_text_tertiary_pressed) {
            return ((fn8) kbcVar.u().d().d).i();
        }
        if (i2 == R.attr.states_text_tertiary_disabled) {
            return ((fn8) kbcVar.u().d().d).e();
        }
        if (i2 == R.attr.states_text_primary_static_disabled) {
            return kbcVar.u().d().l().d();
        }
        if (i2 == R.attr.states_text_primary_inverse_disabled) {
            return kbcVar.u().d().k().d();
        }
        if (i2 == R.attr.states_text_primary_inverse_static_hover) {
            return -1447447;
        }
        if (i2 == R.attr.states_text_primary_inverse_static_pressed) {
            return ((bs0) kbcVar.u().d().g).j();
        }
        if (i2 == R.attr.states_text_primary_inverse_static_disabled) {
            return ((bs0) kbcVar.u().d().g).e();
        }
        if (i2 == R.attr.states_text_themed_hover) {
            return ((fn8) kbcVar.u().d().h).f();
        }
        if (i2 == R.attr.states_text_themed_pressed) {
            return ((fn8) kbcVar.u().d().h).i();
        }
        if (i2 == R.attr.states_text_themed_disabled) {
            return ((fn8) kbcVar.u().d().h).e();
        }
        if (i2 == R.attr.states_text_negative_hover) {
            return ((fn8) kbcVar.u().d().i).f();
        }
        if (i2 == R.attr.states_text_negative_pressed) {
            return ((fn8) kbcVar.u().d().i).i();
        }
        if (i2 == R.attr.states_text_negative_disabled) {
            return ((fn8) kbcVar.u().d().i).e();
        }
        if (i2 == R.attr.states_sferum_card_hover) {
            return ((bs0) kbcVar.u().e.a).f();
        }
        if (i2 == R.attr.states_sferum_card_pressed) {
            return ((bs0) kbcVar.u().e.a).j();
        }
        if (i2 == R.attr.states_float_scroll_bar_hover) {
            return ((bs0) kbcVar.u().f.b).f();
        }
        if (i2 == R.attr.states_float_scroll_bar_pressed) {
            return ((bs0) kbcVar.u().f.b).j();
        }
        if (i2 == R.attr.states_float_surface_glass_hover) {
            return ((fn8) kbcVar.u().f.c).f();
        }
        if (i2 == R.attr.states_float_surface_glass_pressed) {
            return ((fn8) kbcVar.u().f.c).i();
        }
        if (i2 == R.attr.states_float_surface_glass_disabled) {
            return ((fn8) kbcVar.u().f.c).e();
        }
        if (i2 == R.attr.states_chat_action_outside_hover) {
            return ((bs0) kbcVar.u().g.a).f();
        }
        if (i2 == R.attr.states_chat_action_outside_pressed) {
            return ((bs0) kbcVar.u().g.a).j();
        }
        if (i2 == R.attr.states_chips_select_on_hover) {
            return ((bs0) kbcVar.u().h.b).f();
        }
        if (i2 == R.attr.states_chips_select_on_pressed) {
            return ((bs0) kbcVar.u().h.b).j();
        }
        if (i2 == R.attr.states_chips_select_off_hover) {
            return ((bs0) kbcVar.u().h.c).f();
        }
        if (i2 == R.attr.states_chips_select_off_pressed) {
            return ((bs0) kbcVar.u().h.c).j();
        }
        if (i2 == R.attr.states_controls_active_disabled) {
            return kbcVar.u().i.j().d();
        }
        if (i2 == R.attr.states_controls_inactive_disabled) {
            return kbcVar.u().i.p().d();
        }
        if (i2 == R.attr.states_counter_themed_disabled) {
            return kbcVar.u().j.J().d();
        }
        if (i2 == R.attr.states_counter_attentrion_disabled) {
            return kbcVar.u().j.v().d();
        }
        if (i2 == R.attr.states_counter_contrast_disabled) {
            return kbcVar.u().j.y().d();
        }
        if (i2 == R.attr.states_counter_default_disabled) {
            return kbcVar.u().j.A().d();
        }
        if (i2 == R.attr.states_divider_primary_hover) {
            return ((fn8) kbcVar.u().l.a).f();
        }
        if (i2 == R.attr.states_divider_primary_pressed) {
            return ((fn8) kbcVar.u().l.a).i();
        }
        if (i2 == R.attr.states_divider_primary_disabled) {
            return ((fn8) kbcVar.u().l.a).e();
        }
        if (i2 == R.attr.states_stroke_negative_fade_hover) {
            return ((fn8) kbcVar.u().m.b).f();
        }
        if (i2 == R.attr.states_stroke_negative_fade_pressed) {
            return ((fn8) kbcVar.u().m.b).i();
        }
        if (i2 == R.attr.states_stroke_negative_fade_disabled) {
            return ((fn8) kbcVar.u().m.b).e();
        }
        if (i2 == R.attr.states_bubbles_system_button_themed_hover) {
            return ((fn8) ((p3c) ((v56) kbcVar.u().n.a).b).b).f();
        }
        if (i2 == R.attr.states_bubbles_system_button_themed_pressed) {
            return ((fn8) ((p3c) ((v56) kbcVar.u().n.a).b).b).i();
        }
        if (i2 == R.attr.states_bubbles_system_button_themed_disabled) {
            return ((fn8) ((p3c) ((v56) kbcVar.u().n.a).b).b).e();
        }
        if (i2 == R.attr.technical_lottie_icon_tertiary) {
            return kbcVar.m().e();
        }
        if (i2 == R.attr.technical_black) {
            return -16777216;
        }
        ore.p("not a 'COLOR'");
        return 0;
    }

    public static final tp2 a(Context context) {
        return Build.VERSION.SDK_INT >= 30 ? new tp2(context) : new up2(context);
    }

    public static fj8 a0(hj8 hj8Var, int i2) {
        boolean z2 = i2 > 0;
        Integer numValueOf = Integer.valueOf(i2);
        if (!z2) {
            throw new IllegalArgumentException("Step must be positive, was: " + numValueOf + '.');
        }
        int i3 = hj8Var.a;
        int i4 = hj8Var.b;
        if (hj8Var.c <= 0) {
            i2 = -i2;
        }
        return new fj8(i3, i4, i2);
    }

    public static final hg8 b(aw8 aw8Var, String str) {
        return new hg8(str, new ig8(aw8Var));
    }

    public static String b0() {
        return (String) ns4.b.getValue();
    }

    public static final int c(oc9 oc9Var, XmlPullParser xmlPullParser, String str) {
        oc9Var.getClass();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i2 = 0; i2 < attributeCount; i2++) {
            if (xmlPullParser.getAttributeName(i2).equals(str)) {
                return i2;
            }
        }
        return -1;
    }

    public static final long c0(long j2, long j3, long j4, String str) {
        String property;
        int i2 = agh.a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j2;
        }
        Long lC0 = y5h.C0(property);
        if (lC0 == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lC0.longValue();
        if (j3 <= jLongValue && jLongValue <= j4) {
            return jLongValue;
        }
        StringBuilder sbB = nbh.B(j3, "System property '", str, "' should be in range ");
        qt4.z(j4, "..", ", but is '", sbB);
        sbB.append(jLongValue);
        sbB.append('\'');
        throw new IllegalStateException(sbB.toString().toString());
    }

    public static final int d(int i2, int i3, int i4) {
        return Math.min(Math.max(0, i4 - i2), i3);
    }

    public static int d0(int i2, int i3, String str) {
        return (int) c0(i2, 1L, (i3 & 8) != 0 ? Integer.MAX_VALUE : 2097150, str);
    }

    public static final lve e(br4 br4Var, yk ykVar, yk ykVar2) {
        lve lveVar = new lve(br4Var, null, null, null, false, -1);
        lveVar.c(ykVar2);
        lveVar.a(ykVar);
        return lveVar;
    }

    public static final bye e0(xx6 xx6Var, long j2) {
        wfe wfeVar = new wfe();
        wo8 wo8VarA = vd7.a();
        wo8VarA.j0();
        wfeVar.a = wo8VarA;
        return new bye(new x10(new dz6(xx6Var, new il3(wfeVar, null)), wfeVar, j2, (lq4) null));
    }

    public static final Boolean f(boolean z2) {
        return Boolean.valueOf(z2);
    }

    public static hj8 f0(int i2, int i3) {
        if (i3 > Integer.MIN_VALUE) {
            return new hj8(i2, i3 - 1, 1);
        }
        hj8 hj8Var = hj8.d;
        return hj8.d;
    }

    public static final Long g(long j2) {
        return new Long(j2);
    }

    public static final void g0(gdi gdiVar) {
        gdiVar.b(3, new lu2(25));
        gdiVar.b(4, new lu2(26));
        gdiVar.b(4, new lu2(27));
        gdiVar.b(4, new lu2(28));
        gdiVar.b(4, new lu2(29));
        gdiVar.b(4, new gj5(0));
        gdiVar.b(4, new gj5(1));
        gdiVar.b(4, new gj5(2));
        gdiVar.b(4, new gj5(3));
        gdiVar.b(4, new lu2(16));
        gdiVar.b(4, new lu2(17));
        gdiVar.b(4, new lu2(18));
        gdiVar.b(4, new lu2(19));
        gdiVar.b(4, new lu2(20));
        gdiVar.b(4, new lu2(21));
        gdiVar.b(4, new lu2(22));
        gdiVar.b(4, new lu2(23));
        gdiVar.b(4, new lu2(24));
    }

    public static final Layout h(Context context, ky8 ky8Var, CharSequence charSequence, int i2, TextPaint textPaint, nsi nsiVar) {
        int iI0 = i0(textPaint.getTextSize() / context.getResources().getDisplayMetrics().density);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        spannableStringBuilder.append((char) 8288);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.setSpan(new qsi(context, iI0, false, nsiVar), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        int iB = ky8.a(ky8Var, spannableStringBuilder, textPaint, i2, Integer.MAX_VALUE, false, null, 0.0f, false, 496).getLineCount() > 1 ? i2 - zo5.b(nbh.e(iI0), yl5.d().getDisplayMetrics().density, gm0.K(nbh.h(iI0) * yl5.d().getDisplayMetrics().density)) : i2;
        Layout layoutA = ky8.a(ky8Var, spannableStringBuilder, textPaint, iB, 1, false, null, 0.0f, false, 496);
        if (iB == i2) {
            return layoutA;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(layoutA.getText().subSequence(0, layoutA.getEllipsisStart(0) + 1));
        spannableStringBuilder2.append((char) 8288);
        spannableStringBuilder2.append((CharSequence) " ");
        spannableStringBuilder2.setSpan(new qsi(context, iI0, false, nsiVar), spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
        return ky8.a(ky8Var, spannableStringBuilder2, textPaint, i2, 1, false, null, 0.0f, false, 496);
    }

    public static final void h0(gdi gdiVar) {
        gdiVar.d(24, new ko7(19));
        gdiVar.d(319, new ko7(20));
        gdiVar.d(33, new ko7(21));
        gdiVar.d(1104, new ko7(22));
        gdiVar.d(783, new ko7(23));
        gdiVar.d(1062, new ko7(24));
        gdiVar.d(1060, new ko7(25));
        gdiVar.d(782, new ko7(26));
        gdiVar.d(685, new ko7(27));
        gdiVar.d(681, new ko7(13));
        gdiVar.d(683, new ko7(14));
        gdiVar.d(663, new ko7(15));
        gdiVar.d(738, new ko7(16));
        gdiVar.d(106, new ko7(17));
        gdiVar.d(1105, new ko7(18));
    }

    public static void i(Boolean bool) {
        if (bool.booleanValue()) {
            return;
        }
        ore.a();
    }

    public static final int i0(float f2) {
        if (f2 < 16.0f || f2 >= 24.0f) {
            return f2 >= 24.0f ? 3 : 1;
        }
        return 2;
    }

    public static void j(String str, boolean z2) {
        if (z2) {
            return;
        }
        ore.p(str);
    }

    public static void j0(Context context, Executor executor, lpd lpdVar, boolean z2) {
        boolean zL;
        boolean z3;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        boolean z4 = false;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z2) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long j2 = dataInputStream.readLong();
                            dataInputStream.close();
                            z3 = j2 == packageInfo.lastUpdateTime;
                            if (z3) {
                                lpdVar.d(2, null);
                            }
                        } catch (Throwable th) {
                            try {
                                dataInputStream.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    } catch (IOException unused) {
                        z3 = false;
                    }
                } else {
                    z3 = false;
                }
                if (z3) {
                    Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                    tud.c(context, false);
                    return;
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            ec1 ec1Var = new ec1(assets, executor, lpdVar, name, new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof"));
            if (ec1Var.c()) {
                ec1 ec1VarI = ec1Var.i();
                ec1VarI.k();
                zL = ec1VarI.l();
                if (zL) {
                    W(packageInfo, filesDir);
                }
            } else {
                zL = false;
            }
            if (zL && z2) {
                z4 = true;
            }
            tud.c(context, z4);
        } catch (PackageManager.NameNotFoundException e2) {
            lpdVar.d(7, e2);
            tud.c(context, false);
        }
    }

    public static void k(boolean z2, String str, Object... objArr) {
        if (z2) {
            return;
        }
        ore.p(D(str, objArr));
    }

    public static final void l(int i2, int i3, int i4, int i5, int i6) {
        k(i5 >= 0, "count (%d) ! >= 0", Integer.valueOf(i5));
        k(i2 >= 0, "offset (%d) ! >= 0", Integer.valueOf(i2));
        k(i4 >= 0, "otherOffset (%d) ! >= 0", Integer.valueOf(i4));
        k(i2 + i5 <= i6, "offset (%d) + count (%d) ! <= %d", Integer.valueOf(i2), Integer.valueOf(i5), Integer.valueOf(i6));
        k(i4 + i5 <= i3, "otherOffset (%d) + count (%d) ! <= %d", Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i3));
    }

    public static void m(int i2, int i3) {
        String strD;
        if (i2 < 0 || i2 >= i3) {
            if (i2 < 0) {
                strD = D("%s (%s) must not be negative", "index", Integer.valueOf(i2));
            } else {
                if (i3 < 0) {
                    ore.p(zo5.h(i3, "negative size: "));
                    return;
                }
                strD = D("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i2), Integer.valueOf(i3));
            }
            throw new IndexOutOfBoundsException(strD);
        }
    }

    public static void n(Object obj, Object obj2) {
        if (obj == null) {
            ore.n(c0a.n(obj2, "null key in entry: null="));
        } else {
            if (obj2 != null) {
                return;
            }
            throw new NullPointerException("null value in entry: " + obj + "=null");
        }
    }

    public static void o(String str, int... iArr) {
        int i2 = 0;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            Log.e("GLESUtils", str + ": " + new GLException(iGlGetError).getMessage());
            i2 = iGlGetError;
        }
        if (i2 == 0 || a.L0(i2, iArr)) {
            return;
        }
        final GLException gLException = new GLException(i2, zo5.p(str, ": ", new GLException(i2).getMessage()));
        new Exception(gLException) { // from class: one.video.gl.GLESUtils$GLESUtilsException
        };
    }

    public static void p(int i2, String str) {
        if (i2 >= 0) {
            return;
        }
        ore.p(qt4.j(i2, str, " cannot be negative but was: "));
    }

    public static void q(Object obj, String str) {
        if (obj != null) {
            return;
        }
        ore.n(str);
    }

    public static void r(boolean z2) {
        if (z2) {
            return;
        }
        c.t();
    }

    public static Comparable s(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2) < 0 ? comparable2 : comparable;
    }

    public static double t(double d2, double d3) {
        if (d3 > 1.0d) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum 1.0 is less than minimum " + d3 + '.');
        }
        if (d2 < d3) {
            return d3;
        }
        if (d2 > 1.0d) {
            return 1.0d;
        }
        return d2;
    }

    public static float u(float f2, float f3, float f4) {
        if (f3 <= f4) {
            if (f2 < f3) {
                return f3;
            }
            return f2 > f4 ? f4 : f2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f4 + " is less than minimum " + f3 + '.');
    }

    public static int v(int i2, int i3, int i4) {
        if (i3 <= i4) {
            if (i2 < i3) {
                return i3;
            }
            return i2 > i4 ? i4 : i2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i4 + " is less than minimum " + i3 + '.');
    }

    public static int w(int i2, cu3 cu3Var) {
        if (!cu3Var.isEmpty()) {
            if (i2 < ((Number) cu3Var.a()).intValue()) {
                return ((Number) cu3Var.a()).intValue();
            }
            return i2 > ((Number) cu3Var.b()).intValue() ? ((Number) cu3Var.b()).intValue() : i2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + cu3Var + '.');
    }

    public static long x(long j2, long j3, long j4) {
        if (j3 > j4) {
            ore.p(zo5.u(qt4.s(j4, "Cannot coerce value to an empty range: maximum ", " is less than minimum "), j3, '.'));
            return 0L;
        }
        if (j2 < j3) {
            return j3;
        }
        return j2 > j4 ? j4 : j2;
    }

    public static long y(long j2, si9 si9Var) {
        if (!si9Var.isEmpty()) {
            if (j2 < ((Number) si9Var.a()).longValue()) {
                return ((Number) si9Var.a()).longValue();
            }
            return j2 > ((Number) si9Var.b()).longValue() ? ((Number) si9Var.b()).longValue() : j2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + si9Var + '.');
    }

    public static int z(int i2, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i2);
        o(zo5.h(i2, "glCreateShader type="), new int[0]);
        GLES20.glShaderSource(iGlCreateShader, str);
        o("glShaderSource", new int[0]);
        GLES20.glCompileShader(iGlCreateShader);
        o("glCompileShader", new int[0]);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        String str2 = "Could not compile shaderId: " + GLES20.glGetShaderInfoLog(iGlCreateShader);
        Log.e("GLESUtils", str2);
        ore.q(str2);
        return 0;
    }

    public abstract m89 A(Context context, String str, WorkerParameters workerParameters);

    public m89 B(Context context, String str, WorkerParameters workerParameters) {
        m89 m89VarA = A(context, str, workerParameters);
        if (m89VarA == null) {
            try {
                try {
                    m89VarA = (m89) Class.forName(str).asSubclass(m89.class).getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                } catch (Throwable th) {
                    n1g.x().t(uzj.a, "Could not instantiate ".concat(str), th);
                    throw th;
                }
            } catch (Throwable th2) {
                n1g.x().t(uzj.a, "Invalid class: ".concat(str), th2);
                throw th2;
            }
        }
        if (!m89VarA.d) {
            return m89VarA;
        }
        throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
    }
}
