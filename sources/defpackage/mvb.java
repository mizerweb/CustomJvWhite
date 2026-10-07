package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class mvb {
    public static final mvb a;
    public static final mvb b;
    public static final /* synthetic */ mvb[] c;

    static {
        mvb mvbVar = new mvb("ACCEPT", 0);
        a = mvbVar;
        mvb mvbVar2 = new mvb("DECLINE", 1);
        b = mvbVar2;
        c = new mvb[]{mvbVar, mvbVar2};
    }

    public static mvb valueOf(String str) {
        return (mvb) Enum.valueOf(mvb.class, str);
    }

    public static mvb[] values() {
        return (mvb[]) c.clone();
    }
}
