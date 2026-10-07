package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import one.me.android.root.RootController;
import one.me.profileedit.ProfileEditScreen;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class pod extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ ProfileEditScreen g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pod(ProfileEditScreen profileEditScreen, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = profileEditScreen;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        ProfileEditScreen profileEditScreen = this.g;
        switch (i) {
            case 0:
                pod podVar = new pod(profileEditScreen, lq4Var, 0);
                podVar.f = obj;
                return podVar;
            case 1:
                pod podVar2 = new pod(profileEditScreen, lq4Var, 1);
                podVar2.f = obj;
                return podVar2;
            case 2:
                pod podVar3 = new pod(profileEditScreen, lq4Var, 2);
                podVar3.f = obj;
                return podVar3;
            default:
                pod podVar4 = new pod(profileEditScreen, lq4Var, 3);
                podVar4.f = obj;
                return podVar4;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((pod) create((List) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((pod) create((rbb) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 2:
                ((pod) create((vod) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            default:
                ((pod) create((ind) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:131:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:88:0x02ce  */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                List list = (List) this.f;
                ch3.d0(obj);
                ProfileEditScreen profileEditScreen = this.g;
                if (profileEditScreen.getView() != null) {
                    List list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator it = list2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((vnd) it.next()) instanceof nj2) {
                                }
                            } else if (profileEditScreen.a == ((s7f) ((et3) profileEditScreen.c.getValue())).t()) {
                                profileEditScreen.r1().setRightActions(new ccc(1, new ol0(25, profileEditScreen)));
                            }
                            zv8[] zv8VarArr = ProfileEditScreen.p;
                            profileEditScreen.r1().setRightActions(ybc.a);
                        }
                    } else if (profileEditScreen.a == ((s7f) ((et3) profileEditScreen.c.getValue())).t()) {
                        zv8[] zv8VarArr2 = ProfileEditScreen.p;
                        profileEditScreen.r1().setRightActions(ybc.a);
                    } else {
                        profileEditScreen.r1().setRightActions(new ccc(1, new ol0(25, profileEditScreen)));
                    }
                }
                profileEditScreen.g.I(list, new i7b(profileEditScreen, 24, list));
                return sbi.a;
            case 1:
                rbb rbbVar = (rbb) this.f;
                ch3.d0(obj);
                if (!cqk.d(rbbVar, znd.b)) {
                    if (cqk.d(rbbVar, eod.b)) {
                        ProfileEditScreen profileEditScreen2 = this.g;
                        zv8[] zv8VarArr3 = ProfileEditScreen.p;
                        apd apdVarS1 = profileEditScreen2.s1();
                        apdVarS1.p.B(apdVarS1, apd.r[0], yab.i0(apdVarS1.b, null, 0, new yod(apdVarS1, null, 1), 3));
                    } else if (cqk.d(rbbVar, god.b)) {
                        o65.c(wnd.b.b(), ":media-picker/select/photo", null, null, 6);
                    } else if (rbbVar instanceof fod) {
                        try {
                            this.g.startActivityForResult(((fod) rbbVar).b, 333);
                            tbb.g((tbb) this.g.o.getValue(), y3f.AVATAR_PICKER_CAMERA);
                        } catch (ActivityNotFoundException unused) {
                            String name = ProfileEditScreen.class.getName();
                            a4c a4cVar = gm0.f;
                            if (a4cVar != null) {
                                a4c.f(a4cVar, je9.g, name, "failed open camera", null, null, 8);
                            }
                            apd apdVarS2 = this.g.s1();
                            apdVarS2.q.set(null);
                            a8j.x(apdVarS2.o, new uod(new tnh(R.string.oneme_profile_edit_cant_open_camera), Integer.valueOf(R.drawable.icon_warning)));
                        }
                        break;
                    } else if (rbbVar instanceof aod) {
                        aod aodVar = (aod) rbbVar;
                        c1a.b.j(aodVar.b, aodVar.c, false);
                    } else if (cqk.d(rbbVar, xnd.b)) {
                        ProfileEditScreen profileEditScreen3 = this.g;
                        zv8[] zv8VarArr4 = ProfileEditScreen.p;
                        ((wsc) profileEditScreen3.n.getValue()).n(new svj(this.g, 1));
                    } else if (cqk.d(rbbVar, dod.b)) {
                        ProfileEditScreen profileEditScreen4 = this.g;
                        zv8[] zv8VarArr5 = ProfileEditScreen.p;
                        if (profileEditScreen4.getRouter().a.a.size() != 2) {
                            o65.c(wnd.b.b(), ":chat-list", null, null, 6);
                        } else {
                            lve lveVar = (lve) profileEditScreen4.getRouter().e().get(1);
                            if (cqk.d(lveVar != null ? lveVar.a : null, profileEditScreen4)) {
                                RootController rootController = wnd.b.b().a().e;
                                Activity activityD = rootController != null ? rootController.w1().d() : null;
                                if (activityD != null) {
                                    activityD.finish();
                                }
                            } else {
                                o65.c(wnd.b.b(), ":chat-list", null, null, 6);
                            }
                        }
                    } else if (rbbVar instanceof cod) {
                        wnd.b.j(((cod) rbbVar).b);
                    } else if (rbbVar instanceof i65) {
                        wnd.b.e((i65) rbbVar);
                    } else if (rbbVar instanceof ynd) {
                        ynd yndVar = (ynd) rbbVar;
                        int iOrdinal = yndVar.c.ordinal();
                        if (iOrdinal == 0) {
                            o65.c(wnd.b.b(), nbh.s(yndVar.b, ":profile/edit/link?id=", "&type=local_chat&flow=edit"), null, null, 6);
                        } else if (iOrdinal == 1) {
                            o65.c(wnd.b.b(), nbh.s(yndVar.b, ":profile/edit/link?id=", "&type=server_chat&flow=edit"), null, null, 6);
                        } else {
                            if (iOrdinal != 2) {
                                ore.o();
                                return null;
                            }
                            wnd wndVar = wnd.b;
                            long j = yndVar.b;
                            gjf gjfVar = (gjf) this.g.b.getAccessor().d(97).getValue();
                            wndVar.getClass();
                            if (((g5d) gjfVar).p()) {
                                o65.c(wndVar.b(), nbh.s(j, ":profile/edit/link?id=", "&type=contact&flow=edit"), null, null, 6);
                            }
                        }
                    } else if (rbbVar instanceof bod) {
                        o65.c(wnd.b.b(), zo5.j(((bod) rbbVar).b, ":profile/invite?id="), null, null, 6);
                    } else if (rbbVar instanceof rt3) {
                        this.g.getRouter().C(this.g);
                    }
                }
                ml9.b(this.g);
                return sbi.a;
            case 2:
                sbi sbiVar = sbi.a;
                ProfileEditScreen profileEditScreen5 = this.g;
                vod vodVar = (vod) this.f;
                ch3.d0(obj);
                if (vodVar instanceof sod) {
                    sod sodVar = (sod) vodVar;
                    CharSequence charSequenceB = sodVar.a.b(profileEditScreen5.getContext());
                    if (charSequenceB != null) {
                        h8c h8cVar = new h8c(profileEditScreen5);
                        h8cVar.h(z8c.a);
                        h8cVar.n(charSequenceB);
                        h8cVar.j(b9c.a);
                        h8cVar.c(new o8c(0, 0, sodVar.b, 11));
                        h8cVar.e(sodVar.c);
                        h8cVar.p();
                    }
                } else if (vodVar instanceof tod) {
                    ml9.b(profileEditScreen5);
                    zv8[] zv8VarArr6 = BottomSheetWidget.t;
                    tod todVar = (tod) vodVar;
                    jc4 jc4VarA = mol.a(todVar.a, null, null, 6);
                    jc4VarA.g(todVar.b);
                    jc4VarA.h(todVar.d);
                    todVar.c.forEach(new o01(12, new t63(1, jc4VarA, jc4.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 16)));
                    ConfirmationBottomSheet confirmationBottomSheetF = jc4VarA.f(profileEditScreen5);
                    confirmationBottomSheetF.setTargetController(profileEditScreen5);
                    br4 parentController = profileEditScreen5;
                    while (parentController.getParentController() != null) {
                        parentController = parentController.getParentController();
                    }
                    RootController rootController2 = parentController instanceof RootController ? (RootController) parentController : null;
                    hve hveVarU1 = rootController2 != null ? rootController2.u1() : null;
                    if (hveVarU1 != null) {
                        lve lveVar2 = new lve(confirmationBottomSheetF, null, null, null, false, -1);
                        p.k(false, lveVar2, true, "BottomSheetWidget");
                        hveVarU1.I(lveVar2);
                    }
                } else {
                    if (!(vodVar instanceof uod)) {
                        ore.o();
                        return null;
                    }
                    uod uodVar = (uod) vodVar;
                    CharSequence charSequenceB2 = uodVar.a.b(profileEditScreen5.getContext());
                    if (charSequenceB2 != null) {
                        h8c h8cVar2 = new h8c(profileEditScreen5);
                        h8cVar2.n(charSequenceB2);
                        h8cVar2.h(new w8c(uodVar.b.intValue()));
                        h8cVar2.p();
                    }
                }
                return sbiVar;
            default:
                ind indVar = (ind) this.f;
                ch3.d0(obj);
                ProfileEditScreen profileEditScreen6 = this.g;
                j8e j8eVar = profileEditScreen6.l;
                zv8[] zv8VarArr7 = ProfileEditScreen.p;
                kwb kwbVar = (kwb) j8eVar.m(profileEditScreen6, zv8VarArr7[4]);
                String str = indVar.a;
                boolean z = indVar.e;
                Long l = new Long(indVar.b);
                CharSequence charSequence = indVar.d;
                if (charSequence == null) {
                    charSequence = "";
                }
                kwb.v(kwbVar, str, l, charSequence);
                ((kwb) j8eVar.m(profileEditScreen6, zv8VarArr7[4])).setAddBadgeVisibility(indVar.f);
                profileEditScreen6.q1().setVisibility(z ? 0 : 8);
                if (z) {
                    FrameLayout frameLayoutQ1 = profileEditScreen6.q1();
                    if (!frameLayoutQ1.isLaidOut() || frameLayoutQ1.isLayoutRequested()) {
                        frameLayoutQ1.addOnLayoutChangeListener(new xc0(15, profileEditScreen6));
                    } else {
                        RecyclerView recyclerViewO1 = ProfileEditScreen.o1(profileEditScreen6);
                        recyclerViewO1.setPadding(recyclerViewO1.getPaddingLeft(), recyclerViewO1.getPaddingTop(), recyclerViewO1.getPaddingRight(), bc1.g(12.0f, yl5.d().getDisplayMetrics().density, 2, profileEditScreen6.q1().getMeasuredHeight()));
                    }
                } else {
                    RecyclerView recyclerViewO2 = ProfileEditScreen.o1(profileEditScreen6);
                    recyclerViewO2.setPadding(recyclerViewO2.getPaddingLeft(), recyclerViewO2.getPaddingTop(), recyclerViewO2.getPaddingRight(), gm0.K(12.0f * yl5.d().getDisplayMetrics().density));
                }
                return sbi.a;
        }
    }
}
