package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.text.Spannable;
import android.text.Spanned;
import android.text.style.URLSpan;
import android.util.Log;
import com.vk.push.core.remote.config.omicron.OmicronEnvironment;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;
import ru.ok.android.externcalls.sdk.api.ConversationParams;

/* JADX INFO: loaded from: classes3.dex */
public final class xr8 implements OmicronEnvironment, imc, sf7, iee, b8h, rg4, qx5 {
    public static xr8 a;

    public static Object b(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            boolean z = jSONObject.getBoolean("is_enabled");
            boolean z2 = jSONObject.getBoolean("is_force");
            JSONArray jSONArray = jSONObject.getJSONArray("package_names");
            c79 c79VarW = yab.w();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                c79VarW.add(jSONArray.getString(i));
            }
            return new p2k(yab.j(c79VarW), z, z2);
        } catch (Throwable th) {
            return new poe(th);
        }
    }

    public static vjk d(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject(str2);
        String string = jSONObject.getString(SdkMetricStatEvent.NAME_KEY);
        JSONObject jSONObject2 = jSONObject.getJSONObject("data");
        ArrayList arrayList = new ArrayList();
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            x05.m(next, jSONObject2.get(next).toString(), arrayList);
        }
        return new vjk(str, string, wm9.W0(arrayList));
    }

    public static final void f(ArrayList arrayList, z5e z5eVar) {
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (cqk.d(((jja) it.next()).a, z5eVar)) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            arrayList.add(new jja(z5eVar, 1));
            return;
        }
        jja jjaVar = (jja) arrayList.get(i);
        arrayList.set(i, new jja(jjaVar.a, jjaVar.b + 1));
    }

    public static final ju5 g(lu5 lu5Var, Rect rect) {
        Rect rect2 = lu5Var.c;
        jy8 jy8Var = lu5Var.b;
        AbstractMap.SimpleEntry simpleEntryA = jy8.a(jy8Var, rect2.isEmpty() ? rect : lu5Var.c, rect);
        x26 x26Var = simpleEntryA != null ? (x26) simpleEntryA.getValue() : null;
        ju5 ju5Var = x26Var instanceof ju5 ? (ju5) x26Var : null;
        if (ju5Var != null) {
            return ju5Var;
        }
        c.p(jy8Var.b != 1 ? "null" : "DRAWING", " did not parse into a DrawingEditorLayer", "LayerState of type ");
        return null;
    }

    public static final void h(ArrayList arrayList, z5e z5eVar) {
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (cqk.d(((jja) it.next()).a, z5eVar)) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        jja jjaVar = (jja) arrayList.get(i);
        int i2 = jjaVar.b;
        if (i2 == 1) {
            arrayList.remove(i);
        } else {
            arrayList.set(i, new jja(jjaVar.a, i2 - 1));
        }
    }

    public static i5g i(p8b p8bVar) {
        h5g h5gVar = new h5g();
        h5gVar.a = p8bVar.f;
        h5gVar.c = p8bVar.b;
        h5gVar.d = p8bVar.c;
        h5gVar.b = p8bVar.e;
        h5gVar.e = p8bVar.g;
        h5gVar.f = p8bVar.d;
        return new i5g(h5gVar);
    }

    public static fea j(kbc kbcVar) {
        return new fea(((xac) kbcVar.f().a).a.n.a, ((xac) kbcVar.f().b).a.n.a);
    }

    public static Spannable k(CharSequence charSequence, int i, boolean z, nv4 nv4Var) {
        if (!(charSequence instanceof Spannable) || charSequence.length() == 0) {
            return null;
        }
        Spanned spanned = (Spanned) charSequence;
        Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
        if (spans.length == 0) {
            return (Spannable) charSequence;
        }
        for (Object obj : spans) {
            if (obj instanceof rud) {
                rud rudVar = (rud) obj;
                rudVar.b = i;
                rudVar.c = z;
            } else if (obj instanceof k59) {
                ((k59) obj).a = i;
            } else if ((obj instanceof URLSpan) && !(obj instanceof n59)) {
                Spannable spannable = (Spannable) charSequence;
                int spanStart = spannable.getSpanStart(obj);
                int spanEnd = spannable.getSpanEnd(obj);
                try {
                    ((Spannable) charSequence).removeSpan(obj);
                    ((Spannable) charSequence).setSpan(new n59(((URLSpan) obj).getURL(), i, z), spanStart, spanEnd, 33);
                } catch (Throwable unused) {
                }
            }
            if (nv4Var != null) {
                nv4Var.invoke(obj);
            }
        }
        return (Spannable) charSequence;
    }

    @Override // defpackage.b8h
    public boolean a(b87 b87Var) {
        return false;
    }

    @Override // defpackage.rg4, defpackage.tg4
    public void accept(Object obj) {
        ((Throwable) obj).getClass();
    }

    @Override // defpackage.sf7, defpackage.sxe, defpackage.rf7, defpackage.mf7
    /* JADX INFO: renamed from: apply */
    public Object mo41apply(Object obj) {
        xgc xgcVar = (xgc) obj;
        return new ffd(xgcVar.b() ? (ConversationParams) xgcVar.a() : null, c76.a);
    }

    @Override // defpackage.imc
    public Object c() {
        throw new RuntimeException("No update");
    }

    @Override // defpackage.qx5
    public td0 e(Context context, String str, px5 px5Var) {
        td0 td0Var = new td0();
        int iF = px5Var.f(context, str);
        td0Var.b = iF;
        if (iF != 0) {
            td0Var.d = -1;
            return td0Var;
        }
        int iA = px5Var.a(context, str, true);
        td0Var.c = iA;
        if (iA != 0) {
            td0Var.d = 1;
        }
        return td0Var;
    }

    @Override // defpackage.b8h
    public d8h m(b87 b87Var) {
        throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
    }

    @Override // defpackage.b8h
    public int n(b87 b87Var) {
        return 1;
    }

    @Override // com.vk.push.core.remote.config.omicron.OmicronEnvironment
    public String name() {
        return "BETA";
    }

    @Override // defpackage.imc
    public boolean q() {
        return false;
    }

    @Override // defpackage.imc
    public Object s() {
        return null;
    }

    @Override // defpackage.iee
    public boolean u(UnsatisfiedLinkError unsatisfiedLinkError, rcg[] rcgVarArr) {
        qcg qcgVar;
        String message;
        if (!(unsatisfiedLinkError instanceof qcg) || (unsatisfiedLinkError instanceof pcg) || (message = (qcgVar = (qcg) unsatisfiedLinkError).getMessage()) == null || (!message.contains("/app/") && !message.contains("/mnt/"))) {
            return false;
        }
        String str = qcgVar.a;
        StringBuilder sb = new StringBuilder("Reunpacking BackupSoSources due to ");
        sb.append(unsatisfiedLinkError);
        sb.append(str == null ? "" : ", retrying for specific library ".concat(str));
        Log.e("SoLoader", sb.toString());
        for (rcg rcgVar : rcgVarArr) {
            if (rcgVar instanceof wn0) {
                wn0 wn0Var = (wn0) rcgVar;
                try {
                    Log.e("SoLoader", "Runpacking BackupSoSource BackupSoSource");
                    wn0Var.d(2);
                } catch (Exception e) {
                    Log.e("SoLoader", "Encountered an exception while reunpacking BackupSoSource BackupSoSource for library " + str + ": ", e);
                    return false;
                }
            }
        }
        return true;
    }
}
