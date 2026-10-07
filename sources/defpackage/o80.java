package defpackage;

import android.content.Context;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o80 implements pah {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ o80(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // defpackage.pah
    public final Object get() {
        d85 d85Var;
        int i = this.a;
        Context context = this.b;
        switch (i) {
            case 0:
                return p90.q(context);
            case 1:
                return new jc5(context, new ra5());
            case 2:
                return new fd5(context);
            case 3:
                return new jc5(context, new ra5());
            case 4:
                return new ve5(context);
            default:
                ghe gheVar = d85.p;
                synchronized (d85.class) {
                    try {
                        if (d85.v == null) {
                            Context applicationContext = context == null ? null : context.getApplicationContext();
                            HashMap map = new HashMap(8);
                            map.put(0, 1000000L);
                            map.put(2, -9223372036854775807L);
                            map.put(3, -9223372036854775807L);
                            map.put(4, -9223372036854775807L);
                            map.put(5, -9223372036854775807L);
                            map.put(10, -9223372036854775807L);
                            map.put(9, -9223372036854775807L);
                            map.put(7, -9223372036854775807L);
                            d85.v = new d85(applicationContext, map);
                        }
                        d85Var = d85.v;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return d85Var;
        }
    }
}
