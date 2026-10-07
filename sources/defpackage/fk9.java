package defpackage;

import android.content.SharedPreferences;
import one.me.android.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public final class fk9 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ MainActivity g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fk9(MainActivity mainActivity, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = mainActivity;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        MainActivity mainActivity = this.g;
        switch (i) {
            case 0:
                return new fk9(mainActivity, lq4Var, 0);
            case 1:
                return new fk9(mainActivity, lq4Var, 1);
            default:
                return new fk9(mainActivity, lq4Var, 2);
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
            case 1:
                break;
        }
        return ((fk9) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Object value;
        int i = 0;
        int i2 = 1;
        lq4 lq4Var = null;
        switch (this.e) {
            case 0:
                sbi sbiVar = sbi.a;
                hu4 hu4Var = hu4.a;
                int i3 = this.f;
                if (i3 == 0) {
                    ch3.d0(obj);
                    xyj xyjVar = (xyj) this.g.z.getAccessor().d(292).getValue();
                    this.f = 1;
                    Object objK0 = yab.K0(((n0c) xyjVar.c).b(), new wyj(xyjVar, lq4Var, i), this);
                    if (objK0 != hu4Var) {
                        objK0 = sbiVar;
                    }
                    if (objK0 == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i3 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                return sbiVar;
            case 1:
                je9 je9Var = je9.d;
                hu4 hu4Var2 = hu4.a;
                int i4 = this.f;
                int i5 = 2;
                if (i4 == 0) {
                    ch3.d0(obj);
                    ur2 ur2VarK0 = e9i.k0(r7.b, new l3(i5, lq4Var, 6));
                    this.f = 1;
                    if (e9i.N(ur2VarK0, this) == hu4Var2) {
                        return hu4Var2;
                    }
                } else {
                    if (i4 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                String str = this.g.y;
                a4c a4cVar = gm0.f;
                if (a4cVar != null && a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "logout, event received", null);
                }
                ha9 ha9VarA = ((y6b) d7c.a.getAccessor().c(174)).a();
                r7 r7Var = r7.a;
                r3f r3fVarB = r7.b(ha9VarA);
                boolean z = (r3fVarB == null || ((s7f) ((et3) new qzb(r3fVarB).getAccessor().d(85).getValue())).t() == -1) ? false : true;
                String str2 = this.g.y;
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                    a4cVar2.c(je9Var, str2, "logout, navigate to account " + ha9VarA + ", isLoggedIn=" + z, null);
                }
                if (z) {
                    hl9.b.j(ha9VarA);
                } else {
                    o65.c(kk9.b.b(), ":login", null, ha9VarA, 2);
                }
                pq3 pq3VarE = pq3.j.e(this.g.getApplicationContext());
                j55 j55Var = (j55) pq3VarE.e;
                SharedPreferences.Editor editorEdit = ((SharedPreferences) ((ifh) j55Var.a).getValue()).edit();
                ahb.a.getClass();
                zgb zgbVar = zgb.b;
                j55Var.d = zgbVar;
                editorEdit.putString("nightmode", j85.w(zgbVar));
                nbc nbcVar = nbc.SPACE;
                editorEdit.putString("themename", "OneMeGlobalThemeColorSpace");
                editorEdit.apply();
                mjg mjgVar = (mjg) pq3VarE.g;
                do {
                    value = mjgVar.getValue();
                } while (!mjgVar.h(value, Integer.valueOf(((Number) value).intValue() + 1)));
                MainActivity mainActivity = this.g;
                yab.i0(tre.d0(mainActivity), null, 0, new fk9(mainActivity, lq4Var, i5), 3);
                return sbi.a;
            default:
                hu4 hu4Var3 = hu4.a;
                int i6 = this.f;
                if (i6 == 0) {
                    ch3.d0(obj);
                    MainActivity mainActivity2 = this.g;
                    i19 i19Var = mainActivity2.a;
                    n09 n09Var = n09.e;
                    fk9 fk9Var = new fk9(mainActivity2, lq4Var, i2);
                    this.f = 1;
                    if (qyj.R(i19Var, n09Var, fk9Var, this) == hu4Var3) {
                        return hu4Var3;
                    }
                } else {
                    if (i6 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                return sbi.a;
        }
    }
}
