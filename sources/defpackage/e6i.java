package defpackage;

import java.util.Arrays;
import kotlin.collections.a;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class e6i extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ j6i g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e6i(j6i j6iVar, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = j6iVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        j6i j6iVar = this.g;
        switch (i) {
            case 0:
                return new e6i(j6iVar, lq4Var, 0);
            default:
                return new e6i(j6iVar, lq4Var, 1);
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
        return ((e6i) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Object objE;
        int i = this.e;
        sbi sbiVar = sbi.a;
        j6i j6iVar = this.g;
        hu4 hu4Var = hu4.a;
        switch (i) {
            case 0:
                ic6 ic6Var = j6iVar.r;
                int i2 = this.f;
                if (i2 == 0) {
                    ch3.d0(obj);
                    a8j.x(ic6Var, new l7i(true));
                    o44 o44Var = j6iVar.g;
                    String str = j6iVar.d;
                    mk8 mk8Var = j6iVar.c;
                    this.f = 1;
                    objE = o44Var.e(str, mk8Var, this);
                    if (objE == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i2 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                    objE = ((roe) obj).a;
                }
                Throwable thA = roe.a(objE);
                if (thA != null) {
                    a8j.x(ic6Var, new k7i(0, 6, vzl.b(thA)));
                    return sbiVar;
                }
                ch3.d0(objE);
                int iA = tca.a(((Number) objE).longValue(), (et3) j6iVar.h.getValue());
                a8j.x(ic6Var, new k7i(R.drawable.icon_delete_fill, 4, new rnh(R.plurals.oneme_settings_twofa_delete_user_days_notif, iA, a.n1(Arrays.copyOf(new Object[]{new Integer(iA)}, 1)))));
                return sbiVar;
            default:
                int i3 = this.f;
                if (i3 == 0) {
                    ch3.d0(obj);
                    this.f = 1;
                    return j6i.C(j6iVar, this) == hu4Var ? hu4Var : sbiVar;
                }
                if (i3 == 1) {
                    ch3.d0(obj);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
