package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class et2 extends ct2 {
    public final char a;
    public final char b;

    public et2(char c, char c2) {
        this.a = c;
        this.b = c2;
    }

    @Override // defpackage.gt2
    public final boolean c(char c) {
        return c == this.a || c == this.b;
    }

    public final String toString() {
        return "CharMatcher.anyOf(\"" + gt2.a(this.a) + gt2.a(this.b) + "\")";
    }
}
