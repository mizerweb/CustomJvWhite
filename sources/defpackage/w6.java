package defpackage;

import android.content.SharedPreferences;
import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.List;
import one.me.android.initialization.AccountInitializer;
import org.apache.http.HttpStatus;

/* JADX INFO: loaded from: classes.dex */
public final class w6 extends mdh implements cf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w6(Object obj, lq4 lq4Var, int i) {
        super(1, lq4Var);
        this.e = i;
        this.g = obj;
    }

    @Override // defpackage.mq0
    public final lq4 create(lq4 lq4Var) {
        int i = this.e;
        Object obj = this.g;
        switch (i) {
            case 0:
                return new w6((AccountInitializer) obj, lq4Var, 0);
            default:
                return new w6((ldh) obj, lq4Var, 1);
        }
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj;
        switch (i) {
            case 0:
                break;
        }
        return ((w6) create(lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                hu4 hu4Var = hu4.a;
                int i = this.f;
                try {
                    if (i == 0) {
                        ch3.d0(obj);
                        ifh ifhVarD = ((AccountInitializer) this.g).d().getAccessor().d(27);
                        AccountInitializer accountInitializer = (AccountInitializer) this.g;
                        zk7 zk7Var = new zk7(ifhVarD, new ifh(new qo7(4, accountInitializer)), accountInitializer.d().getAccessor().d(660), ((AccountInitializer) this.g).d().getAccessor().d(635), ((AccountInitializer) this.g).d().getAccessor().d(465), ((AccountInitializer) this.g).d().getAccessor().d(HttpStatus.SC_PAYMENT_REQUIRED));
                        ghb ghbVar = ew5.b;
                        long jO = qe7.O(5, lw5.SECONDS);
                        jhc jhcVar = new jhc(zk7Var, null, 2);
                        this.f = 1;
                        obj = lvb.M0(jO, jhcVar, this);
                        if (obj == hu4Var) {
                            return hu4Var;
                        }
                    } else {
                        if (i != 1) {
                            ore.k("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ch3.d0(obj);
                    }
                    if (!cqk.d((Boolean) obj, Boolean.TRUE)) {
                        gm0.Y("ExecutorsState", "fail!");
                    }
                    break;
                } catch (Exception unused) {
                }
                e5d e5dVarF = ((AccountInitializer) this.g).d().f();
                e5dVarF.getClass();
                List<i5d> listM1 = ww3.M1(new ArrayList(e5dVarF.o().values()), new xa8(18));
                ArrayMap arrayMap = new ArrayMap(listM1.size());
                for (i5d i5dVar : listM1) {
                    String str = i5dVar.a;
                    ul9 ul9Var = new ul9(6);
                    ul9Var.put("current", i5dVar.e(i5dVar.i()));
                    ul9Var.put("changeType", kt8.c(iic.n(i5dVar.o)));
                    ul9Var.put("local", i5dVar.e(d0g.c(i5dVar.g(), i5dVar.a, null, i5dVar.h, i5dVar.f(), i5dVar.i)));
                    ul9Var.put("server", i5dVar.e(d0g.c((SharedPreferences) i5dVar.m.getValue(), i5dVar.a, null, i5dVar.h, i5dVar.f(), i5dVar.i)));
                    ul9Var.put("exp", i5dVar.e(d0g.c((SharedPreferences) i5dVar.l.getValue(), i5dVar.a, null, i5dVar.h, i5dVar.f(), i5dVar.i)));
                    ul9Var.put("def", i5dVar.e(i5dVar.b));
                    arrayMap.put(str, new cu8(ul9Var.b()));
                }
                qs8 qs8Var = (qs8) e5dVarF.a.getValue();
                cu8 cu8Var = new cu8(arrayMap);
                qs8Var.getClass();
                gm0.x("PmsProperties", qs8Var.b(cu8.Companion.serializer(), cu8Var), null);
                return sbi.a;
            default:
                ldh ldhVar = (ldh) this.g;
                hu4 hu4Var2 = hu4.a;
                int i2 = this.f;
                if (i2 == 0) {
                    ch3.d0(obj);
                    gm0.n(ldhVar.j, "handle logout");
                    this.f = 1;
                    if (ldhVar.k(this) == hu4Var2) {
                        return hu4Var2;
                    }
                } else {
                    if (i2 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                return sbi.a;
        }
    }
}
