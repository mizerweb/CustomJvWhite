package defpackage;

import android.net.Uri;
import java.util.List;
import java.util.WeakHashMap;
import one.me.android.root.RootController;
import one.me.chatscreen.mediabar.MediaBarWidget;
import one.me.chatscreen.mediabar.SelectedMediaBottomBarWidget;
import one.me.chatscreen.mediabar.permission.MediaBarPermissionWidget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.sdk.gallery.MediaGalleryWidget;
import one.me.sdk.gallery.permissions.PartialMediaAccessWidget;
import one.me.sdk.messagewrite.mention.SuggestionsWidget;
import ru.ok.tamtam.messages.scheduled.widget.ScheduledSendPickerBottomSheet;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class es9 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ MediaBarWidget g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ es9(lq4 lq4Var, MediaBarWidget mediaBarWidget, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = mediaBarWidget;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        MediaBarWidget mediaBarWidget = this.g;
        switch (i) {
            case 0:
                es9 es9Var = new es9(lq4Var, mediaBarWidget, 0);
                es9Var.f = obj;
                return es9Var;
            case 1:
                es9 es9Var2 = new es9(lq4Var, mediaBarWidget, 1);
                es9Var2.f = obj;
                return es9Var2;
            case 2:
                es9 es9Var3 = new es9(lq4Var, mediaBarWidget, 2);
                es9Var3.f = obj;
                return es9Var3;
            case 3:
                es9 es9Var4 = new es9(lq4Var, mediaBarWidget, 3);
                es9Var4.f = obj;
                return es9Var4;
            case 4:
                es9 es9Var5 = new es9(lq4Var, mediaBarWidget, 4);
                es9Var5.f = obj;
                return es9Var5;
            case 5:
                es9 es9Var6 = new es9(lq4Var, mediaBarWidget, 5);
                es9Var6.f = obj;
                return es9Var6;
            case 6:
                es9 es9Var7 = new es9(lq4Var, mediaBarWidget, 6);
                es9Var7.f = obj;
                return es9Var7;
            case 7:
                es9 es9Var8 = new es9(lq4Var, mediaBarWidget, 7);
                es9Var8.f = obj;
                return es9Var8;
            case 8:
                es9 es9Var9 = new es9(lq4Var, mediaBarWidget, 8);
                es9Var9.f = obj;
                return es9Var9;
            case 9:
                es9 es9Var10 = new es9(lq4Var, mediaBarWidget, 9);
                es9Var10.f = obj;
                return es9Var10;
            case 10:
                es9 es9Var11 = new es9(lq4Var, mediaBarWidget, 10);
                es9Var11.f = obj;
                return es9Var11;
            default:
                es9 es9Var12 = new es9(lq4Var, mediaBarWidget, 11);
                es9Var12.f = obj;
                return es9Var12;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((es9) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((es9) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 2:
                ((es9) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 3:
                ((es9) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 4:
                ((es9) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 5:
                ((es9) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 6:
                ((es9) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 7:
                ((es9) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 8:
                ((es9) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 9:
                ((es9) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 10:
                ((es9) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((es9) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        String string;
        gef gefVar;
        hve hveVarU1;
        SelectedMediaBottomBarWidget selectedMediaBottomBarWidget;
        tha thaVarQ1;
        tha thaVarQ2;
        int i = 2;
        int i2 = 8;
        int i3 = 1;
        switch (this.e) {
            case 0:
                Object obj2 = this.f;
                ch3.d0(obj);
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                if (zBooleanValue) {
                    MediaBarWidget mediaBarWidget = this.g;
                    zv8[] zv8VarArr = MediaBarWidget.u1;
                    if (rx8.C(mediaBarWidget.A1().a) == null) {
                        String str = this.g.a;
                        a4c a4cVar = gm0.f;
                        if (a4cVar != null) {
                            je9 je9Var = je9.d;
                            if (a4cVar.b(je9Var)) {
                                a4cVar.c(je9Var, str, "initSuggestionsDisplay(): show mentions suggestions", null);
                            }
                        }
                        MediaBarWidget mediaBarWidget2 = this.g;
                        hve childRouter = mediaBarWidget2.getChildRouter(mediaBarWidget2.z1());
                        childRouter.e = 1;
                        childRouter.S(false);
                        if (!childRouter.o()) {
                            childRouter.T(oc9.e(new SuggestionsWidget(this.g.c, false, 2, null), null, null));
                        }
                    }
                }
                MediaBarWidget mediaBarWidget3 = this.g;
                zv8[] zv8VarArr2 = MediaBarWidget.u1;
                mediaBarWidget3.z1().setVisibility(zBooleanValue ? 0 : 8);
                return sbi.a;
            case 1:
                Object obj3 = this.f;
                ch3.d0(obj);
                zka zkaVar = (zka) obj3;
                MediaBarWidget mediaBarWidget4 = this.g;
                zv8[] zv8VarArr3 = MediaBarWidget.u1;
                je9 je9Var2 = je9.d;
                String name = MediaBarWidget.class.getName();
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null && a4cVar2.b(je9Var2)) {
                    a4cVar2.c(je9Var2, name, "onToggleEmoji: " + zkaVar.a, null);
                }
                int iOrdinal = zkaVar.a.ordinal();
                if (iOrdinal == 0) {
                    SelectedMediaBottomBarWidget selectedMediaBottomBarWidget2 = mediaBarWidget4.s1;
                    if (selectedMediaBottomBarWidget2 != null) {
                        selectedMediaBottomBarWidget2.q1().setLeftIcon(R.drawable.icon_sticker);
                    }
                } else if (iOrdinal == 1) {
                    mediaBarWidget4.x1().k();
                    String str2 = mediaBarWidget4.a;
                    a4c a4cVar3 = gm0.f;
                    if (a4cVar3 != null && a4cVar3.b(je9Var2)) {
                        a4cVar3.c(je9Var2, str2, "onToggleEmoji(): popupLayoutChangeType=setFullScreen, scrollState=" + mediaBarWidget4.x1().getScrollState(), null);
                    }
                    SelectedMediaBottomBarWidget selectedMediaBottomBarWidget3 = mediaBarWidget4.s1;
                    if (selectedMediaBottomBarWidget3 != null) {
                        selectedMediaBottomBarWidget3.q1().setLeftIcon(R.drawable.icon_keyboard);
                    }
                } else if (iOrdinal == 2) {
                    SelectedMediaBottomBarWidget selectedMediaBottomBarWidget4 = ((MediaBarWidget) mediaBarWidget4.q1.b).s1;
                    if (selectedMediaBottomBarWidget4 != null) {
                        selectedMediaBottomBarWidget4.q1().h(true);
                    }
                    SelectedMediaBottomBarWidget selectedMediaBottomBarWidget5 = mediaBarWidget4.s1;
                    if (selectedMediaBottomBarWidget5 != null) {
                        selectedMediaBottomBarWidget5.q1().setLeftIcon(R.drawable.icon_sticker);
                    }
                }
                return sbi.a;
            case 2:
                MediaBarWidget mediaBarWidget5 = this.g;
                Object obj4 = this.f;
                ch3.d0(obj);
                edf edfVar = (edf) obj4;
                if (edfVar instanceof ddf) {
                    zv8[] zv8VarArr4 = MediaBarWidget.u1;
                    mediaBarWidget5.y1().setVisibility(8);
                } else if (edfVar instanceof bdf) {
                    int i4 = ((bdf) edfVar).a;
                    mediaBarWidget5.A = i4;
                    MediaBarWidget.r1(mediaBarWidget5);
                    mediaBarWidget5.B1().setDropdownRotationProgress(i4 / 512.0f);
                } else if (edfVar instanceof cdf) {
                    zv8[] zv8VarArr5 = MediaBarWidget.u1;
                    gi7 gi7Var = (gi7) mediaBarWidget5.K.getValue();
                    nh7 nh7Var = ((cdf) edfVar).a;
                    a8j.x(gi7Var.e, new uh7(nh7Var));
                    ch7 ch7VarC = nh7Var.a.c();
                    if (ch7VarC instanceof ah7) {
                        string = mediaBarWidget5.getContext().getString(((ah7) ch7VarC).a);
                    } else {
                        if (!(ch7VarC instanceof bh7)) {
                            ore.o();
                            return null;
                        }
                        string = ((bh7) ch7VarC).a;
                    }
                    mediaBarWidget5.B1().setTitle(string);
                }
                return sbi.a;
            case 3:
                MediaBarWidget mediaBarWidget6 = this.g;
                Object obj5 = this.f;
                ch3.d0(obj);
                f2e f2eVar = (f2e) obj5;
                if (f2eVar instanceof c2e) {
                    c2e c2eVar = (c2e) f2eVar;
                    hb9 hb9Var = c2eVar.a;
                    int i5 = c2eVar.b;
                    zv8[] zv8VarArr6 = MediaBarWidget.u1;
                    mediaBarWidget6.F1(hb9Var, i5, "SELECTED_MEDIA_ALBUM");
                } else if (f2eVar instanceof e2e) {
                    zv8[] zv8VarArr7 = MediaBarWidget.u1;
                    ((wsc) mediaBarWidget6.e.getValue()).p(new svj(mediaBarWidget6, 1));
                } else {
                    if (!(f2eVar instanceof d2e)) {
                        ore.o();
                        return null;
                    }
                    zv8[] zv8VarArr8 = MediaBarWidget.u1;
                    wsc wscVar = (wsc) mediaBarWidget6.e.getValue();
                    svj svjVar = new svj(mediaBarWidget6, 1);
                    wscVar.getClass();
                    wsc.q(wscVar, svjVar, wsc.i, 171, R.string.permissions_audio_for_video_request, 0, null, 48);
                }
                return sbi.a;
            case 4:
                Object obj6 = this.f;
                ch3.d0(obj);
                fi7 fi7Var = (fi7) obj6;
                if (!(fi7Var instanceof xh7)) {
                    if (fi7Var instanceof yh7) {
                        MediaBarWidget mediaBarWidget7 = this.g;
                        zv8[] zv8VarArr9 = MediaBarWidget.u1;
                        as9 as9VarC1 = mediaBarWidget7.C1();
                        List list = ((yh7) fi7Var).a;
                        mjg mjgVar = as9VarC1.w;
                        mjgVar.getClass();
                        mjgVar.j(null, list);
                    } else if (fi7Var instanceof ai7) {
                        MediaBarWidget mediaBarWidget8 = this.g;
                        ai7 ai7Var = (ai7) fi7Var;
                        hb9 hb9VarB = h1h.b(ai7Var.c);
                        int i6 = ai7Var.a;
                        String str3 = ai7Var.b;
                        zv8[] zv8VarArr10 = MediaBarWidget.u1;
                        mediaBarWidget8.F1(hb9VarB, i6, str3);
                    } else if (fi7Var instanceof ci7) {
                        MediaBarWidget mediaBarWidget9 = this.g;
                        zv8[] zv8VarArr11 = MediaBarWidget.u1;
                        ci7 ci7Var = (ci7) fi7Var;
                        mediaBarWidget9.v1().f(ci7Var.a, ci7Var.b);
                    } else if (fi7Var instanceof di7) {
                        MediaBarWidget mediaBarWidget10 = this.g;
                        mediaBarWidget10.y = ((di7) fi7Var).a;
                        MediaBarWidget.r1(mediaBarWidget10);
                    } else if (fi7Var instanceof bi7) {
                        MediaBarWidget.q1(this.g, ((bi7) fi7Var).a);
                    } else if (cqk.d(fi7Var, zh7.a)) {
                        String name2 = MediaBarWidget.class.getName();
                        a4c a4cVar4 = gm0.f;
                        if (a4cVar4 != null) {
                            je9 je9Var3 = je9.d;
                            if (a4cVar4.b(je9Var3)) {
                                a4cVar4.c(je9Var3, name2, "Text stories are not implemented yet", null);
                            }
                        }
                    } else if (!(fi7Var instanceof ei7)) {
                        ore.o();
                        return null;
                    }
                }
                return sbi.a;
            case 5:
                Object obj7 = this.f;
                ch3.d0(obj);
                g7a g7aVar = (g7a) obj7;
                if (cqk.d(g7aVar, e7a.a)) {
                    MediaBarWidget mediaBarWidget11 = this.g;
                    zv8[] zv8VarArr12 = MediaBarWidget.u1;
                    mediaBarWidget11.x1().j(true);
                    String str4 = this.g.a;
                    a4c a4cVar5 = gm0.f;
                    if (a4cVar5 != null) {
                        je9 je9Var4 = je9.d;
                        if (a4cVar5.b(je9Var4)) {
                            a4cVar5.c(je9Var4, str4, "processTypePickerEvents(): popupLayoutChangeType=hide, scrollState=" + this.g.x1().getScrollState(), null);
                        }
                    }
                    a8j.x(this.g.C1().v, mr9.a);
                } else {
                    if (!cqk.d(g7aVar, f7a.a)) {
                        ore.o();
                        return null;
                    }
                    MediaBarWidget mediaBarWidget12 = this.g;
                    zv8[] zv8VarArr13 = MediaBarWidget.u1;
                    as9 as9VarC2 = mediaBarWidget12.C1();
                    mjg mjgVar2 = as9VarC2.p;
                    int iOrdinal2 = ((s50) mjgVar2.getValue()).ordinal();
                    if (iOrdinal2 == 0) {
                        mjgVar2.j(null, s50.b);
                        ief iefVarD = as9VarC2.D();
                        int i7 = r50.$EnumSwitchMapping$0[1];
                        if (i7 == 1) {
                            gefVar = gef.c;
                        } else {
                            if (i7 != 2) {
                                ore.o();
                                return null;
                            }
                            gefVar = gef.b;
                        }
                        iefVarD.s(gefVar);
                    } else {
                        if (iOrdinal2 != 1) {
                            ore.o();
                            return null;
                        }
                        as9VarC2.r.c(xq9.a);
                    }
                }
                return sbi.a;
            case 6:
                Object obj8 = this.f;
                ch3.d0(obj);
                d7a d7aVar = (d7a) obj8;
                if (d7aVar == null) {
                    ore.o();
                    return null;
                }
                MediaBarWidget mediaBarWidget13 = this.g;
                zv8[] zv8VarArr14 = MediaBarWidget.u1;
                as9 as9VarC3 = mediaBarWidget13.C1();
                Uri uri = d7aVar.a;
                g4b g4bVar = d7aVar.b;
                zv8[] zv8VarArr15 = as9.I;
                a8j.x(as9VarC3.v, new nr9(uri, g4bVar));
                return sbi.a;
            case 7:
                Object obj9 = this.f;
                ch3.d0(obj);
                MediaBarWidget mediaBarWidget14 = this.g;
                zv8[] zv8VarArr16 = MediaBarWidget.u1;
                mediaBarWidget14.G1((s50) obj9);
                return sbi.a;
            case 8:
                MediaBarWidget mediaBarWidget15 = this.g;
                Object obj10 = this.f;
                ch3.d0(obj);
                int iOrdinal3 = ((lhd) obj10).ordinal();
                if (iOrdinal3 == 0) {
                    zp3 zp3VarO1 = MediaBarWidget.o1(mediaBarWidget15);
                    hve hveVar = zp3VarO1.a;
                    if (!cqk.d(zp3VarO1.b(), "media_gallery_widget")) {
                        hveVar.S(false);
                        lve lveVarE = oc9.e(new MediaGalleryWidget(mediaBarWidget15.c, null, 2, null), null, null);
                        lveVarE.e("media_gallery_widget");
                        hveVar.T(lveVarE);
                    }
                    mediaBarWidget15.B1().setVisibility(0);
                } else {
                    if (iOrdinal3 != 1) {
                        ore.o();
                        return null;
                    }
                    zp3 zp3VarO2 = MediaBarWidget.o1(mediaBarWidget15);
                    hve hveVar2 = zp3VarO2.a;
                    if (!cqk.d(zp3VarO2.b(), "permissions_widget")) {
                        hveVar2.S(false);
                        lve lveVarE2 = oc9.e(new MediaBarPermissionWidget(mediaBarWidget15.c.b()), null, null);
                        lveVarE2.e("permissions_widget");
                        hveVar2.T(lveVarE2);
                    }
                    mediaBarWidget15.B1().setVisibility(8);
                }
                return sbi.a;
            case 9:
                je9 je9Var5 = je9.d;
                Object obj11 = this.f;
                ch3.d0(obj);
                cr9 cr9Var = (cr9) obj11;
                if (cr9Var instanceof vq9) {
                    MediaBarWidget mediaBarWidget16 = this.g;
                    SelectedMediaBottomBarWidget selectedMediaBottomBarWidget6 = mediaBarWidget16.s1;
                    if (selectedMediaBottomBarWidget6 != null && (thaVarQ2 = selectedMediaBottomBarWidget6.q1()) != null) {
                        thaVarQ2.setText(((ib9) mediaBarWidget16.g.getValue()).a.i);
                    }
                    mediaBarWidget16.G1((s50) mediaBarWidget16.C1().p.getValue());
                    ecd ecdVarX1 = mediaBarWidget16.x1();
                    WeakHashMap weakHashMap = i7j.a;
                    if (!ecdVarX1.isLaidOut() || ecdVarX1.isLayoutRequested()) {
                        ecdVarX1.addOnLayoutChangeListener(new xc0(i2, mediaBarWidget16));
                    } else if (mediaBarWidget16.getView() == null) {
                        String str5 = mediaBarWidget16.a;
                        a4c a4cVar6 = gm0.f;
                        if (a4cVar6 != null && a4cVar6.b(je9Var5)) {
                            a4cVar6.c(je9Var5, str5, "showMediaGallery(): view is null", null);
                        }
                    } else if (mediaBarWidget16.C1().E()) {
                        mediaBarWidget16.x1().k();
                        String str6 = mediaBarWidget16.a;
                        a4c a4cVar7 = gm0.f;
                        if (a4cVar7 != null && a4cVar7.b(je9Var5)) {
                            a4cVar7.c(je9Var5, str6, "showMediaGallery(): popupLayoutChangeType=setFullScreen, scrollState=" + mediaBarWidget16.x1().getScrollState(), null);
                        }
                    } else {
                        ccd scrollState = mediaBarWidget16.x1().getScrollState();
                        scrollState.getClass();
                        boolean z = scrollState != ccd.a;
                        boolean z2 = !z;
                        String str7 = mediaBarWidget16.a;
                        a4c a4cVar8 = gm0.f;
                        if (a4cVar8 != null && a4cVar8.b(je9Var5)) {
                            a4cVar8.c(je9Var5, str7, "showMediaGallery(): setHalfScreen?=" + z2 + ", scrollState=" + mediaBarWidget16.x1().getScrollState(), null);
                        }
                        if (!z) {
                            mediaBarWidget16.q1.i();
                            mediaBarWidget16.x1().setHalfScreen(null);
                        }
                    }
                    tbb.g(mediaBarWidget16.f, y3f.CHAT_ATTACH_PICKER);
                } else if (cr9Var instanceof tq9) {
                    if (((tq9) cr9Var).a && (selectedMediaBottomBarWidget = this.g.s1) != null && (thaVarQ1 = selectedMediaBottomBarWidget.q1()) != null) {
                        thaVarQ1.setText(null);
                    }
                    MediaBarWidget mediaBarWidget17 = this.g;
                    zv8[] zv8VarArr17 = MediaBarWidget.u1;
                    mediaBarWidget17.x1().j(true);
                    String str8 = this.g.a;
                    a4c a4cVar9 = gm0.f;
                    if (a4cVar9 != null && a4cVar9.b(je9Var5)) {
                        a4cVar9.c(je9Var5, str8, "MediaBarEvent.Close: popupLayoutChangeType=hide, scrollState=" + this.g.x1().getScrollState(), null);
                    }
                } else if (cr9Var instanceof sq9) {
                    MediaBarWidget mediaBarWidget18 = this.g;
                    zv8[] zv8VarArr18 = MediaBarWidget.u1;
                    a8j.x(((gi7) mediaBarWidget18.K.getValue()).e, th7.a);
                } else if (cr9Var instanceof uq9) {
                    SelectedMediaBottomBarWidget selectedMediaBottomBarWidget7 = this.g.s1;
                    if (selectedMediaBottomBarWidget7 != null) {
                        selectedMediaBottomBarWidget7.q1().h(false);
                    }
                } else if (cr9Var instanceof wq9) {
                    MediaBarWidget mediaBarWidget19 = this.g;
                    zv8[] zv8VarArr19 = MediaBarWidget.u1;
                    zv8[] zv8VarArr20 = BottomSheetWidget.t;
                    jc4 jc4VarC = p.c(R.string.media_type_picker__close_dialog__title, null, null, 6);
                    int i8 = 56;
                    jc4VarC.a(new kc4(i3, new tnh(R.string.media_type_picker__close_dialog__accept), i3, i8));
                    jc4VarC.a(new kc4(i, new tnh(R.string.media_type_picker__close_dialog__cancel), i, i8));
                    ConfirmationBottomSheet confirmationBottomSheetF = jc4VarC.f(mediaBarWidget19);
                    confirmationBottomSheetF.setTargetController(mediaBarWidget19);
                    br4 parentController = mediaBarWidget19;
                    while (parentController.getParentController() != null) {
                        parentController = parentController.getParentController();
                    }
                    RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
                    hveVarU1 = rootController != null ? rootController.u1() : null;
                    if (hveVarU1 != null) {
                        lve lveVar = new lve(confirmationBottomSheetF, null, null, null, false, -1);
                        p.k(false, lveVar, true, "BottomSheetWidget");
                        hveVarU1.I(lveVar);
                    }
                } else if (cr9Var instanceof yq9) {
                    MediaBarWidget mediaBarWidget20 = this.g;
                    yq9 yq9Var = (yq9) cr9Var;
                    hb9 hb9VarB2 = h1h.b(yq9Var.a.a);
                    int i9 = yq9Var.b;
                    zv8[] zv8VarArr21 = MediaBarWidget.u1;
                    mediaBarWidget20.F1(hb9VarB2, i9, "SELECTED_MEDIA_ALBUM");
                } else if (cr9Var instanceof zq9) {
                    MediaBarWidget.p1(this.g, R.drawable.ic_snack_media_24, R.string.media_type_picker__snack_media);
                } else if (cr9Var instanceof xq9) {
                    MediaBarWidget.p1(this.g, R.drawable.ic_snack_file_24, R.string.media_type_picker__snack_file);
                } else if (cr9Var instanceof ar9) {
                    MediaBarWidget.q1(this.g, ((ar9) cr9Var).a);
                } else {
                    if (!(cr9Var instanceof br9)) {
                        ore.o();
                        return null;
                    }
                    zv8[] zv8VarArr22 = BottomSheetWidget.t;
                    br9 br9Var = (br9) cr9Var;
                    ScheduledSendPickerBottomSheet scheduledSendPickerBottomSheet = new ScheduledSendPickerBottomSheet(this.g.c.b(), br9Var.a, br9Var.b, null, 8, null);
                    br4 parentController2 = this.g;
                    scheduledSendPickerBottomSheet.setTargetController(parentController2);
                    while (parentController2.getParentController() != null) {
                        parentController2 = parentController2.getParentController();
                    }
                    RootController rootController2 = parentController2 instanceof RootController ? (RootController) parentController2 : null;
                    hveVarU1 = rootController2 != null ? rootController2.u1() : null;
                    if (hveVarU1 != null) {
                        lve lveVar2 = new lve(scheduledSendPickerBottomSheet, null, null, null, false, -1);
                        p.k(false, lveVar2, true, "BottomSheetWidget");
                        hveVarU1.I(lveVar2);
                    }
                }
                return sbi.a;
            case 10:
                Object obj12 = this.f;
                ch3.d0(obj);
                boolean zBooleanValue2 = ((Boolean) obj12).booleanValue();
                MediaBarWidget mediaBarWidget21 = this.g;
                ((tp2) mediaBarWidget21.F.m(mediaBarWidget21, MediaBarWidget.u1[13])).setVisibility(zBooleanValue2 ? 8 : 0);
                return sbi.a;
            default:
                Object obj13 = this.f;
                ch3.d0(obj);
                boolean zBooleanValue3 = ((Boolean) obj13).booleanValue();
                MediaBarWidget mediaBarWidget22 = this.g;
                j8e j8eVar = mediaBarWidget22.t;
                if (zBooleanValue3) {
                    zp3 zp3Var = (zp3) j8eVar.m(mediaBarWidget22, MediaBarWidget.u1[10]);
                    hve hveVar3 = zp3Var.a;
                    if (!cqk.d(zp3Var.b(), "partial_media_access_widget")) {
                        hveVar3.S(false);
                        lve lveVarE3 = oc9.e(new PartialMediaAccessWidget(mediaBarWidget22.c.b()), null, null);
                        lveVarE3.e("partial_media_access_widget");
                        hveVar3.T(lveVarE3);
                    }
                } else {
                    ((zp3) j8eVar.m(mediaBarWidget22, MediaBarWidget.u1[10])).a();
                }
                MediaBarWidget.r1(mediaBarWidget22);
                return sbi.a;
        }
    }
}
