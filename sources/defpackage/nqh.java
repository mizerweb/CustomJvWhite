package defpackage;

import java.util.logging.Logger;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class nqh implements eq4 {
    public static final nqh a;
    public static final ThreadLocal b;
    public static final /* synthetic */ nqh[] c;

    static {
        nqh nqhVar = new nqh("INSTANCE", 0);
        a = nqhVar;
        c = new nqh[]{nqhVar};
        Logger.getLogger(nqh.class.getName());
        b = new ThreadLocal();
    }

    public static nqh valueOf(String str) {
        return (nqh) Enum.valueOf(nqh.class, str);
    }

    public static nqh[] values() {
        return (nqh[]) c.clone();
    }

    @Override // defpackage.eq4
    public final lp4 current() {
        return (lp4) b.get();
    }
}
