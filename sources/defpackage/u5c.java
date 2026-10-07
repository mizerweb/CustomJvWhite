package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class u5c {
    public static final u5c a;
    public static final u5c b;
    public static final u5c c;
    public static final u5c d;
    public static final u5c e;
    public static final /* synthetic */ u5c[] f;

    static {
        u5c u5cVar = new u5c("MESSAGE", 0);
        a = u5cVar;
        u5c u5cVar2 = new u5c("COMMENTS_POST_PREVIEW", 1);
        b = u5cVar2;
        u5c u5cVar3 = new u5c("INFORMER", 2);
        c = u5cVar3;
        u5c u5cVar4 = new u5c("INFORMER_NEW", 3);
        d = u5cVar4;
        u5c u5cVar5 = new u5c("PENDING_JOIN_REQUESTS", 4);
        e = u5cVar5;
        f = new u5c[]{u5cVar, u5cVar2, u5cVar3, u5cVar4, u5cVar5};
    }

    public static u5c valueOf(String str) {
        return (u5c) Enum.valueOf(u5c.class, str);
    }

    public static u5c[] values() {
        return (u5c[]) f.clone();
    }
}
