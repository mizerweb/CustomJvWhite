package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ehi {
    public static final dq4 a = cqk.a(wk8.a());
    public static final ConcurrentHashMap b = new ConcurrentHashMap();

    public static void a(String str) {
        vo8 vo8Var = (vo8) b.remove(str);
        if (vo8Var != null) {
            vo8Var.b(null);
        }
    }
}
