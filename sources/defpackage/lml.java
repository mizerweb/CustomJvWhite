package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class lml {
    public static final int a(syd sydVar) {
        return sydVar.b;
    }

    public static final syd b(int i) {
        for (syd sydVar : syd.g) {
            if (sydVar.b == i) {
                return sydVar;
            }
        }
        ore.f("Collection contains no element matching the predicate.");
        return null;
    }

    public static final void c(ps4 ps4Var, String str) {
        ps4Var.getClass();
        str.getClass();
        if (ps4Var instanceof qs4) {
            qs4 qs4Var = (qs4) ps4Var;
            if (cqk.d(qs4Var.b, str)) {
                return;
            }
            us4 us4Var = qs4Var.a;
            us4Var.a.onConversationIdChanged(qs4Var.b, str);
            qs4Var.b = str;
        }
    }
}
