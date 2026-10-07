package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class uvh {
    public static WeakReference c;
    public g85 a;
    public final ScheduledThreadPoolExecutor b;

    public uvh(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.b = scheduledThreadPoolExecutor;
    }

    public final synchronized tvh a() {
        String str;
        tvh tvhVar;
        g85 g85Var = this.a;
        synchronized (((ArrayDeque) g85Var.d)) {
            str = (String) ((ArrayDeque) g85Var.d).peek();
        }
        Pattern pattern = tvh.d;
        tvhVar = null;
        if (!TextUtils.isEmpty(str)) {
            String[] strArrSplit = str.split("!", -1);
            if (strArrSplit.length == 2) {
                tvhVar = new tvh(strArrSplit[0], strArrSplit[1]);
            }
        }
        return tvhVar;
    }
}
