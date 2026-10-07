package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class dhi {
    public static final ConcurrentHashMap.KeySetView a = ConcurrentHashMap.newKeySet();

    public static void a(String str) {
        a.remove(str);
    }
}
