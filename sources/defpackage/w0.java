package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class w0 implements oah {
    public final /* synthetic */ au5 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ int e;
    public final /* synthetic */ x0 f;

    public w0(x0 x0Var, au5 au5Var, String str, Object obj, Object obj2, int i) {
        this.f = x0Var;
        this.a = au5Var;
        this.b = str;
        this.c = obj;
        this.d = obj2;
        this.e = i;
    }

    @Override // defpackage.oah
    public final Object get() {
        u78 u78Var;
        String str;
        x0 x0Var = this.f;
        au5 au5Var = this.a;
        String str2 = this.b;
        Object obj = this.c;
        Object obj2 = this.d;
        int i = this.e;
        v78 v78Var = (v78) obj;
        b78 b78Var = ((t1d) x0Var).n;
        int iD = qt4.D(i);
        if (iD == 0) {
            u78Var = u78.FULL_FETCH;
        } else if (iD == 1) {
            u78Var = u78.DISK_CACHE;
        } else {
            if (iD != 2) {
                if (i == 1) {
                    str = "FULL_FETCH";
                } else if (i != 2) {
                    str = i != 3 ? "null" : "BITMAP_MEMORY_CACHE";
                } else {
                    str = "DISK_CACHE";
                }
                throw new RuntimeException("Cache level" + str + "is not supported. ");
            }
            u78Var = u78.BITMAP_MEMORY_CACHE;
        }
        u78 u78Var2 = u78Var;
        if (au5Var instanceof s1d) {
            synchronized (((s1d) au5Var)) {
            }
        }
        return b78Var.a(v78Var, obj2, u78Var2, null, str2);
    }

    public final String toString() {
        dc9 dc9VarC = qdl.c(this);
        dc9VarC.x(this.c.toString(), "request");
        return dc9VarC.toString();
    }
}
