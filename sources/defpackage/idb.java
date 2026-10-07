package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class idb {
    public static final idb a;
    public static final idb b;
    public static final idb c;
    public static final /* synthetic */ idb[] d;

    static {
        idb idbVar = new idb("GOOD", 0);
        a = idbVar;
        idb idbVar2 = new idb("MEDIUM", 1);
        b = idbVar2;
        idb idbVar3 = new idb("BAD", 2);
        c = idbVar3;
        d = new idb[]{idbVar, idbVar2, idbVar3};
    }

    public static idb valueOf(String str) {
        return (idb) Enum.valueOf(idb.class, str);
    }

    public static idb[] values() {
        return (idb[]) d.clone();
    }
}
