package defpackage;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class rzd {
    public static final rzd a;
    public static final /* synthetic */ rzd[] b;

    static {
        rzd rzdVar = new rzd("DEFAULT", 0);
        a = rzdVar;
        rzd rzdVar2 = new rzd("UNMETERED_ONLY", 1);
        rzd rzdVar3 = new rzd("UNMETERED_OR_DAILY", 2);
        rzd rzdVar4 = new rzd("FAST_IF_RADIO_AWAKE", 3);
        rzd rzdVar5 = new rzd("NEVER", 4);
        rzd rzdVar6 = new rzd("UNRECOGNIZED", 5);
        b = new rzd[]{rzdVar, rzdVar2, rzdVar3, rzdVar4, rzdVar5, rzdVar6};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, rzdVar);
        sparseArray.put(1, rzdVar2);
        sparseArray.put(2, rzdVar3);
        sparseArray.put(3, rzdVar4);
        sparseArray.put(4, rzdVar5);
        sparseArray.put(-1, rzdVar6);
    }

    public static rzd valueOf(String str) {
        return (rzd) Enum.valueOf(rzd.class, str);
    }

    public static rzd[] values() {
        return (rzd[]) b.clone();
    }
}
