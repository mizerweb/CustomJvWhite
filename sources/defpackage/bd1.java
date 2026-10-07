package defpackage;

import android.view.MotionEvent;

/* JADX INFO: loaded from: classes2.dex */
public final class bd1 extends mdh implements vf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ boolean f;
    public /* synthetic */ boolean g;
    public /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bd1(int i, lq4 lq4Var, int i2) {
        super(i, lq4Var);
        this.e = i2;
    }

    @Override // defpackage.vf7
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                bd1 bd1Var = new bd1(4, (lq4) obj4, 0);
                bd1Var.f = zBooleanValue;
                bd1Var.g = zBooleanValue2;
                bd1Var.h = (gc) obj3;
                return bd1Var.invokeSuspend(sbiVar);
            case 1:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                boolean zBooleanValue4 = ((Boolean) obj3).booleanValue();
                bd1 bd1Var2 = new bd1(4, (lq4) obj4, 1);
                bd1Var2.f = zBooleanValue3;
                bd1Var2.h = (mla) obj2;
                bd1Var2.g = zBooleanValue4;
                return bd1Var2.invokeSuspend(sbiVar);
            case 2:
                boolean zBooleanValue5 = ((Boolean) obj2).booleanValue();
                boolean zBooleanValue6 = ((Boolean) obj3).booleanValue();
                bd1 bd1Var3 = new bd1(4, (lq4) obj4, 2);
                bd1Var3.h = (zy5) obj;
                bd1Var3.f = zBooleanValue5;
                bd1Var3.g = zBooleanValue6;
                return bd1Var3.invokeSuspend(sbiVar);
            default:
                boolean zBooleanValue7 = ((Boolean) obj2).booleanValue();
                boolean zBooleanValue8 = ((Boolean) obj3).booleanValue();
                bd1 bd1Var4 = new bd1(4, (lq4) obj4, 3);
                bd1Var4.h = (ec6) obj;
                bd1Var4.f = zBooleanValue7;
                bd1Var4.g = zBooleanValue8;
                return bd1Var4.invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008d  */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        boolean z;
        zka zkaVar;
        yka ykaVar = null;
        switch (this.e) {
            case 0:
                boolean z2 = this.f;
                boolean z3 = this.g;
                gc gcVar = (gc) this.h;
                ch3.d0(obj);
                return Boolean.valueOf((gcVar.a || gcVar.c) && z2 && z3);
            case 1:
                boolean z4 = this.f;
                mla mlaVar = (mla) this.h;
                boolean z5 = this.g;
                ch3.d0(obj);
                if (mlaVar != null) {
                    MotionEvent motionEvent = mlaVar.b;
                    if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = true;
                }
                return Boolean.valueOf((z4 || z5 || !z) ? false : true);
            case 2:
                zy5 zy5Var = (zy5) this.h;
                boolean z6 = this.f;
                boolean z7 = this.g;
                ch3.d0(obj);
                boolean z8 = z6 || z7;
                if (zy5Var instanceof xy5) {
                    return new az5(true, 28);
                }
                if (zy5Var instanceof wy5) {
                    return new az5(false, 28);
                }
                if (zy5Var instanceof yy5) {
                    yy5 yy5Var = (yy5) zy5Var;
                    return new az5(yy5Var.b, true, yy5Var.c, !z8, z8, yy5Var.a);
                }
                ore.o();
                return null;
            default:
                ec6 ec6Var = (ec6) this.h;
                boolean z9 = this.f;
                boolean z10 = this.g;
                ch3.d0(obj);
                if (ec6Var != null && (zkaVar = (zka) ec6Var.a) != null) {
                    ykaVar = zkaVar.a;
                }
                return new e5i(ykaVar, Boolean.valueOf(z9), Boolean.valueOf(z10));
        }
    }
}
