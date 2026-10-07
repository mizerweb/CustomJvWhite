package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class wte extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public final /* synthetic */ xte f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wte(xte xteVar, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.f = xteVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        xte xteVar = this.f;
        switch (i) {
            case 0:
                return new wte(xteVar, lq4Var, 0);
            case 1:
                return new wte(xteVar, lq4Var, 1);
            default:
                return new wte(xteVar, lq4Var, 2);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        gu4 gu4Var = (gu4) obj;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((wte) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((wte) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((wte) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        iu9 iu9Var;
        switch (this.e) {
            case 0:
                ch3.d0(obj);
                iu9 iu9Var2 = this.f.g;
                if (iu9Var2 != null) {
                    iu9Var2.U();
                    hu9 hu9Var = iu9Var2.d;
                    if (hu9Var.isConnected()) {
                        hu9Var.pause();
                    } else {
                        lvb.G0("MediaController", "The controller is not connected. Ignoring pause().");
                    }
                }
                return sbi.a;
            case 1:
                ch3.d0(obj);
                xte xteVar = this.f;
                iu9 iu9Var3 = xteVar.g;
                if ((iu9Var3 == null || iu9Var3.getPlaybackState() != 3) && (iu9Var = xteVar.g) != null) {
                    iu9Var.prepare();
                }
                iu9 iu9Var4 = xteVar.g;
                if (iu9Var4 != null) {
                    iu9Var4.play();
                }
                return sbi.a;
            default:
                ch3.d0(obj);
                xte xteVar2 = this.f;
                String str = xteVar2.c;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, "notifyListeners: stop()", null);
                    }
                }
                synchronized (xteVar2.i) {
                    for (tte tteVar : xteVar2.i) {
                        xteVar2.g();
                        xteVar2.i();
                        ((Number) xteVar2.m.getValue()).longValue();
                        tteVar.b();
                    }
                }
                iu9 iu9Var5 = this.f.g;
                if (iu9Var5 != null) {
                    iu9Var5.stop();
                }
                return sbi.a;
        }
    }
}
