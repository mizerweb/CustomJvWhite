package defpackage;

import java.util.Locale;
import one.me.transparent.TransparentWidget;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class z3i implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TransparentWidget b;

    public /* synthetic */ z3i(TransparentWidget transparentWidget, int i) {
        this.a = i;
        this.b = transparentWidget;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        Object poeVar;
        int i = this.a;
        TransparentWidget transparentWidget = this.b;
        switch (i) {
            case 0:
                yr8 yr8Var = TransparentWidget.m;
                try {
                    poeVar = kc9.e(transparentWidget.getContext()).getLanguage();
                    break;
                } catch (Throwable th) {
                    poeVar = new poe(th);
                }
                Throwable thA = roe.a(poeVar);
                if (thA != null) {
                    gm0.V(transparentWidget.k, "fail to fetch language", thA);
                }
                if (poeVar instanceof poe) {
                    poeVar = null;
                }
                String language = (String) poeVar;
                if (language == null) {
                    language = Locale.getDefault().getLanguage();
                }
                return language.toLowerCase(Locale.ROOT);
            default:
                yr8 yr8Var2 = TransparentWidget.m;
                transparentWidget.getRouter().C(transparentWidget);
                return sbi.a;
        }
    }
}
