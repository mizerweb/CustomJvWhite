package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.LabeledIntent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import android.util.Base64;
import java.security.KeyFactory;
import java.security.Signature;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import one.me.sdk.android.tools.SignatureGenerateException;
import org.apache.http.protocol.HTTP;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class sj8 {
    public static final String a = new sj8().getClass().getName();

    public static void a(Context context, String str) {
        Object poeVar;
        try {
            Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:".concat(str)));
            intent.setFlags(268435456);
            context.startActivity(intent);
            poeVar = sbi.a;
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        Throwable thA = roe.a(poeVar);
        if (thA != null) {
            gm0.V(a, "callByPhone: failed", thA);
        }
    }

    public static Intent b(Context context, Intent intent) {
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        Object obj = null;
        if (listQueryIntentActivities.isEmpty()) {
            gm0.Y(sj8.class.getName(), "Early return in getChooserIntentWithTgOnFirstPlaceOrDefault cuz of resolveInfos.isEmpty()");
            return null;
        }
        Intent intentCreateChooser = Intent.createChooser(intent, null);
        for (Object obj2 : listQueryIntentActivities) {
            String str = ((ResolveInfo) obj2).activityInfo.packageName;
            if (cqk.d(str, "org.telegram.messenger") || cqk.d(str, "org.telegram.messenger.beta") || cqk.d(str, "org.telegram.messenger.web")) {
                obj = obj2;
                break;
            }
        }
        ResolveInfo resolveInfo = (ResolveInfo) obj;
        if (resolveInfo != null) {
            Intent intent2 = (Intent) intent.clone();
            intent2.setPackage(resolveInfo.activityInfo.packageName);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
            intent2.addFlags(268435456);
            intentCreateChooser.putExtra("android.intent.extra.INITIAL_INTENTS", new LabeledIntent[]{new LabeledIntent(intent2, resolveInfo.activityInfo.packageName, resolveInfo.labelRes, resolveInfo.icon)});
        }
        return intentCreateChooser;
    }

    public static Intent c(Context context) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.parse("package:" + context.getPackageName()));
        return intent;
    }

    public static Intent d(Context context, boolean z) {
        if (!z) {
            return Build.VERSION.SDK_INT >= 34 ? new Intent("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT", Uri.fromParts("package", context.getPackageName(), null)) : c(context);
        }
        Intent intent = new Intent("miui.intent.action.APP_PERM_EDITOR");
        intent.setPackage("com.miui.securitycenter");
        intent.putExtra("extra_package_uid", Process.myUid());
        intent.putExtra("extra_pkgname", context.getPackageName());
        return intent;
    }

    public static Intent e(Context context) {
        Intent intent = new Intent();
        intent.setFlags(268435456);
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
        return intent;
    }

    public static Intent f(Context context) {
        Intent intent = new Intent();
        intent.setAction("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
        intent.setData(Uri.parse("package:" + context.getPackageName()));
        return intent;
    }

    public static void g(Context context) {
        Object poeVar;
        try {
            Intent intent = new Intent();
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setData(Uri.parse("package:" + context.getPackageName()));
            context.startActivity(intent);
            poeVar = sbi.a;
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        Throwable thA = roe.a(poeVar);
        if (thA != null) {
            gm0.V(a, "openAppSettings error", thA);
        }
    }

    public static String h(String str, String str2) {
        try {
            byte[] bArrDecode = Base64.decode(Pattern.compile("\\s").matcher(Pattern.compile("-----\\w+ PRIVATE KEY-----").matcher(str).replaceAll("")).replaceAll(""), 0);
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            PKCS8EncodedKeySpec pKCS8EncodedKeySpec = new PKCS8EncodedKeySpec(bArrDecode);
            Signature signature = Signature.getInstance("SHA256withRSA");
            signature.initSign(keyFactory.generatePrivate(pKCS8EncodedKeySpec));
            signature.update(str2.getBytes(pt2.a));
            return Base64.encodeToString(signature.sign(), 2);
        } catch (Exception e) {
            throw new SignatureGenerateException("Error calculating cipher data. SIC!", e);
        }
    }

    public static void i(Context context, Uri uri, String str) {
        Object poeVar;
        try {
            xde xdeVar = new xde(context);
            ((Intent) xdeVar.c).setType(str);
            xdeVar.e = null;
            ArrayList arrayList = new ArrayList();
            xdeVar.e = arrayList;
            arrayList.add(uri);
            xdeVar.R();
            poeVar = sbi.a;
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        Throwable thA = roe.a(poeVar);
        if (thA != null) {
            gm0.V(a, "shareMedia: failed", thA);
        }
    }

    public static void j(Context context, CharSequence charSequence, Uri uri) {
        Object poeVar;
        try {
            xde xdeVar = new xde(context);
            ((Intent) xdeVar.c).setType((uri == null || uri.equals(Uri.EMPTY)) ? HTTP.PLAIN_TEXT_TYPE : "image/*");
            xdeVar.Q(charSequence);
            poeVar = null;
            xdeVar.e = null;
            if (uri != null) {
                ArrayList arrayList = new ArrayList();
                xdeVar.e = arrayList;
                arrayList.add(uri);
            }
            Intent intentB = b(context, xdeVar.t());
            if (intentB != null) {
                context.startActivity(intentB);
                poeVar = sbi.a;
            }
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        Throwable thA = roe.a(poeVar);
        if (thA != null) {
            gm0.V(a, "showInviteDialog error", thA);
        }
    }

    public static void k(Context context, boolean z) {
        Object poeVar;
        try {
            context.startActivity(d(context, z));
            poeVar = sbi.a;
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        Throwable thA = roe.a(poeVar);
        if (thA != null) {
            String str = a;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, zo5.r("showFsiSettings getOpenFsiSettingsIntent error ", thA), null);
                }
            }
            context.startActivity(c(context));
        }
    }

    public static Uri l(Context context, Uri uri) {
        try {
            Uri.Builder builderAppendQueryParameter = uri.buildUpon().appendQueryParameter("client", "613").appendQueryParameter("utm_source", "max");
            return builderAppendQueryParameter.appendQueryParameter("signature", h(context.getString(R.string.ya_key), builderAppendQueryParameter.build().toString())).build();
        } catch (SignatureGenerateException e) {
            gm0.V(a, "fail to generate signature", e);
            return uri;
        }
    }
}
