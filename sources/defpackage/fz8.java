package defpackage;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class fz8 implements o71 {
    public final LinkedHashMap a;

    public fz8(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(wm9.P0(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), new ez8(((Number) entry.getValue()).longValue()));
        }
        this.a = linkedHashMap;
    }

    public static ty9 e(String str) {
        Object next;
        Integer numB0;
        String queryParameter = Uri.parse(str).getQueryParameter("MediaItemType");
        int iIntValue = (queryParameter == null || (numB0 = y5h.B0(queryParameter)) == null) ? -1 : numB0.intValue();
        y1 y1Var = new y1(0, ty9.f);
        do {
            if (!y1Var.hasNext()) {
                next = null;
                break;
            }
            next = y1Var.next();
        } while (((ty9) next).ordinal() != iIntValue);
        ty9 ty9Var = (ty9) next;
        return ty9Var == null ? ty9.a : ty9Var;
    }

    @Override // defpackage.o71
    public final void a(j6g j6gVar, m6g m6gVar) {
        ez8 ez8Var = (ez8) this.a.get(e(m6gVar.a));
        if (ez8Var != null) {
            ez8Var.a(j6gVar, m6gVar);
        }
    }

    @Override // defpackage.o71
    public final void b(j6g j6gVar, m6g m6gVar) {
        ez8 ez8Var = (ez8) this.a.get(e(m6gVar.a));
        if (ez8Var != null) {
            ez8Var.b(j6gVar, m6gVar);
        }
    }

    @Override // defpackage.o71
    public final void c(j6g j6gVar, m6g m6gVar, m6g m6gVar2) {
        b(j6gVar, m6gVar);
        a(j6gVar, m6gVar2);
    }

    @Override // defpackage.o71
    public final void d(j6g j6gVar, String str, long j, long j2) {
        ez8 ez8Var = (ez8) this.a.get(e(str));
        if (ez8Var != null) {
            ez8Var.d(j6gVar, str, j, j2);
        }
    }
}
