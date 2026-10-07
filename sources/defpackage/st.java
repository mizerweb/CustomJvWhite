package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class st implements cg7 {
    public final boolean equals(Object obj) {
        if (obj instanceof st) {
            return getFunctionDelegate().equals(((cg7) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.cg7
    public final uf7 getFunctionDelegate() {
        return new fg7(1, 0, ku6.class, ku6.b, "existsAndCanRead", "existsAndCanRead(Ljava/lang/String;)Z");
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
