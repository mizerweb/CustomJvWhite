package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class f7c {
    public static final f7c a;
    public static final f7c b;
    public static final f7c c;
    public static final f7c d;
    public static final f7c e;
    public static final f7c f;
    public static final /* synthetic */ f7c[] g;

    static {
        f7c f7cVar = new f7c("NEW", 0);
        a = f7cVar;
        f7c f7cVar2 = new f7c("IDLE", 1);
        b = f7cVar2;
        f7c f7cVar3 = new f7c("RUNNING", 2);
        c = f7cVar3;
        f7c f7cVar4 = new f7c("DONE", 3);
        d = f7cVar4;
        f7c f7cVar5 = new f7c("FAILED", 4);
        e = f7cVar5;
        f7c f7cVar6 = new f7c("CANCELLED", 5);
        f = f7cVar6;
        g = new f7c[]{f7cVar, f7cVar2, f7cVar3, f7cVar4, f7cVar5, f7cVar6};
    }

    public static f7c valueOf(String str) {
        return (f7c) Enum.valueOf(f7c.class, str);
    }

    public static f7c[] values() {
        return (f7c[]) g.clone();
    }
}
