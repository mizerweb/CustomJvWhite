package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class gh9 implements vnd {
    public static final gh9 a = new gh9();

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof gh9);
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return 512L;
    }

    @Override // defpackage.k79
    public final boolean h(k79 k79Var) {
        return 512 == k79Var.getItemId();
    }

    public final int hashCode() {
        return -95268716;
    }

    @Override // defpackage.k79
    public final int j() {
        return np0.o;
    }

    @Override // defpackage.k79
    public final boolean m(k79 k79Var) {
        return equals(k79Var);
    }

    public final String toString() {
        return "LogoutItem";
    }
}
