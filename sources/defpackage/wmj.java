package defpackage;

import android.os.Build;
import android.os.Vibrator;
import one.me.webapp.rootscreen.WebAppRootScreen;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wmj implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ WebAppRootScreen b;

    public /* synthetic */ wmj(WebAppRootScreen webAppRootScreen, int i) {
        this.a = i;
        this.b = webAppRootScreen;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00b5  */
    @Override // defpackage.af7
    public final Object invoke() {
        bdj bdjVar;
        int i = this.a;
        Object obj = null;
        WebAppRootScreen webAppRootScreen = this.b;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = WebAppRootScreen.G;
                ifh ifhVar = new ifh(new wmj(webAppRootScreen, 3));
                ahj ahjVar = webAppRootScreen.l;
                joj jojVar = (joj) ahjVar.getAccessor().c(1036);
                long jF1 = webAppRootScreen.F1();
                vv vvVar = webAppRootScreen.f;
                zv8[] zv8VarArr2 = WebAppRootScreen.G;
                zv8 zv8Var = zv8VarArr2[2];
                String str = (String) vvVar.a(webAppRootScreen);
                for (Object obj2 : bdj.p) {
                    if (((bdj) obj2).a.equals(str)) {
                        obj = obj2;
                        bdjVar = (bdj) obj;
                        if (bdjVar == null) {
                            bdjVar = bdj.URL;
                        }
                        bdj bdjVar2 = bdjVar;
                        vv vvVar2 = webAppRootScreen.d;
                        zv8 zv8Var2 = zv8VarArr2[0];
                        Long l = (Long) vvVar2.a(webAppRootScreen);
                        vv vvVar3 = webAppRootScreen.g;
                        zv8 zv8Var3 = zv8VarArr2[3];
                        String str2 = (String) vvVar3.a(webAppRootScreen);
                        vv vvVar4 = webAppRootScreen.i;
                        zv8 zv8Var4 = zv8VarArr2[5];
                        String str3 = (String) vvVar4.a(webAppRootScreen);
                        ooj oojVar = webAppRootScreen.E;
                        ttj ttjVar = (ttj) ahjVar.getAccessor().c(1035);
                        stj stjVar = new stj(webAppRootScreen.F1(), ttjVar.a, ttjVar.b, ttjVar.c, ttjVar.d);
                        qsj qsjVar = webAppRootScreen.m;
                        is8 is8Var = (is8) ahjVar.getAccessor().c(1031);
                        jojVar.getClass();
                        return new ioj(jF1, bdjVar2, l, str2, oojVar, str3, ifhVar, stjVar, qsjVar, jojVar.a, jojVar.b, jojVar.c, jojVar.d, is8Var, jojVar.e, jojVar.f, jojVar.g, jojVar.h, jojVar.i, jojVar.j, jojVar.k, jojVar.l, jojVar.m, jojVar.n, jojVar.o, jojVar.p, jojVar.q, jojVar.r, jojVar.s, jojVar.t, jojVar.u, jojVar.v, jojVar.w);
                    }
                }
                bdjVar = (bdj) obj;
                if (bdjVar == null) {
                    bdjVar = bdj.URL;
                }
                bdj bdjVar3 = bdjVar;
                vv vvVar5 = webAppRootScreen.d;
                zv8 zv8Var5 = zv8VarArr2[0];
                Long l2 = (Long) vvVar5.a(webAppRootScreen);
                vv vvVar6 = webAppRootScreen.g;
                zv8 zv8Var6 = zv8VarArr2[3];
                String str4 = (String) vvVar6.a(webAppRootScreen);
                vv vvVar7 = webAppRootScreen.i;
                zv8 zv8Var7 = zv8VarArr2[5];
                String str5 = (String) vvVar7.a(webAppRootScreen);
                ooj oojVar2 = webAppRootScreen.E;
                ttj ttjVar2 = (ttj) ahjVar.getAccessor().c(1035);
                stj stjVar2 = new stj(webAppRootScreen.F1(), ttjVar2.a, ttjVar2.b, ttjVar2.c, ttjVar2.d);
                qsj qsjVar2 = webAppRootScreen.m;
                is8 is8Var2 = (is8) ahjVar.getAccessor().c(1031);
                jojVar.getClass();
                return new ioj(jF1, bdjVar3, l2, str4, oojVar2, str5, ifhVar, stjVar2, qsjVar2, jojVar.a, jojVar.b, jojVar.c, jojVar.d, is8Var2, jojVar.e, jojVar.f, jojVar.g, jojVar.h, jojVar.i, jojVar.j, jojVar.k, jojVar.l, jojVar.m, jojVar.n, jojVar.o, jojVar.p, jojVar.q, jojVar.r, jojVar.s, jojVar.t, jojVar.u, jojVar.v, jojVar.w);
            case 1:
                zv8[] zv8VarArr3 = WebAppRootScreen.G;
                ztj ztjVar = (ztj) webAppRootScreen.J1().z1.a.getValue();
                if ((ztjVar != null ? ztjVar.c : null) instanceof loj) {
                    return y3f.MINIAPP_ERROR;
                }
                if (webAppRootScreen.J1().d == bdj.BOTTOMBAR) {
                    return null;
                }
                return y3f.MINIAPP;
            case 2:
                zv8[] zv8VarArr4 = WebAppRootScreen.G;
                return new cuj(webAppRootScreen.K1());
            default:
                zv8[] zv8VarArr5 = WebAppRootScreen.G;
                return Build.VERSION.SDK_INT >= 31 ? f0a.h(webAppRootScreen.getContext().getSystemService("vibrator_manager")).getDefaultVibrator() : (Vibrator) webAppRootScreen.getContext().getSystemService("vibrator");
        }
    }
}
