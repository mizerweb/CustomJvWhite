package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class by4 implements qf7 {
    public final /* synthetic */ r17 a;
    public final /* synthetic */ sy4 b;

    public by4(r17 r17Var, sy4 sy4Var) {
        this.a = r17Var;
        this.b = sy4Var;
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        f9b f9bVar = (f9b) obj2;
        je9 je9Var = je9.d;
        if (f9bVar == null) {
            return p90.a(this.a);
        }
        r17 r17Var = (r17) f9bVar.getValue();
        if (r17Var == null) {
            String str = this.b.c;
            r17 r17Var2 = this.a;
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, c0a.o("Folder(", r17Var2.a, ") was set to flow"), null);
            }
            f9bVar.setValue(this.a);
            return f9bVar;
        }
        long j = r17Var.k;
        r17 r17Var3 = this.a;
        long j2 = r17Var3.k;
        String str2 = this.b.c;
        if (j > j2) {
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, str2, c0a.o("Folder(", r17Var3.a, ") was ignored due to greater time of present folder"), null);
            }
            return f9bVar;
        }
        a4c a4cVar3 = gm0.f;
        if (a4cVar3 != null && a4cVar3.b(je9Var)) {
            a4cVar3.c(je9Var, str2, c0a.o("Folder(", r17Var3.a, ") was updated by folder from cache"), null);
        }
        f9bVar.setValue(this.a);
        return f9bVar;
    }
}
