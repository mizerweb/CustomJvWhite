package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dt2 extends ct2 {
    public final /* synthetic */ int a;
    public final char b;

    public /* synthetic */ dt2(char c, int i) {
        this.a = i;
        this.b = c;
    }

    @Override // defpackage.gt2
    public final boolean c(char c) {
        switch (this.a) {
            case 0:
                return c == this.b;
            default:
                return c != this.b;
        }
    }

    @Override // defpackage.ct2, defpackage.gt2
    public final gt2 d() {
        switch (this.a) {
            case 0:
                return new dt2(this.b, 1);
            default:
                return new dt2(this.b, 0);
        }
    }

    public final String toString() {
        int i = this.a;
        char c = this.b;
        switch (i) {
            case 0:
                return "CharMatcher.is('" + gt2.a(c) + "')";
            default:
                return "CharMatcher.isNot('" + gt2.a(c) + "')";
        }
    }
}
