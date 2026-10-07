package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.LinearLayout;
import android.widget.TextView;
import one.me.inviteactions.invitefriendsbottomsheet.InviteFriendsToMaxBottomSheet;
import one.me.rlottie.RLottieImageView;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class om8 extends mdh implements tf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ om8(Object obj, Object obj2, Object obj3, lq4 lq4Var, int i) {
        super(3, lq4Var);
        this.e = i;
        this.h = obj;
        this.i = obj2;
        this.j = obj3;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        Object obj4 = this.j;
        Object obj5 = this.i;
        Object obj6 = this.h;
        switch (i) {
            case 0:
                om8 om8Var = new om8((TextView) obj6, (InviteFriendsToMaxBottomSheet) obj5, (RLottieImageView) obj4, (lq4) obj3, 0);
                om8Var.f = (pm8) obj;
                om8Var.g = (kbc) obj2;
                om8Var.invokeSuspend(sbiVar);
                return sbiVar;
            case 1:
                om8 om8Var2 = new om8((gpi) obj6, (p4c) obj5, (Context) obj4, (lq4) obj3, 1);
                om8Var2.f = (vg4) obj;
                om8Var2.g = (lsg) obj2;
                return om8Var2.invokeSuspend(sbiVar);
            default:
                om8 om8Var3 = new om8((TextView) obj6, (TextView) obj5, (Drawable) obj4, (lq4) obj3, 2);
                om8Var3.f = (LinearLayout) obj;
                om8Var3.g = (kbc) obj2;
                om8Var3.invokeSuspend(sbiVar);
                return sbiVar;
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        ynh xnhVar;
        String string;
        int i = this.e;
        sbi sbiVar = sbi.a;
        Object obj2 = this.j;
        Object obj3 = this.i;
        Object obj4 = this.h;
        switch (i) {
            case 0:
                RLottieImageView rLottieImageView = (RLottieImageView) obj2;
                pm8 pm8Var = (pm8) this.f;
                kbc kbcVar = (kbc) this.g;
                ch3.d0(obj);
                ((TextView) obj4).setTextColor(kbcVar.getText().b);
                Context context = pm8Var.getContext();
                a8g a8gVar = pq3.j;
                a8gVar.e(context).m();
                InviteFriendsToMaxBottomSheet inviteFriendsToMaxBottomSheet = (InviteFriendsToMaxBottomSheet) obj3;
                vv vvVar = inviteFriendsToMaxBottomSheet.C;
                zv8 zv8Var = InviteFriendsToMaxBottomSheet.D[1];
                if (!cqk.d((String) vvVar.a(inviteFriendsToMaxBottomSheet), a8gVar.e(pm8Var.getContext()).m().getName())) {
                    ((mm8) inviteFriendsToMaxBottomSheet.A.getValue()).B(inviteFriendsToMaxBottomSheet.G1(), false, inviteFriendsToMaxBottomSheet.z);
                    inviteFriendsToMaxBottomSheet.F1(rLottieImageView, true);
                    rLottieImageView.playAnimation();
                }
                return sbiVar;
            case 1:
                vg4 vg4Var = (vg4) this.f;
                lsg lsgVar = (lsg) this.g;
                ch3.d0(obj);
                gpi gpiVar = (gpi) obj4;
                px8 px8Var = gpi.B1;
                if (gpiVar.D()) {
                    xnhVar = new tnh(R.string.oneme_stories_your_story_title);
                } else {
                    CharSequence charSequenceT = vg4Var.t((p4c) obj3);
                    if (charSequenceT == null) {
                        charSequenceT = "";
                    }
                    xnhVar = new xnh(charSequenceT);
                }
                v1h v1hVar = null;
                if (lsgVar != null) {
                    Context context2 = (Context) obj2;
                    long jF = ((s7f) gpiVar.h).f();
                    int i2 = ksg.$EnumSwitchMapping$0[qt4.D(lsgVar.a())];
                    if (i2 == 1) {
                        string = context2.getString(R.string.oneme_stories_draft_preparing);
                    } else if (i2 == 2) {
                        string = context2.getString(R.string.oneme_stories_draft_uploading);
                    } else if (i2 == 3) {
                        string = context2.getString(R.string.oneme_stories_draft_failed);
                    } else {
                        if (i2 != 4) {
                            ore.o();
                            return null;
                        }
                        long jI = jF - lsgVar.i();
                        int i3 = (int) (jI / 60000);
                        if (i3 < 1) {
                            string = context2.getString(R.string.tt_dates_right_now);
                        } else if (i3 < 60) {
                            String[] strArr = woh.b;
                            string = String.format(context2.getResources().getQuantityString(R.plurals.tt_dates_minutes_past, i3), Integer.valueOf(i3));
                        } else {
                            int i4 = (int) (jI / 3600000);
                            String[] strArr2 = woh.b;
                            string = String.format(context2.getResources().getQuantityString(R.plurals.tt_dates_hours_past, i4), Integer.valueOf(i4));
                        }
                    }
                } else {
                    string = null;
                }
                String str = string == null ? "" : string;
                String strX = vg4Var.x(gm0.K(40.0f * yl5.d().getDisplayMetrics().density));
                String string2 = (strX != null ? strX : "").toString();
                tj0 tj0VarA = gm0.a(vg4Var.u(), new Long(vg4Var.v()));
                boolean zD = gpiVar.D();
                if ((lsgVar == null || !lsgVar.e()) && lsgVar != null) {
                    v1hVar = new v1h(lsgVar.b());
                }
                return new ptg(xnhVar, str, string2, tj0VarA, zD, v1hVar);
            default:
                LinearLayout linearLayout = (LinearLayout) this.f;
                kbc kbcVar2 = (kbc) this.g;
                ch3.d0(obj);
                linearLayout.setBackgroundColor(kbcVar2.b().f);
                ((TextView) obj4).setTextColor(kbcVar2.getText().b);
                ((TextView) obj3).setTextColor(kbcVar2.getText().d);
                ((Drawable) obj2).setTint(kbcVar2.getIcon().e);
                return sbiVar;
        }
    }
}
