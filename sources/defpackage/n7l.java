package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class n7l {
    private w7l a;
    private Integer b;
    private p1m c;

    public final n7l a(Integer num) {
        this.b = Integer.valueOf(num.intValue() & Integer.MAX_VALUE);
        return this;
    }

    public final n7l b(p1m p1mVar) {
        this.c = p1mVar;
        return this;
    }

    public final n7l c(w7l w7lVar) {
        this.a = w7lVar;
        return this;
    }

    public final c8l e() {
        return new c8l(this, null);
    }
}
