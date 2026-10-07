package defpackage;

import java.util.List;
import one.me.settings.multilang.SettingsLocaleScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class qtf extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ SettingsLocaleScreen g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qtf(lq4 lq4Var, SettingsLocaleScreen settingsLocaleScreen, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = settingsLocaleScreen;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        SettingsLocaleScreen settingsLocaleScreen = this.g;
        switch (i) {
            case 0:
                qtf qtfVar = new qtf(lq4Var, settingsLocaleScreen, 0);
                qtfVar.f = obj;
                return qtfVar;
            default:
                qtf qtfVar2 = new qtf(lq4Var, settingsLocaleScreen, 1);
                qtfVar2.f = obj;
                return qtfVar2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((qtf) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((qtf) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                Object obj2 = this.f;
                ch3.d0(obj);
                if (((rbb) obj2) instanceof qc9) {
                    String str = this.g.a;
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9 je9Var = je9.d;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, str, qv1.k("context locale: ", this.g.getContext().getResources().getConfiguration().getLocales().toLanguageTags()), null);
                        }
                    }
                    otf.b.b().f();
                }
                break;
            default:
                Object obj3 = this.f;
                ch3.d0(obj);
                this.g.j.H((List) obj3);
                break;
        }
        return sbi.a;
    }
}
