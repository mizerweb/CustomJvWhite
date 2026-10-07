package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public interface ryg {
    default String a() {
        if (this instanceof pyg) {
            return ((pyg) this).b;
        }
        if (this instanceof qyg) {
            return ((qyg) this).b;
        }
        return null;
    }

    dy8 b();
}
