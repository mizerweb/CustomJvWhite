package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface k79 {
    long getItemId();

    default boolean h(k79 k79Var) {
        return getItemId() == k79Var.getItemId();
    }

    int j();

    default boolean m(k79 k79Var) {
        return equals(k79Var);
    }

    default Object n(k79 k79Var) {
        return null;
    }
}
