package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.TimeoutCancellationException;
import one.me.chatscreen.mediabar.SelectedMediaBottomBarWidget;
import one.me.chatscreen.search.SearchMessageBottomWidget;
import one.me.login.restrict.RestrictLoginScreen;
import one.me.profile.RknBottomSheet;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;
import one.me.settings.twofa.restore.ProfileDeletionInfoScreen;
import org.apache.http.conn.params.ConnManagerParams;
import ru.ok.tamtam.errors.TamErrorException;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class vqa extends mdh implements tf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vqa(Object obj, lq4 lq4Var, int i) {
        super(3, lq4Var);
        this.e = i;
        this.g = obj;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) throws Throwable {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                vqa vqaVar = new vqa(3, (lq4) obj3, 0);
                vqaVar.f = (rt2) obj;
                vqaVar.g = (opa) obj2;
                return vqaVar.invokeSuspend(sbiVar);
            case 1:
                vqa vqaVar2 = new vqa((jsa) this.g, (lq4) obj3, 1);
                vqaVar2.f = (Throwable) obj2;
                vqaVar2.invokeSuspend(sbiVar);
                return sbiVar;
            case 2:
                vqa vqaVar3 = new vqa(3, (lq4) obj3, 2);
                vqaVar3.f = (wv7) obj;
                vqaVar3.g = (kbc) obj2;
                vqaVar3.invokeSuspend(sbiVar);
                return sbiVar;
            case 3:
                vqa vqaVar4 = new vqa(3, (lq4) obj3, 3);
                vqaVar4.f = (q0g) obj;
                vqaVar4.g = (kbc) obj2;
                vqaVar4.invokeSuspend(sbiVar);
                return sbiVar;
            case 4:
                vqa vqaVar5 = new vqa(3, (lq4) obj3, 4);
                vqaVar5.f = (cef) obj;
                vqaVar5.g = (def) obj2;
                return vqaVar5.invokeSuspend(sbiVar);
            case 5:
                vqa vqaVar6 = new vqa(3, (lq4) obj3, 5);
                vqaVar6.f = (eef) obj;
                vqaVar6.g = (a2d) obj2;
                return vqaVar6.invokeSuspend(sbiVar);
            case 6:
                vqa vqaVar7 = new vqa(3, (lq4) obj3, 6);
                vqaVar7.f = (k3i) obj;
                vqaVar7.g = (ylc) obj2;
                return vqaVar7.invokeSuspend(sbiVar);
            case 7:
                vqa vqaVar8 = new vqa(3, (lq4) obj3, 7);
                vqaVar8.f = (v5c) obj;
                vqaVar8.g = (kbc) obj2;
                vqaVar8.invokeSuspend(sbiVar);
                return sbiVar;
            case 8:
                vqa vqaVar9 = new vqa(3, (lq4) obj3, 8);
                vqaVar9.f = (d5c) obj;
                vqaVar9.g = (kbc) obj2;
                vqaVar9.invokeSuspend(sbiVar);
                return sbiVar;
            case 9:
                vqa vqaVar10 = new vqa(3, (lq4) obj3, 9);
                vqaVar10.f = (fu1) obj;
                vqaVar10.g = (enc) obj2;
                return vqaVar10.invokeSuspend(sbiVar);
            case 10:
                vqa vqaVar11 = new vqa((x70) this.g, (lq4) obj3, 10);
                vqaVar11.f = (Throwable) obj2;
                vqaVar11.invokeSuspend(sbiVar);
                return sbiVar;
            case 11:
                vqa vqaVar12 = new vqa((fcd) this.g, (lq4) obj3, 11);
                vqaVar12.f = (ImageView) obj;
                vqaVar12.invokeSuspend(sbiVar);
                return sbiVar;
            case 12:
                vqa vqaVar13 = new vqa((fcd) this.g, (lq4) obj3, 12);
                vqaVar13.f = (AppCompatTextView) obj;
                vqaVar13.invokeSuspend(sbiVar);
                return sbiVar;
            case 13:
                vqa vqaVar14 = new vqa((Context) this.g, (lq4) obj3, 13);
                vqaVar14.f = (gcd) obj;
                vqaVar14.invokeSuspend(sbiVar);
                return sbiVar;
            case 14:
                vqa vqaVar15 = new vqa((ProfileDeletionInfoScreen) this.g, (lq4) obj3, 14);
                vqaVar15.f = (kbc) obj2;
                vqaVar15.invokeSuspend(sbiVar);
                return sbiVar;
            case 15:
                vqa vqaVar16 = new vqa((v6e) this.g, (lq4) obj3, 15);
                vqaVar16.f = (RecyclerView) obj;
                vqaVar16.invokeSuspend(sbiVar);
                return sbiVar;
            case 16:
                vqa vqaVar17 = new vqa(3, (lq4) obj3, 16);
                vqaVar17.f = (v9e) obj;
                vqaVar17.g = (kbc) obj2;
                vqaVar17.invokeSuspend(sbiVar);
                return sbiVar;
            case 17:
                vqa vqaVar18 = new vqa((RecordControlsWidget) this.g, (lq4) obj3, 17);
                vqaVar18.f = (ImageView) obj;
                vqaVar18.invokeSuspend(sbiVar);
                return sbiVar;
            case 18:
                vqa vqaVar19 = new vqa((RecordControlsWidget) this.g, (lq4) obj3, 18);
                vqaVar19.f = (TextView) obj;
                vqaVar19.invokeSuspend(sbiVar);
                return sbiVar;
            case 19:
                vqa vqaVar20 = new vqa((RecordControlsWidget) this.g, (lq4) obj3, 19);
                vqaVar20.f = (kbc) obj2;
                vqaVar20.invokeSuspend(sbiVar);
                return sbiVar;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                vqa vqaVar21 = new vqa((RestrictLoginScreen) this.g, (lq4) obj3, 20);
                vqaVar21.f = (kbc) obj2;
                vqaVar21.invokeSuspend(sbiVar);
                return sbiVar;
            case 21:
                vqa vqaVar22 = new vqa((RknBottomSheet) this.g, (lq4) obj3, 21);
                vqaVar22.f = (LinearLayout) obj;
                vqaVar22.invokeSuspend(sbiVar);
                return sbiVar;
            case 22:
                vqa vqaVar23 = new vqa((View) this.g, (lq4) obj3, 22);
                vqaVar23.f = (View) obj;
                vqaVar23.invokeSuspend(sbiVar);
                return sbiVar;
            case 23:
                vqa vqaVar24 = new vqa((SearchMessageBottomWidget) this.g, (lq4) obj3, 23);
                vqaVar24.f = (wf4) obj;
                vqaVar24.invokeSuspend(sbiVar);
                return sbiVar;
            case 24:
                vqa vqaVar25 = new vqa(3, (lq4) obj3, 24);
                vqaVar25.f = (List) obj;
                vqaVar25.g = (nh7) obj2;
                return vqaVar25.invokeSuspend(sbiVar);
            case 25:
                vqa vqaVar26 = new vqa(3, (lq4) obj3, 25);
                vqaVar26.f = (bef) obj;
                vqaVar26.g = (kbc) obj2;
                vqaVar26.invokeSuspend(sbiVar);
                return sbiVar;
            case 26:
                vqa vqaVar27 = new vqa(3, (lq4) obj3, 26);
                vqaVar27.f = (List) obj;
                vqaVar27.g = (String) obj2;
                return vqaVar27.invokeSuspend(sbiVar);
            case 27:
                vqa vqaVar28 = new vqa((ydf) this.g, (lq4) obj3, 27);
                vqaVar28.f = (wf4) obj;
                vqaVar28.invokeSuspend(sbiVar);
                return sbiVar;
            case 28:
                vqa vqaVar29 = new vqa((zdf) this.g, (lq4) obj3, 28);
                vqaVar29.f = (kbc) obj2;
                vqaVar29.invokeSuspend(sbiVar);
                return sbiVar;
            default:
                vqa vqaVar30 = new vqa((SelectedMediaBottomBarWidget) this.g, (lq4) obj3, 29);
                vqaVar30.f = (ImageView) obj;
                vqaVar30.invokeSuspend(sbiVar);
                return sbiVar;
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) throws Throwable {
        long jMax;
        tmc tmcVar;
        int i = this.e;
        Long lValueOf = null;
        a8g a8gVar = pq3.j;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                rt2 rt2Var = (rt2) this.f;
                opa opaVar = (opa) this.g;
                ch3.d0(obj);
                return new ylc(rt2Var, opaVar);
            case 1:
                jsa jsaVar = (jsa) this.g;
                Throwable th = (Throwable) this.f;
                ch3.d0(obj);
                if (th instanceof TimeoutCancellationException) {
                    tnh tnhVar = new tnh(R.string.messages_list_message_story_get_error);
                    zv8[] zv8VarArr = jsa.Z2;
                    jsaVar.D0(null, tnhVar);
                } else {
                    if (th instanceof CancellationException) {
                        throw th;
                    }
                    if (th instanceof TamErrorException) {
                        dih dihVarA = svl.a(((TamErrorException) th).a);
                        if (dihVarA instanceof cih) {
                            xnh xnhVar = new xnh(((cih) dihVarA).a);
                            zv8[] zv8VarArr2 = jsa.Z2;
                            jsaVar.D0(null, xnhVar);
                        } else if (dihVarA instanceof aih) {
                            tnh tnhVar2 = new tnh(R.string.snack_network_error_title);
                            tnh tnhVar3 = new tnh(R.string.snack_network_error_description);
                            zv8[] zv8VarArr3 = jsa.Z2;
                            jsaVar.D0(tnhVar3, tnhVar2);
                        } else {
                            if (!(dihVarA instanceof bih) && !(dihVarA instanceof zhh)) {
                                ore.o();
                                return null;
                            }
                            tnh tnhVar4 = new tnh(R.string.common_service_error);
                            zv8[] zv8VarArr4 = jsa.Z2;
                            jsaVar.D0(null, tnhVar4);
                        }
                    } else {
                        tnh tnhVar5 = new tnh(R.string.common_service_error);
                        zv8[] zv8VarArr5 = jsa.Z2;
                        jsaVar.D0(null, tnhVar5);
                    }
                }
                return sbiVar;
            case 2:
                wv7 wv7Var = (wv7) this.f;
                kbc kbcVar = (kbc) this.g;
                ch3.d0(obj);
                wv7Var.setShadowColor(kbcVar.b().g);
                return sbiVar;
            case 3:
                q0g q0gVar = (q0g) this.f;
                kbc kbcVar2 = (kbc) this.g;
                ch3.d0(obj);
                ex8 ex8Var = new ex8(28);
                m0g m0gVar = (m0g) ex8Var.b;
                m0gVar.j = false;
                ex8Var.M(kbcVar2.h().b);
                m0gVar.d = kbcVar2.b().c;
                ex8Var.L(1.0f);
                ex8Var.O(gm0.K(86.0f * yl5.d().getDisplayMetrics().density));
                q0gVar.a(ex8Var.s());
                return sbiVar;
            case 4:
                cef cefVar = (cef) this.f;
                def defVar = (def) this.g;
                ch3.d0(obj);
                return cefVar != null ? cefVar : defVar;
            case 5:
                eef eefVar = (eef) this.f;
                a2d a2dVar = (a2d) this.g;
                ch3.d0(obj);
                return new fef(eefVar, a2dVar);
            case 6:
                k3i k3iVar = (k3i) this.f;
                ylc ylcVar = (ylc) this.g;
                ch3.d0(obj);
                e0i e0iVar = (e0i) ylcVar.a;
                iji ijiVar = (iji) ylcVar.b;
                k3iVar.getClass();
                if (e0iVar == null) {
                    e0iVar = k3iVar.a;
                }
                e0i e0iVar2 = e0iVar;
                if (ijiVar == null) {
                    ijiVar = k3iVar.b;
                }
                iji ijiVar2 = ijiVar;
                boolean z = e0iVar2 instanceof a0i;
                Long lValueOf2 = z ? Long.valueOf(((a0i) e0iVar2).b) : e0iVar2 instanceof c0i ? Long.valueOf(((c0i) e0iVar2).b) : null;
                boolean z2 = ijiVar2 instanceof gji;
                Long lValueOf3 = z2 ? Long.valueOf(((gji) ijiVar2).b) : ijiVar2 instanceof eji ? Long.valueOf(((eji) ijiVar2).a) : null;
                if (z2) {
                    lValueOf = Long.valueOf(((gji) ijiVar2).a);
                } else if (ijiVar2 instanceof eji) {
                    lValueOf = Long.valueOf(((eji) ijiVar2).a);
                }
                long jMax2 = Math.max(lValueOf2 != null ? lValueOf2.longValue() : 0L, lValueOf3 != null ? lValueOf3.longValue() : 0L);
                Long lA = k3iVar.f;
                if (lA == null) {
                    lA = k3i.a(e0iVar2, 75.0f);
                }
                Long l = lA;
                Long lA2 = k3iVar.g;
                if (lA2 == null) {
                    lA2 = k3i.a(e0iVar2, 95.0f);
                }
                Long l2 = lA2;
                if (z) {
                    jMax = ((a0i) e0iVar2).b;
                } else {
                    jMax = Math.max(jMax2, l2 != null ? l2.longValue() : l != null ? l.longValue() : k3iVar.c);
                }
                long j = jMax;
                long jLongValue = lValueOf != null ? lValueOf.longValue() : k3iVar.e;
                return new k3i(e0iVar2, ijiVar2, j, (int) ((jLongValue / j) * 100.0f), jLongValue, l, l2);
            case 7:
                v5c v5cVar = (v5c) this.f;
                kbc kbcVar3 = (kbc) this.g;
                ch3.d0(obj);
                Drawable background = v5cVar.getBackground();
                RippleDrawable rippleDrawable = background instanceof RippleDrawable ? (RippleDrawable) background : null;
                if (rippleDrawable != null) {
                    rippleDrawable.setColor(ColorStateList.valueOf(((fn8) kbcVar3.u().c.b).c));
                }
                return sbiVar;
            case 8:
                d5c d5cVar = (d5c) this.f;
                kbc kbcVar4 = (kbc) this.g;
                ch3.d0(obj);
                Drawable background2 = d5cVar.getBackground();
                if (background2 instanceof RippleDrawable) {
                    ((RippleDrawable) background2).setColor(ColorStateList.valueOf(((fn8) kbcVar4.u().c.b).c));
                    d5cVar.invalidate();
                }
                return sbiVar;
            case 9:
                fu1 fu1Var = (fu1) this.f;
                enc encVar = (enc) this.g;
                ch3.d0(obj);
                Map map = encVar.c;
                tmc tmcVar2 = encVar.a;
                int size = map.size();
                Map map2 = encVar.c;
                if (size > 1) {
                    if (fu1Var == null && (fu1Var = encVar.d) == null) {
                        fu1Var = encVar.e;
                    }
                    tmcVar = (tmc) map2.get(fu1Var);
                    if (tmcVar == null) {
                        return tmcVar2;
                    }
                } else {
                    tmcVar = (tmc) ww3.s1(map2.values());
                    if (tmcVar == null) {
                        return tmcVar2;
                    }
                    if (!tmcVar.a.i() && tmcVar2.a.c()) {
                        return tmcVar2;
                    }
                }
                return tmcVar;
            case 10:
                ch3.d0(obj);
                Throwable th2 = (Throwable) this.f;
                Log.e("PipePresenceSrc", "Error in camera ID flow collection.", th2);
                x70 x70Var = (x70) this.g;
                if (((AtomicBoolean) x70Var.h).get()) {
                    x70Var.q(null, th2);
                } else {
                    new Integer(Log.d("PipePresenceSrc", "Ignoring error because monitoring is stopped."));
                }
                return sbiVar;
            case 11:
                ImageView imageView = (ImageView) this.f;
                ch3.d0(obj);
                fcd fcdVar = (fcd) this.g;
                Integer num = fcdVar.b;
                imageView.setImageTintList(ColorStateList.valueOf(num != null ? oc9.Z(num.intValue(), fcdVar.getCurrentTheme()) : fcdVar.getCurrentTheme().getIcon().b));
                return sbiVar;
            case 12:
                AppCompatTextView appCompatTextView = (AppCompatTextView) this.f;
                ch3.d0(obj);
                fcd fcdVar2 = (fcd) this.g;
                Integer num2 = fcdVar2.c;
                appCompatTextView.setTextColor(num2 != null ? oc9.Z(num2.intValue(), fcdVar2.getCurrentTheme()) : fcdVar2.getCurrentTheme().getText().b);
                return sbiVar;
            case 13:
                gcd gcdVar = (gcd) this.f;
                ch3.d0(obj);
                gcdVar.setBackground(new ColorDrawable(gcdVar.getCurrentTheme().b().f));
                pq3.g(a8gVar.e((Context) this.g), gcdVar);
                return sbiVar;
            case 14:
                kbc kbcVar5 = (kbc) this.f;
                ch3.d0(obj);
                ProfileDeletionInfoScreen profileDeletionInfoScreen = (ProfileDeletionInfoScreen) this.g;
                zv8[] zv8VarArr6 = ProfileDeletionInfoScreen.g;
                View view = profileDeletionInfoScreen.getView();
                if (view != null) {
                    view.setBackgroundColor(kbcVar5.b().c);
                }
                TextView textView = (TextView) profileDeletionInfoScreen.findViewById(R.id.oneme_settings_twofa_onboarding_title);
                if (textView != null) {
                    textView.setTextColor(kbcVar5.getText().b);
                }
                TextView textView2 = (TextView) profileDeletionInfoScreen.findViewById(R.id.oneme_settings_twofa_onboarding_subtitle);
                if (textView2 != null) {
                    textView2.setTextColor(kbcVar5.getText().d);
                }
                ImageView imageView2 = (ImageView) profileDeletionInfoScreen.findViewById(R.id.oneme_settings_twofa_onboarding_picture);
                if (imageView2 != null) {
                    kbcVar5.getIcon();
                    imageView2.setImageTintList(ColorStateList.valueOf(-1));
                }
                return sbiVar;
            case 15:
                RecyclerView recyclerView = (RecyclerView) this.f;
                ch3.d0(obj);
                recyclerView.setBackground(qyj.U(Integer.valueOf(a8gVar.e(((v6e) this.g).a).m().k().d), null, null, new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f}));
                return sbiVar;
            case 16:
                v9e v9eVar = (v9e) this.f;
                kbc kbcVar6 = (kbc) this.g;
                ch3.d0(obj);
                v9eVar.k2.setColor(kbcVar6.B().c);
                return sbiVar;
            case 17:
                View view2 = (ImageView) this.f;
                ch3.d0(obj);
                RecordControlsWidget recordControlsWidget = (RecordControlsWidget) this.g;
                Drawable drawable = (Drawable) recordControlsWidget.y.getValue();
                a8gVar.h(view2);
                sb8.m0(-1, drawable);
                sb8.m0(a8gVar.h(view2).getIcon().e, recordControlsWidget.B1());
                return sbiVar;
            case 18:
                TextView textView3 = (TextView) this.f;
                ch3.d0(obj);
                textView3.setTextColor(a8gVar.h(textView3).getText().d);
                RecordControlsWidget recordControlsWidget2 = (RecordControlsWidget) this.g;
                zv8[] zv8VarArr7 = RecordControlsWidget.x1;
                sb8.m0(a8gVar.h(textView3).getIcon().d, (InsetDrawable) recordControlsWidget2.z.getValue());
                return sbiVar;
            case 19:
                kbc kbcVar7 = (kbc) this.f;
                ch3.d0(obj);
                RecordControlsWidget recordControlsWidget3 = (RecordControlsWidget) this.g;
                zv8[] zv8VarArr8 = RecordControlsWidget.x1;
                ((GradientDrawable) recordControlsWidget3.C.getValue()).setColor(kbcVar7.getText().j);
                return sbiVar;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                kbc kbcVar8 = (kbc) this.f;
                ch3.d0(obj);
                RestrictLoginScreen restrictLoginScreen = (RestrictLoginScreen) this.g;
                zv8[] zv8VarArr9 = RestrictLoginScreen.m;
                View view3 = restrictLoginScreen.getView();
                if (view3 != null) {
                    view3.setBackgroundColor(kbcVar8.b().c);
                }
                Drawable drawable2 = (Drawable) restrictLoginScreen.e.getValue();
                kbcVar8.getIcon();
                sb8.m0(-1, drawable2);
                j8e j8eVar = restrictLoginScreen.k;
                zv8[] zv8VarArr10 = RestrictLoginScreen.m;
                ((TextView) j8eVar.m(restrictLoginScreen, zv8VarArr10[2])).setTextColor(kbcVar8.getText().b);
                ((TextView) restrictLoginScreen.l.m(restrictLoginScreen, zv8VarArr10[3])).setTextColor(kbcVar8.getText().d);
                ((cyb) restrictLoginScreen.i.m(restrictLoginScreen, zv8VarArr10[0])).e();
                ((cyb) restrictLoginScreen.j.m(restrictLoginScreen, zv8VarArr10[1])).e();
                ((a1g) restrictLoginScreen.g.getValue()).onThemeChanged(kbcVar8);
                return sbiVar;
            case 21:
                View view4 = (LinearLayout) this.f;
                ch3.d0(obj);
                RknBottomSheet rknBottomSheet = (RknBottomSheet) this.g;
                j8e j8eVar2 = rknBottomSheet.u;
                zv8[] zv8VarArr11 = RknBottomSheet.y;
                ((TextView) j8eVar2.m(rknBottomSheet, zv8VarArr11[0])).setTextColor(a8gVar.h(view4).getText().b);
                ((TextView) rknBottomSheet.v.m(rknBottomSheet, zv8VarArr11[1])).setTextColor(a8gVar.h(view4).getText().d);
                ((Drawable) rknBottomSheet.w.getValue()).setTint(a8gVar.h(view4).x().b);
                GradientDrawable gradientDrawable = (GradientDrawable) rknBottomSheet.x.getValue();
                int[] iArr = ((pac) a8gVar.h(view4).x().f).a;
                ArrayList arrayList = new ArrayList(2);
                for (int i2 = 0; i2 < 2; i2++) {
                    arrayList.add(new Integer(lvb.I0(iArr[i2], 0.16f)));
                }
                gradientDrawable.setColors(ww3.S1(arrayList));
                return sbiVar;
            case 22:
                View view5 = (View) this.f;
                ch3.d0(obj);
                ((View) this.g).setBackgroundColor(a8gVar.h(view5).b().c);
                ((TextView) view5.findViewById(R.id.oneme_settings_privacy_onboarding_content_title)).setTextColor(a8gVar.h(view5).getText().b);
                ((TextView) view5.findViewById(R.id.oneme_settings_privacy_onboarding_content_subtitle)).setTextColor(a8gVar.h(view5).getText().d);
                return sbiVar;
            case 23:
                wf4 wf4Var = (wf4) this.f;
                ch3.d0(obj);
                SearchMessageBottomWidget searchMessageBottomWidget = (SearchMessageBottomWidget) this.g;
                zv8[] zv8VarArr12 = SearchMessageBottomWidget.h;
                wf4Var.setBackgroundColor(searchMessageBottomWidget.r1().k().b);
                searchMessageBottomWidget.p1().setTextColor(searchMessageBottomWidget.r1().getText().d);
                searchMessageBottomWidget.q1().setBackgroundColor(searchMessageBottomWidget.r1().getIcon().d);
                searchMessageBottomWidget.u1(searchMessageBottomWidget.s1(), searchMessageBottomWidget.f);
                searchMessageBottomWidget.u1(searchMessageBottomWidget.o1(), searchMessageBottomWidget.g);
                return sbiVar;
            case 24:
                List list = (List) this.f;
                nh7 nh7Var = (nh7) this.g;
                ch3.d0(obj);
                return new ylc(list, nh7Var);
            case 25:
                bef befVar = (bef) this.f;
                kbc kbcVar9 = (kbc) this.g;
                ch3.d0(obj);
                befVar.setBackgroundColor(kbcVar9.b().d);
                return sbiVar;
            case 26:
                List list2 = (List) this.f;
                String str = (String) this.g;
                ch3.d0(obj);
                if (str.length() == 0) {
                    return list2;
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list2) {
                    x0c x0cVar = (x0c) obj2;
                    if (!r5h.L0("+" + x0cVar.b, str, false)) {
                        String str2 = x0cVar.a;
                        Locale locale = Locale.ROOT;
                        if (r5h.L0(str2.toLowerCase(locale), str, false) || r5h.L0(x0cVar.c.toLowerCase(locale), str, false)) {
                        }
                    }
                    arrayList2.add(obj2);
                }
                return arrayList2;
            case 27:
                View view6 = (wf4) this.f;
                ch3.d0(obj);
                ydf ydfVar = (ydf) this.g;
                ydfVar.u.setColorFilter(a8gVar.h(view6).getIcon().h);
                ydfVar.v.setTextColor(a8gVar.h(view6).getText().b);
                ydfVar.w.setTextColor(a8gVar.h(view6).getText().d);
                return sbiVar;
            case 28:
                kbc kbcVar10 = (kbc) this.f;
                ch3.d0(obj);
                zdf zdfVar = (zdf) this.g;
                oh7 oh7Var = zdfVar.x;
                zdfVar.w.setTextColor((oh7Var == null || !oh7Var.c) ? kbcVar10.getText().c : kbcVar10.getText().h);
                return sbiVar;
            default:
                ImageView imageView3 = (ImageView) this.f;
                ch3.d0(obj);
                SelectedMediaBottomBarWidget selectedMediaBottomBarWidget = (SelectedMediaBottomBarWidget) this.g;
                zv8[] zv8VarArr13 = SelectedMediaBottomBarWidget.C;
                imageView3.setImageTintList(ColorStateList.valueOf(selectedMediaBottomBarWidget.o1().getIcon().b));
                return sbiVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vqa(int i, lq4 lq4Var, int i2) {
        super(i, lq4Var);
        this.e = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vqa(int i) {
        super(3, null);
        this.e = i;
    }
}
