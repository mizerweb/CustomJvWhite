package defpackage;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class yqi {
    public static final Pattern b = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static yqi c;
    public final lu8 a;

    public yqi(lu8 lu8Var) {
        this.a = lu8Var;
    }

    public final boolean a(ki0 ki0Var) {
        if (TextUtils.isEmpty(ki0Var.c)) {
            return true;
        }
        long j = ki0Var.f + ki0Var.e;
        this.a.getClass();
        return j < (System.currentTimeMillis() / 1000) + 3600;
    }
}
