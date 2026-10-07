package defpackage;

import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class xec implements iii {
    public final String a;
    public final String b;
    public final zui c;
    public final ny8 d;
    public final wze e;
    public final ewe f;

    public xec(String str, String str2, zui zuiVar, ny8 ny8Var, wze wzeVar, ewe eweVar) {
        this.a = str;
        this.b = str2;
        this.c = zuiVar;
        this.d = ny8Var;
        this.e = wzeVar;
        this.f = eweVar;
    }

    @Override // defpackage.iii
    public final xx6 a() throws IOException {
        wec wecVar = (wec) this.d.getValue();
        wecVar.getClass();
        zui zuiVar = this.c;
        String str = zuiVar.c;
        ku6.B(str);
        File file = new File(str);
        file.createNewFile();
        vfe vfeVar = new vfe();
        ny8 ny8Var = wecVar.a;
        ny8 ny8Var2 = wecVar.b;
        ny8 ny8Var3 = wecVar.c;
        u1i u1iVar = wecVar.d;
        oji ojiVar = oji.VIDEO;
        String str2 = this.b;
        uhi uhiVar = new uhi(ny8Var, ny8Var2, ny8Var3, u1iVar, ojiVar, str2);
        sfe sfeVar = new sfe();
        return new fz6(new jz(new l7(new dz6(new bye(new hki(new bye(new wz6(new l7(new k3i(null, null, zuiVar.e.e, 0, 0L, null, null), e9i.r(new kd3(wecVar, zuiVar, file, this.a, String.valueOf(file.getName().hashCode()), str2, uhiVar, this.e, null)), new vqa(3, (lq4) null, 6), 5), (lq4) null, vfeVar, 26)), (lq4) null, wecVar, sfeVar, zuiVar, this.f, vfeVar)), new rgi(sfeVar, zuiVar, wecVar, (lq4) null)), wecVar, vfeVar, 7), 13), new awa(zuiVar, (lq4) null, 13));
    }
}
