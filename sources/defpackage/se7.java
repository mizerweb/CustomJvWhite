package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class se7 {
    public final ConcurrentHashMap a;

    public /* synthetic */ se7(ConcurrentHashMap concurrentHashMap) {
        this.a = concurrentHashMap;
    }

    public static final void a(ConcurrentHashMap concurrentHashMap, long j, nx2 nx2Var) {
        String str = nx2Var.g;
        if (str == null) {
            gm0.Y(se7.class.getName(), "Early return in put cuz of chatData.title is null");
        } else {
            concurrentHashMap.put(Long.valueOf(j), str);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof se7) {
            return this.a.equals(((se7) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FtsCache(titles=" + this.a + ")";
    }
}
