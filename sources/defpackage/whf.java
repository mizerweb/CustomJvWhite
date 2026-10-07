package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class whf extends o1 {
    public final int h;
    public final Object i;

    public whf(int i, Object obj) {
        this.h = i;
        this.i = obj;
    }

    public static whf r(int i, Object obj) {
        return new whf(i, obj);
    }

    public final Object s() {
        return this.i;
    }

    public final int t() {
        return this.h;
    }

    public final void u() {
        super.m(this.i);
    }
}
