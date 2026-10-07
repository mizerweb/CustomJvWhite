package defpackage;

import android.animation.AnimatorSet;
import android.media.RingtoneManager;
import android.net.Uri;
import android.provider.Settings;
import android.text.Editable;
import android.view.View;
import java.io.File;
import one.me.calls.ui.bottomsheet.record.StartRecordBottomSheet;
import one.me.devmenu.utils.ValueBottomSheet;
import one.me.sdk.messagewrite.mention.SuggestionsWidget;
import one.me.settings.ringtone.ui.SettingRingtoneScreen;
import one.me.settings.storage.ui.SettingsStorageScreen;
import one.me.settings.twofa.configuration.TwoFASettingsScreen;
import one.me.stories.text.TextEditStoryWidget;
import one.me.stories.viewer.viewer.viewsbottomsheet.StoryViewsBottomSheet;
import org.apache.http.conn.params.ConnManagerParams;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jvf implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jvf(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Uri actualDefaultRingtoneUri;
        Object value;
        Object value2;
        Object value3;
        hoh hohVar;
        ulh ulhVar;
        Object value4;
        hoh hohVar2;
        int i = this.a;
        kt7 kt7Var = kt7.CLOCK_TICK;
        CharSequence charSequence = null;
        charSequence = null;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                jbf jbfVar = (jbf) obj;
                long j = jbfVar.d;
                String str = jbfVar.i;
                SettingRingtoneScreen settingRingtoneScreen = (SettingRingtoneScreen) ((ks9) obj2).b;
                zv8[] zv8VarArr = SettingRingtoneScreen.i;
                xpf xpfVarO1 = settingRingtoneScreen.o1();
                int i2 = (int) j;
                if (i2 == R.id.oneme_settings_ringtone_section_default) {
                    xpfVarO1.G(bqe.a);
                    Integer num = xpfVarO1.o;
                    if (num != null && num.intValue() == i2 && xpfVarO1.D().d()) {
                        xpfVarO1.D().j();
                        xpfVarO1.o = null;
                    } else {
                        xpfVarO1.E();
                        xpfVarO1.D().i((wpf) xpfVarO1.p.getValue(), 3, false);
                        xpfVarO1.o = Integer.valueOf(i2);
                    }
                    break;
                } else if (i2 == R.id.oneme_settings_ringtone_section_system_default) {
                    xpfVarO1.G(cqe.a);
                    Integer num2 = xpfVarO1.o;
                    if (num2 != null && num2.intValue() == i2 && xpfVarO1.D().d()) {
                        xpfVarO1.D().j();
                        xpfVarO1.o = null;
                    } else {
                        xpfVarO1.E();
                        m7g m7gVarD = xpfVarO1.D();
                        try {
                            actualDefaultRingtoneUri = RingtoneManager.getActualDefaultRingtoneUri(xpfVarO1.C(), 1);
                        } catch (Exception e) {
                            gm0.V(xpfVarO1.q, "RingtoneManager::getActualDefaultRingtoneUri thrown exception", e);
                            actualDefaultRingtoneUri = Settings.System.DEFAULT_RINGTONE_URI;
                        }
                        m7gVarD.i(new b1k(26, actualDefaultRingtoneUri), 3, false);
                        xpfVarO1.o = Integer.valueOf(i2);
                    }
                    break;
                } else if (i2 == R.id.oneme_settings_ringtone_section_custom_add) {
                    a8j.x(xpfVarO1.l, qvf.b);
                    xpfVarO1.D().j();
                    xpfVarO1.o = null;
                    break;
                } else if (str == null) {
                    xpfVarO1.getClass();
                    break;
                } else {
                    File file = (File) xpfVarO1.m.get(str);
                    if (file != null) {
                        xpfVarO1.G(new aqe(file.getAbsolutePath()));
                        Integer num3 = xpfVarO1.o;
                        if (num3 != null && num3.intValue() == i2 && xpfVarO1.D().d()) {
                            xpfVarO1.D().j();
                            xpfVarO1.o = null;
                        } else {
                            xpfVarO1.E();
                            xpfVarO1.D().i(new xva(25, file.getAbsolutePath()), 3, false);
                            xpfVarO1.o = Integer.valueOf(i2);
                        }
                        break;
                    }
                }
                break;
            case 1:
                long j2 = ((lbf) obj).b;
                SettingsStorageScreen settingsStorageScreen = (SettingsStorageScreen) ((vn7) obj2).b;
                zv8[] zv8VarArr2 = SettingsStorageScreen.g;
                ((kwf) settingsStorageScreen.b.getValue()).E((int) j2);
                break;
            case 2:
                long j3 = ((mbf) obj).c;
                SettingsStorageScreen settingsStorageScreen2 = (SettingsStorageScreen) ((vn7) obj2).b;
                zv8[] zv8VarArr3 = SettingsStorageScreen.g;
                ((kwf) settingsStorageScreen2.b.getValue()).E((int) j3);
                break;
            case 3:
                ((j1g) obj2).y.setLoading(true);
                ((old) obj).invoke();
                break;
            case 4:
                o6g o6gVar = (o6g) obj2;
                o6gVar.b.invoke(Integer.valueOf(((n6g) obj).a));
                o6gVar.dismiss();
                break;
            case 5:
                StartRecordBottomSheet startRecordBottomSheet = (StartRecordBottomSheet) obj2;
                zv8[] zv8VarArr4 = StartRecordBottomSheet.x;
                iig iigVar = (iig) startRecordBottomSheet.w.getValue();
                Editable text = ((p1c) obj).getText();
                h02 h02Var = iigVar.c;
                if (text != null && r5h.X0(text) && text.length() > 0) {
                    a8j.x(h02Var.G, ry1.z);
                } else {
                    if (text != null && text.length() != 0) {
                        charSequence = text;
                    }
                    if (charSequence == null) {
                        charSequence = (CharSequence) iigVar.e.getValue();
                    }
                    a8j.x(h02Var.G, new hy1(charSequence));
                    startRecordBottomSheet.v1(true);
                }
                break;
            case 6:
                qlg qlgVar = (qlg) obj;
                tlg tlgVar = ((gj9) obj2).w;
                if (tlgVar != null) {
                    qlgVar.T(tlgVar);
                }
                break;
            case 7:
                cf7 cf7Var = (cf7) obj;
                vaf vafVar = ((kmg) obj2).y;
                if (vafVar != null) {
                    cf7Var.invoke(vafVar);
                }
                break;
            case 8:
                tmg tmgVar = (tmg) obj2;
                cf7 cf7Var2 = (cf7) obj;
                co2 co2Var = tmgVar.C;
                if (co2Var != null) {
                    ((l1c) tmgVar.a).setBackground(tmgVar.v);
                    cf7Var2.invoke(Long.valueOf(co2Var.b.a));
                }
                break;
            case 9:
                cf7 cf7Var3 = (cf7) obj;
                vaf vafVar2 = ((jog) obj2).u;
                if (vafVar2 != null) {
                    cf7Var3.invoke(vafVar2);
                }
                break;
            case 10:
                vyg vygVar = (vyg) obj;
                ryg rygVar = ((uyg) obj2).b;
                if (rygVar != null) {
                    vygVar.a.invoke(rygVar);
                }
                break;
            case 11:
                u3h u3hVar = (u3h) ((h47) obj2).g;
                long j4 = ((k3h) obj).a;
                int i3 = u3hVar.a;
                StoryViewsBottomSheet storyViewsBottomSheet = u3hVar.b;
                switch (i3) {
                    case 0:
                        zv8[] zv8VarArr5 = StoryViewsBottomSheet.H;
                        a8j.x(storyViewsBottomSheet.F1().o, new vug(j4));
                        break;
                    default:
                        zv8[] zv8VarArr6 = StoryViewsBottomSheet.H;
                        a8j.x(storyViewsBottomSheet.F1().o, new vug(j4));
                        break;
                }
                break;
            case 12:
                z6h z6hVar = (z6h) obj2;
                x6h x6hVar = (x6h) obj;
                int iL = z6hVar.l();
                Integer numValueOf = iL != -1 ? Integer.valueOf(iL) : null;
                if (numValueOf != null) {
                    z6hVar.v.invoke(x6hVar, Integer.valueOf(numValueOf.intValue()));
                }
                break;
            case 13:
                SuggestionsWidget suggestionsWidget = (SuggestionsWidget) obj2;
                u9h u9hVar = (u9h) obj;
                mjg mjgVar = suggestionsWidget.J1().y;
                do {
                    value = mjgVar.getValue();
                } while (!mjgVar.h(value, u9hVar));
                mjg mjgVar2 = suggestionsWidget.J1().y;
                do {
                    value2 = mjgVar2.getValue();
                } while (!mjgVar2.h(value2, null));
                suggestionsWidget.v1(true);
                break;
            case 14:
                zv8[] zv8VarArr7 = TextEditStoryWidget.B;
                p0m.a((wlh) obj2, kt7Var);
                mjg mjgVar3 = ((TextEditStoryWidget) obj).t1().c;
                do {
                    value3 = mjgVar3.getValue();
                    hohVar = (hoh) value3;
                    int iOrdinal = hohVar.a.ordinal();
                    if (iOrdinal == 0) {
                        ulhVar = ulh.e;
                    } else if (iOrdinal == 1) {
                        ulhVar = ulh.c;
                    } else if (iOrdinal != 2) {
                        ore.o();
                    } else {
                        ulhVar = ulh.d;
                    }
                    break;
                } while (!mjgVar3.h(value3, hoh.a(hohVar, ulhVar, 0, 0, 0, null, 0, false, 0, 190)));
                break;
            case 15:
                zv8[] zv8VarArr8 = TextEditStoryWidget.B;
                p0m.a((lx3) obj2, kt7Var);
                mjg mjgVar4 = ((TextEditStoryWidget) obj).t1().c;
                do {
                    value4 = mjgVar4.getValue();
                    hohVar2 = (hoh) value4;
                } while (!mjgVar4.h(value4, hoh.a(hohVar2, null, 0, 0, 0, null, 0, !hohVar2.g, 0, 191)));
                break;
            case 16:
                ((fz7) obj2).invoke((aqh) obj);
                break;
            case 17:
                ((u32) obj2).invoke();
                ((mvh) obj).a();
                break;
            case 18:
                long j5 = ((c8i) obj).d;
                k8i k8iVar = (k8i) ((TwoFASettingsScreen) ((c4h) obj2).b).d.getValue();
                int i4 = (int) j5;
                String str2 = k8iVar.c;
                ic6 ic6Var = k8iVar.j;
                if (i4 == R.id.oneme_settings_twofa_configuration_setting_password) {
                    a8j.x(ic6Var, new r6i(str2));
                } else if (i4 == R.id.oneme_settings_twofa_configuration_setting_email) {
                    cd0 cd0Var = (cd0) k8iVar.l.get();
                    a8j.x(ic6Var, new q6i(str2, new pk8(null, null, new ok8(0, 13, 0L, null, cd0Var != null ? cd0Var.c : null), null, null, 27)));
                } else if (i4 == R.id.oneme_settings_twofa_configuration_setting_disable_twofa) {
                    a8j.x(k8iVar.k, new o6i(new tnh(R.string.oneme_settings_twofa_configuration_disable_warning_title), new tnh(R.string.oneme_settings_twofa_configuration_disable_warning_subtitle), xw3.P0(new kc4(R.id.oneme_settings_twofa_configuration_disable_twofa_positive, new tnh(R.string.oneme_settings_twofa_configuration_disable_warning_positive_action), 3, true, 3, 3), new kc4(R.id.oneme_settings_twofa_configuration_disable_twofa_negative, new tnh(R.string.oneme_settings_twofa_configuration_disable_warning_negative_action), 2, 32))));
                }
                break;
            case 19:
                ((cf7) obj2).invoke(((bni) obj).g);
                break;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                ValueBottomSheet valueBottomSheet = (ValueBottomSheet) obj2;
                cyb cybVar = (cyb) obj;
                j8e j8eVar = valueBottomSheet.x;
                zv8[] zv8VarArr9 = ValueBottomSheet.z;
                CharSequence text2 = ((jac) j8eVar.m(valueBottomSheet, zv8VarArr9[2])).getText();
                if (text2.length() > 0) {
                    br4 targetController = valueBottomSheet.getTargetController();
                    hri hriVar = targetController instanceof hri ? (hri) targetController : null;
                    if (hriVar != null) {
                        vv vvVar = valueBottomSheet.v;
                        zv8 zv8Var = zv8VarArr9[0];
                        hriVar.I(((Number) vvVar.a(valueBottomSheet)).longValue(), text2.toString());
                    }
                    ml9.d(cybVar);
                    valueBottomSheet.v1(true);
                }
                break;
            case 21:
                izi iziVar = (izi) obj2;
                oxi oxiVar = (oxi) obj;
                AnimatorSet animatorSet = iziVar.n1;
                if (animatorSet == null || !animatorSet.isRunning()) {
                    iziVar.a.invoke(new qna(oxiVar.a, oxiVar));
                }
                break;
            case 22:
                vsj vsjVar = (vsj) obj;
                usj usjVar = ((wsj) obj2).u;
                ssj ssjVar = usjVar instanceof ssj ? (ssj) usjVar : null;
                if (ssjVar != null) {
                    vsjVar.a(ssjVar, !((ksf) ssjVar.a.h).a);
                    break;
                }
                break;
            case 23:
                ysj ysjVar = (ysj) obj;
                usj usjVar2 = ((xsj) obj2).u;
                if (usjVar2 != null) {
                    ysjVar.invoke(usjVar2);
                }
                break;
            default:
                qlg qlgVar2 = (qlg) obj;
                tlg tlgVar2 = ((gj9) obj2).w;
                if (tlgVar2 != null) {
                    qlgVar2.T(tlgVar2);
                }
                break;
        }
    }
}
