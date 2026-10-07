package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class eoh {
    public static final /* synthetic */ zv8[] n;
    public final nm0 a;
    public final xhh b;
    public final gu4 c;
    public final String d = eoh.class.getName();
    public final mjg e;
    public final r8e f;
    public final mjg g;
    public final r8e h;
    public final r8e i;
    public final mjg j;
    public final r8e k;
    public final ArrayList l;
    public final p3c m;

    static {
        z8b z8bVar = new z8b(eoh.class, "loadBackgroundsJob", "getLoadBackgroundsJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        n = new zv8[]{z8bVar};
    }

    public eoh(Context context, nm0 nm0Var, xhh xhhVar, dq4 dq4Var) {
        this.a = nm0Var;
        this.b = xhhVar;
        this.c = dq4Var;
        mjg mjgVarA = p90.a(cqb.b);
        this.e = mjgVarA;
        this.f = new r8e(mjgVarA);
        mjg mjgVarA2 = p90.a(null);
        this.g = mjgVarA2;
        this.h = new r8e(mjgVarA2);
        this.i = e9i.G0(e9i.T(new doh(new r07(mjgVarA, mjgVarA2, new nff(3, (lq4) null, 5), 0), 0), ((n0c) xhhVar).a()), dq4Var, j0g.a, r66.a);
        mjg mjgVarA3 = p90.a(Boolean.FALSE);
        this.j = mjgVarA3;
        this.k = new r8e(mjgVarA3);
        List listO1 = ww3.o1(((mbc) pq3.j.e(context).d).b.values());
        ArrayList arrayList = new ArrayList();
        for (Object obj : listO1) {
            if (((nbc) obj) != nbc.SIMPLE) {
                arrayList.add(obj);
            }
        }
        this.l = arrayList;
        this.m = qyj.S();
    }

    public static final void a(eoh eohVar) {
        String str = (String) eohVar.g.getValue();
        if (str == null) {
            String str2 = eohVar.d;
            a4c a4cVar = gm0.f;
            if (a4cVar == null) {
                return;
            }
            je9 je9Var = je9.f;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str2, "selectedBackgroundName is null, returning early", null);
                return;
            }
            return;
        }
        aoh aohVarB = eohVar.b(str);
        if (aohVarB instanceof pph) {
            Drawable drawableA = eohVar.a.a(new hm0(((pph) aohVarB).a));
            qt4.C(drawableA != null, eohVar.j, null);
        } else {
            if (aohVarB instanceof jp7) {
                mjg mjgVar = eohVar.j;
                Boolean bool = Boolean.TRUE;
                mjgVar.getClass();
                mjgVar.j(null, bool);
                return;
            }
            if (aohVarB != null) {
                ore.o();
                return;
            }
            mjg mjgVar2 = eohVar.j;
            Boolean bool2 = Boolean.FALSE;
            mjgVar2.getClass();
            mjgVar2.j(null, bool2);
        }
    }

    public final aoh b(String str) {
        Object obj;
        u8b u8bVar = (u8b) this.e.getValue();
        Object[] objArr = u8bVar.a;
        int i = u8bVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            obj = objArr[i2];
            if (cqk.d(((aoh) obj).getName(), str)) {
                return (aoh) obj;
            }
        }
        obj = null;
        return (aoh) obj;
    }
}
