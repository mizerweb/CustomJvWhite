package defpackage;

import one.me.chatscreen.mediabar.MediaBarWidget;
import one.me.sdk.gallery.selectalbum.SelectAlbumWidget;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class cs9 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaBarWidget b;

    public /* synthetic */ cs9(MediaBarWidget mediaBarWidget, int i) {
        this.a = i;
        this.b = mediaBarWidget;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        a8g a8gVar = pq3.j;
        int i2 = 0;
        MediaBarWidget mediaBarWidget = this.b;
        switch (i) {
            case 0:
                j8e j8eVar = mediaBarWidget.n1;
                zv8[] zv8VarArr = MediaBarWidget.u1;
                if (mediaBarWidget.x1().getScrollState() == ccd.c) {
                    mediaBarWidget.y1().setVisibility(0);
                    zv8[] zv8VarArr2 = MediaBarWidget.u1;
                    zp3 zp3Var = (zp3) j8eVar.m(mediaBarWidget, zv8VarArr2[18]);
                    hve hveVar = zp3Var.a;
                    if (!cqk.d(zp3Var.b(), "select_album_widget")) {
                        hveVar.S(false);
                        lve lveVarE = oc9.e(new SelectAlbumWidget(mediaBarWidget.c), null, null);
                        lveVarE.e("select_album_widget");
                        hveVar.T(lveVarE);
                    }
                    br4 br4VarC = rx8.C(((zp3) j8eVar.m(mediaBarWidget, zv8VarArr2[18])).a);
                    SelectAlbumWidget selectAlbumWidget = br4VarC instanceof SelectAlbumWidget ? (SelectAlbumWidget) br4VarC : null;
                    if (selectAlbumWidget != null) {
                        selectAlbumWidget.r1();
                    }
                }
                return sbi.a;
            case 1:
                h hVar = mediaBarWidget.d;
                return new n2e(new wze((v3f) hVar.getAccessor().c(33), i2, ((n0c) ((xhh) ((ifh) hVar.b()).getValue())).b()), new k0f((v3f) hVar.getAccessor().c(33), ((n0c) ((xhh) ((ifh) hVar.b()).getValue())).b()), (ib9) hVar.getAccessor().d(783).getValue(), (rs6) hVar.getAccessor().c(138), (v3f) hVar.getAccessor().c(33), (c2a) hVar.getAccessor().c(318), (xhh) ((ifh) hVar.b()).getValue(), (wo6) hVar.getAccessor().d(54).getValue(), true, hVar.getAccessor().d(782));
            case 2:
                return ((y9h) mediaBarWidget.d.getAccessor().c(797)).a(mediaBarWidget.C1().c, sol.b(mediaBarWidget.c), new cs9(mediaBarWidget, 7), new fik(new cs9(mediaBarWidget, 8)));
            case 3:
                zv8[] zv8VarArr3 = MediaBarWidget.u1;
                return new gi7(new cs9(mediaBarWidget, 6));
            case 4:
                zv8[] zv8VarArr4 = MediaBarWidget.u1;
                return new h7a(mediaBarWidget.D1());
            case 5:
                return new jdf((rb8) mediaBarWidget.d.getAccessor().c(782), new adf(false, true, jh7.a));
            case 6:
                zv8[] zv8VarArr5 = MediaBarWidget.u1;
                return Boolean.valueOf(mediaBarWidget.C1().E());
            case 7:
                zv8[] zv8VarArr6 = MediaBarWidget.u1;
                return a8gVar.e(mediaBarWidget.getContext()).m();
            default:
                zv8[] zv8VarArr7 = MediaBarWidget.u1;
                return a8gVar.e(mediaBarWidget.getContext()).m();
        }
    }
}
