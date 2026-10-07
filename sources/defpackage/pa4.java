package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class pa4 {
    public static final int d;
    public static final int e;
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public Configuration c;

    static {
        int i = Build.VERSION.SDK_INT;
        d = i >= 31 ? 268451204 : 15748;
        e = i >= 31 ? 1342177280 : 1073741824;
    }

    public pa4(Context context) {
        this.c = new Configuration(context.getResources().getConfiguration());
        context.registerComponentCallbacks(new na4(this, 0, context));
    }

    public final void a(int i, oa4 oa4Var) {
        ((Set) this.b.computeIfAbsent(Integer.valueOf(i), new ka4(0, new c6(28)))).add(oa4Var);
    }
}
