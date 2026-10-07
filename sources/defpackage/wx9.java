package defpackage;

import java.util.List;
import one.me.sdk.gallery.MediaGalleryWidget;

/* JADX INFO: loaded from: classes4.dex */
public final class wx9 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ MediaGalleryWidget g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wx9(lq4 lq4Var, MediaGalleryWidget mediaGalleryWidget, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = mediaGalleryWidget;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        MediaGalleryWidget mediaGalleryWidget = this.g;
        switch (i) {
            case 0:
                wx9 wx9Var = new wx9(lq4Var, mediaGalleryWidget, 0);
                wx9Var.f = obj;
                return wx9Var;
            case 1:
                wx9 wx9Var2 = new wx9(lq4Var, mediaGalleryWidget, 1);
                wx9Var2.f = obj;
                return wx9Var2;
            case 2:
                wx9 wx9Var3 = new wx9(lq4Var, mediaGalleryWidget, 2);
                wx9Var3.f = obj;
                return wx9Var3;
            default:
                wx9 wx9Var4 = new wx9(lq4Var, mediaGalleryWidget, 3);
                wx9Var4.f = obj;
                return wx9Var4;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((wx9) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((wx9) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 2:
                ((wx9) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((wx9) create(obj, lq4Var)).invokeSuspend(sbiVar);
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
                List list = (List) obj2;
                String str = this.g.a;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, zo5.h(list.size(), "uiItems: handleEvent, size = "), null);
                    }
                }
                this.g.p1().setVisibility(list.isEmpty() ? 8 : 0);
                ((zg7) this.g.f.getValue()).I(list, new pi(28, this.g));
                gi7 gi7VarQ1 = this.g.q1();
                int size = list.size();
                mjg mjgVar = gi7VarQ1.f;
                Integer numValueOf = Integer.valueOf(size);
                mjgVar.getClass();
                mjgVar.j(null, numValueOf);
                return sbi.a;
            case 1:
                MediaGalleryWidget mediaGalleryWidget = this.g;
                Object obj3 = this.f;
                ch3.d0(obj);
                sh7 sh7Var = (sh7) obj3;
                if (!(sh7Var instanceof qh7)) {
                    if (!(sh7Var instanceof rh7)) {
                        ore.o();
                        return null;
                    }
                    ((wsc) mediaGalleryWidget.d.getValue()).n(new svj(mediaGalleryWidget, 1));
                }
                return sbi.a;
            case 2:
                Object obj4 = this.f;
                ch3.d0(obj);
                boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                String str2 = this.g.a;
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null) {
                    je9 je9Var2 = je9.d;
                    if (a4cVar2.b(je9Var2)) {
                        a4cVar2.c(je9Var2, str2, zo5.s("isItemsLoading = ", zBooleanValue), null);
                    }
                }
                this.g.p1().setRefreshingNext(zBooleanValue);
                return sbi.a;
            default:
                MediaGalleryWidget mediaGalleryWidget2 = this.g;
                Object obj5 = this.f;
                ch3.d0(obj);
                wh7 wh7Var = (wh7) obj5;
                if (wh7Var instanceof th7) {
                    zv8[] zv8VarArr = MediaGalleryWidget.i;
                    mediaGalleryWidget2.p1().w0(0);
                    mediaGalleryWidget2.r1().C(true, true);
                } else if (wh7Var instanceof vh7) {
                    zv8[] zv8VarArr2 = MediaGalleryWidget.i;
                    ej7 ej7VarR1 = mediaGalleryWidget2.r1();
                    jef jefVar = ((vh7) wh7Var).a;
                    ej7VarR1.getClass();
                    ej7VarR1.F(jefVar.a, true);
                } else {
                    if (!(wh7Var instanceof uh7)) {
                        ore.o();
                        return null;
                    }
                    zv8[] zv8VarArr3 = MediaGalleryWidget.i;
                    mediaGalleryWidget2.p1().w0(0);
                    ej7 ej7VarR2 = mediaGalleryWidget2.r1();
                    nh7 nh7Var = ((uh7) wh7Var).a;
                    ej7VarR2.getClass();
                    gm0.n("ej7", "selectAlbum " + nh7Var);
                    mjg mjgVar2 = ej7VarR2.s;
                    nh7 nh7Var2 = (nh7) mjgVar2.getValue();
                    if (cqk.d(nh7Var2, nh7Var)) {
                        gm0.Y("ej7", "Early return in selectAlbum cuz of prevAlbum == new");
                    } else {
                        lq4 lq4Var = null;
                        try {
                            sgg sggVar = ej7VarR2.y;
                            if (sggVar != null) {
                                sggVar.b(null);
                            }
                            sgg sggVar2 = ej7VarR2.z;
                            if (sggVar2 != null) {
                                sggVar2.b(null);
                            }
                            break;
                        } catch (Throwable unused) {
                        }
                        mjg mjgVar3 = ej7VarR2.q;
                        Boolean bool = Boolean.FALSE;
                        mjgVar3.getClass();
                        mjgVar3.j(null, bool);
                        mjgVar2.j(null, nh7Var);
                        mjg mjgVar4 = ej7VarR2.n;
                        r66 r66Var = r66.a;
                        mjgVar4.getClass();
                        mjgVar4.j(null, r66Var);
                        ej7VarR2.z = a8j.t(ej7VarR2, ej7VarR2.g, new wz6(nh7Var2, ej7VarR2, nh7Var, lq4Var, 6), 2);
                    }
                }
                return sbi.a;
        }
    }
}
