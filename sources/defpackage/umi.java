package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import java.util.Arrays;
import java.util.Locale;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes.dex */
public final class umi {
    public final Context a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public tmi e;

    public umi(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, Context context) {
        this.a = context;
        this.b = ny8Var2;
        this.c = ny8Var;
        this.d = ny8Var3;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0038  */
    public final tmi a() {
        String str;
        ny8 ny8Var = this.b;
        ((wxb) ny8Var.getValue()).getClass();
        ny8 ny8Var2 = this.d;
        jc9 jc9Var = (jc9) ny8Var2.getValue();
        Context context = this.a;
        String strB = jc9Var.b(context);
        tmi tmiVar = this.e;
        if (cqk.d(tmiVar != null ? tmiVar.b : null, "26.28.0")) {
            tmi tmiVar2 = this.e;
            if (!cqk.d(tmiVar2 != null ? tmiVar2.f : null, strB)) {
                this.e = null;
            }
        } else {
            this.e = null;
        }
        tmi tmiVar3 = this.e;
        if (tmiVar3 != null) {
            return tmiVar3;
        }
        ((wxb) ny8Var.getValue()).getClass();
        String str2 = (String) a.b1(Build.SUPPORTED_ABIS);
        if (str2 == null) {
            str2 = "UNKNOWN";
        }
        String str3 = str2;
        ((wxb) ny8Var.getValue()).getClass();
        String str4 = String.format(Locale.ENGLISH, "Android %s", Arrays.copyOf(new Object[]{Build.VERSION.RELEASE}, 1));
        String strB2 = ((jc9) ny8Var2.getValue()).b(context);
        String language = kc9.e(context).getLanguage();
        String strP = zo5.p(Build.MANUFACTURER, " ", Build.MODEL);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i = displayMetrics.densityDpi;
        if (i == 120) {
            str = "ldpi";
        } else if (i == 160) {
            str = "mdpi";
        } else if (i == 240) {
            str = "hdpi";
        } else if (i == 320) {
            str = "xhdpi";
        } else if (i == 480) {
            str = "xxhdpi";
        } else if (i != 640) {
            str = i + "dpi";
        } else {
            str = "xxxhdpi";
        }
        int i2 = displayMetrics.widthPixels;
        int i3 = displayMetrics.heightPixels;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" ");
        sb.append(i);
        sb.append("dpi ");
        sb.append(i2);
        tmi tmiVar4 = new tmi(str4, str3, strB2, language, strP, zo5.v(sb, "x", i3), ((oqg) this.c.getValue()).f());
        this.e = tmiVar4;
        return tmiVar4;
    }
}
