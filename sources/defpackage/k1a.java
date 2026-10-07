package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import one.me.mediapicker.MediaPickerScreen;
import one.me.sdk.gallery.selectalbum.SelectAlbumWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k1a implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaPickerScreen b;

    public /* synthetic */ k1a(MediaPickerScreen mediaPickerScreen, int i) {
        this.a = i;
        this.b = mediaPickerScreen;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        View viewFindViewById;
        int i = this.a;
        final int i2 = 1;
        final int i3 = 0;
        final MediaPickerScreen mediaPickerScreen = this.b;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = MediaPickerScreen.J;
                tp2 tp2Var = new tp2(mediaPickerScreen.getContext());
                tp2Var.setId(R.id.media_picker_container_id);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                layoutParams.gravity = 17;
                tp2Var.setLayoutParams(layoutParams);
                return tp2Var;
            case 1:
                zv8[] zv8VarArr2 = MediaPickerScreen.J;
                rcc rccVar = new rcc(mediaPickerScreen.getContext());
                rccVar.setId(R.id.media_picker_toolbar_id);
                rccVar.setTitle(R.string.media_picker_default_toolbar_title);
                rccVar.setLeftActions(mediaPickerScreen.x1() ? new xbc(new cf7() { // from class: l1a
                    @Override // defpackage.cf7
                    public final Object invoke(Object obj) {
                        int i4 = i3;
                        sbi sbiVar = sbi.a;
                        MediaPickerScreen mediaPickerScreen2 = mediaPickerScreen;
                        zv8[] zv8VarArr3 = MediaPickerScreen.J;
                        switch (i4) {
                            case 0:
                                mediaPickerScreen2.getRouter().D();
                                break;
                            default:
                                mediaPickerScreen2.getRouter().D();
                                break;
                        }
                        return sbiVar;
                    }
                }) : new wbc(new cf7() { // from class: l1a
                    @Override // defpackage.cf7
                    public final Object invoke(Object obj) {
                        int i4 = i2;
                        sbi sbiVar = sbi.a;
                        MediaPickerScreen mediaPickerScreen2 = mediaPickerScreen;
                        zv8[] zv8VarArr3 = MediaPickerScreen.J;
                        switch (i4) {
                            case 0:
                                mediaPickerScreen2.getRouter().D();
                                break;
                            default:
                                mediaPickerScreen2.getRouter().D();
                                break;
                        }
                        return sbiVar;
                    }
                }));
                rccVar.setTitleClickListener(new k1a(mediaPickerScreen, 3));
                rccVar.setShowDropdown(true);
                return rccVar;
            case 2:
                zv8[] zv8VarArr3 = MediaPickerScreen.J;
                View view = new View(mediaPickerScreen.getContext());
                view.setId(R.id.media_picker_divider_id);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, gm0.K(1.0f * yl5.d().getDisplayMetrics().density));
                layoutParams2.gravity = 48;
                view.setLayoutParams(layoutParams2);
                n1g.N(new b3(3, null, 1), view);
                view.setVisibility(8);
                return view;
            case 3:
                j8e j8eVar = mediaPickerScreen.q;
                zv8[] zv8VarArr4 = MediaPickerScreen.J;
                if (!(mediaPickerScreen.w1().v.a.getValue() instanceof hp4)) {
                    ow0 ow0Var = mediaPickerScreen.r;
                    zv8[] zv8VarArr5 = MediaPickerScreen.J;
                    zv8 zv8Var = zv8VarArr5[4];
                    ((tp2) ow0Var.getValue()).setVisibility(0);
                    ow0 ow0Var2 = mediaPickerScreen.v;
                    zv8 zv8Var2 = zv8VarArr5[8];
                    ((View) ow0Var2.getValue()).setVisibility(0);
                    zp3 zp3Var = (zp3) j8eVar.m(mediaPickerScreen, zv8VarArr5[3]);
                    hve hveVar = zp3Var.a;
                    if (!cqk.d(zp3Var.b(), "SELECT_ALBUM_WIDGET_TAG")) {
                        hveVar.S(false);
                        lve lveVarE = oc9.e(new SelectAlbumWidget(mediaPickerScreen.d), null, null);
                        lveVarE.e("SELECT_ALBUM_WIDGET_TAG");
                        hveVar.T(lveVarE);
                    }
                    br4 br4VarC = rx8.C(((zp3) j8eVar.m(mediaPickerScreen, zv8VarArr5[3])).a);
                    SelectAlbumWidget selectAlbumWidget = br4VarC instanceof SelectAlbumWidget ? (SelectAlbumWidget) br4VarC : null;
                    if (selectAlbumWidget != null) {
                        View view2 = selectAlbumWidget.getView();
                        if (view2 != null && (viewFindViewById = view2.findViewById(R.id.select_album_content_container)) != null) {
                            mediaPickerScreen.y1(viewFindViewById.getHeight());
                            n1g.N(new b3(3, null, 2), viewFindViewById);
                        }
                        selectAlbumWidget.r1();
                    }
                }
                return sbi.a;
            case 4:
                zv8[] zv8VarArr6 = MediaPickerScreen.J;
                ph7 ph7VarS1 = mediaPickerScreen.s1();
                return new ph7(ph7VarS1.a, ph7VarS1.b, ph7VarS1.c, ph7VarS1.d, ph7VarS1.e, ph7VarS1.f, ph7VarS1.g, ph7VarS1.h, ph7VarS1.i, ph7VarS1.j, ph7VarS1.k, ph7VarS1.l, false);
            case 5:
                zv8[] zv8VarArr7 = MediaPickerScreen.J;
                TextView textView = new TextView(mediaPickerScreen.getContext());
                textView.setText(R.string.media_picker_empty_media_data);
                q9i.a(q9i.k, textView);
                textView.setGravity(17);
                n1g.N(new xc9(3, null, 2), textView);
                ((FrameLayout) mediaPickerScreen.w.m(mediaPickerScreen, MediaPickerScreen.J[9])).addView(textView);
                return textView;
            case 6:
                h hVar = mediaPickerScreen.i;
                return new n2e(new wze((v3f) hVar.getAccessor().c(33), 0, ((n0c) ((xhh) hVar.getAccessor().d(23).getValue())).b()), new k0f((v3f) hVar.getAccessor().c(33), ((n0c) ((xhh) hVar.getAccessor().d(23).getValue())).b()), (ib9) hVar.getAccessor().c(783), (rs6) hVar.getAccessor().d(138).getValue(), (v3f) hVar.getAccessor().c(33), (c2a) hVar.getAccessor().c(318), (xhh) hVar.getAccessor().d(23).getValue(), (wo6) hVar.getAccessor().d(54).getValue(), !mediaPickerScreen.x1(), hVar.getAccessor().d(782));
            case 7:
                zv8[] zv8VarArr8 = MediaPickerScreen.J;
                return mediaPickerScreen.s1().h ? y3f.MINIAPP_PICKER_GALLERY : y3f.AVATAR_PICKER_GALLERY;
            case 8:
                vv vvVar = mediaPickerScreen.f;
                zv8[] zv8VarArr9 = MediaPickerScreen.J;
                if (mediaPickerScreen.s1().h) {
                    zv8[] zv8VarArr10 = MediaPickerScreen.J;
                    zv8 zv8Var3 = zv8VarArr10[2];
                    if (((Long) vvVar.a(mediaPickerScreen)) != null) {
                        zv8 zv8Var4 = zv8VarArr10[2];
                        return new lmc(null, 0, rdg.WEBAPP_ID, (Long) vvVar.a(mediaPickerScreen), null, null, 115);
                    }
                }
                return lmc.h;
            case 9:
                hi7 hi7Var = (hi7) mediaPickerScreen.i.getAccessor().c(780);
                bh9 bh9Var = new bh9(21);
                hi7Var.getClass();
                return new gi7(bh9Var);
            case 10:
                return new jdf((rb8) mediaPickerScreen.i.getAccessor().c(782), new adf(mediaPickerScreen.s1().n, false, (lh7) mediaPickerScreen.s1().q.getValue()));
            case 11:
                r1a r1aVar = (r1a) mediaPickerScreen.i.getAccessor().c(787);
                return new q1a(mediaPickerScreen.s1(), (jdf) mediaPickerScreen.o.getValue(), (gi7) mediaPickerScreen.n.getValue(), r1aVar.a, r1aVar.b, r1aVar.c, r1aVar.d, r1aVar.e, r1aVar.f, r1aVar.g);
            default:
                zv8[] zv8VarArr11 = MediaPickerScreen.J;
                tp2 tp2Var2 = new tp2(mediaPickerScreen.getContext());
                tp2Var2.setId(R.id.media_picker_album_container_id);
                tp2Var2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                tp2Var2.setVisibility(8);
                return tp2Var2;
        }
    }
}
