package defpackage;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.Map;
import one.me.android.initialization.AccountInitializer;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* JADX INFO: loaded from: classes.dex */
public final class t6 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public final /* synthetic */ AccountInitializer f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t6(AccountInitializer accountInitializer, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.f = accountInitializer;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        AccountInitializer accountInitializer = this.f;
        switch (i) {
            case 0:
                return new t6(accountInitializer, lq4Var, 0);
            default:
                return new t6(accountInitializer, lq4Var, 1);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((t6) create((kbc) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            default:
                ((t6) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        LinkedHashMap linkedHashMap;
        switch (this.e) {
            case 0:
                ch3.d0(obj);
                npa npaVar = (npa) qt4.i(this.f, 908);
                ((mpa) npaVar.i.getValue()).i(-1);
                mj9 mj9VarF = npaVar.f();
                synchronized (mj9VarF.c) {
                    linkedHashMap = new LinkedHashMap(mj9VarF.b.a.entrySet().size());
                    for (Map.Entry entry : mj9VarF.b.a.entrySet()) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    jpa jpaVar = (jpa) entry2.getKey();
                    my8 my8Var = (my8) entry2.getValue();
                    aka akaVarB = my8Var.b();
                    aka akaVarA = my8Var.a();
                    akaVarB.b().getPaint().setColor(((vxb) npaVar.e()).g(akaVarB.a().d()));
                    my8 my8Var2 = (my8) npaVar.f().c(jpaVar);
                    if (my8Var2 != null) {
                        my8Var2.b().c(akaVarB.b());
                    }
                    if (akaVarB != akaVarA) {
                        akaVarA.b().getPaint().setColor(((vxb) npaVar.e()).g(akaVarA.a().d()));
                        my8 my8Var3 = (my8) npaVar.f().c(jpaVar);
                        if (my8Var3 != null) {
                            my8Var3.a().c(akaVarA.b());
                        }
                    }
                }
                return sbi.a;
            default:
                ch3.d0(obj);
                ri8 ri8Var = (ri8) c0a.j(this.f, 251);
                Context context = ri8Var.a;
                ny8 ny8Var = ri8Var.d;
                ny8 ny8Var2 = ri8Var.c;
                gm0.n("ri8", "send");
                try {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null || installerPackageName.length() == 0) {
                        gm0.Y("ri8", "installer is empty");
                    } else {
                        gm0.m("ri8", "execute: installer %s", installerPackageName);
                        String strI0 = z5h.I0(z5h.I0(installerPackageName, ' ', '_', false), '/', '_', false);
                        s7f s7fVar = (s7f) ny8Var2.getValue();
                        gvb gvbVar = s7fVar.R;
                        zv8[] zv8VarArr = s7f.j0;
                        String str = (String) gvbVar.m(s7fVar, zv8VarArr[40]);
                        gm0.m("ri8", "execute: prevInstaller %s", str);
                        ((wxb) ny8Var.getValue()).getClass();
                        s7f s7fVar2 = (s7f) ny8Var2.getValue();
                        if (!cqk.d((String) s7fVar2.S.m(s7fVar2, zv8VarArr[41]), "26.28.0")) {
                            ae9 ae9Var = (ae9) ri8Var.b.getValue();
                            ul9 ul9Var = new ul9();
                            s7f s7fVar3 = (s7f) ny8Var2.getValue();
                            ul9Var.put("is_update_version", Boolean.valueOf(((String) s7fVar3.S.m(s7fVar3, zv8VarArr[41])).length() > 0 || str.length() > 0));
                            ul9Var.put(SdkMetricStatEvent.VALUE_KEY, strI0);
                            ae9Var.g("GET_INSTALL_REFERRER", ul9Var.b());
                            s7f s7fVar4 = (s7f) ny8Var2.getValue();
                            ((wxb) ny8Var.getValue()).getClass();
                            s7fVar4.S.B(s7fVar4, zv8VarArr[41], "26.28.0");
                        }
                    }
                } catch (Throwable th) {
                    gm0.V("ri8", "could not get installer package name", th);
                }
                return sbi.a;
        }
    }
}
