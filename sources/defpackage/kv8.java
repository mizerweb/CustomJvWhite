package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kv8 extends qn8 {
    public final kv8 g;
    public final ljf h;
    public kv8 i;
    public String j;
    public boolean k;

    public kv8(int i, kv8 kv8Var, ljf ljfVar) {
        this.b = i;
        this.g = kv8Var;
        this.d = kv8Var == null ? 0 : kv8Var.d + 1;
        this.h = ljfVar;
        this.c = -1;
    }

    @Override // defpackage.qn8
    public final String e() {
        return this.j;
    }
}
