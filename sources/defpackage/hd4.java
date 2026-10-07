package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hd4 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ hd4(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = z;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        long jZ0;
        int i = this.a;
        sbi sbiVar = sbi.a;
        boolean z = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                id4 id4Var = (id4) obj2;
                vfe vfeVar = (vfe) obj;
                id4Var.a();
                boolean z2 = id4Var.f;
                if (z2 && z && id4Var.g != 0) {
                    jZ0 = yab.z0((v44) id4Var.k, id4Var.e);
                } else {
                    jZ0 = 0;
                    if (z2 && z) {
                        ghb ghbVar = ew5.b;
                    } else if (z2) {
                        jZ0 = id4Var.b;
                    } else if (!ew5.f(id4Var.e, 0L)) {
                        jZ0 = yab.z0((v44) id4Var.k, id4Var.e);
                    }
                }
                vfeVar.a = jZ0;
                break;
            default:
                nnf nnfVar = (nnf) obj;
                ArrayList arrayList = ((rnf) obj2).l;
                int i2 = 0;
                while (true) {
                    if (i2 < arrayList.size()) {
                        int i3 = i2 + 1;
                        if (!cqk.d(((ylc) arrayList.get(i2)).a, nnfVar)) {
                            i2 = i3;
                        }
                    } else {
                        i2 = -1;
                    }
                }
                if (i2 == -1) {
                    arrayList.add(new ylc(nnfVar, Boolean.valueOf(z)));
                } else {
                    arrayList.set(i2, new ylc(nnfVar, Boolean.valueOf(z)));
                }
                break;
        }
        return sbiVar;
    }
}
