package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class b5d implements j8e {
    public final Object a;
    public final boolean b;
    public final boolean c;
    public final sr3 d;
    public final int e;
    public final ny8 f;
    public final ny8 g;
    public final ifh h;
    public i5d i;
    public final /* synthetic */ e5d j;

    public b5d(e5d e5dVar, Object obj, boolean z, boolean z2, sr3 sr3Var, int i, ny8 ny8Var, ny8 ny8Var2) {
        this(e5dVar, obj, z, z2, sr3Var, i, ny8Var, ny8Var2, new ifh(new i94(12)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final i5d a(zv8 zv8Var) {
        i5d i5dVar = this.i;
        if (i5dVar != null) {
            return i5dVar;
        }
        String name = ((l72) zv8Var).getName();
        i5d i5dVar2 = new i5d(name, this.a, this.e, this.b, this.c, this.f, this.g, this.d, this.h, this.j);
        this.j.o().put(name, i5dVar2);
        this.i = i5dVar2;
        return i5dVar2;
    }

    public final void b(zv8 zv8Var) {
        a(zv8Var);
    }

    @Override // defpackage.j8e
    public final Object m(Object obj, zv8 zv8Var) {
        return a(zv8Var);
    }

    public b5d(e5d e5dVar, Object obj, boolean z, boolean z2, sr3 sr3Var, int i, ny8 ny8Var, ny8 ny8Var2, ifh ifhVar) {
        this.j = e5dVar;
        this.a = obj;
        this.b = z;
        this.c = z2;
        this.d = sr3Var;
        this.e = i;
        this.f = ny8Var;
        this.g = ny8Var2;
        this.h = ifhVar;
    }
}
