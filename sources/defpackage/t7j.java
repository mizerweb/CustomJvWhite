package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public final class t7j extends koe implements qf7 {
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ View e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7j(View view, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = view;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        t7j t7jVar = new t7j(this.e, lq4Var);
        t7jVar.d = obj;
        return t7jVar;
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((t7j) create((thf) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        int i = this.c;
        View view = this.e;
        hu4 hu4Var = hu4.a;
        if (i == 0) {
            ch3.d0(obj);
            thf thfVar = (thf) this.d;
            this.d = thfVar;
            this.c = 1;
            thfVar.b(view, this);
            return hu4Var;
        }
        sbi sbiVar = sbi.a;
        int i2 = 2;
        if (i != 1) {
            if (i == 2) {
                ch3.d0(obj);
                return sbiVar;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        thf thfVar2 = (thf) this.d;
        ch3.d0(obj);
        if (view instanceof ViewGroup) {
            this.d = null;
            this.c = 2;
            thfVar2.getClass();
            dda ddaVar = new dda(new y1(i2, (ViewGroup) view));
            if (ddaVar.hasNext()) {
                thfVar2.c = ddaVar;
                thfVar2.a = 2;
                thfVar2.d = this;
                obj2 = hu4Var;
            } else {
                obj2 = sbiVar;
            }
            if (obj2 != hu4Var) {
                obj2 = sbiVar;
            }
            if (obj2 == hu4Var) {
                return hu4Var;
            }
        }
        return sbiVar;
    }
}
