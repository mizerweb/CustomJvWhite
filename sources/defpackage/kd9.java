package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class kd9 extends cwd {
    public final /* synthetic */ int b = 1;

    public kd9(ld9 ld9Var) {
        super(ld9Var, f55.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1);
    }

    @Override // defpackage.cwd, defpackage.xv8
    public final Object get() {
        switch (this.b) {
            case 0:
                return this.receiver.getClass().getSimpleName();
            default:
                v6e v6eVar = (v6e) this.receiver;
                return Boolean.valueOf(v6eVar.d.l() > v6eVar.b());
        }
    }

    public /* synthetic */ kd9(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
