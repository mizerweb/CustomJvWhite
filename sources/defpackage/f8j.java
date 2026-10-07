package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface f8j {
    default b8j a(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    default b8j b(Class cls, x7b x7bVar) {
        return a(cls);
    }

    default b8j c(sr3 sr3Var, x7b x7bVar) {
        return b(sr3Var.d(), x7bVar);
    }
}
