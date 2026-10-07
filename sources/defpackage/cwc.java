package defpackage;

import one.me.mediaeditor.PhotoViewerWidget;

/* JADX INFO: loaded from: classes2.dex */
public final class cwc extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ PhotoViewerWidget g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cwc(lq4 lq4Var, PhotoViewerWidget photoViewerWidget, int i) {
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
                cwc cwcVar = new cwc(lq4Var, photoViewerWidget, 0);
                cwcVar.f = obj;
                return cwcVar;
            default:
                cwc cwcVar2 = new cwc(lq4Var, photoViewerWidget, 1);
                cwcVar2.f = obj;
                return cwcVar2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((cwc) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((cwc) create(obj, lq4Var)).invokeSuspend(sbiVar);
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
                PhotoViewerWidget photoViewerWidget = this.g;
                zv8[] zv8VarArr = PhotoViewerWidget.f;
                bwc bwcVarQ1 = photoViewerWidget.q1();
                zv8[] zv8VarArr2 = bwc.A;
                bwcVarQ1.k((b68) obj2, false);
                break;
            default:
                Object obj3 = this.f;
                ch3.d0(obj);
                cc6 cc6Var = (cc6) obj3;
                PhotoViewerWidget photoViewerWidget2 = this.g;
                zv8[] zv8VarArr3 = PhotoViewerWidget.f;
                if (cc6Var instanceof nb6) {
                    nb6 nb6Var = (nb6) cc6Var;
                    if (nb6Var.a.b == photoViewerWidget2.u1()) {
                        if (!nb6Var.a.b()) {
                            String str = photoViewerWidget2.c;
                            a4c a4cVar = gm0.f;
                            if (a4cVar != null) {
                                je9 je9Var = je9.f;
                                if (a4cVar.b(je9Var)) {
                                    hb9 hb9Var = nb6Var.a;
                                    a4cVar.c(je9Var, str, zo5.g(hb9Var.a, hb9Var.b, "pageAppear: not photo id: ", ", type: "), null);
                                }
                            }
                        } else if (photoViewerWidget2.q1().getFailure()) {
                            photoViewerWidget2.v1().S(photoViewerWidget2.u1());
                            b68 b68VarI = photoViewerWidget2.v1().I(nb6Var.a.b);
                            if (b68VarI == null) {
                                b68VarI = t2m.c(nb6Var.a, null);
                            }
                            photoViewerWidget2.q1().k(b68VarI, photoViewerWidget2.q1().getFailure());
                        } else {
                            photoViewerWidget2.v1().T(photoViewerWidget2.u1());
                        }
                    }
                } else if (cc6Var instanceof rb6) {
                    rb6 rb6Var = (rb6) cc6Var;
                    if (rb6Var.a.b == photoViewerWidget2.u1()) {
                        b68 b68VarI2 = photoViewerWidget2.v1().I(rb6Var.a.b);
                        if (b68VarI2 == null) {
                            b68VarI2 = t2m.c(rb6Var.a, null);
                        }
                        photoViewerWidget2.q1().k(b68VarI2, true);
                    }
                }
                break;
        }
        return sbi.a;
    }
}
