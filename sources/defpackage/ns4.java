package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ns4 {
    public static final ifh b = new ifh(new i94(11));
    public final String a;

    public /* synthetic */ ns4(String str) {
        this.a = str;
    }

    public static final String a(String str) {
        if (b(str)) {
            return null;
        }
        return str;
    }

    public static final boolean b(String str) {
        return cqk.d(str, b.getValue());
    }

    public static String c(String str) {
        return c0a.o("ConversationId(id=", str, ")");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ns4) {
            return cqk.d(this.a, ((ns4) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return c(this.a);
    }
}
