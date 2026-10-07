package defpackage;

import one.me.stories.edit.PhotoViewerWidget;

/* JADX INFO: loaded from: classes3.dex */
public final class dwc extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ PhotoViewerWidget g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dwc(lq4 lq4Var, PhotoViewerWidget photoViewerWidget, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = photoViewerWidget;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        PhotoViewerWidget photoViewerWidget = this.g;
        switch (i) {
            case 0:
                dwc dwcVar = new dwc(lq4Var, photoViewerWidget, 0);
                dwcVar.f = obj;
                return dwcVar;
            default:
                dwc dwcVar2 = new dwc(lq4Var, photoViewerWidget, 1);
                dwcVar2.f = obj;
                return dwcVar2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((dwc) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((dwc) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                Object obj2 = this.f;
                ch3.d0(obj);
                zv8[] zv8VarArr = PhotoViewerWidget.e;
                break;
            default:
                Object obj3 = this.f;
                ch3.d0(obj);
                e16 e16Var = (e16) obj3;
                zv8[] zv8VarArr2 = PhotoViewerWidget.e;
                if (e16Var.a.l == jb9.b) {
                    PhotoViewerWidget photoViewerWidget = this.g;
                    if (!photoViewerWidget.q1().getFailure()) {
                        photoViewerWidget.u1().S();
                    } else {
                        photoViewerWidget.u1().R();
                        p26 p26VarU1 = photoViewerWidget.u1();
                        hb9 hb9VarI = p26VarU1.I();
                        b68 b68VarC = (hb9VarI == null || !hb9VarI.b()) ? null : t2m.c(hb9VarI, p26VarU1.M(hb9VarI));
                        if (b68VarC == null) {
                            b68VarC = t2m.c(h1h.b(e16Var.a), null);
                        }
                        photoViewerWidget.q1().k(b68VarC, photoViewerWidget.q1().getFailure());
                    }
                }
                break;
        }
        return sbiVar;
    }
}
