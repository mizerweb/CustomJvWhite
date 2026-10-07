package one.me.profile;

import android.animation.ValueAnimator;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.work.WorkRequest;
import defpackage.a8j;
import defpackage.bc1;
import defpackage.c1a;
import defpackage.c37;
import defpackage.ca2;
import defpackage.cqk;
import defpackage.d4f;
import defpackage.dk2;
import defpackage.dq4;
import defpackage.dtd;
import defpackage.dvd;
import defpackage.dwd;
import defpackage.e9i;
import defpackage.en3;
import defpackage.et3;
import defpackage.et4;
import defpackage.fz6;
import defpackage.gm0;
import defpackage.h8c;
import defpackage.ha9;
import defpackage.hud;
import defpackage.i19;
import defpackage.ic6;
import defpackage.it3;
import defpackage.j1a;
import defpackage.j8e;
import defpackage.jz;
import defpackage.k96;
import defpackage.k9d;
import defpackage.kmd;
import defpackage.ks6;
import defpackage.ksd;
import defpackage.ku8;
import defpackage.l6m;
import defpackage.ll6;
import defpackage.lq4;
import defpackage.lvb;
import defpackage.lve;
import defpackage.ma6;
import defpackage.mc4;
import defpackage.n09;
import defpackage.n0c;
import defpackage.n1g;
import defpackage.ny8;
import defpackage.o65;
import defpackage.oc9;
import defpackage.oi8;
import defpackage.oq1;
import defpackage.ore;
import defpackage.osi;
import defpackage.ph9;
import defpackage.pnh;
import defpackage.pud;
import defpackage.q8e;
import defpackage.qp4;
import defpackage.qt4;
import defpackage.qud;
import defpackage.qv1;
import defpackage.r07;
import defpackage.rcc;
import defpackage.rq;
import defpackage.rx8;
import defpackage.s7f;
import defpackage.soh;
import defpackage.spc;
import defpackage.suc;
import defpackage.t20;
import defpackage.t59;
import defpackage.tnh;
import defpackage.trd;
import defpackage.tre;
import defpackage.ubf;
import defpackage.vbd;
import defpackage.vp4;
import defpackage.vtd;
import defpackage.vud;
import defpackage.vzc;
import defpackage.w8c;
import defpackage.whc;
import defpackage.wjd;
import defpackage.wrd;
import defpackage.wsc;
import defpackage.wtc;
import defpackage.wtd;
import defpackage.ww3;
import defpackage.xc0;
import defpackage.xc3;
import defpackage.xt4;
import defpackage.xtd;
import defpackage.xu1;
import defpackage.y1m;
import defpackage.yab;
import defpackage.ylc;
import defpackage.yt4;
import defpackage.yw4;
import defpackage.z18;
import defpackage.zfe;
import defpackage.zo5;
import defpackage.ztd;
import defpackage.zud;
import defpackage.zv8;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001\u0014B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB)\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\t\u0010\u0013¨\u0006\u0015"}, d2 = {"Lone/me/profile/ProfileScreen;", "Lone/me/sdk/arch/Widget;", "Lvp4;", "Lmc4;", "Lj1a;", "Lubf;", "Lyw4;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "id", "Lkmd;", "type", "", "isOpenedFromDialog", "Lha9;", "localAccountId", "(JLkmd;ZLha9;)V", "ku8", "profile"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ProfileScreen extends Widget implements vp4, mc4, j1a, ubf, yw4 {
    public whc A;
    public final ks6 a;
    public final oi8 b;
    public final wtc c;
    public final ca2 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final j8e i;
    public final j8e j;
    public final j8e k;
    public final j8e l;
    public final j8e m;
    public final j8e n;
    public final j8e o;
    public final j8e p;
    public final j8e q;
    public final j8e r;
    public final ny8 s;
    public qp4 t;
    public Boolean u;
    public ValueAnimator v;
    public final j8e w;
    public final ny8 x;
    public final ny8 y;
    public final ny8 z;
    public static final /* synthetic */ zv8[] C = {new dwd(ProfileScreen.class, "appBarLayout", "getAppBarLayout()Lcom/google/android/material/appbar/AppBarLayout;", 0), zo5.f(zfe.a, ProfileScreen.class, "recyclerView", "getRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0), new dwd(ProfileScreen.class, "oneMeToolbar", "getOneMeToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), new dwd(ProfileScreen.class, "collapsibleContainerLinearLayout", "getCollapsibleContainerLinearLayout()Landroid/widget/LinearLayout;", 0), new dwd(ProfileScreen.class, "avatar", "getAvatar()Lone/me/sdk/uikit/common/avatar/OneMeAvatarView;", 0), new dwd(ProfileScreen.class, "expandedTitle", "getExpandedTitle()Landroid/widget/TextView;", 0), new dwd(ProfileScreen.class, "expandedSubtitle", "getExpandedSubtitle()Landroid/widget/TextView;", 0), new dwd(ProfileScreen.class, "linkView", "getLinkView()Lone/me/profile/LinkView;", 0), new dwd(ProfileScreen.class, "dotDivider", "getDotDivider()Landroidx/appcompat/widget/AppCompatTextView;", 0), new dwd(ProfileScreen.class, "phoneNumberView", "getPhoneNumberView()Lone/me/sdk/sections/ui/recyclerview/settingsitem/SettingsItemContent;", 0), new dwd(ProfileScreen.class, "linkButtonView", "getLinkButtonView()Landroid/widget/TextView;", 0), new dwd(ProfileScreen.class, "membersListRouter", "getMembersListRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0)};
    public static final ku8 B = new ku8();
    public static final int D = 96;

    public ProfileScreen(Bundle bundle) {
        super(bundle);
        this.a = tre.G(this, new vbd(26));
        this.b = oi8.f;
        wtc wtcVar = new wtc(m35getAccountScopeuqN4xOY());
        this.c = wtcVar;
        this.d = new ca2(m35getAccountScopeuqN4xOY());
        this.e = wtcVar.b();
        this.f = wtcVar.c();
        int i = 0;
        this.g = createViewModelLazy(dvd.class, new ztd(i, new k9d(this, 14, bundle)));
        this.h = rx8.P(3, new wtd(this, i));
        this.i = viewBinding(R.id.profile_screen_appbarlayout);
        this.j = viewBinding(R.id.profile_screen_recyclerview);
        this.k = viewBinding(R.id.profile_screen_onemetoolbar);
        this.l = viewBinding(R.id.profile_screen_collapsiblecontainerlinearlayout);
        this.m = viewBinding(R.id.profile_screen_avatar_view);
        this.n = viewBinding(R.id.profile_screen_expandedtitle_view);
        this.o = viewBinding(R.id.profile_screen_expandedsubtitle_view);
        this.p = viewBinding(R.id.profile_link_view);
        this.q = viewBinding(R.id.profile_dot_divider_view);
        this.r = viewBinding(R.id.profile_phone_number_button);
        viewBinding(R.id.profile_link_button);
        this.s = wtcVar.getAccessor().d(714);
        this.w = childSlotRouter(R.id.profile_screen_memberlist_container);
        this.x = wtcVar.getAccessor().d(34);
        this.y = wtcVar.getAccessor().d(231);
        this.z = wtcVar.getAccessor().d(236);
    }

    public static final void o1(ProfileScreen profileScreen) {
        if (profileScreen.getRouter().a.a.size() == 1) {
            lve lveVar = (lve) ww3.t1(profileScreen.getRouter().e());
            if (cqk.d(lveVar != null ? lveVar.a : null, profileScreen)) {
                trd.b.r();
                return;
            }
        }
        o65.c(trd.b.b(), ":chat-list", null, null, 6);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003c  */
    public static final void p1(ProfileScreen profileScreen, rcc rccVar, boolean z) {
        osi osiVar;
        int iI0 = oc9.i0(soh.e(rccVar.getTitle()));
        if (z) {
            osi osiVarA = soh.a(rccVar.getTitle());
            if ((osiVarA != null ? osiVarA.a : 0) == iI0) {
                return;
            }
        }
        if (z) {
            osi osiVarA2 = soh.a(rccVar.getTitle());
            if ((osiVarA2 != null ? osiVarA2.a : 0) != iI0) {
                osiVar = new osi(rccVar.getContext(), iI0, l6m.q);
            } else {
                osiVar = null;
            }
        } else {
            osiVar = null;
        }
        soh.d(rccVar.getTitle(), osiVar);
    }

    @Override // defpackage.yw4
    public final void A0(suc sucVar) {
        dvd dvdVarV1 = v1();
        RectF rectF = sucVar.a;
        dq4 dq4Var = dvdVarV1.b;
        xt4 xt4VarB = ((n0c) dvdVarV1.F()).b();
        yt4 yt4VarE = dvdVarV1.E();
        xt4VarB.getClass();
        yab.i0(dq4Var, lvb.x0(xt4VarB, yt4VarE), 0, new dtd(dvdVarV1, rectF, null, 3), 2);
        c1a.b.b().f();
    }

    @Override // defpackage.vp4
    public final void E(int i, Bundle bundle) {
        String string;
        t59 t59Var;
        String string2;
        t59 t59Var2;
        String strK;
        Integer numValueOf = Integer.valueOf(R.drawable.copy_outline_28);
        if (i == R.id.profile_avatar_action_show_stories) {
            dvd dvdVarV1 = v1();
            ic6 ic6Var = dvdVarV1.C;
            trd trdVar = trd.b;
            long jO = dvdVarV1.p1.o();
            trdVar.getClass();
            bc1.q(":stories/viewer?owner_id=" + jO + "&owner_type=user&type=owner", ic6Var);
            return;
        }
        if (i == R.id.profile_avatar_action_show_photo) {
            v1().P();
            return;
        }
        int i2 = 4;
        boolean z = true;
        if (i == R.id.profile_phone_number_action_copy) {
            dvd dvdVarV2 = v1();
            String strQ = dvdVarV2.p1.q();
            if (strQ != null && strQ.length() != 0) {
                z = false;
            }
            if (it3.b() && !z) {
                a8j.x(dvdVarV2.B, new pud(i2, new tnh(R.string.profile_copy_phone_snackbar_title), numValueOf));
            }
            strK = z ? null : qv1.k("+", strQ);
            if (strK == null) {
                return;
            }
            it3.a(getContext(), strK);
            return;
        }
        if (i == R.id.profile_phone_number_action_voice_call) {
            dvd dvdVarV3 = v1();
            String strQ2 = dvdVarV3.p1.q();
            if (strQ2 == null) {
                gm0.Y(dvd.class.getName(), "Early return in callByNumber cuz of profile.phone is null");
                return;
            } else {
                a8j.x(dvdVarV3.C, new wrd("+".concat(strQ2)));
                return;
            }
        }
        if (i == R.id.profile_phone_number_action_tt_voice_call) {
            v1().K(false);
            return;
        }
        if (i == R.id.profile_phone_number_action_tt_video_call) {
            v1().K(true);
            return;
        }
        if (i == R.id.profile_link_action_copy) {
            dvd dvdVarV4 = v1();
            String strI = dvdVarV4.p1.i();
            if (strI != null && strI.length() != 0) {
                z = false;
            }
            if (it3.b() && !z) {
                a8j.x(dvdVarV4.B, new pud(i2, new tnh(R.string.profile_link_copy_snackbar_title), numValueOf));
            }
            strK = z ? null : strI;
            if (strK == null) {
                return;
            }
            it3.a(getContext(), strK);
            return;
        }
        if (i == R.id.profile_members_list_action_delete_from_chat) {
            if (bundle != null) {
                long j = bundle.getLong("profile:participant_id_for_action");
                dvd dvdVarV5 = v1();
                qud qudVarE = dvdVarV5.p1.E(j);
                if (qudVarE == null) {
                    return;
                }
                a8j.x(dvdVarV5.B, qudVarE);
                return;
            }
            return;
        }
        ma6 ma6Var = t59.h;
        if (i == R.id.link_context_menu_action_open_link || i == R.id.link_context_menu_action_open_call || i == R.id.link_context_menu_action_open_mail || i == R.id.link_context_menu_action_open_profile) {
            if (bundle == null || (string = bundle.getString("profile:contextmenu:link")) == null || (t59Var = (t59) ww3.u1(bundle.getInt("profile:contextmenu:link_type", -1), ma6Var)) == null) {
                return;
            }
            v1().M(4, string, t59Var);
            v1().H(string, t59Var);
            return;
        }
        if ((i != R.id.link_context_menu_action_copy_link && i != R.id.link_context_menu_action_copy_call && i != R.id.link_context_menu_action_copy_mail && i != R.id.link_context_menu_action_copy_profile) || bundle == null || (string2 = bundle.getString("profile:contextmenu:link")) == null || (t59Var2 = (t59) ww3.u1(bundle.getInt("profile:contextmenu:link_type", -1), ma6Var)) == null) {
            return;
        }
        v1().M(3, string2, t59Var2);
        q1(string2, t59Var2);
    }

    @Override // defpackage.mc4
    public final void e(int i, Bundle bundle) {
        long j;
        long jF;
        long j2;
        z18 z18Var;
        if (r1().g(i)) {
            return;
        }
        if (i == R.id.profile_notifications_confirmation_sheet_1_hour || i == R.id.profile_notifications_confirmation_sheet_4_hour || i == R.id.profile_notifications_confirmation_sheet_1_day || i == R.id.profile_notifications_confirmation_sheet_forever) {
            dvd dvdVarV1 = v1();
            wjd wjdVar = dvdVarV1.p1;
            ny8 ny8Var = dvdVarV1.n;
            Long lJ = wjdVar.j();
            if (lJ == null) {
                gm0.Y(dvd.class.getName(), "Early return in disableNotifications cuz of profile.chatLocalId is null");
                return;
            }
            long jLongValue = lJ.longValue();
            if (i == R.id.profile_notifications_confirmation_sheet_1_hour) {
                jF = ((s7f) ((et3) ny8Var.getValue())).f();
                j2 = 3600000;
            } else {
                if (i != R.id.profile_notifications_confirmation_sheet_4_hour) {
                    if (i == R.id.profile_notifications_confirmation_sheet_1_day) {
                        jF = ((s7f) ((et3) ny8Var.getValue())).f();
                        j2 = 86400000;
                    } else {
                        if (i != R.id.profile_notifications_confirmation_sheet_forever) {
                            gm0.Y(dvd.class.getName(), "Early return in disableNotifications cuz of unsupported disableTimeId");
                            return;
                        }
                        j = -1;
                    }
                    dvdVarV1.D().j().W(jLongValue, j);
                    a8j.x(dvdVarV1.B, new pud(4, new tnh(R.string.notifications_disabled), Integer.valueOf(R.drawable.icon_check_round_fill)));
                    return;
                }
                jF = ((s7f) ((et3) ny8Var.getValue())).f();
                j2 = WorkRequest.MAX_BACKOFF_MILLIS;
            }
            j = jF + j2;
            dvdVarV1.D().j().W(jLongValue, j);
            a8j.x(dvdVarV1.B, new pud(4, new tnh(R.string.notifications_disabled), Integer.valueOf(R.drawable.icon_check_round_fill)));
            return;
        }
        lq4 lq4Var = null;
        if (i == R.id.profile_block_user_confirmation_sheet_confirm) {
            dvd dvdVarV2 = v1();
            yab.i0(dvdVarV2.b, ((n0c) dvdVarV2.F()).b(), 0, new zud(dvdVarV2, lq4Var, 1), 2);
            return;
        }
        if (i == R.id.profile_clear_history_confirmation_sheet_confirm_for_yourself) {
            dvd dvdVarV3 = v1();
            zv8[] zv8VarArr = dvd.u1;
            dvdVarV3.B(false);
            return;
        }
        if (i == R.id.profile_clear_history_confirmation_sheet_confirm_for_all) {
            v1().B(true);
            return;
        }
        if (i == R.id.profile_delete_chat_with_bot_confirm_without_suspend || i == R.id.profile_delete_chat_confirmation_sheet_confirm) {
            dvd dvdVarV4 = v1();
            zv8[] zv8VarArr2 = dvd.u1;
            dvdVarV4.T(false);
            return;
        }
        if (i == R.id.profile_change_owner_chat_confirmation_sheet_confirm) {
            dvd dvdVarV5 = v1();
            Long lJ2 = dvdVarV5.p1.j();
            if (lJ2 != null) {
                long jLongValue2 = lJ2.longValue();
                ic6 ic6Var = dvdVarV5.C;
                trd.b.getClass();
                bc1.q(":profile/change-owner?chat_id=" + jLongValue2 + "&leave_chat=true", ic6Var);
                return;
            }
            return;
        }
        int i2 = 6;
        if (i == R.id.profile_leave_chat_confirmation_sheet_confirm) {
            dvd dvdVarV6 = v1();
            wjd wjdVar2 = dvdVarV6.p1;
            Long lJ3 = wjdVar2.j();
            if (lJ3 == null) {
                gm0.Y(dvd.class.getName(), "Early return in leaveChat cuz of profile.chatLocalId is null");
                return;
            }
            a8j.x(dvdVarV6.B, new hud(wjdVar2.r() ? new tnh(R.string.oneme_chat_snackbar_title_leave_channel) : new tnh(R.string.oneme_chat_snackbar_title_leave_chat), new en3(dvdVarV6, lJ3.longValue(), i2)));
            a8j.x(dvdVarV6.C, ksd.b);
            return;
        }
        if (i == R.id.profile_leave_chat_and_move_rights_confirmation_sheet_confirm) {
            long j3 = getArgs().getLong("profile:id");
            trd trdVar = trd.b;
            trdVar.getClass();
            o65.c(trdVar.b(), ":profile/change-owner?chat_id=" + j3 + "&leave_chat=true", null, null, 6);
            return;
        }
        if (i == R.id.profile_members_list_delete_from_chat_btn) {
            if (bundle != null) {
                long j4 = bundle.getLong("profile:participant_id_for_action");
                dvd dvdVarV7 = v1();
                dvdVarV7.getClass();
                a8j.x(dvdVarV7.B, new hud(new pnh(R.plurals.profile_members_list_delete_from_chat_snackbar, 1), new vud(dvdVarV7, j4, false, 1)));
                return;
            }
            return;
        }
        if (i == R.id.profile_members_list_delete_from_chat_btn_with_clean) {
            if (bundle != null) {
                long j5 = bundle.getLong("profile:participant_id_for_action");
                dvd dvdVarV8 = v1();
                dvdVarV8.getClass();
                a8j.x(dvdVarV8.B, new hud(new pnh(R.plurals.profile_members_list_delete_from_chat_snackbar, 1), new vud(dvdVarV8, j5, true, 1)));
                return;
            }
            return;
        }
        if (i == R.id.profile_change_avatar_upload_from_gallery) {
            o65.c(trd.b.b(), ":media-picker/select/photo", null, null, 6);
            return;
        }
        if (i == R.id.profile_change_avatar_upload_from_camera) {
            v1().N();
            return;
        }
        if (i == R.id.profile_delete_chat_with_bot_confirm_with_suspend) {
            v1().R();
            return;
        }
        if (i == R.id.profile_delete_channel_confirmation_sheet_confirm) {
            v1().T(true);
        } else {
            if (i != R.id.pinbars_report_and_leave_dialog_confirm || (z18Var = v1().t1) == null) {
                return;
            }
            z18Var.n(R.id.pinbars_report_and_leave_dialog_confirm);
        }
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getInsetsConfig, reason: from getter */
    public final oi8 getB() {
        return this.b;
    }

    @Override // one.me.sdk.arch.Widget
    /* JADX INFO: renamed from: getScreenDelegate */
    public final d4f getE() {
        return this.a;
    }

    @Override // defpackage.br4
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 333 && i2 == -1) {
            dvd dvdVarV1 = v1();
            lq4 lq4Var = null;
            Uri data = intent != null ? intent.getData() : null;
            dq4 dq4Var = dvdVarV1.b;
            xt4 xt4VarB = ((n0c) dvdVarV1.F()).b();
            yt4 yt4VarE = dvdVarV1.E();
            xt4VarB.getClass();
            yab.i0(dq4Var, lvb.x0(xt4VarB, yt4VarE), 0, new t20(dvdVarV1, data, lq4Var, 28), 2);
        }
    }

    @Override // defpackage.br4
    public final void onAttach(View view) {
        super.onAttach(view);
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new xc0(16, this));
        } else if (soh.c(t1().getTitle())) {
            p1(this, t1(), true);
        }
        v1().p1.w();
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) throws Exception {
        vtd vtdVar = new vtd(this, 2);
        et4 et4Var = new et4(getContext());
        et4Var.setId(R.id.profile_screen_coordinator_layout);
        et4Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        vtdVar.invoke(et4Var);
        return et4Var;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        qp4 qp4Var = this.t;
        if (qp4Var != null) {
            qp4Var.dismiss();
        }
        this.t = null;
        ValueAnimator valueAnimator = this.v;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.v = null;
    }

    @Override // defpackage.br4
    public final void onDetach(View view) {
        v1().p1.x();
    }

    @Override // defpackage.br4
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (!r1().b(i, iArr) && i == 158 && ((wsc) this.x.getValue()).c(strArr)) {
            v1().N();
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        lq4 lq4Var = null;
        int i = 0;
        int i2 = 3;
        yab.i0(getViewLifecycleScope(), null, 0, new c37(this, lq4Var, 22), 3);
        q8e q8eVar = v1().o1;
        i19 i19VarF = getViewLifecycleOwner().f();
        n09 n09Var = n09.d;
        e9i.j0(new fz6(n1g.v(q8eVar, i19VarF, n09Var), new xtd(lq4Var, this, i), i2), getViewLifecycleScope());
        int i3 = 4;
        n1g.N(new vzc(this, lq4Var, i3), view);
        lvb.j0(u1(), new dk2(i3, this));
        ll6 ll6Var = new ll6();
        zv8[] zv8VarArr = C;
        zv8 zv8Var = zv8VarArr[0];
        j8e j8eVar = this.i;
        ((rq) j8eVar.m(this, zv8Var)).a(spc.d(new oq1(ll6Var, this, i2), (rq) j8eVar.m(this, zv8VarArr[0]), getViewLifecycleOwner()));
        e9i.j0(new fz6(n1g.v(new jz(v1().n1, 13), getViewLifecycleOwner().f(), n09Var), new xtd(lq4Var, this, 1), i2), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(e9i.I(new r07(v1().K, v1().Y, new ph9(i2, lq4Var, i2), i)), getViewLifecycleOwner().f(), n09Var), new xtd(lq4Var, this, 2), i2), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(new xc3(v1().B, 27), getViewLifecycleOwner().f(), n09Var), new xtd(lq4Var, this, i2), i2), getViewLifecycleScope());
        e9i.j0(new fz6(n1g.v(v1().C, getViewLifecycleOwner().f(), n09Var), new xtd(lq4Var, this, i3), i2), getViewLifecycleScope());
    }

    @Override // defpackage.j1a
    public final void q(String str, RectF rectF, Rect rect) {
        v1().J(str, rectF);
    }

    public final void q1(String str, t59 t59Var) {
        int i;
        tnh tnhVar;
        it3.a(getContext(), y1m.a(str));
        if (it3.b()) {
            if (y1m.b(str)) {
                i = 3;
            } else {
                i = y1m.c(str) ? 2 : 1;
            }
            int iD = qt4.D(i);
            if (iD == 0) {
                tnhVar = t59Var == t59.e ? new tnh(R.string.link_mention_copied) : new tnh(R.string.link_copied);
            } else if (iD == 1) {
                tnhVar = new tnh(R.string.phone_copied);
            } else {
                if (iD != 2) {
                    ore.o();
                    return;
                }
                tnhVar = new tnh(R.string.mail_copied);
            }
            h8c h8cVar = new h8c(this);
            h8cVar.m(tnhVar);
            h8cVar.h(new w8c(R.drawable.icon_copy_fill));
            h8cVar.p();
        }
    }

    public final xu1 r1() {
        return (xu1) this.h.getValue();
    }

    public final TextView s1() {
        return (TextView) this.n.m(this, C[5]);
    }

    public final rcc t1() {
        return (rcc) this.k.m(this, C[2]);
    }

    public final k96 u1() {
        return (k96) this.j.m(this, C[1]);
    }

    public final dvd v1() {
        return (dvd) this.g.getValue();
    }

    @Override // defpackage.ubf
    public final Object z0(lq4 lq4Var) {
        return v1().O(lq4Var);
    }

    public ProfileScreen(long j, kmd kmdVar, boolean z, ha9 ha9Var) {
        this(n1g.i(new ylc("profile:id", Long.valueOf(j)), new ylc("profile:id_type", kmdVar), new ylc("profile:opened_from_dialog", Boolean.valueOf(z)), new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))));
    }
}
