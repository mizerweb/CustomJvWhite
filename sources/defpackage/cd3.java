package defpackage;

import android.net.Uri;
import java.nio.file.Path;

/* JADX INFO: loaded from: classes2.dex */
public final class cd3 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ xd3 g;
    public final /* synthetic */ g4b h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cd3(xd3 xd3Var, g4b g4bVar, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = xd3Var;
        this.h = g4bVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        g4b g4bVar = this.h;
        xd3 xd3Var = this.g;
        switch (i) {
            case 0:
                return new cd3(xd3Var, g4bVar, lq4Var, 0);
            default:
                return new cd3(xd3Var, g4bVar, lq4Var, 1);
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
        return ((cd3) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        cd3 cd3Var;
        switch (this.e) {
            case 0:
                sbi sbiVar = sbi.a;
                hu4 hu4Var = hu4.a;
                int i = this.f;
                if (i == 0) {
                    ch3.d0(obj);
                    rt2 rt2Var = (rt2) this.g.G1.a.getValue();
                    Long l = rt2Var != null ? new Long(rt2Var.a) : null;
                    xd3 xd3Var = this.g;
                    if (l == null) {
                        xd3Var.I().B(f4b.EMPTY_CHAT, this.h);
                    } else {
                        ahg ahgVar = (ahg) xd3Var.w.getValue();
                        long jLongValue = l.longValue();
                        g4b g4bVar = this.h;
                        String str = this.g.d;
                        String str2 = (str == null || str.length() == 0) ? null : str;
                        this.f = 1;
                        cd3Var = this;
                        if (ahgVar.a(jLongValue, g4bVar, str2, cd3Var) == hu4Var) {
                            return hu4Var;
                        }
                    }
                    return sbiVar;
                }
                if (i != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                cd3Var = this;
                cd3Var.g.d = null;
                return sbiVar;
            default:
                sbi sbiVar2 = sbi.a;
                hu4 hu4Var2 = hu4.a;
                int i2 = this.f;
                if (i2 == 0) {
                    ch3.d0(obj);
                    a4c a4cVar = gm0.f;
                    a4c a4cVar2 = a4cVar != null ? a4cVar : null;
                    if (a4cVar2 == null) {
                        xd3 xd3Var2 = this.g;
                        zv8[] zv8VarArr = xd3.X1;
                        xd3Var2.I().B(f4b.NO_LOGGER, this.h);
                    } else {
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
                xd3 xd3Var3 = this.g;
                Uri uriFromFile = Uri.fromFile(((Path) obj).toFile());
                g4b g4bVar2 = this.h;
                zv8[] zv8VarArr2 = xd3.X1;
                xd3Var3.T(uriFromFile, null, null, g4bVar2, null);
                return sbiVar2;
        }
    }
}
