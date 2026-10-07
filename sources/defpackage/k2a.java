package defpackage;

import android.os.Bundle;
import java.util.HashMap;
import one.me.android.media.service.OneMeMediaSessionService;

/* JADX INFO: loaded from: classes.dex */
public class k2a {
    public static final Object b = new Object();
    public static final HashMap c = new HashMap();
    public final d3a a;

    public k2a(OneMeMediaSessionService oneMeMediaSessionService, String str, bg6 bg6Var, c98 c98Var, c98 c98Var2, c98 c98Var3, f2a f2aVar, Bundle bundle, Bundle bundle2, xx0 xx0Var, boolean z, boolean z2) {
        synchronized (b) {
            HashMap map = c;
            if (map.containsKey(str)) {
                throw new IllegalStateException("Session ID must be unique. ID=" + str);
            }
            map.put(str, this);
        }
        this.a = new d3a(this, oneMeMediaSessionService, str, bg6Var, c98Var, c98Var2, c98Var3, f2aVar, bundle, bundle2, xx0Var, z, z2);
    }

    public final l3d a() {
        return this.a.t.b;
    }
}
