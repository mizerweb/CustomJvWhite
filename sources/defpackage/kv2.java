package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class kv2 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ lv2 g;
    public final /* synthetic */ String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kv2(lv2 lv2Var, String str, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = lv2Var;
        this.h = str;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        String str = this.h;
        lv2 lv2Var = this.g;
        switch (i) {
            case 0:
                return new kv2(lv2Var, str, lq4Var, 0);
            default:
                return new kv2(lv2Var, str, lq4Var, 1);
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
                break;
        }
        return ((kv2) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        String str = this.h;
        lv2 lv2Var = this.g;
        hu4 hu4Var = hu4.a;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ch3.d0(obj);
                        return obj;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                rt2 rt2VarV = lv2Var.v();
                s59 s59Var = (rt2VarV == null || !rt2VarV.d0()) ? s59.a : s59.b;
                np3 np3Var = (np3) lv2Var.n.getValue();
                this.f = 1;
                Serializable serializableA = np3Var.a(str, s59Var, this);
                return serializableA == hu4Var ? hu4Var : serializableA;
            default:
                int i3 = this.f;
                if (i3 == 0) {
                    ch3.d0(obj);
                    pzf pzfVar = lv2Var.x;
                    this.f = 1;
                    if (pzfVar.emit(str, this) == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i3 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                return sbi.a;
        }
    }
}
