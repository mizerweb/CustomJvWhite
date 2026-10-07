package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import one.me.chatscreen.mediabar.SelectedMediaBottomBarWidget;
import one.me.chatscreen.videomsg.VideoMessageWidget;
import one.me.messages.list.ui.view.WarningLinkBottomSheet;
import one.me.sdk.messagewrite.mention.SuggestionsWidget;
import one.me.settings.twofa.creation.TwoFACreationScreen;
import one.me.settings.twofa.creation.onboarding.TwoFAOnboardingScreen;
import one.me.settings.twofa.password.TwoFACheckPassScreen;
import one.me.settings.twofa.restore.TwoFAStartRestoreScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class nff extends mdh implements tf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nff(Object obj, lq4 lq4Var, int i) {
        super(3, lq4Var);
        this.e = i;
        this.g = obj;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                nff nffVar = new nff((SelectedMediaBottomBarWidget) this.g, (lq4) obj3, 0);
                nffVar.f = (LinearLayout) obj;
                nffVar.invokeSuspend(sbiVar);
                return sbiVar;
            case 1:
                nff nffVar2 = new nff(3, (lq4) obj3, 1);
                nffVar2.f = (List) obj;
                nffVar2.g = (Map) obj2;
                return nffVar2.invokeSuspend(sbiVar);
            case 2:
                nff nffVar3 = new nff((j1g) this.g, (lq4) obj3, 2);
                nffVar3.f = (kbc) obj2;
                nffVar3.invokeSuspend(sbiVar);
                return sbiVar;
            case 3:
                nff nffVar4 = new nff(3, (lq4) obj3, 3);
                nffVar4.f = (cs) obj;
                nffVar4.g = (kbc) obj2;
                nffVar4.invokeSuspend(sbiVar);
                return sbiVar;
            case 4:
                nff nffVar5 = new nff((SuggestionsWidget) this.g, (lq4) obj3, 4);
                nffVar5.f = (kbc) obj2;
                nffVar5.invokeSuspend(sbiVar);
                return sbiVar;
            case 5:
                nff nffVar6 = new nff(3, (lq4) obj3, 5);
                nffVar6.f = (u8b) obj;
                nffVar6.g = (String) obj2;
                return nffVar6.invokeSuspend(sbiVar);
            case 6:
                nff nffVar7 = new nff((TwoFACheckPassScreen) this.g, (lq4) obj3, 6);
                nffVar7.f = (kbc) obj2;
                nffVar7.invokeSuspend(sbiVar);
                return sbiVar;
            case 7:
                nff nffVar8 = new nff((TwoFACreationScreen) this.g, (lq4) obj3, 7);
                nffVar8.f = (kbc) obj2;
                nffVar8.invokeSuspend(sbiVar);
                return sbiVar;
            case 8:
                nff nffVar9 = new nff((TwoFAOnboardingScreen) this.g, (lq4) obj3, 8);
                nffVar9.f = (kbc) obj2;
                nffVar9.invokeSuspend(sbiVar);
                return sbiVar;
            case 9:
                nff nffVar10 = new nff((TwoFAStartRestoreScreen) this.g, (lq4) obj3, 9);
                nffVar10.f = (kbc) obj2;
                nffVar10.invokeSuspend(sbiVar);
                return sbiVar;
            case 10:
                nff nffVar11 = new nff((cyi) this.g, (lq4) obj3, 10);
                nffVar11.f = (FrameLayout) obj;
                nffVar11.invokeSuspend(sbiVar);
                return sbiVar;
            case 11:
                nff nffVar12 = new nff((VideoMessageWidget) this.g, (lq4) obj3, 11);
                nffVar12.f = (TextView) obj;
                nffVar12.invokeSuspend(sbiVar);
                return sbiVar;
            case 12:
                nff nffVar13 = new nff((WarningLinkBottomSheet) this.g, (lq4) obj3, 12);
                nffVar13.f = (LinearLayout) obj;
                nffVar13.invokeSuspend(sbiVar);
                return sbiVar;
            default:
                nff nffVar14 = new nff((ycj) this.g, (lq4) obj3, 13);
                nffVar14.f = (kbc) obj2;
                nffVar14.invokeSuspend(sbiVar);
                return sbiVar;
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Integer numC;
        int i = this.e;
        a8g a8gVar = pq3.j;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                LinearLayout linearLayout = (LinearLayout) this.f;
                ch3.d0(obj);
                SelectedMediaBottomBarWidget selectedMediaBottomBarWidget = (SelectedMediaBottomBarWidget) this.g;
                zv8[] zv8VarArr = SelectedMediaBottomBarWidget.C;
                linearLayout.setBackgroundColor(selectedMediaBottomBarWidget.o1().p().b);
                return sbiVar;
            case 1:
                List list = (List) this.f;
                Map map = (Map) this.g;
                ch3.d0(obj);
                if (map.isEmpty()) {
                    return list;
                }
                List<Object> list2 = list;
                ArrayList arrayList = new ArrayList(yw3.W0(list2, 10));
                for (Object objI : list2) {
                    if (objI instanceof ctf) {
                        ctf ctfVar = (ctf) objI;
                        ha9 ha9VarA = ypl.a(ctfVar.a);
                        if (ha9VarA != null) {
                            Integer num = (Integer) map.get(ha9VarA);
                            Integer num2 = new Integer(num != null ? num.intValue() : 0);
                            if (num2.intValue() <= 0) {
                                num2 = null;
                            }
                            objI = ctf.i(ctfVar, null, null, num2 != null ? new dsf(num2.intValue(), 4) : null, 1791);
                        }
                    }
                    arrayList.add(objI);
                }
                return arrayList;
            case 2:
                kbc kbcVar = (kbc) this.f;
                ch3.d0(obj);
                j1g j1gVar = (j1g) this.g;
                j1gVar.B.setBackgroundColor(kbcVar.b().b);
                j1gVar.v.setTextColor(kbcVar.getText().e);
                zr zrVar = j1gVar.w;
                zrVar.setTextColor(kbcVar.getText().b);
                zrVar.setHintTextColor(kbcVar.getText().c);
                j1gVar.x.setTextColor(kbcVar.getText().h);
                j1gVar.D.setTextColor(kbcVar.getText().c);
                fql fqlVar = j1gVar.u;
                if (fqlVar != null && (numC = fqlVar.c()) != null) {
                    j1gVar.C.setTextColor(oc9.Z(numC.intValue(), kbcVar));
                }
                Drawable drawable = j1gVar.A.getDrawable();
                if (drawable != null) {
                    sb8.m0(kbcVar.getIcon().b, drawable);
                }
                return sbiVar;
            case 3:
                cs csVar = (cs) this.f;
                kbc kbcVar2 = (kbc) this.g;
                ch3.d0(obj);
                csVar.setImageTintList(ColorStateList.valueOf(kbcVar2.getIcon().d));
                return sbiVar;
            case 4:
                kbc kbcVar3 = (kbc) this.f;
                ch3.d0(obj);
                SuggestionsWidget suggestionsWidget = (SuggestionsWidget) this.g;
                zv8[] zv8VarArr2 = SuggestionsWidget.F;
                suggestionsWidget.G1().setTextColor(kbcVar3.getText().c);
                suggestionsWidget.F1().setBackgroundColor(kbcVar3.getIcon().e);
                suggestionsWidget.E1().setImageTintList(ColorStateList.valueOf(kbcVar3.getIcon().b));
                ow0 ow0Var = suggestionsWidget.v;
                zv8 zv8Var = SuggestionsWidget.F[7];
                ((AppCompatTextView) ow0Var.getValue()).setTextColor(kbcVar3.getText().b);
                return sbiVar;
            case 5:
                u8b u8bVar = (u8b) this.f;
                String str = (String) this.g;
                ch3.d0(obj);
                u8b u8bVar2 = new u8b();
                Object[] objArr = u8bVar.a;
                int i2 = u8bVar.b;
                for (int i3 = 0; i3 < i2; i3++) {
                    aoh aohVar = (aoh) objArr[i3];
                    u8bVar2.b(new zl0(cqk.d(aohVar.getName(), str), aohVar.a()));
                }
                return u8bVar2;
            case 6:
                kbc kbcVar4 = (kbc) this.f;
                ch3.d0(obj);
                TwoFACheckPassScreen twoFACheckPassScreen = (TwoFACheckPassScreen) this.g;
                zv8[] zv8VarArr3 = TwoFACheckPassScreen.n;
                View view = twoFACheckPassScreen.getView();
                if (view != null) {
                    view.setBackgroundColor(kbcVar4.b().c);
                }
                b9i b9iVar = (b9i) twoFACheckPassScreen.findViewById(R.id.oneme_settings_twofa_onboarding_content);
                if (b9iVar != null) {
                    b9iVar.onThemeChanged(kbcVar4);
                }
                return sbiVar;
            case 7:
                kbc kbcVar5 = (kbc) this.f;
                ch3.d0(obj);
                TwoFACreationScreen twoFACreationScreen = (TwoFACreationScreen) this.g;
                zv8[] zv8VarArr4 = TwoFACreationScreen.n;
                View view2 = twoFACreationScreen.getView();
                if (view2 != null) {
                    view2.setBackgroundColor(kbcVar5.b().c);
                }
                b9i b9iVar2 = (b9i) twoFACreationScreen.findViewById(R.id.oneme_settings_twofa_onboarding_content);
                if (b9iVar2 != null) {
                    b9iVar2.onThemeChanged(kbcVar5);
                }
                if (twoFACreationScreen.p1() == v6i.b) {
                    ((TextView) twoFACreationScreen.l.m(twoFACreationScreen, TwoFACreationScreen.n[3])).setTextColor(kbcVar5.getText().d);
                }
                return sbiVar;
            case 8:
                kbc kbcVar6 = (kbc) this.f;
                ch3.d0(obj);
                TwoFAOnboardingScreen twoFAOnboardingScreen = (TwoFAOnboardingScreen) this.g;
                zv8[] zv8VarArr5 = TwoFAOnboardingScreen.g;
                View view3 = twoFAOnboardingScreen.getView();
                if (view3 != null) {
                    view3.setBackgroundColor(kbcVar6.b().c);
                }
                TextView textView = (TextView) twoFAOnboardingScreen.findViewById(R.id.oneme_settings_twofa_onboarding_title);
                if (textView != null) {
                    textView.setTextColor(kbcVar6.getText().b);
                }
                TextView textView2 = (TextView) twoFAOnboardingScreen.findViewById(R.id.oneme_settings_twofa_onboarding_subtitle);
                if (textView2 != null) {
                    textView2.setTextColor(kbcVar6.getText().d);
                }
                return sbiVar;
            case 9:
                kbc kbcVar7 = (kbc) this.f;
                ch3.d0(obj);
                TwoFAStartRestoreScreen twoFAStartRestoreScreen = (TwoFAStartRestoreScreen) this.g;
                zv8[] zv8VarArr6 = TwoFAStartRestoreScreen.j;
                View view4 = twoFAStartRestoreScreen.getView();
                if (view4 != null) {
                    view4.setBackgroundColor(kbcVar7.b().c);
                }
                b9i b9iVar3 = (b9i) twoFAStartRestoreScreen.findViewById(R.id.oneme_settings_twofa_onboarding_content);
                if (b9iVar3 != null) {
                    b9iVar3.onThemeChanged(kbcVar7);
                }
                ((TextView) twoFAStartRestoreScreen.h.m(twoFAStartRestoreScreen, TwoFAStartRestoreScreen.j[1])).setTextColor(kbcVar7.getText().d);
                return sbiVar;
            case 10:
                FrameLayout frameLayout = (FrameLayout) this.f;
                ch3.d0(obj);
                sz0 sz0Var = new sz0(frameLayout.getContext(), a8gVar.e(frameLayout.getContext()).n() ? -1558898145 : -1543503873, 10.0f, false);
                cyi cyiVar = (cyi) this.g;
                sz0Var.i = new n2j(cyiVar, 0);
                sz0Var.j = new n2j(cyiVar, 1);
                frameLayout.setBackground(sz0Var);
                return sbiVar;
            case 11:
                TextView textView3 = (TextView) this.f;
                ch3.d0(obj);
                a8gVar.h(textView3);
                textView3.setTextColor(-1);
                GradientDrawable gradientDrawable = (GradientDrawable) textView3.getBackground();
                VideoMessageWidget videoMessageWidget = (VideoMessageWidget) this.g;
                zv8[] zv8VarArr7 = VideoMessageWidget.B;
                gradientDrawable.setColor(a8gVar.h(textView3).b().g);
                sb8.m0(a8gVar.h(textView3).h().d, (InsetDrawable) videoMessageWidget.u.getValue());
                return sbiVar;
            case 12:
                LinearLayout linearLayout2 = (LinearLayout) this.f;
                ch3.d0(obj);
                WarningLinkBottomSheet warningLinkBottomSheet = (WarningLinkBottomSheet) this.g;
                j8e j8eVar = warningLinkBottomSheet.z;
                zv8[] zv8VarArr8 = WarningLinkBottomSheet.C;
                ((TextView) j8eVar.m(warningLinkBottomSheet, zv8VarArr8[0])).setTextColor(a8gVar.h(linearLayout2).getText().b);
                ((TextView) warningLinkBottomSheet.A.m(warningLinkBottomSheet, zv8VarArr8[1])).setTextColor(a8gVar.h(linearLayout2).getText().d);
                return sbiVar;
            default:
                kbc kbcVar8 = (kbc) this.f;
                ch3.d0(obj);
                ycj ycjVar = (ycj) this.g;
                Drawable pauseSmallIcon = ycjVar.getPauseSmallIcon();
                kbcVar8.getIcon();
                sb8.m0(-1, pauseSmallIcon);
                sb8.m0(-1, ycjVar.getPlayIcon());
                return sbiVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nff(int i, lq4 lq4Var, int i2) {
        super(i, lq4Var);
        this.e = i2;
    }
}
