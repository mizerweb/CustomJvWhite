package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class j3i {
    public final u1i a;
    public final ny8 b;
    public final ny8 c;

    public j3i(u1i u1iVar, ny8 ny8Var, ny8 ny8Var2) {
        this.a = u1iVar;
        this.b = ny8Var;
        this.c = ny8Var2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, String str2, String str3, zui zuiVar, wze wzeVar, ewe eweVar, nq4 nq4Var) throws g3i {
        i3i i3iVar;
        if (nq4Var instanceof i3i) {
            i3iVar = (i3i) nq4Var;
            int i = i3iVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                i3iVar.k = i - Integer.MIN_VALUE;
            } else {
                i3iVar = new i3i(this, nq4Var);
            }
        } else {
            i3iVar = new i3i(this, nq4Var);
        }
        Object objC = i3iVar.i;
        int i2 = i3iVar.k;
        if (i2 == 0) {
            ch3.d0(objC);
            if (((Number) ((e5d) this.c.getValue()).S5.a(e5d.S6[358]).i()).intValue() <= 0) {
                throw new g3i("Unfinished transload process detected on disabled transloader", null);
            }
            if (zuiVar == null) {
                if (str3 != null) {
                    return new kec(str2, str3, str, this.b, wzeVar);
                }
                ore.p("Path must be specified to finish transcode done in the previous upload attempt");
                return null;
            }
            i3iVar.d = str;
            i3iVar.e = str2;
            i3iVar.f = zuiVar;
            i3iVar.g = wzeVar;
            i3iVar.h = eweVar;
            i3iVar.k = 1;
            objC = this.a.c(zuiVar, i3iVar);
            hu4 hu4Var = hu4.a;
            if (objC == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            eweVar = i3iVar.h;
            wzeVar = i3iVar.g;
            zuiVar = i3iVar.f;
            str2 = i3iVar.e;
            str = i3iVar.d;
            ch3.d0(objC);
        }
        String str4 = str;
        String str5 = str2;
        zui zuiVar2 = zuiVar;
        wze wzeVar2 = wzeVar;
        return ((Boolean) objC).booleanValue() ? new kec(str5, zuiVar2.c, str4, this.b, wzeVar2) : new xec(str5, str4, zuiVar2, this.b, wzeVar2, eweVar);
    }
}
