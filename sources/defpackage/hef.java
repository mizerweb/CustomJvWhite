package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class hef {
    public static final hef a;
    public static final hef b;
    public static final /* synthetic */ hef[] c;

    static {
        hef hefVar = new hef("START", 0);
        a = hefVar;
        hef hefVar2 = new hef("FINISH", 1);
        b = hefVar2;
        c = new hef[]{hefVar, hefVar2};
    }

    public static hef valueOf(String str) {
        return (hef) Enum.valueOf(hef.class, str);
    }

    public static hef[] values() {
        return (hef[]) c.clone();
    }
}
