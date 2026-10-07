package defpackage;

import java.util.List;
import java.util.Map;
import ru.ok.tamtam.messages.c;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class v14 implements cf7 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ v14(long j, g24 g24Var, long j2) {
        List list = xfa.b;
        this.b = j;
        this.d = g24Var;
        this.c = j2;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x007b  */
    @Override // defpackage.cf7
    public final Object invoke(Object obj) throws Exception {
        int i = this.a;
        boolean z = true;
        long j = this.c;
        long j2 = this.b;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                g24 g24Var = (g24) obj2;
                List list = xfa.b;
                vxe vxeVarO0 = ((qxe) obj).O0("UPDATE comments SET update_time = ?, delivery_status = ? WHERE id = ?");
                try {
                    vxeVarO0.c(1, j2);
                    g24Var.a().getClass();
                    vxeVarO0.c(2, 20L);
                    vxeVarO0.c(3, j);
                    vxeVarO0.M0();
                    return sbi.a;
                } finally {
                    vxeVarO0.close();
                }
            case 1:
                mg5 mg5Var = (mg5) obj2;
                sfa sfaVar = ((c) ((Map.Entry) obj).getValue()).d;
                long j3 = sfaVar.c;
                if (sfaVar.h == j2) {
                    int i2 = mg5Var == null ? -1 : ucd.$EnumSwitchMapping$0[mg5Var.ordinal()];
                    if (i2 == -1 || i2 == 1) {
                        if (j3 > j) {
                            z = false;
                        }
                    } else {
                        if (i2 != 2) {
                            ore.o();
                            return null;
                        }
                        ng5 ng5Var = sfaVar.G;
                        if (ng5Var == null || ng5Var.a > j) {
                            z = false;
                        }
                    }
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                i8e i8eVar = (i8e) obj2;
                return yab.h0((wmi) i8eVar.e.getValue(), ((n0c) ((xhh) i8eVar.i.getValue())).b(), 2, new ag0(i8eVar, this.b, this.c, null, 6));
        }
    }

    public /* synthetic */ v14(long j, long j2, mg5 mg5Var) {
        this.b = j;
        this.d = mg5Var;
        this.c = j2;
    }

    public /* synthetic */ v14(i8e i8eVar, long j, long j2) {
        this.d = i8eVar;
        this.b = j;
        this.c = j2;
    }
}
