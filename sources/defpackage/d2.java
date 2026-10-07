package defpackage;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.util.Log;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException;
import java.io.File;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.apache.http.conn.params.ConnManagerParams;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d2 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        we4 we4Var;
        JSONArray jSONArrayOptJSONArray;
        boolean z;
        int i = this.a;
        sbi sbiVar = sbi.a;
        boolean z2 = false;
        Object obj = this.b;
        switch (i) {
            case 0:
                return Long.valueOf(((f2) obj).h());
            case 1:
                return "Scope for account id=" + ((ha9) obj) + " not found!";
            case 2:
                return ((ph) obj).b.getContentResolver();
            case 3:
                return new y1(1, (Object[]) obj);
            case 4:
                return c0a.o("AssertionTracker(system: ov_sdk, subSystem: ", (String) obj, ") already registered");
            case 5:
                return ((y10) obj).g().c();
            case 6:
                return new ja0((ka0) obj);
            case 7:
                p4c p4cVar = (p4c) obj;
                String language = p4cVar.f.getLanguage();
                String languageTags = p4cVar.a.getResources().getConfiguration().getLocales().toLanguageTags();
                String strM = p4cVar.c.m();
                StringBuilder sbQ = qv1.q("configuration: userLocale:", language, "context: ", languageTags, "prefs lang");
                sbQ.append(strM);
                return sbQ.toString();
            case 8:
                rl3 rl3Var = (rl3) obj;
                return new xed(qv1.k("chatlist-stories-", rl3Var.d), rl3Var.b, ((n0c) rl3Var.h).a().R0(1, "stories"), new gz(rl3Var, null, 4));
            case 9:
                return cqk.a(((n0c) ((xhh) obj)).b());
            case 10:
                return ((LinkedHashSet) obj).iterator();
            case 11:
                id4 id4Var = (id4) obj;
                id4Var.a();
                id4Var.g = 0;
                ghb ghbVar = ew5.b;
                id4Var.e = 0L;
                return sbiVar;
            case 12:
                return Integer.valueOf(Integer.parseInt(((ud4) obj).b));
            case 13:
                xe4 xe4Var = (xe4) obj;
                JSONObject jSONObject = (JSONObject) ((g5d) ((gjf) xe4Var.a)).a.D1.a(e5d.S6[132]).i();
                ifh ifhVar = (ifh) xe4Var.e;
                if (jSONObject == null) {
                    return (Map) ifhVar.getValue();
                }
                EnumMap enumMap = new EnumMap((Map) ifhVar.getValue());
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Integer numB0 = y5h.B0(next);
                    if (numB0 != null && (we4Var = (we4) ww3.u1(numB0.intValue(), we4.h)) != null && (jSONArrayOptJSONArray = jSONObject.optJSONArray(next)) != null && jSONArrayOptJSONArray.length() != 0) {
                        int length = jSONArrayOptJSONArray.length();
                        long[] jArr = new long[length];
                        for (int i2 = 0; i2 < length; i2++) {
                            jArr[i2] = jSONArrayOptJSONArray.optLong(i2, 10000L);
                        }
                        enumMap.put(we4Var, jArr);
                    }
                }
                return enumMap;
            case 14:
                qo4 qo4Var = (qo4) obj;
                mjg mjgVarA = p90.a(null);
                e9i.j0(new fz6(e9i.F(mjgVarA, 200L), new xm3(2, qo4Var, qo4.class, "startSearch", "startSearch(Ljava/lang/String;)V", 4, 1), 3), qo4Var.a);
                return mjgVarA;
            case 15:
                return ((vz4) obj).a();
            case 16:
                ((w45) obj).b = true;
                return sbiVar;
            case 17:
                String str = (String) ((v2a) obj).b;
                try {
                    z = !ut9.e(str, false, false).isEmpty();
                } catch (MediaCodecUtil$DecoderQueryException e) {
                    String strConcat = "DecoderSupportInfo for mime type : ".concat(str);
                    String message = e.getMessage();
                    if (message == null) {
                        message = gm0.N(e);
                    }
                    Log.e(strConcat, message);
                    z = false;
                }
                if (z) {
                    MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
                    ArrayList arrayList = new ArrayList();
                    for (MediaCodecInfo mediaCodecInfo : codecInfos) {
                        if (!mediaCodecInfo.isEncoder()) {
                            for (String str2 : mediaCodecInfo.getSupportedTypes()) {
                                if (z5h.G0(str2, str, true)) {
                                    arrayList.add(mediaCodecInfo);
                                }
                                break;
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        z2 = true;
                    }
                }
                return Boolean.valueOf(z2);
            case 18:
                return jt5.b((jt5) obj);
            case 19:
                k96 k96Var = (k96) obj;
                return z5h.J0(k96.class.getName() + "-" + k96Var.getResources().getResourceName(k96Var.getId()), ".", "_");
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new fs6((gs6) obj);
            case 21:
                return ((f40) obj).c.getParentFile();
            case 22:
                md7 md7Var = (md7) obj;
                n31 n31Var = md7Var.c;
                String str3 = md7Var.b;
                ld7 ld7Var = (str3 == null || !md7Var.d) ? new ld7(md7Var.a, md7Var.b, new pgg(11), n31Var, md7Var.e) : new ld7(md7Var.a, new File(md7Var.a.getNoBackupFilesDir(), str3).getAbsolutePath(), new pgg(11), n31Var, md7Var.e);
                ld7Var.setWriteAheadLoggingEnabled(md7Var.g);
                return ld7Var;
            case 23:
                return new qd6(a2c.f(((tz7) obj).a, "host-reachability", 0, 2, true, false, 1, 2));
            case 24:
                gm0.n(rb8.u, "ManualGalleryContentObserver: on content changed");
                ((rb8) obj).d();
                return sbiVar;
            case 25:
                return new qd6((ExecutorService) ((qf8) obj).a.getValue());
            case 26:
                String str4 = (String) ((qj8) obj).c.invoke();
                if (str4 != null) {
                    return av7.c(str4);
                }
                return null;
            case 27:
                rre rreVar = ((jl8) obj).a;
                return Boolean.valueOf(!rreVar.j() || rreVar.m());
            case 28:
                ae9 ae9Var = (ae9) obj;
                pzf pzfVarB = e9i.b(1, 0, 6);
                ghb ghbVar2 = ew5.b;
                tre.m0(new j3(new fz6(tre.G0(pzfVarB, qe7.O(3, lw5.SECONDS)), new ur8(ae9Var, null, 4), 3), 14, new ud9(ae9Var, (lq4) null, 0)), ae9Var.b);
                return pzfVarB;
            default:
                l70 l70Var = (l70) ((jg9) obj).t.getValue();
                qfa qfaVar = (qfa) l70Var.a.getValue();
                List list = xfa.b;
                for (sfa sfaVar : qfaVar.m()) {
                    if (sfaVar.C()) {
                        Iterator it = ((List) sfaVar.n.a).iterator();
                        while (it.hasNext()) {
                            l70Var.c(sfaVar.a, ((e70) it.next()).t, q60.a);
                        }
                    }
                }
                return sbiVar;
        }
    }
}
