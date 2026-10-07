package ru.ok.tamtam.login;

import defpackage.bg9;
import defpackage.ch3;
import defpackage.gu4;
import defpackage.hu4;
import defpackage.lq4;
import defpackage.mdh;
import defpackage.ore;
import defpackage.pzf;
import defpackage.qf7;
import defpackage.sbi;

/* JADX INFO: loaded from: classes.dex */
public final class a extends mdh implements qf7 {
    public int e;
    public final /* synthetic */ LoginEventsByBus f;
    public final /* synthetic */ bg9 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(LoginEventsByBus loginEventsByBus, bg9 bg9Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.f = loginEventsByBus;
        this.g = bg9Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        return new a(this.f, this.g, lq4Var);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        if (i == 0) {
            ch3.d0(obj);
            pzf pzfVar = this.f.a;
            this.e = 1;
            Object objEmit = pzfVar.emit(this.g, this);
            hu4 hu4Var = hu4.a;
            if (objEmit == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(obj);
        }
        return sbi.a;
    }
}
