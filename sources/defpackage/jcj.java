package defpackage;

import android.content.ComponentName;
import one.me.android.concurrent.WatchdogFeature$ToggleService;

/* JADX INFO: loaded from: classes.dex */
public final class jcj implements m74 {
    public static final jcj a;
    public static final /* synthetic */ zv8[] b;
    public static final icj c;
    public static ifh d;

    static {
        z8b z8bVar = new z8b(jcj.class, "config", "getConfig()Lone/me/sdk/concurrent/OneMeExecutors$WatchdogConfig;");
        zfe.a.getClass();
        b = new zv8[]{z8bVar};
        a = new jcj();
        c = new icj(4, m94.h);
    }

    public static z1c a() {
        zv8 zv8Var = b[0];
        return (z1c) c.b;
    }

    public final void b(z1c z1cVar) {
        c.B(this, b[0], z1cVar);
    }

    @Override // defpackage.m74
    public final ComponentName c() {
        return new ComponentName("ru.oneme.app", WatchdogFeature$ToggleService.class.getName());
    }
}
