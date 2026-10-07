package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class qgi extends mdh implements qf7 {
    public final /* synthetic */ int e = 0;
    public /* synthetic */ Object f;
    public final /* synthetic */ zgi g;
    public final /* synthetic */ zui h;
    public final /* synthetic */ AtomicReference i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qgi(zgi zgiVar, zui zuiVar, AtomicReference atomicReference, lq4 lq4Var) {
        super(2, lq4Var);
        this.g = zgiVar;
        this.h = zuiVar;
        this.i = atomicReference;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        AtomicReference atomicReference = this.i;
        zui zuiVar = this.h;
        zgi zgiVar = this.g;
        switch (i) {
            case 0:
                qgi qgiVar = new qgi(zgiVar, atomicReference, zuiVar, lq4Var);
                qgiVar.f = obj;
                return qgiVar;
            default:
                qgi qgiVar2 = new qgi(zgiVar, zuiVar, atomicReference, lq4Var);
                qgiVar2.f = obj;
                return qgiVar2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        vfi vfiVar = (vfi) obj;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((qgi) create(vfiVar, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        lq4 lq4Var = null;
        int i = 3;
        switch (this.e) {
            case 0:
                je9 je9Var = je9.d;
                vfi vfiVar = (vfi) this.f;
                ch3.d0(obj);
                boolean zA = vfiVar.a();
                String str = this.g.c;
                if (zA) {
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null && a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, "No need for uploading due it already finished", null);
                    }
                    mii miiVarH = this.g.h();
                    String str2 = vfiVar.a.d;
                    miiVarH.getClass();
                    miiVarH.i(str2, new ylc("warm_upload", 1));
                    return new tz(7, vfiVar);
                }
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                    a4cVar2.c(je9Var, str, "Requested upload to server", null);
                }
                zgi zgiVar = this.g;
                AtomicReference atomicReference = this.i;
                zui zuiVar = this.h;
                int i2 = 28;
                int i3 = 0;
                int i4 = 2;
                return e9i.H(new fz6(e9i.R(new fz6(new q0d(new fz6(new q0d(new l7(new tz(7, vfiVar), zuiVar, zgiVar, 10), zgiVar, i2), new rea(i4, zgiVar, zgi.class, "putInRepository", "putInRepository(Lone/me/sdk/transfer/domain/Upload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", i3, 20), i), zgiVar, 29), new rea(i4, zgiVar, zgi.class, "putInRepository", "putInRepository(Lone/me/sdk/transfer/domain/Upload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", i3, 21), i), new qgi(zgiVar, zuiVar, atomicReference, (lq4) null)), new ryf(zgiVar, lq4Var, i2), i), new qti(1));
            default:
                vfi vfiVar2 = (vfi) this.f;
                ch3.d0(obj);
                zgi zgiVar2 = this.g;
                zui zuiVar2 = this.h;
                AtomicReference atomicReference2 = this.i;
                wfe wfeVar = new wfe();
                wfeVar.a = vfiVar2;
                int i5 = 5;
                fz6 fz6Var = new fz6(new l7(new bye(new b2f(i5, null, wfeVar, zgiVar2, zuiVar2, new wze(zgiVar2, 9, wfeVar))), wfeVar, zgiVar2, 9), new b67(atomicReference2, zgiVar2, lq4Var, 5), i);
                u8h u8hVar = new u8h(16);
                ghb ghbVar = ew5.b;
                lw5 lw5Var = lw5.MILLISECONDS;
                int i6 = 15;
                return new fz6(new j3(new j3(e9i.r(new i80(qe7.O(500, lw5Var), qe7.O(0, lw5Var), fz6Var, u8hVar, (lq4) null)), 14, new rgi(zgiVar2, wfeVar, lq4Var, i6)), i6, new ugi(zgiVar2, wfeVar, null)), new j8g(zgiVar2, lq4Var, 21), i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qgi(zgi zgiVar, AtomicReference atomicReference, zui zuiVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.g = zgiVar;
        this.i = atomicReference;
        this.h = zuiVar;
    }
}
