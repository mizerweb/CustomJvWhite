package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dub extends fg7 implements tf7 {
    public static final dub a = new dub(3, eub.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        eub eubVar = (eub) obj;
        tdf tdfVar = (tdf) obj2;
        long j = eubVar.a;
        sbi sbiVar = sbi.a;
        if (j <= 0) {
            ((sdf) tdfVar).e = sbiVar;
            return sbiVar;
        }
        o90 o90Var = new o90(tdfVar, 19, eubVar);
        sdf sdfVar = (sdf) tdfVar;
        vt4 vt4Var = sdfVar.a;
        sdfVar.c = rx8.D(vt4Var).t0(j, o90Var, vt4Var);
        return sbiVar;
    }
}
