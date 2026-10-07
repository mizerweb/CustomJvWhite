package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.ArrayList;
import java.util.List;
import one.me.chatscreen.videomsg.VideoMessageWidget;
import one.me.pinbars.PinBarsWidget;
import one.me.profile.ProfileScreen;
import one.me.profileedit.ProfileEditScreen;
import one.me.sdk.messagewrite.mention.SuggestionsWidget;
import one.me.startconversation.StartConversationScreen;
import ru.ok.android.externcalls.sdk.feature.ConversationFeatureManager;
import ru.ok.android.externcalls.sdk.feature.roles.FeatureRoles;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class vzc extends mdh implements tf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vzc(TextView textView, TextView textView2, lq4 lq4Var) {
        super(3, lq4Var);
        this.e = 2;
        this.f = textView;
        this.g = textView2;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        Object obj4 = this.g;
        switch (i) {
            case 0:
                vzc vzcVar = new vzc((PinBarsWidget) obj4, (lq4) obj3, 0);
                vzcVar.h = (nza) obj;
                vzcVar.f = (kbc) obj2;
                vzcVar.invokeSuspend(sbiVar);
                return sbiVar;
            case 1:
                vzc vzcVar2 = new vzc((PinBarsWidget) obj4, (lq4) obj3, 1);
                vzcVar2.h = (gci) obj;
                vzcVar2.f = (kbc) obj2;
                vzcVar2.invokeSuspend(sbiVar);
                return sbiVar;
            case 2:
                vzc vzcVar3 = new vzc((TextView) this.f, (TextView) obj4, (lq4) obj3);
                vzcVar3.h = (LinearLayout) obj;
                vzcVar3.invokeSuspend(sbiVar);
                return sbiVar;
            case 3:
                vzc vzcVar4 = new vzc((ProfileEditScreen) obj4, (lq4) obj3, 3);
                vzcVar4.h = (et4) obj;
                vzcVar4.f = (kbc) obj2;
                vzcVar4.invokeSuspend(sbiVar);
                return sbiVar;
            case 4:
                vzc vzcVar5 = new vzc((ProfileScreen) obj4, (lq4) obj3, 4);
                vzcVar5.h = (View) obj;
                vzcVar5.f = (kbc) obj2;
                vzcVar5.invokeSuspend(sbiVar);
                return sbiVar;
            case 5:
                vzc vzcVar6 = new vzc((kde) obj4, (lq4) obj3, 5);
                vzcVar6.h = (ty1) obj;
                vzcVar6.f = (Long) obj2;
                return vzcVar6.invokeSuspend(sbiVar);
            case 6:
                vzc vzcVar7 = new vzc((kde) obj4, (lq4) obj3, 6);
                vzcVar7.h = (enc) obj;
                vzcVar7.f = (t4f) obj2;
                return vzcVar7.invokeSuspend(sbiVar);
            case 7:
                vzc vzcVar8 = new vzc((cf7) obj4, (lq4) obj3, 7);
                vzcVar8.h = (AppCompatTextView) obj;
                vzcVar8.f = (kbc) obj2;
                vzcVar8.invokeSuspend(sbiVar);
                return sbiVar;
            case 8:
                vzc vzcVar9 = new vzc((kaf) obj4, (lq4) obj3, 8);
                vzcVar9.h = (TextView) obj;
                vzcVar9.f = (kbc) obj2;
                vzcVar9.invokeSuspend(sbiVar);
                return sbiVar;
            case 9:
                vzc vzcVar10 = new vzc((gqd) obj4, (lq4) obj3, 9);
                vzcVar10.h = (TextView) obj;
                vzcVar10.f = (kbc) obj2;
                vzcVar10.invokeSuspend(sbiVar);
                return sbiVar;
            case 10:
                vzc vzcVar11 = new vzc((jdf) obj4, (lq4) obj3, 10);
                vzcVar11.h = (List) obj;
                vzcVar11.f = (nh7) obj2;
                return vzcVar11.invokeSuspend(sbiVar);
            case 11:
                vzc vzcVar12 = new vzc((euf) obj4, (lq4) obj3, 11);
                vzcVar12.h = (vf0) obj;
                vzcVar12.f = (List) obj2;
                return vzcVar12.invokeSuspend(sbiVar);
            case 12:
                vzc vzcVar13 = new vzc((StartConversationScreen) obj4, (lq4) obj3, 12);
                vzcVar13.h = (vj4) obj;
                vzcVar13.f = (List) obj2;
                vzcVar13.invokeSuspend(sbiVar);
                return sbiVar;
            case 13:
                vzc vzcVar14 = new vzc((kbc) obj4, (lq4) obj3, 13);
                vzcVar14.h = (TextView) obj;
                vzcVar14.f = (kbc) obj2;
                vzcVar14.invokeSuspend(sbiVar);
                return sbiVar;
            case 14:
                vzc vzcVar15 = new vzc((SuggestionsWidget) obj4, (lq4) obj3, 14);
                vzcVar15.h = (FrameLayout) obj;
                vzcVar15.f = (kbc) obj2;
                vzcVar15.invokeSuspend(sbiVar);
                return sbiVar;
            case 15:
                vzc vzcVar16 = new vzc((SuggestionsWidget) obj4, (lq4) obj3, 15);
                vzcVar16.h = (AppCompatTextView) obj;
                vzcVar16.f = (kbc) obj2;
                vzcVar16.invokeSuspend(sbiVar);
                return sbiVar;
            case 16:
                vzc vzcVar17 = new vzc((SuggestionsWidget) obj4, (lq4) obj3, 16);
                vzcVar17.h = (wf4) obj;
                vzcVar17.f = (kbc) obj2;
                vzcVar17.invokeSuspend(sbiVar);
                return sbiVar;
            default:
                vzc vzcVar18 = new vzc((VideoMessageWidget) obj4, (lq4) obj3, 17);
                vzcVar18.h = (ImageView) obj;
                vzcVar18.f = (kbc) obj2;
                vzcVar18.invokeSuspend(sbiVar);
                return sbiVar;
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        bbf bbfVar;
        CharSequence charSequenceO1;
        int i = this.e;
        a8g a8gVar = pq3.j;
        Object obj2 = null;
        sbi sbiVar = sbi.a;
        Object obj3 = this.g;
        switch (i) {
            case 0:
                nza nzaVar = (nza) this.h;
                kbc kbcVar = (kbc) this.f;
                ch3.d0(obj);
                PinBarsWidget pinBarsWidget = (PinBarsWidget) obj3;
                PinBarsWidget.o1(pinBarsWidget, nzaVar.getBackground(), ((fn8) kbcVar.u().c.b).c);
                if (((kzc) pinBarsWidget.f.getValue()).d == null) {
                    Drawable background = nzaVar.getBackground();
                    RippleDrawable rippleDrawable = background instanceof RippleDrawable ? (RippleDrawable) background : null;
                    Drawable drawable = rippleDrawable != null ? rippleDrawable.getDrawable(0) : null;
                    ColorDrawable colorDrawable = drawable instanceof ColorDrawable ? (ColorDrawable) drawable : null;
                    if (colorDrawable != null) {
                        colorDrawable.setColor(kbcVar.b().d);
                    }
                }
                return sbiVar;
            case 1:
                gci gciVar = (gci) this.h;
                kbc kbcVar2 = (kbc) this.f;
                ch3.d0(obj);
                PinBarsWidget.o1((PinBarsWidget) obj3, gciVar.getBackground(), ((fn8) kbcVar2.u().c.b).c);
                return sbiVar;
            case 2:
                LinearLayout linearLayout = (LinearLayout) this.h;
                ch3.d0(obj);
                ((TextView) this.f).setTextColor(a8gVar.e(linearLayout.getContext()).m().getText().b);
                ((TextView) obj3).setTextColor(a8gVar.e(linearLayout.getContext()).m().getText().d);
                return sbiVar;
            case 3:
                et4 et4Var = (et4) this.h;
                kbc kbcVar3 = (kbc) this.f;
                ch3.d0(obj);
                et4Var.setBackgroundColor(kbcVar3.b().b);
                ProfileEditScreen.p1((ProfileEditScreen) obj3, kbcVar3);
                return sbiVar;
            case 4:
                View view = (View) this.h;
                kbc kbcVar4 = (kbc) this.f;
                ch3.d0(obj);
                view.setBackgroundColor(kbcVar4.b().b);
                ProfileScreen profileScreen = (ProfileScreen) obj3;
                ku8 ku8Var = ProfileScreen.B;
                profileScreen.s1().setTextColor(kbcVar4.getText().b);
                ((TextView) profileScreen.o.m(profileScreen, ProfileScreen.C[6])).setTextColor(kbcVar4.getText().d);
                return sbiVar;
            case 5:
                ty1 ty1Var = (ty1) this.h;
                Long l = (Long) this.f;
                ch3.d0(obj);
                p32 p32Var = (p32) ((kde) obj3).h.getValue();
                p32Var.getClass();
                String strE = p32.e(l);
                if (ty1Var.c) {
                    return ty1Var.a ? strE : p32Var.a.getString(R.string.call_screen_record_user_description_with_duration, ty1Var.f, strE);
                }
                return null;
            case 6:
                enc encVar = (enc) this.h;
                t4f t4fVar = (t4f) this.f;
                ch3.d0(obj);
                tmc tmcVar = encVar.a;
                ConversationFeatureManager conversationFeatureManagerI = ((ya1) ((da1) ((kde) obj3).i.getValue())).i();
                return kpk.d(t4fVar, tmcVar, !((conversationFeatureManagerI != null ? conversationFeatureManagerI.getFeatureRoles(oi1.b) : null) instanceof FeatureRoles.EnabledForAll));
            case 7:
                AppCompatTextView appCompatTextView = (AppCompatTextView) this.h;
                kbc kbcVar5 = (kbc) this.f;
                ch3.d0(obj);
                appCompatTextView.setTextColor(((Number) ((cf7) obj3).invoke(kbcVar5)).intValue());
                return sbiVar;
            case 8:
                TextView textView = (TextView) this.h;
                kbc kbcVar6 = (kbc) this.f;
                ch3.d0(obj);
                textView.setTextColor(((Number) ((kaf) obj3).b.invoke(kbcVar6)).intValue());
                return sbiVar;
            case 9:
                TextView textView2 = (TextView) this.h;
                kbc kbcVar7 = (kbc) this.f;
                ch3.d0(obj);
                textView2.setTextColor(((Number) ((gqd) obj3).b.invoke(kbcVar7)).intValue());
                return sbiVar;
            case 10:
                List list = (List) this.h;
                nh7 nh7Var = (nh7) this.f;
                ch3.d0(obj);
                if (nh7Var != null) {
                    return nh7Var;
                }
                jdf jdfVar = (jdf) obj3;
                for (Object obj4 : list) {
                    if (cqk.d(((nh7) obj4).a, jdfVar.d.c)) {
                        obj2 = obj4;
                        return (nh7) obj2;
                    }
                }
                return (nh7) obj2;
            case 11:
                vf0 vf0Var = (vf0) this.h;
                List list2 = (List) this.f;
                ch3.d0(obj);
                zv8[] zv8VarArr = euf.z;
                if (cqk.d(vf0Var, uf0.a) || cqk.d(vf0Var, tf0.a)) {
                    bbfVar = null;
                } else {
                    boolean zD = cqk.d(vf0Var, sf0.a);
                    fsf fsfVar = fsf.a;
                    if (zD) {
                        bbfVar = new bbf(4, new tnh(R.string.oneme_settings_media_autosave_gallery_banner_title), 3, w7c.f, (osf) null, new tnh(R.string.oneme_settings_media_autosave_banner_description), fsfVar, (bz8) null, 144);
                    } else {
                        if (!cqk.d(vf0Var, rf0.a)) {
                            ore.o();
                            return null;
                        }
                        bbfVar = new bbf(4, new tnh(R.string.oneme_settings_media_autosave_storage_banner_title), 3, w7c.j, (osf) null, new tnh(R.string.oneme_settings_media_autosave_banner_description), fsfVar, (bz8) null, 144);
                    }
                }
                if (vf0Var instanceof sf0) {
                    isf isfVar = new isf(new tnh(R.string.oneme_settings_media_autosave_status_none), null);
                    List<ebf> list3 = list2;
                    ArrayList arrayList = new ArrayList(yw3.W0(list3, 10));
                    for (ebf bbfVar2 : list3) {
                        if (bbfVar2 instanceof bbf) {
                            qf0.d.getClass();
                            bbf bbfVar3 = (bbf) bbfVar2;
                            if (qf0.e.contains(Integer.valueOf((int) bbfVar3.d))) {
                                bbfVar2 = new bbf(bbfVar3.a, bbfVar3.b, bbfVar3.c, bbfVar3.d, bbfVar3.e, bbfVar3.f, isfVar, bbfVar3.h, bbfVar3.i);
                            }
                        }
                        arrayList.add(bbfVar2);
                    }
                    list2 = arrayList;
                }
                return new ylc(bbfVar, list2);
            case 12:
                vj4 vj4Var = (vj4) this.h;
                List list4 = (List) this.f;
                ch3.d0(obj);
                StartConversationScreen startConversationScreen = (StartConversationScreen) obj3;
                pk6 pk6Var = startConversationScreen.v;
                zv8[] zv8VarArr2 = StartConversationScreen.A;
                CharSequence charSequenceO2 = startConversationScreen.o1();
                if (charSequenceO2 == null || charSequenceO2.length() == 0) {
                    startConversationScreen.s.H(vj4Var.a);
                    lp0 lp0Var = startConversationScreen.t;
                    r66 r66Var = r66.a;
                    lp0Var.H(r66Var);
                    startConversationScreen.u.H(vj4Var.c);
                    if (pk6Var.l() == 0 && ((charSequenceO1 = startConversationScreen.o1()) == null || charSequenceO1.length() == 0)) {
                        pk6Var.H(ch3.j(xw3.P0(ll8.a, ll8.b)));
                    }
                    lp0 lp0Var2 = startConversationScreen.r;
                    if (vj4Var == vj4.d) {
                        lp0Var2.H(r66Var);
                    } else {
                        lp0Var2.H(list4);
                    }
                }
                return sbiVar;
            case 13:
                TextView textView3 = (TextView) this.h;
                kbc kbcVar8 = (kbc) this.f;
                ch3.d0(obj);
                kbc kbcVar9 = (kbc) obj3;
                if (kbcVar9 != null) {
                    kbcVar8 = kbcVar9;
                }
                textView3.setBackgroundColor(kbcVar8.h().b);
                textView3.setTextColor(kbcVar8.getText().d);
                int i2 = kbcVar8.getIcon().d;
                ArrayList arrayList2 = soh.a;
                textView3.setCompoundDrawableTintList(ColorStateList.valueOf(i2));
                return sbiVar;
            case 14:
                FrameLayout frameLayout = (FrameLayout) this.h;
                kbc kbcVar10 = (kbc) this.f;
                ch3.d0(obj);
                kbc kbcVarT1 = ((SuggestionsWidget) obj3).t1();
                if (kbcVarT1 != null) {
                    kbcVar10 = kbcVarT1;
                }
                frameLayout.setBackgroundColor(kbcVar10.getIcon().e);
                return sbiVar;
            case 15:
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) this.h;
                kbc kbcVar11 = (kbc) this.f;
                ch3.d0(obj);
                kbc kbcVarT2 = ((SuggestionsWidget) obj3).t1();
                if (kbcVarT2 != null) {
                    kbcVar11 = kbcVarT2;
                }
                appCompatTextView2.setTextColor(kbcVar11.getText().c);
                return sbiVar;
            case 16:
                wf4 wf4Var = (wf4) this.h;
                kbc kbcVar12 = (kbc) this.f;
                ch3.d0(obj);
                kbc kbcVarT3 = ((SuggestionsWidget) obj3).t1();
                if (kbcVarT3 != null) {
                    kbcVar12 = kbcVarT3;
                }
                wf4Var.setBackgroundColor(kbcVar12.k().b);
                return sbiVar;
            default:
                ImageView imageView = (ImageView) this.h;
                kbc kbcVar13 = (kbc) this.f;
                ch3.d0(obj);
                int i3 = ((fn8) kbcVar13.u().c.b).c;
                ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                Paint paint = shapeDrawable.getPaint();
                zv8[] zv8VarArr3 = VideoMessageWidget.B;
                paint.setColor(a8gVar.h(imageView).b().g);
                imageView.setBackground(col.c(i3, shapeDrawable, null, 4));
                imageView.setImageTintList(ColorStateList.valueOf(-1));
                return sbiVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vzc(Object obj, lq4 lq4Var, int i) {
        super(3, lq4Var);
        this.e = i;
        this.g = obj;
    }
}
