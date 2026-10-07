package defpackage;

import android.graphics.Matrix;
import android.graphics.drawable.GradientDrawable;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.util.Patterns;
import java.lang.annotation.Annotation;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import one.me.inviteactions.invitebyphone.InviteByPhoneScreen;
import one.me.login.inputname.InputNameScreen;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class q38 implements af7 {
    public final /* synthetic */ int a;

    public /* synthetic */ q38(int i) {
        this.a = i;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new lge("((25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9])\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[1-9]|0)\\.(25[0-5]|2[0-4][0-9]|[0-1][0-9]{2}|[1-9][0-9]|[0-9]))");
            case 1:
                return new lge("^(([0-9a-fA-F]{1,4}:){7,7}[0-9a-fA-F]{1,4}|([0-9a-fA-F]{1,4}:){1,7}:|([0-9a-fA-F]{1,4}:){1,6}:[0-9a-fA-F]{1,4}|([0-9a-fA-F]{1,4}:){1,5}(:[0-9a-fA-F]{1,4}){1,2}|([0-9a-fA-F]{1,4}:){1,4}(:[0-9a-fA-F]{1,4}){1,3}|([0-9a-fA-F]{1,4}:){1,3}(:[0-9a-fA-F]{1,4}){1,4}|([0-9a-fA-F]{1,4}:){1,2}(:[0-9a-fA-F]{1,4}){1,5}|[0-9a-fA-F]{1,4}:((:[0-9a-fA-F]{1,4}){1,6})|:((:[0-9a-fA-F]{1,4}){1,7}|:)|fe80:(:[0-9a-fA-F]{0,4}){0,4}%[0-9a-zA-Z]{1,}|::(ffff(:0{1,4}){0,1}:){0,1}((25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9])\\.){3,3}(25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9])|([0-9a-fA-F]{1,4}:){1,4}:((25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9])\\.){3,3}(25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9]))$");
            case 2:
                zv8[] zv8VarArr = t58.A;
                return sbi.a;
            case 3:
                return ewl.a("one.me.webapp.domain.jsbridge.delegates.haptic.ImpactStyle", aa8.values(), new String[]{"light", "medium", "heavy", "rigid", "soft"}, new Annotation[][]{null, null, null, null, null});
            case 4:
                return new r7g(false);
            case 5:
                return new r7g(true);
            case 6:
                DecimalFormat decimalFormat = new DecimalFormat();
                DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols();
                decimalFormatSymbols.setDecimalSeparator(',');
                decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
                decimalFormat.setGroupingUsed(false);
                decimalFormat.setMaximumFractionDigits(2);
                decimalFormat.setMinimumFractionDigits(0);
                decimalFormat.setPositiveSuffix("×");
                return decimalFormat;
            case 7:
                zv8[] zv8VarArr2 = InputNameScreen.r;
                return y3f.AUTH_EMPTY_PROFILE;
            case 8:
                return new r7g(false);
            case 9:
                return new r7g(true);
            case 10:
                return new r7g(false);
            case 11:
                return new r7g(true);
            case 12:
                zv8[] zv8VarArr3 = InviteByPhoneScreen.p;
                return y3f.CONTACTS_SEARCH_BY_PHONE;
            case 13:
                return new r7g(true);
            case 14:
                return new r7g(true);
            case 15:
                return su8.b;
            case 16:
                return au8.b;
            case 17:
                return wt8.b;
            case 18:
                return fu8.b;
            case 19:
                return vs8.b;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(yl5.d().getDisplayMetrics().density * 10.0f);
                gradientDrawable.setShape(0);
                return gradientDrawable;
            case 21:
                return Boolean.valueOf(Build.BRAND.equals("google"));
            case 22:
                return new Matrix();
            case 23:
                return new Matrix();
            case 24:
                return Patterns.WEB_URL;
            case 25:
                return Patterns.WEB_URL;
            case 26:
                return new q7b();
            case 27:
                return new MediaMetadataRetriever();
            case 28:
                return new r7g(false);
            default:
                return new r7g(true);
        }
    }
}
