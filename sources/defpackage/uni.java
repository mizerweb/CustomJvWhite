package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import one.me.android.root.RootController;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.stories.viewer.viewer.StoriesViewerScreen;
import one.me.stories.viewer.viewer.UserStoriesScreen;
import one.me.stories.viewer.viewer.widgets.bottominfo.BottomStoryInfoWidget;
import one.me.stories.viewer.viewer.widgets.publish.StoryPublishProgressWidget;
import one.me.stories.viewer.viewer.widgets.writebar.StoriesWriteBarWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class uni extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ UserStoriesScreen g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uni(lq4 lq4Var, UserStoriesScreen userStoriesScreen, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = userStoriesScreen;
    }

    private final Object l(Object obj) {
        g8c g8cVar;
        Long lValueOf;
        long j;
        je9 je9Var = je9.f;
        sbi sbiVar = sbi.a;
        je9 je9Var2 = je9.d;
        Object obj2 = this.f;
        ch3.d0(obj);
        oqi oqiVar = (oqi) obj2;
        int i = 1;
        if (cqk.d(oqiVar, kqi.a)) {
            UserStoriesScreen userStoriesScreen = this.g;
            zv8[] zv8VarArr = UserStoriesScreen.x1;
            jvg jvgVarC1 = userStoriesScreen.C1();
            if (((Boolean) jvgVarC1.v.a.getValue()).booleanValue()) {
                List list = (List) jvgVarC1.w.a.getValue();
                long jLongValue = ((Number) jvgVarC1.i.getValue()).longValue();
                int iD = jvg.D(jLongValue, list);
                if (iD < 0) {
                    String str = jvgVarC1.t;
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null && a4cVar.b(je9Var2)) {
                        a4cVar.c(je9Var2, str, zo5.j(jLongValue, "goToNextUserRequested not found user = "), null);
                    }
                    a8j.x(jvgVarC1.x, rt3.b);
                } else {
                    int i2 = iD + 1;
                    if (i2 > xw3.O0(list)) {
                        a8j.x(jvgVarC1.x, rt3.b);
                    } else {
                        mjg mjgVar = jvgVarC1.k;
                        Integer numValueOf = Integer.valueOf(i2);
                        mjgVar.getClass();
                        mjgVar.j(null, numValueOf);
                    }
                }
            } else {
                a8j.x(jvgVarC1.x, rt3.b);
            }
            this.g.I1().D();
            return sbiVar;
        }
        if (oqiVar instanceof upi) {
            UserStoriesScreen userStoriesScreen2 = this.g;
            zv8[] zv8VarArr2 = UserStoriesScreen.x1;
            jvg jvgVarC2 = userStoriesScreen2.C1();
            long j2 = ((upi) oqiVar).a;
            List list2 = (List) jvgVarC2.w.a.getValue();
            int iD2 = jvg.D(j2, list2);
            if (iD2 < 0) {
                String str2 = jvgVarC2.t;
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null && a4cVar2.b(je9Var2)) {
                    a4cVar2.c(je9Var2, str2, nbh.s(j2, "hideOwnerAndAdvance: owner ", " not found in items"), null);
                }
                a8j.x(jvgVarC2.x, rt3.b);
            } else {
                Iterator it = yhf.l0(new sw(1, list2), iD2 + 1).iterator();
                do {
                    if (!it.hasNext()) {
                        lValueOf = null;
                        break;
                    }
                    j = ((pkc) it.next()).a;
                    lValueOf = Long.valueOf(j);
                } while (j == ((s7f) jvgVarC2.d).t());
                if (lValueOf != null) {
                    mjg mjgVar2 = jvgVarC2.i;
                    mjgVar2.getClass();
                    mjgVar2.j(null, lValueOf);
                } else {
                    a8j.x(jvgVarC2.x, rt3.b);
                }
            }
            this.g.I1().D();
            return sbiVar;
        }
        if (cqk.d(oqiVar, lqi.a)) {
            UserStoriesScreen userStoriesScreen3 = this.g;
            zv8[] zv8VarArr3 = UserStoriesScreen.x1;
            jvg jvgVarC3 = userStoriesScreen3.C1();
            if (((Boolean) jvgVarC3.v.a.getValue()).booleanValue()) {
                long jLongValue2 = ((Number) jvgVarC3.i.getValue()).longValue();
                int iD3 = jvg.D(jLongValue2, (List) jvgVarC3.w.a.getValue());
                if (iD3 < 0) {
                    String str3 = jvgVarC3.t;
                    a4c a4cVar3 = gm0.f;
                    if (a4cVar3 != null && a4cVar3.b(je9Var2)) {
                        a4cVar3.c(je9Var2, str3, zo5.j(jLongValue2, "goToPrevUserRequested not found user = "), null);
                    }
                } else {
                    int i3 = iD3 - 1;
                    if (i3 < 0) {
                        a8j.x(jvgVarC3.y, nug.a);
                    } else {
                        mjg mjgVar3 = jvgVarC3.k;
                        Integer numValueOf2 = Integer.valueOf(i3);
                        mjgVar3.getClass();
                        mjgVar3.j(null, numValueOf2);
                    }
                }
            } else {
                a8j.x(jvgVarC3.x, rt3.b);
            }
            this.g.I1().D();
            return sbiVar;
        }
        if (cqk.d(oqiVar, ppi.a)) {
            g8c g8cVar2 = this.g.q1;
            if (g8cVar2 != null) {
                g8cVar2.a();
            }
            UserStoriesScreen userStoriesScreen4 = this.g;
            userStoriesScreen4.q1 = null;
            userStoriesScreen4.C1().C();
            return sbiVar;
        }
        if (cqk.d(oqiVar, zpi.a)) {
            ((e3j) this.g.r.getValue()).pause();
            return sbiVar;
        }
        if (cqk.d(oqiVar, cqi.a)) {
            ((e3j) this.g.r.getValue()).play();
            return sbiVar;
        }
        if (oqiVar instanceof bqi) {
            e3j e3jVar = (e3j) this.g.r.getValue();
            e3jVar.pause();
            bqi bqiVar = (bqi) oqiVar;
            e3jVar.seekTo(bqiVar.a + 30);
            if (bqiVar.b) {
                e3jVar.play();
                return sbiVar;
            }
        } else if (oqiVar instanceof dqi) {
            UserStoriesScreen userStoriesScreen5 = this.g;
            dqi dqiVar = (dqi) oqiVar;
            ny8 ny8Var = userStoriesScreen5.r;
            rui ruiVar = userStoriesScreen5.Z;
            if (ruiVar != null) {
                e3j e3jVar2 = (e3j) ny8Var.getValue();
                e3jVar2.clear();
                e3jVar2.q0(userStoriesScreen5.q);
                userStoriesScreen5.J1(ruiVar, dqiVar.b);
                ((e3j) ny8Var.getValue()).seekTo(dqiVar.a + 30);
                return sbiVar;
            }
        } else {
            if (oqiVar instanceof aqi) {
                UserStoriesScreen userStoriesScreen6 = this.g;
                zv8[] zv8VarArr4 = UserStoriesScreen.x1;
                userStoriesScreen6.E1().k(((aqi) oqiVar).a, true);
                return sbiVar;
            }
            if (cqk.d(oqiVar, spi.a)) {
                UserStoriesScreen userStoriesScreen7 = this.g;
                zv8[] zv8VarArr5 = UserStoriesScreen.x1;
                if (userStoriesScreen7.getView() != null) {
                    g8c g8cVar3 = userStoriesScreen7.q1;
                    if (g8cVar3 != null) {
                        g8cVar3.a();
                    }
                    h8c h8cVar = new h8c(userStoriesScreen7);
                    h8cVar.n(np4.q(userStoriesScreen7.getContext(), R.string.oneme_stories_deleting_in_progress));
                    h8cVar.c(userStoriesScreen7.N1());
                    userStoriesScreen7.q1 = h8cVar.p();
                    return sbiVar;
                }
            } else {
                int i4 = 0;
                if (cqk.d(oqiVar, rpi.a)) {
                    UserStoriesScreen userStoriesScreen8 = this.g;
                    zv8[] zv8VarArr6 = UserStoriesScreen.x1;
                    userStoriesScreen8.H1().O(5);
                    UserStoriesScreen userStoriesScreen9 = this.g;
                    userStoriesScreen9.M1(new xni(0, userStoriesScreen9));
                    return sbiVar;
                }
                if (oqiVar instanceof nqi) {
                    UserStoriesScreen userStoriesScreen10 = this.g;
                    zv8[] zv8VarArr7 = UserStoriesScreen.x1;
                    if (userStoriesScreen10.getView() != null) {
                        g8c g8cVar4 = userStoriesScreen10.q1;
                        if (g8cVar4 != null) {
                            g8cVar4.a();
                        }
                        h8c h8cVar2 = new h8c(userStoriesScreen10);
                        h8cVar2.n(np4.q(userStoriesScreen10.getContext(), R.string.saving_video_to_gallery));
                        h8cVar2.h(new w8c(R.drawable.icon_video_download_fill));
                        h8cVar2.c(userStoriesScreen10.N1());
                        userStoriesScreen10.q1 = h8cVar2.p();
                        return sbiVar;
                    }
                } else {
                    if (oqiVar instanceof mqi) {
                        UserStoriesScreen userStoriesScreen11 = this.g;
                        boolean z = ((mqi) oqiVar).a;
                        zv8[] zv8VarArr8 = UserStoriesScreen.x1;
                        userStoriesScreen11.M1(new oni(z, userStoriesScreen11, 0));
                        return sbiVar;
                    }
                    if (cqk.d(oqiVar, vpi.a)) {
                        UserStoriesScreen userStoriesScreen12 = this.g;
                        zv8[] zv8VarArr9 = UserStoriesScreen.x1;
                        if (userStoriesScreen12.getView() != null) {
                            g8c g8cVar5 = userStoriesScreen12.q1;
                            if (g8cVar5 != null) {
                                g8cVar5.a();
                            }
                            h8c h8cVar3 = new h8c(userStoriesScreen12);
                            h8cVar3.n(np4.q(userStoriesScreen12.getContext(), R.string.common_error));
                            h8cVar3.c(userStoriesScreen12.N1());
                            userStoriesScreen12.q1 = h8cVar3.p();
                            return sbiVar;
                        }
                    } else if (oqiVar instanceof jqi) {
                        UserStoriesScreen userStoriesScreen13 = this.g;
                        List list3 = ((jqi) oqiVar).a;
                        View view = userStoriesScreen13.r1;
                        if (view == null) {
                            String str4 = userStoriesScreen13.a;
                            a4c a4cVar4 = gm0.f;
                            if (a4cVar4 != null && a4cVar4.b(je9Var)) {
                                a4cVar4.c(je9Var, str4, "showContextMenu: no anchor view, skip menu", null);
                                return sbiVar;
                            }
                        } else if (userStoriesScreen13.getView() != null) {
                            qp4 qp4VarBuild = opl.b(userStoriesScreen13, 1).l(list3).f(view).b().c().build();
                            qp4VarBuild.u(userStoriesScreen13);
                            userStoriesScreen13.s1 = qp4VarBuild;
                            return sbiVar;
                        }
                    } else if (oqiVar instanceof ypi) {
                        rbb rbbVar = ((ypi) oqiVar).a;
                        if (rbbVar instanceof i65) {
                            uug.b.e((i65) rbbVar);
                            return sbiVar;
                        }
                        String str5 = this.g.a;
                        a4c a4cVar5 = gm0.f;
                        if (a4cVar5 != null && a4cVar5.b(je9Var)) {
                            a4cVar5.c(je9Var, str5, "handleLinkResult: unsupported navigation event " + rbbVar, null);
                            return sbiVar;
                        }
                    } else {
                        if (oqiVar instanceof xpi) {
                            uug.b.d(((xpi) oqiVar).a);
                            return sbiVar;
                        }
                        if (oqiVar instanceof wpi) {
                            UserStoriesScreen userStoriesScreen14 = this.g;
                            String str6 = ((wpi) oqiVar).a;
                            zv8[] zv8VarArr10 = UserStoriesScreen.x1;
                            sb8.P(new occ(0, userStoriesScreen14, UserStoriesScreen.class, "showNoBrowserSnackbar", "showNoBrowserSnackbar()V", 0, 13), userStoriesScreen14.getContext(), str6);
                            return sbiVar;
                        }
                        if (oqiVar instanceof gqi) {
                            UserStoriesScreen userStoriesScreen15 = this.g;
                            String str7 = ((gqi) oqiVar).a;
                            zv8[] zv8VarArr11 = UserStoriesScreen.x1;
                            ((xu1) userStoriesScreen15.n.getValue()).k(str7, true, false, false, new nz7(userStoriesScreen15, str7));
                            return sbiVar;
                        }
                        if (oqiVar instanceof hqi) {
                            UserStoriesScreen userStoriesScreen16 = this.g;
                            zv8[] zv8VarArr12 = UserStoriesScreen.x1;
                            userStoriesScreen16.M1(new pni(i4, (hqi) oqiVar));
                            return sbiVar;
                        }
                        if (cqk.d(oqiVar, eqi.a)) {
                            UserStoriesScreen userStoriesScreen17 = this.g;
                            zv8[] zv8VarArr13 = UserStoriesScreen.x1;
                            View view2 = userStoriesScreen17.getView();
                            if (view2 != null) {
                                Context context = view2.getContext();
                                g5d g5dVar = (g5d) ((gjf) userStoriesScreen17.m.getValue());
                                String str8 = String.format(context.getString(R.string.tt_sms_invite_text), Arrays.copyOf(new Object[]{g5dVar.b()}, 1));
                                it3.a(view2.getContext(), str8.toString());
                                String str9 = sj8.a;
                                sj8.j(view2.getContext(), str8, null);
                                return sbiVar;
                            }
                        } else {
                            if (oqiVar instanceof tpi) {
                                o65.c(uug.b.b(), ":external_callback", n1g.i(new ylc("params", ((tpi) oqiVar).a)), null, 4);
                                return sbiVar;
                            }
                            if (oqiVar instanceof iqi) {
                                UserStoriesScreen userStoriesScreen18 = this.g;
                                iqi iqiVar = (iqi) oqiVar;
                                zv8[] zv8VarArr14 = UserStoriesScreen.x1;
                                View view3 = userStoriesScreen18.getView();
                                if (view3 != null) {
                                    userStoriesScreen18.H1().K(5);
                                    if (iqiVar.a) {
                                        p0m.a(view3, mt7.REJECT);
                                    }
                                    zv8[] zv8VarArr15 = BottomSheetWidget.t;
                                    jc4 jc4VarA = mol.a(iqiVar.b, n1g.i(new ylc("link_warning", Boolean.TRUE)), null, 4);
                                    jc4VarA.g(iqiVar.c);
                                    jc4VarA.j(pq3.j.e(view3.getContext()).j().b.getName());
                                    Iterator it2 = iqiVar.d.iterator();
                                    while (it2.hasNext()) {
                                        jc4VarA.a((kc4) it2.next());
                                    }
                                    ConfirmationBottomSheet confirmationBottomSheetF = jc4VarA.f(userStoriesScreen18);
                                    confirmationBottomSheetF.setTargetController(userStoriesScreen18);
                                    br4 parentController = userStoriesScreen18;
                                    while (parentController.getParentController() != null) {
                                        parentController = parentController.getParentController();
                                    }
                                    RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
                                    hve hveVarU1 = rootController != null ? rootController.u1() : null;
                                    if (hveVarU1 != null) {
                                        lve lveVar = new lve(confirmationBottomSheetF, null, null, null, false, -1);
                                        p.k(false, lveVar, true, "BottomSheetWidget");
                                        hveVarU1.I(lveVar);
                                    }
                                    userStoriesScreen18.H1().o.a(2, iqiVar.a ? 2 : 1, 0);
                                    return sbiVar;
                                }
                            } else if (oqiVar instanceof qpi) {
                                UserStoriesScreen userStoriesScreen19 = this.g;
                                String str10 = ((qpi) oqiVar).a;
                                zv8[] zv8VarArr16 = UserStoriesScreen.x1;
                                it3.a(userStoriesScreen19.getContext(), str10);
                                if (it3.b() && userStoriesScreen19.getView() != null) {
                                    g8c g8cVar6 = userStoriesScreen19.q1;
                                    if (g8cVar6 != null) {
                                        g8cVar6.a();
                                    }
                                    h8c h8cVar4 = new h8c(userStoriesScreen19);
                                    h8cVar4.m(new tnh(R.string.link_copied));
                                    h8cVar4.h(new w8c(R.drawable.icon_copy_fill));
                                    h8cVar4.c(userStoriesScreen19.N1());
                                    userStoriesScreen19.q1 = h8cVar4.p();
                                    return sbiVar;
                                }
                            } else {
                                if (!(oqiVar instanceof fqi)) {
                                    if (!cqk.d(oqiVar, opi.a)) {
                                        ore.o();
                                        return null;
                                    }
                                    UserStoriesScreen userStoriesScreen20 = this.g;
                                    zv8[] zv8VarArr17 = UserStoriesScreen.x1;
                                    a8j.x(userStoriesScreen20.I1().o, lvg.a);
                                    return sbiVar;
                                }
                                UserStoriesScreen userStoriesScreen21 = this.g;
                                fqi fqiVar = (fqi) oqiVar;
                                zv8[] zv8VarArr18 = UserStoriesScreen.x1;
                                Widget targetWidget = userStoriesScreen21.getTargetWidget();
                                StoriesViewerScreen storiesViewerScreen = targetWidget instanceof StoriesViewerScreen ? (StoriesViewerScreen) targetWidget : null;
                                if (storiesViewerScreen != null && (g8cVar = storiesViewerScreen.p) != null) {
                                    g8cVar.a();
                                }
                                Widget targetWidget2 = userStoriesScreen21.getTargetWidget();
                                StoriesViewerScreen storiesViewerScreen2 = targetWidget2 instanceof StoriesViewerScreen ? (StoriesViewerScreen) targetWidget2 : null;
                                if (storiesViewerScreen2 != null) {
                                    storiesViewerScreen2.p = j0m.d(userStoriesScreen21, fqiVar.a, userStoriesScreen21.N1(), new pni(i, fqiVar));
                                }
                            }
                        }
                    }
                }
            }
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        UserStoriesScreen userStoriesScreen = this.g;
        switch (i) {
            case 0:
                uni uniVar = new uni(lq4Var, userStoriesScreen, 0);
                uniVar.f = obj;
                return uniVar;
            case 1:
                uni uniVar2 = new uni(lq4Var, userStoriesScreen, 1);
                uniVar2.f = obj;
                return uniVar2;
            case 2:
                uni uniVar3 = new uni(lq4Var, userStoriesScreen, 2);
                uniVar3.f = obj;
                return uniVar3;
            case 3:
                uni uniVar4 = new uni(lq4Var, userStoriesScreen, 3);
                uniVar4.f = obj;
                return uniVar4;
            case 4:
                uni uniVar5 = new uni(lq4Var, userStoriesScreen, 4);
                uniVar5.f = obj;
                return uniVar5;
            case 5:
                uni uniVar6 = new uni(lq4Var, userStoriesScreen, 5);
                uniVar6.f = obj;
                return uniVar6;
            case 6:
                uni uniVar7 = new uni(lq4Var, userStoriesScreen, 6);
                uniVar7.f = obj;
                return uniVar7;
            case 7:
                uni uniVar8 = new uni(lq4Var, userStoriesScreen, 7);
                uniVar8.f = obj;
                return uniVar8;
            case 8:
                uni uniVar9 = new uni(lq4Var, userStoriesScreen, 8);
                uniVar9.f = obj;
                return uniVar9;
            case 9:
                uni uniVar10 = new uni(lq4Var, userStoriesScreen, 9);
                uniVar10.f = obj;
                return uniVar10;
            case 10:
                uni uniVar11 = new uni(lq4Var, userStoriesScreen, 10);
                uniVar11.f = obj;
                return uniVar11;
            case 11:
                uni uniVar12 = new uni(lq4Var, userStoriesScreen, 11);
                uniVar12.f = obj;
                return uniVar12;
            case 12:
                uni uniVar13 = new uni(lq4Var, userStoriesScreen, 12);
                uniVar13.f = obj;
                return uniVar13;
            case 13:
                uni uniVar14 = new uni(lq4Var, userStoriesScreen, 13);
                uniVar14.f = obj;
                return uniVar14;
            case 14:
                uni uniVar15 = new uni(lq4Var, userStoriesScreen, 14);
                uniVar15.f = obj;
                return uniVar15;
            case 15:
                uni uniVar16 = new uni(lq4Var, userStoriesScreen, 15);
                uniVar16.f = obj;
                return uniVar16;
            case 16:
                uni uniVar17 = new uni(lq4Var, userStoriesScreen, 16);
                uniVar17.f = obj;
                return uniVar17;
            default:
                uni uniVar18 = new uni(lq4Var, userStoriesScreen, 17);
                uniVar18.f = obj;
                return uniVar18;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) throws IllegalAccessException, InvocationTargetException {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((uni) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((uni) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 2:
                ((uni) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 3:
                ((uni) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 4:
                ((uni) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 5:
                ((uni) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 6:
                ((uni) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 7:
                ((uni) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 8:
                ((uni) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 9:
                ((uni) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 10:
                ((uni) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 11:
                ((uni) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 12:
                ((uni) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 13:
                ((uni) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 14:
                ((uni) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 15:
                ((uni) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 16:
                ((uni) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((uni) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) throws IllegalAccessException, InvocationTargetException {
        acc accVar;
        List list;
        u84 u84Var;
        int i = 9;
        int i2 = 3;
        boolean z = false;
        lq4 lq4Var = null;
        switch (this.e) {
            case 0:
                UserStoriesScreen userStoriesScreen = this.g;
                Object obj2 = this.f;
                ch3.d0(obj);
                int iOrdinal = ((kug) obj2).ordinal();
                if (iOrdinal == 0) {
                    zv8[] zv8VarArr = UserStoriesScreen.x1;
                    userStoriesScreen.z1().setVisibility(0);
                    tp2 tp2VarZ1 = userStoriesScreen.z1();
                    WeakHashMap weakHashMap = i7j.a;
                    swj.a(tp2VarZ1, null);
                    y6j.l(userStoriesScreen.z1(), null);
                    tp2 tp2VarZ2 = userStoriesScreen.z1();
                    tp2VarZ2.setPaddingRelative(tp2VarZ2.getPaddingStart(), tp2VarZ2.getPaddingTop(), tp2VarZ2.getPaddingEnd(), 0);
                    zp3 zp3VarO1 = UserStoriesScreen.o1(userStoriesScreen);
                    hve hveVar = zp3VarO1.a;
                    if (!cqk.d(zp3VarO1.b(), "viewer.input")) {
                        hveVar.S(false);
                        lve lveVarE = oc9.e(new StoriesWriteBarWidget(userStoriesScreen.c), null, null);
                        lveVarE.e("viewer.input");
                        hveVar.T(lveVarE);
                    }
                } else if (iOrdinal == 1) {
                    zv8[] zv8VarArr2 = UserStoriesScreen.x1;
                    userStoriesScreen.z1().setVisibility(0);
                    tp2 tp2VarZ3 = userStoriesScreen.z1();
                    tp2VarZ3.setPaddingRelative(tp2VarZ3.getPaddingStart(), tp2VarZ3.getPaddingTop(), tp2VarZ3.getPaddingEnd(), 0);
                    lvb.G(userStoriesScreen.z1());
                    zp3 zp3VarO2 = UserStoriesScreen.o1(userStoriesScreen);
                    hve hveVar2 = zp3VarO2.a;
                    if (!cqk.d(zp3VarO2.b(), "viewer.views")) {
                        hveVar2.S(false);
                        lve lveVarE2 = oc9.e(new BottomStoryInfoWidget(userStoriesScreen.c), null, null);
                        lveVarE2.e("viewer.views");
                        hveVar2.T(lveVarE2);
                    }
                } else if (iOrdinal == 2) {
                    zv8[] zv8VarArr3 = UserStoriesScreen.x1;
                    userStoriesScreen.z1().setVisibility(0);
                    tp2 tp2VarZ4 = userStoriesScreen.z1();
                    tp2VarZ4.setPaddingRelative(tp2VarZ4.getPaddingStart(), tp2VarZ4.getPaddingTop(), tp2VarZ4.getPaddingEnd(), 0);
                    lvb.G(userStoriesScreen.z1());
                    zp3 zp3VarO3 = UserStoriesScreen.o1(userStoriesScreen);
                    hve hveVar3 = zp3VarO3.a;
                    if (!cqk.d(zp3VarO3.b(), "viewer.publish")) {
                        hveVar3.S(false);
                        lve lveVarE3 = oc9.e(new StoryPublishProgressWidget(userStoriesScreen.c, userStoriesScreen.B1().d), null, null);
                        lveVarE3.e("viewer.publish");
                        hveVar3.T(lveVarE3);
                    }
                } else {
                    if (iOrdinal != 3) {
                        ore.o();
                        return null;
                    }
                    UserStoriesScreen.o1(userStoriesScreen).c();
                    userStoriesScreen.z1().setVisibility(8);
                }
                return sbi.a;
            case 1:
                Object obj3 = this.f;
                ch3.d0(obj);
                lp5 lp5Var = this.g.o1;
                if (lp5Var != null) {
                    lp5Var.g = null;
                    lp5Var.invalidate();
                }
                return sbi.a;
            case 2:
                Object obj4 = this.f;
                ch3.d0(obj);
                int iIntValue = ((Number) obj4).intValue();
                UserStoriesScreen userStoriesScreen2 = this.g;
                ((gtg) userStoriesScreen2.G.m(userStoriesScreen2, UserStoriesScreen.x1[11])).setup(iIntValue);
                return sbi.a;
            case 3:
                Object obj5 = this.f;
                ch3.d0(obj);
                long j = ((zi8) obj5).a;
                UserStoriesScreen userStoriesScreen3 = this.g;
                gtg gtgVar = (gtg) userStoriesScreen3.G.m(userStoriesScreen3, UserStoriesScreen.x1[11]);
                int i3 = (int) (j >> 32);
                float fIntBitsToFloat = Float.intBitsToFloat((int) j);
                if (gtgVar.b != i3 || fIntBitsToFloat != gtgVar.c) {
                    gtgVar.b = oc9.v(i3, 0, gtgVar.a);
                    gtgVar.c = oc9.u(fIntBitsToFloat, 0.0f, 1.0f);
                    gtgVar.invalidate();
                }
                return sbi.a;
            case 4:
                Object obj6 = this.f;
                ch3.d0(obj);
                ptg ptgVar = (ptg) obj6;
                UserStoriesScreen userStoriesScreen4 = this.g;
                zv8[] zv8VarArr4 = UserStoriesScreen.x1;
                rcc rccVar = (rcc) userStoriesScreen4.C.m(userStoriesScreen4, UserStoriesScreen.x1[9]);
                CharSequence charSequenceB = ptgVar.a.b(rccVar.getContext());
                if (charSequenceB == null) {
                    charSequenceB = "";
                }
                rccVar.setTitle(charSequenceB);
                rccVar.s(ptgVar.b, false);
                String str = ptgVar.c;
                tj0 tj0Var = ptgVar.d;
                rccVar.setAvatar(new fcc(str, tj0Var.b, tj0Var.a, null, 0, 56));
                if (ptgVar.e) {
                    v1h v1hVar = ptgVar.f;
                    int iZ = oc9.Z(R.attr.icon_primary_inverse_static, userStoriesScreen4.A1());
                    if (v1hVar != null) {
                        int i4 = v1hVar.a;
                        int i5 = v1h.c(i4, 1) ? R.drawable.icon_megaphone : R.drawable.icon_users;
                        Drawable drawable = userStoriesScreen4.getContext().getDrawable(i5);
                        qe7.K(iZ, drawable);
                        jcc jccVar = new jcc(i5, drawable, null, v1h.c(i4, 1) ? "M17.104 2.87c0.667-0.334 1.449-0.548 2.26-0.17 0.822 0.383 1.149 1.13 1.304 1.859 0.145 0.68 0.189 1.58 0.239 2.615l0.004 0.085C20.963 8.318 21 9.383 21 10.249s-0.038 1.931-0.089 2.99l-0.004 0.085c-0.05 1.035-0.094 1.934-0.239 2.615-0.155 0.73-0.482 1.476-1.304 1.859-0.811 0.378-1.593 0.164-2.26-0.17-0.628-0.313-1.365-0.838-2.22-1.447l-0.066-0.048a44 44 0 0 1-1.634-1.218c-0.521 0.027-1.062 0.05-1.598 0.065l0.005 0.031c0.164 1.217 0.332 2.586 0.45 3.577 0.135 1.131-0.283 2.585-1.643 3.156a3 3 0 0 1-0.426 0.148c-0.17 0.046-0.34 0.074-0.499 0.092-1.416 0.16-2.495-0.828-2.939-1.881-0.41-0.977-0.97-2.4-1.308-3.663a142 142 0 0 0-0.546-1.963c-0.515-0.244-1.01-0.656-1.4-1.066-0.43-0.456-0.857-1.044-1.052-1.632C2.003 11.099 2 10.753 2 10.25s0.003-0.849 0.228-1.529c0.195-0.587 0.621-1.176 1.053-1.632s0.995-0.914 1.572-1.14c0.676-0.267 1.237-0.298 1.998-0.34l0.078-0.003A63 63 0 0 1 10.25 5.5c0.942 0 1.97 0.036 2.931 0.085q0.267-0.208 0.509-0.393c0.342-0.26 0.727-0.541 1.127-0.827l0.067-0.048c0.854-0.609 1.592-1.134 2.22-1.448m0.893 1.789c-0.47 0.234-1.078 0.664-2.019 1.335a43 43 0 0 0-1.5 1.115v6.28l0.425 0.326a46 46 0 0 0 1.076 0.79c0.94 0.67 1.548 1.1 2.018 1.334 0.223 0.111 0.356 0.147 0.43 0.156 0.053 0.007 0.071 0 0.093-0.01 0.019-0.01 0.03-0.015 0.053-0.052 0.035-0.054 0.088-0.172 0.139-0.41 0.107-0.503 0.146-1.236 0.201-2.381C18.964 12.093 19 11.066 19 10.248s-0.036-1.846-0.087-2.893c-0.055-1.145-0.094-1.878-0.201-2.38-0.05-0.24-0.104-0.357-0.139-0.412-0.023-0.036-0.034-0.042-0.053-0.051-0.022-0.01-0.04-0.017-0.094-0.01-0.073 0.009-0.206 0.044-0.43 0.156M10.25 7.5c0.707 0 1.474 0.022 2.229 0.054v5.392A53 53 0 0 1 10.25 13c-1.019 0-2.16-0.044-3.211-0.102-0.853-0.047-1.103-0.07-1.454-0.207-0.193-0.076-0.52-0.304-0.852-0.655-0.332-0.35-0.541-0.69-0.606-0.886C4 10.767 4 10.657 4 10.278v-0.055c0-0.38 0-0.49 0.127-0.873 0.065-0.196 0.274-0.535 0.606-0.886 0.332-0.35 0.66-0.579 0.852-0.654 0.35-0.138 0.601-0.16 1.454-0.207A61 61 0 0 1 10.25 7.5m-3.375 7.392c0.098 0.35 0.193 0.699 0.282 1.03 0.302 1.127 0.818 2.449 1.22 3.405 0.216 0.51 0.602 0.7 0.872 0.67q0.133-0.016 0.206-0.037 0.063-0.016 0.168-0.06c0.248-0.104 0.504-0.474 0.432-1.075a235 235 0 0 0-0.485-3.83 70 70 0 0 1-2.641-0.1z" : "M5 6.1C5 3.333 7.323 2 9.25 2s4.25 1.333 4.25 4.1c0 1.203-0.338 2.405-1.048 3.331a3.94 3.94 0 0 1-3.202 1.573A3.94 3.94 0 0 1 6.048 9.43C5.338 8.505 5 7.303 5 6.1M9.25 4C8.08 4 7 4.756 7 6.1c0 0.852 0.242 1.602 0.635 2.114 0.375 0.489 0.902 0.79 1.615 0.79s1.24-0.301 1.615-0.79C11.258 7.702 11.5 6.952 11.5 6.1c0-1.344-1.08-2.1-2.25-2.1m8.342 0.001c-1.38 0-3.102 0.964-3.102 3.005 0 0.84 0.236 1.697 0.751 2.369a2.9 2.9 0 0 0 2.351 1.155 2.9 2.9 0 0 0 2.35-1.155c0.516-0.672 0.752-1.529 0.752-2.37 0-2.04-1.722-3.004-3.102-3.004M16.49 7.006c0-0.36 0.137-0.583 0.317-0.734 0.203-0.17 0.495-0.271 0.785-0.271s0.582 0.101 0.785 0.27c0.18 0.152 0.317 0.375 0.317 0.735 0 0.488-0.14 0.894-0.338 1.152a0.9 0.9 0 0 1-0.764 0.372 0.9 0.9 0 0 1-0.764-0.372C16.63 7.9 16.49 7.494 16.49 7.006M9.25 12c-3.003 0-4.973 0.75-6.195 1.901A4.92 4.92 0 0 0 1.5 17.509c0 1.083 0.366 2.306 1.677 3.198C4.402 21.541 6.335 22 9.25 22s4.848-0.46 6.073-1.293c1.11-0.755 1.542-1.748 1.649-2.69q0.309 0.01 0.642 0.01c1.915 0 3.25-0.289 4.13-0.868C22.717 16.519 23 15.62 23 14.834c0-0.735-0.243-1.74-1.132-2.55C20.987 11.482 19.613 11 17.614 11s-3.373 0.482-4.254 1.284q-0.14 0.128-0.26 0.263C12.062 12.198 10.792 12 9.25 12m5.764 1.536q0.23 0.175 0.431 0.365a4.86 4.86 0 0 1 1.325 2.103q0.381 0.023 0.844 0.024c1.785 0 2.642-0.284 3.03-0.54 0.297-0.194 0.357-0.391 0.357-0.654 0-0.313-0.1-0.726-0.48-1.07C20.134 13.411 19.315 13 17.614 13c-1.341 0-2.134 0.255-2.6 0.536M3.5 17.509c0-0.633 0.199-1.468 0.926-2.152C5.155 14.67 6.56 14 9.25 14s4.095 0.67 4.825 1.357C14.801 16.041 15 16.877 15 17.51c0 0.586-0.162 1.108-0.803 1.544C13.47 19.549 12.027 20 9.25 20s-4.22-0.451-4.947-0.946C3.663 18.618 3.5 18.096 3.5 17.51", userStoriesScreen4.u1, new bad(userStoriesScreen4, 27, v1hVar), 56);
                        Drawable drawable2 = userStoriesScreen4.getContext().getDrawable(R.drawable.icon_dots_vertical);
                        qe7.K(iZ, drawable2);
                        jcc jccVar2 = new jcc(R.drawable.icon_dots_vertical, drawable2, null, "M12 7.5a1.5 1.5 0 1 1 0-3 1.5 1.5 0 0 1 0 3m0 12a1.5 1.5 0 1 1 0-3 1.5 1.5 0 0 1 0 3M10.5 12a1.5 1.5 0 1 0 3 0 1.5 1.5 0 0 0-3 0", userStoriesScreen4.u1, new qni(userStoriesScreen4, 2), 56);
                        Drawable drawable3 = userStoriesScreen4.getContext().getDrawable(R.drawable.icon_cross);
                        qe7.K(iZ, drawable3);
                        accVar = new acc(jccVar, new jcc(R.drawable.icon_cross, drawable3, null, "M17.657 4.93a1 1 0 0 1 1.414 1.413L14.3 11.117a1.25 1.25 0 0 0 0 1.767l4.772 4.773a1 1 0 0 1-1.414 1.414l-4.772-4.773-0.095-0.086a1.25 1.25 0 0 0-1.673 0.086l-4.773 4.773a1 1 0 1 1-1.414-1.414l4.772-4.773a1.25 1.25 0 0 0 0-1.767L4.93 6.343A1 1 0 1 1 6.344 4.93l4.773 4.773 0.095 0.086a1.25 1.25 0 0 0 1.673-0.086z", userStoriesScreen4.u1, new qni(userStoriesScreen4, 3), 56), jccVar2);
                    } else {
                        Drawable drawable4 = userStoriesScreen4.getContext().getDrawable(R.drawable.icon_dots_vertical);
                        qe7.K(iZ, drawable4);
                        jcc jccVar3 = new jcc(R.drawable.icon_dots_vertical, drawable4, null, "M12 7.5a1.5 1.5 0 1 1 0-3 1.5 1.5 0 0 1 0 3m0 12a1.5 1.5 0 1 1 0-3 1.5 1.5 0 0 1 0 3M10.5 12a1.5 1.5 0 1 0 3 0 1.5 1.5 0 0 0-3 0", userStoriesScreen4.u1, new qni(userStoriesScreen4, 4), 56);
                        Drawable drawable5 = userStoriesScreen4.getContext().getDrawable(R.drawable.icon_cross);
                        qe7.K(iZ, drawable5);
                        accVar = new acc(jccVar3, new jcc(R.drawable.icon_cross, drawable5, null, "M17.657 4.93a1 1 0 0 1 1.414 1.413L14.3 11.117a1.25 1.25 0 0 0 0 1.767l4.772 4.773a1 1 0 0 1-1.414 1.414l-4.772-4.773-0.095-0.086a1.25 1.25 0 0 0-1.673 0.086l-4.773 4.773a1 1 0 1 1-1.414-1.414l4.772-4.773a1.25 1.25 0 0 0 0-1.767L4.93 6.343A1 1 0 1 1 6.344 4.93l4.773 4.773 0.095 0.086a1.25 1.25 0 0 0 1.673-0.086z", userStoriesScreen4.u1, new qni(userStoriesScreen4, 5), 56), null);
                    }
                } else {
                    int iZ2 = oc9.Z(R.attr.icon_primary_inverse_static, userStoriesScreen4.A1());
                    Drawable drawable6 = userStoriesScreen4.getContext().getDrawable(R.drawable.icon_dots_vertical);
                    qe7.K(iZ2, drawable6);
                    jcc jccVar4 = new jcc(R.drawable.icon_dots_vertical, drawable6, null, "M12 7.5a1.5 1.5 0 1 1 0-3 1.5 1.5 0 0 1 0 3m0 12a1.5 1.5 0 1 1 0-3 1.5 1.5 0 0 1 0 3M10.5 12a1.5 1.5 0 1 0 3 0 1.5 1.5 0 0 0-3 0", userStoriesScreen4.u1, new qni(userStoriesScreen4, 0), 56);
                    Drawable drawable7 = userStoriesScreen4.getContext().getDrawable(R.drawable.icon_cross);
                    qe7.K(iZ2, drawable7);
                    accVar = new acc(jccVar4, new jcc(R.drawable.icon_cross, drawable7, null, "M17.657 4.93a1 1 0 0 1 1.414 1.413L14.3 11.117a1.25 1.25 0 0 0 0 1.767l4.772 4.773a1 1 0 0 1-1.414 1.414l-4.772-4.773-0.095-0.086a1.25 1.25 0 0 0-1.673 0.086l-4.773 4.773a1 1 0 1 1-1.414-1.414l4.772-4.773a1.25 1.25 0 0 0 0-1.767L4.93 6.343A1 1 0 1 1 6.344 4.93l4.773 4.773 0.095 0.086a1.25 1.25 0 0 0 1.673-0.086z", userStoriesScreen4.u1, new qni(userStoriesScreen4, 1), 56), null);
                }
                rccVar.setRightActions(accVar);
                return sbi.a;
            case 5:
                Object obj7 = this.f;
                ch3.d0(obj);
                UserStoriesScreen userStoriesScreen5 = this.g;
                zv8[] zv8VarArr5 = UserStoriesScreen.x1;
                qp4 qp4Var = userStoriesScreen5.s1;
                if (qp4Var != null) {
                    qp4Var.dismiss();
                }
                userStoriesScreen5.s1 = null;
                userStoriesScreen5.t1 = null;
                userStoriesScreen5.r1 = null;
                return sbi.a;
            case 6:
                Object obj8 = this.f;
                ch3.d0(obj);
                rbb rbbVar = (rbb) obj8;
                if (rbbVar instanceof i65) {
                    uug.b.e((i65) rbbVar);
                } else if (rbbVar instanceof vug) {
                    uug uugVar = uug.b;
                    long j2 = ((vug) rbbVar).b;
                    o65 o65VarB = uugVar.b();
                    n65 n65Var = new n65();
                    n65Var.a = ":profile";
                    n65Var.d(Long.valueOf(j2), "id");
                    n65Var.d("contact", "type");
                    n65Var.d(Boolean.TRUE, "replace_top");
                    o65.e(o65VarB, n65Var.a(), null, null, 4);
                } else if (rbbVar instanceof wug) {
                    uug uugVar2 = uug.b;
                    long j3 = ((wug) rbbVar).b;
                    o65 o65VarB2 = uugVar2.b();
                    n65 n65Var2 = new n65();
                    n65Var2.a = ":chats";
                    n65Var2.d(Long.valueOf(j3), "id");
                    n65Var2.d("local", "type");
                    n65Var2.d(Boolean.TRUE, "replace_top");
                    o65.e(o65VarB2, n65Var2.a(), null, null, 4);
                }
                return sbi.a;
            case 7:
                Object obj9 = this.f;
                ch3.d0(obj);
                if (!cqk.d((nug) obj9, nug.a)) {
                    ore.o();
                    return null;
                }
                UserStoriesScreen userStoriesScreen6 = this.g;
                zv8[] zv8VarArr6 = UserStoriesScreen.x1;
                userStoriesScreen6.H1().N();
                return sbi.a;
            case 8:
                Object obj10 = this.f;
                ch3.d0(obj);
                boolean zBooleanValue = ((Boolean) obj10).booleanValue();
                UserStoriesScreen userStoriesScreen7 = this.g;
                if (zBooleanValue) {
                    zv8[] zv8VarArr7 = UserStoriesScreen.x1;
                    userStoriesScreen7.H1().O(2);
                } else {
                    zv8[] zv8VarArr8 = UserStoriesScreen.x1;
                    userStoriesScreen7.H1().K(2);
                }
                return sbi.a;
            case 9:
                Object obj11 = this.f;
                ch3.d0(obj);
                long jLongValue = ((Number) obj11).longValue();
                UserStoriesScreen userStoriesScreen8 = this.g;
                zv8[] zv8VarArr9 = UserStoriesScreen.x1;
                gpi gpiVarH1 = userStoriesScreen8.H1();
                String str2 = gpiVarH1.p;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str2, zo5.j(jLongValue, "onCurrentUserIdChanged: "), null);
                    }
                }
                if (jLongValue == gpiVarH1.c.a()) {
                    gpiVarH1.O(4);
                } else {
                    gpiVarH1.K(4);
                    gpiVarH1.N();
                }
                return sbi.a;
            case 10:
                Object obj12 = this.f;
                ch3.d0(obj);
                boolean zBooleanValue2 = ((Boolean) obj12).booleanValue();
                String str3 = this.g.a;
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null) {
                    je9 je9Var2 = je9.d;
                    if (a4cVar2.b(je9Var2)) {
                        a4cVar2.c(je9Var2, str3, zo5.s("isCoveredByOverlayFlow: isCovered=", zBooleanValue2), null);
                    }
                }
                UserStoriesScreen userStoriesScreen9 = this.g;
                if (zBooleanValue2) {
                    userStoriesScreen9.H1().K(5);
                } else {
                    userStoriesScreen9.H1().O(5);
                }
                return sbi.a;
            case 11:
                Object obj13 = this.f;
                ch3.d0(obj);
                boolean zBooleanValue3 = ((Boolean) obj13).booleanValue();
                ny8 ny8Var = this.g.r;
                if (ny8Var.d()) {
                    ((e3j) ny8Var.getValue()).b(zBooleanValue3 ? 0.0f : 1.0f);
                }
                return sbi.a;
            case 12:
                je9 je9Var3 = je9.d;
                Object obj14 = this.f;
                ch3.d0(obj);
                mpi mpiVar = (mpi) obj14;
                if (cqk.d(mpiVar, ipi.a)) {
                    UserStoriesScreen.s1(this.g).setVisibility(0);
                    e22 e22Var = this.g.E;
                    if (e22Var != null) {
                        e22Var.setVisibility(8);
                    }
                    this.g.K1();
                } else {
                    int i6 = 6;
                    if (mpiVar instanceof jpi) {
                        e22 e22Var2 = this.g.E;
                        if (e22Var2 != null) {
                            e22Var2.setVisibility(8);
                        }
                        bwc bwcVarE1 = this.g.E1();
                        jpi jpiVar = (jpi) mpiVar;
                        b68 b68Var = jpiVar.a;
                        zv8[] zv8VarArr10 = bwc.A;
                        bwcVarE1.k(b68Var, false);
                        this.g.D1().setVisibility(0);
                        UserStoriesScreen.v1(this.g, jpiVar.c);
                        UserStoriesScreen.s1(this.g).setVisibility(8);
                        ny8 ny8Var2 = this.g.r;
                        if (ny8Var2.d()) {
                            ((e3j) ny8Var2.getValue()).pause();
                        }
                        UserStoriesScreen.u1(this.g).setVisibility(8);
                        boolean z2 = jpiVar.b;
                        UserStoriesScreen userStoriesScreen10 = this.g;
                        j8e j8eVar = userStoriesScreen10.z;
                        if (z2) {
                            zv8[] zv8VarArr11 = UserStoriesScreen.x1;
                            UserStoriesScreen.w1(userStoriesScreen10, (l1c) j8eVar.m(userStoriesScreen10, zv8VarArr11[6]), jpiVar.a.a);
                            UserStoriesScreen userStoriesScreen11 = this.g;
                            ((l1c) userStoriesScreen11.z.m(userStoriesScreen11, zv8VarArr11[6])).setVisibility(0);
                        } else {
                            ((l1c) j8eVar.m(userStoriesScreen10, UserStoriesScreen.x1[6])).setVisibility(8);
                        }
                    } else {
                        int i7 = 17;
                        if (mpiVar instanceof kpi) {
                            e22 e22Var3 = this.g.E;
                            if (e22Var3 != null) {
                                e22Var3.setVisibility(8);
                            }
                            UserStoriesScreen.s1(this.g).setVisibility(8);
                            this.g.D1().setVisibility(8);
                            kpi kpiVar = (kpi) mpiVar;
                            UserStoriesScreen.v1(this.g, kpiVar.d);
                            boolean z3 = kpiVar.b;
                            UserStoriesScreen userStoriesScreen12 = this.g;
                            if (z3) {
                                UserStoriesScreen.w1(userStoriesScreen12, UserStoriesScreen.t1(userStoriesScreen12), kpiVar.a.a);
                                UserStoriesScreen.t1(this.g).setVisibility(0);
                                UserStoriesScreen.u1(this.g).setVisibility(8);
                            } else {
                                UserStoriesScreen.t1(userStoriesScreen12).setVisibility(8);
                                UserStoriesScreen.u1(this.g).setVisibility(0);
                                UserStoriesScreen.u1(this.g).l(kpiVar.a);
                            }
                            e3j e3jVar = (e3j) this.g.r.getValue();
                            boolean z4 = e3jVar.e() != kpiVar.c;
                            boolean zBooleanValue4 = ((Boolean) this.g.H1().z.a.getValue()).booleanValue();
                            if (z4) {
                                if (zBooleanValue4) {
                                    String str4 = this.g.a;
                                    a4c a4cVar3 = gm0.f;
                                    if (a4cVar3 != null && a4cVar3.b(je9Var3)) {
                                        a4cVar3.c(je9Var3, str4, "invalidateVideoFrame cuz need seek", null);
                                    }
                                    mjg mjgVar = this.g.H1().u1;
                                    Boolean bool = Boolean.FALSE;
                                    mjgVar.getClass();
                                    mjgVar.j(null, bool);
                                }
                                e3jVar.seekTo(kpiVar.c + 30);
                            }
                            if (zBooleanValue4) {
                                e3jVar.play();
                            }
                            if (!z4 && ((Boolean) this.g.H1().v1.a.getValue()).booleanValue()) {
                                this.g.H1().G();
                            }
                            UserStoriesScreen userStoriesScreen13 = this.g;
                            gpi gpiVarH2 = userStoriesScreen13.H1();
                            String str5 = gpiVarH2.p;
                            a4c a4cVar4 = gm0.f;
                            if (a4cVar4 != null && a4cVar4.b(je9Var3)) {
                                a4cVar4.c(je9Var3, str5, "stopPhotoTimer", null);
                            }
                            l95 l95Var = gpiVarH2.q1;
                            sgg sggVar = (sgg) l95Var.f;
                            if (sggVar != null) {
                                sggVar.b(null);
                            }
                            l95Var.f = null;
                            ghb ghbVar = ew5.b;
                            userStoriesScreen13.p1.B(userStoriesScreen13, UserStoriesScreen.x1[17], e9i.j0(new fz6(n1g.v(u3m.b(e3jVar, qe7.O(16, lw5.MILLISECONDS)), userStoriesScreen13.getViewLifecycleOwner().f(), n09.d), new uni(lq4Var, userStoriesScreen13, i7), i2), userStoriesScreen13.getViewLifecycleScope()));
                        } else {
                            if (!(mpiVar instanceof lpi)) {
                                ore.o();
                                return null;
                            }
                            UserStoriesScreen userStoriesScreen14 = this.g;
                            zv8[] zv8VarArr12 = UserStoriesScreen.x1;
                            gpi gpiVarH3 = userStoriesScreen14.H1();
                            String str6 = gpiVarH3.p;
                            a4c a4cVar5 = gm0.f;
                            if (a4cVar5 != null && a4cVar5.b(je9Var3)) {
                                a4cVar5.c(je9Var3, str6, "onUnsupportedStoryReady", null);
                            }
                            t3h t3hVar = gpiVarH3.l;
                            lsg lsgVar = (lsg) gpiVarH3.F.a.getValue();
                            Long lValueOf = lsgVar != null ? Long.valueOf(lsgVar.c()) : null;
                            if (lValueOf != null) {
                                azg azgVar = gpiVarH3.c;
                                long jLongValue2 = lValueOf.longValue();
                                t3hVar.getClass();
                                t3h.z(t3hVar, azgVar, jLongValue2, "story_shown", 4, null, 32);
                            }
                            sgg sggVar2 = (sgg) gpiVarH3.q1.f;
                            if (sggVar2 == null || !sggVar2.isActive()) {
                                l95 l95Var2 = gpiVarH3.q1;
                                sgg sggVar3 = (sgg) l95Var2.f;
                                if (sggVar3 != null) {
                                    sggVar3.b(null);
                                }
                                l95Var2.f = null;
                                l95Var2.b = 0L;
                                l95Var2.f = yab.i0((gu4) l95Var2.c, null, 0, new i20(l95Var2, lq4Var, 29), 3);
                            }
                            gpiVarH3.O(6);
                            if (((toc) gpiVarH3.y.getValue()).a != 0) {
                                gpiVarH3.q1.g();
                            }
                            this.g.H1().G();
                            mjg mjgVar2 = this.g.H1().u1;
                            Boolean bool2 = Boolean.FALSE;
                            mjgVar2.getClass();
                            mjgVar2.j(null, bool2);
                            ny8 ny8Var3 = this.g.r;
                            if (ny8Var3.d()) {
                                ((e3j) ny8Var3.getValue()).pause();
                            }
                            UserStoriesScreen.s1(this.g).setVisibility(8);
                            this.g.D1().setVisibility(8);
                            UserStoriesScreen.u1(this.g).setVisibility(8);
                            UserStoriesScreen.t1(this.g).setVisibility(8);
                            this.g.K1();
                            UserStoriesScreen userStoriesScreen15 = this.g;
                            View view = userStoriesScreen15.E;
                            View view2 = view;
                            if (view == null) {
                                Context context = userStoriesScreen15.getContext();
                                rni rniVar = new rni(userStoriesScreen15, 3);
                                e22 e22Var4 = new e22(context);
                                kbc kbcVar = pq3.j.e(context).j().b;
                                e22Var4.setOrientation(1);
                                e22Var4.setGravity(1);
                                e22Var4.setClipChildren(false);
                                ImageView imageView = new ImageView(context);
                                imageView.setLayoutParams(new LinearLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 56.0f), gm0.K(56.0f * yl5.d().getDisplayMetrics().density)));
                                imageView.setImageResource(R.drawable.icon_clock_expired);
                                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                                imageView.setImageTintList(ColorStateList.valueOf(kbcVar.getIcon().b));
                                e22Var4.addView(imageView);
                                TextView textView = new TextView(context);
                                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(gm0.K(280.0f * yl5.d().getDisplayMetrics().density), -2);
                                layoutParams.topMargin = gm0.K(yl5.d().getDisplayMetrics().density * 12.0f);
                                textView.setLayoutParams(layoutParams);
                                q9i.a(q9i.h, textView);
                                textView.setGravity(17);
                                textView.setTextColor(kbcVar.getText().b);
                                textView.setText(R.string.oneme_stories_viewer_unsupported_message);
                                e22Var4.addView(textView);
                                cyb cybVar = new cyb(context);
                                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                                layoutParams2.topMargin = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
                                cybVar.setLayoutParams(layoutParams2);
                                cybVar.setSize(ayb.j);
                                cybVar.setAppearance(zxb.SECONDARY_CONTRAST);
                                cybVar.setCustomTheme(kbcVar);
                                cybVar.setText(np4.q(cybVar.getContext(), R.string.update));
                                qe7.H(cybVar, 300L, new aah(i6, rniVar));
                                e22Var4.addView(cybVar);
                                e22Var4.setId(R.id.oneme_stories_viewer_unsupported_container);
                                e22Var4.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
                                ((ViewGroup) userStoriesScreen15.D1().getParent()).addView(e22Var4);
                                userStoriesScreen15.E = e22Var4;
                                view2 = e22Var4;
                            }
                            view2.setVisibility(0);
                            this.g.z1().setVisibility(8);
                        }
                    }
                }
                return sbi.a;
            case 13:
                Object obj15 = this.f;
                ch3.d0(obj);
                v84 v84Var = (v84) obj15;
                String str7 = this.g.a;
                a4c a4cVar6 = gm0.f;
                if (a4cVar6 != null) {
                    je9 je9Var4 = je9.d;
                    if (a4cVar6.b(je9Var4)) {
                        a4cVar6.c(je9Var4, str7, "invalidateVideoFrame cuz videoPlaylist changed", null);
                    }
                }
                mjg mjgVar3 = this.g.H1().u1;
                Boolean bool3 = Boolean.FALSE;
                mjgVar3.getClass();
                mjgVar3.j(null, bool3);
                UserStoriesScreen userStoriesScreen16 = this.g;
                userStoriesScreen16.o = false;
                userStoriesScreen16.Z = v84Var;
                if (v84Var != null) {
                    userStoriesScreen16.J1(v84Var, false);
                    return sbi.a;
                }
                ore.p("Required value was null.");
                return null;
            case 14:
                Object obj16 = this.f;
                ch3.d0(obj);
                boolean zBooleanValue5 = ((Boolean) obj16).booleanValue();
                String str8 = this.g.a;
                a4c a4cVar7 = gm0.f;
                if (a4cVar7 != null) {
                    je9 je9Var5 = je9.d;
                    if (a4cVar7.b(je9Var5)) {
                        a4cVar7.c(je9Var5, str8, zo5.s("videoVisible=", zBooleanValue5), null);
                    }
                }
                uj6 uj6Var = this.g.Y;
                if (!zBooleanValue5) {
                    if (uj6Var != null) {
                        uj6Var.h();
                    }
                    this.g.G1().setAlpha(0.0f);
                } else if (uj6Var != null) {
                    uj6Var.g();
                }
                return sbi.a;
            case 15:
                return l(obj);
            case 16:
                UserStoriesScreen userStoriesScreen17 = this.g;
                Object obj17 = this.f;
                ch3.d0(obj);
                rvg rvgVar = (rvg) obj17;
                if (cqk.d(rvgVar, ovg.a)) {
                    zv8[] zv8VarArr13 = UserStoriesScreen.x1;
                    userStoriesScreen17.H1().K(3);
                    mjg mjgVar4 = userStoriesScreen17.C1().m;
                    Boolean bool4 = Boolean.FALSE;
                    mjgVar4.getClass();
                    mjgVar4.j(null, bool4);
                    ViewPropertyAnimator viewPropertyAnimator = userStoriesScreen17.n1;
                    if (viewPropertyAnimator != null) {
                        viewPropertyAnimator.cancel();
                    }
                    userStoriesScreen17.n1 = null;
                    userStoriesScreen17.n1 = UserStoriesScreen.r1(userStoriesScreen17).animate().alpha(1.0f).setDuration(200L).withStartAction(new yni(userStoriesScreen17, 0));
                    ViewPropertyAnimator viewPropertyAnimator2 = userStoriesScreen17.n1;
                    if (viewPropertyAnimator2 != null) {
                        viewPropertyAnimator2.start();
                    }
                } else if (cqk.d(rvgVar, pvg.a)) {
                    zv8[] zv8VarArr14 = UserStoriesScreen.x1;
                    userStoriesScreen17.H1().O(3);
                    mjg mjgVar5 = userStoriesScreen17.C1().m;
                    Boolean bool5 = Boolean.TRUE;
                    mjgVar5.getClass();
                    mjgVar5.j(null, bool5);
                    ViewPropertyAnimator viewPropertyAnimator3 = userStoriesScreen17.n1;
                    if (viewPropertyAnimator3 != null) {
                        viewPropertyAnimator3.cancel();
                    }
                    userStoriesScreen17.n1 = null;
                    userStoriesScreen17.n1 = UserStoriesScreen.r1(userStoriesScreen17).animate().alpha(0.0f).setDuration(200L).withEndAction(new yni(userStoriesScreen17, 1));
                    ViewPropertyAnimator viewPropertyAnimator4 = userStoriesScreen17.n1;
                    if (viewPropertyAnimator4 != null) {
                        viewPropertyAnimator4.start();
                    }
                } else {
                    if (!(rvgVar instanceof qvg)) {
                        ore.o();
                        return null;
                    }
                    g8c g8cVar = userStoriesScreen17.v1;
                    if (g8cVar != null) {
                        g8cVar.a();
                    }
                    h8c h8cVar = new h8c(userStoriesScreen17);
                    h8cVar.m(new tnh(R.string.oneme_stories_viewer_reply_sent));
                    h8cVar.j(new e9c(new tnh(R.string.oneme_stories_viewer_reply_show)));
                    h8cVar.h(new w8c(R.drawable.done_fill_round_animated));
                    h8cVar.c(userStoriesScreen17.N1());
                    h8cVar.e(new cmf(userStoriesScreen17, rvgVar, z, i));
                    userStoriesScreen17.v1 = h8cVar.p();
                }
                return sbi.a;
            default:
                Object obj18 = this.f;
                ch3.d0(obj);
                long jLongValue3 = ((Number) obj18).longValue();
                UserStoriesScreen userStoriesScreen18 = this.g;
                zv8[] zv8VarArr15 = UserStoriesScreen.x1;
                gpi gpiVarH4 = userStoriesScreen18.H1();
                lsg lsgVar2 = (lsg) ww3.u1(((Number) gpiVarH4.D.a.getValue()).intValue(), (List) gpiVarH4.A.getValue());
                if (lsgVar2 != null) {
                    jsg jsgVar = lsgVar2 instanceof jsg ? (jsg) lsgVar2 : null;
                    if (jsgVar != null) {
                        int i8 = jsgVar.c;
                        v84 v84Var2 = (v84) gpiVarH4.I.getValue();
                        if (v84Var2 != null && (list = v84Var2.a) != null && (u84Var = (u84) ww3.u1(i8, list)) != null) {
                            float f = (jLongValue3 - ((jsg) lsgVar2).i) / u84Var.d;
                            mjg mjgVar6 = gpiVarH4.B;
                            mjgVar6.j(null, b8b.a((b8b) mjgVar6.getValue(), f));
                        }
                    }
                }
                return sbi.a;
        }
    }
}
