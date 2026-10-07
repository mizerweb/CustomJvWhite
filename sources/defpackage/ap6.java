package defpackage;

import android.content.Context;
import android.net.Uri;
import com.vk.push.core.analytics.AnalyticsBaseParamsConstantsKt;
import kotlin.collections.a;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ap6 {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;

    public ap6(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
        this.d = ny8Var4;
        this.e = ny8Var5;
        this.f = ny8Var6;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:30:0x015a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0177 A[LOOP:0: B:32:0x0171->B:34:0x0177, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:37:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:38:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:41:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Instruction removed from duplicated block: B:34:0x0177, please report this as an issue */
    public final Object a(nq4 nq4Var) {
        zo6 zo6Var;
        wfe wfeVarP;
        String string;
        long jT;
        wfe wfeVar;
        StringBuilder sb;
        String string2;
        StringBuilder sb2;
        String str;
        if (nq4Var instanceof zo6) {
            zo6Var = (zo6) nq4Var;
            int i = zo6Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                zo6Var.i = i - Integer.MIN_VALUE;
            } else {
                zo6Var = new zo6(this, nq4Var);
            }
        } else {
            zo6Var = new zo6(this, nq4Var);
        }
        Object objI = zo6Var.g;
        int i2 = zo6Var.i;
        ny8 ny8Var = this.f;
        if (i2 == 0) {
            wfeVarP = nbh.p(objI);
            string = ((Context) ny8Var.getValue()).getString(R.string.feedback_subject);
            if (((svb) this.b.getValue()).b()) {
                jT = ((s7f) ((et3) this.d.getValue())).t();
                no4 no4Var = (no4) this.c.getValue();
                zo6Var.d = wfeVarP;
                zo6Var.e = wfeVarP;
                zo6Var.f = jT;
                zo6Var.i = 1;
                objI = no4Var.i(jT);
                hu4 hu4Var = hu4.a;
                if (objI == hu4Var) {
                    return hu4Var;
                }
                wfeVar = wfeVarP;
            }
            sb = new StringBuilder("\n\n--\n");
            if (((vg4) wfeVarP.a) != null) {
                sb.append(((Context) ny8Var.getValue()).getString(R.string.feedback_user_info, ((vg4) wfeVarP.a).k(), new Long(((vg4) wfeVarP.a).v())));
            }
            tmi tmiVarA = ((umi) this.a.getValue()).a();
            String str2 = tmiVarA.b + "(" + tmiVarA.c + ")";
            ylc ylcVar = new ylc("locale", tmiVarA.f);
            ylc ylcVar2 = new ylc("appVersion", str2);
            ylc ylcVar3 = new ylc("arch", tmiVarA.e);
            ylc ylcVar4 = new ylc("screen", tmiVarA.i);
            ylc ylcVar5 = new ylc("deviceName", tmiVarA.h);
            ylc ylcVar6 = new ylc("deviceType", tmiVarA.a);
            ylc ylcVar7 = new ylc("osVersion", tmiVarA.d);
            ylc ylcVar8 = new ylc(AnalyticsBaseParamsConstantsKt.TIMEZONE, tmiVarA.k.getID());
            ylc ylcVar9 = new ylc("deviceLocale", tmiVarA.g);
            syd sydVar = tmiVarA.j;
            for (ylc ylcVar10 : a.Y0(new ylc[]{ylcVar, ylcVar2, ylcVar3, ylcVar4, ylcVar5, ylcVar6, ylcVar7, ylcVar8, ylcVar9, sydVar != null ? new ylc("pushDeviceType", sydVar.a) : null})) {
                sb.append(ylcVar10.a + ": " + ylcVar10.b + "\n");
            }
            string2 = sb.toString();
            String str3 = (String) ((g5d) ((gjf) this.e.getValue())).a.P.a(e5d.S6[34]).i();
            sb2 = new StringBuilder("mailto:");
            sb2.append(str3);
            if (string.length() > 0) {
                sb2.append("?subject=");
                sb2.append(Uri.encode(string, "utf-8"));
                str = "&";
            } else {
                str = "?";
            }
            if (string2.length() > 0) {
                sb2.append(str);
                sb2.append("body=");
                sb2.append(Uri.encode(string2, "utf-8"));
            }
            return sb2.toString();
        }
        if (i2 != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jT = zo6Var.f;
        wfeVarP = zo6Var.e;
        wfeVar = zo6Var.d;
        ch3.d0(objI);
        wfeVarP.a = objI;
        Context context = (Context) ny8Var.getValue();
        vg4 vg4Var = (vg4) wfeVar.a;
        string = context.getString(R.string.feedback_subject_auth, vg4Var != null ? vg4Var.k() : null, new Long(jT));
        wfeVarP = wfeVar;
        sb = new StringBuilder("\n\n--\n");
        if (((vg4) wfeVarP.a) != null) {
            sb.append(((Context) ny8Var.getValue()).getString(R.string.feedback_user_info, ((vg4) wfeVarP.a).k(), new Long(((vg4) wfeVarP.a).v())));
        }
        tmi tmiVarA2 = ((umi) this.a.getValue()).a();
        String str4 = tmiVarA2.b + "(" + tmiVarA2.c + ")";
        ylc ylcVar11 = new ylc("locale", tmiVarA2.f);
        ylc ylcVar12 = new ylc("appVersion", str4);
        ylc ylcVar13 = new ylc("arch", tmiVarA2.e);
        ylc ylcVar14 = new ylc("screen", tmiVarA2.i);
        ylc ylcVar15 = new ylc("deviceName", tmiVarA2.h);
        ylc ylcVar16 = new ylc("deviceType", tmiVarA2.a);
        ylc ylcVar17 = new ylc("osVersion", tmiVarA2.d);
        ylc ylcVar18 = new ylc(AnalyticsBaseParamsConstantsKt.TIMEZONE, tmiVarA2.k.getID());
        ylc ylcVar19 = new ylc("deviceLocale", tmiVarA2.g);
        syd sydVar2 = tmiVarA2.j;
        while (r3.hasNext()) {
            sb.append(ylcVar10.a + ": " + ylcVar10.b + "\n");
        }
        string2 = sb.toString();
        String str5 = (String) ((g5d) ((gjf) this.e.getValue())).a.P.a(e5d.S6[34]).i();
        sb2 = new StringBuilder("mailto:");
        sb2.append(str5);
        if (string.length() > 0) {
            sb2.append("?subject=");
            sb2.append(Uri.encode(string, "utf-8"));
            str = "&";
        } else {
            str = "?";
        }
        if (string2.length() > 0) {
            sb2.append(str);
            sb2.append("body=");
            sb2.append(Uri.encode(string2, "utf-8"));
        }
        return sb2.toString();
    }
}
