package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rrc {
    public final /* synthetic */ ny8 a;
    public final /* synthetic */ ny8 b;
    public final /* synthetic */ ny8 c;
    public final /* synthetic */ ny8 d;
    public final /* synthetic */ ny8 e;
    public final /* synthetic */ ny8 f;

    public rrc(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
        this.d = ny8Var4;
        this.e = ny8Var5;
        this.f = ny8Var6;
    }

    public final byte a() {
        return ((pk5) this.a.getValue()).a;
    }

    public final int b() {
        wd4 wd4Var = (wd4) this.b.getValue();
        if (wd4Var.h()) {
            return wd4Var.a().a;
        }
        return 1;
    }

    public final int c() {
        return ((Number) ((f5d) ((wo6) this.d.getValue())).a.i3.a(e5d.S6[218]).i()).intValue();
    }
}
