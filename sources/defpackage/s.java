package defpackage;

import java.nio.file.Path;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class s extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ y g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(y yVar, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = yVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        y yVar = this.g;
        switch (i) {
            case 0:
                return new s(yVar, lq4Var, 0);
            default:
                return new s(yVar, lq4Var, 1);
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
        return ((s) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                sbi sbiVar = sbi.a;
                hu4 hu4Var = hu4.a;
                int i = this.f;
                if (i == 0) {
                    ch3.d0(obj);
                    y yVar = this.g;
                    mjg mjgVar = yVar.h;
                    c79 c79VarW = yab.w();
                    if (((Number) yVar.c.l.a(e5d.S6[3]).i()).longValue() != 0) {
                        c79VarW.add(bhf.a);
                    }
                    tnh tnhVar = new tnh(R.string.about_app_settings_version);
                    ((wxb) yVar.f.getValue()).getClass();
                    c79VarW.add(new e6g(tnhVar, new xnh("26.28.0")));
                    c79 c79VarJ = yab.j(c79VarW);
                    this.f = 1;
                    mjgVar.setValue(c79VarJ);
                    if (sbiVar == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                return sbiVar;
            default:
                sbi sbiVar2 = sbi.a;
                hu4 hu4Var2 = hu4.a;
                int i2 = this.f;
                if (i2 == 0) {
                    ch3.d0(obj);
                    a4c a4cVar = gm0.f;
                    a4c a4cVar2 = a4cVar != null ? a4cVar : null;
                    if (a4cVar2 != null) {
                        this.f = 1;
                        obj = a4cVar2.a(this);
                        if (obj == hu4Var2) {
                            return hu4Var2;
                        }
                    }
                    return sbiVar2;
                }
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                a8j.x(this.g.g, new w((Path) obj));
                return sbiVar2;
        }
    }
}
