package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class pmb {
    public static final pmb a;
    public static final /* synthetic */ pmb[] b;

    static {
        pmb pmbVar = new pmb("COMPLETE", 0);
        a = pmbVar;
        b = new pmb[]{pmbVar};
    }

    public static boolean a(rrb rrbVar, Object obj) {
        if (obj == a) {
            rrbVar.b();
            return true;
        }
        if (obj instanceof omb) {
            rrbVar.onError(((omb) obj).a);
            return true;
        }
        if (obj instanceof nmb) {
            rrbVar.c(((nmb) obj).a);
            return false;
        }
        rrbVar.d(obj);
        return false;
    }

    public static pmb valueOf(String str) {
        return (pmb) Enum.valueOf(pmb.class, str);
    }

    public static pmb[] values() {
        return (pmb[]) b.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "NotificationLite.Complete";
    }
}
